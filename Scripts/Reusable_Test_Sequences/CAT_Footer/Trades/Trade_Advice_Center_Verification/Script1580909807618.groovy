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
// navigating Trades->Trade Advice Center     |    05/02/2020   |         DH       |                             |
// Returns <Trade Advice Center> Page VALIDAT |                 |                  |                             |
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
'Only When Needed, NEEDED :-)'
WebUI.waitForElementClickable(findTestObject('Object Repository/CAT_Footer/Advice_Center/Search_Button'), 60)
'----------------------------------------------'
'DEFAULT TAB - None - 1 Page Returned          |'
'----------------------------------------------'
// MEMBER ID CHECK
//WebUI.verifyTextPresent(findTestData('Members_Test_Data').getValue('MEMBER_ID', 1), false)
'----------------------------------------------'
//WebUI.verifyTextPresent("MEMBER ID", false)
'----------------------------------------------'
'Header'
WebUI.verifyTextPresent("Welcome to the", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Trade Advice Centre", false)
'----------------------------------------------'

'Sub Header'
WebUI.verifyTextPresent("Homeowner", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Trade", false)
'----------------------------------------------'
WebUI.verifyTextPresent("All", false) // Search not visible
'----------------------------------------------'

'Page Body'

WebUI.verifyTextPresent("Tradesperson advice to help grow your business", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Tips for building your online trader reputation", false)
'----------------------------------------------'

WebUI.scrollToPosition(1000, 1000)
WebUI.waitForPageLoad(10)

'Page Mid'

'----------------------------------------------'
WebUI.verifyTextPresent("Continue reading", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Featured Topics", false)
'----------------------------------------------'
WebUI.verifyTextPresent("News", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Events", false)
'----------------------------------------------'

'Sync'
//WebUI.delay(3) 
//WebUI.waitForElementClickable(findTestObject('Object Repository/CAT_Footer/Advice_Center/Career_Development_Button'), 60)

//WebUI.verifyTextPresent("Career Development", false) // unreliable
'----------------------------------------------'
//WebUI.waitForElementClickable(findTestObject('Object Repository/CAT_Footer/Advice_Center/Health_Safety_Button'), 60)

//WebUI.verifyTextPresent("Health & Safety", false)
'----------------------------------------------'


WebUI.scrollToPosition(5000, 5000)
WebUI.waitForPageLoad(10)

'Footer'

'----------------------------------------------'
WebUI.verifyTextPresent("View Article", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Load more", false)
'----------------------------------------------'
//WebUI.verifyTextPresent("LiveChat", false)
'----------------------------------------------'
WebUI.verifyTextPresent("We use cookies to help make this website better", false)
'----------------------------------------------'

///////////////////////////////////////
//                END                //
///////////////////////////////////////

