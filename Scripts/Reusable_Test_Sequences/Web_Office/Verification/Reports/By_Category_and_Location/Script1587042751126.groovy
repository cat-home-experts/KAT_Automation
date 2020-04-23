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
//  Settings->Web Office-> Sub Menu Item      |    16/04/2020   |        DH        |  a_By Category and Location |
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
//	WHEN - We CLICK on the <Settings> menu Item (Top Level) - Then Sub Menu Item WebOffice (By Category & Locati |
//                                                                                                               |
//  THEN - Verify Details of the RETURNED Page are As Expected                                                   |
//                                                                                                               |
//---------------------------------------------------------------------------------------------------------------

WebUI.waitForPageLoad(120)
//WebUI.waitForElementVisible(findTestObject('Object Repository/WO_Consumer/Page_/Edit_Consumer_SAVE_Button'), 60)
WebUI.delay(1)

	// Header
	'----------------------------------------------'
	WebUI.verifyTextPresent("Searches by Location and Category", false)
	'----------------------------------------------'
	
	// Sub Headers, Tabs, Headers-

	'----------------------------------------------'
	WebUI.verifyTextPresent("County", false)
	'----------------------------------------------'
 	WebUI.verifyTextPresent("Town", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("By Postcode", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Select Categories", false)
	'----------------------------------------------'
	//WebUI.verifyTextPresent("Filter", false)
	'----------------------------------------------'

	// Sub Section - Table Content Sample
	'----------------------------------------------'
	WebUI.verifyTextPresent("Angus", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Berkshire", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Avon", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Air Conditioning", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Alarms/Security", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("CCTV", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Fire", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Alarms", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Extinguishers", false)
	'----------------------------------------------'
//
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
//		// Footer
//	'----------------------------------------------'
//	//WebUI.verifyTextPresent("Unsubmit Selected Application", false)
//	'----------------------------------------------'
//
//
//	//Button
//	// WebUI.verifyTextPresent("Find Address", false) // Embedded Text in IFrame
//	'----------------------------------------------'
//	// Sub Section - Sales Appointment Area (Subset)
//	// WebUI.verifyTextPresent("Save", false)
//	'----------------------------------------------'

'--------------------------------'
'           END                  |'
'--------------------------------'
