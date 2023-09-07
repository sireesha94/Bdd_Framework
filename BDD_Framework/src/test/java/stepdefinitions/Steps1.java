package stepdefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import methodobjects.MethodData;

public class Steps1 {
	
	Integer x; 
	Integer y;
	public Integer facing;
    MethodData md;
    
@Given("a.Write a test for Rover direction facing and positioning initialisation")
public void a_write_a_test_for_rover_direction_facing_and_positioning_initialisation() {
	md = new MethodData(0,0,1);
	md.process("");
	//md.printPosition();
	Assert.assertEquals(md.printPosition(),"0 0 N");
}


@When("b.	Write A test for moving the rover x and y position and location")
public void b_write_a_test_for_moving_the_rover_x_and_y_position_and_location() {
	md = new MethodData(0,0,1);
	md.process("M");
	//md.printPosition();
	Assert.assertEquals(md.printPosition(),"0 1 N");
}


@Then("c.Write a test to move the rover as per the given scenario problem, given input")
public void c_write_a_test_to_move_the_rover_as_per_the_given_scenario_problem_given_input() {
	md = new MethodData(1,2,1);
	md.process("LMLMLMLMM");
	//md.printPosition();
	Assert.assertEquals(md.printPosition(), "1 3 N");
}

}
