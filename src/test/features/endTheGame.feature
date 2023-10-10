Feature: End The Game

  Scenario: The game ends in a tie
    Given The winner is "Ничья"
    When the endTheGame function is called
    Then it should print "Ничья!"

  Scenario: Player X wins the game
    Given The winner is "X"
    When the endTheGame function is called
    Then it should print "Поздравляем! X победил!"

  Scenario: Player O wins the game
    Given The winner is "O"
    When the endTheGame function is called
    Then it should print "Поздравляем! O победил!"