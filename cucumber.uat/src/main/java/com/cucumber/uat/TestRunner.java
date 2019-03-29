package com.cucumber.uat;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\sanze\\eclipse-workspace\\cucumber.uat\\src\\test\\java\\feature", //the path of the feature files
        glue= {"stepdefinition"}, //the path of the step definition files
        monochrome = true,plugin = {"pretty", "html:target/cucumber-reports/cucumber-html-report", "json:target/cucumber-reports/cucumber-json-report.json", "junit:target/cucumber-reports/Cucumber.xml" },
        dryRun=false //to check the mapping is proper between feature file and step def file
        //tags = {"~@SmokeTest", "~@RegressionTest", "~@End2End"}
     //   tags = {"@Login"} //only runs the scenario listed in tag
        )
public class TestRunner {

}
