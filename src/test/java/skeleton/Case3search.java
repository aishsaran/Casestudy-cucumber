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

public class Case3search 
{
	WebDriver driver;
	@Given("Alex is on login page")
	public void alex_is_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_c2a.04.29\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
	 	driver = new ChromeDriver();
	 	driver.manage().window().maximize();
	   driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	}

	@When("alex enters username as {string}")
	public void alex_enters_username_as(String uname)
	{
		WebElement user=driver.findElement(By.name("userName"));
	    user.sendKeys(uname);
	}

	@When("alex enters password as {string}")
	public void alex_enters_password_as(String pass) {
		 WebElement password=driver.findElement(By.name("password"));
		    password.sendKeys(pass);
	}

	@When("clicks on submit button")
	public void clicks_on_submit_button() 
	{
		WebElement ok=driver.findElement(By.name("Login"));
	    ok.click();
	}

	@When("Alex searches for the product")
	public void alex_searches_for_the_product() 
	{ 
		WebElement find=driver.findElement(By.id("myInput")) ;
		find.sendKeys("head");
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
		
	}

	

	

	@Then("verifies the product")
	public void verifies_the_product() 
	{
		String s=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[1]/center[1]/h4")).getText();
	Assert.assertEquals(s,"Headphone");
	System.out.println("search successful");
	driver.close();
	}
	


}
