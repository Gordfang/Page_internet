package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;

import HUD.Panel_bas;
import Systeme.set;

public class commandeListener implements ActionListener{

	private Panel_bas panel;
	
	public commandeListener(Panel_bas panel) {
		this.panel = panel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if( e.getSource() == panel.getQuit())
		{
			Action('q');
		}
		if (e.getSource() == panel.getAdd())
		{
			Action('a');
		}
	}

	private void Action(char c) {
		// TODO Auto-generated method stub
		switch (c) {
		case 'q':
			try {
				PrintWriter doc = new PrintWriter("C:\\Users\\Baptiste\\Desktop\\test lock\\Private\\fichier.txt");
				doc.write("<page_internet>\r\n");
				for (set set : panel.getFb().getFh().getPanelh().getLSet()) {
					doc.write("\t<set>\r\n");
						doc.write("\t\t<nom>"+set.getName()+"</nom>\r\n");
						for ( String page : set.getLpage()) {
							doc.write("\t\t<page>\r\n");
							doc.write("\t\t\t<url>"+page+"</url>\r\n");
							doc.write("\t\t</page>\r\n");
						}	
					doc.write("\t</set>\r\n");
				}
				doc.write("</page_internet>");
				doc.close();
			} catch (Exception e) {
				// TODO: handle exception
				System.err.println(e.getMessage());
			}
			System.exit(0);
			break;
		case 'a':
			System.out.println("tick");
			panel.getFb().getFh().remove(panel.getFb().getFh().getPanelh());
			panel.getFb().getFh().add(panel.getFb().getFh().getPanela());
			panel.getFb().getFh().revalidate();
			break;
		default:
			break;
		}
	}

	
}
