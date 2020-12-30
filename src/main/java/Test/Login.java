package Test;

 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

 
import MiHCM.LoginPage;
import MiHCM.OntimeLeaveEntry;
import MiHCM.NavigateToMenu;

 


    public class Login {

 

       public static WebDriver driver;
       LoginPage objLogin;
       OntimeLeaveEntry objOntimeLeave;
       NavigateToMenu Navigattion;

 
       @Test(priority=0)

 

        public void LogintoHCM()
       {
	       //  System.setProperty("webdriver.chrome.driver","C:\\seldrv\\chromedriver.exe");
	       //  driver = new ChromeDriver();
	         
	 		WebDriver driver;
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			
	        
	        driver.get("https://qa.mihcm.com");
	        
	        //Create Login Page object
	        objLogin = new LoginPage(driver);
	
	 
	        objLogin.logintoHCM("nilmie.gamhewa@gmail.com", "Admin@1234");
        
      // }
//Navigate to menu

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
    
   	

       
       
       //@Test(priority=1)
    //   public void DirecttoMenuOntimeLeaveEntry()
   //    {
    	//   objOntimeLeave=new OntimeLeaveEntry(driver);
    	 //  objOntimeLeave.DirecttoMenuOntimeLeaveEntry();

   	 
        
    //   }
      // @Test(priority=2)
    //   public void EnterOntimeLeave()
    //   {
    	   
    	
       	
     //  driver.close();
     //  driver.quit();
    }
   }