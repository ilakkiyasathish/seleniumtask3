package seleniumtask1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Question3 {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
		
		//open the browser
		driver.get("https://www.wikipedia.org/");
		 //to maximize the window
		driver.manage().window().maximize();
		//browser to wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 WebElement search=driver.findElement(By.id("searchInput"));
		 search.sendKeys("Artificial Intelligence");
		 /*Select se=new Select(search);
		 se.selectByVisibleText("Artificial Intelligence");*/
		 search.isSelected();
		 search.submit();
		WebElement title= driver.findElement(By.xpath("//span[contains(text(),'History')]"));
		title.click();
		 System.out.println(title.getText());
		
	}

}
