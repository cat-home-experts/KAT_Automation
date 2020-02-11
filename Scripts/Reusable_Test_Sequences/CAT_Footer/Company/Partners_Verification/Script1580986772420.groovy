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
// navigating Company->Partners Returns       |    06/02/2020   |         DH       |                             |
// Branded partnerships Page                  |                 |                  |                             |
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
WebUI.verifyTextPresent("Branded partnerships", false)
'----------------------------------------------'
'Sub Header'
WebUI.verifyTextPresent("The NSBRC is the UK’s only permanent visitor centre for self & custom", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Abzorb can provide any handset on any of the 3 major networks.  Make use of full business", false)
'----------------------------------------------'
WebUI.verifyTextPresent("At Cat, we take industry-wide standards of safety and durability", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Wave 105 is the market leading commercial radio station", false)
'----------------------------------------------'

WebUI.scrollToPosition(500, 500)
WebUI.delay(1)

'Page Body'

WebUI.verifyTextPresent("Buckinghamshire & Surrey Trading Standards and Checkatrade", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Simply Business is trusted by over 400,000 customers ", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Kent County Council Trading Standards and Checkatrade are working", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Nottinghamshire County Council Trading Standards are working", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Gate Safe is a national charity which campaigns for the improved safety", false)
'----------------------------------------------'
WebUI.verifyTextPresent("At ITS, we understand that in order for you to complete a job", false)
'----------------------------------------------'

WebUI.scrollToPosition(1000, 1000)
WebUI.delay(1)
//WebUI.verifyTextPresent("03301", false)
//'----------------------------------------------'
//WebUI.verifyTextPresent("625", false)
//'----------------------------------------------'
//WebUI.verifyTextPresent("349", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Avoid cheques with our low cost credit and debit card acceptance service", false)
'----------------------------------------------'
WebUI.verifyTextPresent("WEX Europe Services, the owner of the Esso Card™ fuel card portfolio", false)
'----------------------------------------------'

WebUI.scrollToPosition(1000, 1000)
WebUI.delay(1)

'Footer'

'----------------------------------------------'
WebUI.verifyTextPresent("We use cookies to help make this website better", false)
'----------------------------------------------'

///////////////////////////////////////
//                END                //
///////////////////////////////////////
