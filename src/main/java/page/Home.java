package page;

import base.Baseclass;

public class Home extends Baseclass{

	
	
	public String searchTextBox =null;
	public String googleSearchButton = null;
	public String radioBtton=null;
	public String continent=null;
	public String waittime=null;
	Baseclass bs;

	
	public Home() {
		initializationa();
	}
	public void initializationa() {
		bs = new  Baseclass();
		
		searchTextBox=bs.readpropertyfile("searchTextBox", "homepage.properties");
		googleSearchButton=bs.readpropertyfile("googleSearchButton", "homepage.properties");
		radioBtton=bs.readpropertyfile("radioBtton", "homepage.properties");
		continent=bs.readpropertyfile("continent", "homepage.properties");
		waittime=bs.readpropertyfile("waittime", "homepage.properties");
	}
	

}
