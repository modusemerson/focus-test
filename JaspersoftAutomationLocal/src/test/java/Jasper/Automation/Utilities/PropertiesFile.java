package Jasper.Automation.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesFile {
	
	static String jasperUrl,chromedriverlocation;
	public static String username;
	public static String password;
	public static String startdate;
	public static String enddate;
	public static String participantid;
	public static String settlementwindowid,rows;
	
	public static String env,os,browserx;
	
	/*public static void main(String[] args) {
		Readproperties();
	}*/

	public static void Readproperties(){
		Properties prop = new Properties();
		//browserx=System.getProperty("browser");
		//os=System.getProperty("os");
		env="dev";
		os="windows";
		browserx="chrome";
		
		try {
		 if(os.equals("windows")) {
			 InputStream input = new FileInputStream(".\\src\\test\\java\\Jasper\\Automation\\Utilities\\config.properties");
			    prop.load(input);
			    if(browserx.equals("chrome")) {
			    	chromedriverlocation=prop.getProperty("chromedriverlocation");
			    }else  if(browserx.equals("firefox")) {
			    	chromedriverlocation=prop.getProperty("ffdriverlocation");
			    }
			    
			 
		 } else if(os.equals("mac")) {
			 InputStream input = new FileInputStream("./src/test/java/Jasper/Automation/Utilities/config.properties");
			    prop.load(input);
			    
			    if(browserx.equals("chrome")) {
			    	chromedriverlocation=prop.getProperty("chromedriverlocationmac");
			    }else  if(browserx.equals("firefox")) {
			    	chromedriverlocation=prop.getProperty("ffdriverlocationmac");
			    }
			    
			// chromedriverlocation=prop.getProperty("chromedriverlocationmac");
		 }else {
			 InputStream input = new FileInputStream("./src/test/java/Jasper/Automation/Utilities/config.properties");
			    prop.load(input);
			    if(browserx.equals("chrome")) {
			    	chromedriverlocation=prop.getProperty("chromedriverlocationlinux");
			    }else  if(browserx.equals("firefox")) {
			    	chromedriverlocation=prop.getProperty("ffdriverlocationlinux");
			    }
			// chromedriverlocation=prop.getProperty("chromedriverlocationlinux");
		 }
		}
        catch (Exception e) {
			
			e.printStackTrace();
		}
		 
		 
		try {
			
		    
		    
		    
		    if(env.equals("dev")) {
		    //DEV
		    	jasperUrl= prop.getProperty("JasperUrldev");
		    	username=prop.getProperty("usernameadmindev");
		    	password=prop.getProperty("passwordadmindev");
		    	startdate=prop.getProperty("usernameuserdev");
		    	enddate=prop.getProperty("passworduserdev");
		    	participantid=prop.getProperty("participantiddev");
		    	settlementwindowid=prop.getProperty("windowiddev");
		    	rows=prop.getProperty("rowsdev");
		   
		    }
		    else if(env.equals("uat")) {
		   
		    }
		    else if(env.equals("stg")) {
		    
		    }
		    else {
		    	System.out.println("Not valid Environment");
		    }
		    
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
	}
}

