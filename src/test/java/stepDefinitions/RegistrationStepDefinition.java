package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class RegistrationStepDefinition {
	


	WebDriver driver;
	Select sc;

	
@Given("user is on the facebook homepage")
public void user_is_on_the_facebook_homepage() throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishw\\Desktop\\desktop\\Study Material\\SeleniumJar\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
}

@Then("user clicks on the create new account")
public void user_clicks_on_the_create_new_account() throws InterruptedException {

	driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	Thread.sleep(1000);
	
}


	@Then("a new model shows up")
	public void a_new_model_shows_up() {
	
	}
	

	@Then("user enters {string} in fname")
	public void user_enters_in_fname(String fname) {

		driver.findElement(By.name("firstname")).sendKeys(fname);
		
	}

	@Then("user enters {string} in lname")
	public void user_enters_in_lname(String lname) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.name("lastname")).sendKeys(lname);
	}

	@Then("user enters {string} in email")
	public void user_enters_in_email(String string) throws InterruptedException {
	    
		Thread.sleep(2000);
		driver.findElement(By.name("reg_email__")).sendKeys(string);
		
		
	}

	@Then("user enters {string} in password")
	public void user_enters_in_password(String string) throws InterruptedException {

		Thread.sleep(2000);
		driver.findElement(By.name("reg_passwd__")).sendKeys(string);
		
	}

	@Then("user selects {string} as a day of birth")
	public void user_selects_as_a_day_of_birth(String string) throws InterruptedException {
		Thread.sleep(2000);
		sc = new Select(driver.findElement(By.id("day")));
		sc.selectByVisibleText(string);
	}

	@Then("user selects {string} as a month of bith")
	public void user_selects_as_a_month_of_bith(String string) throws InterruptedException {
	
		Thread.sleep(2000);
		sc = new Select(driver.findElement(By.id("month")));
		sc.selectByVisibleText(string);
	
	}

	@Then("user selects {string} as a year of birth")
	public void user_selects_as_a_year_of_birth(String string) throws InterruptedException {
		
		Thread.sleep(2000);
		sc = new Select(driver.findElement(By.id("year")));
		sc.selectByVisibleText(string);
		
		
	}

	@Then("user selects {string} as a gender")
	public void user_selects_as_a_gender(String string) throws InterruptedException {
		Thread.sleep(1000);
		
		if(string.equalsIgnoreCase("Female")) {
			
			driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
			
		}
		else if(string.equals("Male")) {
			

			driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
			
		}
		else {
	
			driver.findElement(By.xpath("(//input[@type='radio'])[3]")).click();		
		}
		
	}

	@Then("user clicks the sign up button.")
	public void user_clicks_the_sign_up_button() throws InterruptedException {
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		Thread.sleep(10000);
		driver.quit();
		
	}
	
	
	
}
