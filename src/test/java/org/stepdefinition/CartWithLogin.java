package org.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.*;
import junit.framework.Assert;

public class CartWithLogin extends Baseclass {
	@Given("The user should be in home page")
	public void the_user_should_be_in_home_page() throws InterruptedException {
		browserlaunch("chrome");
		driver.get("https://ahioma.com/");
		String url = driver.getCurrentUrl();
		Assert.assertTrue(url.contains("ahioma"));
		Thread.sleep(5000); 
	}

	@Then("The user must be in login page")
	public void the_user_must_be_in_login_page() {
	   String url = driver.getCurrentUrl();
	   boolean log = url.contains("https://ahioma.com/Login");
	   System.out.println(log);
	}

	@When("The user must login")
	public void the_user_must_login() throws InterruptedException {
		WebElement user = driver.findElement(By.xpath("//input[@type='email']"));
		sendkeys(user, "oviyanidhiece@gmail.com");
		WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
		sendkeys(pwd, "Thiya275#");
		WebElement login = driver.findElement(By.xpath("(//button[@type='submit'])[4]"));

		Thread.sleep(5000);
	}

	@Then("The user must be in account page")
	public void the_user_must_be_in_account_page() throws InterruptedException {
	   String currentUrl = driver.getCurrentUrl();
	   boolean acc = currentUrl.contains("https://ahioma.com/User/Account");
	   System.out.println(acc);
	   Thread.sleep(5000);
	}


	@When("The user must click {string} button")
	public void the_user_must_click_button(String string) throws InterruptedException {
		WebElement home = driver.findElement(By.xpath("//span[contains(text(),'Home')]"));
		if(home.getText().equals("Home")) {
			click(home);	
		}
		else {
			WebElement cart = driver.findElement(By.xpath("//a[contains(text(),'Back to My Cart') or @class='btn btn-warning']"));
			click(cart);
		}
		
		Thread.sleep(5000);
	}

	@Then("The user must be in home page")
	public void the_user_must_be_in_home_page() throws InterruptedException {
		String url = driver.getCurrentUrl();
		boolean contains = url.contains("ahioma");
		System.out.println(contains);
		Assert.assertTrue(url.contains("ahioma"));
		Thread.sleep(5000);
	}
	@Given("The user must increase the quantity of product")
	public void the_user_must_increase_the_quantity_of_product() {
	   WebElement plus = driver.findElement(By.xpath("//span[@class='plus']"));
	   click(plus);
	}

	@Then("The quantity must be increased")
	public void the_quantity_must_be_increased() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String url = driver.getCurrentUrl();
	    if(url.contains("ProductDetails")) {
	    	WebElement quantity = driver.findElement(By.xpath("//input[@name='quantity']"));
	    	String text = quantity.getAttribute("value");
	    	if(Integer.parseInt(text)>1) {
	    		System.out.println("Quantity is increased");
	    	}
	    }
	    	else { 
	    	    WebElement quantity2 = driver.findElement(By.xpath("//input[@name='quantity']"));
	    	    String attribute = quantity2.getAttribute("value");
	    	    boolean contains = attribute.contains("MyCart");
	    	    System.out.println(contains);
	    }
	    	
	    }
	}


