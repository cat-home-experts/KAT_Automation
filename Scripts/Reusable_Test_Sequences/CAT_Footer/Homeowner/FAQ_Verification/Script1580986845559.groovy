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
// navigating Homeowner->FAQ MemuItem         |    11/02/2020   |         DH       |                             |
// Returns Frequently Asked Questions VALIDAT |                 |                  |                             |
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
WebUI.verifyTextPresent("Frequently asked questions", false)
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

WebUI.verifyTextPresent("Using the Checkatrade Service", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Do I have to pay for your service", false)
'----------------------------------------------'
WebUI.verifyTextPresent("About Checkatrade Members", false)
'----------------------------------------------'
WebUI.verifyTextPresent("How do you vet prospective members", false)
'----------------------------------------------'
WebUI.verifyTextPresent("If you have a question that is not covered here please call Checkatrade on 0333 0146 190", false)
'----------------------------------------------'
WebUI.verifyTextPresent("calls charged at local rate for BT customers, other service providers may charge more", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Using the Checkatrade Service", false)
'----------------------------------------------'

WebUI.scrollToPosition(500, 500)
WebUI.delay(1)

WebUI.verifyTextPresent("Do I have to pay for your service", false)
'----------------------------------------------'
WebUI.verifyTextPresent("How can I get the best results from your listings", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Use our search facility to find the trade or service you need in your area", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Why can’t I search trades and services by overall score", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Once you are on the profile page of a particular trade or service you have this option via a drop down box", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Why are there only a few traders listed in my area", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Checkatrade started as a local business and quickly grew because the system works", false)
'----------------------------------------------'
WebUI.verifyTextPresent("About Checkatrade Members", false)
'----------------------------------------------'
WebUI.verifyTextPresent("How do you vet prospective members", false)
'----------------------------------------------'
WebUI.verifyTextPresent("All applicants are pre-screened and told that they will be interviewed, vetted and monitored", false)
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
WebUI.verifyTextPresent("We use cookies to help make this website better", false)
'----------------------------------------------'

///////////////////////////////////////
//                END                //
///////////////////////////////////////
