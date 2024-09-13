package stepdefination;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTableExample {

	WebDriver driver;

	@Given("User successfully navigate to url")
	public void user_successfully_navigate_to_url(DataTable urlDetails) {
		List<String> listString = urlDetails.row(0);
		String  url = "";
		for (String s : listString)
		{
			url += s + "\t";
		}
		System.out.println(url);
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}

	@Given("Title of the page should displayed")
	public void title_of_the_page_should_displayed() {
		String amazonPageTitle = driver.getTitle();
		System.out.println("the title of the page is :" + amazonPageTitle);
	}

	@When("User search for the Product as productName at search text box")
	public void user_search_for_the_product_as_product_name_at_search_text_box(DataTable productName) throws InterruptedException {
		List<String> product = productName.row(0);
		String  productDetails = "";
		for (String s : product)
		{
			productDetails += s + "\t";
		}
		System.out.println(productDetails);
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(productDetails);
		Thread.sleep(5000);
	

	}

	@When("Click on the Search Button")
	public void click_on_the_search_button() {
		WebElement searchBtn = driver.findElement(By.xpath("//input[@value='Go']"));
		searchBtn.click();
	}

	@Then("User can be able to Verify the result")
	public void user_can_be_able_to_verify_the_result() {
		WebElement result = driver.findElement(By.xpath("//span[contains(text(),'results for')]"));
		boolean isResultDisplay = result.isDisplayed();
		System.out.println("the result is displayed:"+isResultDisplay);

	}

	@Then("User successfully close browser")
	public void user_successfully_close_browser() {
		driver.quit();
	}

}
