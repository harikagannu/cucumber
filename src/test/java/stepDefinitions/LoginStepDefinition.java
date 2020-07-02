package stepDefinitions;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
 

public class LoginStepDefinition {
	WebDriver driver;

	@Given("^user is already on login page$")
	public void user_is_already_on_login_page(){
		System.setProperty("webdriver.chrome.driver", "C://Selenium/chromedriver_win32/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.ecommerce.saipratap.net/customerlogin.php?msg=lnvalid");
	}
	
	@When("^user enter User name and Password$")
	public void user_enter_User_name_and_Password(){
		driver.findElement(By.name("email")).sendKeys("harikaqa.601@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Welcome@123");
		
		}
    @Then("^user click on login button$")
    public void user_click_on_login_button(){
    	driver.findElement(By.xpath("//DIV[@align='center'][text()='Login']")).click();
    	
    }
    

	
}
