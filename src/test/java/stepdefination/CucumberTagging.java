package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberTagging {
	WebDriver driver;

	
	@Given("User Successfully logged in with {string}")
	public void user_successfully_logged_in_with(String url) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	@Then("User is validate the title of the page")
	public void user_is_validate_the_title_of_the_page() {
		String amazonPageTitle = driver.getTitle();
		System.out.println("the title of the page is :" + amazonPageTitle);
	}
	
	@When("User search for Product with {string}")
	public void user_search_for_product_with(String productName) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(productName);
		Thread.sleep(5000);
	}
	
	@When("Click on the search button verify that the result display")
	public void click_on_the_search_button() {
		WebElement searchBtn = driver.findElement(By.xpath("//input[@value='Go']"));
		searchBtn.click();
		WebElement result = driver.findElement(By.xpath("//span[contains(text(),'results for')]"));
		boolean isResultDisplay = result.isDisplayed();
		System.out.println("the result is displayed :" + isResultDisplay);
	}
	
	
	@Then("User successfully close the browser")
	public void user_successfully_close_the_browser() {
	   driver.quit();
	}



	
}
