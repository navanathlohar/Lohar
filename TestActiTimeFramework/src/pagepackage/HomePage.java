package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	//declaration
	@FindBy(xpath="//a[@class='logout']") private WebElement logout;
	@FindBy(xpath ="//a[.='Create new tasks']") private WebElement createNewTask;
	@FindBy(linkText = "Settings") private WebElement settings;
	@FindBy(id="SubmitTTButton") private WebElement saveLeaveTimeBtn;
	@FindBy(xpath="//a[text()='Enter Time-Track']") private WebElement entertimetrack;
	
	
	//initialization
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

     //utilization

	public WebElement getLogout() {
		return logout;
	}


	public WebElement getCreateNewTask() {
		return createNewTask;
	}


	public WebElement getSettings() {
		return settings;
	}


	public WebElement getSaveLeaveTimeBtn() {
		return saveLeaveTimeBtn;
	}


	public WebElement getEntertimetrack() {
		return entertimetrack;
	}

	//   operational method
	public void clickLogout() 
	{
		logout.click();
	}
	public void clickSaveLeaveTimeBtn()
	{
		saveLeaveTimeBtn.click();
	}

	

}
