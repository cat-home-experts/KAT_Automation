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
// TEST HISTORY HEADER - |                                                                                                               |
//-----------------------
// Any changes to this script, please update the next available row below, with date, in the DATE CREATED column,
// Your Name in the CREATED BY column, and Finaly, The actual change implemented in the NOTES column.
//
//---------------------------------------------------------------------------------------------------------------
//       Test Definition / Description        |   Date Created  |    Created By    |             Notes           |
//---------------------------------------------------------------------------------------------------------------
// Return to HOME Page and Verify Success     |                 |                  |                             |
// Moved from Final Page Test to Here         |    29/08/2019   |     Dave Horne   |                             |
//                                            |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
// Added a check ensuring we are returned to  |    03/09/2019   |     Dave Horne   |                             |
// the correct home page, after test execution|                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
// Firefox - Home Page Return Slow - Detect   |    05/09/2019   |     Dave Horne   |                             |
// <SEARCH> (Instantiated) Button Added       |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
//                                            |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
//                                            |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
//
//---------------------------------------------------------------------------------------------------------------
//                                                                                                               |
//                                                                                                               |
//                                                                                                               |
//                                                                                                               |
//                                                                                                               |
//                                                                                                               |
//                                                                                                               |
//---------------------------------------------------------------------------------------------------------------

//------------------
WebUI.waitForPageLoad(2)
///////////////////////////////////////////////////////////
// Wait for the <SEARCH> Button to be Instantiated       //
///////////////////////////////////////////////////////////
WebUI.waitForElementVisible(findTestObject('Object Repository/Checkatrade_Trade_Search_Page/Page_Checkatrade Find a tradesperson you can trust/a_Search'), 10)

'------------------------------------'
// Returned to Home Page
'------------------------------------'
// Homepage Header Displyed
WebUI.verifyTextPresent('Helping you find the right trade or service', false)
'------------------------------------'
// Homepage Service Informaation is Displayed
WebUI.verifyTextPresent('Search through over', false) //over 30,000 recommended
'------------------------------------'
// Second part of string, Excluding Number
WebUI.verifyTextPresent('recommended, vetted and monitored trades and service providers for free.', false)
'------------------------------------'
// Search by Member Trade Name is Displayed
WebUI.verifyTextPresent('or look up a member by name', false)
'------------------------------------'
// Number of Reviews Published so far is Displayed
WebUI.verifyTextPresent('reviews published so far – thank you!', false)
'------------------------------------'
// Verify We Are Returning to the CORRECT Home Page
GlobalVariable.CurrentUrl = WebUI.getUrl()
if (GlobalVariable.CurrentUrl == GlobalVariable.URL){
	System.out.println("We have been redirected, correctly back to home URL"+GlobalVariable.URL);
}
else {
	System.out.println("We have been redirected, incorrectly back to URL"+GlobalVariable.CurrentUrl+" We should be on "+GlobalVariable.URL);
}
//-------------------------------------------------------
// END                                                  | - Snip - 29/08/2019 - ok
//-------------------------------------------------------