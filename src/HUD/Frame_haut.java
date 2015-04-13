package HUD;

import javax.swing.JFrame;

public class Frame_haut extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Panel_haut panelh = new Panel_haut(this);
	private Frame_bas fb = new Frame_bas(this);
	private panel_Ajout panela = new panel_Ajout(this);

	public Frame_haut()
	{
		try {
			this.setTitle("Page Internet");
			this.setSize(500, 500);
			this.add(panelh);
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
		}
	}

	public Frame_bas getFb() {
		return fb;
	}
	
	public Panel_haut getPanelh() {
		return panelh;
	}

	public panel_Ajout getPanela() {
		return panela;
	}
}
