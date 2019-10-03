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
// TEST HISTORY HEADER - |  TODO
//-----------------------
// Any changes to this script, please update the next available row below, with date, in the DATE CREATED column,
// Your Name in the CREATED BY column, and Finaly, The actual change implemented in the NOTES column.
//
//---------------------------------------------------------------------------------------------------------------
//       Test Definition / Description        |   Date Created  |    Created By    |             Notes           |
//---------------------------------------------------------------------------------------------------------------
// Prove the function Under Members Area      |                 |                  |  Numorous issues correcting |
// URL Not as expected, preview-ma.ch*.com    |    10/09/2019   |     Dave Horne   |  SUNNY DAY ONLY             |
// areas is intact and available  (PREVIEW)   |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
// Stand Alone Test Created For Useful Docs   |                 |                  |             URL             |
// Functionality - From members Area          |    16/09/2019   |        DH        | checkatrade.com/other-useful|  TODO
// Integrity Checks                           |                 |                  |         -documents          |
//---------------------------------------------------------------------------------------------------------------
//                                            |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
//                                            |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
//                                            |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
'WARNING - Be AWARE that, for example, That the Members Area Link on Preview doesnt take you to Preview, but takes you to LIVE Members Area'
//---------------------------------------------------------------------------------------------------------------
//                                                                                                               |
//	GIVEN - TODO                      |
//                                                                                                               |
//	WHEN -  TODO  				      |
//                                                                                                               |
//  THEN -  TODO                      |
//                                                                                                               |
//---------------------------------------------------------------------------------------------------------------
// Specific Page Withing members That You Want To Visit
GlobalVariable.PAGE = "/other-useful-documents"

'For Loop to Iterate over the test data provided by the Excel spreadsheet, \r\nassociated with this test\r\n'
for (GlobalVariable.row = 1; GlobalVariable.row <= findTestData('Members_Test_Data').getRowNumbers(); (GlobalVariable.row)++) {
	
	//-----------------------------------------
	// Call Startup Process - Browser Startup |
	//-----------------------------------------
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Start_Up'), [:], FailureHandling.STOP_ON_FAILURE)
	//-----------------------------------------
	
	//-----------------------------------------
	// Log In to the Members Area             |
	//-----------------------------------------
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/log_On'), [:], FailureHandling.STOP_ON_FAILURE)
	//-----------------------------------------

	//-----------------------------------------
	// Navigate Useful Documents Page         |
	//-----------------------------------------
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Area_Menu/Your_Account/Useful_Documents'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	
	//-----------------------------------------
	// Confirm Data on Top - Documents Page   |
	//-----------------------------------------
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Validation/Useful_Documents'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	
	//-----------------------------------------
	// Log OFF the Members Area               |
	//-----------------------------------------
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Banner_Menu/log_Off'), [:], FailureHandling.STOP_ON_FAILURE)
}
///////////////////////////////////////
//                END                //   TODO
///////////////////////////////////////


