package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import common.googleBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.googleHomePage;

public class searchingproducts extends googleBase {
	
	
	googleHomePage gp;

	@Given("i am on the google page")
	public void i_am_on_the_google_page() {
	 
		launchBrowser();
	}

	@When("i enter the {string} in the search bar")
	public void i_enter_the_in_the_search_bar(String string) {
	    	
	gp = new googleHomePage(driver);
	gp.enterProductName(string);
	}

	
	
	@When("i click on the search button")
	public void i_click_on_the_search_button() {
		gp= new googleHomePage(driver);
		gp.clickOnSearchButton();
		   
	}

	@Then("i can see the search result successfully")
	public void i_can_see_the_search_result_successfully() {
	  
		gp= new googleHomePage(driver);
		
		Assert.assertTrue(gp.verifySearchResults());
		
		
		driver.close();//will close current browser
		driver.quit();//will close all pages
		
	}

}


