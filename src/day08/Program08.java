package day08;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Program08 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Select dropDown = new Select(driver.findElement(By.xpath("//select[@title='Search in']")));
		dropDown.selectByValue("search-alias=stripbooks");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Selenium Java"+Keys.ENTER);
		driver.findElement(By.xpath("//span[text()='Selenium with Java – A Beginner’s Guide: Web Browser Automation for Testing using Selenium with Java']")).click();

		Set<String> windowIds = driver.getWindowHandles();
		String parentWindowId = driver.getWindowHandle();
		for(String id:windowIds)
		{
			driver.switchTo().window(id);
			if(driver.getTitle().contains("Selenium with Java"))
			{
				Select dropQty= new Select(driver.findElement(By.xpath("//select[@name='quantity']")));
				dropQty.selectByValue("6");
				driver.findElement(By.id("add-to-cart-button")).click();
			}
		}

		driver.switchTo().window(parentWindowId);
		driver.findElement(By.xpath("//span[text()='Selenium WebDriver 3 Practical Guide: End-to-end automation testing for web and mobile browsers with Selenium WebDriver, 2nd Edition']")).click();

	}

}

