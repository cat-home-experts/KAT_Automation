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
//  WO/Sales Area/Email Templates Page Verify |    16/03/2020   |        DH        |            WIP              |
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
//	WHEN - We CLICK on the <SALES AREA> menu Item (Top Level) - Then <Email Templates> Sub Menu                  |
//                                                                                                               |
//  THEN - Verify Details of the RETURNED Page are As Expected                                                   |
//                                                                                                               |
//---------------------------------------------------------------------------------------------------------------


WebUI.waitForPageLoad(60)
//WebUI.waitForElementVisible(findTestObject('Object Repository/WO_Consumer/Page_/Edit_Consumer_SAVE_Button'), 60)
WebUI.delay(1)

	// Header
	'----------------------------------------------'
	WebUI.verifyTextPresent("One-Click Email Templates", false)
	'----------------------------------------------'
	// Sub Header
	WebUI.verifyTextPresent("Configure the email templates used on the Sales Area screen", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Emails will be generated using the provided templates and merge fields are supported", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Note: The email subject will be taken from the file name of the template", false)
	'----------------------------------------------'
	
	// Sub  Sub Header
	//WebUI.verifyTextPresent("Choose file", false)
	'----------------------------------------------'
	// WebUI.verifyTextPresent("No file selected", false)
	'----------------------------------------------'
	
	
	//WebUI.verifyTextPresent("Benefits can be marked as hidden from the Sales Area screen or can be deleted permenantly", false)
	'----------------------------------------------'
	//WebUI.verifyTextPresent('All changes will take effect when you click "Save Changes"', false)
	'----------------------------------------------'
	
	// Table Header
	WebUI.verifyTextPresent("ID", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Template Name", false)
	'----------------------------------------------'
	

	//WebUI.verifyTextPresent("Member Benefit Description", false)
	'----------------------------------------------'
	
	// Only Pick 2 Items From The List (Attempt at Robustness of Test (NA)
	//WebUI.verifyTextPresent("You control the trade category and the distance you travel", false)
	'----------------------------------------------'
	//WebUI.verifyTextPresent("Membership Advisor to help you achieve success", false)
	'----------------------------------------------'

	
	// Footer
	WebUI.verifyTextPresent("Merge Fields", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Below is a list of supported merge fields which where these merge tags will be replaced with company data when an email template is sent", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Merge Field Description", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Merge Field Codes", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Full name of staff member who sends the email", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("{FROM_NAME}, [FROM_NAME]", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Direct dial number of the staff member who sends the email", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("{FROM_DIRECT_DIAL}, [FROM_DIRECT_DIAL]", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Company ID", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("{COMPANY_ID}, [COMPANY_ID]", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Company TTR ID", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("{COMPANY_TTRID}, [COMPANY_TTRID]", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Company name", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("{COMPANY_NAME}, [COMPANY_NAME]", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Recipient full name", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("{RECIPIENT_LABEL_NAME}, [RECIPIENT_LABEL_NAME]", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Recipient first name", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("{RECIPIENT_FIRST_NAME}, [RECIPIENT_FIRST_NAME]", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Recipient email address", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("{EMAIL}, [EMAIL]", false)
	'----------------------------------------------'
		
'--------------------------------'
'           END                  |'
'--------------------------------'
