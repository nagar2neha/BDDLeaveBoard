package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class registerWithMapsStepDefinition {
	
	WebDriver driver;
	
	@Given("user is on Home Page")
	public void user_is_on_home_page() {
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");
		driver = new FirefoxDriver(); 
		driver.get("https://leaveboard.com/");
	}

	@Then("user clicks on the Register Button")
	public void user_clicks_on_the_register_button() {
		driver.findElement(By.linkText("Register")).click();	
	}

	@Then("user enters companyname firstname lastname email and password")
	public void user_enters_companyname_firstname_lastname_email_and_password(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		for(Map<String,String> data : dataTable.asMaps(String.class, String.class))
		{
			Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys(data.get("company"));
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(data.get("firstname"));
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys(data.get("lastname"));
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys(data.get("email-id"));
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(data.get("password"));
		
		driver.findElement(By.xpath("//div[text()='Register company']")).click();
		
		driver.findElement(By.linkText("Register company")).click();
		}
	}

	

	@Then("current browser is closed")
	public void current_browser_is_closed() {
	    driver.quit();
	}


}
