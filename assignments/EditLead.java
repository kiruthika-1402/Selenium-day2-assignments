package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
        driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		
        driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
	//  Using Xpath
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Testleaf");
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Kiruthika");
		
		driver.findElement(By.xpath("//input[contains(@id,'lastName')]")).sendKeys("Chidambaram");
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Kiruthika");
		
		driver.findElement(By.xpath("//input[contains(@id,'departmentName')]")).sendKeys("Physics");
		
		driver.findElement(By.xpath("//textarea[contains(@id,'description')]")).sendKeys("Selenium Automation Tester");
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("kiruthikalaxmi1402@gmail.com");
		
		WebElement element = driver.findElement(By.xpath("//select[contains(@id,'generalStateProvinceGeoId')]"));
		
		Select option = new Select(element);
		
		option.selectByVisibleText("New York");
		
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		
	    driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']")).clear();
	    
	    driver.findElement(By.xpath("//textarea[contains(@id,'importantNote')]")).sendKeys("Need to enter proper details in all textboxes");
	    
	    driver.findElement(By.name("submitButton")).click();
	    
	    String title = driver.getTitle();
	    System.out.println(title);
	    
	    driver.close();
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
