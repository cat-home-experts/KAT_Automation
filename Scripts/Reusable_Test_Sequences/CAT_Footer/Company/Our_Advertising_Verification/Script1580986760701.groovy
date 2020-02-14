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
// navigating Company->Our Advertising Returns|    10/02/2020   |         DH       |                             |
// Our Advertising Page VALIDATION            |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
// Coontent changes                           |    13/02/2020   |         FH       |                             |
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
WebUI.verifyTextPresent("Our Advertising", false)
'----------------------------------------------'
'Sub Header'
WebUI.verifyTextPresent("Our new advert demonstrates the pitfalls of not using a recommended, vetted, and monitored tradesperson", false)
'----------------------------------------------'
WebUI.verifyTextPresent("there’s a better way to carry out home improvements and repairs", false)
'----------------------------------------------'
// WebUI.verifyTextPresent("Enquire Now", false)
'----------------------------------------------'
' Embedded Video not Checked currently'

'Page Body - Selection of checks, not comprehensive, 25%'

WebUI.verifyTextPresent("How our advertising benefits our members & consumers", false) //'12/02/2020 change'
'----------------------------------------------'
WebUI.verifyTextPresent("We all know the jingle, and the Checkatrade brand is a household name", false)//'12/02/2020 change'
'----------------------------------------------'
WebUI.verifyTextPresent("How our advertising benefits our members & consumers", false)//'12/02/2020 change'
'----------------------------------------------'
WebUI.verifyTextPresent("The more we talk to customers about our network of over", false)//'12/02/2020 change'
'----------------------------------------------'

WebUI.scrollToPosition(500, 500)
WebUI.delay(1)


WebUI.verifyTextPresent("Our current campaign", false)
//'----------------------------------------------'
WebUI.verifyTextPresent("We have created a brand-new TV advert", false)
//WebUI.verifyTextPresent("We have created brand-new fast-paced comedic TV advert ", false)
//'----------------------------------------------'
WebUI.verifyTextPresent("Did you know that we carry out up to 14 checks on trades so that consumers don’t have to", false)//'12/02/2020 change'
'----------------------------------------------'
WebUI.verifyTextPresent("peace of mind and trust which is what we want to bring to life in our new marketing campaign", false)//'12/02/2020 change'
'----------------------------------------------'
WebUI.verifyTextPresent("The campaign will specifically run across TV and be supported by digital, radio and social media", false)//'12/02/2020 change'
'----------------------------------------------'
WebUI.verifyTextPresent("Secured a 12-month TV sponsorship on Homes and Really channels", false)//'12/02/2020 change'
'----------------------------------------------'

WebUI.scrollToPosition(1000, 1000)
WebUI.delay(1)

'Footer'

'----------------------------------------------'
//WebUI.verifyTextPresent("Call us on", false)
'----------------------------------------------'
//WebUI.verifyTextPresent("03301", false)
//'----------------------------------------------'
//WebUI.verifyTextPresent("625", false)
//'----------------------------------------------'
//WebUI.verifyTextPresent("349", false)
'----------------------------------------------'
//WebUI.verifyTextPresent("Get Started", false)
'----------------------------------------------'
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
