package stepDefs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserLoginStepDef {
	WebDriver driver;
	@Given("User is on Login Page")
	public void user_is_on_login_page(){
		driver= new ChromeDriver();
		driver.manage().window().maximize();
	}
//	@When("User enters {string} and {string}")
//	public void user_enters_credentials(String strUser, String strPwd) {
//		driver.get("http://the-internet.herokuapp.com/login");
//		driver.findElement(By.id("username")).sendKeys("strUser");
//		driver.findElement(By.name("password")).sendKeys("strPwd");
//		driver.findElement(By.cssSelector("i.fa.fa-2x.fa-sign-in")).click();
//	}
	@When("User enters credentials")
	public void user_enters_credentials(DataTable userCred) {
		driver.get("http://the-internet.herokuapp.com/login");
		//user1 -id, pwd
		//user2 - id, pwd
		
		List<List<String>> data = userCred.asLists();
		data.get(0).get(0);
		String strUser = data.get(0).get(0);
		String strPwd = data.get(0).get(1);
		driver.findElement(By.id("username")).sendKeys(strUser);
		driver.findElement(By.name("password")).sendKeys(strPwd);
		driver.findElement(By.cssSelector("i.fa.fa-2x.fa-sign-in")).click();
	}
	@Then("Should display Success Msg")
	public void should_display_success_msg() {
		boolean isDisp= driver.findElement(By.cssSelector("div.flash.success")).isDisplayed();
		Assert.assertTrue(isDisp);
	}
		
	

}
