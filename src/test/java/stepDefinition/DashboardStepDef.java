package stepDefinition;

import common.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class DashboardStepDef extends BasePage{

	@Given("^User is on dashboard page$")
	public void user_is_on_dashboard_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^User verify page title as \"([^\"]*)\"$")
	public void user_verify_page_title_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("^User hover on profile dropdown$")
	public void user_hover_on_profile_dropdown() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("^USer should be able to see logged in user name$")
	public void user_should_be_able_to_see_logged_in_user_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}
		
		
}
