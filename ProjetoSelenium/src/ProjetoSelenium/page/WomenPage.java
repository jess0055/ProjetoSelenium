package ProjetoSelenium.page;

import org.openqa.selenium.By;

import ProjetoSelenium.base.BasePage;

public class WomenPage extends BasePage {
	
	public String isPageWomen () {
		return obterTexto(By.className("title_block"));
	}
	
	public void clicarProduto() {
		clicarLink("Blouse");
	}
}
