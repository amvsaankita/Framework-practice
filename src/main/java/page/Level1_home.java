package page;

import base.Baseclass;

public class Level1_home extends Baseclass {

	public String msgtextbox= null;
	public String sendmsgbutton=null;
	public String waittime=null;
	public String gettext= null;
	
	Baseclass bs;
	
	public Level1_home(){
		initializationa();
	}
	public void initializationa() {
		bs = new  Baseclass();
		
		msgtextbox=bs.readpropertyfile("msgtextbox", "codelevel.properties");
		sendmsgbutton=bs.readpropertyfile("sendmsgbutton", "codelevel.properties");
		waittime=bs.readpropertyfile("waittime", "codelevel.properties");
		gettext=bs.readpropertyfile("gettext", "codelevel.properties");
		
	}
	
}
