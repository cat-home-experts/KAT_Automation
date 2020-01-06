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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

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
// New footer details verified                |    10/12/2019   |        DH        |                             |
//---------------------------------------------------------------------------------------------------------------
// New Website, Initial Verification Changes  |    02/01/2020   |        DH        |                             |
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
WebUI.waitForPageLoad(60)
WebUI.delay(2)
///////////////////////////////////////////////////////////
// Wait for the <SEARCH> Button to be Instantiated       //
///////////////////////////////////////////////////////////
//WebUI.waitForElementClickable(findTestObject('Object Repository/Checkatrade_Trade_Search_Page/Page_Checkatrade Find a tradesperson you can trust/Page_Checkatrade Find a tradesperson you can trust/a_Search'), 60)

'------------------------------------'
// Returned to Home Page
'------------------------------------'
// Homepage Header Displyed
'Old Site'
// WebUI.verifyTextPresent('Helping you find the right trade or service', false)
'New Site'
WebUI.verifyTextPresent('Looking for a Tradesperson?', false)
'------------------------------------'
'Old'
// Homepage Service Informaation is Displayed
//WebUI.verifyTextPresent('Search through over', false) //over 30,000 recommended
'New'
WebUI.verifyTextPresent('Pick from one of more then ', false) //over 30,000 recommended
'------------------------------------'
'Old'
// Second part of string, Excluding Number
//WebUI.verifyTextPresent('recommended, vetted and monitored trades and service providers for free.', false)
'New'
WebUI.verifyTextPresent('vetted and monitored Trades', false)
'------------------------------------'
// Search by Member Trade Name is Displayed
WebUI.verifyTextPresent('or look up a member by name', false)
'------------------------------------'
// Number of Reviews Published so far is Displayed
'Old'
// WebUI.verifyTextPresent('reviews published so far – thank you!', false)
'New'
WebUI.verifyTextPresent('Reference & Reviews', false)
WebUI.verifyTextPresent('Background', false)
WebUI.verifyTextPresent('Insurance', false)

'------------------------------------'
' NEW FOOTER Details - 10/12/2019 - Old Site'
' NEW FOOTER Details - 02/01/2019 - New Site'
'------------------------------------'
'Old'
// I need a trade or service LH Lower Section
//' NEW FOOTER Details - 10/12/2019'
'------------------------------------'
// Body Text
//' NEW FOOTER Details - 10/12/2019'
'------------------------------------'
// Button Label
//WebUI.verifyTextPresent('Find out more', false)
'------------------------------------'
// I am trade or service RH Lower Section
//WebUI.verifyTextPresent('I am a tradesman', false)
'------------------------------------'
// Body Text
//WebUI.verifyTextPresent('Over a million visits to Checkatrade each month', false)
'------------------------------------'
// Button Label
//WebUI.verifyTextPresent('Find out more', false) // 2 of these buttons, so check will pass but could be missing a button and would still pass :-)
'New'
WebUI.verifyTextPresent('Checkatrade Articles: Cost Guides', false)
WebUI.verifyTextPresent('See All Articles', false)
WebUI.verifyTextPresent('How Checkatrade works', false)

WebUI.scrollToPosition(500, 500)
WebUI.delay(1)

WebUI.verifyTextPresent('Millions of reviews', false)
WebUI.verifyTextPresent('Our members give out a feedback card with each and every job', false)
WebUI.verifyTextPresent('Free to use', false)
WebUI.verifyTextPresent('Checkatrade is a completely free service', false)
WebUI.verifyTextPresent('Nationwide', false)
WebUI.verifyTextPresent('Search for tradespeople who work near you from anywhere in the UK', false)
WebUI.verifyTextPresent('About our members', false)
WebUI.verifyTextPresent('Checkatrade runs strict background checks on tradespeople before they can become members', false)
WebUI.verifyTextPresent('The Checkatrade Standard', false)
WebUI.verifyTextPresent('Resolving Issues', false)
WebUI.verifyTextPresent('FAQ', false)

'------------------------------------'
'FOOTER'
'------------------------------------'
// Section Trades
WebUI.verifyTextPresent('Trades', false)
'------------------------------------'
// Section Home Owner
WebUI.verifyTextPresent('Homeowner', false)
'------------------------------------'
// Section Trades
WebUI.verifyTextPresent('Company', false)
'------------------------------------'
'Social Media'
'------------------------------------'
// Follow Us on
WebUI.verifyTextPresent('Follow us on', false) // old - Follow Us On
'------------------------------------'

WebUI.scrollToElement(findTestObject('Object Repository/New_CAT_Search/Search_by_Name'), 3)
WebUI.waitForElementClickable(findTestObject('Object Repository/New_CAT_Search/Search_by_Name'), 10)
WebUI.waitForPageLoad(60)
'------------------------------------'

WebUI.scrollToPosition(0, 0)
WebUI.delay(1)
// Verify We Are Returning to the CORRECT Home Page * * * OUT OF CONTEXT * * * 
//GlobalVariable.CurrentUrl = WebUI.getUrl()
//if (GlobalVariable.CurrentUrl == GlobalVariable.URL){
//	//System.out.println("We have been redirected, correctly back to home URL"+GlobalVariable.URL);
//	KeywordUtil.markPassed("We have been redirected, correctly back to home URL"+GlobalVariable.URL);
//}
//else {
//	//System.out.println("We have been redirected, incorrectly back to URL"+GlobalVariable.CurrentUrl+" We should be on "+GlobalVariable.URL);
//	KeywordUtil.markFailed("We have been redirected, incorrectly back to URL"+GlobalVariable.CurrentUrl+" We should be on "+GlobalVariable.URL);
//}
//-------------------------------------------------------
// END                                                  | - Snip - 29/08/2019 - ok
//-------------------------------------------------------