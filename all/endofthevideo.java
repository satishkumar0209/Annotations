package all;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class endofthevideo {
	public void end(WebDriver driver) throws InterruptedException {
		driver.get("https://www.youtube.com/branding");
		Select dropdown = new Select(driver.findElement(By.xpath("//*[@class='yt-uix-form-input-select-element timing-select']")));
		dropdown.selectByIndex(1);
		driver.findElement(By.xpath("//*[text()='Update']")).click();
		driver.get("https://www.youtube.com/my_videos?o=U&ar=1");
		driver.findElement(By.xpath("//*[@class='vm-thumbnail-container vm-thumb']")).sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
	}
}
