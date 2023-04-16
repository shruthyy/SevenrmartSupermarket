package sevenrmartSupermarket.Pages;



	import java.io.IOException;
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.testng.Assert;

	import Utilities.ExcelUtility;
	import Utilities.PageUtility;
	import Utilities.WaitUtility;

	public class HomePage {
		public WebDriver driver;
		public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
		@FindBy (xpath="//input[@placeholder='Username']") WebElement userNameTextBoxElement;
		@FindBy(xpath="//input[@placeholder='Password']") WebElement passwordTextBoxElement;
		@FindBy(xpath="//button[text()='Sign In']")WebElement signInButton;
		@FindBy(xpath="//span[text()='7rmart supermarket']") WebElement siteName;
		@FindBy(xpath="//li[@class='nav-item']") WebElement menuList;
		@FindBy(css="a.small-box-footer[href='https://groceryapp.uniqassosiates.com/admin/list-location']") WebElement ManageLocation;

		public void verifySiteNameIsShownAtTop() throws IOException {
			String UserNameRight=ExcelUtility.getString(0,0,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"LogInDetails");
			String passwordRight=ExcelUtility.getString(0,1,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"LogInDetails");
			PageUtility.enterText(userNameTextBoxElement, UserNameRight);
			PageUtility.enterText(passwordTextBoxElement, passwordRight);
			boolean isSignInButtonEnabled=PageUtility.isElementEnabled(signInButton);
			Assert.assertTrue(isSignInButtonEnabled, "SignIn button is not enabled");
			PageUtility.clickOnElement(signInButton);
			WaitUtility.waitForElement(driver, siteName);
			boolean isSiteNameDisplayed=PageUtility.isDisplay(siteName);
			Assert.assertTrue(isSiteNameDisplayed, "site name is not displayed on top");
		}
		public void ManageLocationSelect() throws IOException {
			String expectedUrl=ExcelUtility.getString(0,0,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"ManageLocation");
			PageUtility.clickOnElement(ManageLocation);
			String actualUrl=driver.getCurrentUrl();
			Assert.assertEquals( actualUrl,expectedUrl,"Manage Location page is not open" );
		}
	
}
