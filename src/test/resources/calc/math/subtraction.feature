@calculator
Feature: Calculator Functionality - Subtract

  @sub @imp
  Scenario: Subtracting two numbers
  Given I have entered the number 10 into the calculator
  When I press the "subtract" button
  And I have entered another number 5 into the calculator
  Then the result displayed should be 5