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
//  Initial Functionality Implemented         |   30/09/2019    |      DH          |                             |
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
//WebUI.delay(5)
//WebUI.waitForPageLoad(10) 'Historic Data Loads, so can take a while'
WebUI.waitForElementPresent(findTestObject('Object Repository/Membership/Page_Members Area/button_Renew my Membership'), 60)

////////////////////////////////////////////////////////////
//     Take an Initial Screenshot of Home After Login     //
////////////////////////////////////////////////////////////
//WebUI.takeScreenshot('Reports/Screenshots/Initial_Members_page.png')
// Stores in Project <Screenshots> Folder
//CustomKeywords.'kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeEntirePageScreenshot'('Membership.png', FailureHandling.OPTIONAL)

'Check URL Is The Correct One :-)'
WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Utils/Check_URL'), [:], FailureHandling.CONTINUE_ON_FAILURE)
////////////////////////////////////////////////////////////
//         Verify Header Text on Key Portal Areas         //
////////////////////////////////////////////////////////////
'---------------------------------'
'THIS TAB - Membership           |'
'----------------------------------------------'
// MEMBER ID CHECK
WebUI.verifyTextPresent(findTestData('Members_Test_Data').getValue('MEMBER_ID', 1), false)
'----------------------------------------------'
WebUI.verifyTextPresent("MEMBER ID", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Website Membership", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Renew or Upgrade your Membership Now!", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Renew my Membership", false) // Button Exixts
'----------------------------------------------'
//Scroll to save Password Button
WebUI.scrollToElement(findTestObject('Object Repository/Membership/Page_Members Area/button_Save Password'), 2)
'----------------------------------------------'
// Passwords Must Match Displayed
WebUI.verifyTextPresent("Passwords must match", false)
'----------------------------------------------'
// Select RENEW membership  CheckBox
WebUI.click(findTestObject('Object Repository/Membership/Page_Members Area/input_Renew Website Membership_renewMembershipControl'))
'----------------------------------------------'
// Hit Renew (No Discernable Activity in the Froeground After This event
WebUI.click(findTestObject('Object Repository/Membership/Page_Members Area/button_Renew my Membership'))
'----------------------------------------------'
// Attempt Change Username
WebUI.setText(findTestObject('Object Repository/Membership/Page_Members Area/input_Change Your Username or Password_username'),
	'check1234')
'----------------------------------------------'
WebUI.click(findTestObject('Object Repository/Membership/Page_Members Area/button_Save Username'))
// Attempt to save Duplicate (Existing) Username
'----------------------------------------------'
// Synch
'----------------------------------------------'
// Wait For Error Message Element
WebUI.waitForElementPresent(findTestObject('Object Repository/Membership/Page_Members Area/Error_Occured_Username_Taken'), 60)
'----------------------------------------------'
// Duplication Flagged
WebUI.verifyTextPresent("Error occured: That username has already been taken, please choose another username.", false)
'----------------------------------------------'
// Change Password
'----------------------------------------------'
// Set Old Pasword
WebUI.setEncryptedText(findTestObject('Object Repository/Membership/Page_Members Area/input_Save Username_currentPassword'),
	'fzqqY0qJjYTuJiVJRZh4ag==')
'----------------------------------------------'
// Set New Pasword
WebUI.setEncryptedText(findTestObject('Object Repository/Membership/Page_Members Area/input_Save Username_newPassword'),
	'fzqqY0qJjYTuJiVJRZh4ag==')
'----------------------------------------------'
// Confirm New Pasword
WebUI.setEncryptedText(findTestObject('Object Repository/Membership/Page_Members Area/input_Passwords must match_confirmPassword'),
	'fzqqY0qJjYRF7GtSaAUy8w==')
'----------------------------------------------'
// Save Password
WebUI.setEncryptedText(findTestObject('Object Repository/Membership/Page_Members Area/input_Save Username_confirmPassword'),
	'fzqqY0qJjYTuJiVJRZh4ag==')
'----------------------------------------------'
WebUI.verifyElementClickable(findTestObject('Object Repository/Membership/Page_Members Area/button_Save Password'))
WebUI.click(findTestObject('Object Repository/Membership/Page_Members Area/button_Save Password'))
'----------------------------------------------'
// Passwords Must Match is NOT Displayed
WebUI.verifyTextNotPresent("Passwords must match", false) // Passwords Must Match Text Is Removed once Entry Is Completed
'----------------------------------------------'
WebUI.verifyTextPresent("Save Username", false) // Button Still Exists
'----------------------------------------------'
WebUI.verifyTextPresent("Save Password", false) // Button Still Exists
'----------------------------------------------'

///////////////////////////////////////
//                END                //
///////////////////////////////////////