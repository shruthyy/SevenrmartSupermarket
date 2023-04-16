package sevenrmartSupermarket.Testscripts;

import java.io.IOException;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import sevenrmartSupermarket.Pages.LoginPage;

public class LoginTest extends Base{
	LoginPage loginpage;
	@Test
	@Parameters({"username","password"})
	public void verifyLogin( String username,String password) {
		loginpage=new  LoginPage(driver);
		loginpage.signInAccountVerification(username, password);	
	}
	@Test
	public void loginWithInvalidUserName() throws IOException {
		loginpage=new  LoginPage(driver);
		loginpage.signInWithWrongUserName();
	}
	@Test
	public void loginWithInvalidPassword() throws IOException {
		loginpage=new LoginPage(driver);
		loginpage.signInWithWrongPassword();
	}
	@Test
	public void verifyLogout() throws IOException {
		loginpage=new LoginPage(driver);
		loginpage.logoutVerification();
	}
}
