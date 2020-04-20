package com.TryCloud.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/TryCloud/step_definitions",
        dryRun = false,
        tags = "@Gallery",
        plugin = {"html:target/default-cucumber-reports"}


)
public class CucumberRunners {





}
