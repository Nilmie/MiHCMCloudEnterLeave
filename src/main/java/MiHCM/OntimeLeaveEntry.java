package MiHCM;


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

	    //Direct to menu

	    /*public void DirecttoMenuOntimeLeaveEntry()
	    {
			driver.findElement(OntimeMenu).click();
			driver.findElement(Leave).click();
			driver.findElement(EnterLeave).click();

 	    }*/


	    //Enter Leave
 

	    public void EnterOntimeLeave() 
	    {
	    	
    
	    	
	    	
	    	/*driver.findElement(By.id("SelectizeEmployeeCode-selectized")).sendKeys("MI0009");
	    	//driver.findElement(By.xpath("//div[@class='selectize-control single']")).sendKeys("MI0009");
	    	driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
	    	((Select) driver).selectByVisibleText("MI0009");
	    	
	    */
	    	WebElement EmployeeSearch = driver.findElement(By.id("SelectizeEmployeeCode-selectized"));
	    	
	    	EmployeeSearch.sendKeys("MI0009");
	    	driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
	    	EmployeeSearch.sendKeys(Keys.DOWN, Keys.ENTER);
	    	driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
	    	((Select) driver).selectByVisibleText("MI0009");
	    	

	        
	        //Retrieve WebElement ' ' to perform mouse hover 
	    	/*WebElement EmployeeSearch = driver.findElement(By.id("SelectizeEmployeeCode-selectized"));

	    	
	    	
	    	Actions actions = new Actions(driver);
	    	Actions seriesOfActions = actions
	    			.moveToElement(EmployeeSearch).click()
	    			.sendKeys(EmployeeSearch, "MI0009");
	    			driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
	    			seriesOfActions.doubleClick(EmployeeSearch);
	    			((Select) driver).selectByVisibleText("MI0009");
	    			EmployeeSearch.sendKeys(Keys.DOWN, Keys.RETURN);
	    			EmployeeSearch.click();
	    			//.build();
	    			seriesOfActions.perform();

*/
			//Thread.sleep(500); 
	
			driver.findElement(By.id("lbl-LeaveYear")).sendKeys("2020");
			Select LeaveType = new Select (driver.findElement(By.id("LeaveTypeCode")));
			LeaveType.selectByIndex(1);
			
			Select LeaveReason = new Select (driver.findElement(By.id("LeaveReasonCode")));
			LeaveReason.selectByIndex(0);
			
			WebElement StartDate = driver.findElement(By.xpath("//*[@id=\"StartDate\"]"));
			//Fill date as mm/dd/yyyy as 10/26/2020
			StartDate.sendKeys("09262020");

			WebElement EndDate = driver.findElement(By.xpath("//*[@id=\"EndDate\"]"));
			//Fill date as mm/dd/yyyy as 10/26/2020
			EndDate.sendKeys("09262020");
			
			driver.findElement(By.id("Remarks")).sendKeys("TestNG");
			driver.findElement(By.id("btnSave")).click();
					
		//	Select LeaveTypeCode = new Select(driver.findElement(By.id("LeaveTypeCode")));
			//LeaveTypeCode.selectByVisibleText("Annual L");
		//	LeaveTypeCode.selectByIndex(2);
			
		

	    }

	    
	   
	}