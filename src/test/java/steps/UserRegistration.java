package steps;

import com.github.javafaker.Faker;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import pages.HomePage;
import pages.RegistrationPage;
import pages.SignInPage;
import tests.TestBase;

public class UserRegistration extends TestBase {

    HomePage homeObject;
    RegistrationPage registerObject;
    SignInPage signInObject;

    Faker fakeData = new Faker();
    String fullName = fakeData.name().firstName();
    String email = fakeData.internet().emailAddress();
    String password = fakeData.number().digits(8);
    String mobileNumber = "0100".concat(fakeData.number().digits(7));

    @Given("^the user in the home page$")
    public void the_user_in_the_home_page(){
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.drbridge.org/");
    }

    @When("^I click on signUp link$")
    public void i_click_on_signUp_link(){
        homeObject = new HomePage(driver);
        homeObject.openRegistrationPage();

    }


    @And("^I entered user data$")
    public void i_entered_user_data() {
        registerObject = new RegistrationPage(driver);
        registerObject.enterRegistrationData(fullName,mobileNumber,email,password);
    }

    @And("^click join now")
    public void click_join_now() {
        registerObject.submitRegistrationData();
    }


    @Then("^The registration page displayed successfully$")
    public void the_registration_page_displayed_successfully(){
        homeObject = new HomePage(driver);
        homeObject.waitUntilPatientDetailsBtnIsVisible();
        Assert.assertEquals(homeObject.getPatientName(),fullName.toUpperCase());
    }

    @Then("^User can log out and sign in again$")
    public void User_can_log_out_and_sign_in_again(){
        signInObject = new SignInPage(driver);
        homeObject.openPatientDetailsDropDown();
        homeObject.signOut();
        homeObject.openSignInPage();
        signInObject.signIn(mobileNumber,password);
        homeObject.waitUntilPatientDetailsBtnIsVisible();
        Assert.assertEquals(homeObject.getPatientName(),fullName.toUpperCase());
    }
}
