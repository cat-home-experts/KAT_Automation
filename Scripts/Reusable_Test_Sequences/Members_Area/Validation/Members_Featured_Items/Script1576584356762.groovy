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
// TEST HISTORY HEADER -|
//-----------------------
// Any changes to this script, please update the next available row below, with date, in the DATE CREATED column,
// Your Name in the CREATED BY column, and Finaly, The actual change implemented in the NOTES column.
//
//---------------------------------------------------------------------------------------------------------------
//       Test Definition / Description        |   Date Created  |    Created By    |             Notes           |
//---------------------------------------------------------------------------------------------------------------
// Validation of Featured Items Members Page  |    17/12/2019   |        DH        |  2 Check Boxes to select    |
//                                            |                 |                  |  Function currently No Save |
//---------------------------------------------------------------------------------------------------------------
// Radio buttons remoeved from page, was being|    16/01/2020   |        DH        |  Refactored to remove Radios|
// used to switch view (12 latest, so faileur |                 |                  |  (commented  reinstatement  |
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
// Selecttion of RADIOS to displell Popoutmenu, Default RADIO is 'Selection of Photos'
' Flip between the 2 radio buttons, returning to the default'
WebUI.waitForElementPresent(findTestObject('Object Repository/Membership/Page_Members Area/input_your 12 most recent photos_radSelection'), 60)
WebUI.click(findTestObject('Object Repository/Membership/Page_Members Area/input_your 12 most recent photos_radSelection'))
//WebUI.delay(2)
WebUI.waitForElementPresent(findTestObject('Object Repository/Membership/Page_Members Area/input_a selection of photos to choose'), 60)
WebUI.click(findTestObject('Object Repository/Membership/Page_Members Area/input_a selection of photos to choose'))
// Dispel 'ROLL OVER' Menu
//Robot robot = new Robot()  // eg for scroll up
//robot.keyPress(KeyEvent.VK_ESCAPE)
//robot.keyRelease(KeyEvent.VK_ESCAPE)
//WebUI.waitForPageLoad(60)
'Navigate - Add Featured Images'
// Hit the <SAVE> Button - To Dispell popout Menu and to give page focus
WebUI.click(findTestObject('Object Repository/Page_Members Area/a_Featured_Images'))
WebUI.waitForPageLoad(60)
WebUI.delay(2)
//WebUI.switchToWindowIndex(2)
'----------------------------------------------'
WebUI.verifyTextPresent("Choose Images & Videos", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Add Selected Items", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Album", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Cancel", false)
'----------------------------------------------'
WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Members Area/a_Featured_Items_CANCEL'), 60)
WebUI.click(findTestObject('Object Repository/Page_Members Area/a_Featured_Items_CANCEL'))

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
WebUI.verifyTextPresent("Choose Your Featured Images & Videos", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Your profile page features up to 12 photos as examples of your work. They can either be", false)
'----------------------------------------------'
WebUI.verifyTextPresent("your 12 most recent photos", false)
'----------------------------------------------'
WebUI.verifyTextPresent("a selection of photos you choose", false)
'----------------------------------------------'
// WebUI.verifyTextPresent("Image Not Found", false)
'----------------------------------------------'

///////////////////////////////////////
//                END                //
///////////////////////////////////////
