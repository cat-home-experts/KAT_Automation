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

//-----------------------
// TEST HISTORY HEADER - |
//-----------------------
// Any changes to this script, please update the next available row below, with date, in the DATE CREATED column,
// Your Name in the CREATED BY column, and Finaly, The actual change implemented in the NOTES column.
//
//---------------------------------------------------------------------------------------------------------------
//       Test Definition / Description        |   Date Created  |    Created By    |             Notes           |
//---------------------------------------------------------------------------------------------------------------
//  WO/Sales Area/Members Sales Page Verify   |    16/03/2020   |        DH        |          WIP                |
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
//	GIVEN -  With Web Office Open                                                                                |
//                                                                                                               |
//	WHEN - We CLICK on the <SALES AREA> menu Item (Top Level) - Then <Sales Area> Sub Menu                    |
//                                                                                                               |
//  THEN - Verify Details of the RETURNED Page are As Expected                                                   |
//                                                                                                               |
//---------------------------------------------------------------------------------------------------------------


WebUI.waitForPageLoad(60)
//WebUI.waitForElementVisible(findTestObject('Object Repository/WO_Consumer/Page_/Edit_Consumer_SAVE_Button'), 60)
WebUI.delay(1)

	// Header
	'----------------------------------------------'
	// WebUI.verifyTextPresent("Postcode", false)
	'----------------------------------------------'
	// Buttons
	WebUI.verifyTextPresent("From", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("To", false)
	'----------------------------------------------'
	
	// Sub Header
	WebUI.verifyTextPresent("Distance", false)
	'----------------------------------------------'
	// Buttons
	WebUI.verifyTextPresent("Price", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Vetting Details", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent('MC Availability', false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Member Benefits", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Consultancy", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Send Email Template", false)
	'----------------------------------------------'
	
	// Only Pick 2 Items From The List (Attempt at Robustness of Test (NA)
	//WebUI.verifyTextPresent("You control the trade category and the distance you travel", false)
	'----------------------------------------------'
	//WebUI.verifyTextPresent("Membership Advisor to help you achieve success", false)
	'----------------------------------------------'


'--------------------------------'
'           END                  |'
'--------------------------------'
