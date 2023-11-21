package launchURL;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Utubelaunch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		Thread.sleep(5000);
		driver.get("https://www.youtube.com/");
		Thread.sleep(5000);
driver.manage().window().maximize();
driver.get("https://www.instagram.com/");
Thread.sleep(5000);
driver.close();
	}

}
