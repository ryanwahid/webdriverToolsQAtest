package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testwiki {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.wikipedia.org");
		WebElement link;
		link = driver.findElement(By.linkText("English"));
		link.click();
		Thread.sleep(5000);
		WebElement searchBox;
		searchBox = driver.findElement(By.id("searchInput"));
		searchBox.sendKeys("Software");
		Thread.sleep(5000);
		driver.quit();


	}

}
