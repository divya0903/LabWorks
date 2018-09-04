package com.cg.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"Features"},
		glue={"com.cg.stepDefinitions"},
		tags= {"@login"}
		)
public class TestRunner {

}
