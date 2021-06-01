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
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;
import java.net.MalformedURLException;
import java.util.logging.Level;

public class PrimeListing extends BaseTest {
	//public static WebDriver driver;
	public static String upgrade;
	public static String name;

	// String driverExecutablePath =
	// "C:\\Users\\NireshKumar-47908\\eclipse-workspace\\PWA\\drivernew\\chromedriver.exe";

	private String reportDirectory = "reports";
	private String reportFormat = "xml";
	private String testName = "Untitled";
	protected AndroidDriver<AndroidElement> driver = null;

	DesiredCapabilities dc = new DesiredCapabilities();

	ExtentReports report;
	ExtentTest logger;

	@BeforeTest
	public void setUp1() throws MalformedURLException {
		dc.setCapability("reportDirectory", reportDirectory);
		dc.setCapability("reportFormat", reportFormat);
		dc.setCapability("testName", testName);
		dc.setCapability(MobileCapabilityType.UDID, "52003132ecda25f7");
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.community.matrimony");
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.domaininstance.ui.activities.Splash");
		driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), dc);
		driver.setLogLevel(Level.INFO);

	}

	@Test
	public void testUntitled() throws Throwable {
		Login_Pom l1 = new Login_Pom(driver);
		PrimeListingPom rp = new PrimeListingPom(driver);
		Thread.sleep(5000);
		try {
			Thread.sleep(2000);
			// b.login123("AGR11", "cbstest");
			Thread.sleep(5000);
			BaseTest.click(l1.getLogin_skip_btn());
			Thread.sleep(2000);
			BaseTest.click(l1.getLogin_btn());

			// Base.click(l.getEnter_Matrid());
			Thread.sleep(2000);
			BaseTest.typeData(l1.getEnter_Matrid(), "CHY458603");
			Thread.sleep(2000);
			BaseTest.typeData(l1.getEnter_passwrd(), "cbstest");
			Thread.sleep(2000);
			BaseTest.click(l1.getEnter_Login());

			// Base.login123("SOU143878", "cbstest");
			System.out.println("login succesffully completed.....");
		} catch (Exception e) {
			System.out.println("Already Login.................");
		}

		Thread.sleep(10000);

		Thread.sleep(4000);
		WebElement e = driver.findElement(By.xpath("//*[@id='idEmail']"));
		e.click();
		Thread.sleep(4000);
		e.sendKeys("agr500225");

		Thread.sleep(4000);
		WebElement d = driver.findElement(By.xpath("//*[@id='password1']"));
		d.click();
		Thread.sleep(4000);
		d.sendKeys("cbstest");

		Thread.sleep(4000);
		BaseTest.click(rp.getLogin());

		try {
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\"content\"]/app-dailyrecommendation/div")).click();
			Thread.sleep(4000);
			driver.findElement(
					By.xpath("//*[@id=\"content\"]/app-dailyrecommendation/ion-header/ion-toolbar/ion-back-button"))
					.click();
		} catch (Exception e2) {
			System.out.println("no daily matches tab");
		}

		Thread.sleep(4000);
		BaseTest.click(rp.getMatches());

		Thread.sleep(4000);
		BaseTest.click(rp.getGotit());

		Thread.sleep(4000);
		BaseTest.click(rp.getPrimetoggle());

		Thread.sleep(4000);
		BaseTest.click(rp.getStaricon());

		Thread.sleep(4000);
		WebElement upgrade = driver.findElement(By.xpath("//*[@id=\"ion-overlay-4\"]/div/app-modal/ion-content/div/div/ion-grid[2]/ion-row[5]/ion-col/div/ion-button"));
		String name = upgrade.getText();
		System.out.println(name);

		Thread.sleep(8000);
		JavascriptExecutor js41 = (JavascriptExecutor) driver;
		WebElement edi41 = driver.findElement(By.xpath("(//ion-button[contains(text(),'Skip')])[3]"));
		js41.executeScript("arguments[0].scrollIntoView(true);", edi41);

		try {
			Thread.sleep(4000);
			BaseTest.click(rp.getSkip());

			Thread.sleep(4000);
			WebElement upgrade1 = driver.findElement(By.xpath("//*[@id=\"ion-overlay-4\"]/div/app-modal/ion-content/div/div/ion-grid[2]/ion-row[5]/ion-col/div/ion-button"));
			String name1 = upgrade1.getText();
			System.out.println(name1);
		} catch (Exception e2) {
			// TODO: handle exception
		}

		try {
			Thread.sleep(4000);
			BaseTest.click(rp.getSendmessage());

			Thread.sleep(4000);
			WebElement upgrade1 = driver.findElement(By.xpath(
					"//*[@id=\"ion-overlay-4\"]/div/app-modal/ion-content/div/div/ion-grid[2]/ion-row[5]/ion-col/div/ion-button"));
			String name1 = upgrade1.getText();
			System.out.println(name1);
		} catch (Exception e2) {
			// TODO: handle exception
		}

		Thread.sleep(4000);
		BaseTest.click(rp.getProfileclick());

		Thread.sleep(4000);
		BaseTest.click(rp.getViewprofile());

		try {
			BaseTest.click(rp.getRequest());
			Thread.sleep(4000);
			WebElement upgrade1 = driver.findElement(By.xpath(
					"//*[@id=\"ion-overlay-4\"]/div/app-modal/ion-content/div/div/ion-grid[2]/ion-row[5]/ion-col/div/ion-button"));
			String name1 = upgrade1.getText();
			System.out.println(name1);
		} catch (Exception e2) {
			// TODO: handle exception
		}

		try {
			BaseTest.click(rp.getViewhoroscope());
			Thread.sleep(4000);
			WebElement upgrade1 = driver.findElement(By.xpath(
					"//*[@id=\"ion-overlay-4\"]/div/app-modal/ion-content/div/div/ion-grid[2]/ion-row[5]/ion-col/div/ion-button"));
			String name1 = upgrade1.getText();
			System.out.println(name1);
		} catch (Exception e2) {
			// TODO: handle exception
		}

		Thread.sleep(4000);
		WebElement education = driver.findElement(By.xpath(
				"//*[@id=\"content\"]/app-vp/super-tabs/super-tabs-container/super-tab/app-viewprofile/ion-content/ion-grid[1]/div/ion-row[2]/ion-col/ion-grid[2]/ion-row[12]/ion-col/ion-grid[1]/ion-row[2]/ion-col[2]"));
		String education1 = education.getText();
		System.out.println(education1);

	}
}
