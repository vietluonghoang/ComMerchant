package drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RunningDriver {
	
	
	private String pathToChromeDriver() {
		String pathToChromeDriverExecutableFile = "./drivers/chromedriver";

		if (System.getProperty("os.name").toLowerCase().indexOf("win") >= 0) {
			pathToChromeDriverExecutableFile = "./drivers/chromedriver.exe";
		}
		
		return pathToChromeDriverExecutableFile;
	}

	public WebDriver firefoxDriver(){
//        DesiredCapabilities capabilites = new DesiredCapabilities();
        WebDriver driver = new FirefoxDriver();
        return driver;
    }
	public WebDriver chromeDriver(){
		System.setProperty("webdriver.chrome.driver", pathToChromeDriver());
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-browser-side-navigation");
		options.addArguments("--disable-gpu");
	    WebDriver driver = new ChromeDriver(options);
	    return driver;
  }
}
