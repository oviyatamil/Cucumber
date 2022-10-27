package org.stepdefinition;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public static WebDriver driver;
	public static WebDriver browserlaunch(String bname) {
		if(bname.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(bname.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
	    }
		else if(bname.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
	    }
		return driver;
		
	}
	public static void urllaunch(String url) {
		driver.get(url);

	}
	public static void sendkeys(WebElement e,String value) {
		e.sendKeys(value);
	}
	public static void click (WebElement findElement2) {
		findElement2.click();
	}
	public static void selectbyindex(WebElement e,int index) {
		Select s = new Select(e);
		s.selectByIndex(index);
	}
	public static String getcurrenturl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
		
	}
	public static String getAttribute(WebElement e){
		String attribute = e.getAttribute("value");
		return attribute;
	}
	public static void clear(WebElement c) {
		c.clear();

	}
	public static String getText(WebElement e) {
		String text = e.getText();
		return text;
		
	}
	public static List<String> product() {
			
		List<WebElement> product = driver.findElements(By.xpath("(//div[@class='_4rR01T'])"));
		List<String> li = new ArrayList<String>();
		for(int i=1;i<product.size();i++) {
			WebElement webElement = product.get(i);
			String text = webElement.getText(); 
			li.add(text);
			
		}
		System.out.println(li);
		return li;
					
		
	}
	
	public static List<String> price() {
		List<WebElement> price = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		List<String> l = new LinkedList<String>();
		for (int i = 1; i < price.size(); i++) {

			WebElement element = price.get(i);
			String text1 = element.getText();
			l.add(text1);

		}
		System.out.println(l);
		return l;
	}
	public static void screenshot(String image) throws IOException {
		TakesScreenshot t =(TakesScreenshot)driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File des = new File(System.getProperty("user.dir")+"\\src\\\\test\\resources\\Screenshots\\"+image+".png");
		FileUtils.copyFile(src, des);
	}
		
}


