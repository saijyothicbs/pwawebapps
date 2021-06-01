package CBS.PWA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrimeMailboxpom extends BaseTest {
	public PrimeMailboxpom(WebDriver driver) {
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

	public WebElement getGotit() {
		return gotit;
	}

	@FindBy(xpath="//*[@id=\"content\"]/app-dashboard/ion-footer/app-footer/ion-footer/ion-toolbar/ion-grid/ion-row/ion-col[3]")
	private WebElement mailbox;

	public WebElement getMailbox() {
		return mailbox;
	}

	@FindBy(xpath="//div[contains(text(),'GOT IT')]")
	private WebElement gotit;

	@FindBy(xpath="//ion-segment-button[contains(text(),'ACCEPTED')]")
	private WebElement accepted;
	
	@FindBy(xpath="//ion-segment-button[contains(text(),'DECLINED')]")
	private WebElement declined;
	
	public WebElement getAccepted() {
		return accepted;
	}

	public WebElement getDeclined() {
		return declined;
	}

	public WebElement getReplied() {
		return replied;
	}


	@FindBy(xpath="//ion-segment-button[contains(text(),'REPLIED')]")
	private WebElement replied;
	
	@FindBy(xpath="//*[@id='checkbox-47-0']/span")
	private WebElement all;
	
	@FindBy(xpath="//*[@id='checkbox-20-0']/span")
	private WebElement interestreceived;
	
	@FindBy(xpath="//*[@id='checkbox-21-0']/span")
	private WebElement messagereceived;
				
	@FindBy(xpath="//*[@id='checkbox-22-0']/span")
	private WebElement requestreceived;
	
	public WebElement getAll() {
		return all;
	}

	public WebElement getInterestreceived() {
		return interestreceived;
	}

	public WebElement getMessagereceived() {
		return messagereceived;
	}

	public WebElement getRequestreceived() {
		return requestreceived;
	}

	public WebElement getShowfilteredmessage() {
		return showfilteredmessage;
	}


	@FindBy(xpath="//*[@id='checkbox-23-0']/span")
	private WebElement showfilteredmessage;
	
	
	public WebElement getApply() {
		return apply;
	}


	@FindBy(xpath="//*[@id='contactFilterPanel']/div/ion-footer/div")
	private WebElement apply;
	
	@FindBy(xpath="//*[@id='contactFilterPanel']/div/ion-footer/div")
	private WebElement primetoggle;

	public WebElement getPrimetoggle() {
		return primetoggle;
	}
	
	

}
