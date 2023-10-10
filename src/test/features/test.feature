@all
Feature: Проверка функции isBoardFilled()

  Scenario: Игровая доска не заполнена
    Given Допустим, игровая доска не заполнена
    When вызывается функция isBoardFilled
    Then результат должен быть false

  Scenario: Игровая доска заполнена
    Given Допустим, игровая доска заполнена
    When вызывается функция isBoardFilled
    Then результат должен быть true