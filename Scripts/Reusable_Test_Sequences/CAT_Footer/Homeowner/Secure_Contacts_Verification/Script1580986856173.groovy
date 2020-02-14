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
// navigating Homeowner->Secure Contacts Memu |    11/02/2020   |         DH       |                             |
// Returns What are Secure Contacts P VALIDAT |                 |                  |                             |
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
WebUI.verifyTextPresent("What are secure contact details", false)
'----------------------------------------------'
'Sub Header - Ribbon Menu'
WebUI.verifyTextPresent("Secure contact details are dedicated phone numbers and email addresses which are used on ", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Checkatrade.com to protect our consumers and trades", false)
'----------------------------------------------'
WebUI.verifyTextPresent("They are displayed in place of our trades personal contact details ", false)
'----------------------------------------------'
WebUI.verifyTextPresent("however divert directly to them, keeping communication seamless for both parties", false)
'----------------------------------------------'

'Page Body'

WebUI.verifyTextPresent("What's the benefit of secure contact details", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Peace of mind", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Using a secure contact detail gives you complete peace of mind", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Higher response rate", false)
'----------------------------------------------'
WebUI.verifyTextPresent("We want to give you the best chance possible at quickly and easily finding the right trade for you", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Trades have less spam calls", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Secure contacts help us to identify frequent nuisance and spam callers", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Trades alerted when they receive a Checkatrade enquiry", false)
'----------------------------------------------'
WebUI.verifyTextPresent("It gives them a great start with new enquiries", false)
'----------------------------------------------'

WebUI.scrollToPosition(500, 500)
WebUI.delay(1)

'Footer'

//'----------------------------------------------'
//WebUI.verifyTextPresent("Call us on", false)
//'----------------------------------------------'
//WebUI.verifyTextPresent("03301", false)
//'----------------------------------------------'
//WebUI.verifyTextPresent("625", false)
//'----------------------------------------------'
//WebUI.verifyTextPresent("349", false)
//'----------------------------------------------'
//WebUI.verifyTextPresent("Get Started", false)
//'----------------------------------------------'
//WebUI.verifyTextPresent("LiveChat", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Checkatrade.com all rights reserved", false)
'----------------------------------------------'
'cookie text change 12022020'
// WebUI.verifyTextPresent("We use cookies to help make this website better", false)

'----------------------------------------------'

///////////////////////////////////////
//                END                //
///////////////////////////////////////