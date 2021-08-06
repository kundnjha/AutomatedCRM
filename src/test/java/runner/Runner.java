package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features =
"C:\\Users\\Kundan\\workspace\\AutomatedCRM\\src\\test\\resource\\features\\Dashboard.feature",
glue={"C:\\Users\\Kundan\\workspace\\AutomatedCRM\\src\\test\\java\\stepDefinition\\DashboardStepDef.java"}

		)

public class Runner {




}
