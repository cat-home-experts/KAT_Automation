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
// navigating Company->Brand Use Returns      |    06/02/2020   |         DH       |                             |
// Checkatrade.com Brand Guidelines Page      |                 |                  |                             |
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
WebUI.verifyTextPresent("Checkatrade.com Brand Guidelines", false)
'----------------------------------------------'
WebUI.verifyTextPresent("All materials need to remain in their ratio, please do not stretch", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Full logo", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Please use our full logo whenever you have enough space and everything is perfectly legible", false)
'----------------------------------------------'

'Sub Header'
WebUI.verifyTextPresent("Logo variations", false)
'----------------------------------------------'
WebUI.verifyTextPresent('When it’s hard to read the strapline and "dot com" part, use the logo on the left', false)
'----------------------------------------------'
WebUI.verifyTextPresent("Use the stacked logo (right) where it fits the space better, e.g. a square space", false)
'----------------------------------------------'

'Page Body'
WebUI.verifyTextPresent("Colours", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Print red", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Print blue", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Print black", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Web red", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Web blue", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Web black", false)
'----------------------------------------------'
//WebUI.verifyTextPresent("03301", false)
//'----------------------------------------------'
//WebUI.verifyTextPresent("625", false)
//'----------------------------------------------'
//WebUI.verifyTextPresent("349", false)

WebUI.scrollToPosition(500, 500)
WebUI.delay(1)

'Centre page'

'----------------------------------------------'
WebUI.verifyTextPresent("Exclusion zones", false)
'----------------------------------------------'
WebUI.verifyTextPresent('Please use the exclusion zones provided in the files. This is the same width of the lower case "e" in the logo', false)
'----------------------------------------------'
WebUI.verifyTextPresent("Logo use on black/grey backgrounds", false)
'----------------------------------------------'
WebUI.verifyTextPresent("On black", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Use all white as colours will be difficult to read", false)
'----------------------------------------------'
WebUI.verifyTextPresent("On dark grey", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Also, use all white as colours will be difficult to read", false)
'----------------------------------------------'
WebUI.verifyTextPresent("On light grey", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Use regular full colour logo until grey crosses over to dark grey (usually around 40% black)", false)
'----------------------------------------------'
WebUI.verifyTextPresent("On dark grey", false)

WebUI.scrollToPosition(500, 500)
WebUI.delay(1)

'Footer'

'----------------------------------------------'
WebUI.verifyTextPresent("Audio jingle", false)
'----------------------------------------------'
WebUI.verifyTextPresent("The jingle is a key element of our brand, this should appear in all audio marketing. If needed, please contact marketing@checkatrade.com", false)

'STOCK'


'----------------------------------------------'
WebUI.verifyTextPresent("We use cookies to help make this website better", false)
'----------------------------------------------'

///////////////////////////////////////
//                END                //
///////////////////////////////////////
