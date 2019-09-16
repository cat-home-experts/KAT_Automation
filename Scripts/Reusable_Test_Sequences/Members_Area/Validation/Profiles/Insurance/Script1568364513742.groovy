import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

//-----------------------
// TEST HISTORY HEADER - |
//-----------------------
// Any changes to this script, please update the next available row below, with date, in the DATE CREATED column,
// Your NAme in the CREATED BY column, and Finaly, The actual change implemented in the NOTES column.
//
//---------------------------------------------------------------------------------------------------------------
//       Test Definition / Description        |   Date Created  |    Created By    |             Notes           |
//---------------------------------------------------------------------------------------------------------------
//  Verify <Profile><Insurance> Page          |   13/09/2019    |      DH          |                             |
//  from <Grow Your Business>                 |                 |                  |                             |
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
//         Wait for Insurance Element Availability        //
////////////////////////////////////////////////////////////
WebUI.waitForElementPresent(findTestObject('Object Repository/Profiles_Page/Page_Members Area/h2_Update your Public Liability Insurance here'), 25)

////////////////////////////////////////////////////////////
//      Take an Initial Screenshot of Insurance Page      //
////////////////////////////////////////////////////////////

// Stores in Project <Screenshots> Folder
CustomKeywords.'kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeEntirePageScreenshot'('Your_Customers_Insurance.png', FailureHandling.OPTIONAL)

////////////////////////////////////////////////////////////
//         Verify Header Text on Key Portal Areas         //
////////////////////////////////////////////////////////////
'---------------------------------'
'THIS TAB - Insurance             |'
'---------------------------------'
WebUI.verifyTextPresent("Update your Public Liability Insurance Details", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Failure to update your Public Liability Documents may result in", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Policy No", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Insured By", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Insured amount (£ GBP)", false)
'----------------------------------------------'
WebUI.verifyTextPresent("(not employers liability cover)", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Cost of insurance (£ GBP)", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Expiry Data", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Supporting Documents", false)

'----------------------------------------------'
'----------------------------------------------'
// Select Document Button 
//WebUI.click(findTestObject('Object Repository/Profiles_Page/Page_Members Area/button_Select Document'))
'----------------------------------------------'
'----------------------------------------------'
//WebUI.verifyTextPresent("Add Company Logo", false)
'----------------------------------------------'
//WebUI.verifyTextPresent("Your New logo", false)
'----------------------------------------------'
//WebUI.verifyTextPresent("Select Logo", false)
'----------------------------------------------'
// // NEED TO EXTEND THE TOOL IF WE ARE TO INTERACT WITH WINDOWS COMPONENTS (Explorer)
// Clicking Select Brings Up Explorer Search Dialog) extension = Winnium
'----------------------------------------------'
'----------------------------------------------'
// // Need To Close The popout
// WebUI.click(findTestObject('Object Repository/Profiles_Page/Page_Members Area/button_Close'))
'----------------------------------------------'
'----------------------------------------------'
// Need To HIT Back Button to Return to Previous Page
WebUI.back()
'----------------------------------------------'

///////////////////////////////////////
//                END                //
///////////////////////////////////////