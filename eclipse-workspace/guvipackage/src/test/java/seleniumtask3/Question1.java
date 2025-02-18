package seleniumtask3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question1 {

	public static void main(String[] args) {
     WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://jqueryui.com/datepicker/");
		 //to maximize the window
		driver.manage().window().maximize();
		//browser to wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement iframe=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(iframe);
		driver.findElement(By.id("datepicker")).click();
		//driver.findElement(By.xpath("//a[text()='19']")).click();
		driver.findElement(By.xpath("//a[@title='Next']")).click();
		WebElement selecteddate=driver.findElement(By.xpath("//a[text()='22']"));
		selecteddate.click();
		selecteddate.getText();
		
		
		System.out.println(" selected date is " +selecteddate.getText() );
		
		driver.quit();

		
		
	
	}

}
