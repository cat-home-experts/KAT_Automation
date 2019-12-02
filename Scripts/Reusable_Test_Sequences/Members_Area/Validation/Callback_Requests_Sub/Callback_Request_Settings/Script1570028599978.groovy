import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent

//-----------------------
// TEST HISTORY HEADER - |
//-----------------------
// Any changes to this script, please update the next available row below, with date, in the DATE CREATED column,
// Your Name in the CREATED BY column, and Finaly, The actual change implemented in the NOTES column.
//
//---------------------------------------------------------------------------------------------------------------
//       Test Definition / Description        |   Date Created  |    Created By    |             Notes           |
//---------------------------------------------------------------------------------------------------------------
//  My Feedback Page Initial Validation Checks|   12/09/2019    |      DH          |                             |
//  on Start up, Sub Tab = Callback Requests  |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
//  Commented Ashot screen capture, evaluation|   30/09/2019    |      DH          |                             |
//  Extended Element Wait Times to 60         |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
//  Thise test now broken into 2 chunks       |   03/10/2019    |                  |                             |
//  This test <Settings> and <Notes>          |                 |      DH          |                             |
//---------------------------------------------------------------------------------------------------------------
//  Listbox identies Subject to Change? WTS   |   19/11/2019    |      DH          | IDs changed for the 2nd time|
//---------------------------------------------------------------------------------------------------------------
//                                            |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------
//                                                                                                               |
//	GIVEN -                                                                                                      |
//                                                                                                               |
//	WHEN -                                                                                                       |
//                                                                                                               |
//  THEN -                                                                                                       |
//                                                                                                               |
//---------------------------------------------------------------------------------------------------------------

////////////////////////////////////////////////////////////
//     Wait for Settings Element Availability             //
////////////////////////////////////////////////////////////
WebUI.waitForPageLoad(25)
WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Members Area/a_Settings'), 50)

////////////////////////////////////////////////////////////
//     Take an Initial Screenshot of Home After Login     //
////////////////////////////////////////////////////////////
//WebUI.takeScreenshot('Reports/Screenshots/Initial_Members_page.png')
// Stores in Project <Screenshots> Folder
// CustomKeywords.'kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeEntirePageScreenshot'('Your_Customers_Callback_Request.png', FailureHandling.OPTIONAL)

'Check URL Is The Correct One :-)'
WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Utils/Check_URL'), [:], FailureHandling.CONTINUE_ON_FAILURE)

////////////////////////////////////////////////////////////
//         Verify Header Text on Key Portal Areas         //
////////////////////////////////////////////////////////////
'---------------------------------'
'DEFAULT TAB - Published Feedback '
'----------------------------------------------'
// Verify Key Textual Information
'----------------------------------------------'
// MEMBER ID CHECK
WebUI.verifyTextPresent(findTestData('Members_Test_Data').getValue('MEMBER_ID', 1), false)
'----------------------------------------------'
WebUI.verifyTextPresent("MEMBER ID", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Your Callback Requests", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Member Notes", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Add/Edit note", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Customer requests for a Callback appear here and you can also be alerted by text and email", false)
'----------------------------------------------'
WebUI.verifyTextPresent("These customers are waiting for your call, so even if it’s to let them know", false)
'----------------------------------------------'
///////////////////////////////////////////////
// Settings Dialog Tweeks
// Click <Settings? Control
WebUI.click(findTestObject('Object Repository/Page_Members Area/Page_Members Area/a_Settings'))
'----------------------------------------------'
// Synch - Page Data takes a time
WebUI.waitForElementVisible(findTestObject('Object Repository/Callback/work_Alerts_Text'), 10)
// Verify Key Textual Information
'----------------------------------------------'
WebUI.verifyTextPresent("Your Callback Requests", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Where would you like us to send your work alerts", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Automatic replies", false)
'----------------------------------------------'
// Checkbox set Alerts - Uncheck
WebUI.click(findTestObject('Object Repository/Page_Members Area/Page_Members Area/input_Settings_chkDisableWorkAlerts'))
'----------------------------------------------'
// Checkbox set Alerts - Check 
WebUI.click(findTestObject('Object Repository/Page_Members Area/Page_Members Area/input_Settings_chkDisableWorkAlerts'))
'----------------------------------------------'
// Values Changed <Send Emails To> listbox from 3 to 0 
//-----------------------
// Set <Send Emails To> listbox To <None>
//WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Members Area/Page_Members Area/select_Do not send_1'),
//	'0: Object', true)
//WebUI.selectOptionByValue(findTestObject('Page_Members Area/select_Do not send_email address'), // 19/11/2019 changes
//	'0: Object', true)
WebUI.selectOptionByValue(findTestObject('Members/Page_Members Area/select_Do not send_email address'),
	'0: Object', true)
