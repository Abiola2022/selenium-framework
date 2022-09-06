package com.testing.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePO {
    //Stage 1- Element Locator

    @FindBy(linkText = "Create an Account")
    public static WebElement CreateAccountLink;

    @FindBy(linkText = "Sign In")
    public static WebElement SignInLink;

    //Stage 2- Initialise Web Elements to use Selenium WebDriver

    public HomePagePO(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    //Stage 3- Write method to describe element action

    public void clickCreateLink() {
        CreateAccountLink.click();
    }

    public void clickSignInLink() {
        SignInLink.click();
    }
}
















