package CLICKACTION;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utubetagname {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	Thread.sleep(6000);
	driver.manage().window().maximize();
	Thread.sleep(6000);
	driver.get("file:///C:/Users/Administrator/Desktop/utubetagname.html");
	Thread.sleep(6000);
	driver.findElement(By.tagName("a")).click();
	Thread.sleep(6000);
	
	driver.close();

	}

}
