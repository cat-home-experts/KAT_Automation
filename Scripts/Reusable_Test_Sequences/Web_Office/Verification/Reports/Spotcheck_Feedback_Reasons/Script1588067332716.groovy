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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
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
//  Settings->Web Office-> Sub Menu Item      |    28/04/2020   |        DH        |a_Spotchecks Feedback Reasons|
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
//	WHEN - We CLICK on the <Settings> menu Item (Top Level) - Then Sub Menu Item WebOffice  (Spotchecks Feedback |
//                                                                                                    Reasons)   |
//  THEN - Verify Details of the RETURNED Page are As Expected                                                   |
//                                                                                                               |
//---------------------------------------------------------------------------------------------------------------

WebUI.waitForPageLoad(120)
//WebUI.waitForElementVisible(findTestObject('Object Repository/WO_Consumer/Page_/Edit_Consumer_SAVE_Button'), 60)
WebUI.delay(1)

	// Header
	'----------------------------------------------'
	WebUI.verifyTextPresent("Spotchecks Updated", false)
	'----------------------------------------------'
	
	// Sub header
	'----------------------------------------------'
	WebUI.verifyTextPresent("Export Options", false)
	'----------------------------------------------'
	
	// Table header
	'----------------------------------------------'
	WebUI.verifyTextPresent("Status Reason", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("January", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("February", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("March", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("April", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("May", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("June", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("July", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("August", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("September", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("October", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("November", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("December", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Total for Reason", false)
	'----------------------------------------------'

	
	// Table Content Sample
	'----------------------------------------------'
	WebUI.verifyTextPresent("Anonymous complaint", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Company warning", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Email address was not validated", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Failed feedback card", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("No longer a member", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Total Reasons per month", false)
	'----------------------------------------------'
	'----------------------------------------------'  


'----------------------------------------------'

	'----------------------------------------------'
'--------------------------------'
'           END                  |'
'--------------------------------'
