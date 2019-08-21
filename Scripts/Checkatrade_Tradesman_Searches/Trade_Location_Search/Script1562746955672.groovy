import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.annotation.BeforeTestCase as BeforeTestCase
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
//import NewTestListener as NewTestListener
import org.openqa.selenium.Keys as Keys


//-----------------------
// TEST HISTORY HEADER - |                                                                                                               |
//-----------------------
// Any changes to this script, please update the next available row below, with date, in the DATE CREATED column,
// Your NAme in the CREATED BY column, and Finaly, The actual change implemented in the NOTES column.
//
//---------------------------------------------------------------------------------------------------------------
//       Test Definition / Description        |   Date Created  |    Created By    |             Notes           |
//---------------------------------------------------------------------------------------------------------------
// Test to confirm that the correct detail is |                 |                  | Multiple Searches Undertaken|
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
'For Loop to Iterate over the test data provided by the Excel spreadsheet, \r\nassociated with this test\r\n'
for (GlobalVariable.row = 1; GlobalVariable.row <= findTestData('searchTestData').getRowNumbers(); GlobalVariable.row++) { //def removed for globalisation
	
	//-----------------------------------------
	// Call Startup Process - Browser Startup, Navigate, Maximize and Close Cookie Nagging Element
	//-----------------------------------------
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Setup_Old'), [:], FailureHandling.STOP_ON_FAILURE)
	//-----------------------------------------
	
	'---------------------------------------'
	' Set and SEARCH TRADE CLASSIFICATION   |'
	'---------------------------------------'
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Enter_Trade_Classification'), [:], FailureHandling.CONTINUE_ON_FAILURE)

	'---------------------------------------'
	' Set and SEARCH TRADE LOCATION         |'
	'---------------------------------------'
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Enter_Trade_Location'), [:], FailureHandling.CONTINUE_ON_FAILURE)

	'---------------------------------------'
	' Scroll Search Button into View        |'
	'---------------------------------------'
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Scroll_To_Search_Button'), [:], FailureHandling.CONTINUE_ON_FAILURE)

	'---------------------------------------'
	' Hit Search Button                     |'
	'---------------------------------------'
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Hit_Search_Button'), [:], FailureHandling.CONTINUE_ON_FAILURE)

	'---------------------------------------'
	' Verify Returned Page is as Expected   |'
	'---------------------------------------'
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Verification'), [:], FailureHandling.CONTINUE_ON_FAILURE)

	'--------------------------'
	' Teardown - CLose Browser |'
	'--------------------------'
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Teardown'), [:], FailureHandling.STOP_ON_FAILURE)
		
	'--------------------------'
	' END                      |'
	'--------------------------'

//    //-----------------------------------------
//	// Call Setup Process - Browser Startup, Navigate, Maximize and Close Cookie Nagging Element
//	//-----------------------------------------
//	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Setup_Old'), [:], FailureHandling.STOP_ON_FAILURE)
//	//-----------------------------------------
//	
//    //-----------------------------------------
//    'SEARCH TRADE CLASSIFICATION'
//    WebUI.setText(findTestObject('Object Repository/Page_Checkatrade Find a tradesperson you can trust/input_Search through overrecommended vetted and monitored trades and service providers for free_trade_autocomplete_input'), 
//        findTestData('searchTestData').getValue('tradeClassification', GlobalVariable.row))
//
//    //------------------------------------------------------------------------------------------------------------------------------------------------
//    'SEARCH SELECTED LOCATION'
//    WebUI.setText(findTestObject('Object Repository/Checkatrade_Trade_Search_Page/Page_Checkatrade Find a tradesperson you can trust/input_location'), 
//        findTestData('searchTestData').getValue('tradeLocation', GlobalVariable.row))
//
//	 //------------------------------------------------------------------------------------------------------------------------------------------------
//	'Double click on the search button'
//	
//	'HIT SEARCH'
//	
//	'--------------------------------'
//	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Hit_Search_Button'), [:], FailureHandling.CONTINUE_ON_FAILURE)
//	
//	//------------------------------------------------------------------------------------------------------------------------------------------------
//    'Expected cantantenated text is Returned'
//    WebUI.verifyTextPresent(findTestData('searchTestData').getValue('tradeLocationVerification', GlobalVariable.row), false)
//
// 	//-----------------------------------------
//	// Call Teardown Process -
//	//-----------------------------------------
//	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Teardown'), [:], FailureHandling.STOP_ON_FAILURE)
//	//------------------------------------------------------------------------------------------------------------------------------------------------
	
}
