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
// Your NAme in the CREATED BY column, and Finaly, The actual change implemented in the NOTES column.
//
//---------------------------------------------------------------------------------------------------------------
//       Test Definition / Description        |   Date Created  |    Created By    |             Notes           |
//---------------------------------------------------------------------------------------------------------------
// Test to confirm that the correct detail is |                 |                  | Single Search Undertaken    |
// returned for given 'Trade' and 'Location'  |    13/07/2019   |     Dave Horne   | Using External Test Data    |
// search criteria.                           |                 |                  | Provided on an Excel SSheet |
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
//	GIVEN - The Chekatrade Website 'SEARCHPAGE' is Presented on a Client Device                                  |
//                                                                                                               |
//	WHEN -  We Enter Trade and Location Search Criteria and Hit SEARCH                                           |
//                                                                                                               |
//  THEN -  The Resulting Search Results Page is Returned Along With a Valid Set of Results                      |
//                                                                                                               |
//---------------------------------------------------------------------------------------------------------------
// FOR DEMO PURPOSES - REAL TEST CASE WOULD USE SHARED RESOURCES FROM REAUSABLE TEST SEQUENCES
//-----------------------------------------
//Test Listener Manages Startup Processes
//-----------------------------------------
'For Loop to Iterate over the test data provided by the Excel spreadsheet, \r\nassociated with this test\r\n'
//for (def row = 1; row <= findTestData('searchTestData').getRowNumbers(); row++) {
	//-----------------------------------------
   //Test Listener Manages Startup Processes
	WebUI.openBrowser('')

	'URL - Set from the ENVIRONMENT PROFILE '
	WebUI.navigateToUrl(GlobalVariable.URL)

	WebUI.maximizeWindow()

	'Closes COOKIE nagging element '
	WebUI.click(findTestObject('Object Repository/Checkatrade_Trade_Search_Page/Page_Checkatrade Find a tradesperson you can trust/div_close'))
	'Set and SEARCH TRADE CLASSIFICATION'
	WebUI.setText(findTestObject('Object Repository/Page_Checkatrade Find a tradesperson you can trust/input_Search through overrecommended vetted and monitored trades and service providers for free_trade_autocomplete_input'),
		findTestData('searchTestData').getValue('tradeClassification', 1))
	//------------------------------------------------------------------------------------------------------------------------------------------------
	'Set and SEARCH SELECTED LOCATION'
	WebUI.setText(findTestObject('Object Repository/Checkatrade_Trade_Search_Page/Page_Checkatrade Find a tradesperson you can trust/input_location'),
		findTestData('searchTestData').getValue('tradeLocation', 1))
	//------------------------------------------------------------------------------------------------------------------------------------------------
	
	'HIT SEARCH'
	WebUI.scrollToElement(findTestObject('Object Repository/Checkatrade_Trade_Search_Page/Page_Checkatrade Find a tradesperson you can trust/a_Search'), 5)
	'-------------'
	
	WebUI.doubleClick(findTestObject('Object Repository/Checkatrade_Trade_Search_Page/Page_Checkatrade Find a tradesperson you can trust/a_Search'))
	
	//------------------------------------------------------------------------------------------------------------------------------------------------
	'HIT SEARCH - again - 2 different locators used as there is something strange about the button object'
	//WebUI.click(findTestObject('Page_Checkatrade Find a tradesperson you can trust/a_Search'), FailureHandling.CONTINUE_ON_FAILURE)
	//------------------------------------------------------------------------------------------------------------------------------------------------
	'Expected cantantenated text is Returned'
	WebUI.verifyTextPresent(findTestData('searchTestData').getValue('tradeLocationVerification', 5), false)
	
	//WebUI.delay(10)
	//------------------------------------------------------------------------------------------------------------------------------------------------
	//scrapedSearchResult = WebUI.verifyTextPresent(findTestData('searchTestData').getValue('tradeLocationVerification', 1), false)
	//------------------------------------------------------------------------------------------------------------------------------------------------
	//System.out.print(scrapedSearchResult+" Was returned after the Trade - Location Search")
	//-----------------------------------------
	// Test Listener Manages Teardown Processes
	//'Scraped Search Result From Sub Header NOT IMPLEMENED YET'
	WebUI.closeBrowser()
//}
