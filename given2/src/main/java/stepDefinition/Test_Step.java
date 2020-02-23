package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Test_Step {
	
	//ChromeDriver driver=new ChromeDriver(); 
	@Given("^un internaute se connecter au site$")
	public void un_internaute_se_connecter_au_site() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:/Users/saber/Desktop/selenuim/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver(); 
	   driver.navigate().to("https://the-internet.herokuapp.com/login");
	   driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS );
	}

	@When("^il se positionner au niveau de formulaire$")
	public void il_se_positionner_au_niveau_de_formulaire() throws Throwable {
		//System.setProperty("webdriver.chrome.driver","C:/Users/saber/Desktop/Formation selenuim/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		Assert.assertTrue(driver.getTitle().contains("The Internet"));
	   
	}

	@When("^il remplir ses identifiants \"([^\"]*)\" et \"([^\"]*)\"$")
	public void il_remplir_ses_identifiants_et(String username, String password) throws Throwable {
		//System.setProperty("webdriver.chrome.driver","C:/Users/saber/Desktop/Formation selenuim/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		WebElement usernameTxtBox = driver.findElement(By.id("username"));
	  usernameTxtBox.sendKeys(username);
	  WebElement passwordTextBox = driver.findElement(By.id("password"));
	  passwordTextBox.sendKeys(password);
	  WebElement loginBtn = driver.findElement(By.className("radius"));
	  loginBtn.click();
	}

	@Then("^le formualire est bien transmis$")
	public void le_formualire_est_bien_transmis() throws Throwable {
		//System.setProperty("webdriver.chrome.driver","C:/Users/saber/Desktop/Formation selenuim/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		WebElement secureHeader=driver.findElement(By.xpath("//*[@id=\"content\"]/div/h2"));
	   Assert.assertTrue(secureHeader.isDisplayed());
	}
	


	
}