'----------------------------------------------'
// Revert <Send Emails To> listbox To Previous Setting
//WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Members Area/Page_Members Area/select_Do not send_1'),
//	'14: Object', true)
//WebUI.selectOptionByValue(findTestObject('Page_Members Area/select_Do not send_email address'),  // 19/11/2019 changes
//	'15: Object', true)
WebUI.selectOptionByValue(findTestObject('Members/Page_Members Area/select_Do not send_email address'),
	'15: Object', true)
'----------------------------------------------'
// Set <Send SMS To> listbox To <Do Not Send>
//WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Members Area/Page_Members Area/select_Do not send_2'),
//	'3: Object', true)
//WebUI.selectOptionByValue(findTestObject('Page_Members Area/select_Do not sendOther'),  // 19/11/2019 changes
//	'0: Object', true)
WebUI.selectOptionByValue(findTestObject('Members/Page_Members Area/select_Do not send_sms'),
	'0: Object', true)
'----------------------------------------------'
// Revert <Send SMS To> listbox To Previous Setting
//WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Members Area/Page_Members Area/select_Do not send_2'),
//	'1: Object', true)
'----------------------------------------------'
// Scroll <Submit> Button Into View
WebUI.scrollToElement(findTestObject('Object Repository/Page_Members Area/Page_Members Area/button_Submit_1'), 25)
'----------------------------------------------'
// Check <Automatic Replies> Checkbox
WebUI.click(findTestObject('Object Repository/Page_Members Area/Page_Members Area/input_Send your customers initial info'))
'----------------------------------------------'
// Uncheck <Automatic Replies> Checkbox
WebUI.click(findTestObject('Object Repository/Page_Members Area/Page_Members Area/input_Send your customers initial info'))
'----------------------------------------------'
// Hit <SUBMIT> Button
WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Members Area/Page_Members Area/button_Submit_1'))
WebUI.click(findTestObject('Object Repository/Page_Members Area/Page_Members Area/button_Submit_1'))
'----------------------------------------------'
// WebUI.click(findTestObject('Object Repository/Page_Members Area/Page_Members Area/button_Close')) // Close problem - disconnected Dialog - Overcome with Robot, Below
'----------------------------------------------'
// Switch Context to Dialog
//WebUI.switchToWindowIndex(1)
'----------------------------------------------'
// Grab Dialog Text
'----------------------------------------------'
// Settings <SAVED> Reported
'----------------------------------------------'
//WebUI.verifyTextPresent("Your Settings have been saved", false)


///////////////////////////////////////////////
// Dispel The Windows Changes saved Dialog   //   
/////////////////////////////////////////////
'----------------------------------------------'
//WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Utils/Dispel_Windows_Dialog'), [:], FailureHandling.OPTIONAL)
'----------------------------------------------'
//WebUI.delay(2)

//WebUI.switchToWindowIndex(1)
// Button Disabled (dialog with focus) But Dialog is Dispelled When Clicked Submit manually
//WebUI.click(findTestObject('Object Repository/Page_Members Area/Page_Members Area/button_Submit_1')) 

//WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ESCAPE))
//Robot robot = new Robot()
//robot.keyPress(KeyEvent.VK_ESCAPE)
//robot.keyRelease(KeyEvent.VK_ESCAPE)
WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Members Area/button_Close'), 2)

WebUI.click(findTestObject('Object Repository/Page_Members Area/button_Close'))

WebUI.scrollToElement(findTestObject('Object Repository/Callback/work_Alerts_Text'), 2)
WebUI.click(findTestObject('Object Repository/Callback/work_Alerts_Text'))
'----------------------------------------------'// Verify Dialog Text (Your Settings have been saved) is Displayed
// WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Members Area/div_Your Settings have been savedClose'), 2)
'----------------------------------------------'
// Click on <Your Settings Have Been Saved><Close> Button (Dialog)
// WebUI.click(findTestObject('Object Repository/Page_Members Area/div_Your Settings have been savedClose'))
'----------------------------------------------'
// Wait For Settings Element
//WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Members Area/a_Settings'), 2)
'----------------------------------------------'
// Scroll Back (up) To <Settings> Element
WebUI.scrollToElement(findTestObject('Object Repository/Page_Members Area/a_Settings'), 2)
'----------------------------------------------'
// Click <Settings> Control - Doesn't Close Automatically After <Close> is Actioned
//WebUI.click(findTestObject('Object Repository/Page_Members Area/a_Settings'))
'----------------------------------------------'

///////////////////////////////////////
//                END                //
///////////////////////////////////////
