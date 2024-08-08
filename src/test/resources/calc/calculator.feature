@calculate
Feature: Calculator Functionality

#	Background:
#		Given I have entered the number 10 into the calculator

  @outline
  Scenario Outline: Calculate two numbers
    Given I have entered the number <number> into the calculator
    When I press the <op> button
    And I have entered another number <number1> into the calculator
    Then the result displayed should be <expectedResult>
    Examples:
      | number | op         | number1 | expectedResult |
      | 10     | "add"      | 5       | 15             |
      | 10     | "subtract" | 5       | 5              |
      | 10     | "add"      | 5       | 15             |
      | 10     | "subtract" | 5       | 5              |
      | 10     | "add"      | 5       | 15             |
      | 10     | "subtract" | 5       | 5              |