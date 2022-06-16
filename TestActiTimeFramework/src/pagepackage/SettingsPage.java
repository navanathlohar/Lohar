package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SettingsPage {

	//declaration
	@FindBy(xpath="//div[text()='Settings']") private WebElement settings;
	@FindBy(name="firstHierarchyLevelCode") private WebElement customer;
	@FindBy(name="secondHierarchyLevelCode") private WebElement project;
	@FindBy(name="thirdHierarchyLevelCode") private WebElement task;

	//initialization
	public SettingsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//utilization

	public WebElement getSettings() {
		return settings;
	}

	public WebElement getCustomer() {
		return customer;
	}

	public WebElement getProject() {
		return project;
	}


	public WebElement getTask() {
		return task;
	}


	//operational method
	public void settingpage() 
	{
		settings.click();
	}





}
