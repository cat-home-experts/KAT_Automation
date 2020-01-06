import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.openqa.selenium.Keys as Keys

//-----------------------
// TEST HISTORY HEADER - |
//-----------------------
// Any changes to this script, please update the next available row below, with date, in the DATE CREATED column,
// Your NAme in the CREATED BY column, and Finaly, The actual change implemented in the NOTES column.
//
//---------------------------------------------------------------------------------------------------------------
//       Test Definition / Description        |   Date Created  |    Created By    |             Notes           |
//---------------------------------------------------------------------------------------------------------------
//  Major Home Page Changes Extend This Script|   05/12/2019    |        DH        | Now several navigation Steps|
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
//------------------------------------------------------------------------
// Hit Trades Apply Here - Signup from the Homepage Header Banner        | - Snip - 30/07/2019 - need to tidy repo to remove the space in the string
//------------------------------------------------------------------------
//' Major Changes Around The Selection Function and Entry Details'
//WebUI.click(findTestObject('Object Repository/Page_Checkatrade Find a tradesperson you can trust/a_Trades                                apply here'))
//
//' Major Changes Around The Selection Function and Entry Details 05/12/2019'

try {
	// New Website
	'---------------------------------'
	' Click on <Trades> Header Button |'
	'---------------------------------'
	WebUI.waitForElementClickable(findTestObject('Object Repository/New_Home_Page/Trades_Button'), 10)
	WebUI.click(findTestObject('Object Repository/New_Home_Page/Trades_Button'))
	
	'---------------------------------'
	' Click on <Find Out More> Banner |'
	'---------------------------------'
	WebUI.waitForElementClickable(findTestObject('Object Repository/New_Home_Page/Find_Out_More_Button'), 10)
	WebUI.click(findTestObject('Object Repository/New_Home_Page/Find_Out_More_Button'))
	
	'---------------------------------'
	' Click on <Trade Application> B  |' // Default Selection = Trade Member Application
	'---------------------------------'
	//WebUI.waitForElementClickable(findTestObject('Object Repository/Trades_Apply_Here/Page_Checkatrade Membership Overview/span_Trades Application'), 10)
	//WebUI.click(findTestObject('Object Repository/Trades_Apply_Here/Page_Checkatrade Membership Overview/span_Trades Application'))

	//-----------------------------------------
} catch (Exception e) { // ObjectNotFound
	// Old website
	'---------------------------------'
	' Click on <Trades> Header Button |'
	'---------------------------------'
	WebUI.waitForElementClickable(findTestObject('Object Repository/Trades_Apply_Here/Page_Checkatrade Find a tradesperson you can trust/div_Trades'), 10)
	WebUI.click(findTestObject('Object Repository/Trades_Apply_Here/Page_Checkatrade Find a tradesperson you can trust/div_Trades'))
	
	'---------------------------------'
	' Click on <Find Out More> Banner |'
	'---------------------------------'
	WebUI.waitForElementClickable(findTestObject('Object Repository/Trades_Apply_Here/Page_Checkatrade Find a tradesperson you can trust/div_Find out more'), 10)
	WebUI.click(findTestObject('Object Repository/Trades_Apply_Here/Page_Checkatrade Find a tradesperson you can trust/div_Find out more'))
	
	'---------------------------------'
	' Click on <Trade Application> B  |'
	'---------------------------------'
	WebUI.waitForElementClickable(findTestObject('Object Repository/Trades_Apply_Here/Page_Checkatrade Membership Overview/span_Trades Application'), 10)
	WebUI.click(findTestObject('Object Repository/Trades_Apply_Here/Page_Checkatrade Membership Overview/span_Trades Application'))

	//-----------------------------------------
}



//
//WebUI.setText(findTestObject('Object Repository/Trades_Apply_Here/Page_Checkatrade Want to build your business/input_find out more_ctl00contenttbContactEmail'), 
//    'fred@ggg.com')
//
//WebUI.click(findTestObject('Object Repository/Trades_Apply_Here/Page_Checkatrade Want to build your business/input_find out more_ctl00contenttbContactEmail'))
//
//WebUI.setText(findTestObject('Object Repository/Trades_Apply_Here/Page_Checkatrade Want to build your business/input_find out more_ctl00contenttbContactEmail'), 
//    'fred@ggg.com')
//
//WebUI.setText(findTestObject('Object Repository/Trades_Apply_Here/Page_Checkatrade Want to build your business/input_find out more_ctl00contenttbCompanyName'), 
//    'bristols limited')
//
//WebUI.setText(findTestObject('Object Repository/Trades_Apply_Here/Page_Checkatrade Want to build your business/input_find out more_ctl00contenttbContactMob'), 
//    '02393123456')
//
//WebUI.setText(findTestObject('Object Repository/Trades_Apply_Here/Page_Checkatrade Want to build your business/input_find out more_ctl00contenttbPostCode'), 
//    'po12 4sd')
//
//WebUI.click(findTestObject('Object Repository/Trades_Apply_Here/Page_Checkatrade Want to build your business/input_Privacy Notice_ctl00contentbtnSubmit'))

///////////////////////////////////////
//                END                //
///////////////////////////////////////

