package edureka;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class verify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://website.com/sign-in/");
		driver.manage().window().maximize();
		String x = driver.getTitle();
		System.out.println(x);
		driver.findElement(By.id("username")).sendKeys("selenium");
		driver.findElement(By.name("password")).sendKeys("test");
	}

}
