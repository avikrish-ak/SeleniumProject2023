package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Program03 {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.get("https://demo.automationtesting.in/Register.html");

	}

}
