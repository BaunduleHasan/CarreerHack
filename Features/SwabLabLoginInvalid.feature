Feature: login functionality

  Scenario Outline: verify login with invalid credentials
    Given I am n Swaglab homepage
    When I enter invalid "<username>" and Valid "<password>"
    When I enter valid "<username>" and invalid "<password>"
    When I enter invalid "<username>" and invalid "<password>"
    And I click on Login
    Then it shows error

    Examples: 
      | username      | password     |
      | anything      | sauce_secret |
      | standard_user | anything     |
      | afraid        | not          |
