package CLICKACTION;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utubename {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("file:///C:/Users/Administrator/Desktop/selenium%20practice/utubename.html");
		Thread.sleep(5000);
		driver.findElement(By.name("p2")).click();
		Thread.sleep(5000);
		driver.close();


	}

}
