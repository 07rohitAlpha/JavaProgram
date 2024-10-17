package Task;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;

import com.aventstack.extentreports.util.Assert;





public class Inter3 {

	
	public void browser() {
	// opening and close the browser
	WebDriver driver = (WebDriver) new ChromeDriver();
	driver.get("www.example");
	driver.quit();
	driver.close();
	
	//Navigation
	driver.navigate().to("www.newsite.com");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	
	//Element Interaction
	driver.findElement(By.id("username")).sendKeys("testuser");// Enter text
	driver.findElement(By.name("submit")).click();// click a button
	driver.findElement(By.linkText("Home")).click();
	driver.findElement(By.xpath("//div[@class='massage']")).getText();
	
	//Window and Frame Handling
	
	driver.switchTo().window("windowName"); // switch to a specific window
	driver.switchTo().frame("frameid"); // switch to a frame
	driver.switchTo().defaultContent();// switch back to the main content
	
	//Browser Management 
	
	driver.manage().window().maximize(); // maximize the browser window
	driver.manage().window().fullscreen();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); // set implicit wait
	
	// Mouse and Keyboard Actions
	Actions actions = new Actions(driver);
	actions.moveToElement(element).click().build().perform();// Move to and click
	actions.doubleClick(element).perform(); // Double-click
	WebElement drag = driver.findElement(By.xpath("asg"));
	WebElement drop = driver.findElement(By.xpath("axfgs"));
	actions.dragAndDrop(drag, drop);
	
	// Assertions
	Assert.assertTrue(element.isDisplayed());
	Assert.assertEquals(driver.getTitle(), "ExpectedTile");
	
	// Explicit Wait 
	WebDriverWait wait = new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.elementToBeClickable(element));// explicit wait
	
	// Implicit Wait
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	// Fluent Wait 
	FluentWait wait = new FluentWait(driver);
	
	// Specify the timeout of the wait
	wait.withTimeout(5000,TimeUnit.MILLISECONDS);	
	//Specify polling time 
	wait.pollingEvery(250.TimeUnit.MILLISECONDS);
	// Specify what exceptions to ignore
	wait.ignoring(NoSuchElementException.class)
	// This is how we specify the condition to wait on
	wait.until(ExceptedConditions.alertsPresent());

	// Alerts
	
	Alert alert = driver.switchTo().alert();
	alert.accept();
	
	}	
}





























