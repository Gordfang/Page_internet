package Systeme;

import javax.swing.JOptionPane;

public class BrowerControl {

    // The default system browser under windows.
    private static final String WIN_PATH = "rundll32";
    // The flag to display a url.
    private static final String WIN_FLAG = "url.dll,FileProtocolHandler";
    
    public static void openURL(String url)
    {
    	String cmd;
    	   
    	try {
			cmd = WIN_PATH + " " + WIN_FLAG + " " + url;
			Runtime.getRuntime().exec(cmd);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
		}
    }
}
