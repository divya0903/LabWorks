package com.cg.redbus.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"Features"},
		glue={"com.cg.redbus.stepDefinitions"},
		tags= {"@redbus"}
		)
public class TestRunner {

}
