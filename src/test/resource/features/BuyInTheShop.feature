#Author: rjdiazzh@gmail.com
Feature: Automated the your logo page

  Scenario Outline: choose a product and it is displayed in the shopping cart successfully
    Given that I opened the browser at automationpractice page
    When  I look for <item> and select any displayed result to go to the shopping cart
    Then  should the shopping cart show the product is not 'null'
    Examples:
      |item|
      |"dress"|
      |"T-shirt"|

  Scenario: Register an user
    Given that I opened the automationpractice page
    And  I click on Sign-in
    When I enter an email 'test2221@gmail.com'
    Then  should the create account form be shown

  Scenario Outline: Fill the user form
    Given that I opened the automationpractice page
    And  I click on Sign-in
    When I enter the user information <name> <lastname>
    Then  the user is registered
    Examples:
      |name|lastname|
      |"Lorena"|"Amaya"|



