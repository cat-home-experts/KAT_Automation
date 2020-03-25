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
//  WO/Settings->Settings->Checkatrade.com    |    25/03/2020   |        DH        |        Web_Catagories       |
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
//	WHEN - We CLICK on the <SETTINGS> menu Item (Top Level) - Then Settings Sub Menu Item  (Web_Catagories)      |
//                                                                                                               |
//  THEN - Verify Details of the RETURNED Page are As Expected                                                   |
//                                                                                                               |
//---------------------------------------------------------------------------------------------------------------


WebUI.waitForPageLoad(60)
//WebUI.waitForElementVisible(findTestObject('Object Repository/WO_Consumer/Page_/Edit_Consumer_SAVE_Button'), 60)
WebUI.delay(1)

	// Header
	'----------------------------------------------'
	WebUI.verifyTextPresent("Web Categories", false)
		'----------------------------------------------'
	WebUI.verifyTextPresent("Add new top level category", false)
	
	// Sub Section - Table Header

	'----------------------------------------------'
	WebUI.verifyTextPresent("Category Na", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Category Hierarchy", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("SEO", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Members", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("In SubCate", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Create child", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Preview", false)
	'----------------------------------------------'
	
	// Sub Section - Table Contents (Sample)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Add child", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Search", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Air Conditioning", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("TDKC", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("TK", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Fire Alarms", false)
	'----------------------------------------------'

	//Button
	// WebUI.verifyTextPresent("Find Address", false) // Embedded Text in IFrame
	'----------------------------------------------'
	// Sub Section - Sales Appointment Area (Subset)
	// WebUI.verifyTextPresent("Save", false)
	'----------------------------------------------'

'--------------------------------'
'           END                  |'
'--------------------------------'
