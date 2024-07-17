package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.utility.JvmReportGeneration;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources" , glue="org.stepdefinition" , dryRun = false,
   plugin= {"html:target\\Reports",
		   "junit:target\\Reports\\tar.xml",
		   "json:target\\Reports\\tar.json",
		   "rerun:src\\test\\resources\\Rerun\\Failed.txt"})

//After hooks class

public class TestRunner {
       @AfterClass
       public static void pullReport() {
		JvmReportGeneration.generateJvmReport(System.getProperty("user.dir")+"\\target\\Reports\\tar.json");

	}
	
	
}
