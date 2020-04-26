package stepDefinition.Facebook;

import Pages.Facebook.LoginAndRegistrationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import javax.annotation.Generated;

public class loginSD {

    LoginAndRegistrationPage lrpage = new LoginAndRegistrationPage();

    @Given("^I am on home page$")
    public void iAmOnHomePage() {
    }

    @When("^I enter (.*) into username text fields on home screen$")
    public void writeUsername(String username) {
        lrpage.enterUsername(username);
    }

    @When("^I enter (.*) into password text fields on home screen$")
    public void writePassword(String password) {
        lrpage.enterPassword(password);
    }

    @When("^I click on login button on home screen$")
    public void clickOnLoginButton() {
        lrpage.clickLoginButton();
    }

    @Then("^I verify that i am an invalid login page$")
    public void verifyInvalidPage() {

    }


}
