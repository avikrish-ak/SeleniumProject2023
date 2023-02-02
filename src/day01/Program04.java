package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Program04 {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new InternetExplorerDriver();
		driver.get("https://demo.automationtesting.in/Register.html");

	}

}
