package com.testing.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPagePO {
    //Stage 1 - Element Locator
    @FindBy(id = "email")
    public static WebElement EmailField;

    @FindBy(name = "login[password]")
    public static WebElement PasswordField;

    @FindBy(css = "#send2 > span")
    public static WebElement SignInButton;



    //Stage 2 - Initialise Web Elements to use Selenium WebDriver
    public SignInPagePO(WebDriver driver){
        PageFactory.initElements(driver, this);
    }


    //Stage 3 - Write methods to describe element action
    public void enterEmail(String email){
        EmailField.sendKeys(email);
    }

    public void enterPassword(String password){
        PasswordField.sendKeys(password);
    }

    public void clickSignInButton(){
        SignInButton.click();
    }













}
