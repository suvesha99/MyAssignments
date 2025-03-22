package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.partialLinkText("Find")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("98127");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1500);
		WebElement leadIdToBeClicked = driver.findElement(By.xpath("//td[contains(@class,'x-grid3-cell-first')]//descendant::a"));
		String leadId = driver.findElement(By.xpath("//td[contains(@class,'x-grid3-cell-first')]//descendant::a")).getText();
		String id=leadId;
		leadIdToBeClicked.click();
		driver.findElement(By.className("subMenuButtonDangerous")).click();
		driver.findElement(By.partialLinkText("Find")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(id);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
		String text = driver.findElement(By.xpath("//div[contains(@class,'x-small-editor')]//child::div")).getText();
		System.out.println(text);
		
	}

}
