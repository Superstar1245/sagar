package URLTITLESOURCECODE;

import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(6000);
	String k=driver.getTitle();
	System.out.println(k);
     Thread.sleep(6000);
	String l=driver.getPageSource();
	System.out.println(l);
	Thread.sleep(6000);
	String m=driver.getCurrentUrl();
	System.out.println(m);
	driver.close();
	

	}

}
