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
//  Settings->Web Office-> Sub Menu Item      |    17/04/2020   |        DH        |       a_Search Tracking     |
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
//	WHEN - We CLICK on the <Settings> menu Item (Top Level) - Then Sub Menu Item WebOffice (Search Tracking)     |
//                                                                                                               |
//  THEN - Verify Details of the RETURNED Page are As Expected                                                   |
//                                                                                                               |
//---------------------------------------------------------------------------------------------------------------

WebUI.waitForPageLoad(120)
//WebUI.waitForElementVisible(findTestObject('Object Repository/WO_Consumer/Page_/Edit_Consumer_SAVE_Button'), 60)
WebUI.delay(1)

	// Header
	'----------------------------------------------'
	WebUI.verifyTextPresent("Search Tracking", false)
	'----------------------------------------------'
	
	// Sub Headers, Tabs, Headers-

	'----------------------------------------------'
	WebUI.verifyTextPresent("ID", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("TRADE", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("LOCATION", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("DATETIME", false)
	'----------------------------------------------'


	// Sub Section - Table Content Sample
	'----------------------------------------------'
	WebUI.verifyTextPresent("14262747", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("UPVC Repairs", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("MILFORD HAVEN", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("28-09-2017 7:19:10", false)
	'----------------------------------------------'

//	// Table Contents - Sample
//	'----------------------------------------------'
//	WebUI.verifyTextPresent("Abingdon + Didcot 7 (Old)", false)
//	'----------------------------------------------'
//	WebUI.verifyTextPresent("Amersham + Chesham 12 (Current)", false)
//	'----------------------------------------------'
//	WebUI.verifyTextPresent("11", false)
//	'----------------------------------------------'
//	WebUI.verifyTextPresent("133", false)
//	'----------------------------------------------'
//	WebUI.verifyTextPresent("58", false)
//	'----------------------------------------------'
//
	// Footer

//	//Button
//	// WebUI.verifyTextPresent("Find Address", false) // Embedded Text in IFrame
//	'----------------------------------------------'
//	// Sub Section - Sales Appointment Area (Subset)
//	// WebUI.verifyTextPresent("Save", false)
//	'----------------------------------------------'

'--------------------------------'
'           END                  |'
'--------------------------------'
