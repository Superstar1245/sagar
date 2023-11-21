
package browserlaunch;



import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Bothchromefirelaunch {

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
ChromeDriver driver=new ChromeDriver();
Thread.sleep(6000);
FirefoxDriver driver1=new FirefoxDriver();
Thread.sleep(6000);
driver1.manage().window().maximize();
Thread.sleep(6000);
driver1.close();


	}

}
