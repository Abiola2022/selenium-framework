package com.testing.stepDefinition;

import com.testing.cucumber.Hooks;
import com.testing.pageObject.CreateAccountPagePO;
import com.testing.pageObject.HomePagePO;
import com.testing.pageObject.SignInPagePO;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class AccountManagementSteps {
    WebDriver driver = Hooks.driver;

    @Given("User is on create an account page")
    public void userIsOnCreateAnAccountPage() {
        HomePagePO homePagePO = new HomePagePO(driver);
        homePagePO.clickCreateLink();

    }

    @When("User enter {string}, {string}, {string}, {string} and {string}")
    public void userEnterAnd(String firstname, String lastname, String email, String password, String confirmpassword) {
        CreateAccountPagePO createAccountPagePO = new CreateAccountPagePO(driver);
        createAccountPagePO.enterFirstname(firstname);
        createAccountPagePO.enterLastname(lastname);
        createAccountPagePO.enterEmail(email);
        createAccountPagePO.enterPassword(password);
        createAccountPagePO.enterConfirmPassword(confirmpassword);

    }

    @And("User click on create an account")
    public void userClickOnCreateAnAccount() {
        CreateAccountPagePO createAccountPagePO = new CreateAccountPagePO(driver);
        createAccountPagePO.clickCreateAccountButton();


    }

    @Then("My account page should be displayed")
    public void myAccountPageShouldBeDisplayed() {
        String expectedResult = "My Account";
        String actualResult = driver.getTitle();
        Assert.assertEquals(expectedResult,actualResult);

    }



    @Given("User is on sign in page")
    public void userIsOnSignInPage() {
        HomePagePO homePagePO = new HomePagePO(driver);
        homePagePO.clickSignInLink();
    }

    @When("User enter {string} and {string}")
    public void userEnterAnd(String email, String password) {
        SignInPagePO signInPagePO = new SignInPagePO(driver);
        signInPagePO.enterEmail(email);
        signInPagePO.enterPassword(password);
    }

    @And("User click on sign in")
    public void userClickOnSignIn() {
        SignInPagePO signInPagePO = new SignInPagePO(driver);
        signInPagePO.clickSignInButton();
    }

    @Then("My account page should displayed")
    public void myAccountPageShouldDisplayed() {
    }


    @Given("User is on sign in page and not registered")
    public void userIsOnSignInPageAndNotRegistered() {
        HomePagePO homePagePO = new HomePagePO(driver);
        homePagePO.clickSignInLink();
    }

    @When("User enter unknown{string} and unknown {string}")
    public void userEnterUnknownAndUnknown(String email, String password) {
        SignInPagePO signInPagePO = new SignInPagePO(driver);
        signInPagePO.enterEmail(email);
        signInPagePO.enterPassword(password);
    }

    @And("User click on sign in button")
    public void userClickOnSignInButton() {
        SignInPagePO signInPagePO = new SignInPagePO(driver);
        signInPagePO.clickSignInButton();
    }

    @Then("Error message should displayed")
    public void errorMessageShouldDisplayed() {
    }

    @Given("User already exit and is on create an account page")
    public void userAlreadyExitAndIsOnCreateAnAccountPage() {
        HomePagePO homePagePO = new HomePagePO(driver);
        homePagePO.clickCreateLink();
    }

    @When("User enter details {string}, {string}, {string}, {string} and {string}")
    public void userEnterDetailsAnd(String firstname, String lastname, String email, String password, String confirmpassword) {
        CreateAccountPagePO createAccountPagePO = new CreateAccountPagePO(driver);
        createAccountPagePO.enterFirstname(firstname);
        createAccountPagePO.enterLastname(lastname);
        createAccountPagePO.enterEmail(email);
        createAccountPagePO.enterPassword(password);
        createAccountPagePO.enterConfirmPassword(confirmpassword);
    }

    @And("User click on create an account button")
    public void userClickOnCreateAnAccountButton() {
        CreateAccountPagePO createAccountPagePO = new CreateAccountPagePO(driver);
        createAccountPagePO.clickCreateAccountButton();
    }

    @Then("Account already exist should displayed")
    public void accountAlreadyExistShouldDisplayed() {
    }


}
