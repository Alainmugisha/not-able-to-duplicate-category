package pages;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;



public class Duplicate_category extends Base_page {
	WebDriver driver;
	
	public Duplicate_category(WebDriver driver) {
		this.driver = driver;
		
	}
	
	@FindBy(how =How.XPATH, using ="//input[@name='categorydata']")WebElement DUP_CATEGORY_FIELD;
	@FindBy(how =How.XPATH, using ="//input[@value='Add category']") WebElement DUP_CATEGORY_BUTTON;
	
	
	
	public void dup_category_field(String duplicatecategory)  throws Throwable  {
		
		//String duplicated_category = (duplicatecategory + randomvaluegenerated() );
		
		DUP_CATEGORY_FIELD.sendKeys(duplicatecategory);
		Thread.sleep(2000);
	}
	
	
	public void dup_category_button() {
		DUP_CATEGORY_BUTTON.click();
	}
	
	
	public void takescreenshhot() throws Throwable {
		Thread.sleep(3000);

		TakesScreenshot ts = ((TakesScreenshot) driver);
		SimpleDateFormat formatter = new SimpleDateFormat("MMddyy_HHmmss");
		Date date = new Date();
		String label = formatter.format(date);
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);

		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(sourceFile, new File(currentDir + "/screenshots/" + label + ".png"));
	}
}
