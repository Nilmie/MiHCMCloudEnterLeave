package OntimeLeaveEntry;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;



public class OntimeLeaveEntry {

	 WebDriver driver;
 
	 
	    By OntimeMenu  = By.xpath("//li[@data-target='#menu-3']']"); 
	    By Leave=By.xpath("//*[@id='sub-menu-66']");
	    By EnterLeave=By.xpath("//a[contains(text(),'Enter Leave')]");

	    	    
	    public OntimeLeaveEntry(WebDriver driver){

	        this.driver = driver;

	    }


	    public void EnterOntimeLeave() 
	    {
	    	//Select Employee From Employee Search
	    	driver.findElement(By.xpath("//input[@type='select-one' and @placeholder='Select Employee']")).click();
	    	driver.manage().timeouts().implicitlyWait(55,TimeUnit.SECONDS);
	    	driver.findElement(By.xpath("//input[@type='select-one' and @placeholder='Select Employee']")).sendKeys("Nilmie");
	    	driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
	    	driver.findElement(By.xpath("//div[@class='selectize-dropdown single']//div/span[starts-with(text(),'MI0009 ')]")).click();

	    	//Select Leave Year
			driver.findElement(By.xpath("//div[contains(@class,'col-xs-3 hcm-form_controller')]//input[1]")).click();
			driver.manage().timeouts().implicitlyWait(55,TimeUnit.SECONDS);
			driver.findElement(By.xpath("//span[text()='2021']")).click();
	    	
			
			//Select Leave Type 
	    	 driver.findElement(By.xpath("//div[@class='row']//div[@class='col-xs-5 hcm-form_controller nsep gap hcm_d']//select//option[3]")).click();
	         driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
	         
			//Select Leave Reason
			Select LeaveReason = new Select (driver.findElement(By.id("LeaveReasonCode")));
			LeaveReason.selectByIndex(0);
			
			//Enter Leave Start Date Fill date as mm/dd/yyyy as 09/25/2013
			driver.findElement(By.id("StartDate")).click();
			driver.manage().timeouts().implicitlyWait(55,TimeUnit.SECONDS);
			driver.findElement(By.xpath("//td[@data-day='01/20/2021']")).click();

			//Enter Leave End Date
			driver.findElement(By.id("EndDate")).click();
			driver.manage().timeouts().implicitlyWait(55,TimeUnit.SECONDS);
			driver.findElement(By.xpath("//td[@data-day='01/20/2021']")).click();
			
			//Enter Remarks
			driver.findElement(By.id("Remarks")).sendKeys("TestNG");
			
			//Click on Button Save
			driver.findElement(By.id("btnSave")).click();

		

	    }

	    
	   
	}