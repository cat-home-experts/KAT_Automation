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
//  Members Whistle Blower Validation Checks  |   04/12/2019    |        DH        |                             |
//                                            |                 |                  |                             |
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

WebUI.waitForPageLoad(60)

////////////////////////////////////////////////////////////
//     Take an Initial Screenshot of Home After Login     //
////////////////////////////////////////////////////////////
//WebUI.takeScreenshot('Reports/Screenshots/Initial_Members_page.png')
// Stores in Project <Screenshots> Folder
// CustomKeywords.'kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeEntirePageScreenshot'('Your_Customers_Remind_Customer.png', FailureHandling.OPTIONAL)

'Check URL Is The Correct One :-)'
WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Utils/Check_URL'), [:], FailureHandling.CONTINUE_ON_FAILURE)

////////////////////////////////////////////////////////////
//         Verify Header Text on Key Portal Areas         //
////////////////////////////////////////////////////////////
'----------------------------------------------'
'DEFAULT TAB - None - 1 Page Returned          |'
'----------------------------------------------'
// MEMBER ID CHECK
WebUI.verifyTextPresent(findTestData('Members_Test_Data').getValue('MEMBER_ID', 1), false)
'----------------------------------------------'
WebUI.verifyTextPresent("MEMBER ID", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Whistleblower", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Together we can help keep Checkatrade who it was designed for - the best!", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Although Checkatrade undertake a stringent vetting process, we recognise that trades know trades and your input in maintaining the standards of our", false)
'----------------------------------------------'
WebUI.verifyTextPresent("members is vital. If you are aware of a current member who, in your opinion, does not meet the Checkatrade standards, please inform us here", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Start typing to select a member", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Enter your comments", false)  
'----------------------------------------------'
WebUI.scrollToPosition(250, 250)
'----------------------------------------------'
WebUI.delay(1)
'----------------------------------------------'
WebUI.verifyTextPresent("I wish to remain anonymous to the trade I am informing you of, but am happy for Checkatrade to know who I am", false)
'----------------------------------------------'
WebUI.verifyTextPresent("I'm happy for the trade I am informing you of and Checkatrade to know who I am", false) 
'----------------------------------------------'
WebUI.verifyTextPresent("I wish to remain completely anonymous", false)  
'----------------------------------------------'

WebUI.verifyTextPresent("Please note if you remain anonymous we will not be able to contact you for further information", false)  
'----------------------------------------------'
WebUI.verifyTextPresent("Sending this information does not mean the trade/service will be automatically suspended from Checkatrade membership. However, it will activate an investigational process", false)  
'----------------------------------------------'
WebUI.verifyTextPresent("Thank you for helping us keep the standards of Checkatrade membership", false)
'----------------------------------------------'

'----------------------------------------------------------------------------------------------------------'
'Random Selction Of Radio Buttons Plus Text Entry, NO COMMIT - Ensure Page Is Interactive and takes Input  |'
'----------------------------------------------------------------------------------------------------------'
'Company Name  |'
'--------------'
WebUI.setText(findTestObject('Object Repository/Page_Members Area/WhistleBlower/Page_Members Area/input_Start typing to select a member_mat-input-0'), 'Test Data')
'--------------'
'Comment       |'
'--------------'
WebUI.setText(findTestObject('Object Repository/Page_Members Area/WhistleBlower/Page_Members Area/textarea_Enter your comments_txtComments'), 'Test Data')
'--------------'
'Radio 2       |'
'--------------'
WebUI.waitForElementClickable(findTestObject('Page_Members Area/WhistleBlower/Page_Members Area/input_WB2_Radio'), 3)
WebUI.click(findTestObject('Page_Members Area/WhistleBlower/Page_Members Area/input_WB2_Radio'))
'--------------'
'Radio 3       |'
'--------------'
WebUI.waitForElementClickable(findTestObject('Page_Members Area/WhistleBlower/Page_Members Area/input_WB3_Radio'), 3)
WebUI.click(findTestObject('Page_Members Area/WhistleBlower/Page_Members Area/input_WB3_Radio'))
'--------------'
'Radio 1       |'
'--------------'
WebUI.waitForElementClickable(findTestObject('Page_Members Area/WhistleBlower/Page_Members Area/input_WB1_Radio'), 3)
WebUI.click(findTestObject('Page_Members Area/WhistleBlower/Page_Members Area/input_WB1_Radio'))
'--------------'
'Reset Entry   |' 
'--------------'
WebUI.click(findTestObject('Object Repository/Page_Members Area/WhistleBlower/Page_Members Area/button_Reset'))

// No LogOff on this Page - Navigate Back
// WebUI.back()
//WebUI.scrollToElement(findTestObject('Object Repository/Page_Members Area/a_Dashboard'), 10)

///////////////////////////////////////
//                END                //
///////////////////////////////////////
