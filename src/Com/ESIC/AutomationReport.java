package Com.ESIC;

import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.apache.poi.ss.usermodel.CellStyle;
import java.util.List;

import org.apache.poi.hssf.model.InternalWorkbook;
import org.apache.poi.hssf.record.ExtendedFormatRecord;
import org.apache.poi.hssf.record.FontRecord;
import org.apache.poi.hssf.record.FormatRecord;
import org.apache.poi.hssf.record.StyleRecord;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.hssf.util.HSSFColor.HSSFColorPredefined;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.VerticalAlignment;


import Com.ObjectRepository.CLM_OR;
import Com.Utilities.Browsers;
import Com.Utilities.CommonMethods;
import Com.Utilities.Screenshot;
import Com.Utilities.Steps;
import jxl.format.Border;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.*;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
//import javax.mail.*;
import javax.mail.*;
import javax.mail.internet.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import Com.Data.ReadDataFile;
//import Com.ESIC.SendMailFinal.SMTPAuthenticator;
import Com.ObjectRepository.CLM_OR;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


public class AutomationReport extends CLM_OR{


	WebDriver driver;

	Steps steps = new Steps();

	Screenshot screen = new Screenshot();

	CommonMethods commonmethods = new CommonMethods();

	//SendMailFinal SendMailFinal = new SendMailFinal();

	private String from;
	// private String to;
	// String []to ;
	private String subject;
	private String messageBody;
	private String fileName;
	private String host;
	private String port;
	ReadDataFile readData = new ReadDataFile();
	public String strAbsolutepath = new File("").getAbsolutePath();
	private String strDataPath = strAbsolutepath + "/data/";
	private String strFilePath = strAbsolutepath + "/TestResults/";

	//HISDailyRegressionFlow HISDailyRegressionFlow = new HISDailyRegressionFlow();



	int rownumber= 1;

	List<String> to= new ArrayList();
	//ArrayList to = new ArrayList();
 	List<String> cc= new ArrayList();
	//  List<String> array= new ArrayList();


	private Properties properties;

	private MimeMessage message;
	private BodyPart messageBodyPart;
	private Multipart multipart;

	private Authenticator authenticator;



	//	public String strAbsolutepath = new File("").getAbsolutePath();

	HSSFWorkbook workbook;

	HSSFSheet sheet;

	String strDataFileName = this.getClass().getSimpleName();

	Map<String, Object[]> testresultdata; 

	//Screenshot screenshot = new Screenshot();

	String passstatus = screen.status("PASS");

	String failstatus = screen.status("FAIL");

	public String finalstatusText = "";

	public String statusfinal = "";

	String UHID = "";

	String IPNumber = "";

	int cnt = 2;
//test
	int finalstatus = 0;

	String MyesicLoginStatus = "";
	String LocationStatus = "";
	String DoctorWorklistStatus = "";
	String PrescriptionStatus = "";
	String FUPStatus = ""; 
	String CheckINStatus = "";
	String DiagnosisStatus = "";
	String	CasesheetStatus = "";
	String PortalLoginStatus = "";
	String UserLoginStatus = "";
	String LogoutStatus = "";
	
	//String LogoutStatus = "";

	
	String Mainpage = "";

	private String StrExecutionStartTime = null;
	private String strStopTime = null;	
	float timeElapsed ;
	String  ExecutionTime ="";

	private String LocationExecutionStartTime = null;
	private String LocationStopTime = null;	
	float LocationtimeElapsed ;
	String  LocationExecutionTime ="";



	private String MyesicExecutionStartTime = null;
	private String MyesicStopTime = null;	
	float MyesictimeElapsed ;
	String  MyesicExecutionTime ="";

	private String CheckinExecutionStartTime = null;
	private String CheckinStopTime = null;	
	float CheckintimeElapsed ;
	String  CheckinExecutionTime ="";


	private String DrWorklistExecutionStartTime = null;
	private String DrWorklistStopTime = null;	
	float DrWorklisttimeElapsed ;
	String  DrWorklistExecutionTime ="";


