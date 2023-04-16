package sevenrmartSupermarket.Testscripts;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import sevenrmartSupermarket.Pages.HomePage;
import sevenrmartSupermarket.Pages.LoginPage;
import sevenrmartSupermarket.Pages.SelectCategoryPage;

public class HomeTest extends Base{
	HomePage homepage;
	LoginPage loginpage;
	SelectCategoryPage selectcategorypage;
	@Test
	public void checkSiteNameIsDisplayedOnTop() throws IOException {
		homepage=new HomePage(driver);
		homepage.verifySiteNameIsShownAtTop();
	}
	@Test
	@Parameters({"username","password","input"})
	public void verifyManageLocationOpensToCorrespondingUrl(String username,String password,String input) throws IOException {
		/*
		 * loginpage=new LoginPage(driver);
		 * loginpage.signInAccountVerification(username, password);
		 * selectcategorypage=new SelectCategoryPage(driver);
		 * selectcategorypage.selectElementFromMenu(input);
		 */
		homepage=new HomePage(driver);
		homepage.ManageLocationSelect();
	}
	
	
}
