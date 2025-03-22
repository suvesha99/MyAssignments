package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxAss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[text()='Basic']//preceding-sibling::div[1]")).click();
		driver.findElement(By.xpath("//span[text()='Ajax']//preceding-sibling::div[1]")).click();
		driver.findElement(By.xpath("//label[text()='Java']//preceding-sibling::div[1]")).click();
		WebElement triState = driver.findElement(By.xpath("(//div[contains(@class,'ui-corner-all')])[20]"));
		triState.click();
		boolean selected = triState.isSelected();
		System.out.println(selected);
		driver.findElement(By.xpath("(//div[contains(@class,'toggleswitch')])[2]")).click();
		String domAttribute = driver.findElement(By.xpath("//div[contains(@class,'toggleswitch')]")).getDomAttribute("class");
		if(domAttribute.contains("ui-toggleswitch-checked"))
		{
			System.out.println("Toggle Switch is Checked");
		}
		else
		{
			System.out.println("Toggle Switch is not Checked");
		}
		boolean isEnabled = driver.findElement(By.xpath("//span[text()='Disabled']//preceding-sibling::div[1]")).isEnabled();
		System.out.println(isEnabled);
		driver.close();
		driver.quit();

	}

}
