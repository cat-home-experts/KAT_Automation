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
// Your NAme in the CREATED BY column, and Finaly, The actual change implemented in the NOTES column.
//
//---------------------------------------------------------------------------------------------------------------
//       Test Definition / Description        |   Date Created  |    Created By    |             Notes           |
//---------------------------------------------------------------------------------------------------------------
//  Trader/Company Not Listed on CAT          |    27/02/2020   |       DH         |                             |
//---------------------------------------------------------------------------------------------------------------
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
//                                            |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
//
//---------------------------------------------------------------------------------------------------------------
//                                                                                                               |
//	GIVEN - The Chekatrade Website 'SEARCHPAGE' is Presented on a Client Device                                  |
//                                                                                                               |
//	WHEN -  We Click on 'look up member by name' Below the Trade entry Text box                                  |
//                                                                                                               |
//	AND  -	We Enter The Traders 'Business Name' OR 'CAT ID' as Search Criteria (not in listing) and Hit SEARCH  |
//                                                                                                               |
//  THEN -  The Resulting Output Reports Company/Trader Is Not In CAT List (Warning Reported)                    |
//                                                                                                               |
//---------------------------------------------------------------------------------------------------------------

'For Loop to Iterate over the test data provided by the Excel spreadsheet, \r\nassociated with this test'
for (GlobalVariable.row = 1; GlobalVariable.row <= findTestData('Search_CAT_ID_Data_NEG').getRowNumbers(); GlobalVariable.row++) {
	//-----------------------------------------
	// Call Setup Process - Browser Startup, Navigate, Maximize and Close Cookie Nagging Element
	//-----------------------------------------
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Setup'), [:], FailureHandling.STOP_ON_FAILURE)
	
	' Home Page validation Checks after COOKIE Dispelled'  // Changed 02/01/2020 - Refer header and script below
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Home'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	
	'---------------------------------------------------------------------'
	' Select Search on Trader Name (or ID) From Home page/Search Screen   |' // Changed 02/01/2020 - Refer header and script below
	'---------------------------------------------------------------------'
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Click_Search_Trade_Name'), [:], FailureHandling.STOP_ON_FAILURE)

		'---------------------------------------'
	' Enter Trader Name (or ID) to Search   |'  // Changed 02/01/2020 - Refer header and script below
	'---------------------------------------'
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Enter_Trade_Name'), [:], FailureHandling.STOP_ON_FAILURE)
	
	'---------------------------------------'
	' Search Trader Name (or ID)            |'  // Changed 02/01/2020 - Refer header and script below
	'---------------------------------------'
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Search_Trade_Name'), [:], FailureHandling.STOP_ON_FAILURE)

	'------------------------------------------'
	' Expected ERROR Reported                  |'
	'------------------------------------------'
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Search_Tradename_Not_Returned'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	
	'--------------------------'
	' Teardown - CLose Browser |'
	'--------------------------'
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Teardown'), [:], FailureHandling.OPTIONAL)

	'--------------------------'
	' END                      |'
	'--------------------------'
}
