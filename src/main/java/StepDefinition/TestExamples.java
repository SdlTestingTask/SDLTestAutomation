package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;




public class TestExamples{
	
	WebDriver driver;
	
	@Given("^user is open login page$")
	public void user_is_open_login_page() {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Selenium\\New folder\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://uat-languagecloud.sdl.com/lc/login");
	}
	
	@When("^user enter username and password$")
    public void user_enter_username_and_password() {
			
		driver.findElement(By.xpath("//input[@id='1-email']")).sendKeys("admin.test.uat@sdl.testinator.com");
			
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Weaver123");
			
		driver.findElement(By.xpath("//span[@class='auth0-label-submit']")).submit();
			
		}
		
	
	@Then("^user open projects page$")
	public void user_open_projects_page() {
		
		driver.findElement(By.xpath("//div[@class='x-segmented-button sdl-nav x-box-item x-toolbar-item x-segmented-button-horizontal x-segmented-button-default']/a[3]")).click();
		
	}
	
	@Then("^user click on the New Project button$")
	public void user_click_on_the_New_Project_button() {
		
		driver.findElement(By.xpath("//div[@class='x-box-inner x-box-scroller-body-horizontal x-scroller']/div/a[7]")).click();
		
	}
	
	@Then("^select general details$")
	public void select_general_details() {
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
        driver.findElement(By.xpath("//input[@name='name']")).sendKeys("New Test Projects");
		
		WebElement element = driver.findElement(By.xpath("//div[@id='folderscombobox-1575-trigger-picker']"));
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
        
		driver.findElement(By.xpath("//ul[@id='folderscombobox-1575-picker-listEl']/ul/li[5]")).click();
		
		driver.findElement(By.xpath("//div[@id='languagescombobox-1585-trigger-picker']")).click();
		
		driver.findElement(By.xpath("//ul[@id='languagescombobox-1585-picker-listEl']/li[1]")).click();
		
		driver.findElement(By.xpath("//div[@id='languagestag-1586-trigger-picker']")).click();
		
		driver.findElement(By.xpath("//ul[@id='languagestag-1586-picker-listEl']/ul/li[539]")).click();
		
		driver.findElement(By.xpath("//div[@id='strategycombobox-1587-trigger-picker']")).click();
		
		driver.findElement(By.xpath("//div[@id='strategycombobox-1587-picker']/div[1]/ul/li[1]")).click();
		
		driver.findElement(By.xpath("//input[@id='filefield-1620-button-fileInputEl']")).sendKeys("C:\\Users\\Anand\\eclipse-workspace\\TestAutomation\\version.txt");
		
		driver.findElement(By.xpath("//a[@id='button-1646']")).click();
		
		
		
	}
	
	@Then("^select the translate engine$")
	public void select_the_translate_engine() {
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
        driver.findElement(By.xpath("//div[@id='newactioncomboboxwithfilter-1656-trigger-picker'][@class='x-form-trigger x-form-trigger-default x-form-arrow-trigger x-form-arrow-trigger-default ']")).click();
		
		driver.findElement(By.xpath("//li[@id='ext-1225']")).click();
		
		driver.findElement(By.xpath("//a[@id='button-1646']")).click();
		
		
	}
	
	@Then("^select the pricing model$")
	public void select_the_pricing_model() {
		
        driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
        driver.findElement(By.xpath("//div[@id='newactioncomboboxwithfilter-1681-trigger-picker']")).click();
		
		driver.findElement(By.xpath("//div[@id='newactioncomboboxwithfilter-1681-picker']/div[1]/ul/li[2]")).click();
		
		driver.findElement(By.xpath("//a[@id='button-1646']")).click();
	}
	
	@Then("^select the workflow$")
	public void select_the_workflow() throws InterruptedException {
		
        driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
        driver.findElement(By.xpath("//div[@id='newactioncomboboxwithfilter-1700-trigger-picker']")).click();
		
		driver.findElement(By.xpath("//div[@id='newactioncomboboxwithfilter-1700-picker']/div[1]/ul/li[1]")).click();
		
		driver.findElement(By.xpath("//span[@id='button-1663-btnInnerEl']")).click();
		Thread.sleep(2000);
		
		
	}
	
	@And("^user stop the test$")
	public void user_stop_the_test() {
		
		driver.quit();
		
	}
	
	
	
}
	
	


