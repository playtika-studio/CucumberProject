package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class MyStepdefs {

    @Given("I navigate to the login page")
    public void navigateToPage(){
        System.out.println("Navigate to login");
    }

    @And("I click login button")
    public void iClickLoginButton() {
        System.out.println("Enter user and password");
    }

    @Then("I should see the userform button")
    public void iShouldSeeTheUserformButton() {
        System.out.println("Enter user and password");
    }

    @Given("I enter the {string} and {string}")
    public void i_enter_the_admin_and_adminpassword(String username, String password) {
        System.out.println("Username is "+ username + " and password "+password);
    }
}