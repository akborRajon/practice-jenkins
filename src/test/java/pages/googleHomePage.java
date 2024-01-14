
package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;

public class googleHomePage {
    
	WebDriver driver;
	public googleHomePage(WebDriver dr) {
		
		driver= dr;
		PageFactory.initElements(driver, this);
			
		}
	@FindBy(id="APjFqb")
	WebElement searchBar;
	
	@FindBy(name="btnK")
	WebElement searchButton;
	
	@FindBy(id="result-stats")
	WebElement searchResult;
	
	public void enterProductName(String product) {
		searchBar.sendKeys(product);
		
	}
	public void clickOnSearchButton() {
		searchButton.click();
		
	}
	public boolean verifySearchResults() {
		return searchResult.isDisplayed();
	}
	
	
	
	}

