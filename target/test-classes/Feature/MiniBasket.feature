@MiniBasket
Feature: Mini Basket

  @Step1
  Scenario Outline:
    Given User click on men
    When User click on Shoe
    And User Select Size
    And User click on Add to basket
    And User click on mini basket
    Then  Mini basket popup should displayed