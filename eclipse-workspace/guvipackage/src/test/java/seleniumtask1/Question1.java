package seleniumtask1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		//open the browser
		driver.get("http://google.com");
		 //to maximize the window
		driver.manage().window().maximize();
		//browser to wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String url=driver.getCurrentUrl();
		System.out.println(url);
		driver.navigate().refresh();
		driver.quit();
		
	}

}
