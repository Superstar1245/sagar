package browserlaunch;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxlaunch {

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
FirefoxDriver driver=new FirefoxDriver();
driver.manage().window().maximize();
Thread.sleep(6000);
driver.close();


	}

}