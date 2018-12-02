package all;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class myvideos {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\Selenium_SW\\Browser drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.youtube.com/");

		Thread.sleep(1000);

		gmaillogin login = new gmaillogin();
		login.gmail(driver);
		
		

	}

}
