package Com.Utilities;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.Element;

import jxl.format.Border;
import Com.ObjectRepository.Registration_OR;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;

public class CommonMethods extends Registration_OR{
	
	WebDriver driver;
	
	Steps steps = new Steps();
	
	Screenshot screen = new Screenshot();

	public String strAbsolutepath = new File("").getAbsolutePath();
	
	HSSFWorkbook workbook;

	HSSFSheet sheet;
	
	String strDataFileName = this.getClass().getSimpleName();
	
	Map<String, Object[]> testresultdata; 

	Screenshot screenshot = new Screenshot();

	String passstatus = screenshot.status("PASS");

	String failstatus = screenshot.status("FAIL");
	
	String name= "";
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	
	
	
	
	public void HISLogin(WebDriver driver)
	{
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		int num;
		try
		{
			/*steps.EnterText(username, driver, strDataFileName, "username", name);
			
			steps.EnterText(password, driver, strDataFileName, "password", name);
			
			steps.clickButton(login_button, driver, name);
			
			System.out.println("Login successfull");
			*/
						
		}
		catch(Exception e)
		{
			System.out.println("Login unsuccessfull");
		}
	}
	public void ProductionURL(WebDriver driver)
	{
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		
		try
		{
			//steps.OpenUrl(driver, strDataFileName, "URL", name);
			
			//System.out.println("URL Navigated Successfully");
			
			By prod = getProd_Username();


			steps.EnterText(prod, driver, strDataFileName, "username", name);
			
			//getProd_Username(Prod_Username);
			
			
			steps.EnterText(Prod_Password, driver, strDataFileName, "password", name);
			
			steps.clickButton(Prod_Login, driver, name);
			
			steps.MoveElement(Prod_App, driver, name);
			
			steps.clickButton(Prod_HIS, driver, name);
			
			steps.ChildWindow(driver);
			
			System.out.println("Login successfully");
			
			Thread.sleep(5000);
			
			driver.manage().window().maximize();
		}
		catch(Exception e)
		{
			System.out.println("Login Failed");
			
			steps.logger("CommonMethods","ProductionURL", "Login Failed : :" + e);

		}
	
	}
	public void PortalLogin(WebDriver driver , String URL)
	{
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		
		try
		{
			steps.OpenUrl(driver, strDataFileName, URL, name);
			
			String text = "Click Here To Login";
			
			System.out.println(text);
			
		//cmd	assertEquals(text, "test");
			
			
		}
		catch(Exception e)
		{
			System.out.println("Employer Portal is not opened");
		}
	}
	public void AdminServices(WebDriver driver)
	{
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		
		try
		{
			steps.MoveElement(Prod_App, driver, name);
			
			steps.clickButton(Prod_HIS, driver, name);
			
			steps.ChildWindow(driver);
			
			steps.waitForElement(Location, driver);
			
			steps.selectDropdown(Location, driver, strDataFileName, "location", name);
			
			steps.selectDropdown(facility, driver, strDataFileName, "facility", name);
			
			steps.clickButton(sumbit, driver, name);
			
			System.out.println("Administrative Services facility selected");
		}
		catch(Exception e)
		{
			System.out.println("Administrative Services facility not selected");
		}
	}
	
	
	
	public void SearchWindow(WebDriver driver)
	{
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		
		try
		{
			/*steps.selectDropdown(SearchDD, driver, strDataFileName, "UHIDdd", name);
			
			Actions act = new Actions(driver);
			
			act.sendKeys(Keys.ENTER).pause(1000).build().perform();*/
			
			steps.EnterText(SearchText, driver, strDataFileName, "UHIDTxt", name);
			
			steps.clickButton(Searchbtn, driver, name);
			
			Thread.sleep(3000);
			
			steps.waitForElement(Searchradio, driver);
			
			steps.clickButton(Searchradio, driver, name);
			
			steps.clickButton(Searchselect, driver, name);
			
			Thread.sleep(2000);
			
			System.out.println("Data Searched Successfull");
		}
		catch(Exception e)
		{
			System.out.println("Data Search UnSuccessfull");
			
			steps.logger("CommonMethods","SearchWindow", "Data Search UnSuccessfull : :" + e);

		}
	}
	
}
