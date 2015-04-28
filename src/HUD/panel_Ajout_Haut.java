package HUD;

import java.awt.Label;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class panel_Ajout_Haut extends JPanel{

	/**
	 * 
	 */
	private static final long 	serialVersionUID 	= -3149726012272520091L;
	private Frame 				fh;
	private JTextField 			nom 				= new JTextField(30);
	private JTextField			url					= new JTextField(40);
	private ArrayList<String> 	lsite 				= new ArrayList<String>();
	private String[] 			titre 				= {"URL"};
	private String[][] 			content;
	private JTable 				table;
	
	public panel_Ajout_Haut(Frame fh)
	{
		content 	= toStr();
		table 		= new JTable(content, titre);
		this.fh 	= fh;
		this.add(new Label("Nom du set :"));
		this.add(nom);
		this.add(new Label("Nouvelle URL :"));
		this.add(url);
		this.add(new JScrollPane(table));
	}

	public Frame getFh() {
		return fh;
	}
	
	public ArrayList<String> getLSite()
	{
		return lsite;
	}
	
	String[][] toStr()
	{
		String[][] tabString = new String[lsite.size()][1];
		int x = 0;
		
		for (String url : lsite) {
			System.out.println(url);
			tabString[x][0] = url;
			x++;
		}
		return tabString;
	}
}
