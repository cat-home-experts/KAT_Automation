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
//  Settings->Web Office-> Sub Menu Item      |    28/04/2020   |        DH        |a_Sales - Response to Visits |
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
//	WHEN - We CLICK on the <Settings> menu Item (Top Level) - Then Sub Menu Item WebOffice (Sales - Response to  |
//                                                                                                  Visits)      |
//  THEN - Verify Details of the RETURNED Page are As Expected                                                   |
//                                                                                                               |
//---------------------------------------------------------------------------------------------------------------

WebUI.waitForPageLoad(120)
//WebUI.waitForElementVisible(findTestObject('Object Repository/WO_Consumer/Page_/Edit_Consumer_SAVE_Button'), 60)
WebUI.delay(1)

	// Table Header
	'----------------------------------------------'
	WebUI.verifyTextPresent("Response to Visits Report", false)
	'----------------------------------------------'
	  
	// Tabs
	'----------------------------------------------'
	WebUI.verifyTextPresent("Report", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Compare Staff", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Compare Dates", false)
	'----------------------------------------------'

	// Content
	'----------------------------------------------'
	WebUI.verifyTextPresent("Attended by", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Compare to appointments", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Attended by", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Appt date from", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Months from", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Lead type", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Created by", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Compare with:", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Status", false)
	'----------------------------------------------'

	// Footer Table Header
	'----------------------------------------------'
	WebUI.verifyTextPresent("Response to visit", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Visits", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Signed up", false)
	'----------------------------------------------'


	'----------------------------------------------'
'--------------------------------'
'           END                  |'
'--------------------------------'
