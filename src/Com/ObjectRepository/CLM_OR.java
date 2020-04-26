package Com.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CLM_OR {
	
	WebDriver driver;
	
	
	
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
	public By Patient_CheckIn = By.linkText("Patient Check-In /Registration");
	
	public By uhidscreen = By.linkText("UHID Creation");
	
	/* UHID Search Window button */
	public By UHID_Search = By.id("ctl00_cphpage_imgsearchuhid");
	
	/* UHID_box */
	public By UHID_box = By.xpath("//*[@id='ddlRegCode']");
	
	/* UHID no Field */
	public By UHID_No_Field = By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_dlData_ctl00_txtCriteria");
	
	/* UHID Search in small window */
	public By UHID_Search_smallwindow = By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_btnSearch");
	
	/* UHID Radio button in small window */
	public By UHID_radio = By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchResultGrid_gdvList_ctl02_rdbTemp");
	
	/* Select button */
	public By UHID_Select = By.id("ctl00_cphpage_hisDataSearchCtrl_btnSelect");
	
	
	/* Cancel button in POP UP */
	public By Cancel_POPUP = By.id("popup_cancel");
	
	/* Patient CheckIn OK */
	public By PatientCheckIn_OK = By.name("ctl00$cphpage$btnOK");
	
	public By PC_OK = By.xpath("//input[@id='ctl00_cphpage_btnOK']");
	
	public By cancelcheckIn = By.xpath(".//*[@id='ctl00_cphpage_gdvservices_ctl02_btnServiceDelete']");
	
	/* Specialisation*/
	public By PC_Specialisation = By.id("ctl00_cphpage_ddlSpecialisation");
	
	public By popup_ok = By.id("popup_ok");
	
	public By PC_Save = By.xpath("//div[10]/div[2]/input");
	
	public By PC_printOK = By.xpath("//*[@id='popup_ok']");
	
	public By PC_printCancel = By.xpath("//*[@id='popup_cancel']");
	
	public By PC_CheckInNum = By.xpath("//div[@id='pageContainer1']/div[2]/div[25]");
	
	public By PC_CheckInnum = By.cssSelector("css=div..firepath-matching-node");
	
	public By PC_IPnumber = By.xpath("//*[@id='ctl00_cphpage_txtIPNO']");
	
	/* CLM Menu*/
	public By CLM_menu = By.linkText("Clinical Records");
	
	public By CLM_menuu = By.className("ctl00_Menu1_1 ctl00_Menu1_3");
	
	public By CLM_menuuu = By.xpath("//a[contains(text(),'CLM')]");
	
	public By CLM_IPField = By.xpath("//*[@id='ctl00_cphpage_txtinsurenceno']");
	
	public By CLM_IPSearch = By.xpath("//*[@id='ctl00_cphpage_imageScreenSearch']");
	
	public By CLM_OpenCasesheet = By.xpath("//*[@id='ctl00_cphpage_btnOpenCaseSheet']");
	
	/* Doctor Worklist */
	public By CLM_DoctorWorklist = By.linkText("Doctor Worklist");
	
	/* Consultant Specific */
	public By CLM_ConsultantSpecific = By.id("ctl00_cphpage_imgConsultation");
		
	/* No Consultaion Yes button */
	public By CLM_NoConsultaionOk = By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK");
	
	public By CLM_Consultaion_OK = By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK");
	
	/* CheckIn no */
	public By CLM_CheckInNoo = By.xpath("//*[@id='ctl00_cphpage_gdvSpecialization_ctl02_lblBillNo1']");
	
	public By CLM_CheckInNo = By.xpath("//td[2]/a/span");
	
	/* checkin no in Consultant Specific */
	public By CLM_CheckIn_ConsultantSpecific = By.xpath("//a/span");
	
	/* Prescriptions link */
	public By CLM_PrescriptionsLink = By.linkText("PRESCRIPTIONSNew!");
	
	/* Prescriptions on Prescriptions screen*/
	public By CLM_Prescriptionsscreen = By.xpath("//legend");
	
	/* Medications Fup */
	public By CLM_Med_Add = By.id("btnADDM");
	
	public By CLM_Med_txtSearch = By.id("txtSearch");
	
	public By CLM_Med_Drug = By.xpath("//*[@id='btnDrug']");
	
	public By CLM_Med_fieldselect = By.xpath("//td/div/div/a");
	
	public By CLM_Med_txtDrugDose = By.id("txtDrugDose");
	
	public By CLM_Med_ddlDrugDose = By.id("ddlDrugDose");
	
	public By CLM_Med_Duration = By.id("txtDuration");
	
	public By CLM_Med_Frequency = By.id("ddlFrequency");
	
	public By CLM_Med_txtQuantity = By.id("txtQuantity");
	
	public By CLM_Med_ddQuantity = By.id("ddlQuantityUOM");
	
	public By CLM_Med_btnOK = By.id("btnOK");
	
	public By CLM_Med_btnClose = By.id("btnM");
	
	
	/* Investigation Add button */
	public By CLM_Inv_Add = By.id("btnAddI");
	
	/* Investigation Search txt field */
	public By CLM_Inv_txt = By.id("txtISearch");
	
	/* Investigation Profile button */
	public By CLM_Inv_btnInvestigation = By.id("btnInvestigation");
	
	public By CLM_Inv_Investigation = By.xpath("//div[2]/a");
	
	/* Investigation OK */
	public By CLM_Inv_Ok = By.id("btnOKI");
	
	public By CLM_Inv_Close = By.id("btnI");
	
	/* Health Intervention */
	public By CLM_HI_Add = By.id("btnAddP");
	
	public By CLM_HI_txtSearch = By.id("txtPSearch");
	
	public By CLM_HI_btnProcedures = By.id("btnProcedures");
	
	public By CLM_HI_procedureselect = By.xpath("//div[3]/a");
	
	public By CLM_HI_chkSurgery = By.id("chkSurgery");
	
	public By CLM_HI_chkAnaesthesia = By.id("chkAnaesthesia");
	
	public By CLM_HI_btnOKP = By.id("btnOKP");
	
	public By CLM_HI_btnclose = By.id("btnP");
	
	/* Diagnosis */
	public By CLM_Dio_Add = By.id("btnAddD");
	
	public By CLM_Dio_Txt = By.id("txtDiagnosis");
	
	public By CLM_Dio_Namesearch = By.id("btnDaignosis");
	
	public By CLM_Dio_textselect = By.xpath("//div[4]/a");
	
	public By CLM_Dio_OK = By.id("Button2");
	
	public By CLM_Dio_Close = By.id("btnD");
	
	public By CLM_Save_close = By.xpath("//input[@id='btnISaveClose']");
	
	/* Patient Case Sheet */
	public By CLM_CS_medicalcert = By.id("ctl00_cphpage_hypMC");
	
	public By CLM_CS_certType = By.id("ctl00_cphpage_ddlCertificatetype");
	
	public By CLM_CS_StartDateOfSpell = By.id("ctl00_cphpage_txtStartDateOfSpell");
	
	public By CLM_CS_Hidedetails = By.xpath("//td/div/table/tbody/tr/td/div/table/tbody/tr/td[2]");
	
	public By CLM_CS_leaveduration = By.id("ctl00_cphpage_txtTotalleaveavailed");
	
	public By CLM_CS_leaveTodate = By.id("ctl00_cphpage_txtLeaveto");
	
	public By CLM_CS_Datefittowork = By.id("ctl00_cphpage_txtDatefittowork");
	
	public By CLM_CS_Save = By.id("ctl00_cphpage_btnSaveDisplay");
	
	public By CLM_CS_remarks = By.id("ctl00_cphpage_txtRemarks");
	
	public By CLM_CS_Ok = By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK");
	
	/* Complaints */
	public By CLM_CS_Complaints = By.xpath("//*[@id='ctl00_cphpage_trvSectionst1']");
	
	public By CLM_CS_ComplaintsPanel = By.xpath("//*[@id='ctl00_cphpage_lblCollapseTitle'][text()='COMPLAINTS AND HISTORY']");
	
	public By CLM_CS_ComplaintsRemarks = By.id("TemplatePreviewControl_txtOtherComplaints");
	
	public By CLM_CS_ComplaintsSave = By.xpath("//*[@id='btnSave']");
	
	/* History of Illness  */
	public By CLM_CS_History = By.xpath("//*[@id='ctl00_cphpage_trvSectionst2']");
	
	public By CLM_CS_Historytxt = By.xpath("//*[@id='TemplatePreviewControl_txtHistoryofPresentIllness']");
	
	public By CLM_CS_HistorySave = By.xpath("//*[@id='btnSave']");
	
	
	/* Past History */
	public By CLM_CS_PastHistory = By.xpath("//*[@id='ctl00_cphpage_trvSectionst3']");
	
	public By CLM_CS_PastHistorytxt = By.xpath("//*[@id='TemplatePreviewControl_txtOtherHistory226']");
	
	public By CLM_CS_PastHistorySave = By.xpath("//*[@id='btnSave']");
	
	/* General Examination */
	public By CLM_CS_GenExam = By.xpath("//*[@id='ctl00_cphpage_trvSectionst5']");
	
	public By CLM_CS_GenExamtxt = By.xpath("//*[@id='TemplatePreviewControl_txtllothers']");
	
	public By CLM_CS_GenExamSave = By.xpath("//*[@id='btnSave']");
	
	/* System Examination */
	public By CLM_CS_SysExam = By.xpath("//*[@id='ctl00_cphpage_trvSectionst6']");
	
	public By CLM_CS_SysExamtxt = By.xpath("//*[@id='TemplatePreviewControl_txtInvestigationFindings']");
	
	public By CLM_CS_SysExamSave = By.xpath("//*[@id='btnSave']");
	
	
	/* Local Examination */
	public By CLM_CS_LocExam = By.xpath("//*[@id='ctl00_cphpage_trvSectionst7']");
	
	public By CLM_CS_LocExamtxt = By.xpath("//*[@id='TemplatePreviewControl_txtOthers']");
	
	public By CLM_CS_LocExamSave = By.xpath("//*[@id='btnSave']");
	
	/* Diagnosis */
	public By CLM_CS_Diagnosis = By.xpath("//*[@id='ctl00_cphpage_trvSectionst9']");
	
	public By CLM_CS_Diatxt = By.xpath("//*[@id='txtDiagnosis']");
	
	public By CLM_CS_DiaNameSearch = By.xpath("//*[@id='btnDaignosis']");
	
	public By CLM_CS_Diafield = By.xpath("//*[@id='11277$Abnormal blood-pressure reading, without diagnosis$R03']");
	
	public By CLM_CS_DiaSave = By.xpath("//*[@id='btnISaveClose']");
	
	/* Discharge Summary */
	public By CLM_DischargeSummary = By.linkText("Discharge Summary");
	
	public By CLM_DS_imgAdmNo = By.id("ctl00_cphpage_imgAdmNo");
	
	public By CLM_DS_UHIDcontain = By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl00_ddlCriteria");
	
	public By CLM_DS_TxtUHID = By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl00_txtCriteria");
	
	public By CLM_DS_radiobtn = By.id("ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList_ctl02_rdbTemp");
	
	public By CLM_DS_search = By.id("ctl00_cphpage_ucCommonSearch_btnSearch");
	
	public By CLM_DS_Select = By.id("ctl00_cphpage_ucCommonSearch_btnSelect");
	
	public By CLM_DS_save = By.id("ctl00_cphpage_btnSave");
	
	public By CLM_DS_Ok = By.id("popup_ok");
	
	/* Order Packs */
	public By CLM_CS_Orderpack = By.xpath("//a[@id='ctl00_cphpage_trvSectionst15']");
	
	public By CLM_CS_Orderpacktxt = By.xpath("//*[@id='txtOrdPackSearch']");
	
	public By CLM_CS_Orderpackbtn = By.xpath("//*[@id='btnOrdpack']");
			
	public By CLM_CS_Orderpackfield = By.xpath("//div[@id='divSystemList']/a");
	
	public By CLM_CS_Orderpacksave = By.xpath("//*[@id='btnISaveClose']");
	
	/* Artificial Limbs */
	public By CLM_CS_Artficial = By.xpath("//a[@id='ctl00_cphpage_trvSectionst16']");
	
	public By CLM_CS_Artficialtxt = By.xpath("//*[@id='TemplatePreviewControl_txtDescription10']");
	
	public By CLM_CS_ArtficialSave = By.xpath("//*[@id='btnSave']");
	
	
	/* Advice */
	public By CLM_CS_Advice = By.xpath("//*[@id='ctl00_cphpage_trvSectionst17']");
	
	public By CLM_CS_AdviceSpecialization = By.xpath("//*[@id='ddlESICSpecialization']");
	
	public By CLM_CS_AdviceDoctor = By.xpath("//*[@id='txtInternalDoctor']");
			
	public By CLM_CS_AdviceDoctorSearch = By.xpath("//*[@id='btnSearch']");
	
	public By CLM_CS_AdviceDoctorSelect = By.xpath("//*[@id='51798#7#106']");
	
	public By CLM_CS_AdviceRemarks = By.xpath("//*[@id='txtreasonForReferral']");
	
	public By CLM_CS_AdviceAdd = By.xpath("//*[@id='btnOk']");
	
	public By CLM_CS_AdviceSave = By.xpath("//*[@id='btnSaveClose']");
	
	
	/* Vitals */
	public By CLM_CS_Vitals = By.xpath("//*[@id='ctl00_cphpage_trvSectionst19']");
	
	public By CLM_CS_Vitalstxt = By.xpath("//*[@id='grdVital_ctl02_txtValue']");
	
	public By CLM_CS_VitalsSave = By.xpath("//*[@id='Button1']");
	
	/* Allergies */
	public By CLM_CS_Allergies = By.xpath("//*[@id='ctl00_cphpage_trvSectionst21']");
	
	public By CLM_CS_AllergiesFood = By.xpath("//*[@id='ddlAllergyType']");
	
	public By CLM_CS_AllergiesDes = By.xpath("//*[@id='imgSearch']");
	
	public By CLM_CS_AllergiesDesDD = By.xpath("//*[@id='ddlFdIngrName']");
	
	public By CLM_CS_AllergiesDestxt = By.id("hisDataSearchCtrl_hisSearchCriteria_dlData_ctl00_txtCriteria");
	
	public By CLM_CS_AllergiesDesSearch = By.id("hisDataSearchCtrl_btnSearch");
	
	public By CLM_CS_AllergiesRadio = By.id("hisDataSearchCtrl_hisSearchResultGrid_gdvList_ctl02_rdbTemp");
	
	public By CLM_CS_AllergiesDesSelect = By.id("hisDataSearchCtrl_btnSelect");
	
	public By CLM_CS_AllergiesSeverity = By.xpath("//*[@id='ddlSeverity']");
	
	public By CLM_CS_AllergiesReaction = By.xpath("//*[@id='ddlReaction']");
	
	public By CLM_CS_AllergiesDate = By.xpath("//*[@id='txtAllergyDate']");
	
	public By CLM_CS_AllergiesCurrentdate = By.xpath("//*[@id='calAllergyDate_today']");
	
	public By CLM_CS_AllergiesAdd = By.xpath("//*[@id='btnAdd']");
	
	public By CLM_CS_AllergiesSave = By.id("btnSave");
	
	public By CLM_CS_Allergiesok = By.id("MyMessageBoxInfo_ButtonOK");
	
	public By CLM_CS_AllergiesClose = By.id("btnClose");
	
	
	/* Certificate Generation */
	
	public By CLM_CS_Certificate = By.xpath("//*[@id='ctl00_cphpage_hypMC']");
	
	public By CLM_CS_Certificatetype = By.xpath("//*[@id='ctl00_cphpage_ddlCertificatetype']");
	
	public By CLM_CS_CertificateYesoption = By.xpath("//*[@id='ctl00_cphpage_MyMessageBoxInfo_ButtonYes']");
	
	public By CLM_CS_CertificateYesOK = By.xpath("//*[@id='ctl00_cphpage_btnPopUpOK']");
	
	public By CLM_CS_CertificateLeave = By.xpath("//div[@id='ctl00_cphpage_pnlLeave']/table/tbody/tr/td[2]");
	
	public By CLM_CS_CertificateLeaveField = By.xpath("//*[@id='ctl00_cphpage_txtTotalleaveavailed']");
	
	public By CLM_CS_CertificateSave = By.xpath("//*[@id='ctl00_cphpage_btnSaveDisplay']");
	
	public By CLM_CS_CertificateOK = By.xpath("//*[@id='ctl00_cphpage_MyMessageBoxInfo_ButtonOK']");
	
	
	/* FUP */
	public By CLM_FUP = By.linkText("Frequently Used packs");
	
	public By CLM_casesheet_fup_verify = By.xpath(".//*[@id='ctl00_cphpage_tabSearch_tabPnlSearchResults_gdvInvestigations']//a[text()='Edit']");

	
	
	
	public By CLM_FUP_InvSearch = By.xpath("//*[@id='ctl00_cphpage_tabSearch_tabPnlSearchResults_imgbtnInvestigationsSearch']");
	
	
	public By CLM_FUP_InvText = By.xpath("//*[@id='txtName']");
	
	public By CLM_FUP_Invsearchbutton = By.xpath("//*[@id='btnSearch']");
	
	public By CLM_FUP_InveSearchbtn = By.id("ctl00_cphpage_hisDataSearchCtrl_btnSearch");
	
	public By CLM_FUP_InvRadio = By.xpath("//*[@id='ChkSelect0']");
	
	public By CLM_FUP_InvSelect = By.xpath("//*[@id='btnSelect']");
	
	public By CLM_FUP_InvQty = By.xpath("//*[@id='ctl00_cphpage_tabSearch_tabPnlSearchResults_txtQty']");
	
	public By CLM_FUP_InvAck = By.xpath("//*[@id='ctl00_cphpage_tabSearch_tabPnlSearchResults_imgBtnAckInvestigations']");
	
	public By CLM_FUP_InvSave = By.xpath("//*[@id='ctl00_cphpage_btnSave']");
	
	public By CLM_FUP_InvEdit = By.linkText("Edit");
	
	public By CLM_FUP_InvDelete = By.linkText("Delete");
	
	
/* Employer Portal */
	
	public By ClickHeretoLogin = By.id("linkLogin");
			
	public By ClickHere = By.id("Label1");
			
	public By ESIC_Text = By.id("lblLoginEng");
	
	//Logout
	
	public By Logout = By.xpath(".//*[@id='portlet-wrapper-CustomPortalMenu_WAR_Custom_Menu_INSTANCE_2Xxl']/div[2]/div/div/table[4]/tbody/tr/td[3]/a/img");
	
	public By verifyLoginText = By.xpath(".//*[@id='wraper']/table/tbody/tr/td[2]/table[1]/tbody/tr[1]/td/h4");
	
	
	

}
