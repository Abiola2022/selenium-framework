package com.testing.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoePagePO {

    //Stage 1- Element Locator
    @FindBy(xpath = "//*[@id=\"amasty-shopby-product-list\"]/div[3]/ol/li[5]/div/a")
    public static WebElement Gobi_III_Mens_Link;


    //Stage 2- Initialise Web Elements to use Selenium WebDriver
    public ShoePagePO(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    //Stage 3- Write method to describe element action
    public void clickGobi111MensLink(){
        Gobi_III_Mens_Link.click();
    }

}
