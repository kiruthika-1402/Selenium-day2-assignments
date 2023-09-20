package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemonstratingRadioButton {

	public static void main(String[] args) {
		
    ChromeDriver driver = new ChromeDriver();
		
    driver.get("https://www.leafground.com/radio.xhtml");
		
	driver.manage().window().maximize();
		
	driver.findElement(By.xpath("(//label[text()= 'Chrome'])[1]")).click();
		
	driver.findElement(By.xpath("//label[text()='Chennai']")).click();
		
	driver.findElement(By.xpath("//label[text()='Chennai']")).click();
		
    boolean selected = driver.findElement(By.xpath("(//div[@class='card'])[2]")).isSelected();
	System.out.println(selected);
	  
	boolean enabled = driver.findElement(By.xpath("//label[text()='Safari']")).isEnabled();
	System.out.println(enabled);
	
    boolean enabled2 = driver.findElement(By.xpath("//label[text()='21-40 Years']")).isEnabled();
    System.out.println(enabled2);



	}

}