	private String CaseSheetExecutionStartTime = null;
	private String CaseSheetStopTime = null;	
	float CaseSheettimeElapsed ;
	String  CaseSheetExecutionTime ="";

	private String StrportalLoginStartTime = null;
	private String StrportalStopTime = null;	
	float StrportaltimeElapsed ;
	String  StrportalExecutionTime ="";
	
	private String StrUserLoginStartTime = null;
	private String StrUserStopTime = null;	
	float StrUsertimeElapsed ;
	String  StrUserExecutionTime ="";
	
	private String LogoutStartTime = null;
	private String LogoutStopTime = null;	
	float LogouttimeElapsed ;
	String  LogoutExecutionTime ="";

	//@Parameters("browser")
	public AutomationReport()

	{
		Browsers b = new Browsers();
		this.driver = b.getBrowsers("FF");		 
	}


	@Test(priority=0)
	public void PortalLogin() throws InterruptedException
	{
		String name = new Object(){}.getClass().getEnclosingMethod().getName();

		cnt ++;

		try
		{
			StrportalLoginStartTime = steps.start();
			
			System.out.println(StrportalLoginStartTime);
			
			commonmethods.PortalLogin(driver, "PortalURL");
			
			String text = "Click Here To Login123";
			
			//String texthjhgjjhhj123 = "Click Here To Login test";

			int status = 0;

			int state = steps.Verifytext(ClickHeretoLogin, driver, text, status);
			
			if (state == 1)
			{
				PortalLoginStatus = passstatus;
				
				finalstatus++;
			}
			else
			{
				PortalLoginStatus = failstatus;

			}
						
			StrportalStopTime = steps.stop();

			StrportaltimeElapsed = steps.getElapsedTime();

			StrportalExecutionTime = steps.ExecutionTime(StrportaltimeElapsed);
						
			StrUserLoginStartTime = steps.start();

		//	Thread.sleep(2000);

			//steps.OpenUrl(driver);

			//driver.get("www.esic.in");

			/*commonmethods.PortalLogin(driver, "PortalURLL");
			
			String portalloginText = "User Login";
			
			int portalstatus = 0;
			
			int portalstate = steps.Verifytext(ESIC_Text, driver, portalloginText, portalstatus);
			
			if (portalstate == 1)
			{
				UserLoginStatus = passstatus;
				
				finalstatus++;
			}
			else
			{
				UserLoginStatus = failstatus;

			}
			

			//Thread.sleep(2000);
*/		}
		catch(Exception e)
		{
			System.out.println("Employer Portal Failed");

			PortalLoginStatus = failstatus;
		}
		StrUserStopTime = steps.stop();
		
		StrUsertimeElapsed = steps.getElapsedTime();
		
		StrUserExecutionTime = steps.ExecutionTime(StrUsertimeElapsed);
	}


	@Test(priority=1) //testfsfd
	public void Myesic()
	{
		MyesicExecutionStartTime = steps.start();

		String name = new Object(){}.getClass().getEnclosingMethod().getName();

		cnt ++;
		try
		{
			//commonmethods.ProductionURL(driver);

			commonmethods.PortalLogin(driver, "PortalURL");

			MyesicLoginStatus =  passstatus;

			finalstatus++;

		
		}
		catch(Exception e)
		{
			System.out.println("Myesic login failed");
			
			MyesicLoginStatus = failstatus;
		}
		
		MyesicStopTime = steps.stop();

		MyesictimeElapsed = steps.getElapsedTime();

		MyesicExecutionTime = steps.ExecutionTime(MyesictimeElapsed);

	}

	//@Test(priority=2)
	public void LoacationFacility()
	{
		LocationExecutionStartTime = steps.start();

		String name = new Object(){}.getClass().getEnclosingMethod().getName();

		cnt ++;
		try
		{
			Mainpage = driver.getWindowHandle();
			commonmethods.AdminServices(driver);

			LocationStatus = passstatus;

			finalstatus++;

			
		}
		catch(Exception e)
		{
			System.out.println("Location and Facility hasn't selected");
			
			LocationStatus = failstatus;
		}
		
		LocationStopTime = steps.stop();

		LocationtimeElapsed = steps.getElapsedTime();

		LocationExecutionTime = steps.ExecutionTime(LocationtimeElapsed);

	}

