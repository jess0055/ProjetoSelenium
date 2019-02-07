package ProjetoSelenium.base;

import static ProjetoSelenium.base.DriverFactory.getDriver;

import org.openqa.selenium.By;

public class BasePage {

	private void clicar (By by) {
		getDriver().findElement(by).click();
	}
	
	public void clicarLink (String texto) {
		clicar(By.linkText(texto));
	}
	
	public String obterTexto(By by) {
		return getDriver().findElement(by).getText();
	}
}
