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
//  Members Terms & Conds Validation Checks   |   04/12/2019    |        DH        | Redirects to LIVE, Checks   |
//                                            |                 |                  | Return page Content, but no |
//                                            |                 |                  | Drill Down to Subsections   |
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

'Check URL Is The Correct One :-) NO, Not on this Occasion, as redirects to LIVE'  
//WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Utils/Check_URL'), [:], FailureHandling.CONTINUE_ON_FAILURE)

////////////////////////////////////////////////////////////
//         Verify Header Text on Key Portal Areas         //
////////////////////////////////////////////////////////////
'----------------------------------------------'
'DEFAULT TAB - None - 1 Page Returned          |'
'----------------------------------------------'
// MEMBER ID CHECK
//WebUI.verifyTextPresent(findTestData('Members_Test_Data').getValue('MEMBER_ID', 1), false)
'----------------------------------------------'
//WebUI.verifyTextPresent("MEMBER ID", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Terms and Conditions", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Membership Terms & Conditions", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Full details of your relationship agreement with Checkatrade as one of our recommended, vetted and monitored trades", false)
'----------------------------------------------'
WebUI.verifyTextPresent("View full details here", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Rolling Contract Terms & Conditions", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Terms and conditions for Monthly Rolling Contract for Members joined between", false) 
'----------------------------------------------'
WebUI.verifyTextPresent("'Refer a Friend' Terms & Conditions", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Know another trade who you feel would benefit from joining Checkatrade too?", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Member Feedback Policies", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Feedback dos and don’ts guidelines for requesting and handling customer feedback", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Checkatrade Trade Privacy Notice", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Here at Checkatrade we know how important it is to keep your personal data safe, find out how we protect your data and privacy", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Checkatrade Complaints Policy", false)
'----------------------------------------------'
WebUI.verifyTextPresent("In the rare event that a customer has a complaint about a Checkatrade member, they are directed to this complaints policy", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Member Code of Conduct and Ethics", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Our valued trade members commit to the highest standards of conduct and ethics, find out more here", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Cookie Policy", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Checkatrade.com uses cookies to make sure you get the best browsing experience. For more information and to manage your cookie preferences, view Checkatrade’s Cookie Policy", false)
'----------------------------------------------'

// No LogOff on this Page - Navigate Back
WebUI.back()
// detect popup if it puts in an appearance:-)
WebUI.waitForPageLoad(60)
if ('Object Repository/Page_Members Area/Header_Attention_Text'){
	WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Members Area/Header_Attention_Text'), 60)
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Utils/Popout_Handler'), [:], FailureHandling.CONTINUE_ON_FAILURE)
}

///////////////////////////////////////
//                END                //
///////////////////////////////////////
