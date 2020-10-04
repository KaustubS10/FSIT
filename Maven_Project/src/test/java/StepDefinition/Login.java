package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {

	WebDriver webdriver;
@Before
public void bt() {
	System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");	
	webdriver=new ChromeDriver();
	webdriver.manage().window().maximize();
}
@After
public void at() throws InterruptedException {
	Thread.sleep(5000);
	webdriver.close();
}
@Given("I am able to navigate to login")
public void i_am_able_to_navigate_to_login() {
	webdriver.get("https://opensource-demo.orangehrmlive.com");
}
@When("i update username as {string}")
public void i_update_username_as(String string) {
	webdriver.findElement(By.name("txtUsername")).click();
	webdriver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys(string);
	
}
@When("i update the password as {string}")
public void i_update_the_password_as(String string) {
	webdriver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys(string);
	
}
@When("i click on the login button")
public void i_click_on_the_login_button() {
	webdriver.findElement(By.name("Submit")).click();
}
@Then("i should see the user name as {string}")
public void i_should_see_the_user_name_as(String string) throws InterruptedException {
	String expected = webdriver.findElement(By.id("welcome")).getText();
Assert.assertEquals(expected, string);	
webdriver.findElement(By.id("welcome")).click();
Thread.sleep(6000);
webdriver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
}

@Then("i should see the error message as {string}")
public void i_should_see_the_error_message_as(String string) {
	String expected = webdriver.findElement(By.xpath("//*[@id='spanMessage']")).getText();
	Assert.assertEquals(expected, string);	
}



}
