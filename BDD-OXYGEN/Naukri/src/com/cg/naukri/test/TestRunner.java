package com.cg.naukri.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"Features"},
		glue={"com.cg.naukri.stepDefinitions"},
		tags= {"@naukri"}
		)
public class TestRunner {

}
