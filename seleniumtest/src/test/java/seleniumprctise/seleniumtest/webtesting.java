package seleniumprctise.seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtesting {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http:\\spicejet.com");
		Thread.sleep(2000);
		driver.findElement(By.name("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@text='Ahmedabad (AMD)']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@text='Gorakhpur (GOP)'])[2]")).click();

	}

}
