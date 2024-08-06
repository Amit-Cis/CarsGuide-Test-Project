@Find-Car
Feature: Acceptance Testing to validate find car is working fine
  In order to validate the find your next car feature searches for 
  desired cars and is working fine we will do acceptance testing

  @Find-Car-positive
  Scenario: validate Find your next car page
    Given I am on "https://www.carsguide.com.au" homepage of carsguide website
    When I move to Find your next car heading
    Then I select make as "Rolls-Royce"
    And I select model as "Ghost"
    And I validate the color of Show me button
    And I click on Show me button
    Then I should see list of searched cars
    And The page title should be "Rolls-Royce Ghost for Sale | CarsGuide"
