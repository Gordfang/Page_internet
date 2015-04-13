package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;

import HUD.Panel_haut;
import Systeme.BrowerControl;

public class internetListener implements ActionListener{
	
	private Panel_haut panel;
	private SAXBuilder sxb = new SAXBuilder();
	private org.jdom2.Element racine;
	
	public internetListener(Panel_haut panel) {
		this.panel = panel;
	}
	
	public void Action (char a)
	{

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		for (JButton jb : panel.getLbutton()) {
			if (e.getSource() == jb)
			{
				try {
					// lire le xml
					org.jdom2.Document doc = sxb.build("C:\\Users\\Baptiste\\Desktop\\test lock\\Private\\fichier.txt");
					racine = doc.getRootElement();
					java.util.List<Element> set = racine.getChildren("set");
					// pour chaque élément set
					for (Element element : set) {
						// si le set correspond bien a celui voulu
						if(element.getChildText("nom").equalsIgnoreCase(jb.getText()))
						{
							// pour chaque pages dans ce set
							java.util.List<Element> pages = element.getChildren("page");
							for (Element element2 : pages) {
								// ouvre l'url de cet élément
								BrowerControl.openURL(element2.getChildText("url"));
								Thread.sleep(200);
							}
						}
					}
					
				} catch (Exception e2) {
					JOptionPane.showConfirmDialog(null, e2.getMessage());
				}
			}
		}
	}	
}
