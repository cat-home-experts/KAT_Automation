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
// Login Credentials moved to <default> Prof. |   22/01/2020    |        DH        |                             |
//---------------------------------------------------------------------------------------------------------------
// Login Credentiala, Verification Bug Fixed  |   03/02/2020    |        DH        |                             |
//---------------------------------------------------------------------------------------------------------------
// Adde Web Office Resolver for DEV           |   24/02/2020    |        DH        |                             |
//---------------------------------------------------------------------------------------------------------------
// Applied Stop on Failure Behaviour to WO    |   24/02/2020    |        DH        |                             |
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
// TODO Issue with parsing this URL from the batch? INVESTIGATE FURTHER TODOD
// This needs  rationaliising and incorporating Into the CAT Startupup URL Resolver
'-----------------------------------------------------------------------------'
'DEV'
if (GlobalVariable.URL == ("https://www.dev.checkatrade.com/")){
	GlobalVariable.WebOfficeURL="https://admin.dev.checkatrade.com/" // TODO
}
'-----------------------------------------------------------------------------'
'LIVE'
if (GlobalVariable.URL == ("https://www.checkatrade.com/")){
	GlobalVariable.WebOfficeURL="https://admin.checkatrade.com/" // TODO
}
'-----------------------------------------------------------------------------'
'PREVIEW'
if (GlobalVariable.URL == ("https://www.preview.checkatrade.com/")){
	GlobalVariable.WebOfficeURL="https://admin.preview.checkatrade.com/" // TODO
} 
'Dev 2'
if (GlobalVariable.URL == ("https://www.dev2.checkatrade.com/")){
	GlobalVariable.WebOfficeURL="https://admin2.dev.checkatrade.com/" // TODO
}
//GlobalVariable.WebOfficeURL="https://admin2.dev.checkatrade.com/"
//--------------------------------------------------------------------------------

//-----------------------------------------
// Startup Process -                      | NOTE: Members Area Function has it's OWN Startup Process
//-----------------------------------------
'Set Function Area for "URL_Handler", URL Resolution'
//GlobalVariable.FUNCTION_AREA = "Web_Office"
//-----------------------------------------
'Do Some Magic with URL(s) See the comments within URL Handler '
//WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Utils/URL_Handler'), [:], FailureHandling.CONTINUE_ON_FAILURE)
//-----------------------------------------
// Vars for possible inclusion in DataSheet
// Switch to Generic/Test Creds at some point
'------------------------------------------------'
'Moved Login Credentials to <Default> profile 22/01/2020'
//GlobalVariable.Username = "DavidHo"
//GlobalVariable.Password = "Check123"
'------------------------------------------------'
'WebOfficeURL - Set from the ENVIRONMENT PROFILE '
'OPEN BROWSER'
//////////////////////////////////////////////////
// Browser Open                                 //
//////////////////////////////////////////////////
'eg - https://admin.preview.checkatrade.com/  '
'Set in Profile Utilised During Test Execution'
WebUI.openBrowser(GlobalVariable.WebOfficeURL) // 

//////////////////////////////////////////////////
// Maximisde Browser                            //
//////////////////////////////////////////////////
'MAXIMIZE BROWSER '
WebUI.maximizeWindow()

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
	GlobalVariable.wo_Username)

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
	GlobalVariable.wo_Password)

//////////////////////////////////////////////////
// Hit LOGIN (Submit) Button                    //
//////////////////////////////////////////////////
'LOGIN'
WebUI.click(findTestObject('Object Repository/WebOffice/Page_Checkatrade - Administration - Login/Login_Button'))

//////////////////////////////////////////////////
// Page Load Synchronisation                    //                                   
//////////////////////////////////////////////////
'WAIT for browser to load - waits up to 60 seconds before timeout occurs '
WebUI.waitForPageLoad(60)

//////////////////////////////////////////////////
// Welcome Username                             //
//////////////////////////////////////////////////
WebUI.verifyTextPresent("Welcome "+GlobalVariable.wo_Username, false)

///////////////////////////////////////
//                END                //
///////////////////////////////////////