package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program01 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//div[@id='msdd']")).click();
		driver.findElement(By.xpath("//a[text()='Arabic']")).click();
		driver.findElement(By.xpath("//a[text()='Dutch']")).click();
		driver.findElement(By.xpath("//a[text()='Danish']")).click();
	}

}
