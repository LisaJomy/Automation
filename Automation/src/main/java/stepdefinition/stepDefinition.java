package stepdefinition;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefinition {

	@Given("^User is on the Netbanking landing page$")
	public void user_is_on_the_Netbanking_landing_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 
	}

	@When("^User login to the application with username and password$")
	public void user_login_to_the_application_with_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  
	}

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
        //code
    }

    @And("^Cards are displayed$")
    public void cards_are_displayed() throws Throwable {
       //code
    }

}