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
// Verify Content on <Profile><Search-        |   25/09/2019    |      DH          |                             |
// _Appearances> from <Grow Your Business>    |                 |                  |                             |
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
// Wait for Page/Elememt Load
WebUI.waitForPageLoad(25)
WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Members Area/Profiles/Page_Members Area/button_Save Search Appearance Info'), 25)

////////////////////////////////////////////////////////////
//Take an Initial Screenshot of Update Profilr After Login//
////////////////////////////////////////////////////////////

// Stores in Project <Screenshots> Folder
//CustomKeywords.'kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeEntirePageScreenshot'('Grow_Your_Business_Search_Appearances.png', FailureHandling.OPTIONAL)

'Expected Page'
GlobalVariable.PAGE = "search-appearance"

'Extra check - tabbing on area, just confirm stable URL'

'Check URL Is The Correct One :-)'
WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Utils/Check_URL'), [:], FailureHandling.CONTINUE_ON_FAILURE)

////////////////////////////////////////////////////////////
//         Verify Header Text on Key Portal Areas         //
////////////////////////////////////////////////////////////
'---------------------------------'
'THIS TAB - Profile Text          |'
'----------------------------------------------'
// MEMBER ID CHECK
WebUI.verifyTextPresent(findTestData('Members_Test_Data').getValue('MEMBER_ID', 1), false)
'----------------------------------------------'
WebUI.verifyTextPresent("MEMBER ID", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Update your search appearances text here", false)
'----------------------------------------------'
WebUI.verifyTextPresent("This is the text that appears in customer search results", false)
'----------------------------------------------'
WebUI.verifyTextPresent("You may change the description text that is displayed by editing it in the text box below", false)
'----------------------------------------------'
WebUI.verifyTextPresent("maximum limit of 190 characters", false)
'----------------------------------------------'
//WebUI.verifyTextPresent("This profile has been set up for training purposes", false) // Not being picked up - Investigate or loose it TODO
'----------------------------------------------'
WebUI.verifyTextPresent("Save Search Appearance Info", false)
'----------------------------------------------'
WebUI.verifyTextPresent("House rules: All changes will be moderated by Checkatrade staff", false)
'----------------------------------------------'
// WebUI.verifyTextPresent("Undo", false)
'----------------------------------------------'
//-----------------------------
// Back to PROFILE Block menu |
WebUI.back()
///////////////////////////////////////
//                END                //
///////////////////////////////////////
