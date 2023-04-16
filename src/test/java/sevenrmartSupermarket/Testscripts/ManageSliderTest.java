package sevenrmartSupermarket.Testscripts;

import java.io.IOException;

import org.testng.annotations.Test;

import sevenrmartSupermarket.Pages.ManageSliderPage;

public class ManageSliderTest extends Base {
	ManageSliderPage  managesliderpage;

	@Test
	public void verifyListSliderPageOpens() throws IOException {
		managesliderpage=new ManageSliderPage(driver);
		managesliderpage.manageSliderOption();
	}
	@Test
	public void addLinkToManageSlider() throws IOException {
		managesliderpage=new ManageSliderPage(driver);
		managesliderpage.manageSliderOption();
	}
}
