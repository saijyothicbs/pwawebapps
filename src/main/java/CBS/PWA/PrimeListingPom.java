package CBS.PWA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrimeListingPom extends BaseTest{
	public PrimeListingPom(WebDriver driver) {
	PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="//*[@id='idEmail']")
	private WebElement username;
	
	@FindBy(xpath="//*[@id='password1']")
	private WebElement password;
	
	@FindBy(xpath="//*[@id='login-button']")
	private WebElement login;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
	
	@FindBy(xpath="//*[@id=\"content\"]/app-profile/ion-content/ion-grid/ion-row/ion-col/ion-list/ion-menu-toggle[2]/ion-item")
	private WebElement matches;

	public WebElement getMatches() {
		return matches;
	}
	
	@FindBy(xpath="//*[@id=\"content\"]/app-dashboard/div[1]/div")
	private WebElement gotit;

	public WebElement getGotit() {
		return gotit;
	}
	
	@FindBy(xpath="//*[@id=\"content\"]/app-dashboard/ion-header/ion-toolbar/ion-grid/ion-row[1]/div/ion-button[2]")
    private WebElement primetoggle;

	public WebElement getPrimetoggle() {
		return primetoggle;
	}
	
	@FindBy(xpath="(//ion-button[contains(text(),'Skip')])[3]")
	private WebElement skip;

	public WebElement getSkip() {
		return skip;
	}
	
	@FindBy(xpath="//*[@id=\"content\"]/app-dashboard/super-tabs/super-tabs-container/super-tab[3]/app-list/ion-content/ion-list/div[1]/div[2]/ion-grid/ion-row[1]/ion-col/div[3]/div[1]/ion-icon")
	private WebElement staricon;

	public WebElement getStaricon() {
		return staricon;
	}
	
	@FindBy(xpath="//*[@id=\"content\"]/app-dashboard/super-tabs/super-tabs-container/super-tab[3]/app-list/ion-content/ion-list/div[1]/div[2]/ion-grid/ion-row[3]/ion-col/ion-button[2]")
	private WebElement sendmessage;

	public WebElement getSendmessage() {
		return sendmessage;
	}
	
	@FindBy(xpath="//*[@id=\"content\"]/app-dashboard/super-tabs/super-tabs-container/super-tab[3]/app-list/ion-content/ion-list/div[1]/div[1]/ion-grid/ion-row[2]/ion-col[1]/div[1]")
	private WebElement profileclick;

	public WebElement getProfileclick() {
		return profileclick;
	}
	
	@FindBy(xpath="//*[@id=\"ion-overlay-10\"]/div/app-gallery/ion-header/ion-toolbar/ion-button//button/ion-ripple-effect")
	private WebElement viewprofile;

	public WebElement getViewprofile() {
		return viewprofile;
	}
	
	@FindBy(xpath="//*[@id=\"content\"]/app-vp/super-tabs/super-tabs-container/super-tab/app-viewprofile/ion-content/ion-grid[1]/div/ion-row[2]/ion-col/ion-grid[2]/ion-row[12]/ion-col/ion-grid[1]/ion-row[2]/ion-col[2]")
	private WebElement education;

	public WebElement getEducation() {
		return education;
	}
	
	@FindBy(xpath="//*[@id=\"horoscope\"]/ion-col/ion-grid/ion-row[7]/ion-col[2]")
	private WebElement request;

	public WebElement getRequest() {
		return request;
	}
	

	@FindBy(xpath="//*[@id=\"horoscope\"]/ion-col/ion-grid/ion-row[7]/ion-col[2]")
	private WebElement viewhoroscope;

	public WebElement getViewhoroscope() {
		return viewhoroscope;
	}
	
	
    
	
	
	
	
	
	
	
	
	
}
