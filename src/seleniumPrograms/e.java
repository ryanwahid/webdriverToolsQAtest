package seleniumPrograms;
	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.remote.DesiredCapabilities;
public class e {

	public static void main(String[] args) throws InterruptedException {
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		WebDriver driver = new FirefoxDriver(capabilities);
		driver.get("http://www.toolsqa.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'Enroll Your Self')]")).click();

		Thread.sleep(5000);
		driver.quit();
	}
}