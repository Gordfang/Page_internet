package HUD;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;

import Listener.internetListener;
import Systeme.set;

public class Panel_haut extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private internetListener i = new internetListener(this);
	private ArrayList<set> lset = new ArrayList<set>();
	private ArrayList<JButton> lbutton = new ArrayList<JButton>();
	private SAXBuilder sxb = new SAXBuilder();
	private org.jdom2.Element racine;
	private Frame_haut fh;

	public Panel_haut (Frame_haut fh)
	{
		this.fh = fh;
		try {
			readXML();
			this.setSize(500, (lbutton.size()/3)*100);
			this.setLayout(new GridLayout(ligne(lbutton.size()), 3));
			for (JButton jButton : lbutton) {
				this.add(jButton);
				jButton.addActionListener(i);
			}
		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showConfirmDialog(null, e.getMessage());
		}
	}
	
	private int ligne(int i)
	{
		if(i%3 != 0)
		{
			return i = i/3+1;
		}
		else
		{
			return i = i/3;
		}
	}
	
	private void readXML()
	{
		try {
			org.jdom2.Document doc = sxb.build("C:\\Users\\Baptiste\\Desktop\\test lock\\Private\\fichier.txt");
			racine = doc.getRootElement();
			java.util.List<Element> set = racine.getChildren("set");
			
			for (Element element : set) {
				set S = new set(element.getChildText("nom"));
				List<Element> pages = element.getChildren("page");
				for (Element page : pages) {
					S.getLpage().add(page.getChildText("url"));
				}
				lset.add(S);
				lbutton.add(new JButton(element.getChildText("nom")));
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
	
	public ArrayList<set> getLSet() {
		return lset;
	}

	public Frame_haut getFh() {
		return fh;
	}

	public ArrayList<JButton> getLbutton() {
		return lbutton;
	}
}
