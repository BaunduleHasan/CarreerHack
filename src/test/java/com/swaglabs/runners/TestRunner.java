package com.swaglabs.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "Features", glue = "com.swaglabs.steps")

public class TestRunner extends AbstractTestNGCucumberTests {

}
