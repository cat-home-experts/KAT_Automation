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
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent

//-----------------------
// TEST HISTORY HEADER -|
//-----------------------
// Any changes to this script, please update the next available row below, with date, in the DATE CREATED column,
// Your Name in the CREATED BY column, and Finaly, The actual change implemented in the NOTES column.
//
//---------------------------------------------------------------------------------------------------------------
//       Test Definition / Description        |   Date Created  |    Created By    |             Notes           |
//---------------------------------------------------------------------------------------------------------------
// Validation of Contact Preferences Page     |    17/12/2019   |        DH        |  2 Check Boxes to select    |
//                                            |                 |                  |  Function currently No Save |
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
//	GIVEN -                                                                                                      |
//                                                                                                               |
//	WHEN -                                                                                                       |
//                                                                                                               |
//  THEN -                                                                                                       |
//                                                                                                               |
//---------------------------------------------------------------------------------------------------------------

////////////////////////////////////////////////////////////
//     Wait for Apply Filter Element Availability         //
////////////////////////////////////////////////////////////
WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Members Area/a_Contact_prefs_SAVE'), 60)

// Dispel 'ROLL OVER' Menu
//Robot robot = new Robot()  // eg for scroll up
//robot.keyPress(KeyEvent.VK_ESCAPE)
//robot.keyRelease(KeyEvent.VK_ESCAPE)
//WebUI.waitForPageLoad(60)

// Hit the <SAVE> Button - To Dispell popout Menu and to give page focus
WebUI.click(findTestObject('Object Repository/Page_Members Area/a_Contact_prefs_SAVE'))
WebUI.waitForPageLoad(60)

////////////////////////////////////////////////////////////
//     Take an Initial Screenshot of Home After Login     //
////////////////////////////////////////////////////////////
//WebUI.takeScreenshot('Reports/Screenshots/Initial_Members_page.png')
// Stores in Project <Screenshots> Folder
//CustomKeywords.'kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeEntirePageScreenshot'('Your_Customers_My_Profile.png', FailureHandling.OPTIONAL)

'Check URL Is The Correct One :-)'
WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Utils/Check_URL'), [:], FailureHandling.CONTINUE_ON_FAILURE)

////////////////////////////////////////////////////////////
//         Verify Header Text on Key Portal Areas         //
////////////////////////////////////////////////////////////
// MEMBER ID CHECK
WebUI.verifyTextPresent(findTestData('Members_Test_Data').getValue('MEMBER_ID', 1), false)
'----------------------------------------------'
WebUI.verifyTextPresent("MEMBER ID", false)
'----------------------------------------------'
'DEFAULT TAB - Contact Preferences     '
'---------------------------------'
WebUI.verifyTextPresent("Set Your Contact Preferences", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Managed Contacts", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Unable to alter these details at this time", false)
'----------------------------------------------'
WebUI.verifyTextPresent("please contact your Membership Advice team on 01243 608138", false)
'----------------------------------------------'
WebUI.verifyTextPresent("email managedcontacts@checkatrade.com", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Contact Preferences", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Email", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Email me details of new Customer Feedback published by Checkatrade", false)
'----------------------------------------------'
//WebUI.verifyTextPresent("'Mobile", false)
'----------------------------------------------'
//WebUI.verifyTextPresent("'Text me when new Customer Feedback is published by Checkatrade", false)
'----------------------------------------------'
WebUI.verifyTextPresent('Save', false)
'----------------------------------------------'
//WebUI.verifyTextPresent("'Your details have been updated", false)
'----------------------------------------------'
'3 commented elements, above - not being picked up - will revisit when function is fully implemented'
'----------------------------------------------'
///////////////////////////////////////
//                END                //
///////////////////////////////////////
