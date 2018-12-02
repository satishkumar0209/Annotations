package all;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Entirevideo {
	public void entire(WebDriver driver) throws InterruptedException {
		driver.get("https://www.youtube.com/branding");
		Select dropdown = new Select(driver.findElement(By.xpath("//*[@class='yt-uix-form-input-select-element timing-select']")));
		dropdown.selectByIndex(2);
		driver.findElement(By.xpath("//*[text()='Update']")).click();
	}
}
