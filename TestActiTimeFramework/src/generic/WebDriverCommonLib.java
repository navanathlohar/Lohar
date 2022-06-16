package generic;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class WebDriverCommonLib extends BaseTest {
	
      //reusable operational method
	
	public String getTheTitleOfWebPage()
	{
		String titleOfTheWebpage = driver.getTitle();
		return titleOfTheWebpage;
	}

	public void verifyThePageTitl(String expectedTitle,String pageName)
	{
		String actualTitle = driver.getTitle();

		if(expectedTitle.equalsIgnoreCase(actualTitle))
		{
			System.out.println(pageName+"is verified");
		}
		else
		{
			System.out.println(pageName+"is not verified");
		}
	}

	//mousehover
	public void mouseHover(WebElement target)
	{
		Actions act = new Actions(driver);
		act.contextClick(target).perform();
	}
	public void rightClick(WebElement target)
	{
		Actions act = new Actions(driver);
		act.contextClick(target).perform();
	}
	public void doubleClick(WebElement target)
	{
		Actions act = new Actions(driver);
		act.contextClick(target).perform();
	}
	public void dragAndDrop(WebElement src, WebElement target)
	{
		Actions act = new Actions(driver);
		act.dragAndDrop(src, target).perform();
	}

	//handle the frame
	public void switchToFrame(int index)
	{
		driver.switchTo().frame(index);
	}

	public void switchToFrame(String nameOrld)
	{
		driver.switchTo().frame(nameOrld);
	}

	public void switchToFrame(WebElement frameElement)
	{
		driver.switchTo().frame(frameElement);
	}


	//handling dropdown
	public void selectTheOption(WebElement element , int index)
	{
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}
	public void selectTheOption(WebElement element , String value)
	{
		Select sel = new Select(element);
		sel.selectByValue(value);
	}
	public void selectTheOption(String visibleText,WebElement element)
	{
		Select sel = new Select(element);
		sel.selectByVisibleText(visibleText);
	}

	public void getAllOptionsDropdown(WebElement element)
	{
		Select sel = new Select(element);
		List<WebElement> ops = sel.getOptions();

		for(WebElement option:ops)
		{
			String text = option.getText();
			System.out.println();
		}
	}

	public void explicitlyWait(String title)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(40));
		wait.until(ExpectedConditions.titleContains(title));
	}

	//to perform scroll operations
	public void scrollRight(int pixels)
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("windowscrollby,("+pixels+",0)");
	}

	public void scrollLeft(int pixels)
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("windowscrollby,("+-pixels+",0)");
	}

	public void scrollUp(int pixels)
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("windowscrollby,("+-pixels+",0)");
	}

	public void scrollTillParticularWebElement(WebElement element)
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		Point point = element.getLocation();
		int xaxis = point.getX();
		int yaxis = point.getY();

		jse.executeScript("windowscrollby("+xaxis+","+yaxis+")");
	}

	public void takeScreenShotOfTheWebPage(String fileName) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(SCREENSHOT_PATH+fileName+".png");
		Files.copy(src, dest);
	}

	//accept the alert popup
	public void acceptAlertPopup() 
	{
		Alert al = driver.switchTo().alert();
		al.accept();
	}

	public void acceptConfirmationPopUp() 
	{
		Alert al = driver.switchTo().alert();
		al.accept();
	}

	public void dismissConfirmationPopUp() 
	{
		Alert al = driver.switchTo().alert();
		al.accept();
	}
	public String getTheWindowHandle()
	{
		String parentHandle = driver.getWindowHandle();
		return parentHandle;
	}
	public void getTheWindowHandles()
	{
		Set<String> handles = driver.getWindowHandles();
		for(String h:handles)
		{
			System.out.println(h);
		}

	}

	public void refreshTheBrowser() 
	{
		driver.navigate().refresh();
	}








}
