package browserProfiles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

public class ProfileDemo {

	public static void main(String[] args) {
	   WebDriver webdriver;
	   String baseurl;
	    
	   
	   ProfilesIni pro=new ProfilesIni();
	   FirefoxProfile ff=pro.getProfile(("automationprofile"));
	  
	    FirefoxOptions opt=new FirefoxOptions();
	    opt.setProfile(ff);
	    
	    
		webdriver=new FirefoxDriver(opt);
		webdriver.manage().window().maximize();
		webdriver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		baseurl="http://www.letskodeit.com";
		webdriver.get(baseurl);
		
	}
}
