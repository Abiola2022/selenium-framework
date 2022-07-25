package com.testing.stepDefinition;

import com.testing.cucumber.Hooks;
import com.testing.pageObject.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class MiniBasketSteps {
    WebDriver driver = Hooks.driver;

    @Given("User click on men")
    public void userClickOnMen() {
        VivoPagePO vivoPagePO = new VivoPagePO(driver);
        vivoPagePO.clickMenLink();
    }

    @When("User click on Shoe")
    public void userClickOnShoe() {
        ShoePagePO shoePagePO = new ShoePagePO(driver);
        shoePagePO.clickGobi111MensLink();
    }

    @And("User Select Size")
    public void userSelectSize() {
        GobiiiimensPagePO gobiiiimensPagePO = new GobiiiimensPagePO(driver);
        gobiiiimensPagePO.clickSizeButton();
    }

    @And("User click on Add to basket")
    public void userClickOnAddToBasket() {
        GobiiiimensPagePO gobiiiimensPagePO = new GobiiiimensPagePO(driver);
        gobiiiimensPagePO.clickAddToBasketButton();
    }

    @And("User click on mini basket")
    public void userClickOnMiniBasket() {
        CartPagePO cartPagePO = new CartPagePO(driver);
        cartPagePO.clickMiniBasketButton();
    }

    @Then("Mini basket popup should displayed")
    public void miniBasketPopupShouldDisplayed() {
    }






}