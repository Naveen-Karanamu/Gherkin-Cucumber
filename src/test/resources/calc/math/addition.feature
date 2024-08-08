@calculator
Feature: Calculator Functionality - Add

  @add @imp
  Scenario: Adding two numbers
    Given I have entered the number 10 into the calculator
    When I press the "add" button
    And I have entered another number 5 into the calculator
    Then the result displayed should be 15