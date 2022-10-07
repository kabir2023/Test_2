import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation2 {
	WebDriver driver;
	@Before
	public void inti() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kamra_0b9xx0w\\Downloads\\April_22-selenium\\Validation2\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://techfios.com/test/101/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void validate() throws InterruptedException {
		WebElement catagory = driver.findElement(By.xpath("//div[@class=\"controls\"]/descendant::span[2]"));
		catagory.click();
		Thread.sleep(3000);
		WebElement yes = driver.findElement(By.linkText("Yes"));
		yes.click();
		Thread.sleep(6000);
		driver.close();
	}

}
