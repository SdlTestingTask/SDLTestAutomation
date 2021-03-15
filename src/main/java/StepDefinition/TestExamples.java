package StepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Selenium\\New folder\\chromedriver.exe");// here we need to give chrome driver path
		
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
		
		driver.findElement(By.xpath("//a[contains(@class, 'x-btn') and count(*//text()[.='Projects']) > 0]")).click();
		
	}
	
	@Then("^user click on the New Project button$")
	public void user_click_on_the_New_Project_button() {
		
		driver.findElement(By.xpath("//a[contains(@class, 'x-btn') and count(*//text()[.='New Project']) > 0]")).click();
		
	}
	
	@Then("^select general details$")
	public void select_general_details() {
		
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
        driver.findElement(By.xpath("//input[@name='name']")).sendKeys("New Test Projects");
		
        WebElement element = driver.findElement(By.xpath("//input[@name='location'] [@placeholder='Select a location']/../following-sibling::div"));
		
        JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
        
		driver.findElement(By.xpath("//li[text()='HP']")).click();
		
		driver.findElement(By.xpath("//input[@name='projectSourceLanguage']/../following-sibling::div")).click();
		
	    driver.findElement(By.xpath("//i[@data-qtip='en-us']/..")).click();
		
		driver.findElement(By.xpath("//span[text()='Target Languages']/../../following-sibling::div[1]/div/div[2]")).click();
	   
		driver.findElement(By.xpath("//i[@data-qtip='ur-IN']/..")).click();
		
		driver.findElement(By.xpath("//span[text()='File Type Configuration']/../../following-sibling::div[1]/div/div[2]")).click();
	    
		
		List<WebElement> ele = driver.findElements(By.xpath("//div[text()='Filter']/parent::div/parent::ul[@class='x-list-plain']/li"));
																																																											
		WebElement element_1 = ele.get(1);
		element_1.click();
		
		driver.findElement(By.xpath("//span[@class='x-btn-wrap x-btn-wrap-link-medium ']/following-sibling::input")).sendKeys("C:\\Users\\Anand\\Desktop\\AnandBackup\\SDL\\version.txt");// we need to give path to browse a file this text file is available in project so you can give that file path
		
		driver.findElement(By.xpath("//span[text()='Next']/../../..")).click();
		
		
		}
	
	@Then("^select the translate engine$")
	public void select_the_translate_engine() {
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//span[text()='Translation Engine'][@class='x-form-item-label-text']/../../following-sibling::div/div/div[2]")).click();
	
		driver.findElement(By.xpath("//div[contains(text(),'HP_TranslationEngine')]/..")).click();
		
		WebElement ele_1 = driver.findElement(By.xpath("//span[text()='Next']/../../.."));
		JavascriptExecutor exe = (JavascriptExecutor)driver;
		exe.executeScript("arguments[0].click();", ele_1);
		
		
	}
	
	@Then("^select the pricing model$")
	public void select_the_pricing_model() {
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
        driver.findElement(By.xpath("//span[text()='Pricing Model'][@class='x-form-item-label-text']/../../following-sibling::div[1]/div/div[2]")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'root pricing model')]/..")).click();
		
		driver.findElement(By.xpath("//span[text()='Next']/../../..")).click();
	}
	
	@Then("^select the workflow$")
	public void select_the_workflow() throws InterruptedException {
		
        driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
        driver.findElement(By.xpath("//span[text()='Workflow'][@class='x-form-item-label-text']/../../following-sibling::div/div/div[2]")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'WF-4_CP_2Languages')]/..")).click();
		
		driver.findElement(By.xpath("//span[text()='Create & Start']/../../..")).click();
		Thread.sleep(5000);
		
		
	}
	
	@And("^user stop the test$")
	public void user_stop_the_test() {
		
		driver.quit();
		
	}
	
	
	
}
	
	


