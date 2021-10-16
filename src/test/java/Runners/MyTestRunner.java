package Runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src\\main\\java\\features"},
		glue = {"stepDefinitions"},
		plugin = {"pretty"
		},
		publish = true,
		monochrome = true
		)



public class MyTestRunner {


}
