package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithExample {
	
	WebDriver driver;
	
	@Given("User successfully opened {string}")
	public void user_successfully_opened(String url) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	    
	}
	@Given("Title of the page should available")
	public void title_of_the_page_should_available() {
		String amazonPageTitle = driver.getTitle();
		System.out.println("the title of the page is :" + amazonPageTitle);
	    
	}
	@When("User search for the Product for {string}")
	public void user_search_for_the_product_for(String productName) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(productName);
		Thread.sleep(5000);
	   
	}
	@When("Click on the SearchBtn")
	public void click_on_the_search_btn() {
		WebElement searchBtn = driver.findElement(By.xpath("//input[@value='Go']"));
		searchBtn.click();
	   
	}
	@Then("User can able to Verify the result")
	public void user_can_able_to_verify_the_result() {
		WebElement result = driver.findElement(By.xpath("//span[contains(text(),'results for')]"));
		boolean isResultDisplay = result.isDisplayed();
		System.out.println("the result is displayed."+isResultDisplay);
	
	}

}
