package Test;

 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

 
import MiHCM.*;
import OntimeLeaveEntry.*;

    public class TestRunner {

       public static WebDriver driver;
       
       LoginPage objLogin;
       OntimeLeaveEntry objOntimeLeave;
       NavigateToMenu Navigattion;

 
       @Test(priority=0)
        public void LogintoHCM()
       {
        
	 		WebDriver driver;
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			
	        
	        driver.get("https://qa.mihcm.com");
	        
	        //Create Login Page object
	        objLogin = new LoginPage(driver);
	
	 
	        objLogin.logintoHCM("nilmie.gamhewa@gmail.com", "Admin@1234");
             
   

    	   Navigattion =new NavigateToMenu(driver);
    	   Navigattion.navigate_to_ontime_menu();
    	   System.out.println("Successfully clicked on ontime main menu");
   	
    	   Navigattion.navigate_to_ontimeLeave_menu();
    	   System.out.println("Successfully clicked on ontime sub menu");
   	
    	   Navigattion.navigateto_Enterleave();
    	   System.out.println("Successfully clicked on Leave menu");
    	   
  
   	
    	   objOntimeLeave= new OntimeLeaveEntry(driver);
    	   objOntimeLeave.EnterOntimeLeave();
    	   System.out.println("Successfully Applied a Leave");
    	  driver.close();
    	  driver.quit();
       }

    
   }