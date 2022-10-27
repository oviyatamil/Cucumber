package org.ecom;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdefinition.Jvm;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",glue="org.stepdefinition",dryRun =false,tags= {"@nil"},
      plugin= {"html:src\\test\\resources\\Reports\\Htmlreport","json:src\\test\\resources\\Reports\\Json report\\jsonreport.json",
    		  "rerun:src\\test\\resources\\failedcase\\failed.txt"})
public class TestRunner {
	@AfterClass
	public static void report() {
		Jvm.jvmreport("src\\test\\resources\\Reports\\Json report\\jsonreport.json");

	}
	
 
}
