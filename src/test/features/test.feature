@all
Feature: isBoardFilled

  Scenario: The board is not filled
    Given The game board is not filled
    When the isBoardFilled function is called
    Then the result should be false

  Scenario: The board is filled
    Given The game board is filled
    When the isBoardFilled function is called
    Then the result should be true