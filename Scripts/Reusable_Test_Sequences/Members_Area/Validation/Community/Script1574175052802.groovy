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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

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
//  Content Change Refactored                 |   05/02/2020    |      DH          |                             |
//---------------------------------------------------------------------------------------------------------------
//                                            |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
//                                            |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
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
'WARNING - Be AWARE that, for example, That the Members Area Community Link on Preview doesnt take you to Preview, but takes you to LIVE Members Area'

KeywordUtil.markWarning("Navigating to ->Members->Your Account->Community-> From the Dashboard takes you to LIVE ... ")
KeywordUtil.markWarning("(from whatever environment you are currently on) - https://community.checkatrade.com/index.php")

////////////////////////////////////////////////////////////
//     Wait for Customers Name Element Availability       //
////////////////////////////////////////////////////////////
//WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Members Area/input_concat(Customer  s name)_customerName'), 60)

'----------------------------------------------'
WebUI.delay(1)
'----------------------------------------------'
WebUI.waitForPageLoad(60)

////////////////////////////////////////////////////////////
//     Take an Initial Screenshot of Home After Login     //
////////////////////////////////////////////////////////////
//WebUI.takeScreenshot('Reports/Screenshots/Initial_Members_page.png')
// Stores in Project <Screenshots> Folder
// CustomKeywords.'kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeEntirePageScreenshot'('Your_Customers_Remind_Customer.png', FailureHandling.OPTIONAL)

////////////////////////////////////////////////////////////
//         Verify Header Text on Key Portal Areas         //
////////////////////////////////////////////////////////////

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Members Area/Community/Page_Checkatrade Community/img'), 60)
'----------------------------------------------'
'DEFAULT TAB - None - 1 Page Returned          |'
'----------------------------------------------'
// MEMBER ID CHECK
//WebUI.verifyTextPresent(findTestData('Members_Test_Data').getValue('MEMBER_ID', 1), false)
'----------------------------------------------'
//WebUI.verifyTextPresent("MEMBER ID", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Hello", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Welcome to the Checkatrade Community, where you can find answers, connect", false)
'----------------------------------------------'
WebUI.verifyTextPresent("with other members and get important updates from Checkatrade. Search the", false)
'----------------------------------------------'
WebUI.verifyTextPresent("conversations below or click on a board to start a discussion", false)
'----------------------------------------------'
//WebUI.verifyTextPresent("WELCOME & NEWS", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Community", false)
'----------------------------------------------'
//WebUI.verifyTextPresent("Members Spotlight", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Welcome to the", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Community", false)
'----------------------------------------------'
//WebUI.verifyTextPresent("Introduce Yourself", false)
'----------------------------------------------'
//WebUI.verifyTextPresent("NEW POST", false) // Could be flakey
'----------------------------------------------'
//WebUI.verifyTextPresent("GET INVOLVED", false)
'----------------------------------------------'
'Graphics Present'
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Members Area/Community/Page_Checkatrade Community/img'), 1)
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Members Area/Community/Page_Checkatrade Community/img_1'), 1)
//WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Members Area/Community/Page_Checkatrade Community/img_1_2'), 1)
// No LogOff on this Page - Navigaate Back
WebUI.back()

//WebUI.waitForPageLoad(60)
//if ('Object Repository/Page_Members Area/Header_Attention_Text'){
//	WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Members Area/Header_Attention_Text'), 60)
//	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Utils/Popout_Handler'), [:], FailureHandling.CONTINUE_ON_FAILURE)
//}
//WebUI.scrollToElement(findTestObject('Object Repository/Page_Members Area/a_Dashboard'), 10)

///////////////////////////////////////
//                END                // TODO  TODO Blind Import To Update
///////////////////////////////////////


