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
// Your Name in the CREATED BY column, and Finaly, The actual change implemented in the NOTES column.
//
//---------------------------------------------------------------------------------------------------------------
//       Test Definition / Description        |   Date Created  |    Created By    |             Notes           |
//---------------------------------------------------------------------------------------------------------------
// Prove the function Under Members Area      |                 |                  |  Numorous issues correcting |
// URL Not as expected, preview-ma.ch*.com    |    10/09/2019   |     Dave Horne   |  SUNNY DAY ONLY             |
// areas is intact and available  (PREVIEW)   |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
// Stand Alone Test Created For My Feedback   |                 |                  |             URL             |
// Functionality - From members Area          |    16/09/2019   |        DH        | checkatrade.com/my-feedback |
// Integrity Checks                           |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
// Created URL_Handler to Enable Members Tests|    23/09/2019   |        DH        | Details are in URL_Handler  |
// To Run Across All Environments             |                 |                  | (Located in Reusables)      |
//---------------------------------------------------------------------------------------------------------------
//                                            |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
//                                            |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
'WARNING - Be AWARE that, for example, That the Members Area Link on Preview doesnt take you to Preview, but takes you to LIVE Members Area'

'THIS CURRENTLY ONLY RUNS FROM - - -  * * *  PREVIEW_MEMBERS_AREA Profile  * * * '
//---------------------------------------------------------------------------------------------------------------
//                                                                                                               |
//	GIVEN - TODO                      |
//                                                                                                               |
//	WHEN -  TODO  				      |
//                                                                                                               |
//  THEN -  TODO                      |
//                                                                                                               |
//---------------------------------------------------------------------------------------------------------------

'######################################################################################################################################################'
'#  OF COURSE, FOR THIS TO WORK THE TEST CREDENTIALS SHOULD BE AVAILABLE ACROSS ALL ENVIRONMENTS - Username = check1234 - & - Password = testing123   #'
'######################################################################################################################################################'

// POTENTIALLY :-) NOW WORKS ON ANY ENVIRONMENT
// Specific Page Withing Members That You Want To Visit
// GlobalVariable.PAGE = "/my-feedback"
// Members Area - Notification to the Startup Process and URL_Handler
// GlobalVariable.Portal_Subfunction = "members"
//---------------------------------------------------------------------------------------------------------------

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
	// Navigate My_Feedback Page              |
	//-----------------------------------------
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Area_Menu/Your_Customers/My_Feedback'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	
	//-----------------------------------------
	// Confirm Data on Top - My_Feedback Page |
	//-----------------------------------------
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Validation/My_Feedback'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	
	//-----------------------------------------
	// Navigate to Remind Cutomers - Sub Tab  |
	//-----------------------------------------
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Area_Menu/Your_Customers/Feedback/Remind_Customer'), [:], FailureHandling.STOP_ON_FAILURE)
	
	//-----------------------------------------
	// Verify Content on Remind Customers Page|
	//-----------------------------------------
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Validation/Remind_Customers'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	
	//-----------------------------------------
	// Navigate to Your Customers - Sub Tab   |
	//-----------------------------------------
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Area_Menu/Your_Customers/Feedback/Your_Customers'), [:], FailureHandling.STOP_ON_FAILURE)
	
	//-----------------------------------------
	// Verify Content on Your Customers Page  |
	//-----------------------------------------
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Validation/Your_Customers'), [:], FailureHandling.CONTINUE_ON_FAILURE)

	//-----------------------------------------
	// Navigate to Awareness - Sub Tab        |
	//-----------------------------------------
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Area_Menu/Your_Customers/Feedback/Awareness'), [:], FailureHandling.STOP_ON_FAILURE)
	                                 
	//-----------------------------------------
	// Verify Content on Awareness Page       |
	//-----------------------------------------	
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Validation/Awareness'), [:], FailureHandling.CONTINUE_ON_FAILURE)

	//-----------------------------------------
	// Navigate to Remind Cutomers - Sub Tab  |
	//-----------------------------------------
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Area_Menu/Your_Customers/Feedback/Remind_Customer'), [:], FailureHandling.STOP_ON_FAILURE)
	
	//-----------------------------------------
	// Send Reminder From Remind Customers Pag|
	//-----------------------------------------
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Area_Menu/Your_Customers/Feedback/Remind_Customer_Sent'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	
	//-------------------------------------------------
	// Navigate back to Published Feedback - Sub Tab  | // Back to Default tab
	//-------------------------------------------------
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Area_Menu/Your_Customers/Feedback/Published_Feedback'), [:], FailureHandling.STOP_ON_FAILURE)

	//-------------------------------------------------
	// Search and Verify Returned Feedback Search Data| 
	//-------------------------------------------------
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Area_Menu/Your_Customers/Feedback/Published_Feedback_Search'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	
	//-----------------------------------------
	// Log OFF the Members Area               |
	//-----------------------------------------
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Banner_Menu/log_Off'), [:], FailureHandling.STOP_ON_FAILURE)
}
///////////////////////////////////////
//                END                //
///////////////////////////////////////