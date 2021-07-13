package browserconfig;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Browserfactory {
	static WebDriver driver;

	public static WebDriver openBrowser() throws Throwable {

		System.setProperty("webdriver.chrome.driver",
	"C:\\Users\\Alain Mickey\\Desktop\\All Java project____eclipse\\maven projects\\DATA_DRIVEN (for submission)\\Validate a user is not able to duplicate a category\\Chrome driver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://techfios.com/test/101/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		return driver;
	}

	//@AfterMethod
	public static WebDriver closeBrowser() throws Throwable {
		Thread.sleep(5000);
		driver.close();
		driver.quit();

		return driver;

	}
}
