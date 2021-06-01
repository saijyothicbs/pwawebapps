package CBS.PWA;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.List;
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

public class PrimeMailbox extends BaseTest {
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
       	
    	   PrimeMailboxpom rp= new PrimeMailboxpom(driver);
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
	    BaseTest.click(rp.getMailbox());
	    //Regular
	    
	    
	    Thread.sleep(4000);
		  BaseTest.click(rp.getAccepted());
		  
		  //accepted
		  Thread.sleep(4000);
		  List <WebElement> edit= driver.findElements(By.xpath("//div[@class='id-name paddt5']"));
	for (WebElement web : edit) {
		 JavascriptExecutor js =(JavascriptExecutor)driver;		 
		  js.executeScript("arguments[0].scrollIntoView(true);",web);
	}
		
			
		  
		  Thread.sleep(4000); 
		  List <WebElement> ref= driver.findElements(By.xpath("//div[@class='id-name paddt5']"));
		int count=ref.size();
		  System.out.println("accepted1 :"+count);
		 
		  Thread.sleep(4000); 
		  List <WebElement> ref1= driver.findElements(By.xpath("//ion-grid[@class='list_item res_txt paddtb10 clra3 white_bg grid']"));
		int count1=ref1.size();
		  System.out.println("accepted1 blocked :"+count1);
		  
		  //declined
		  BaseTest.click(rp.getDeclined());
		  
		  Thread.sleep(10000);
		  List <WebElement> edit1= driver.findElements(By.xpath("//div[@class='id-name paddt5']"));
	for (WebElement web : edit1) {
		 JavascriptExecutor js =(JavascriptExecutor)driver;		 
		  js.executeScript("arguments[0].scrollIntoView(true);",web);
	} 
		  
		  Thread.sleep(6000); 
		  List <WebElement> ref2= driver.findElements(By.xpath("//div[@class='id-name paddt5']"));
		int count2=ref2.size();
		  System.out.println("declined1 :"+count2);
		 
		  Thread.sleep(6000); 
		  List <WebElement> ref3= driver.findElements(By.xpath("//ion-grid[@class='list_item res_txt paddtb10 clra3 white_bg grid']"));
		int count3=ref3.size();
		  System.out.println("declined1 blocked :"+count3);
		  
		  //Replied

	BaseTest.click(rp.getReplied());

	Thread.sleep(4000);
	List <WebElement> edit2= driver.findElements(By.xpath("//div[@class='id-name paddt5']"));
	for (WebElement web : edit2) {
	JavascriptExecutor js =(JavascriptExecutor)driver;		 
	js.executeScript("arguments[0].scrollIntoView(true);",web);
	} 

	Thread.sleep(4000); 
	List <WebElement> ref4= driver.findElements(By.xpath("//div[@class='id-name paddt5']"));
	int count4=ref4.size();
	System.out.println("replied1 :"+count4);

	Thread.sleep(4000); 
	List <WebElement> ref5= driver.findElements(By.xpath("//ion-grid[@class='list_item res_txt paddtb10 clra3 white_bg grid']"));
	int count5=ref5.size();
	System.out.println("replied1 blocked :"+count5);

		  //SENT

	Thread.sleep(6000);
	driver.findElement(By.xpath("//span[contains(text(),'SENT')]")).click();

	Thread.sleep(6000);
	BaseTest.click(rp.getAccepted());

	Thread.sleep(6000);
	List <WebElement> edit3= driver.findElements(By.xpath("//div[@class='id-name paddt5']"));
	for (WebElement web : edit3) {
	JavascriptExecutor js =(JavascriptExecutor)driver;		 
	js.executeScript("arguments[0].scrollIntoView(true);",web);
	} 

	Thread.sleep(6000); 
	List <WebElement> ref6= driver.findElements(By.xpath("//div[@class='id-name paddt5']"));
	int count6=ref6.size();
	System.out.println("sent accepted :"+count6);

	Thread.sleep(6000); 
	try {
		List <WebElement> ref7= driver.findElements(By.xpath("//ion-grid[@class='list_item res_txt paddtb10 clra3 white_bg grid']"));
		int count7=ref7.size();
		System.out.println("sent accepted blocked :"+count7);
	} catch (Exception e2) {
		System.out.println("no element");
	}


