package all;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Calltoaction {
	public void cta(WebDriver driver)
	{
		driver.get("https://www.youtube.com/my_videos?ar=1&o=U");
		
		driver.findElement(By.xpath("(//*[@data-tab-id='call-to-action'])[1]")).click();
		
		driver.findElement(By.name("cta_display_url")).clear();
		
		driver.findElement(By.name("cta_display_url")).sendKeys("facebook.com");
		
		driver.findElement(By.name("cta_destination_url")).clear();
		
		driver.findElement(By.name("cta_destination_url")).sendKeys("facebook.com");
		
		driver.findElement(By.name("cta_text1")).clear();
		
		driver.findElement(By.name("cta_text1")).sendKeys("everyone");
		
		driver.findElement(By.xpath("(//*[text()='Save changes'])[2]")).click();
		
		
		WebElement link=driver.findElement(By.id("creator-editor-title-link"));
		
		String keysPressed =  Keys.chord(Keys.CONTROL, Keys.RETURN);
	
		link.sendKeys(keysPressed) ;
		

}
}
