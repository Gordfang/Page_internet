package HUD;

import java.awt.GridLayout;
import java.awt.Panel;

import javax.swing.JButton;

import Listener.commandeListener;

public class Panel_bas extends Panel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3198800727165534456L;
	
	private JButton quit = new JButton("Quitter");
	private JButton add = new JButton("Ajouter");
	private JButton sup = new JButton("Supprimer");
	private JButton mod = new JButton("Modifier");
	private Frame frame;
	private commandeListener i = new commandeListener(this);
	
	public JButton getQuit() {
		return quit;
	}

	public JButton getAdd() {
		return add;
	}

	public JButton getSup() {
		return sup;
	}

	public JButton getMod() {
		return mod;
	}

	public Frame getFb() {
		return frame;
	}

	public Panel_bas(Frame frame) {
		// TODO Auto-generated constructor stub
		this.frame = frame;
		this.setLayout(new GridLayout(1, 4));
		this.setSize(400, 100);
		quit.addActionListener(i);
		this.add(quit);
		add.addActionListener(i);
		this.add(add);
		sup.addActionListener(i);
		this.add(sup);
		mod.addActionListener(i);
		this.add(mod);
	}
}
