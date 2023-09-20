package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class InteractionsWithCheckboxes {

	public static void main(String[] args) {

            ChromeDriver driver = new ChromeDriver();
            
            driver.get("https://leafground.com/checkbox.xhtml");
            
            driver.manage().window().maximize();
            
            driver.findElement(By.xpath("//span[text()='Basic']")).click();
            
            driver.findElement(By.xpath("//span[text()='Ajax']")).click();
            
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            
            boolean displayed = driver.findElement(By.xpath("//span[text()='Information']")).isDisplayed();
            System.out.println(displayed);
            
            driver.findElement(By.xpath("//label[text()='Java']")).click();
            
            driver.findElement(By.xpath("(//div[@class='card'])[4]")).click();
            
            driver.findElement(By.xpath("(//div[@class='card'])[5]")).click();
            
            boolean displayed1 = driver.findElement(By.xpath("//span[text()='Information']")).isDisplayed();
            System.out.println(displayed1);
            
            boolean selected = driver.findElement(By.xpath("(//div[@class='card'])[6]")).isSelected();
            System.out.println(selected);
            
            WebElement element = driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-triangle-1-s']"));
            
            Select option = new Select(element);
            
            option.selectByIndex(1);
            
            driver.close();
            
            
          
	}

}
