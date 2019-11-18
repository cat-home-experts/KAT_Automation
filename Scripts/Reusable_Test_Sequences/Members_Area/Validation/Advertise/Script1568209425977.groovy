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

////////////////////////////////////////////////////////////
//     Take an Initial Screenshot of Home After Login     //
////////////////////////////////////////////////////////////
//WebUI.takeScreenshot('Reports/Screenshots/Initial_Members_page.png')
// Stores in Project <Screenshots> Folder
// CustomKeywords.'kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeEntirePageScreenshot'('Your_Customers_Remind_Customer.png', FailureHandling.OPTIONAL)

////////////////////////////////////////////////////////////
//         Verify Header Text on Key Portal Areas         //
////////////////////////////////////////////////////////////
'---------------------------------'
'DEFAULT TAB - Advertise          '
'----------------------------------------------'
// MEMBER ID CHECK
WebUI.verifyTextPresent(findTestData('Members_Test_Data').getValue('MEMBER_ID', 1), false)
'----------------------------------------------'
WebUI.verifyTextPresent("MEMBER ID", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Directory Information", false)
'----------------------------------------------'
WebUI.verifyTextPresent("You can opt to upgrade your membership to be included in one of the printed directories", false)
'----------------------------------------------'
WebUI.verifyTextPresent("households within your working area", false)
'----------------------------------------------'
WebUI.verifyTextPresent("We allow several allocations for each trade and these vary depending on consumer demand", false)

WebUI.verifyTextPresent("so if you would like to see if there is space available in an area which suits you", false)
'----------------------------------------------'
WebUI.verifyTextPresent("best to speak with us directly so that we can give you further information and run through pricing and payment options", false)
'----------------------------------------------'
//WebUI.scrollToElement(findTestObject('Please contact us on 01243 952303'), 10)

///////////////////////////////////////
//                END                // TODO  TODO Blind Import To Update
///////////////////////////////////////
