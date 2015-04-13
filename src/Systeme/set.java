package Systeme;

import java.util.ArrayList;

public class set {
	
	private String name;
	private ArrayList<String> lpage = new ArrayList<String>();
	
	public set(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<String> getLpage() {
		return lpage;
	}

	public void setLpage(ArrayList<String> lpage) {
		this.lpage = lpage;
	}
}
