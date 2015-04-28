package HUD;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class panel_Ajout_Bas extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3149726012272520091L;
	private Frame 			frame;
	private JButton 		ajou 		= new JButton("Ajouter");
	private JButton 		supp 		= new JButton("Supprimer");
	private JButton 		actu 		= new JButton("Actualiser");
	private JButton 		comf 		= new JButton("Comfirmer le set");
	
	public panel_Ajout_Bas(Frame frame)
	{
		this.frame = frame;
		this.setLayout(new GridLayout(1, 4));
		this.add(ajou);
		this.add(supp);
		this.add(actu);
		this.add(comf);
	}

	public Frame getFrame() {
		return frame;
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
