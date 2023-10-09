@all
Feature: Tic Tac Toe

  Scenario: Test board filled function
    Given I have a Tic Tac Toe board
    When I check if the board is filled
    Then the result should be true

  Scenario: Test end game function with a winner
    Given I have a winner name
    When I end the game with the winner
    Then I should see a congratulatory message

  Scenario: Test end game function with a tie
    Given I have a tie
    When I end the game with a tie
    Then I should see a tie message