package skeleton;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Case4check {
	WebDriver driver;
	@Given("alex has registered in to TestMeApp")
	public void alex_has_registered_in_to_TestMeApp()
	{ 
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_c2a.04.29\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		 	driver = new ChromeDriver();
		 	driver.manage().window().maximize();
		   driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
		   WebElement user=driver.findElement(By.name("userName"));
		    user.sendKeys("aishsaran");
		    WebElement password=driver.findElement(By.name("password"));
		    password.sendKeys("aishusaran");
		    WebElement ok=driver.findElement(By.name("Login"));
		    ok.click();
		    
	    
	}

	@When("Alex search a particular product like headphone")
	public void alex_search_a_particular_product_like_headphone() 
	{
		WebElement find=driver.findElement(By.id("myInput")) ;
		find.sendKeys("headphone");
		WebElement findbutton=driver.findElement(By.xpath("/html/body/div[1]/form/input"));
		findbutton.click();
		
	}

	@When("try to proceed to payment without adding any item in the cart")
	public void try_to_proceed_to_payment_without_adding_any_item_in_the_cart() 
	{
	    WebElement cart2=driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]"));
	 cart2.click();
	}
	

	@Then("TestMEapp doesn't display the cart icon")
	public void testmeapp_doesn_t_display_the_cart_icon() 
	{
	    if(driver.getTitle().equals("view cart"))
	    {
	    	Assert.assertFalse(false);
	    }
	    else
	    {
	    	Assert.assertTrue(true);
	    }
	    	
	}

	
}
