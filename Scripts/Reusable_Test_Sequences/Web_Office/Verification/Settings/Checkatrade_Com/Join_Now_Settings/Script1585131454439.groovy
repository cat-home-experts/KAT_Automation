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
//  WO/Settings->Settings->Checkatrade.com    |    25/03/2020   |        DH        |       Join Now Settings     |
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
//	WHEN - We CLICK on the <SETTINGS> menu Item (Top Level) - Then Settings Sub Menu Item  (Join Now Settings )  |
//                                                                                                               |
//  THEN - Verify Details of the RETURNED Page are As Expected                                                   |
//                                                                                                               |
//---------------------------------------------------------------------------------------------------------------


WebUI.waitForPageLoad(60)
//WebUI.waitForElementVisible(findTestObject('Object Repository/WO_Consumer/Page_/Edit_Consumer_SAVE_Button'), 60)
WebUI.delay(1)

	// Header
	'----------------------------------------------'
	WebUI.verifyTextPresent("Join Now Form Settings", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Closed Dates", false)
	'----------------------------------------------'
	
	// Tab Pages
	'----------------------------------------------'
	WebUI.verifyTextPresent("Form Content", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Join Now Campaigns", false)
	'----------------------------------------------'
	
	// Default Tab Content (Form Content)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Form Heading", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Form Text", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Sorry the office is now closed", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("You will receive a call", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Show Call Back Time", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Use default text", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Set manual text", false)
	'----------------------------------------------'

	'Navigate Tab (Join Now)'
	
	WebUI.click(findTestObject('Object Repository/WebOffice_Home_page/Page_/a_Join Now Campaigns'))
	'----------------------------------------------'
	WebUI.delay(1)
	WebUI.waitForPageLoad(5)

	// Tab Content (Join Now Campaigns) Button
	'----------------------------------------------'
	// WebUI.verifyTextPresent("New Campaign", false) // Checked Below
	'----------------------------------------------'
	// Table Header
	WebUI.verifyTextPresent("Title", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Description", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Starts", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Ends", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Enabled", false)
	'----------------------------------------------'

	// Table Content Sample
	'----------------------------------------------'
	WebUI.verifyTextPresent("Two months membership", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Offer ends", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Edit", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("12 months for the price of", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Offer ends", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("joining fee", false)
	'----------------------------------------------'

	// New Campaign Button
	WebUI.click(findTestObject('Object Repository/WebOffice_Home_page/Page_/input_Set manual text_ctl00CP1btnCreateCampaign'))
	'----------------------------------------------'
	WebUI.delay(1)
	WebUI.waitForPageLoad(5)

	'----------------------------------------------'
	WebUI.verifyTextPresent("Title", false)
	// Enter Text, Non Submit
	WebUI.setText(findTestObject('Object Repository/WebOffice_Home_page/Page_/input_Title_ctl00CP1txtTitle'), 'Tester')
	'----------------------------------------------'
	WebUI.verifyTextPresent("Description", false)
	// Enter Text, Non Submit
	WebUI.setText(findTestObject('Object Repository/WebOffice_Home_page/Page_/input_Description_ctl00CP1txtDescription'), 'Testing')
	'----------------------------------------------'
	WebUI.verifyTextPresent("Terms and Conditions", false)
	// Enter Text, Non Submit
	WebUI.setText(findTestObject('Object Repository/WebOffice_Home_page/Page_/textarea_Terms and Conditions_ctl00CP1txtTerms'),	'Testing Tester')
	'----------------------------------------------'
	WebUI.verifyTextPresent("Enabled", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Start Date", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("End Date", false)

	'----------------------------------------------'
	// Sub Section - Sales Appointment Area (Subset)
	// WebUI.verifyTextPresent("Save", false)
	'----------------------------------------------'

'--------------------------------'
'           END                  |'
'--------------------------------'
