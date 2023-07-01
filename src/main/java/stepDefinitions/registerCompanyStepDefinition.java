package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class registerCompanyStepDefinition {
		
	WebDriver driver;
		
@Given("user opens the Home Page")
public void user_opens_the__home_page() {
	System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");
	driver = new FirefoxDriver(); 
	driver.get("https://leaveboard.com/");
}

@Then("user clicks on Register Button")
public void user_clicks_on_register_button() {
	driver.findElement(By.linkText("Register")).click();	
}

@Then("user enters companyname and other details")
public void user_enters_companyname_and_other_details(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	List<List<String>> data = dataTable.asLists();
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys(data.get(0).get(0));
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(data.get(0).get(1));
	driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys(data.get(0).get(2));
	driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys(data.get(0).get(3));
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys(data.get(0).get(4));
}

@Then("he clicks on register company")
public void he_clicks_on_register_company() {
	driver.findElement(By.xpath("//div[text()='Register company']")).click();
}

@Then("Close the current browser")
public void close_the_browser() {
    driver.quit();
}

}
