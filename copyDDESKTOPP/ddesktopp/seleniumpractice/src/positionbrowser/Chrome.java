package positionbrowser;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	Thread.sleep(6000);
	Point p=new Point(350, 350);
	driver.manage().window().setPosition(p);
	Thread.sleep(6000);
	driver.close();

	}

}
