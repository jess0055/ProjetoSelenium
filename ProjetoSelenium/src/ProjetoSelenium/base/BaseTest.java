package ProjetoSelenium.base;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;

public class BaseTest {

	/*@Before
	public static void inicializaDriver() {
	
		DriverFactory.getDriver();
	}*/
	
	@AfterClass
	public static void fechaBrowser() {
		DriverFactory.killDriver();
	}
	
    public void esperar(long tempo){
    	try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    }
}
