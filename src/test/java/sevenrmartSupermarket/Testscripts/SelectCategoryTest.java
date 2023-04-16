package sevenrmartSupermarket.Testscripts;

import org.testng.annotations.Test;

import sevenrmartSupermarket.Pages.SelectCategoryPage;

public class SelectCategoryTest extends Base{
	SelectCategoryPage selectcategorypage;
	
	@Test
	public void selectAnElementFromMenu(String input) {
		selectcategorypage=new SelectCategoryPage(driver);
		selectcategorypage.selectElementFromMenu(input);
	}

}
