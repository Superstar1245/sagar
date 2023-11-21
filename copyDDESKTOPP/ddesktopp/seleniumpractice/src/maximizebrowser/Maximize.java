package maximizebrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(6000);
		String k=driver.getTitle();
		System.out.println(k);
	     Thread.sleep(6000);
	     
	    driver.manage().window().maximize();
	    Thread.sleep(6000);
		
		driver.close();
		


	}

}

