package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundButtonInteraction {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://leafground.com/button.xhtml");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		
		String s = "Dashboard";
		
		String title = driver.getTitle();
		System.out.println(title);
		
		if (title.equals(s)) {
			System.out.println("Dashboard page is displayed");
		} else {
			System.out.println("Not displayed");

		}
		
	    boolean enabled = driver.findElement(By.xpath("(//div[@class='card'])[2]")).isEnabled();
	    System.out.println(enabled);
	    
	    Point location = driver.findElement(By.xpath("(//span[text()='Submit'])[1]")).getLocation();
	    System.out.println(location);
	    
	    String cssValue = driver.findElement(By.xpath("//span[text()='Save']")).getCssValue("background-color");
	    System.out.println(cssValue);
	    
	    Dimension size = driver.findElement(By.xpath("(//span[text()='Submit'])[2]")).getSize();
	    System.out.println(size);

	}

}
