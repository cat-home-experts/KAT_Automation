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
//  This test <Notes> and <Settings>          |                 |      DH          |                             |
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
WebUI.waitForPageLoad(25)
WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Members Area/a_Settings'), 50)

'----------------------------------------------'

// Scroll Back (Down) To <Settings> Element
//WebUI.scrollToElement(findTestObject('Object Repository/Page_Members Area/Page_Members Area/a_AddEdit note'))
'----------------------------------------------'

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

'----------------------------------------------'
WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Members Area/Page_Members Area/a_AddEdit note'), 25)
// Scroll to Element (Error Unable to Click Object
'----------------------------------------------'
// WebUI.scrollToElement(findTestObject('Object Repository/Page_Members Area/Page_Members Area/a_AddEdit note'))
// Prove be Infrance, Button Clicks OK of Fails
'----------------------------------------------'
WebUI.click(findTestObject('Object Repository/Page_Members Area/Page_Members Area/a_AddEdit note'))

'----------------------------------------------'

///////////////////////////////////////////////
// Add/Edit Note
// WebUI.delay(10)
//WebUI.switchToWindowTitle('Add/Edit Notes')
//'----------------------------------------------'
//WebUI.scrollToElement(findTestObject('Object Repository/Page_Members Area/Page_Members Area/a_AddEdit note'))
//'----------------------------------------------'
//WebUI.click(findTestObject('Object Repository/Page_Members Area/Page_Members Area/a_AddEdit note'))
//'----------------------------------------------'
//WebUI.waitForElementClickable('Object Repository/Page_Members Area/Page_Members Area/button_Submit', 5)
//'----------------------------------------------'
//WebUI.setText(findTestObject('Object Repository/Page_Members Area/Page_Members Area/textarea_AddEdit Notes'), 'this is still a cool note')
//'----------------------------------------------'
WebUI.verifyTextPresent("this is still a cool note", false)
//'----------------------------------------------'
WebUI.verifyTextPresent("Close", false)
//'----------------------------------------------'
WebUI.verifyTextPresent("Submit", false)
//'----------------------------------------------'
WebUI.click(findTestObject('Object Repository/Page_Members Area/Page_Members Area/button_Submit'))
//'----------------------------------------------'

///////////////////////////////////////
// Dispel The Windows Dialog         //
///////////////////////////////////////
'----------------------------------------------'
//WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Utils/Dispel_Windows_Dialog'), [:], FailureHandling.CONTINUE_ON_FAILURE)
'----------------------------------------------'
//WebUI.waitForElementClickable('Object Repository/Page_Members Area/button_Close', 10)
//WebUI.click(findTestObject('Object Repository/Page_Members Area/button_Close'))
'----------------------------------------------'

///////////////////////////////////////
//                END                //
///////////////////////////////////////