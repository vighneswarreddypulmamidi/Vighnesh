import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FirstClass {

	public static <JavaScriptExecutor> void main(String[] args) throws InterruptedException, Exception  {
		// TODO Auto-generated method stub
		//Cromedriver.exe
		//Edge Browser
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\pulmamidiv\\Downloads\\msedgedriver.exe");
		//WebDriver driver = new EdgeDriver();
		//WebDriverWait wait = new WebDriverWait(driver,30);
		//impicit wait
		
		
		//Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pulmamidiv\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		//WebDriverWait wait = new WebDriverWait(driver,30);
		//driver.get("https://sit-ae77-denim.myshopify.com/account");
		driver.get("https://sit-ae77-denim.myshopify.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.quit();
		//driver.wait(100);
		//driver.close();
	/*	driver.findElement(By.id("customer_email")).sendKeys("pulmamidiv@ae.com");
		driver.findElement(By.id("customer_password")).sendKeys("Siddhartha9*");
		driver.findElement(By.cssSelector("input[value='Sign In']")).click(); 
		try {
			driver.wait(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		driver.findElement(By.xpath("//svg[@viewBix='0 0 29 29']")).click();
		
	*/	
		driver.findElement(By.xpath("//a[@aria-label='Search']//*[name()='svg']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Type to search']")).sendKeys("0045431459");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@aria-label='Search']//*[name()='svg']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[normalize-space()='AE77 The Slim Jean'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#add-to-cart")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[aria-label='Cart'] div")).click();
		driver.findElement(By.xpath("//input[@name='checkout']")).click();
		driver.findElement(By.xpath("(//input[@id='checkout_email'])[1]")).sendKeys("pulmamidiv@ae.com");
		driver.findElement(By.xpath("//input[@id='checkout_shipping_address_first_name']")).sendKeys("vighneswar");
		driver.findElement(By.xpath("//input[@id='checkout_shipping_address_last_name']")).sendKeys("pulmamidi");
		driver.findElement(By.xpath("//input[@id='checkout_shipping_address_address1']")).sendKeys("3072 Whitcomb st");
		driver.findElement(By.xpath("//input[@id='checkout_shipping_address_city']")).sendKeys("Charlotte");
		driver.findElement(By.xpath("//select[@id='checkout_shipping_address_country']")).sendKeys("United States");
		driver.findElement(By.xpath("//select[@id='checkout_shipping_address_province']")).sendKeys("North Carolina");
		driver.findElement(By.xpath("//input[@id='checkout_shipping_address_zip']")).sendKeys("28269");
		
		driver.findElement(By.xpath("//input[@id='checkout_reduction_code']")).sendKeys("EMPDEC2021");
		
		//driver.findElement(By.xpath("//input[@id='checkout_shipping_address_phone']")).sendKeys("(612) 212-9107");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("#checkout_submit")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='checkout_shipping_address_phone']")).sendKeys("(612) 212-9107");
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		//wait.until(Expected)
		//Continue button at shipping address screen
		//driver.findElement(By.cssSelector("#continue_button")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@id='continue_button']")).click();
		Thread.sleep(4000);
		////Continue button at delivery method screen
		driver.findElement(By.xpath("//button[@id='continue_button']")).click();
		//Thread.sleep(4000);
		//driver.findElement(By.xpath("//span[normalize-space()='Expedited (2-4 business days)']")).click();
		Thread.sleep(9000);
		//JavaScriptExecutor js = (JavaScriptExecutor)driver; 
		//((Object) js).executeScript("document.getElementById('number').value='*****'");
		//driver.findElement(By.xpath("//div[@dir='ltr']//div[@class='field field--required']//div[@class='field__input-wrapper field__input-wrapper--icon-right']")).sendKeys("4242 4242 4242 4242");
		//driver.findElement(By.xpath("//div[@data-card-fields='number']")).findElement(By.id("number")).sendKeys("4242 4242 4242 4242");
		 WebElement element = driver.findElement(By.xpath("//div[@data-card-fields='number']"));
	/*	
		 
		 JavascriptExecutor j = (JavascriptExecutor)driver;
	      j.executeScript("arguments[0].value='4242 4242 4242 4242';", element);
		
	      // element.sendKeys("4242 4242 4242 4242");
		*/ 
         String text = element.getText();
         System.out.println(text);
		
		//.sendKeys("4242 4242 4242 4242");
		System.out.println(driver.findElement(By.xpath("//header[@class='main__header']//span[@class='logo__text heading-1'][normalize-space()='SIT - AE77 DENIM']")).getText());		
		/*
		 * driver.findElement(By.id("number")).sendKeys("4242 4242 4242 4242");
		 * driver.findElement(By.id("name")).sendKeys("Vighneswar Pulmamidi");
		driver.findElement(By.id("expiry")).sendKeys("12 / 25");
		driver.findElement(By.id("verification_value")).sendKeys("123");
		Thread.sleep(4000);
		*/
		driver.findElement(By.xpath("//div[@class='shown-if-js']//button[@id='continue_button']")).click();
		Thread.sleep(4000);
		//implicit wait
		
		//driver.findElement(By.id("Sign In")).click();
	
	}
	

}
