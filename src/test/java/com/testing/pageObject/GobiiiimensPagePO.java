package com.testing.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GobiiiimensPagePO {

    //Stage 1 - Element Locator
    @FindBy(xpath = "//*[@id=\"product-options-wrapper\"]/div/div[1]/div[2]/div/select/option[2]")
    public static WebElement SizeButton;

    @FindBy( xpath = "//*[@id=\"product-addtocart-button\"]")
    public static WebElement AddToBasketButton;


    //Stage 2 - Initialise Web Elements to use Selenium WebDriver
    public GobiiiimensPagePO(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //Stage 3 - Write methods to describe element action
    public void clickSizeButton(){
        SizeButton.click();
    }

    public void clickAddToBasketButton(){
        AddToBasketButton.click();
    }




}
