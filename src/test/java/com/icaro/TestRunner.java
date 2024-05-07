package com.icaro;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",
    glue="com/icaro/stepdefinitios",
    tags = "@validData",  // тут меняем название теста из файла .feature
    plugin = {"pretty","json:build/cucumber-report/cucumber.json"})
public class TestRunner {

}
