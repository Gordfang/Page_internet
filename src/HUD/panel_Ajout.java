package HUD;

import java.awt.GridLayout;
import java.awt.Label;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

public class panel_Ajout extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3149726012272520091L;
	private Frame_haut fh;
	private JTextField nom = new JTextField();
	private ArrayList<String> lsite = new ArrayList<String>();
	//private JTable table = new ;
	private JButton ajou = new JButton("Ajouter");
	private JButton supp = new JButton("Supprimer");
	private JButton actu = new JButton("Actualiser");
	private JButton comf = new JButton("Comfirmer le set");
	
	public panel_Ajout(Frame_haut fh)
	{
		this.fh = fh;
		this.setLayout(new GridLayout(8, 1));
		this.setSize(200, 600);
		this.add(new Label("Nom du set :"));
		this.add(nom);
		this.add(new Label("Liste des pages :"));
		//this.add(table);
		this.add(ajou);
		this.add(supp);
		this.add(actu);
		this.add(comf);
	}

	public Frame_haut getFh() {
		return fh;
	}

	public JButton getAjou() {
		return ajou;
	}

	public JButton getSupp() {
		return supp;
	}

	public JButton getActu() {
		return actu;
	}

	public JButton getComf() {
		return comf;
	}
}
