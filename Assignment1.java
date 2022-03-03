import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		// https://rahulshettyacademy.com/AutomationPractice/
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pulmamidiv\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
        
		//Below line are to validate the first check box is checked and unchecked.
		driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
		Thread.sleep(1000);
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
		
        // Count the number of check boxes on the screen
        System.out.println("The total check boxes in the screen are " +driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	}

}
