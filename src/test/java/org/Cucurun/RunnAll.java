package org.Cucurun;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\FeatureFile\\AustraliaProject.feature", glue = "org.AustraliaProject",dryRun = false, 
				strict= false , plugin = {
		"html:C:\\Users\\santhoshkumar p\\Downloads\\karthik java testing\\SampleCucumber\\Reports\\htmlReport",
		"json:C:\\Users\\santhoshkumar p\\Downloads\\karthik java testing\\SampleCucumber\\Reports\\jsonReport\\aus.json",
		"junit:C:\\Users\\santhoshkumar p\\Downloads\\karthik java testing\\SampleCucumber\\Reports\\xmlReport\\aus.xml" ,
		
		
		})
public class RunnAll {
	@AfterClass
	public static void afterAllScenario() {
		JvmReport.generateJvmReport(
				"C:\\Users\\santhoshkumar p\\Downloads\\karthik java testing\\SampleCucumber\\Reports\\jsonReport\\aus.json");
	}
}
