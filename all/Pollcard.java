package all;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Pollcard {
	public void pcard(WebDriver driver) throws InterruptedException 
	{
		driver.get("https://www.youtube.com/cards?v=kL22yYZbF6Y");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[text()='Add card']")).click();

		driver.findElement(By.xpath("(//*[@class='annotator-clickcard-right'])[4]")).click();
		
		driver.findElement(By.xpath("//*[@placeholder='Poll question']")).sendKeys("Love music");
		
		driver.findElement(By.xpath("//*[@placeholder='Choice 1']")).sendKeys("Yes");

		driver.findElement(By.xpath("//*[@placeholder='Choice 2']")).sendKeys("No");
		
		driver.findElement(By.xpath("//*[text()='Create card']")).click();
		
		Thread.sleep(1000);
		
		WebElement link=driver.findElement(By.id("creator-editor-title-link"));
		
		String keysPressed =  Keys.chord(Keys.CONTROL, Keys.RETURN);
		
		link.sendKeys(keysPressed) ;
	
	}

}
