package all;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Addwatermark {
	public void customstarttime(WebDriver driver) throws InterruptedException {
		driver.get("https://www.youtube.com/branding");
		WebDriverWait wait = new WebDriverWait(driver, 60);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//*[@class='yt-uix-button yt-uix-button-size-default yt-uix-button-default delete-feature-button settings-button']")));

// Remove brandmark

		driver.findElement(By.xpath(
				"//*[@class='yt-uix-button yt-uix-button-size-default yt-uix-button-default delete-feature-button settings-button']"))
				.click();
//Add watermark
		driver.findElement(By.xpath("//*[text()='Add a watermark']")).click();
		Thread.sleep(2000);

		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		WebElement se = driver.findElement(By.xpath("//*[@class='upload-image-input']"));
		se.sendKeys("C:\\Users\\R C Reddy\\Desktop\\ss.png");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//*[text()='Save']")).click();
		driver.findElement(By.xpath("//*[text()='Save']")).click();
		driver.findElement(By.xpath("//*[text()='Update']")).click();
		
		
	}
}
