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
// Your NAme in the CREATED BY column, and Finaly, The actual change implemented in the NOTES column.
//
//---------------------------------------------------------------------------------------------------------------
//       Test Definition / Description        |   Date Created  |    Created By    |             Notes           |
//---------------------------------------------------------------------------------------------------------------
//  Verify <Profile><Insurance> Page          |   13/09/2019    |      DH          |                             |
//  from <Grow Your Business>                 |                 |                  |                             |
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
//         Wait for Insurance Element Availability        //
////////////////////////////////////////////////////////////
WebUI.waitForElementClickable(findTestObject('Object Repository/Profiles_Page/Page_Members Area/Page_Members Area/button_Select Document'), 25)

////////////////////////////////////////////////////////////
//      Take an Initial Screenshot of Insurance Page      //
////////////////////////////////////////////////////////////
// Stores in Project <Screenshots> Folder
//CustomKeywords.'kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeEntirePageScreenshot'('Your_Customers_Insurance.png', FailureHandling.OPTIONAL)
////////////////////////////////////////////////////////////
//         Verify Header Text on Key Portal Areas         //
////////////////////////////////////////////////////////////
'---------------------------------'
'THIS TAB - Insurance             |'
'----------------------------------------------'
// MEMBER ID CHECK
WebUI.verifyTextPresent(findTestData('Members_Test_Data').getValue('MEMBER_ID', 1), false)
'----------------------------------------------'
WebUI.verifyTextPresent("MEMBER ID", false)
'----------------------------------------------'
WebUI.verifyTextPresent('Update your Public Liability Insurance Details', false)
'----------------------------------------------'
WebUI.verifyTextPresent('Failure to update your Public Liability Documents may result in', false)
'----------------------------------------------'
WebUI.verifyTextPresent('Policy No', false)
'----------------------------------------------'
WebUI.verifyTextPresent('Insured By', false)
'----------------------------------------------'
WebUI.verifyTextPresent('Insured amount (£ GBP)', false)
'----------------------------------------------'
WebUI.verifyTextPresent('(not employers liability cover)', false)
'----------------------------------------------'
WebUI.verifyTextPresent('Cost of insurance (£ GBP)', false)
'----------------------------------------------'
WebUI.verifyTextPresent('Expiry Date', false)
'----------------------------------------------'
WebUI.verifyTextPresent('Supporting Documents', false)
'----------------------------------------------'
// Scroll to Save PLI Details Button
'----------------------------------------------'
WebUI.scrollToElement(findTestObject('Object Repository/Page_Members Area/Profiles/Page_Members Area/button_Save PLI Details'), 5)
'----------------------------------------------'
WebUI.verifyTextPresent('Save PLI Details', false)
'----------------------------------------------'
WebUI.verifyTextPresent('You can also provide proof of insurance by the following method', false)
'----------------------------------------------'
WebUI.verifyTextPresent('Email memberservices@checkatrade.com', false)
'----------------------------------------------'
WebUI.verifyTextPresent('Post a copy of your Policy', false)
'----------------------------------------------'
WebUI.verifyTextPresent('Fax a copy to 01243 601246', false)
'----------------------------------------------'
WebUI.verifyTextPresent('House rules: All changes will be moderated by Checkatrade staff', false)
'----------------------------------------------'
// Need To scroll To Select Document Button
WebUI.scrollToElement(findTestObject('Object Repository/Profiles_Page/Page_Members Area/Page_Members Area/button_Select Document'), 5)
'----------------------------------------------'
// Select Document Button
'----------------------------------------------'

// Don't open windows dialog, just verify button can click
// WebUI.click(findTestObject('Object Repository/Profiles_Page/Page_Members Area/Page_Members Area/button_Select Document'))
WebUI.verifyElementClickable(findTestObject('Object Repository/Profiles_Page/Page_Members Area/Page_Members Area/button_Select Document'))
'----------------------------------------------'
///////////////////////////////////////
// Dispel The Windows Dialog         //
///////////////////////////////////////
'----------------------------------------------'
//WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Utils/Dispel_Windows_Dialog'), [:], FailureHandling.CONTINUE_ON_FAILURE)
'----------------------------------------------'

'----------------------------------------------'
'----------------------------------------------'
// Save Form
'----------------------------------------------'
WebUI.click(findTestObject('Object Repository/Page_Members Area/Profiles/Page_Members Area/button_Save PLI Details'))

// Need To HIT Back Button to Return to Previous Page
'----------------------------------------------'
WebUI.back()
'----------------------------------------------'

///////////////////////////////////////
//                END                //
///////////////////////////////////////
