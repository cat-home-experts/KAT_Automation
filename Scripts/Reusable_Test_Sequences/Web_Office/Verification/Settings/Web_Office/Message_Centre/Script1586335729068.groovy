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
//  Settings->Web Office-> Sub Menu Item      |    08/04/2020   |        DH        |       a_Message Centre      |
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
//	WHEN - We CLICK on the <Settings> menu Item (Top Level) - Then Sub Menu Item WebOffice  (Message Centre)     |
//                                                                                                               |
//  THEN - Verify Details of the RETURNED Page are As Expected                                                   |
//                                                                                                               |
//---------------------------------------------------------------------------------------------------------------

WebUI.waitForPageLoad(60)
//WebUI.waitForElementVisible(findTestObject('Object Repository/WO_Consumer/Page_/Edit_Consumer_SAVE_Button'), 60)
WebUI.delay(1)

	// Header
	'----------------------------------------------'
	WebUI.verifyTextPresent("Message Centre", false)
	'----------------------------------------------'
	
	// Sub Header/Form Header - and Detail
	'----------------------------------------------'
	WebUI.verifyTextPresent("Edit the message", false)
	'----------------------------------------------'

	// Form Detail
	'----------------------------------------------'
	WebUI.verifyTextPresent("Message Text", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("160 characters remaining", false)
	'----------------------------------------------'
	// Merge Fields
	'----------------------------------------------'
	WebUI.verifyTextPresent("Merge Fields", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("AddressPhone1", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("AppointmentStartTime", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("CheckatradeUrl", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("CompanyID", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("CompanyName", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("ConfirmationLink", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("FeedbackCount", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("PostCode", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Salutation", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Score", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("ValidationCode", false)
	'----------------------------------------------'

	// Test Message Templates
	// Table Content (sample)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Text message templates", false)
//	'----------------------------------------------'
	'IFrame Issues Reading, like Elswhere, tackle this with time :-)'
//	WebUI.verifyTextPresent("Callback", false)
//	'----------------------------------------------'
//	WebUI.verifyTextPresent("Notification", false)
//	'----------------------------------------------'
//	WebUI.verifyTextPresent("NotificationByCompany", false)
//	'----------------------------------------------'
//	WebUI.verifyTextPresent("ReminderForOnlineMomitor", false)
//	'----------------------------------------------'
//	WebUI.verifyTextPresent("ReminderForPrintedCard", false)
//	'----------------------------------------------'
//	WebUI.verifyTextPresent("Validation", false)
//	'----------------------------------------------'
//	WebUI.verifyTextPresent("ValidationResend", false)
//	'----------------------------------------------'
//	WebUI.verifyTextPresent("ValidationWithReply", false)
//	'----------------------------------------------'
//	WebUI.verifyTextPresent("ValidationWithReplyResend", false)
//	'----------------------------------------------'
//	WebUI.verifyTextPresent("AppointmentNotification", false)
//	'----------------------------------------------'
//	WebUI.verifyTextPresent("JoinNotification", false)
//	'----------------------------------------------'
//	WebUI.verifyTextPresent("CustomerReminder", false)
//	'----------------------------------------------'
//	WebUI.verifyTextPresent("N22", false)
//	'----------------------------------------------'

	//Button
	// WebUI.verifyTextPresent("Find Address", false) // Embedded Text in IFrame
	'----------------------------------------------'
	// Sub Section - Sales Appointment Area (Subset)
	// WebUI.verifyTextPresent("Save", false)
	'----------------------------------------------'

'--------------------------------'
'           END                  |'
'--------------------------------'
