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
// Verify Content on <Profile><Where you work>|   25/09/2019    |      DH          |                             |
// from <Grow Your Business>                  |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
// Textual content change in the EDIT Box     |   25/11/2019    |      DH          |                             |
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
WebUI.waitForPageLoad(50)
WebUI.waitForElementPresent(findTestObject('Object Repository/Profiles_Page/Page_Members Area/h2_Update your work area here'), 50)

////////////////////////////////////////////////////////////
//Take an Initial Screenshot of Update Profilr After Login//
////////////////////////////////////////////////////////////

// Stores in Project <Screenshots> Folder
//CustomKeywords.'kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeEntirePageScreenshot'('Grow_Your_Business_Where_You_Work.png', FailureHandling.OPTIONAL)

////////////////////////////////////////////////////////////
//         Verify Header Text on Key Portal Areas         //
////////////////////////////////////////////////////////////
'---------------------------------'
'THIS TAB - Where You Work        |'
'----------------------------------------------'
WebUI.delay(5)
// MEMBER ID CHECK
WebUI.verifyTextPresent(findTestData('Members_Test_Data').getValue('MEMBER_ID', 1), false)
'----------------------------------------------'
WebUI.verifyTextPresent("MEMBER ID", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Update your work area here", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Approximate Coverage", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Work Radius", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Your Checkatrade.com web page describes where you work", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Please enter a comma-separated list of areas that you are prepared to work", false)
'----------------------------------------------'
// Scroll to Element
WebUI.scrollToElement(findTestObject('Object Repository/Page_Members Area/Profiles/Page_Members Area/button_Save Work Location'), 2)
'----------------------------------------------'
// Wait For Element
WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Members Area/Profiles/Page_Members Area/button_Save Work Location'), 2)
'----------------------------------------------'
//WebUI.verifyTextPresent("This profile has been set up by Checkatrade", false) // Not being picked up - Investigate or loose it TODO
'----------------------------------------------'
//WebUI.verifyTextPresent("testing purposes. Please do not use the details", false) // Not being picked up - Investigate or loose it TODO
'----------------------------------------------'
WebUI.verifyTextPresent("Southampton Area", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Within M25", false)
'----------------------------------------------'
WebUI.verifyTextPresent("40 miles of Reading", false)
'----------------------------------------------'
WebUI.verifyTextPresent("All BN postcode areas", false)
'----------------------------------------------'
// Test Messagee
//WebUI.verifyTextPresent("Keep the locations quite general to fit inside the 200 character limit", false)  // This profile has been set up by Checkatrade.com for training/testing purposes. Please do not use the details on this page for contacting US !!
//WebUI.verifyTextPresent("This profile has been set up by Checkatrade.com for training/testing purposes. Please do not use the details on this page for contacting US !!", false)  // This profile has been set up by Checkatrade.com for training/testing purposes", false)  // This profile has been set up by Checkatrade.com for training/testing purposes", false)
'----------------------------------------------'
WebUI.verifyTextPresent("To increase your work radius to more than ", false)
WebUI.verifyTextPresent(" please contact members service", false)
'----------------------------------------------'
WebUI.verifyTextPresent("House rules: All changes will be moderated by Checkatrade staff", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Save Work Location", false)
'----------------------------------------------'
// Save Button             // Attempting Save Issues - Investigate or Loose
//WebUI.click(findTestObject('Object Repository/Page_Members Area/Profiles/Page_Members Area/button_Save Work Location'), 2)
//WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Members Area/Profiles/Page_Members Area/button_Save Work Location'), 2) TODO
// Wait for Save
//WebUI.waitForPageLoad(25)
//WebUI.delay(2)
//WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Members Area/Profiles/Page_Members Area/button_Save Work Location'), 2) TODO

//-----------------------------
// Back to PROFILE Block menu |
WebUI.back()
///////////////////////////////////////
//                END                //
///////////////////////////////////////

