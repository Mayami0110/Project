package Com.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Registration_OR {

	WebDriver driver;
	
	
	/* production username */
	private By Prod_Username = By.id("IDToken1");
	

	
	/*public By Prod_Username = By.xpath(".//*[@id='username']");
	
	public By Prod_Password = By.xpath("//*[@id='password']");*/
	
	
	
	public By getProd_Username() {
		
		
		return this.Prod_Username;
	}

	
	/* production password */
	public By Prod_Password = By.id("IDToken2");
	
	/* Production Login button*/
	public By Prod_Login = By.name("Login.Submit");
	
	//public By Prod_Login = By.xpath("//*[@id='loginForm']/fieldset[4]/input");
	
	/* Applications menu link */
	public By Prod_App = By.linkText("Applications");
	
	/* HIS produciton link */
	public By Prod_HIS = By.linkText("Health Information System");
	
	/* username field */
	public By username = By.id("txtUsername");
	
	/* Password field */
	public By password = By.id("txtpassword");
	
	/* Login Button */
	public By login_button = By.id("btnLogin");
	
	/* Location */
	public By Location = By.id("ctl00_cphpage_ddlHospital");
	
	/* Facility */
	public By facility = By.id("ctl00_cphpage_ddlFacility");
	
	/* Submit */
	public By sumbit = By.id("ctl00_cphpage_btnSubmit");
	
	/* Registration module */
	public By Registration_link = By.linkText("Registration");
	
	/* UHID Registration */
	public By UHID_reg = By.linkText("UHID Creation");
	
	/* Personal Title */
	public By Person_Title = By.id("ctl00_cphpage_ddlTitle");
	
	/* Firstname field */
	public By firstname = By.id("ctl00_cphpage_txtFirstName");
	
	/* Lastname field */
	public By lastname = By.id("ctl00_cphpage_txtLastName");
	
	/* Marital status */
	public By marital_status = By.id("ctl00_cphpage_ddlMarriage");
	
	/* Age */
	public By Age = By.id("ctl00_cphpage_txtAge");
	
	/* Address */
	public By Address = By.id("ctl00_cphpage_txtPresentAddress1");
	
	/* Save */
	public By Save = By.id("ctl00_cphpage_btnSaveDisplay");
	
	/* Yes option  */
	public By Yes = By.id("ctl00_cphpage_btnYes1");
	
	/* 2nd Yes option  */
	public By Yes2 = By.xpath("//*[@id='ctl00_cphpage_btnYes']");
	
	/* OK button  */
	public By ok = By.id("ctl00_cphpage_btnOK11");
	
	/* UHID number  */
	public By UHID_no = By.xpath(".//*[@id='ctl00_cphpage_txtUhid']");
	
	/* OPD Number */
	public By OPD_No = By.id("ctl00_cphpage_lnkbtnCheckIn");
	
	/* Patient CheckIn */
	public By Patient_CheckIn = By.id("ctl00_cphpage_lnkbtnCheckIn");
	
	/* UHID Search Window button */
	public By UHID_Search = By.id("ctl00_cphpage_imgsearchuhid");
	
	/* UHID_box */
	public By UHID_box = By.xpath("//td/table/tbody/tr/td[2]/select");
	
	/* UHID no Field */
	public By UHID_No_Field = By.xpath("//td/table/tbody/tr/td/table/tbody/tr/td[3]/input");
	
	/* UHID Search in small window */
	public By UHID_Search_smallwindow = By.xpath("//div/div/div/table/tbody/tr[2]/td/input");
	
	/* UHID Radio button in small window */
	public By UHID_radio = By.xpath("//td/div/div/div/table/tbody/tr[2]/td/input");
	
	/* Cancel button in POP UP */
	public By Cancel_POPUP = By.id("popup_cancel");
	
	
	
	/* Patient CheckIn OK */
	public By PatientCheckIn_OK = By.name("ctl00$cphpage$btnOK");
	
	public By PC_OK = By.xpath("//input[@id='ctl00_cphpage_btnOK']");
	
	/* Specialisation*/
	public By PC_Specialisation = By.id("ctl00_cphpage_ddlSpecialisation");
	
	public By cancelcheckIn = By.xpath(".//*[@id='ctl00_cphpage_gdvservices_ctl02_btnServiceDelete']");
	
	public By popup_ok = By.id("popup_ok");
	
	public By PC_Save = By.xpath("//div[10]/div[2]/input");
	
	/* Patient Admission */
	public By PatientAdmission = By.linkText("Patient Admission");
	
	/* Patient Admission UHID */
	public By PA_UHID = By.id("ctl00_cphpage_txtUHID");
	
	
	
	/* Patient admission permenant address radio button */
	public By PA_Permenant = By.id("ctl00_cphpage_PermanentSameAsPresent");
	
	/* Patient Admission Admission type dropdown */
	public By PA_AdmissionType = By.id("ctl00_cphpage_ddlAdmissionType");
	
	/* Patient Admission Source of Admission */
	public By PA_SourceAdm = By.id("ctl00_cphpage_ddlAdmissionSrc");
	
	/* Patient Admission Specialisation */
	public By PA_Specialization = By.id("ctl00_cphpage_ddlSpecialisation");
	
	/* Patient Admission Unit Name */
	public By PA_UnitName = By.id("ctl00_cphpage_ddlUnit");
	
	/* Patient Admission Ward */
	public By PA_Ward = By.id("ctl00_cphpage_ddlWardType");
	
	/* Patient Admission Unit Name */
	public By PA_Save = By.id("ctl00_cphpage_btnSave");
	
	/* Patient Admission Yes option */
	public By PA_Yes = By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonYes");
	
	/* Patient Admission OK */
	public By PA_OK = By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK");
	
	/* Patient Admission Admission Number */
	public By PA_AdmNo = By.id("ctl00_cphpage_txtAdmissionNo");
	
	/* Cancel CheckIN */
	public By CC_link = By.linkText("Cancel Check-in");
	
	/* UHID search box in cancel checkIn screen */
	public By CC_UHID = By.id("ctl00_cphpage_ImgUhid");
	
	public By CC_UHID_contains = By.xpath("//select");
	
	public By CC_UHID_txtfield = By.xpath("//table[@id='searchtable']/tbody/tr/td[2]/input");
	
	public By CC_UHID_serachBtn = By.xpath("//input[@id='Button2']");
	
	public By CC_UHID_radiobtn = By.xpath("//input[@name='radio']");
	
	public By CC_UHID_select = By.id("btnSearchSelect");
	
	public By CC_Clearbtn = By.id("ctl00_cphpage_btnClear");
	
	/* Registration Reports */
	public By Reg_reports = By.linkText("Registration Reports");
	
	public By Reg_Rep_day = By.xpath("//table[3]/tbody/tr/td[2]/a");
	
	public By Reg_rep_preview = By.id("ctl00_ctl00_cphpage_cphReport_btnPreview");
	
	
	/* Search Window */
	public By SearchDD = By.xpath("//*[@id='ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_dlData_ctl00_ddlCriteria']");
	
	public By SearchText = By.xpath("//*[@id='ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_dlData_ctl00_txtCriteria']");
	
	public By Searchbtn = By.xpath("//*[@id='ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_btnSearch']");
	
	public By Searchradio = By.xpath("//*[@id='ctl00_cphpage_hisDataSearchCtrl_hisSearchResultGrid_gdvList_ctl02_rdbTemp']");
	
	public By Searchselect = By.xpath("//*[@id='ctl00_cphpage_hisDataSearchCtrl_btnSelect']");
	
	
	/* Employer Portal */
	
	public By ClickHeretoLogin = By.id("linkLogin");
			
	public By ClickHere = By.id("Label1");
			
	public By ESIC_Text = By.id("lblLoginEng");
	
	
	
}
