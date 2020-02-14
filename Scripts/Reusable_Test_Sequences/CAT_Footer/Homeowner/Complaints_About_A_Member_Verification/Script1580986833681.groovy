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
// navigating Homeowner->Complaimts About Mem |    11/02/2020   |         DH       |                             |
// Returns Resolving Issues Page VALIDATION   |                 |                  |                             |
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
WebUI.verifyTextPresent("Resolving Issues", false)
'----------------------------------------------'
'Sub Header- Ribbon Menu Options'
WebUI.verifyTextPresent("Why Checkatrade", false)
'----------------------------------------------'
WebUI.verifyTextPresent("The Checkatrade Standard", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Resolving issues", false)
'----------------------------------------------'
WebUI.verifyTextPresent("FAQ", false)
'----------------------------------------------'

'Page Body'

WebUI.verifyTextPresent("Our members promise to meet The Checkatrade standard", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Our Policy", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Checkatrade encourage and recommend you to make all reasonable efforts to discuss your issues directly", false)
'----------------------------------------------'
WebUI.verifyTextPresent("We aim to respond to all Complaints within 24 hours", false)
'----------------------------------------------'

WebUI.scrollToPosition(500, 500)
WebUI.delay(1)


WebUI.verifyTextPresent("Our Complaints Process", false)
'----------------------------------------------'
WebUI.verifyTextPresent("YES", false)
'----------------------------------------------'
WebUI.verifyTextPresent("NO", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Have you contacted the member to talk about your concerns", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Further Advice", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Citizens Advice Consumer Helpline is a telephone and online consumer advice service", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Visit their website here or call 03454 04 05 06", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Phone: 01243 601234  Address: Checkatrade, Building 2000, Lakeside North Harbour, Western Road, Portsmouth, PO6 3EN", false)
'----------------------------------------------'

WebUI.scrollToPosition(1000, 1000)
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
