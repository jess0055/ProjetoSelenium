package ProjetoSelenium.page;

import ProjetoSelenium.base.BasePage;

public class HomePage extends BasePage{

	public void acessarHome() {
		clicarLink("Home");
	}
	
	public void acessarWomen() {
		clicarLink("WOMEN");
	}
}
