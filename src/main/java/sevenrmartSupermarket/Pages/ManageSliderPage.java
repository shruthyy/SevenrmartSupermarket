package sevenrmartSupermarket.Pages;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Utilities.ExcelUtility;
import Utilities.PageUtility;
import Utilities.WaitUtility;

public class ManageSliderPage {
	public WebDriver driver;
	public ManageSliderPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//ul[@class='nav nav-pills nav-sidebar flex-column']/li[10]/a") WebElement manageSliderMenu;
	@FindBy(xpath="//h1[text()='List Sliders']") WebElement listSliders;
	@FindBy(xpath="//a[@onClick='click_button(1)']") WebElement addButton;
	@FindBy(xpath="//input[@id='link']") WebElement link;
	@FindBy(xpath="//button[@class='btn btn-danger']") WebElement saveButton;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement alert;
	
	public void manageSliderOption() throws IOException{
		boolean isManageSliderVisible=PageUtility.isElementDisplayed(manageSliderMenu);
		assertTrue(isManageSliderVisible, "Manager slider option not visible");
		PageUtility.clickOnElement(manageSliderMenu);
		boolean isListSliderPageVisible=PageUtility.isElementDisplayed(listSliders);
		assertTrue(isListSliderPageVisible,"List Slider page not displayed");

	}
	public void enterLinkAndSave() throws IOException {
		String newlink=ExcelUtility.getString(0,0, System.getProperty("user.dir") +constants.Constants.TESTDATAFILE, "ManageSlider");
		PageUtility.clickOnElement(manageSliderMenu);
		WaitUtility.waitForClickableByWebElement(driver, addButton);
		PageUtility.clickOnElement(addButton);
		boolean isLinkFieldDisplayed=PageUtility.isElementDisplayed(link);
	    assertTrue(isLinkFieldDisplayed,"Link field is not displayed");
		PageUtility.clickOnElement(link);
		PageUtility.sendKey(link,newlink);
		boolean isSaveButtonEnabled=PageUtility.isElementEnabled(saveButton);
		Assert.assertTrue(isSaveButtonEnabled, "Save button is not enabled");
		PageUtility.clickOnElement(saveButton);
		boolean actualMessg=PageUtility.isElementDisplayed(alert);
		assertTrue(actualMessg, "Slider created message is not displayed");
	
	}

}
