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
//   First Implementation                     |    07/01/2020   |        DH        |                             |
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
'---------------------------------'
'DEFAULT TAB - trading-standards  '
'----------------------------------------------'
// MEMBER ID CHECK
WebUI.verifyTextPresent(findTestData('Members_Test_Data').getValue('MEMBER_ID', 1), false)
'----------------------------------------------'
WebUI.verifyTextPresent("MEMBER ID", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Your Trading Standards Documents", false)
'----------------------------------------------'
' NEW Page Content, Added Below'
'----------------------------------------------'
WebUI.verifyTextPresent("Trading Standards - Terms And Conditions Goods", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Trading Standards - Terms And Conditions Services", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Trading Standards - Terms Guidance", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Trading Standards - Pricing Guidance", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Trading Standards - On Premises Contract | Sole Traders and Partnerships", false)  
'----------------------------------------------'
WebUI.verifyTextPresent("Trading Standards - On Premises Contract | Limited Companies", false)  
'----------------------------------------------'
WebUI.verifyTextPresent("Trading Standards - Off Premises Contract | Sole Traders and Partnerships", false)  
'----------------------------------------------'
WebUI.verifyTextPresent("Trading Standards - Off Premises Contract | Limited Companies", false)  
'----------------------------------------------'
WebUI.verifyTextPresent("Trading Standards - Consumer Contracts", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Trading Standards - Cancellation of Contracts", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Trading Standards - Advice concerning fair trading practices", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Friends Against Scams", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Trading Standards - On Off Premises Contract Advice", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Trading Standards - TS Explained", false)

'----------------------------------------------'//'----------------------------------------------'


///////////////////////////////////////
//                END                //
///////////////////////////////////////
