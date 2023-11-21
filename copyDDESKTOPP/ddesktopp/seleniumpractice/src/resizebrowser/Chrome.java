package resizebrowser;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
WebDriver driver=new ChromeDriver();
Thread.sleep(6000);
driver.manage().window().maximize();
Thread.sleep(6000);
Dimension d=new Dimension(600, 200);
driver.manage().window().setSize(d);
Thread.sleep(6000);
driver.close();
	}

}
