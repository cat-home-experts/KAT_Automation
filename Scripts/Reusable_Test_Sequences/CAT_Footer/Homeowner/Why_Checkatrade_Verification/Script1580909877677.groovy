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
// TEST HISTORY HEADER - |
//-----------------------
// Any changes to this script, please update the next available row below, with date, in the DATE CREATED column,
// Your Name in the CREATED BY column, and Finaly, The actual change implemented in the NOTES column.
//
//---------------------------------------------------------------------------------------------------------------
//       Test Definition / Description        |   Date Created  |    Created By    |             Notes           |
//---------------------------------------------------------------------------------------------------------------
// Verify Footer Navigation is correct        |                 |                  |                             |
// navigating Homeowner->Why Checkatrade      |    12/02/2020   |         DH       |                             |
// Menu Returns Why Checkatrade Page VALIDATIO|                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
//                                            |                 |                  |                             |
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
'Only When Needed'
//WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Members Area/Community/Page_Checkatrade Community/img'), 60)
'----------------------------------------------'
'DEFAULT TAB - None - 1 Page Returned          |'
'----------------------------------------------'
// MEMBER ID CHECK
//WebUI.verifyTextPresent(findTestData('Members_Test_Data').getValue('MEMBER_ID', 1), false)
'----------------------------------------------'
//WebUI.verifyTextPresent("MEMBER ID", false)
'----------------------------------------------'
'Header'
WebUI.verifyTextPresent("Last year over 12 million people", false)
WebUI.verifyTextPresent("trusted Checkatrade to help them find a reputable tradesperson", false)
'----------------------------------------------'
'Sub Header - Ribbon Menu'
WebUI.verifyTextPresent("Why Checkatrade", false)
'----------------------------------------------'
WebUI.verifyTextPresent("The Checkatrade Standard", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Resolving issues", false)
'----------------------------------------------'
WebUI.verifyTextPresent("FAQ", false)
'----------------------------------------------'

'Page Body'

WebUI.verifyTextPresent("Millions of reviews", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Free to use", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Nationwide", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Our members give out a feedback card with each and every job", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Checkatrade is a completely free service", false)
//                       Checkatrade is a completely free service
'----------------------------------------------'
WebUI.verifyTextPresent("Search for tradespeople who work near you from anywhere in the UK", false)
'----------------------------------------------'
WebUI.verifyTextPresent("About our members", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Checkatrade runs strict background checks on tradespeople before they can become members. Once they join", false)
'----------------------------------------------'
WebUI.verifyTextPresent("members agree to have feedback from their customers put online for all to see", false)
'----------------------------------------------'

WebUI.scrollToPosition(1000, 1000)
WebUI.delay(1)


'Footer'

'Put This In Shared'
WebUI.verifyTextPresent("Trades", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Homeowner", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Company", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Follow Us On", false)
'----------------------------------------------'


'----------------------------------------------'
WebUI.verifyTextPresent("Checkatrade.com all rights reserved", false)
'----------------------------------------------'
'cookie text change 12022020'
// WebUI.verifyTextPresent("We use cookies to help make this website better", false)

'----------------------------------------------'

///////////////////////////////////////
//                END                //
///////////////////////////////////////