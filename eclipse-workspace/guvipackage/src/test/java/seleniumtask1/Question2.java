package seleniumtask1;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import junit.framework.Assert;

public class Question2 {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
		
		//open the browser
		driver.get("https://www.demoblaze.com");
		 //to maximize the window
		driver.manage().window().maximize();
		//browser to wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(1000);
		String store=driver.getTitle();
		String expected="STORE";
		System.out.println(store);
		Assert.assertEquals("STORE", store);
		if(store.equals(expected)) {
			System.out.println("landed on correct page");
		}else {
			System.out.println("it is not landed correcr page ");
		}
		
		
		
	}

}
