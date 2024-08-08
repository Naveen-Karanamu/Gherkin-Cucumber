package calc;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.junit.jupiter.api.Assertions.assertEquals;;

public class StepDefinitions {

    private int currentNumber = 0;

    private int result = 0;

    private String operation = "";

    @Given("I have entered the number {int} into the calculator")
    public void i_have_entered_the_number_into_the_calculator(int number) {
        currentNumber = number;
    }

    @When("I press the {string} button")
    public void i_press_the_operation_button(String op) {
        operation = op;
    }

    @And("I have entered another number {int} into the calculator")
    public void i_have_entered_another_number_into_the_calculator(int number) {
        if(operation.equals("add")) {
            result = currentNumber + number;
        }
        else if(operation.equals("subtract")) {
            result = currentNumber - number;
        }
    }

    @Then("the result displayed should be {int}")
    public void the_result_displayed_should_be(int expectedResult) {
        assertEquals(expectedResult, result);
    }

    @Before
    public void setUp(){
        //code to initialize the calculator
        System.out.println("Starting the Calculator");
    }

    @After
    public void tearDown(){
        //code to shut down the calculator
        System.out.println("Stopping the Calculator");
    }
}
