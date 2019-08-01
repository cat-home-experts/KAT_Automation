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
//row = 1 // Only 1 iteration for demo purposes
//-----------------------------------------
// Call Setup Process - Browser Startup, Navigate, Maximize and Close Cookie Nagging Element
//-----------------------------------------
'Setup, Load browser, set URL, maximize browser and dispel cookie nagging screen'
WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Setup'), [:], FailureHandling.STOP_ON_FAILURE)

//------------------------------------------------------------------------------------------------------------------------------------------------
'Enter trade classifiction'

'Set and SEARCH TRADE CLASSIFICATION'

'--------------------------------'
WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Enter_Trade_Classification'), [:], FailureHandling.CONTINUE_ON_FAILURE)

//------------------------------------------------------------------------------------------------------------------------------------------------
'Enter trade location'

'Set and SEARCH SELECTED LOCATION'

'--------------------------------'
WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Enter_Trade_Location'), [:], FailureHandling.CONTINUE_ON_FAILURE)

//------------------------------------------------------------------------------------------------------------------------------------------------
'Double click on the search button'

'HIT SEARCH'

'--------------------------------'
WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Hit_Search_Button'), [:], FailureHandling.CONTINUE_ON_FAILURE)

//------------------------------------------------------------------------------------------------------------------------------------------------
'This line t be removed after stabilising script'

'HIT SEARCH - again - 2 different locators used as there is something strange about the button object' // LEFT FOR REFERENCE

//WebUI.click(findTestObject('Page_Checkatrade Find a tradesperson you can trust/a_Search'), FailureHandling.CONTINUE_ON_FAILURE)
//------------------------------------------------------------------------------------------------------------------------------------------------
'Expected contantenated text is Returned'
WebUI.callTestCase(findTestCase('Verification_Checks/CAT_Trade_Location_Verification'), [:], FailureHandling.CONTINUE_ON_FAILURE)
//------------------------------------------------------------------------------------------------------------------------------------------------
// Detect stand alone execution - If called by another test, then that test needs to set this global to FALSE
//------------------------------------------------------------------------------------------------------------------------------------------------
//if (GlobalVariable.Standalone_TC_Execution == true) {
	//-----------------------------------------
	// Call Teardown Process - No Teardown Occurs if this test is called by another Test
	//-----------------------------------------
WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Teardown'), [:], FailureHandling.STOP_ON_FAILURE)
	

//--------
// End