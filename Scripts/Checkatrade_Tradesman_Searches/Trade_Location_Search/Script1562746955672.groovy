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
// TEST HISTORY HEADER - |                                                                               
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
// Reusable_Test_Sequences/CAT_Click_         |                 |                  |                             |
//              Search_Trade_Location Updated |    06/01/2020   |        DH        | Changes for NEW Web Site    |
//---------------------------------------------------------------------------------------------------------------
// Reusable_Test_Sequences/New_CAT_Search     |                 |                  |                             |
//                 Trade_Location Updated     |    06/01/2020   |        DH        | Changes for NEW Web Site    |
//---------------------------------------------------------------------------------------------------------------
// Reusable_Test_Sequences/New_CAT_Search     |                 |                  |                             |
//                 _Button Updated            |    06/01/2020   |        DH        | Changes for NEW Web Site    |
//---------------------------------------------------------------------------------------------------------------
// Reusable_Test_Sequences/New_CAT_Search     |                 |                  |                             |
//                 /Scroll to Search Button   |    06/01/2020   |        DH        | Changes for NEW Web Site    |
//---------------------------------------------------------------------------------------------------------------
// Added Detection For NO LOOKUP Data and hndl|    21/02/2020   |        DH        |                             |
//---------------------------------------------------------------------------------------------------------------
// Priority Given to OLD Website Detection    |    21/02/2020   |        DH        | Time saving, will set back  |
//                                            |                 |                  | to LIVE, when OLD is binned |
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
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Setup'), [:], FailureHandling.OPTIONAL)
	//-----------------------------------------

	' Home Page validation Checks after COOKIE Dispelled'
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Home'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	
	'---------------------------------------'
	' Set and SEARCH TRADE CLASSIFICATION   |'
	'---------------------------------------'
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Enter_Trade_Classification'), [:], FailureHandling.CONTINUE_ON_FAILURE)

	'---------------------------------------'
	' Set and SEARCH TRADE LOCATION         |'
	'---------------------------------------'
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Enter_Trade_Location'), [:], FailureHandling.CONTINUE_ON_FAILURE)

	'---------------------------------------'
	' Scroll Search Button into View        |' // Reinstated for NEW Site
	'---------------------------------------'
	//WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Scroll_To_Search_Button'), [:], FailureHandling.CONTINUE_ON_FAILURE)

	'---------------------------------------'
	' Hit Search Button                     |'
	'---------------------------------------'
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Hit_Search_Button'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	
	'---------------------------------------'
	' Verify Returned Page is as Expected   |'
	'---------------------------------------'
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Verification'), [:], FailureHandling.STOP_ON_FAILURE)
	
	'--------------------------'
	' Teardown - CLose Browser |'
	'--------------------------'
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Teardown'), [:], FailureHandling.OPTIONAL)
	
	'--------------------------'
	' END                      |'
	'--------------------------'
}