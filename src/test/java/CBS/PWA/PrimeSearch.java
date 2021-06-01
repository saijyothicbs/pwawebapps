package CBS.PWA;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class PrimeSearch extends BaseTest{
	public static WebDriver driver;
	public static  String upgrade;
	public static  String name;
	
	String driverExecutablePath = "C:\\Users\\NireshKumar-47908\\eclipse-workspace\\PWA\\drivernew\\chromedriver.exe"; 

	 ExtentReports report;
     ExtentTest logger;
       @BeforeMethod
       public void setUp1() throws MalformedURLException {
           System.setProperty("webdriver.chrome.driver", driverExecutablePath);
           Map<String, String> mobileEmulation = new HashMap<String, String>();
           mobileEmulation.put("deviceName", "Pixel 2");

           ChromeOptions chromeOptions = new ChromeOptions();
           chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
           chromeOptions.addArguments("--disable-notifications");
           driver = new ChromeDriver(chromeOptions);
       }
       
       
       @Test
       public void testUntitled() throws Throwable {
       	
    	   PrimeSearchpom rp= new PrimeSearchpom(driver);
       	Thread.sleep(5000);
		  // driver.get("https://m.communitymatrimony.com/cbsmob/login.php");
		   driver.get("https://m.communitymatrimony.com/cbsmob/login.php");
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       
		    Thread.sleep(4000);
	   	    WebElement e=driver.findElement(By.xpath("//*[@id='idEmail']"));
	   	    e.click();
	   		Thread.sleep(4000);
	   		e.sendKeys("agr500225");
	   	    	
	   	    Thread.sleep(4000); 
	   	    WebElement d=driver.findElement(By.xpath("//*[@id='password1']"));
	   	    d.click();
			Thread.sleep(4000);
			d.sendKeys("cbstest");
		    	
	   	  Thread.sleep(4000);
	   	BaseTest.click(rp.getLogin());
	   	
	   	
	    try {
	    	   Thread.sleep(4000);
	           driver.findElement(By.xpath("//*[@id=\"content\"]/app-dailyrecommendation/div")).click();
	    	   Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\"content\"]/app-dailyrecommendation/ion-header/ion-toolbar/ion-back-button")).click();
		} catch (Exception e2) {
			System.out.println("no daily matches tab");
		}
	    
	    
	    Thread.sleep(4000);
	    BaseTest.click(rp.getSearch());
	    
	  //keyword search
		//edit
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[@class='clrlblue pos_t5 font12']")).click();
		
		//age
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-search/ion-content/div[2]/ion-grid[1]/ion-row[1]/ion-col/form/div[2]/ion-list[1]/ion-item[1]")).click();
			
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[@ion-button='item-cover'])[17]")).click();
			
		Thread.sleep(4000);	
		driver.findElement(By.xpath("(//span[@class='button-inner'])[31]")).click();
			
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[@ion-button='item-cover'])[18]")).click();
				
		Thread.sleep(4000);	
		driver.findElement(By.xpath("(//span[@class='button-inner'])[45]")).click();
			
		Thread.sleep(4000);
		BaseTest.click(rp.getTick());
			
	//height
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-search/ion-content/div[2]/ion-grid[1]/ion-row[1]/ion-col/form/div[2]/ion-list[1]/ion-item[2]/div[1]")).click();
			
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[@ion-button='item-cover'])[17]")).click();
			
		Thread.sleep(4000);	
		driver.findElement(By.xpath("(//span[@class='button-inner'])[31]")).click();
			
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[@ion-button='item-cover'])[18]")).click();
				
		Thread.sleep(4000);	
		driver.findElement(By.xpath("(//span[@class='button-inner'])[45]")).click();
			
		Thread.sleep(4000);
		BaseTest.click(rp.getTick());	
		
		//marital status
			
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-search/ion-content/div[2]/ion-grid[2]/ion-row/ion-col/form/div[1]/ion-list/ion-item[3]/div[1]/div")).click();
			
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class='button-inner'])[26]")).click();
		
		Thread.sleep(4000);
		BaseTest.click(rp.getTick());
			
		//Dosham
		
		Thread.sleep(4000);	
		driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-search/ion-content/div[2]/ion-grid[1]/ion-row[1]/ion-col/form/div[2]/ion-list[2]/ion-item/div[1]")).click();
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class='button-inner'])[26]")).click();
		
		Thread.sleep(4000);
		BaseTest.click(rp.getTick());
		
		//show profile and don't show profile	
			
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class='button-inner'])[7]")).click();
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class='button-inner'])[8]")).click();
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class='button-inner'])[9]")).click();
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class='button-inner'])[10]")).click();
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class='button-inner'])[11]")).click();
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class='button-inner'])[12]")).click();
		
		//keyword search button
		
		Thread.sleep(4000);
		WebElement srch=driver.findElement(By.xpath("(//input[@class='searchbar-input'])[2]"));
		srch.sendKeys("Tamilnadu");
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[contains(text(),'GO')]")).click();
			
		try {
			Thread.sleep(4000);
			WebElement txt=driver.findElement(By.xpath("(//span[@class='matriid_txt'])[1]"));
			String keysearch=txt.getText();
			System.out.println(keysearch);
		} catch (Exception e2) {
		}
		
		
		try {
			Thread.sleep(4000);
			WebElement txt=driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-search/ion-content/div[2]/page-matches/ion-content/div[2]/div/div"));
			String keysearch=txt.getText();
			System.out.println(keysearch);
		} catch (Exception e2) {
		}
			
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[@class='ficon icon-back font14 paddr10']")).click();
		
	///regular search
		
		//age
			Thread.sleep(4000);
			driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-search/ion-content/div[2]/ion-grid[2]/ion-row/ion-col/form/div[1]/ion-list/ion-item[1]/div[1]/div")).click();
				
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//span[@class='button-inner'])[20]")).click();
				
			Thread.sleep(4000);	
			driver.findElement(By.xpath("(//span[@class='button-inner'])[32]")).click();
				
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//span[@class='button-inner'])[21]")).click();
					
			Thread.sleep(4000);	
			driver.findElement(By.xpath("(//span[@class='button-inner'])[46]")).click();
				
			Thread.sleep(4000);
			BaseTest.click(rp.getTick());
				
		//height
			
			Thread.sleep(4000);
			driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-search/ion-content/div[2]/ion-grid[2]/ion-row/ion-col/form/div[1]/ion-list/ion-item[2]/div[1]/div")).click();
				
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//span[@class='button-inner'])[20]")).click();
				
			Thread.sleep(4000);	
			driver.findElement(By.xpath("(//span[@class='button-inner'])[32]")).click();
				
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//span[@class='button-inner'])[21]")).click();
					
			Thread.sleep(4000);	
			driver.findElement(By.xpath("(//span[@class='button-inner'])[46]")).click();
				
			Thread.sleep(4000);
			BaseTest.click(rp.getTick());	
			
			//marital status
				
			Thread.sleep(4000);
			driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-search/ion-content/div[2]/ion-grid[2]/ion-row/ion-col/form/div[1]/ion-list/ion-item[3]/div[1]/div")).click();
				
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//span[@class='button-inner'])[20]")).click();
			
			Thread.sleep(4000);
			BaseTest.click(rp.getTick());
				
		//subcaste
		
			Thread.sleep(4000);
			driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-search/ion-content/div[2]/ion-grid[2]/ion-row/ion-col/form/div[2]/ion-list/ion-item[1]/div[1]/div")).click();
				
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//span[@class='button-inner'])[20]")).click();
			
			Thread.sleep(4000);
			BaseTest.click(rp.getTick());
				
		//mothertongue
			
			Thread.sleep(4000);
			driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-search/ion-content/div[2]/ion-grid[2]/ion-row/ion-col/form/div[2]/ion-list/ion-item[2]/div[1]/div")).click();
				
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//span[@class='button-inner'])[24]")).click();
			
			Thread.sleep(4000);
			BaseTest.click(rp.getTick());
				
		//star
			
			Thread.sleep(4000);
			driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-search/ion-content/div[2]/ion-grid[2]/ion-row/ion-col/form/div[2]/ion-list/ion-item[3]/div[1]/div")).click();
				
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//span[@class='button-inner'])[23]")).click();
			
			Thread.sleep(4000);
			BaseTest.click(rp.getTick());
				
		//gothra
		
			Thread.sleep(4000);
			driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-search/ion-content/div[2]/ion-grid[2]/ion-row/ion-col/form/div[2]/ion-list/ion-item[4]/div[1]/div")).click();
				
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//span[@class='button-inner'])[23]")).click();
			
			Thread.sleep(4000);
			BaseTest.click(rp.getTick()); 
				
		//dosham	
			
			Thread.sleep(4000);
			driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-search/ion-content/div[2]/ion-grid[2]/ion-row/ion-col/form/div[2]/ion-list/ion-item[5]/div[1]/div")).click();
				
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//span[@class='button-inner'])[21]")).click();
			
			Thread.sleep(4000);
			BaseTest.click(rp.getTick());
				
			//country	
			
			Thread.sleep(8000);
		   	JavascriptExecutor js2 = (JavascriptExecutor)driver;
		   	  WebElement edi2= driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-search/ion-content/div[2]/ion-grid[2]/ion-row/ion-col/form/div[2]/ion-list/ion-item[6]/div[1]/div"));
			  	  js2.executeScript("arguments[0].scrollIntoView(true);",edi2);
			
					Thread.sleep(4000);
					driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-search/ion-content/div[2]/ion-grid[2]/ion-row/ion-col/form/div[2]/ion-list/ion-item[6]/div[1]/div")).click();
						
					Thread.sleep(4000);
					driver.findElement(By.xpath("(//span[@class='button-inner'])[25]")).click();
					
					Thread.sleep(4000);
					BaseTest.click(rp.getTick());
						
			//education
					
					Thread.sleep(4000);
					driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-search/ion-content/div[2]/ion-grid[2]/ion-row/ion-col/form/div[2]/ion-list/ion-item[7]/div[1]/div")).click();
						
					Thread.sleep(4000);
					driver.findElement(By.xpath("(//span[@class='button-inner'])[24]")).click();
					
					Thread.sleep(4000);
					BaseTest.click(rp.getTick());
			
			//occupation
			
					Thread.sleep(4000);
					driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-search/ion-content/div[2]/ion-grid[2]/ion-row/ion-col/form/div[2]/ion-list/ion-item[9]/div[1]/div")).click();
						
					Thread.sleep(4000);
					driver.findElement(By.xpath("(//span[@class='button-inner'])[24]")).click();
					
					Thread.sleep(4000);
					BaseTest.click(rp.getTick());
			
			//annual income
			
					Thread.sleep(4000);
					driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-search/ion-content/div[2]/ion-grid[2]/ion-row/ion-col/form/div[2]/ion-list/ion-item[10]/div[1]/div")).click();
						
					Thread.sleep(4000);
					driver.findElement(By.xpath("(//span[@class='button-inner'])[20]")).click();
					
					Thread.sleep(4000);
					driver.findElement(By.xpath("(//span[@class='button-inner'])[24]")).click();
					
					Thread.sleep(4000);
					driver.findElement(By.xpath("(//span[@class='button-inner'])[21]")).click();
					
					Thread.sleep(4000);
					driver.findElement(By.xpath("(//span[@class='button-inner'])[25]")).click();
					
					
					Thread.sleep(4000);
					BaseTest.click(rp.getTick());
			
					Thread.sleep(4000);
					driver.findElement(By.xpath("(//span[@class='button-inner'])[9]")).click();
					
					Thread.sleep(4000);
					driver.findElement(By.xpath("(//span[@class='button-inner'])[10]")).click();
					
					Thread.sleep(4000);
					driver.findElement(By.xpath("(//span[@class='button-inner'])[11]")).click();
					
					Thread.sleep(4000);
					driver.findElement(By.xpath("(//span[@class='button-inner'])[12]")).click();
					
					Thread.sleep(4000);
					driver.findElement(By.xpath("(//span[@class='button-inner'])[13]")).click();
					
					Thread.sleep(4000);
					driver.findElement(By.xpath("(//span[@class='button-inner'])[14]")).click();
					
					Thread.sleep(4000);
					driver.findElement(By.xpath("(//span[@class='button-inner'])[15]")).click();
					
					Thread.sleep(4000);
					driver.findElement(By.xpath("(//span[@class='button-inner'])[16]")).click();
					
					Thread.sleep(4000);
					driver.findElement(By.xpath("(//span[@class='button-inner'])[17]")).click();
					
					Thread.sleep(4000);
					driver.findElement(By.xpath("(//span[@class='button-inner'])[18]")).click();
					
			//search now
					Thread.sleep(4000);
					driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-search/ion-footer/ion-toolbar/div[2]/ion-grid/ion-row/ion-col[3]")).click();
					
					try {
						Thread.sleep(4000);
						WebElement txt=driver.findElement(By.xpath("(//span[@class='matriid_txt'])[1]"));
						String keysearch=txt.getText();
						System.out.println(keysearch);
					} catch (Exception e2) {
					}
					
					
					try {
						Thread.sleep(4000);
						WebElement txt=driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-search/ion-content/div[2]/page-matches/ion-content/div[2]/div/div"));
						String keysearch=txt.getText();
						System.out.println(keysearch);
					} catch (Exception e2) {
					}
			
			
			
	    
	    
	    
	    
	    
       }
}
