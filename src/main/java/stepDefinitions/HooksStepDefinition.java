package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksStepDefinition {
	
	@Before
	public void setUP(){
		System.out.println("launch FF");
		System.out.println("Enter URL for Leaveboard");
	}
	
	@After
	public void tearDown(){
		System.out.println("close the browser");
	}
	
	@Given("^user is on deal page$")
	public void user_is_on_deal_oage() throws Throwable {
		System.out.println("user is on deal page");
	}
	
	@When("^user fills the deals form$")
	public void user_fills_the_deals_form() throws Throwable {
		System.out.println("create a deal");
	}
	
	@Then("^deal is created$")
	public void deal_is_created() throws Throwable {
		System.out.println("deal is created");
	}
		
	
	@Given("^user is on contact page$")
	public void user_is_on_contact_page() throws Throwable {
		System.out.println("user is on contact page");
	
	}
	
	@When("^user fills the contact form$")
	public void user_fills_the_contact_form() throws Throwable {
		System.out.println("create a contact");
	}
	
	@Then("^contact is created$")
	public void contact_is_created() throws Throwable {
		System.out.println("contact is created");
	}
	
	
	
	@Given("^user is on mail page$")
	public void user_is_on_mail_page() throws Throwable {
		System.out.println("user is on mail pahge");
	}
	
	@When("^user fills the mail form$")
	public void user_fills_the_mail_form() throws Throwable {
		System.out.println("create a mail");
	}
	
	@Then("^mail is created$")
	public void mail_is_created() throws Throwable {
		System.out.println("mail is created");
	}	
	}


