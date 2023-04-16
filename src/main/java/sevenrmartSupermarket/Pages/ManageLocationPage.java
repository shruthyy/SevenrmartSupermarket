package sevenrmartSupermarket.Pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.ExcelUtility;
import Utilities.PageUtility;
import Utilities.WaitUtility;

public class ManageLocationPage {
	public WebDriver driver;
	public ManageLocationPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@onclick='click_button(2)']") WebElement searchButton;
	@FindBy(xpath="//input[@placeholder='Name']") WebElement nameEnterBox;
	@FindBy(xpath="//button[@name='Search']") WebElement searchBoxRed;
	
	public void searchNameToGetLocation() throws IOException {
		String expectedNameToSearch=ExcelUtility.getString(0,0,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"SearchLocationWithName");
		driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/list-location");
		WaitUtility.waitForClickableByWebElement(driver, searchButton);
		PageUtility.clickOnElement(searchButton);
		PageUtility.clickOnElement(nameEnterBox);
		PageUtility.enterText(nameEnterBox,expectedNameToSearch );
		PageUtility.clickOnElement(searchBoxRed);
		 List<WebElement>tablefull=driver.findElements(By.xpath("//div[@class=\"card-body table-responsive p-0\"]//td"));
		  for(WebElement value:tablefull) {
		 String actualNameToSearch=value.getText();
		  System.out.println(actualNameToSearch);
		  }

	}

}
