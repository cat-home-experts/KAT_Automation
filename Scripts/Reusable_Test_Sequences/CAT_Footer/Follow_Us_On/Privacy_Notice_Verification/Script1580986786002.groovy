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
// navigating Follow Us On>Terms_OF_Use Return|    14/02/2020   |         DH       |                             |
// The Smallprint Page VALIDATION             |                 |                  |                             |
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
WebUI.verifyTextPresent("Checkatrade privacy notice", false)
'----------------------------------------------'
'Sub Header'
WebUI.verifyTextPresent("Here at Checkatrade we know how important it is to keep your personal data safe", false)
'----------------------------------------------'
WebUI.verifyTextPresent("In this notice you’ll discover exactly what information we collect from you and how we then use this to deliver our services", false)
'----------------------------------------------'

'Page Body MULTIPLA SUB HEADER SELECTORS'

WebUI.verifyTextPresent("How do we use your information", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Secure contacts", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Keeping and storing your data", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Sharing your data with third parties", false)
'----------------------------------------------'
WebUI.verifyTextPresent("always keep you in the loop", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Your rights matter", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Contact us", false)
'----------------------------------------------'
WebUI.verifyTextPresent("If you have any concerns", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Updates", false)
'----------------------------------------------'
 
//TODO Extend

//
//
//
//
//WebUI.verifyTextPresent("Acceptance", false)
//'----------------------------------------------'
//WebUI.verifyTextPresent("These Terms and conditions were last updated on", false)
//'----------------------------------------------'
//WebUI.verifyTextPresent("The Services", false)
//'----------------------------------------------'
//WebUI.verifyTextPresent("The results of the Recommendation, Vetting and Monitoring processes are published on the Website", false)
//'----------------------------------------------'
//WebUI.verifyTextPresent("Checkatrade aims to", false)
//'----------------------------------------------'
//WebUI.verifyTextPresent("Promote its members to the public", false)
//'----------------------------------------------'
//
//WebUI.scrollToPosition(500, 500)
//WebUI.delay(1)
//
//WebUI.verifyTextPresent("Other Applicable Terms", false)
//'----------------------------------------------'
//WebUI.verifyTextPresent("These Terms and Conditions refer to the following additional terms", false)
//'----------------------------------------------'
//WebUI.verifyTextPresent("Terms and Conditions and the Terms and Conditions for members", false)
//'----------------------------------------------'
//WebUI.verifyTextPresent("Access to the Website", false)
//'----------------------------------------------'
//WebUI.verifyTextPresent("Checkatrade will not be liable to you for any reason if the Website is unavailable at any time or for any period", false)
//'----------------------------------------------'
//WebUI.verifyTextPresent("Intellectual Property Rights", false)
//'----------------------------------------------'
//
//WebUI.scrollToPosition(1000, 1000)
//WebUI.delay(1)
//
//'----------------------------------------------'
//WebUI.verifyTextPresent("You agree that once you have submitted content, the content will become the property of Checkatrade", false)
//'----------------------------------------------'
//WebUI.verifyTextPresent("No reliance on information or speed of service", false)
//'----------------------------------------------'
//WebUI.verifyTextPresent("The pricing displayed is offered by the trade and is not offered, underwritten or approved by Checkatrade", false)
//'----------------------------------------------'
//WebUI.verifyTextPresent("Prohibited use", false)
//'----------------------------------------------'
//WebUI.verifyTextPresent("You agree to use the Website for lawful purposes only and not", false)
//'----------------------------------------------'
//WebUI.verifyTextPresent("o reproduce, duplicate, copy, sub-licence, broadcast, distribute, sell, re-brand or re-sell any part of the Website", false)
//'----------------------------------------------'
//WebUI.verifyTextPresent("Links to third party websites and linking to the Website", false)
//'----------------------------------------------'
//
//'BIG GAP'
//
//'----------------------------------------------'
//WebUI.verifyTextPresent("Governing Law", false)
//'----------------------------------------------'
//WebUI.verifyTextPresent("These Terms and Conditions shall be governed by and construed in accordance with the law of England and Wales", false)
//'----------------------------------------------'
//WebUI.verifyTextPresent("and you hereby submit to the exclusive jurisdiction to the courts of England and Wales", false)
//'----------------------------------------------'
//WebUI.verifyTextPresent("Governing Law", false)
//'----------------------------------------------'
//
//
//'Footer'
//'TODO'

///////////////////////////////////////
//                END                //
///////////////////////////////////////
