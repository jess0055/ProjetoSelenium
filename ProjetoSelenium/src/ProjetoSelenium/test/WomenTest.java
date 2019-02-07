package ProjetoSelenium.test;

import org.junit.Assert;
import org.junit.Test;

import ProjetoSelenium.base.BaseTest;
import ProjetoSelenium.page.HomePage;
import ProjetoSelenium.page.WomenPage;

public class WomenTest extends BaseTest{

	private HomePage page = new HomePage();
	private WomenPage women = new WomenPage();
	
	@Test
	public void deveSelecionarProduto() {
		
		page.acessarWomen();		
		//System.out.println(women.isPageWomen());		
		Assert.assertEquals("WOMEN", women.isPageWomen());
		esperar(10000);
		women.clicarProduto();
	}
	

}
