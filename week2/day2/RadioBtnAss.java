package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBtnAss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//label[text()='Chrome']//preceding-sibling::div//child::div[2]")).click();
		driver.findElement(By.xpath("//label[text()='Chennai']//preceding-sibling::div//child::div[2]")).click();
		driver.findElement(By.xpath("//label[text()='Chennai']//preceding-sibling::div//child::div[2]")).click();
		boolean selected = driver.findElement(By.xpath("(//label[text()='Safari']//preceding-sibling::div//child::div[2])[2]")).isSelected();
		System.out.println(selected);
		boolean selected2 = driver.findElement(By.xpath("//label[text()='21-40 Years']")).isSelected();
		if(selected2 == false)
		{
			driver.findElement(By.xpath("//label[text()='21-40 Years']")).click();
		}
		driver.close();
		driver.quit();
	}

}
