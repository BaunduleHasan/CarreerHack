Feature: verify filter button

  Scenario Outline: verify filter menu is working
    Given I am logged in on my swablabs account
    When I click Click on filter button
    And I click on name A to Z
    Then All the products are sorted in assending order
    When I click on Name Z to A
    Then All the products are in dessending order
    When I click On Price(low to High
    Then all the products sort out from low to high
    When I click on Price(High to Low)
    Then all the products sort out by high to low
