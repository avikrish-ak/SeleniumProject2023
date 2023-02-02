package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Program01 {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");

	}

}
