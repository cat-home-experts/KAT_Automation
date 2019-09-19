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
// TEST HISTORY HEADER - |
//-----------------------
// Any changes to this script, please update the next available row below, with date, in the DATE CREATED column,
// Your Name in the CREATED BY column, and Finaly, The actual change implemented in the NOTES column.
//
//---------------------------------------------------------------------------------------------------------------
//       Test Definition / Description        |   Date Created  |    Created By    |             Notes           |
//---------------------------------------------------------------------------------------------------------------
//  My Feedback Page Initial Validation Checks|   12/09/2019    |      DH          |                             |
//  on Start up, Sub Tab = Awareness          |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
//  Extra Synch Added - Wait For Page Load    |   18/09/2019    |      DH          |                             |
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
//     Wait for Awareness Element Availability            //
////////////////////////////////////////////////////////////
WebUI.waitForPageLoad(25)
WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Members Area/h2_Customer Feedback Awareness'), 25)
//WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Members Area/the_Speedometer'), 25)
WebUI.delay(3)

////////////////////////////////////////////////////////////
//     Take an Initial Screenshot of Awareness After Login//
////////////////////////////////////////////////////////////

// Stores in Project <Screenshots> Folder
CustomKeywords.'kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeEntirePageScreenshot'('Your_Customers_Awareness.png', FailureHandling.OPTIONAL)

////////////////////////////////////////////////////////////
//         Verify Header Text on Key Portal Areas         //
////////////////////////////////////////////////////////////
'---------------------------------'
'THIS TAB - Awareness             '
'---------------------------------'
WebUI.verifyTextPresent("Feedback Statistics", false)
'----------------------------------------------'
WebUI.verifyTextPresent("The average awareness level across all Checkatrade members is", false)
'----------------------------------------------'
WebUI.verifyTextPresent("The speedometer is not shown to consumers, however should it go below 40% it could affect your membership with Checkatrade.", false)
'----------------------------------------------'
WebUI.verifyTextPresent("feedback received in past 30 days", false)
'----------------------------------------------'
WebUI.verifyTextPresent("feedback in total", false)
'----------------------------------------------'
WebUI.verifyTextPresent("of customers were charged what you quoted", false)
'----------------------------------------------'
WebUI.verifyTextPresent("of customers were charged more but kept informed", false)
'----------------------------------------------'
WebUI.verifyTextPresent("of customers were charged more and were not kept informed", false)
'----------------------------------------------'


///////////////////////////////////////
//                END                //
///////////////////////////////////////