	//declined   //ion-grid[@class='list_item grid']  //ion-row[@class='row']	

	Thread.sleep(6000);
	BaseTest.click(rp.getDeclined());

	Thread.sleep(5000);
	List <WebElement> edit4= driver.findElements(By.xpath("(//div//ion-row[@class='row'])[90]"));
	for (WebElement web : edit4) {
	JavascriptExecutor js =(JavascriptExecutor)driver;		 
	js.executeScript("arguments[0].scrollIntoView(true);",web);
	} 

	Thread.sleep(5000); 
	List <WebElement> ref8= driver.findElements(By.xpath("//div//ion-row[@class='row']"));
	int count8=ref8.size();
	System.out.println("sent declined :"+count8);


	Thread.sleep(7000);
	List <WebElement> edit9= driver.findElements(By.xpath("//ion-grid[@class='list_item res_txt paddtb10 clra3 white_bg grid']"));
	for (WebElement web : edit9) {
	JavascriptExecutor js =(JavascriptExecutor)driver;		 
	js.executeScript("arguments[0].scrollIntoView(true);",web);
	} 

	Thread.sleep(5000); 
	try {
		List <WebElement> ref9= driver.findElements(By.xpath("//ion-grid[@class='list_item res_txt paddtb10 clra3 white_bg grid']"));
		int count9=ref9.size();
		System.out.println("sent declined blocked :"+count9);

	} catch (Exception e2) {
		System.out.println("no element");
	}

	//Replied
	Thread.sleep(5000);
	BaseTest.click(rp.getReplied());

	Thread.sleep(10000);
	List <WebElement> edit5= driver.findElements(By.xpath("//div[@class='id-name paddt5']"));
	for (WebElement web : edit5) {
	JavascriptExecutor js =(JavascriptExecutor)driver;		 
	js.executeScript("arguments[0].scrollIntoView(true);",web);
	} 

	Thread.sleep(6000); 
	List <WebElement> ref10= driver.findElements(By.xpath("//div[@class='id-name paddt5']"));
	int count10=ref10.size();
	System.out.println("sent replied :"+count10);

