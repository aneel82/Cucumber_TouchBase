package stepdefination;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberHooks {
	WebDriver driver;
	
@Before
@Given("User launch the browser and navigate to the {string}")
public void user_launch_the_browser_and_navigate_to_the(String url) {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(url);
}

@When("User enter {string} into a search text box")
public void user_enter_into_a_search_text_box(String productName) throws InterruptedException {
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(productName);
	Thread.sleep(5000);
}

@When("User click on the search button")
public void user_click_on_the_search_button() {
	WebElement searchBtn = driver.findElement(By.xpath("//input[@value='Go']"));
	searchBtn.click();
}

@When("User verify that system should navigate to the result page")
public void user_verify_that_system_should_navigate_to_the_result_page() {
	WebElement result = driver.findElement(By.xpath("//span[contains(text(),'results for')]"));
	boolean isResultDisplay = result.isDisplayed();
	System.out.println("the result is displayed :"+isResultDisplay);
}

@Then("User verify the page title")
public void user_verify_the_page_title() {
	System.out.println("the title of the page is:"+driver.getTitle());
}

@After
@Then("User quit the browser")
public void user_quit_the_browser() {
	driver.quit();
}


}
