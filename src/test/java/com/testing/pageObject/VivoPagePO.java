package com.testing.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class VivoPagePO {

    //Stage 1 - Element Locator
    @FindBy(xpath = "//*[@id=\"html-body\"]/div[4]/header/div[2]/nav/ul/li[2]/a")
   public static WebElement MenLink ;


    //Stage 2 - Initialise Web Elements to use Selenium WebDriver
    public VivoPagePO(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    //Stage 3 - Write methods to describe element action
    public void clickMenLink(){
        MenLink.click();
    }



}
