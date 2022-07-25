package com.testing.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPagePO {


    //Stage 1- Element Locator
    @FindBy ( xpath= "//*[@id=\"html-body\"]/div[4]/header/div[2]/div[3]/a")
    public static WebElement MiniBasketButton;


    //Stage 2- Initialise Web Elements to use Selenium WebDriver
    public CartPagePO(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    //Stage 3- Write method to describe element action
    public void clickMiniBasketButton() {
        MiniBasketButton.click();
    }


    }
