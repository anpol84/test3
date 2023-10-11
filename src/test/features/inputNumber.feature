Feature: Input Number Functionality

  Scenario: Valid number
    Given I have a scanner
    When I input a valid number between 1 and 9
    Then the function should return that number

  Scenario: Number less than 1
    Given I have a scanner
    When I input an invalid number less than 1
    Then the function should return null1

  Scenario: Number more than 9
    Given I have a scanner
    When I input an invalid number more than 9
    Then the function should return null1