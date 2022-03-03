import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
//TestNG is one of the testing framework


public class Locators3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pulmamidiv\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(4000);
		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		Thread.sleep(3000);
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] "));
		for(WebElement option : options)
		{
			System.out.println(option.getText());
			if (option.getText().equalsIgnoreCase("India"))
					{
				option.click();
				break;
					}
			
		}
		
		
		//dropdown with select tag
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticDropdown);
        dropdown.selectByIndex(3);
        System.out.println(dropdown.getFirstSelectedOption().getText());
        dropdown.selectByVisibleText("INR");
        System.out.println(dropdown.getFirstSelectedOption().getText());
        dropdown.selectByValue("AED");
        System.out.println(dropdown.getFirstSelectedOption().getText());
        Thread.sleep(2000);
        driver.findElement(By.id("divpaxinfo")).click();
        int i= 1;
        while(i < 5)
        {
        	driver.findElement(By.id("hrefIncAdt")).click();
        	driver.findElement(By.id("hrefIncChd")).click();
        	driver.findElement(By.id("hrefIncInf")).click();
             	i++;
        }
        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult, 4 Child, 4 Infant");
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        
        driver.findElement(By.cssSelector("#btnclosepaxoption")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
        driver.findElement(By.xpath("//a[@value='HYD']")).click();
        Thread.sleep(2000);
        //driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
        driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();
        
       // driver.findElement(By.cssSelector(".ui-datepicker-week-end.ui-datepicker-days-cell-over.ui-datepicker-current-day.ui-datepicker-today")).click();
        
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();    
        
        //assert
        //Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
        Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
        
        
        System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
        
        // Count the number of check boxes on the screen
        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
        
        //Date selection
        driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
        driver.findElement(By.cssSelector("body > div:nth-child(3) > div:nth-child(1) > table:nth-child(2) > tbody:nth-child(2) > tr:nth-child(2) > td:nth-child(3) > a:nth-child(1)")).click();
        System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_view_date1")).getText());
        //driver.findElement(By.cssSelector("")).click();
        
        System.out.println(driver.findElement(By.id("Div1")).getAttribute("Style"));
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        System.out.println(driver.findElement(By.id("Div1")).getAttribute("Style"));
        if(driver.findElement(By.id("Div1")).getAttribute("Style").contains("1"))
        {
        	Assert.assertTrue(true);
        	System.out.println("Enabled");
        }
        else
        {
        	Assert.assertTrue(false);
        }
        
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();
        
        System.out.println("Test Case Passed and reached at end");
        
	}

}