	Thread.sleep(6000);
	try {
		 
		List <WebElement> ref11= driver.findElements(By.xpath("//ion-grid[@class='list_item res_txt paddtb10 clra3 white_bg grid']"));
		int count11=ref11.size();
		System.out.println("sent replied blocked :"+count11);

	} catch (Exception e2) {
		System.out.println("no element");
	}  
	   	
	
/////////////Filter ////////////
Thread.sleep(4000);
driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-mailbox/ion-header/div[1]/ion-row/div")).click();

// Thread.sleep(4000);
// BaseTest.click(rp.getAll());

Thread.sleep(4000);
BaseTest.click(rp.getApply());

Thread.sleep(4000);
List<WebElement> demo = driver.findElements(By.xpath("//div[@class='id-name paddt5']"));
for (WebElement web : demo) {
  JavascriptExecutor js = (JavascriptExecutor) driver;
  js.executeScript("arguments[0].scrollIntoView(true);", web);

}

Thread.sleep(4000);
List<WebElement> demo1 = driver.findElements(By.xpath("//div[@class='id-name paddt5']"));
int total = demo1.size();
System.out.println("all :"+total);

Thread.sleep(4000);
driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-mailbox/ion-header/div[1]/ion-row/div")).click();

Thread.sleep(4000);
BaseTest.click(rp.getInterestreceived());

Thread.sleep(4000);
BaseTest.click(rp.getApply());

Thread.sleep(4000);
List<WebElement> demo2 = driver.findElements(By.xpath("//div[@class='id-name paddt5']"));
for (WebElement web : demo2) {
  JavascriptExecutor js = (JavascriptExecutor) driver;
  js.executeScript("arguments[0].scrollIntoView(true);", web);

}

Thread.sleep(4000);
List<WebElement> demo3 = driver.findElements(By.xpath("//div[@class='id-name paddt5']"));
int total1 = demo3.size();
System.out.println("Interest received :"+total1);

Thread.sleep(4000);
driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-mailbox/ion-header/div[1]/ion-row/div")).click();

Thread.sleep(4000);
BaseTest.click(rp.getMessagereceived());

Thread.sleep(4000);
BaseTest.click(rp.getInterestreceived());

Thread.sleep(4000);
BaseTest.click(rp.getApply());

Thread.sleep(4000);
List<WebElement> demo4 = driver.findElements(By.xpath("//div[@class='id-name paddt5']"));
for (WebElement web : demo4) {
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("arguments[0].scrollIntoView(true);", web);

}

Thread.sleep(4000);
List<WebElement> demo5 = driver.findElements(By.xpath("//div[@class='id-name paddt5']"));
int total2 = demo5.size();
System.out.println("message received :"+total2);



Thread.sleep(4000);
driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-mailbox/ion-header/div[1]/ion-row/div")).click();

Thread.sleep(4000);
BaseTest.click(rp.getRequestreceived());

Thread.sleep(4000);
BaseTest.click(rp.getRequestreceived());

Thread.sleep(4000);
BaseTest.click(rp.getApply());


Thread.sleep(4000);
List<WebElement> demo6 = driver.findElements(By.xpath("//div[@class='id-name paddt5']"));
for (WebElement web : demo6) {
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("arguments[0].scrollIntoView(true);", web);

}

Thread.sleep(4000);
List<WebElement> demo7 = driver.findElements(By.xpath("//div[@class='id-name paddt5']"));
int total3 = demo7.size();
System.out.println("request received :"+total3);


Thread.sleep(4000);
driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-mailbox/ion-header/div[1]/ion-row/div")).click();

Thread.sleep(4000);
BaseTest.click(rp.getShowfilteredmessage());

Thread.sleep(4000);
BaseTest.click(rp.getRequestreceived());

Thread.sleep(4000);
BaseTest.click(rp.getApply());

Thread.sleep(4000);
List<WebElement> demo8 = driver.findElements(By.xpath("//div[@class='id-name paddt5']"));
for (WebElement web : demo8) {
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("arguments[0].scrollIntoView(true);", web);

}

Thread.sleep(4000);
List<WebElement> demo9 = driver.findElements(By.xpath("//div[@class='id-name paddt5']"));
int total4 = demo9.size();
System.out.println("getshow filtered message :"+total4);

	
// prime toggle handled

Thread.sleep(4000);
BaseTest.click(rp.getPrimetoggle());

Thread.sleep(4000);
BaseTest.click(rp.getAccepted());

//accepted
Thread.sleep(4000);
List <WebElement> edit123= driver.findElements(By.xpath("//div[@class='id-name paddt5']"));
for (WebElement web : edit) {
JavascriptExecutor js =(JavascriptExecutor)driver;		 
js.executeScript("arguments[0].scrollIntoView(true);",web);
}

	

Thread.sleep(4000); 
List <WebElement> ref134= driver.findElements(By.xpath("//div[@class='id-name paddt5']"));
int count145=ref134.size();
System.out.println("accepted1 :"+count145);

Thread.sleep(4000); 
List <WebElement> ref11= driver.findElements(By.xpath("//ion-grid[@class='list_item res_txt paddtb10 clra3 white_bg grid']"));
int count11=ref11.size();
System.out.println("accepted1 blocked :"+count11);

//declined
BaseTest.click(rp.getDeclined());

Thread.sleep(10000);
List <WebElement> edit11= driver.findElements(By.xpath("//div[@class='id-name paddt5']"));
for (WebElement web : edit11) {
JavascriptExecutor js =(JavascriptExecutor)driver;		 
js.executeScript("arguments[0].scrollIntoView(true);",web);
} 

Thread.sleep(6000); 
List <WebElement> ref21= driver.findElements(By.xpath("//div[@class='id-name paddt5']"));
int count21=ref21.size();
System.out.println("declined1 :"+count21);

Thread.sleep(6000); 
List <WebElement> ref31= driver.findElements(By.xpath("//ion-grid[@class='list_item res_txt paddtb10 clra3 white_bg grid']"));
int count31=ref31.size();
System.out.println("declined1 blocked :"+count31);

//Replied

BaseTest.click(rp.getReplied());

Thread.sleep(4000);
List <WebElement> edit21= driver.findElements(By.xpath("//div[@class='id-name paddt5']"));
for (WebElement web : edit21) {
JavascriptExecutor js =(JavascriptExecutor)driver;		 
js.executeScript("arguments[0].scrollIntoView(true);",web);
} 

Thread.sleep(4000); 
List <WebElement> ref41= driver.findElements(By.xpath("//div[@class='id-name paddt5']"));
int count41=ref41.size();
System.out.println("replied1 :"+count41);

Thread.sleep(4000); 
List <WebElement> ref51= driver.findElements(By.xpath("//ion-grid[@class='list_item res_txt paddtb10 clra3 white_bg grid']"));
int count51=ref51.size();
System.out.println("replied1 blocked :"+count51);

//SENT

Thread.sleep(6000);
driver.findElement(By.xpath("//span[contains(text(),'SENT')]")).click();

Thread.sleep(6000);
BaseTest.click(rp.getAccepted());

Thread.sleep(6000);
List <WebElement> edit31= driver.findElements(By.xpath("//div[@class='id-name paddt5']"));
for (WebElement web : edit31) {
JavascriptExecutor js =(JavascriptExecutor)driver;		 
js.executeScript("arguments[0].scrollIntoView(true);",web);
} 

Thread.sleep(6000); 
List <WebElement> ref61= driver.findElements(By.xpath("//div[@class='id-name paddt5']"));
int count61=ref61.size();
System.out.println("sent accepted :"+count61);

Thread.sleep(6000); 
try {
List <WebElement> ref7= driver.findElements(By.xpath("//ion-grid[@class='list_item res_txt paddtb10 clra3 white_bg grid']"));
int count7=ref7.size();
System.out.println("sent accepted blocked :"+count7);
} catch (Exception e2) {
System.out.println("no element");
}


//declined   //ion-grid[@class='list_item grid']  //ion-row[@class='row']	

Thread.sleep(6000);
BaseTest.click(rp.getDeclined());

Thread.sleep(5000);
List <WebElement> edit41= driver.findElements(By.xpath("(//div//ion-row[@class='row'])[90]"));
for (WebElement web : edit41) {
JavascriptExecutor js =(JavascriptExecutor)driver;		 
js.executeScript("arguments[0].scrollIntoView(true);",web);
} 

Thread.sleep(5000); 
List <WebElement> ref81= driver.findElements(By.xpath("//div//ion-row[@class='row']"));
int count81=ref81.size();
System.out.println("sent declined :"+count81);


Thread.sleep(7000);
List <WebElement> edit91= driver.findElements(By.xpath("//ion-grid[@class='list_item res_txt paddtb10 clra3 white_bg grid']"));
for (WebElement web : edit91) {
JavascriptExecutor js =(JavascriptExecutor)driver;		 
js.executeScript("arguments[0].scrollIntoView(true);",web);
} 

Thread.sleep(5000); 
try {
List <WebElement> ref9= driver.findElements(By.xpath("//ion-grid[@class='list_item res_txt paddtb10 clra3 white_bg grid']"));
int count9=ref9.size();
System.out.println("sent declined blocked :"+count9);

} catch (Exception e2) {
System.out.println("no element");
}

//Replied
Thread.sleep(5000);
BaseTest.click(rp.getReplied());

Thread.sleep(10000);
List <WebElement> edit51= driver.findElements(By.xpath("//div[@class='id-name paddt5']"));
for (WebElement web : edit51) {
JavascriptExecutor js =(JavascriptExecutor)driver;		 
js.executeScript("arguments[0].scrollIntoView(true);",web);
} 

Thread.sleep(6000); 
List <WebElement> ref101= driver.findElements(By.xpath("//div[@class='id-name paddt5']"));
int count101=ref101.size();
System.out.println("sent replied :"+count101);

Thread.sleep(6000);
try {

List <WebElement> ref111= driver.findElements(By.xpath("//ion-grid[@class='list_item res_txt paddtb10 clra3 white_bg grid']"));
int count111=ref111.size();
System.out.println("sent replied blocked :"+count111);

} catch (Exception e2) {
System.out.println("no element");
}  	
	
       }

}
