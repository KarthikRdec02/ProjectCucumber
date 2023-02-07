package org.Cucurun;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="@FailedScenario\\Failed.txt",glue="org.Samplecucu",
plugin= {"C:\\Users\\santhoshkumar p\\Downloads\\karthik java testing\\SampleCucumber\\FailedScenario\\Failed.txt"})
public class ReturnFailedScenaeio {

}
