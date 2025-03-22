package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonAss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		String title = driver.getTitle();
		if(title.equalsIgnoreCase("dashboard"))
		{
			System.out.println("Title displaying correctly");
		}
		else
		{
			System.out.println("Title not displaying correctly");
		}
		driver.navigate().back();
		String text = driver.findElement(By.xpath("//h5[text()='Confirm if the button is disabled.']//following-sibling::button//child::span")).getText();
		if(text.equalsIgnoreCase("disabled"))
		{
			System.out.println("Text displaying as disabled");
		}
		else
		{
			System.out.println("Text not displaying as disabled");
		}
		String text2 = driver.findElement(By.xpath("//button[@type='button']//child::span[2]")).getText();
		System.out.println(text2);
		String cssValue = driver.findElement(By.xpath("//h5[text()='Find the Save button color']//following-sibling::button")).getCssValue("background-color");
		System.out.println(cssValue);
		Dimension size = driver.findElement(By.xpath("(//button[@type='button'])[5]")).getSize();
		System.out.println(size);
		driver.close();
		driver.quit();
	}

}
