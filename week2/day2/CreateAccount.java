package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String aName="Kurian";
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys(aName);
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		WebElement industryDD = driver.findElement(By.name("industryEnumId"));
		Select indoption = new Select(industryDD);
		indoption.selectByIndex(3);
		WebElement ownershipDD=driver.findElement(By.name("ownershipEnumId"));
		Select ownoption = new Select(ownershipDD);
		ownoption.selectByVisibleText("S-Corporation");
		WebElement sourceDD = driver.findElement(By.id("dataSourceId"));
		Select sourceoption=new Select(sourceDD);
		sourceoption.selectByValue("LEAD_EMPLOYEE");
		WebElement marketingDD = driver.findElement(By.id("marketingCampaignId"));
		Select marketingoption=new Select(marketingDD);
		marketingoption.selectByIndex(6);
		WebElement stateDD = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select stateoption = new Select(stateDD);
		stateoption.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();
		WebElement accName = driver.findElement(By.xpath("(//span[text()='Account Name']/following::span)[1]"));
		String name = accName.getText();
		String[] splittedName = name.split(" ");
		if(aName.equals(splittedName[0]))
		{
			System.out.println("Account Name Displayed correctly");
		}
		else
		{
			System.out.println("Account Name Not Displayed correctly");
		}
		driver.close();
		driver.quit();		
		
	}

}
