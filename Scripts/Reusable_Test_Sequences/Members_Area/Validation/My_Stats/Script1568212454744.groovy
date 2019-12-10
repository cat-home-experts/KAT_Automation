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

//-----------------------
// TEST HISTORY HEADER - | TODO Blind Import To Update
//-----------------------
// Any changes to this script, please update the next available row below, with date, in the DATE CREATED column,
// Your Name in the CREATED BY column, and Finaly, The actual change implemented in the NOTES column.
//
//---------------------------------------------------------------------------------------------------------------
//       Test Definition / Description        |   Date Created  |    Created By    |             Notes           |
//---------------------------------------------------------------------------------------------------------------
//  My Feedback Page Initial Validation Checks|   11/09/2019    |      DH          |                             |
//  on Start up, Sub Tab = Remind Customers   |                 |                  |                             |
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
//     Wait for Customers Name Element Availability       //
////////////////////////////////////////////////////////////
//WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Members Area/input_concat(Customer  s name)_customerName'), 60)

WebUI.delay(2)
WebUI.waitForPageLoad(60)

////////////////////////////////////////////////////////////
//     Take an Initial Screenshot of Home After Login     //
////////////////////////////////////////////////////////////
//WebUI.takeScreenshot('Reports/Screenshots/Initial_Members_page.png')
// Stores in Project <Screenshots> Folder
// CustomKeywords.'kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeEntirePageScreenshot'('Your_Customers_Remind_Customer.png', FailureHandling.OPTIONAL)

'Check URL Is The Correct One :-)'
WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Utils/Check_URL'), [:], FailureHandling.CONTINUE_ON_FAILURE)

////////////////////////////////////////////////////////////
//         Verify Header Text on Key Portal Areas         //
////////////////////////////////////////////////////////////
'----------------------------------------------'
'DEFAULT TAB - None - 1 Page Returned          |'
'----------------------------------------------'
// MEMBER ID CHECK
WebUI.verifyTextPresent(findTestData('Members_Test_Data').getValue('MEMBER_ID', 1), false)
'----------------------------------------------'
WebUI.verifyTextPresent("MEMBER ID", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Your web page statistics", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Your Page Hits", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Get Data", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Total hits for today", false)

WebUI.verifyTextPresent("Total hits for period", false)
'----------------------------------------------'
// Scroll for more detail
WebUI.scrollToPosition(900, 900)
//WebUI.delay(5)
'----------------------------------------------'
WebUI.verifyTextPresent("Your Feedback History", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Please note: some mobile devices may need to be rotated to view the graph", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Month in which work was done", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Searches by Category", false)
'----------------------------------------------'
// Scroll for more detail
WebUI.scrollToPosition(900, 900)
//WebUI.delay(5)
'----------------------------------------------'
WebUI.verifyTextPresent("Want to improve your search results", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Feedback Score Breakdown", false)
'----------------------------------------------'
WebUI.verifyTextPresent("All Feedback", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Last 12 Months", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Estimating", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Tidiness", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Reliability & Timekeeping", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Courtesy", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Workmanship", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Value for Money", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Last 6 Months", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Last 30 Days", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Overall", false)
'----------------------------------------------'

//WebUI.scrollToElement(findTestObject('Object Repository/Page_Members Area/a_Dashboard'), 10)

///////////////////////////////////////
//                END                // TODO  TODO Blind Import To Update
///////////////////////////////////////

