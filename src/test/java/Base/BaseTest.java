package Base;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;

public class BaseTest {

	public WebDriver driver = null;
	
	public void openBrowser(String browser) {
		
		DesiredCapabilities cap =null;
		
		if(browser.equalsIgnoreCase("firefox")) {
					
					cap = DesiredCapabilities.firefox();
					cap.setPlatform(Platform.WINDOWS);
					
				}else if(browser.equalsIgnoreCase("chrome")) {
					
					cap = DesiredCapabilities.chrome();
					cap.setPlatform(Platform.WINDOWS);
					
				}else if(browser.equalsIgnoreCase("ie")) {
					
					cap = DesiredCapabilities.internetExplorer();
					cap.setPlatform(Platform.WINDOWS);
						
				}
		
		try {
			driver = new RemoteWebDriver(new URL("http://10.0.0.13:4444/wd/hub"), cap);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@AfterMethod
	public void closeBrowser() {
		
		if(driver!=null)
			driver.quit();
		
	}
	
}
