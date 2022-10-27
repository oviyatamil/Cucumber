package org.stepdefinition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Jvm {
public static void main(String[] args) {
	System.out.println(System.getProperty("user.dir")+"\\src\\test");
}
public static void  jvmreport(String json) {
	File f = new File(System.getProperty("user.dir")+"src\\test\\resources\\Reports\\jvmreport.html");
	Configuration c = new Configuration(f, "ahioma");
	List<String> l = new ArrayList<>();
	l.add(json);
	ReportBuilder r = new ReportBuilder(l, c);
	r.generateReports();
	
}
}
