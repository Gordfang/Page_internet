package HUD;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Frame extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Panel_haut panelh = new Panel_haut(this);
	private Panel_bas panelb = new Panel_bas(this);
	private panel_Ajout_Haut panelah = new panel_Ajout_Haut(this);
	private panel_Ajout_Bas panelab = new panel_Ajout_Bas(this);

	public Frame()
	{
		this.setTitle("Page Internet");
		if(panelh.getLbutton().size() <= 3)
			this.setSize(500, 125);
		else
			this.setSize(500, ((panelh.getLbutton().size()-1)/3)*125);
		getContentPane().add(panelh, BorderLayout.CENTER);
		getContentPane().add(panelb, BorderLayout.SOUTH);
	}

	public Panel_bas getPanelb() {
		return panelb;
	}
	
	public Panel_haut getPanelh() {
		return panelh;
	}

	public panel_Ajout_Bas getPanelab() {
		return panelab;
	}
	
	public panel_Ajout_Haut getPanelah() {
		return panelah;
	}
}
