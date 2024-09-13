package stepdefination;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberWithMap {
	WebDriver driver;
	
	@Given("User successfully navigate to amazon url")
	public void user_successfully_navigate_to_amazon_url(DataTable urlDetails) {
		for(Map<String,String> listString : urlDetails.asMaps(String.class, String.class)) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(listString.get("UrlName"));
		}
	}
	@Given("Amazon page title should displayed")
	public void amazon_page_title_should_displayed() {
		String amazonPageTitle = driver.getTitle();
		System.out.println("the title of the page is :" + amazonPageTitle);
	}
	@When("User looking for the Product as productName at search txt box")
	public void user_looking_for_the_product_as_product_name_at_search_txt_box(DataTable productName) throws InterruptedException {
		for(Map<String,String> products : productName.asMaps(String.class,String.class)) {
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(products.get("ProductName"));
		Thread.sleep(5000);
		}
	}
	@When("User click on the Search button")
	public void user_click_on_the_search_button() {
		WebElement searchBtn = driver.findElement(By.xpath("//input[@value='Go']"));
		searchBtn.click();
	}
	@Then("User should navigate to the result page")
	public void user_should_navigate_to_the_result_page() {
		WebElement result = driver.findElement(By.xpath("//span[contains(text(),'results for')]"));
		boolean isResultDisplay = result.isDisplayed();
		System.out.println("the result is displayed:"+isResultDisplay);
	}
	@Then("Browser closed successfully")
	public void browser_closed_successfully() {
		System.out.println("Chrome browser closed successfully.");
		driver.quit();
	}


}
