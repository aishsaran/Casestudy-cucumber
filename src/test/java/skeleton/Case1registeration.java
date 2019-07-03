package skeleton;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Case1registeration
{ WebDriver driver;

	@Given("user is on signup page")
	public void user_is_on_signup_page()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_c2a.04.29\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
	 	driver = new ChromeDriver();
	 	driver.manage().window().maximize();
	    driver.get("http://10.232.237.143:443/TestMeApp/RegisterUser.htm");
	}

	@When("user enters username as {string}")
	public void user_enters_username_as(String username) 
	
	{
	   WebElement un=driver.findElement(By.name("userName"));
	   un.sendKeys(username);
	}

	@When("user enters firstname as {string}")
	public void user_enters_firstname_as(String fname)
	{
		 WebElement fn=driver.findElement(By.name("firstName"));
		   fn.sendKeys(fname);
	}

	@When("user enters lastname as {string}")
	public void user_enters_lastname_as(String lname) 
	{
		 WebElement ln=driver.findElement(By.name("lastName"));
		   ln.sendKeys(lname);
	}

	@When("user enters password as {string}")
	public void user_enters_password_as(String pass) {
		 WebElement password=driver.findElement(By.name("password"));
		   password.sendKeys(pass);
	}

	@When("user enters confirmpass as {string}")
	public void user_enters_confirmpass_as(String cp) {
		 WebElement confirmpass=driver.findElement(By.name("confirmPassword"));
		   confirmpass.sendKeys(cp);
	}

	@When("click on female button")
	public void click_on_female_button() 
	{
	 WebElement gen=driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[6]/div/div/label/span[2]"));
	   gen.click();
	   
	}

	@When("user enters email as {string}")
	public void user_enters_email_as(String email) 
	{
		WebElement emailid=driver.findElement(By.name("emailAddress"));
		   emailid.sendKeys(email);
	}

	@When("user enters mobilenum as {string}")
	public void user_enters_mobilenum_as(String mob) {
		WebElement num=driver.findElement(By.name("mobileNumber"));
		   num.sendKeys(mob);
	    
	}

	@When("user enters dob as {string}")
	public void user_enters_dob_as(String dob) 
	{
		WebElement bday=driver.findElement(By.name("dob"));
		   bday.sendKeys(dob);
	}

	@When("user enters address as {string}")
	public void user_enters_address_as(String address) 
	{
		WebElement add=driver.findElement(By.name("address"));
		   add.sendKeys(address);
	}

	@When("user selects security question")
	public void user_selects_security_question() 
	{
		Select security= new Select(driver.findElement(By.name("securityQuestion")));
		security.selectByIndex(3);
	}

	@When("user enters the answer as {string}")
	public void user_enters_the_answer_as(String ans)
	{
		WebElement answer=driver.findElement(By.name("answer"));
		   answer.sendKeys(ans);
	}

	@When("user clicks register button")
	public void user_clicks_register_button() {
		WebElement ok= driver.findElement(By.name("Submit"));
		ok.click();
	}

	@Then("verify registeration success")
	public void verify_registeration_success() 
	{
	    String check=driver.getTitle();
	  
	   Assert.assertEquals(check, "Login");
	   System.out.println("registeration verified");
	   driver.close();
	}


}
