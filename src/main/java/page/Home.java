package page;

import base.Baseclass;

public class Home extends Baseclass{

	
	
	public String searchTextBox =null;
	public String googleSearchButton = null;
	
	Baseclass bs;

	
	public Home() {
		initializationa();
	}
	public void initializationa() {
		bs = new  Baseclass();
		
		searchTextBox=bs.readpropertyfile("searchTextBox", "homepage.properties");
		googleSearchButton=bs.readpropertyfile("googleSearchButton", "homepage.properties");
	}
	

}