	////@Test(priority=3)
	public void PatientCheckIn()
	{
		//CheckinExecutionStartTime = steps.start();

		String name = new Object(){}.getClass().getEnclosingMethod().getName();

		cnt++;

		try
		{
			steps.MoveElement(Registration_link, driver, name);

			steps.clickButton(Patient_CheckIn, driver, name);

			steps.clickButton(UHID_Search, driver, name);

			commonmethods.SearchWindow(driver);
			
			driver.findElement(PC_Save).isEnabled();			

			steps.waitForElement(PC_Specialisation, driver);

			steps.selectDropdown(PC_Specialisation, driver, strDataFileName, "Specialisation", name);

			Actions act = new Actions(driver);

			steps.waitForElement(PC_OK, driver);

			Thread.sleep(2000);

			act.moveToElement(driver.findElement(PC_OK)).pause(1000).click().build().perform();

			//	Thread.sleep(6000);

			steps.waitForElement(cancelcheckIn, driver);
			
			steps.waitForElement(PC_Save, driver);
			
			CheckinExecutionStartTime = steps.start();

			act.moveToElement(driver.findElement(PC_Save)).pause(1000).click().build().perform();

			steps.waitForElement(PC_printCancel, driver);

			steps.clickButton(PC_printCancel, driver, name);

			IPNumber = driver.findElement(PC_IPnumber).getAttribute("value");

			System.out.println(IPNumber);

			//	Thread.sleep(1000);

			System.out.println("Patient CheckIn Successful");

			CheckINStatus = passstatus;

			finalstatus++;

		
		}
		catch(Exception e)
		{
			System.out.println("Patient CheckIn Failed");
			
			CheckINStatus = failstatus;
		}
		
		CheckinStopTime = steps.stop();

		CheckintimeElapsed = steps.getElapsedTime();

		CheckinExecutionTime = steps.ExecutionTime(CheckintimeElapsed);
	}

	////@Test(priority = 4)
	public void DrWorklist()
	{
		DrWorklistExecutionStartTime = steps.start();

		String name = new Object(){}.getClass().getEnclosingMethod().getName();

		cnt ++;
		try
		{
			steps.MoveElement(CLM_menu, driver, name);

			steps.waitForElement(CLM_DoctorWorklist, driver);

			steps.clickButton(CLM_DoctorWorklist, driver, name);

			steps.waitForElement(CLM_CheckInNoo, driver);

			System.out.println("Doctor Worklist Opened Successful");

			DoctorWorklistStatus = passstatus;

			
		}
		catch(Exception e)
		{
			System.out.println("DrWorklist is failed");
			
			DoctorWorklistStatus = failstatus;
		}
		DrWorklistStopTime = steps.stop();

		DrWorklisttimeElapsed = steps.getElapsedTime();

		DrWorklistExecutionTime = steps.ExecutionTime(DrWorklisttimeElapsed);
	}

	////@Test(priority = 5)
	public void Casesheet()
	{
		CaseSheetExecutionStartTime = steps.start();

		String name = new Object(){}.getClass().getEnclosingMethod().getName();

		cnt ++;
		try
		{
			steps.clickJSButton(CLM_CheckInNoo, driver, name);

			steps.Verifytext(CLM_CS_ComplaintsPanel, driver, "COMPLAINTS AND HISTORY", name);

			System.out.println("Patient Casesheet Opened Successful");

			System.out.println(CLM_CS_ComplaintsPanel);

			CasesheetStatus = passstatus;

			finalstatus ++;

			
		}
		catch(Exception e)
		{
			System.out.println("Casesheet is failed");
			
			CasesheetStatus = failstatus;
		}
		
		CaseSheetStopTime = steps.stop();

		CaseSheettimeElapsed = steps.getElapsedTime();

		CaseSheetExecutionTime = steps.ExecutionTime(CaseSheettimeElapsed);
	}

