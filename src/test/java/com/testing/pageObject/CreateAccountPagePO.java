package com.testing.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPagePO {

    //Stage 1 - Element Locator
    @FindBy(id = "firstname")
    public static WebElement FirstnameField;

    @FindBy(name = "lastname")
    public static WebElement LastnameField;

    @FindBy(name = "email")
    public static WebElement EmailField;

    @FindBy(name = "password")
    public static WebElement PasswordField;

    @FindBy(name = "password_confirmation")
    public static WebElement ConfirmPasswordField;

    @FindBy(css = "#form-validate > div > div.primary > button > span")
    public static WebElement CreateAccountButton;










    //Stage 2 - Initialise Web Elements to use Selenium WebDriver
    public CreateAccountPagePO(WebDriver driver){
        PageFactory.initElements(driver, this);
    }



    //Stage 3 - Write methods to describe element action
    public void enterFirstname(String firstname){
        FirstnameField.sendKeys(firstname);
    }

    public void enterLastname(String lastname){
        LastnameField.sendKeys(lastname);
    }

    public void enterEmail(String email){
        EmailField.sendKeys(email);
    }

    public void enterPassword(String password){
        PasswordField.sendKeys(password);
    }

    public void enterConfirmPassword(String confirmpassword){
        ConfirmPasswordField.sendKeys(confirmpassword);
    }

    public void clickCreateAccountButton(){
        CreateAccountButton.click();
    }
}















