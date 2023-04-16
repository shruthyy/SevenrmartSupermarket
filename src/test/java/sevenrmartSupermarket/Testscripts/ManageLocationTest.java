package sevenrmartSupermarket.Testscripts;

import java.io.IOException;

import org.testng.annotations.Test;

import sevenrmartSupermarket.Pages.ManageLocationPage;

public class ManageLocationTest extends Base{
	ManageLocationPage managelocationpage;
	@Test
	public void searchFromManageLocationUsingName() throws IOException {
		 managelocationpage=new  ManageLocationPage(driver);
		 managelocationpage.searchNameToGetLocation();
	}

}
