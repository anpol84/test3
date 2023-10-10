Feature: Current Result Functionality

  Scenario: Winner Exists
    Given the game has a winner
    When I check the current result
    Then the function should return the winner

  Scenario: Draw
    Given the game has no winner and board is filled
    When I check the current result
    Then the function should return draw

  Scenario: No Result Yet
    Given the game has no winner and the board is not filled
    When I check the current result
    Then the function should return null