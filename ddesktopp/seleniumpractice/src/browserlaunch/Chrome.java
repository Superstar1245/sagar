package browserlaunch;

import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	Thread.sleep(6000);
	driver.manage().window().maximize();
	Thread.sleep(6000);
	driver.close();

	}

}