	//@Test(priority = 6)
	public void Logout()
	{
		LogoutStartTime = steps.start();

		String name = new Object(){}.getClass().getEnclosingMethod().getName();

		cnt ++;
		try
		{
			String beforeClose = driver.getWindowHandle();
			System.out.println("beforeClose : " +beforeClose);
			
			driver.close();
			
			driver.switchTo().window(Mainpage);
			
			driver.switchTo().defaultContent();
			
			String afterclose = driver.getWindowHandle();
			
			System.out.println("afterclose : " +afterclose);
			
			steps.clickJSButton(Logout, driver, name);

			steps.Verifytext(verifyLoginText, driver, "Please Login with your credentials", name);

			System.out.println("User is Logged Out");

			//System.out.println(CLM_CS_ComplaintsPanel);

			LogoutStatus = passstatus;

			finalstatus ++;

		
		}
		catch(Exception e)
		{
			System.out.println("Logout is failed");
			
			CasesheetStatus = failstatus;
		}
		
		LogoutStopTime = steps.stop();

		LogouttimeElapsed = steps.getElapsedTime();

		LogoutExecutionTime = steps.ExecutionTime(LogouttimeElapsed);
	}





	@BeforeClass
	public void before()
	{
		workbook = new HSSFWorkbook();

		sheet = workbook.createSheet(strDataFileName);

		testresultdata = new LinkedHashMap<String, Object[]>();

		testresultdata.put("1", new Object[] { "Test Step Name", "Expected Result","Actual Result" ,"Status"});

		StrExecutionStartTime = steps.Executionstart();

	}
	@AfterClass
	public void after() throws Exception
	{


		Set<String> keyset = testresultdata.keySet();
		int rownum = 0;
		for (String key : keyset) {
			Row row = sheet.createRow(rownum++);
			Object [] objArr = testresultdata.get(key);
			int cellnum = 0;
			for (Object obj : objArr) {
				Cell cell = row.createCell(cellnum++);
				if(obj instanceof Date) 
					cell.setCellValue((Date)obj);
				else if(obj instanceof Boolean)
					cell.setCellValue((Boolean)obj);
				else if(obj instanceof String)
					cell.setCellValue((String)obj);
				else if(obj instanceof Double)
					cell.setCellValue((Double)obj);

			}
		}
		try {
			strStopTime = steps.exestop();

			timeElapsed = steps.getExecutionElapsedTime();

			ExecutionTime = steps.ExecutionTime(timeElapsed);

			FileOutputStream out = new FileOutputStream(new File("TestResults\\"+strDataFileName +".xls"));

			workbook.write(out);

			out.close();

			System.out.println("Excel written successfully..");

			TestResult();

			Thread.sleep(10000);

			statusfinal = FinalStatus();

		//	SendMail();

			driver.quit();

		}

		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

	//	@AfterClass
	////@Test(priority = 1)
	public void afterclass() throws Exception
	{

		SendMail();

	}


	public String FinalStatus() throws Exception
	{
		if(finalstatus ==7)
		{
			finalstatusText = passstatus;
		}

		else
		{
			finalstatusText=failstatus;
		}
		return finalstatusText;
	}



	public void TestResult() throws Exception
	{
		HSSFRow row;

		HSSFCell cell;

		WritableFont cellFont;

		WritableCellFormat cellFormat;

		Border border = null;

		int count;

		FileInputStream inp = new FileInputStream("TestResults\\"+strDataFileName+".xls");

		HSSFWorkbook wb = new HSSFWorkbook(inp);

		HSSFSheet sh = wb.getSheetAt(0);

		count=sh.getLastRowNum();

		for (int i = 1; i <= count; i++) 
		{
			row=sh.getRow(i);

			cell=row.getCell(3);

			String status=row.getCell(3).getStringCellValue();

			if(status.equalsIgnoreCase("Pass"))
			{

				HSSFCellStyle pass= wb.createCellStyle();

				/*pass.setFillForegroundColor(IndexedColors.GREEN.getIndex());

				pass.setFillPattern(CellStyle.SOLID_FOREGROUND);
*/
				cell.setCellStyle(pass);
			}
			else
			{
				HSSFCellStyle fail= wb.createCellStyle();

/*				fail.setFillForegroundColor(IndexedColors.RED.getIndex());

				fail.setFillPattern(CellStyle.SOLID_FOREGROUND);
*/
				cell.setCellStyle(fail);
			}

		}

		FileOutputStream out = new FileOutputStream("TestResults\\"+strDataFileName+".xls");

		wb.write(out);

		wb.close();
	}



	public void SendMailMethod () {

		String name = new Object(){}.getClass().getEnclosingMethod().getName();


		from = "mayank.mishra@renaissance-it.com";
		//to = "mayank.mishra@renaissance-it.com,vineeth.v@renaissance-it.com";

		// List<String> to= new ArrayList();
		// WebDriver driver = null ; 

		to = FetchEmails(strDataFileName, "EMailForTo",  name);
		cc = FetchEmails(strDataFileName, "EMailForCC", name);

		/*  to.add("mayank.mishra@renaissance-it.com");
	      to.add("vineeth.v@renaissance-it.com");
	      cc.add("vineeth.muskula.esics@relindia.in");*/


		// to = {"mayank.mishra@renaissance-it.com","vineeth.v@renaissance-it.com"};

		String dateTime = new SimpleDateFormat("dd-MM-yyyy hh:mm a").format(Calendar.getInstance().getTime()) ;

		String newfinalstatusText = statusfinal;
		subject = "ESIC Application Automation Execution Report - " + dateTime + "  STATUS : " +newfinalstatusText ;



		messageBody = "<html><body> <h4>Hi All, &nbsp; </h4></body></html>";
		messageBody += "<html><body><h4>Please find the Employer Portal and MYESIC Portal Applications Daily Regression Through Automation : </br></br></br></h4></body></html>";

		messageBody += "<html><body><h3><u> EMPLOYER PORTAL(www.esic.in) :</u><h3> </body></html>";

		messageBody += "<html> <head> </head> <body> <table border=\"1\" cellpadding=\"1\" cellspacing=\"1\"> <tr style=\"background-color: #a9c2e8;\">";
		messageBody +=  "<td><strong>Test Step Name &nbsp;&nbsp;</strong></td><td><strong>Expected Result</strong></td><td><strong>Status &nbsp;&nbsp;&nbsp; </strong></td><td><strong>Execution Time &nbsp;&nbsp;&nbsp; </strong></td></tr><tr>";
		messageBody +=  "<td>Employer Portal &nbsp;</td><td>User Should able to open www.esic.in &nbsp;</td><td>" + PortalLoginStatus +"&nbsp; </td><td>" + StrportalExecutionTime +"&nbsp; </td></tr><tr>";
		messageBody +=  "<td>User Login &nbsp;</td><td>User Should able to navigate User Login Page(portal_login) &nbsp;</td><td>" + UserLoginStatus +"&nbsp; </td><td>" + StrUserExecutionTime +"&nbsp; </td></tr><tr></body></html>";

		
		messageBody += "<html><body><h3><u>ESIC EMPLOYEE PORTAL(myesic.esic.in) :</u><h3> </body></html>";

		messageBody += "<html> <head> </head> <body> <table border=\"1\" cellpadding=\"1\" cellspacing=\"1\"> <tr style=\"background-color: #a9c2e8;\">";
		messageBody +=  "<td><strong>Test Step Name &nbsp;&nbsp;</strong></td><td><strong>Expected Result</strong></td><td><strong>Status &nbsp;&nbsp;&nbsp; </strong></td><td><strong>Execution Time &nbsp;&nbsp;&nbsp; </strong></td></tr><tr>";
		messageBody +=  "<td>Login Myesic Portal &nbsp;</td><td>User Should able to Login myesic.esic.in &nbsp;</td><td>" + MyesicLoginStatus +"&nbsp; </td><td>" + MyesicExecutionTime +"&nbsp; </td></tr><tr>";
		messageBody +=  "<td>Logout Myesic Portal &nbsp;</td><td>User Should able to Logout from myesic.esic.in &nbsp;</td><td>" + LogoutStatus +"&nbsp; </td><td>" + LogoutExecutionTime +"&nbsp; </td></tr><tr></body></html>";


		messageBody += "<html><body><h3><u> HIS APPLICATION NAVIGATION :</u><h3> </body></html>";

		messageBody += "<html> <head> </head> <body> <table border=\"1\" cellpadding=\"1\" cellspacing=\"1\"> <tr style=\"background-color: #a9c2e8;\">";
		messageBody +=  "<td><strong>Test Step Name &nbsp;&nbsp;</strong></td><td><strong>Expected Result</strong></td><td><strong>Status &nbsp;&nbsp;&nbsp; </strong></td><td><strong>Execution Time &nbsp;&nbsp;&nbsp; </strong></td></tr><tr>";
		//messageBody +=  "<td> Myesic Login &nbsp;</td><td>User Should able to Login Myesic &nbsp;</td><td>" + LoginStatus +"&nbsp; </td><td>" + LoginExecutionTime +"&nbsp; </td></tr><tr>";
		//messageBody +=  "<td> Select Location & Facility &nbsp;</td><td>User Should able to select Location and Facility &nbsp;</td><td>" + LocationStatus +"&nbsp; </td><td>" + LocationExecutionTime +"&nbsp; </td></tr><tr>";

		messageBody +=  "<td>Select Location & Facility&nbsp;</td><td>User Should able to select Location and Facility &nbsp;</td><td>" + LocationStatus +"&nbsp; </td><td>" + LocationExecutionTime +"&nbsp; </td></tr><tr>";
		messageBody +=  "<td>Patient Check-IN &nbsp;</td><td>User Should able to Do Patient Check-IN &nbsp;&nbsp;</td><td>" + CheckINStatus +" </td><td>" + CheckinExecutionTime +" </td></tr><tr>";
		messageBody +=  "<td>Doctor Worklist</td><td>User Should able to View Doctor Worklist &nbsp;&nbsp;</td><td>" + DoctorWorklistStatus +" </td><td>" + DrWorklistExecutionTime +" </td></tr><tr>";
		messageBody +=  "<td>Patient CaseSheet &nbsp;&nbsp;</td><td>User Should able to Open Patient Casesheet &nbsp;&nbsp;</td><td>" + CasesheetStatus +" </td><td>" + CaseSheetExecutionTime +" </td></tr><tr></body></html>";

		/* messageBody +=  "<td>CaseSheet Diagnosis &nbsp; </td><td>CaseSheet- Diagnosis</td><td>" + DiagnosisStatus +" </td></tr><tr>";
	    messageBody +=  "<td>CaseSheet Prescription &nbsp; </td><td>CaseSheet- Prescription</td><td>" + PrescriptionStatus +" </td></tr><tr>";
	    messageBody +=  "<td>CaseSheet Medication&nbsp; </td><td>CaseSheet- Medication</td><td>" + PrescriptionStatus +" </td></tr><tr>";
	    messageBody +=  "<td>CaseSheet Investigation &nbsp;</td><td>CaseSheet- Investigation </td><td>" + PrescriptionStatus +" </td></tr><tr>";
	    messageBody +=  "<td>CaseSheet Health Intervention &nbsp;</td><td>CaseSheet- Health Intervention&nbsp;&nbsp; </br> </td><td>" + PrescriptionStatus +" </td></tr><tr>";

	    messageBody +=  "<td>CLM FUP</td><td>Clinical Module - FUP </td><td>" + FUPStatus +" </td></tr><tr></body></html>";
		 */

		//messageBody +=  "<td>Doctor Worklist</td><td>Doctor Worklist</td><td>" + DoctorWorklistStatus +" </td></tr><tr></body></html>";

		if(newfinalstatusText.equalsIgnoreCase("Pass"))
		{
			messageBody += "<html><body><h1><u> STATUS :&nbsp;&nbsp; " +
					" <font color=\"Green\">" + newfinalstatusText +"</u> <h1> </body></html>";
		}
		else
		{	messageBody += "<html><body><h1><u> STATUS : &nbsp;&nbsp;" +
				" <font color=\"Red\">" + newfinalstatusText +" </u><h1> </body></html>";

		}

		messageBody += "<html><body><h1> Total Execution Time : &nbsp;" + ExecutionTime +" <h1> </body></html>";

		messageBody += "<html><body><h4><font color=\"blue\">Note: This is an auto-generated mail. </br></br></br></font> </h4></body></html>";

		messageBody += "<html><body><h3> Thanks & Regards,</h3></body></html>";	
		messageBody += "<html><body><h3> QA Team </h3></body></html>";

		// fileName = "quiz.txt";
		// fileName = ("E:\\GP\\HIS_Automation\\HIS_Daily_Reg\\TestResults\\HISDailyRegressionFlow.xls"); // Read the excel

		fileName = (strFilePath + "HISAutomationReport.xls"); // Read the excel

		/* host = "smtp.gmail.com";
	        port = "587";*/
		host = "mail.renaissance-it.com";
		port = "587";
		authenticator = new SMTPAuthenticator ();
		properties = System.getProperties ();
		properties.put ( "mail.smtp.host", host );
		properties.put ( "mail.smtp.starttls.enable", "false" );
		properties.put ( "mail.smtp.port",port );
		properties.put ( "mail.smtp.auth", "true" );
	}


	public List<String> FetchEmails(String strDataFileName, String strElement,String Methodname) 
	{
		List<String> array= new ArrayList();

		try {
			int columnCount = 0;
			String[] Emails = new String[0];
			int rowNumber = 1;
			String strEmails = readData.readDataFile(strDataFileName, rowNumber, strElement , Methodname);

			Emails = strEmails.split(";");
			List<String> emailIds= Arrays.asList(Emails);

			columnCount = emailIds.size();

			for (int cnt = 0; cnt < columnCount; cnt++) 
			{
				String excelEmailValues = emailIds.get(cnt);
				array.add(excelEmailValues);

			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return array;
	}



	public void sendMail ( String from, List<String> to2,List<String> cc2,
			String subject, String messageBody, String fileName ) {
		try {
			Session session = Session.getDefaultInstance ( properties, authenticator ); //new javax.mail.Authenticator()

			message = new MimeMessage ( session );
			message.setFrom ( new InternetAddress ( from ) );

			for (String string : to2) 
			{
				message.addRecipient ( Message.RecipientType.TO,
						new InternetAddress ( string ) );            }

			for (String string : cc2) 
			{
				message.addRecipient ( Message.RecipientType.CC,
						new InternetAddress ( string ) );            }

			message.setSubject ( subject );

			multipart = new MimeMultipart ();
			messageBodyPart = new MimeBodyPart ();
			messageBodyPart.setContent ( messageBody, "text/html" );
			multipart.addBodyPart ( messageBodyPart );

			/*	messageBodyPart = new MimeBodyPart ();
			DataSource source = new FileDataSource ( fileName );
			messageBodyPart.setDataHandler ( new DataHandler ( source ) );
			messageBodyPart.setFileName ( fileName );
			multipart.addBodyPart ( messageBodyPart );
			 */
			message.setContent ( multipart );

			Transport.send ( message );
			System.out.println ( "Message send successfully...." );
		} catch ( Exception me ) {
			me.printStackTrace ();
		}
	}

	public void performTask () {
		sendMail ( from, to,cc, subject, messageBody, fileName );
	}

	/* public static void main ( String[] args ) {
	        new SendMailFinal().performTask ();
	    }
	 */

	////@Test(priority = 0)
	public void SendMail()
	{
		SendMailMethod();
		performTask();

	}

	/**
	 * SimpleAuthenticator is used to do simple authentication
	 * when the SMTP server requires it.
	 */

	class SMTPAuthenticator extends Authenticator {

		private static final String SMTP_AUTH_USER = "mayank.mishra";
		private static final String SMTP_AUTH_PASSWORD = "srit@123";

		public PasswordAuthentication getPasswordAuthentication () {
			String username = SMTP_AUTH_USER;
			String password = SMTP_AUTH_PASSWORD;

			return new PasswordAuthentication( username,  password );
		}
	}

}


