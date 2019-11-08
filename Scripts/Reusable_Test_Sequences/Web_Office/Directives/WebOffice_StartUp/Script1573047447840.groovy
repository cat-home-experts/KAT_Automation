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

//-----------------------
// TEST HISTORY HEADER - |
//-----------------------
// Any changes to this script, please update the next available row below, with date, in the DATE CREATED column,
// Your Name in the CREATED BY column, and Finaly, The actual change implemented in the NOTES column.
//
//---------------------------------------------------------------------------------------------------------------
//       Test Definition / Description        |   Date Created  |    Created By    |             Notes           |
//---------------------------------------------------------------------------------------------------------------
// Initial Development Started                |   06/11/2019    |        DH        | Personal Credentials Used   |
//                                            |                 |                  | Needs to be generic/test Cre|
//---------------------------------------------------------------------------------------------------------------
//                                            |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
//                                            |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
//                                            |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
//                                            |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------
//                                                                                                               |
//	GIVEN -                                                                                                      |
//                                                                                                               |
//	WHEN -                                                                                                       |
//                                                                                                               |
//  THEN -                                                                                                       |
//                                                                                                               |
//---------------------------------------------------------------------------------------------------------------

//-----------------------------------------
// Startup Process -                      | NOTE: Members Area Function has it's OWN Startup Process
//-----------------------------------------
'Set Function Area for "URL_Handler", URL Resolution'
//GlobalVariable.FUNCTION_AREA = "Web_Office"
//-----------------------------------------
'Do Some Magic with URL(s) See the comments within URL Handler '
//WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/URL_Handler'), [:], FailureHandling.CONTINUE_ON_FAILURE)
//-----------------------------------------
// Vars for possible inclusion in DataSheet
// Switch to Generic/Test Creds at some point
'------------------------------------------------'
GlobalVariable.Username = "DavidHo"
GlobalVariable.Password = "Check123"
'------------------------------------------------'
'WebOffice_URL - Set from the ENVIRONMENT PROFILE '
'OPEN BROWSER'
//////////////////////////////////////////////////
// Browser Open                                 //
//////////////////////////////////////////////////
'eg - https://admin.preview.checkatrade.com/  '
'Set in Profile Utilised During Test Execution'
WebUI.openBrowser(GlobalVariable.WebOffice_URL) // 

//////////////////////////////////////////////////
// Synchronise on Login Button Being Available  //
//////////////////////////////////////////////////
WebUI.waitForElementClickable(findTestObject('Object Repository/WebOffice/Page_Checkatrade - Administration - Login/Login_Button'), 25)

//////////////////////////////////////////////////
// Verify Login Dialog is Presented             //
//////////////////////////////////////////////////

//////////////////////////////////////////////////
// Dialog Header Text                           //
//////////////////////////////////////////////////
WebUI.verifyTextPresent("Checkatrade Web Office", false)
//////////////////////////////////////////////////
// Access Textual Information
WebUI.verifyTextPresent("Access for staff use only", false)
//////////////////////////////////////////////////
// Forgotten Password Text
WebUI.verifyTextPresent("Forgotten password?", false)
//////////////////////////////////////////////////

//////////////////////////////////////////////////
// Residual Encrypted Username
//WebUI.setText(findTestObject('Object Repository/WebOffice/Page_Checkatrade - Administration - Login/input_Username_LoginControlUserName'),
//	'DavidHo')
//////////////////////////////////////////////////

//////////////////////////////////////////////////
// Set Username                                 //
//////////////////////////////////////////////////
'USERNAME'
WebUI.setText(findTestObject('Object Repository/WebOffice/Page_Checkatrade - Administration - Login/input_Username_LoginControlUserName'),
	GlobalVariable.Username)

//////////////////////////////////////////////////
// Residual Encrypted Password
//WebUI.setEncryptedText(findTestObject('Object Repository/WebOffice/Page_Checkatrade - Administration - Login/input_Password_LoginControlPassword'),
//	'AmDSJqbCZAGZ34/Q6uJgMA==')
//////////////////////////////////////////////////

//////////////////////////////////////////////////
// Set Password                                 //  
//////////////////////////////////////////////////
'PASSWORD'
WebUI.setText(findTestObject('Object Repository/WebOffice/Page_Checkatrade - Administration - Login/input_Password_LoginControlPassword'),
	GlobalVariable.Password)

//////////////////////////////////////////////////
// Hit LOGIN (Submit) Button                    //
//////////////////////////////////////////////////
'LOGIN'
WebUI.click(findTestObject('Object Repository/WebOffice/Page_Checkatrade - Administration - Login/Login_Button'))

//////////////////////////////////////////////////
// Maximisde Browser                            //
//////////////////////////////////////////////////
'MAXIMIZE BROWSER '
WebUI.maximizeWindow()

//////////////////////////////////////////////////
// Page Load Synchronisation                    //                                   
//////////////////////////////////////////////////
'WAIT for browser to load - waits up to 60 seconds before timeout occurs '
WebUI.waitForPageLoad(60)

///////////////////////////////////////
//                END                //
///////////////////////////////////////