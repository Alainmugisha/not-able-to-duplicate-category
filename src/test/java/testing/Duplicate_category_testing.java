package testing;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import browserconfig.Browserfactory;
import pages.Duplicate_category;


public class Duplicate_category_testing  {

	WebDriver driver;
	Duplicate_category category ;
	
	@Test
	@Parameters({"category_value"})
	
	public void add_category_testing (String duplicatecategory) throws Throwable {
		
	driver = Browserfactory.openBrowser();	
		
	 category = PageFactory.initElements(driver, Duplicate_category.class);
	
	 category.dup_category_field(duplicatecategory);
	 category.dup_category_button();
	 category.takescreenshhot();
	
		
	driver = Browserfactory.closeBrowser();
	}
	

}
