package stepDefinitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//import junit.framework.Assert;

public class loginstepDefinitions {
	
	WebDriver driver;
	
	
@Given("user is already on Login Page")
public void user_is_already_on_login_page() {
	System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");
	driver = new FirefoxDriver(); 
	driver.get("https://leaveboard.com/");
	driver.findElement(By.linkText("Login")).click();
}

@When("title of login page is {string}")
public void title_of_login_page_is(String string) {
	String title = driver.getTitle();
	Assert.assertEquals("LeaveBoard.com",title );
	
}

@Then("user enters {string} and {string}")
public void user_enters_and(String username, String password) throws Throwable  {
	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys(username);
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
}

@Then("user clicks on login button")
public void user_clicks_on_login_button() {
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
}

@Then("user is on home page")
public void user_is_on_home_page() {
    String hometitle = driver.getTitle();
    Assert.assertEquals("LeaveBoard.com" ,hometitle);
}

@Then("user goes to Employee tab")
public void user_goes_to_employee_tab() {
    driver.findElement(By.linkText("Employees")).click();
}
@Then("clicks on Invite Employee")
public void clicks_on_invite_employee() {
    driver.findElement(By.linkText("Invite employees")).click();
}
@Then("user enters employee details {string} and {string} and {string}")
public void user_enters_employee_details_and_and(String email, String firstname, String lastname) {
    driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys(email);
    driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(firstname);
    driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys(lastname);
    driver.findElement(By.xpath("//button[@type='submit']")).click();
}


@Then("Close the browser")
public void close_the_browser() {
    driver.quit();
}

}
