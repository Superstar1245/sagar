package logins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooklogin {

	public static void main(String[] args) throws InterruptedException {
 System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
 WebDriver driver=new ChromeDriver();
 driver.manage().window().maximize();
 Thread.sleep(5000);
 driver.get("https://www.facebook.com");
 driver.findElement(By.id("email")).sendKeys("tester123@gmail.com");
 Thread.sleep(5000);
 driver.findElement(By.id("pass")).sendKeys("tester@123");
 Thread.sleep(5000);
 driver.findElement(By.name("login")).click();
 Thread.sleep(5000);
 driver.close();

	}

}
