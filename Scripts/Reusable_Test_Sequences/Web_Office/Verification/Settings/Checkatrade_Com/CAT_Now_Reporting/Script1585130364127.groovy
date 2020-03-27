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
//  WO/Settings->Settings->Checkatrade.com    |    27/03/2020   |        DH        |       CAT Now Reporting     |
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
//	WHEN - We CLICK on the <SETTINGS> menu Item (Top Level) - Then Settings Sub Menu Item  (CAT Now Reporting )  |
//                                                                                                               |
//  THEN - Verify Details of the RETURNED Page are As Expected                                                   |
//                                                                                                               |
//---------------------------------------------------------------------------------------------------------------


WebUI.waitForPageLoad(60)
//WebUI.waitForElementVisible(findTestObject('Object Repository/WO_Consumer/Page_/Edit_Consumer_SAVE_Button'), 60)
WebUI.delay(1)

	// Header
	'----------------------------------------------'
	WebUI.verifyTextPresent("Checkatrade Now Report - Last 30 Days", false)
	'----------------------------------------------'
	// Sub Section - Job Summary Table 
	'----------------------------------------------'
	WebUI.verifyTextPresent("Jobs Summary", false)
	'----------------------------------------------'
	// Table Headings
	'----------------------------------------------'
	WebUI.verifyTextPresent("Central Heating", false)	
	'----------------------------------------------'
	WebUI.verifyTextPresent("Electrician", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Plumber", false)
	'----------------------------------------------'
	// First Table Column Data
	'----------------------------------------------'
	WebUI.verifyTextPresent("All", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("PO", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("GU", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("SO", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("BH", false)
	'----------------------------------------------'
	// 2 Samples of Test Data 
	'----------------------------------------------'
	WebUI.verifyTextPresent("0", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("9", false)
	'----------------------------------------------'

	'----------------------------------------------'
	// Sub Section - Live Job Table (subset)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Live Jobs", false)
	'----------------------------------------------'
	// Table Headings
	'----------------------------------------------'
	WebUI.verifyTextPresent("Status", false)	
	'----------------------------------------------'
	WebUI.verifyTextPresent("Created", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Customer Recreated", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Customer Name", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Customer Number", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Customer Postcode", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Description ", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Trader Name ", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Job History ", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Dismissals", false)
	'----------------------------------------------'
	// First Table Column Data Sample
	'----------------------------------------------'
	WebUI.verifyTextPresent("Complete", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Accepted", false)
	'----------------------------------------------'
	// might need to scrolto here
	WebUI.verifyTextPresent("Cancelled", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Failed", false)
	'----------------------------------------------'
	// 2 Samples of Test Data 
	'----------------------------------------------'
	WebUI.verifyTextPresent("Electrics tripping", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("RG26", false)
	'----------------------------------------------'


'--------------------------------'
'           END                  |'
'--------------------------------'
