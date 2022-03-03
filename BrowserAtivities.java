import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BrowserAtivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pulmamidiv\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://sit-ae77-denim.myshopify.com/");
		//driver.get("https://google.com");
		//driver.navigate().t
		driver.navigate().to("https://google.com");
		driver.navigate().back();
		driver.navigate().forward();
		
	}

}
