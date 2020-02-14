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
// navigating Homeowner->Checkatrade Standard |    12/02/2020   |         DH       |                             |
// Menu Returns Checkatrade Standard Page VAL |                 |                  |                             |
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
WebUI.verifyTextPresent("The Checkatrade Standard", false)
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
WebUI.verifyTextPresent("Our members are proud to be part of Checkatrade.com, and they stand by their work", false)
WebUI.verifyTextPresent("To show their commitment to service and quality, every single member has agreed to uphold The Checkatrade Standard", false)

'Page Body'

WebUI.verifyTextPresent("Checkatrade members agree to", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Be honest in all dealings with you", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Tell you about any call-out fees before coming to you", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Let you know straight away if they can’t do the work", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Keep appointments and arrive on time (calling in advance if they need to reschedule)", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Be realistic about when they can start work and how long it will take", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Be courteous. Treat you, your property and belongings with respect", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Keep you in the picture about all aspects of the work", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Return phone messages promptly", false)
'----------------------------------------------'

WebUI.scrollToPosition(500, 500)
WebUI.delay(1)

'Mid Page'

WebUI.verifyTextPresent("Create an additional contract for variations from the original agreement", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Deal with complaints promptly and professionally", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Never demand cash payment", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Never be verbally or physically abusive or threatening to a customer in any way", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Not obtain work through cold calling", false)
'----------------------------------------------'

WebUI.verifyTextPresent("Checkatrade members will give you a feedback card up front. After they have finished the work", false)
'----------------------------------------------'
WebUI.verifyTextPresent("send it in to let the public know how they did. If you prefer, give your feedback online", false)
'----------------------------------------------'

WebUI.scrollToPosition(750, 750)
WebUI.delay(1)

'Mid Page'
WebUI.verifyTextPresent("All Checkatrade members are thoroughly vetted before they are displayed on our website", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Interviewed", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Accreditations and Qualifications", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Public Liability Insurance", false)
'----------------------------------------------'
WebUI.verifyTextPresent("ID checked", false)
'----------------------------------------------'
WebUI.verifyTextPresent("References", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Address verified", false)
'----------------------------------------------'
WebUI.verifyTextPresent("No reliance on information", false)
'----------------------------------------------'
WebUI.verifyTextPresent("The content contained on the Website is provided for general information only.", false)
'----------------------------------------------'
WebUI.verifyTextPresent("It is not intended to amount to advice on which you should rely", false)
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