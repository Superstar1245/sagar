package deleteCookies;

import org.openqa.selenium.chrome.ChromeDriver;

public class Instagmcookies {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.instagram.com/");
		Thread.sleep(6000);
		driver.manage().deleteAllCookies();
		Thread.sleep(6000);
		driver.close();


	}

}
