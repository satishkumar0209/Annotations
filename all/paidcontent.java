package all;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class paidcontent {
	public void paid(WebDriver driver) {
		driver.get("https://www.youtube.com/my_videos?ar=1&o=U");
		WebDriverWait wait = new WebDriverWait(driver, 60);
		WebElement element = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[@class='vm-video-title-content yt-uix-sessionlink']")));

		driver.findElement(By.xpath("//*[@class='vm-video-title-content yt-uix-sessionlink']")).click();

		driver.findElement(By.xpath("(//*[@class='tab-header-title'])[3]")).click();

		driver.findElement(By.xpath("//*[@data-ng-model='product.has_paid_product_placement']")).click();
		JavascriptExecutor je = (JavascriptExecutor) driver;

		driver.findElement(By.xpath("//*[@data-ng-model='product.show_paid_product_placement_overlay']")).click();
		WebElement element1 = driver.findElement(By.xpath("//*[text()='Save changes']"));

		je.executeScript("arguments[0].scrollIntoView(true);", element1);

		driver.findElement(By.xpath("//*[text()='Save changes']")).click();
		

		WebElement link = driver.findElement(By.id("creator-editor-title-link"));

		String keysPressed = Keys.chord(Keys.CONTROL, Keys.RETURN);

		link.sendKeys(keysPressed);

	}

}
