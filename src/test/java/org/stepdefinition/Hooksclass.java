package org.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooksclass extends Baseclass {
@Before
public void before() {
	browserlaunch("chrome");
	driver.get("https://ahioma.com/");

}
@After
public void after(Scenario s) throws IOException {
	String name = s.getName();
	screenshot("login");
//	TakesScreenshot t =(TakesScreenshot)driver;
//	t.getScreenshotAs(OutputType.FILE);
//	

}
}
