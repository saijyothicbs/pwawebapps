package CBS.PWA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrimeSearchpom {
	public PrimeSearchpom(WebDriver driver) {
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
	
	
	@FindBy(xpath="//*[@id=\"content\"]/app-search/ion-footer/app-footer/ion-footer/ion-toolbar/ion-grid/ion-row/ion-col[4]")
	private WebElement search;

	public WebElement getSearch() {
		return search;
	}
	
	@FindBy(xpath="//span[@class='ficon icon-tick-select padd5']")
	private WebElement tick;

	public WebElement getTick() {
		return tick;
	}
    
	
	
	
	
	

}
