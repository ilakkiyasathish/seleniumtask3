package seleniumtask3;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//import junit.framework.Assert;

public class Question2 {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
		
		//open the browser
		driver.get("https://jqueryui.com/droppable/");
		 //to maximize the window
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement iframe=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(iframe);
		WebElement ele1=driver.findElement(By.id("draggable"));
		WebElement ele2=driver.findElement(By.id("droppable"));
		String intialcolor = ele2.getCssValue("background-color");
		System.out.println(" backgroung colour before " + intialcolor);
		Actions objact1=new Actions(driver);
		objact1.dragAndDrop(ele1, ele2).build().perform();
		String finalcolor = ele2.getCssValue("background-color");
		System.out.println(" backgroung colour after " + finalcolor);
		if(!intialcolor.equals(finalcolor)) {
			System.out.println("succesfully dropped ,colour not matching");
			
		}else {
			System.out.println("not dropped successfully ,colour same");
		}
		
		
		 String text=ele2.getText();
		 System.out.println(text);
		 Assert.assertEquals(text,"Dropped!");
		 driver.quit();
	}

}
