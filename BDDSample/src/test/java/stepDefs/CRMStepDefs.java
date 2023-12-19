package stepDefs;

import com.mongodb.DB;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CRMStepDefs {
	@Before(value= "@SmokeTest", order =1)
	public void readSmokeTestProperty() {
		System.out.println("Read from Smoke Test property...");
	}
	@Before( value ="@SmokeTest", order = 2)
	public static void initChrome() {
		System.out.println("Init Chrome.....");
	}
	@Before(value= "@RegressionTest", order =1)
	public void readRegTestProperty() {
		System.out.println("Read from Reg Test property...");
	}
	@Before(value ="@RegressionTest", order = 2)
	public static void initEdge() {
		System.out.println("Init Edge.....");
	}
	//@AfterStep
	public static void closeDB() {
		System.out.println("Close DB.....");
	}
	@Given("User is logged in")
	public void user_is_logged_in() {
		System.out.println("User is logged in");
	}
	@When("User create a new contact")
	public void user_create_a_new_contact() {
		System.out.println("User create a new contact");
	}
	@When("User view contact details")
	public void user_view_contact_details() {
		System.out.println("User view contact details");
	}
	@When("User delete a contact")
	public void user_delete_a_contact() {
		System.out.println("User delete a contact");
	}
	@When("User create a new Deals")
	public void user_create_a_new_deals() {
		System.out.println("User create a new Deals");
	}
	@When("User view Deals details")
	public void user_view_delas_details() {
		System.out.println("User view Deals details");
	}
	@When("User delete a Deals")
	public void user_delete_a_delas() {
		System.out.println("User delete a Delas");
	}
	@When("User create a new Tasks")
	public void user_create_a_new_tasks() {
		System.out.println("User create a new Tasks");
	}
	@When("User view Tasks details")
	public void user_view_tasks_details() {
		System.out.println("User view Tasks details");
	}
	@When("User delete a Tasks")
	public void user_delete_a_tasks() {
		System.out.println("User delete a Tasks");
	}

}
