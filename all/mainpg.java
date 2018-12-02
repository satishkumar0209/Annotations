package all;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class mainpg {

	public static void main(String[] args) throws InterruptedException, ATUTestRecorderException {
		DateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
		  Date date = new Date();
		  
		  ATUTestRecorder recorder = new ATUTestRecorder("C:\\Users\\R C Reddy\\Desktop\\satish","TestVideo-"+dateFormat.format(date),false);
		  
		  recorder.start();  
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\Selenium_SW\\Browser drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.youtube.com/");

		Thread.sleep(1000);

		gmaillogin login = new gmaillogin();
		login.gmail(driver);

		uploadvideo up = new uploadvideo();
		up.video(driver);
		recorder.stop();
		
		
	}

}
