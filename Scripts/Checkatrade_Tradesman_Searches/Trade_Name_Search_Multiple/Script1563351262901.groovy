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
import com.sun.media.sound.SoftReverb.Delay as Delay
import internal.GlobalVariable as GlobalVariable
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
// Test to confirm that the correct detail is |                 |                  | Single Searches Undertaken|
// returned for given 'Trade Name' OR CAT ID  |    13/07/2019   |     Dave Horne   | Using External Test Data    |
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
//
//---------------------------------------------------------------------------------------------------------------
//                                                                                                               |
//	GIVEN - The Chekatrade Website 'SEARCHPAGE' is Presented on a Client Device                                  |
//                                                                                                               |
//	WHEN -  We Click on 'look up member by name' Below the Trade entry Text box                                  |
//                                                                                                               |
//	AND  -	We Enter The Traders 'Business Name' OR 'CAT ID' as Search Criteria and Hit SEARCH                   |
//                                                                                                               |
//  THEN -  The Resulting Search Results Page is Returned, Along With a Valid Result                             |
//                                                                                                               |
//---------------------------------------------------------------------------------------------------------------

'For Loop to Iterate over the test data provided by the Excel spreadsheet, \r\nassociated with this test'
for (GlobalVariable.row = 1; GlobalVariable.row <= findTestData('Search_CAT_ID_Data (1)').getRowNumbers(); GlobalVariable.row++) {
    //-----------------------------------------
    // Call Setup Process - Browser Startup, Navigate, Maximize and Close Cookie Nagging Element
    //-----------------------------------------
    WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Setup'), [:], FailureHandling.STOP_ON_FAILURE)
	
	' Home Page validation Checks after COOKIE Dispelled'
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Home'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	
	'---------------------------------------------------------------------'
	' Select Search on Trader Name (or ID) From Home page/Search Screen   |'
	'---------------------------------------------------------------------'
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Click_Search_Trade_Name'), [:], FailureHandling.CONTINUE_ON_FAILURE)

	'---------------------------------------'
	' Enter Trader Name (or ID) to Search   |'
	'---------------------------------------'
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Enter_Trade_Name'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	
	'---------------------------------------'
	' Search Trader Name (or ID)            |'
	'---------------------------------------'
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Search_Trade_Name'), [:], FailureHandling.CONTINUE_ON_FAILURE)

	'------------------------------------------'
	' Scroll to Page Footer to Reveal Results  |'
	'------------------------------------------'
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Scroll_to_Footer'), [:], FailureHandling.CONTINUE_ON_FAILURE)

	'------------------------------------------'
	' Verify Correct Location is Returned     |'
	'------------------------------------------'
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Verification_Location'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		
	'------------------------------------------'
	' Verify Primary Contact is Returned     |'
	'------------------------------------------'
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Verification_Primary_Contact'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	
	'--------------------------'
	' Teardown - CLose Browser |'
	'--------------------------'
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Teardown'), [:], FailureHandling.OPTIONAL)

	'--------------------------'
	' END                      |'
	'--------------------------'
}

