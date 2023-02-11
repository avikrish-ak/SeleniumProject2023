package day07;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program01 {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		List<WebElement> headerList= driver.findElements(By.xpath("//table[@class='dataTable']//th"));

		for(WebElement x:headerList)
		{
			System.out.println(x.getText());
		}

		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

		List<WebElement> companyList= driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr//td[1]"));

		for(WebElement x:companyList)
		{
			System.out.println(x.getText());
		}

		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

		List<WebElement> perPriceList= driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr//td[3]"));

		for(WebElement x:perPriceList)
		{
			System.out.println(x.getText());
		}

	}

}
