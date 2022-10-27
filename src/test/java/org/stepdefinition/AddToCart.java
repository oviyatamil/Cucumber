package org.stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.*;
import junit.framework.Assert;

public class AddToCart extends Baseclass{
	@Given("The user should be in home page and then login")
	public void the_user_should_be_in_home_page_and_then_login() throws InterruptedException {
		
		String url = driver.getCurrentUrl();
		Assert.assertTrue(url.contains("ahioma"));
		Thread.sleep(2000);
		WebElement myacc = driver.findElement(By.xpath("//a[@data-dropdown='accountSelection']"));
		click(myacc);
		WebElement user = driver.findElement(By.xpath("//input[@type='email']"));
		sendkeys(user, "oviyanidhiece@gmail.com");
		WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
		sendkeys(pwd, "Thiya275#");
		WebElement login = driver.findElement(By.xpath("(//button[@type='submit'])[4]"));
		click(login);
		WebElement home = driver.findElement(By.xpath("//span[contains(text(),'Home')]"));
		click(home);
		
	}

	@Given("The user must select a product")
	public void the_user_must_select_a_product() throws InterruptedException, AWTException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement search = driver.findElement(By.xpath("(//input[@name='searchString'])[2]"));
		sendkeys(search, "apple");
		//Thread.sleep(5000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		WebElement product = driver.findElement(By.xpath("//a[@title='Apple iPhone 7']"));
		click(product);
//		String text = product.getText();
//		Assert.assertEquals("Apple iPhone 7", product);
	}

	@When("The user must click the Addtocart option")
	public void the_user_must_click_the_Addtocart_option() {
		WebElement colour = driver.findElement(By.xpath("//span[contains(text(),'Rose Gold')]"));
		click(colour);
		WebElement size = driver.findElement(By.xpath("//span[contains(text(),'32.GB')]"));
		click(size);
		WebElement add = driver.findElement(By.xpath("//a[contains(text(),'Add to Cart')]"));
		click(add);
	}

	@Then("The addtocart option must be clicked")
	public void the_addtocart_option_must_be_clicked() {
		WebElement add = driver.findElement(By.xpath("//a[contains(text(),'Add to Cart')]"));
		boolean selected = add.isSelected();
		System.out.println(selected);
	}

	@Then("A popup menu must appear")
	public void a_popup_menu_must_appear() {
		WebElement popup = driver.findElement(By.xpath("//div[@class='dialog']"));
	String text = popup.getText();
	boolean contains = text.contains("added to cart");
	System.out.println(contains);
	}

	@Then("The view cart option must be displayed")
	public void the_view_cart_option_must_be_displayed() {
		WebElement view = driver.findElement(By.xpath("//a[contains(text(),'Add to Cart')]"));
		boolean displayed = view.isDisplayed();
		System.out.println(displayed);
	}

	@Then("The user must select the view cart option")
	public void the_user_must_select_the_view_cart_option() throws InterruptedException {
		Thread.sleep(2000);
		WebElement view = driver.findElement(By.xpath("//a[contains(text(),'View Cart')]"));
		click(view);
	boolean selected = view.isSelected();
	System.out.println(selected);
	}

	@Then("The continue shopping option must be displayed")
	public void the_continue_shopping_option_must_be_displayed() {
	    
	}

	@Then("The continue from shop option must be displayed")
	public void the_continue_from_shop_option_must_be_displayed() {
	    
	}

	


}	