Feature: Validate login

  Scenario Outline: check login Functionality
    Given I am on swaglabs homepage
    When I enter "<username>" and "<password>"
    When I click on login
    Then I validate the outcomes
    When I click on menu
    And I click on logout
    Then I am logged out from swaglabs

    Examples: 
      | username      | password     |
      | standard_user | secret_sauce |
