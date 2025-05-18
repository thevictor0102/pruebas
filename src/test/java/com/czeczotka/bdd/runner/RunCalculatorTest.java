package com.czeczotka.bdd.runner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:cucumber/calculator.feature" ,
		glue = "com.czeczotka.bdd.steps",
		monochrome = true,
        plugin = "json:target/cucumber-json-report.json"
)
public class RunCalculatorTest {
}
