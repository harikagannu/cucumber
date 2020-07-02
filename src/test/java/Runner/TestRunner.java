package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)				
@CucumberOptions(features="C:\\Users\\harika\\workspace\\CucumberFramework\\src\\test\\java\\Features\\login.feature",
glue={"stepDefinitions"},
format={"pretty","html:test-output", "json:json_output/cucumber.json","junit:junit_xml/cucmber.xml"},//to generate different types of reporting
monochrome=true)//display the console output readable format

public class TestRunner {

}

