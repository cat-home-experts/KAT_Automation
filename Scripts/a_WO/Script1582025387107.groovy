import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://admin.preview.checkatrade.com/Login.aspx?ReturnUrl=%2fReports%2fTTRImport.aspx')

WebUI.setText(findTestObject('Page_Checkatrade - Administration - Login/input_Username_LoginControlUserName'), 'DavidHo')

WebUI.setEncryptedText(findTestObject('Page_Checkatrade - Administration - Login/input_Password_LoginControlPassword'), 
    'AmDSJqbCZAGZ34/Q6uJgMA==')

WebUI.click(findTestObject('Page_Checkatrade - Administration - Login/input_Remember me next time_LoginControlLog_86123a'))

WebUI.click(findTestObject('Page_/a_Reports'))

WebUI.click(findTestObject('Object Repository/WebOffice_Home_page/Page_/a_Members'))

WebUI.click(findTestObject('Object Repository/WebOffice_Home_page/Page_/a_Company Website Status Changes'))

WebUI.click(findTestObject('Object Repository/WebOffice_Home_page/Page_/a_Partner  Franchise'))

WebUI.click(findTestObject('Object Repository/WebOffice_Home_page/Page_/a_Competitor Analysis'))

WebUI.click(findTestObject('Object Repository/WebOffice_Home_page/Page_/a_Members Feedback'))

WebUI.click(findTestObject('Object Repository/WebOffice_Home_page/Page_/a_Summary Report'))

WebUI.click(findTestObject('Object Repository/WebOffice_Home_page/Page_/a_Status Report'))

WebUI.click(findTestObject('Object Repository/WebOffice_Home_page/Page_/a_Company Detail Report'))

WebUI.click(findTestObject('Object Repository/WebOffice_Home_page/Page_/a_Members Area Activity'))

WebUI.click(findTestObject('Object Repository/WebOffice_Home_page/Page_/a_Participants Report'))

WebUI.click(findTestObject('Object Repository/WebOffice_Home_page/Page_/a_Laggards Report'))

WebUI.click(findTestObject('Object Repository/WebOffice_Home_page/Page_/a_Photo Statistics Report'))

WebUI.click(findTestObject('Object Repository/WebOffice_Home_page/Page_/a_Member Switched Off (Old)'))

WebUI.click(findTestObject('Object Repository/WebOffice_Home_page/Page_/a_Member Switched Off'))

WebUI.click(findTestObject('Object Repository/WebOffice_Home_page/Page_/a_Marketing Materials Requests'))

WebUI.click(findTestObject('Object Repository/WebOffice_Home_page/Page_/a_By Company'))

WebUI.click(findTestObject('Object Repository/WebOffice_Home_page/Page_/a_By Type'))

WebUI.click(findTestObject('Object Repository/WebOffice_Home_page/Page_/a_Engagement Score Report'))

WebUI.click(findTestObject('Object Repository/WebOffice_Home_page/Page_/a_RenewalsLeavers - Engagement Score'))

WebUI.click(findTestObject('Object Repository/WebOffice_Home_page/Page_/a_Directory Reconciliation Report'))

WebUI.click(findTestObject('Object Repository/WebOffice_Home_page/Page_/a_Complaints'))

WebUI.click(findTestObject('Object Repository/WebOffice_Home_page/Page_/a_Member Complaints'))

WebUI.click(findTestObject('Object Repository/WebOffice_Home_page/Page_/a_Complaints History'))

WebUI.click(findTestObject('Object Repository/WebOffice_Home_page/Page_/a_Total Leads and Enquiries'))

WebUI.click(findTestObject('Object Repository/WebOffice_Home_page/Page_/a_Leads for all Companies'))

WebUI.click(findTestObject('Object Repository/WebOffice_Home_page/Page_/a_Member Web Categories'))

WebUI.click(findTestObject('Object Repository/WebOffice_Home_page/Page_/a_Dialler Leads'))

WebUI.click(findTestObject('Object Repository/WebOffice_Home_page/Page_/a_AppProgr OnHold'))

WebUI.click(findTestObject('Object Repository/WebOffice_Home_page/Page_/a_Feedback Cap Report'))

WebUI.click(findTestObject('Page_/a_Staff'))

WebUI.click(findTestObject('Object Repository/WebOffice_Home_page/Page_/a_Feedback Data Entry'))

WebUI.click(findTestObject('Object Repository/WebOffice_Home_page/Page_/a_Feedback Reviewed'))

WebUI.click(findTestObject('Object Repository/WebOffice_Home_page/Page_/a_Reference Statistics Report'))

WebUI.click(findTestObject('Object Repository/WebOffice_Home_page/Page_/a_Spotcheck Reports'))

WebUI.click(findTestObject('Object Repository/WebOffice_Home_page/Page_/a_Spotchecks Yearly'))

WebUI.click(findTestObject('Object Repository/WebOffice_Home_page/Page_/a_Spotchecks Updated'))

WebUI.click(findTestObject('Object Repository/WebOffice_Home_page/Page_/a_Spotchecks Feedback Reasons'))

WebUI.click(findTestObject('Object Repository/WebOffice_Home_page/Page_/a_Membership Consultant Map'))

WebUI.click(findTestObject('Object Repository/WebOffice_Home_page/Page_/a_Sales - Appointments'))

WebUI.click(findTestObject('Object Repository/WebOffice_Home_page/Page_/a_Sales - Mailing'))

WebUI.click(findTestObject('Object Repository/WebOffice_Home_page/Page_/a_Sales - Response to Visits'))

WebUI.click(findTestObject('Object Repository/WebOffice_Home_page/Page_/a_Sales - Staff Timesheets'))

WebUI.click(findTestObject('Object Repository/WebOffice_Home_page/Page_/a_Sales - Staff Bonus'))

WebUI.click(findTestObject('Object Repository/WebOffice_Home_page/Page_/a_Retention - Sales Details'))

WebUI.click(findTestObject('Object Repository/WebOffice_Home_page/Page_/a_Sales - Directory Sales Report'))

WebUI.click(findTestObject('Object Repository/WebOffice_Home_page/Page_/a_Sales - Additional WebCat Report'))

WebUI.click(findTestObject('Object Repository/WebOffice_Home_page/Page_/a_Sales - Lead Outcome Report'))

WebUI.click(findTestObject('Object Repository/WebOffice_Home_page/Page_/a_Sales - Appointment Outcome'))

WebUI.click(findTestObject('Object Repository/WebOffice_Home_page/Page_/a_Sales - Leads to Sign ups report'))

WebUI.click(findTestObject('Object Repository/WebOffice_Home_page/Page_/a_Artwork - Upload proof report'))

WebUI.click(findTestObject('Page_/a_Reports'))

WebUI.click(findTestObject('Page_/a_Low Engagement'))

WebUI.click(findTestObject('Object Repository/WebOffice_Home_page/Page_/a_Low Engagement Pending Calls'))

