package all;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class uploadvideo {

	public void video(WebDriver driver) throws InterruptedException {

		Thread.sleep(1000);
		driver.get("https://www.youtube.com/upload?redirect_to_classic=true");
		WebDriverWait wait = new WebDriverWait(driver, 60);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("start-upload-button-single")));

		boolean status = element.isDisplayed();

		WebElement ss = driver.findElement(By.xpath("(//input[@type='file'])[2]"));
		ss.sendKeys("C:\\Users\\R C Reddy\\Downloads\\Video\\Test videopooja 15thfeb_2.mp4");
		// ss.click();

		driver.findElement(By.xpath("//*[@placeholder='Title']")).clear();
		driver.findElement(By.xpath("//*[@placeholder='Title']")).sendKeys("234");
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[text()='Click \"Publish\" to make your video live.']")));
		driver.findElement(By.xpath("(//*[@class='metadata-save-button'])[1]")).click();

	}

}
