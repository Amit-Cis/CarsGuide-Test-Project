@Used-Car
Feature: Acceptance Testing to validate used car is working fine
  In order to validate the used car feature searches for 
  desired cars and is working fine we will do acceptance testing

  @Used-Car-positive
  Scenario: validate used car page
    Given I am on homepage "https://www.carsguide.com.au" of carsguide website
    When I move to buy+sell menu
    Then I click on Used under Buy option
    Then I select anymake
      | AnyMake |
      | BMW     |
      | AUDI    |
    And I select car model as "3 Series"
    And I select state as "Queensland"
    And I select region as "All regions"
    And I select minimum price as "$3,000"
    And I select maximum price as "$150,000"
    Then I click on Show me used vehicles button
    Then I should see list of searched cars from filters
    And The page title should be shown as "Used BMW 3 Series Between 3,000 and 150,000 for Sale QLD - Second Hand BMW 3 Series Between 3,000 and 150,000 in QLD | CarsGuide"
