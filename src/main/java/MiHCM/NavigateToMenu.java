package MiHCM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class NavigateToMenu{


	WebDriver driver;
	
	By ontimemenu = By.xpath("//*[@data-target='#menu-3']");
	By Leavemenu=By.xpath("//*[@id='sub-menu-66']");
	 By EnterLeave=By.xpath("//a[contains(text(),'Enter Leave')]");
	
	 public NavigateToMenu(WebDriver driver)
	    {
	        this.driver = driver;
	    }
	
	public void navigate_to_ontime_menu()
	{
		driver.manage().timeouts().implicitlyWait(55,TimeUnit.SECONDS);
		driver.findElement(ontimemenu).click();
	}
	
	public void navigate_to_ontimeLeave_menu()
	{
		driver.manage().timeouts().implicitlyWait(55,TimeUnit.SECONDS);
		driver.findElement(Leavemenu).click();
	}
	
	public void navigateto_Enterleave()
	{
		driver.manage().timeouts().implicitlyWait(150,TimeUnit.SECONDS);
		driver.findElement(EnterLeave).click();
	}
	
	
}
