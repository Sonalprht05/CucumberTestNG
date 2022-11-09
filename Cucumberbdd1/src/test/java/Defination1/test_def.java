package Defination1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class test_def 
{
	WebDriver driver;
	
	@Given("Should be inside the login page")
	public void should_be_inside_the_login_page() 
	{
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/newtours/index.php");
	}
	@When("Enter the username {string}")
	public void enter_the_username(String string) throws InterruptedException 
	{
	    Thread.sleep(3000);
	    driver.findElement(By.name("userName")).sendKeys(string);
	}
	@And("Enter the password {string}")
	public void enter_the_password(String string) throws InterruptedException 
	{
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys(string);
	    
	}
	@Then("Click on login button")
	public void click_on_login_button() throws InterruptedException 
	{
	    Thread.sleep(2000);
	    driver.findElement(By.name("submit")).click();
	    Thread.sleep(2000);
	    driver.close();
	}
	    
}

