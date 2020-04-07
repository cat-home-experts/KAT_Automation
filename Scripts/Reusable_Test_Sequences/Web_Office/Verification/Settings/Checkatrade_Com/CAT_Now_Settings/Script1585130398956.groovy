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
//  WO/Settings->Settings->Checkatrade.com    |    26/03/2020   |        DH        |      (CAT Now Settings)     |
//---------------------------------------------------------------------------------------------------------------
//  MenuItem  ->Settings->cheka*.*>CAT Now Set|   07/06/2020    |        DH        |   Prop ref changed to xpath |
//---------------------------------------------------------------------------------------------------------------
//  Page content changes, robustified changes |   07/06/2020    |        DH        |                             |
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
//	WHEN - We CLICK on the <SETTINGS> menu Item (Top Level) - Then Settings Sub Menu Item  (CAT Now Settings)    |
//                                                                                                               |
//  THEN - Verify Details of the RETURNED Page are As Expected                                                   |
//                                                                                                               |
//---------------------------------------------------------------------------------------------------------------


WebUI.waitForPageLoad(60)
//WebUI.waitForElementVisible(findTestObject('Object Repository/WO_Consumer/Page_/Edit_Consumer_SAVE_Button'), 60)
WebUI.delay(1)

	// Header
	'----------------------------------------------'
	WebUI.verifyTextPresent("Categories", false)
	'----------------------------------------------'
	// Sub Section - Personal Details (Subset)
	'----------------------------------------------'
	// Sub Header LH Side
	'----------------------------------------------'
	WebUI.verifyTextPresent("Emergency Categories", false)
	'----------------------------------------------'
	// Table Header
	'----------------------------------------------'
	WebUI.verifyTextPresent("Name", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Edit", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Delete", false)
	'----------------------------------------------'
	// Table Name Data
	'----------------------------------------------'
	//WebUI.verifyTextPresent("Alarms Security Specialist", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Central Heating", false)
	'----------------------------------------------'
	//WebUI.verifyTextPresent("Drains Expert", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Electrician", false)
	'----------------------------------------------'
	//WebUI.verifyTextPresent("Locksmith", false)
	'----------------------------------------------'
	//WebUI.verifyTextPresent("Pest Control Expert", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Plumber", false)
	'----------------------------------------------'
	//WebUI.verifyTextPresent("Roofer", false)
	'----------------------------------------------'
	//WebUI.verifyTextPresent("Tree Surgeon", false)
	'----------------------------------------------'
	//WebUI.verifyTextPresent("Windows Doors Conservatories", false)
	'----------------------------------------------'
	
	// Sub Header RH Side
	'----------------------------------------------'
	WebUI.verifyTextPresent("System Settings", false)
	'----------------------------------------------'
	// Field Names (Sample)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Status", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Allowed Postcodes", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Admin Emails", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Test Trader IDs", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Start Time", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("End Time", false)
	'----------------------------------------------'
	// Field Content (sample)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Running", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("KT13", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("PO12", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("BH25", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("RG26", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("richard@vocala.co", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("536", false)
	'----------------------------------------------'
	//WebUI.verifyTextPresent("00:01:00", false)
	'----------------------------------------------'
	//WebUI.verifyTextPresent("23:58:00", false)
	'----------------------------------------------'
	'----------------------------------------------'
	'EXTEND AND MODIFY FOR GREATER COVERAGE'
	'----------------------------------------------'
	
	
//	WebUI.verifyTextPresent("Box 1", false)
//	'----------------------------------------------'
//	WebUI.verifyTextPresent("Currently unavailable as box has been replaced", false)
//	'----------------------------------------------'
//	WebUI.verifyTextPresent("Contents", false)
//	'----------------------------------------------'
//	WebUI.verifyTextPresent("Statistics boxes", false)
//	'----------------------------------------------'
//	// Sub Section - Stats
//	'----------------------------------------------'
//	WebUI.verifyTextPresent("Stat box 1", false)
//	'----------------------------------------------'
//	WebUI.verifyTextPresent("Stat box 2", false)
//	'----------------------------------------------'
//	WebUI.verifyTextPresent("Stat box 3", false)
//	'----------------------------------------------'
//	WebUI.verifyTextPresent("Feedback", false)
//	'----------------------------------------------'
//	WebUI.verifyTextPresent("Note: It may take up to 15 minutes for these changes to take effect on the homepage.", false)
//	'----------------------------------------------'
//	//Button
//	// WebUI.verifyTextPresent("Find Address", false) // Embedded Text in IFrame
//	'----------------------------------------------'
//	// Sub Section - Sales Appointment Area (Subset)
//	// WebUI.verifyTextPresent("Save", false)
//	'----------------------------------------------'

'--------------------------------'
'           END                  |'
'--------------------------------'
