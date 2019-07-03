package skeleton;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Case2login
{
	WebDriver driver;
	@Given("user is on login page")
	public void user_is_on_login_page()
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_c2a.04.29\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
	 	driver = new ChromeDriver();
	 	driver.manage().window().maximize();
	   driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	}

	@When("user enters valid username as{string}")
	public void user_enters_valid_username_as(String uname)
	
	{
	    WebElement user=driver.findElement(By.name("userName"));
	    user.sendKeys(uname);
	}

	@When("user enters valid password as{string}")
	public void user_enters_valid_password_as(String pass) 
	{
		 WebElement password=driver.findElement(By.name("password"));
		    password.sendKeys(pass);
	}
   
	@When("clicks onlogin button")
	public void clicks_login_button() 
	{
		 WebElement ok=driver.findElement(By.name("Login"));
		    ok.click();
		    
	}
	
	@Then("verify login successful")
	public void verify_login_successful()
	{
		String s1=driver.getTitle();
		Assert.assertEquals(s1, "Home");
		 System.out.println("login verified");
		   driver.close();
	}





}
