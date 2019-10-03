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
//                                            |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
//                                            |                 |                  |                             |
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
WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Members Area/a_Settings'), 50)

////////////////////////////////////////////////////////////
//     Take an Initial Screenshot of Home After Login     //
////////////////////////////////////////////////////////////
//WebUI.takeScreenshot('Reports/Screenshots/Initial_Members_page.png')
// Stores in Project <Screenshots> Folder
// CustomKeywords.'kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeEntirePageScreenshot'('Your_Customers_Callback_Request.png', FailureHandling.OPTIONAL)

////////////////////////////////////////////////////////////
//         Verify Header Text on Key Portal Areas         //
////////////////////////////////////////////////////////////
'---------------------------------'
'DEFAULT TAB - Published Feedback '
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
WebUI.click(findTestObject('Object Repository/Page_Members Area/Page_Members Area/a_Settings'))
'----------------------------------------------'
WebUI.verifyTextPresent("Your Callback Requests", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Where would you like us to send your work alerts", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Automatic replies", false)
'----------------------------------------------'
WebUI.click(findTestObject('Object Repository/Page_Members Area/Page_Members Area/input_Settings_chkDisableWorkAlerts'))
'----------------------------------------------'
WebUI.click(findTestObject('Object Repository/Page_Members Area/Page_Members Area/input_Settings_chkDisableWorkAlerts'))
'----------------------------------------------'
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Members Area/Page_Members Area/select_Do not send_1'),
	'3: Object', true)
'----------------------------------------------'
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Members Area/Page_Members Area/select_Do not send_1'),
	'14: Object', true)
'----------------------------------------------'
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Members Area/Page_Members Area/select_Do not send_2'),
	'3: Object', true)
'----------------------------------------------'
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Members Area/Page_Members Area/select_Do not send_2'),
	'1: Object', true)
'----------------------------------------------'
WebUI.scrollToElement(findTestObject('Object Repository/Page_Members Area/Page_Members Area/button_Submit_1'), 2)
'----------------------------------------------'
WebUI.click(findTestObject('Object Repository/Page_Members Area/Page_Members Area/input_Send your customers initial info'))
'----------------------------------------------'
WebUI.click(findTestObject('Object Repository/Page_Members Area/Page_Members Area/input_Send your customers initial info'))
'----------------------------------------------'
WebUI.click(findTestObject('Object Repository/Page_Members Area/Page_Members Area/button_Submit_1'))
'----------------------------------------------'
// WebUI.click(findTestObject('Object Repository/Page_Members Area/Page_Members Area/button_Close')) // Close problem - disconnected Dialog - Overcome with Robot, Below
'----------------------------------------------'
WebUI.delay(1)
// Dispel Popout Dialog
//WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ESCAPE))
Robot robot = new Robot()
robot.keyPress(KeyEvent.VK_ESCAPE)
robot.keyRelease(KeyEvent.VK_ESCAPE)
'----------------------------------------------'
//WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Members Area/Page_Members Area/a_Settings'), 2)
'----------------------------------------------'
//WebUI.click(findTestObject('Object Repository/Page_Members Area/Page_Members Area/a_Settings'))
'----------------------------------------------'
///////////////////////////////////////////////
// Add/Edit Note
//'----------------------------------------------'
WebUI.scrollToElement(findTestObject('Object Repository/Page_Members Area/Page_Members Area/a_AddEdit note'))
//'----------------------------------------------'
//WebUI.click(findTestObject('Object Repository/Page_Members Area/Page_Members Area/a_AddEdit note'))
//'----------------------------------------------'
//WebUI.waitForElementClickable('Object Repository/Page_Members Area/Page_Members Area/button_Submit', 5)
//'----------------------------------------------'
//WebUI.setText(findTestObject('Object Repository/Page_Members Area/Page_Members Area/textarea_AddEdit Notes'), 'this is still a cool note')
//'----------------------------------------------'
//WebUI.verifyTextPresent("Close", false)
//'----------------------------------------------'
//WebUI.click(findTestObject('Object Repository/Page_Members Area/Page_Members Area/button_Submit'))
//'----------------------------------------------'
///////////////////////////////////////
//                END                //
///////////////////////////////////////
