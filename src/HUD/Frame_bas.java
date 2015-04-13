package HUD;

import javax.swing.JFrame;

public class Frame_bas extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Panel_bas panelb = new Panel_bas(this);
	private Frame_haut fh;
		
	public Frame_bas(Frame_haut fh)
	{
		try {
			this.fh = fh;
			this.setTitle("Commande");
			this.setSize(400, 100);
			this.add(panelb);
			this.setVisible(true);
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
		}
	}

	public Frame_haut getFh() {
		return fh;
	}

	public Panel_bas getPanelb() {
		return panelb;
	}
}
