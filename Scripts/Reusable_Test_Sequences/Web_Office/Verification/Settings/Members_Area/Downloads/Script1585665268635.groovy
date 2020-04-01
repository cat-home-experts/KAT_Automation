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
//  WO/Settings->Settings->Members Area       |    01/04/2020   |        DH        |           Downloads         |
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
//	WHEN - We CLICK on the <SETTINGS> menu Item (Top Level) - Then Settings Sub Menu Item  (Downloads)           |
//                                                                                                               |
//  THEN - Verify Details of the RETURNED Page are As Expected                                                   |
//                                                                                                               |
//---------------------------------------------------------------------------------------------------------------


WebUI.waitForPageLoad(60)
//WebUI.waitForElementVisible(findTestObject('Object Repository/WO_Consumer/Page_/Edit_Consumer_SAVE_Button'), 60)
WebUI.delay(1)

	// Header
	'----------------------------------------------'
	WebUI.verifyTextPresent("Member Downloads", false)
	'----------------------------------------------'

	// Sub Section - Table Header
	'----------------------------------------------'
	WebUI.verifyTextPresent("Title", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Description", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("In Use", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Template Changed", false)
	'----------------------------------------------'
	//WebUI.verifyTextPresent("Quote", false)
	'----------------------------------------------'
	// Table Body (sample)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Job sign off", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Customers to sign off work on completion", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Yes", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Edit", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Upload", false)
	'----------------------------------------------'

	// Footer
	'----------------------------------------------'
	WebUI.verifyTextPresent("Add New Document", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Title:", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Description:", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("File to upload:", false)
	'----------------------------------------------'
	//WebUI.verifyTextPresent("Choose file", false)
	'----------------------------------------------'
	//WebUI.verifyTextPresent("No file chosen", false)
	'----------------------------------------------'
	//WebUI.verifyTextPresent("Add Template", false)
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
