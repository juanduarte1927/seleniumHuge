#Author: rjdiazzh@gmail.com
Feature: Automated the your logo page

  @test
  Scenario Outline: choose a product and it is displayed in the shopping cart successfully
    Given that I opened the browser at automationpractice page
    When  I look for <item> select any displayed result and add <Quantity> products to go to the shopping cart
    Then  should the shopping cart show the product is not 'null' and quantity should be <Quantity>
    Examples:
      |item|Quantity|
      |"dress"|2|
      |"T-shirt"|1|

  Scenario Outline: Register an user
    Given that I opened the automationpractice page
    When  I want to register a new <Email> into the platform
    And send the personal information <Title> <FirstName> <LastName> <Email> <Password>
    And address details <Address> <City> <State> <Zip> <Phone>
    Then the new user should be created and the user see the message Welcome to your account. Here you can manage all of your personal information and orders.

    Examples:
      |Title|FirstName|LastName|Email|Password|Address|City|State|Zip|Phone|
      |Mr|juan|duarte|pweyiqqiqepr@gmail.com|dress|tra 60 114 a 50|Any|Oregon|11111|222222222|

  @test
  Scenario Outline: Register an user with wrong Email
    Given that I opened the automationpractice page
    When  I want to register a new <Email> into the platform
    Then a 'Invalid email address.' error message should be displayed

    Examples:
      |Email|
      |a|
      |1|