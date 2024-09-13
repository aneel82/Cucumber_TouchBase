package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs {
	WebDriver driver;
	
	
	
	@Given("User successfully opened Amazon website")
	public void user_successfully_opened_amazon_website() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.in");  
	}
	
	@Given("Title of the page should display")
	public void title_of_the_page_should_display() {
	    String amazonPageTitle = driver.getTitle();
	    System.out.println("the title of the page is :"+amazonPageTitle);
	}
	@When("User search for the Product")
	public void user_search_for_the_product() throws Exception {
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Laptops");
		Thread.sleep(5000);
	}
	@When("Click on the Search button")
	public void click_on_the_search_button() {
		WebElement searchBtn = driver.findElement(By.xpath("//input[@value='Go']"));
		searchBtn.click();
		
	  
	}
	@Then("User can able to see result")
	public void user_can_able_to_see_result() {
		WebElement result = driver.findElement(By.xpath("//span[contains(text(),'results for')]"));
		boolean isResultDisplay = result.isDisplayed();
		System.out.println("the result is displayed.");
	 
	}

}
