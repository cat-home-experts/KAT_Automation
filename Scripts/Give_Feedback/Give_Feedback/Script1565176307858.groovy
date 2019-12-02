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
// Prove the function under the GIVE FEEDBACK |                 |                  |  Numorous issues correcting |
// header link, Verify each of the defined    |    07/08/2019   |     Dave Horne   |  SUNNY DAY ONLY             |
// areas is intact and available              |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
// Adding extra test coverage, non recommend  |                 |                  |  EXTENDED TO SUNNY DAY      |
// and the extra bits that this uncovers      |    28/08/2019   |     Dave Horne   |  DAY NEGATIVES              |
//---------------------------------------------------------------------------------------------------------------
// Extended again for Non Recommend but work  |                 |                  |                             |
// carried out or money exchanged hands. The  |    30/08/2019   |     Dave Horne   |                             |
// above combination returns a new Scores page|                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
// Hardening of all assets relating to these  |    03/09/2019   |     Dave Horne   |                             |
// Tests, after extending the dataset         |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
// Banner Image Test Flaky, Temp Removal      |    04/11/2019   |        DH        |    TODO                     |
//---------------------------------------------------------------------------------------------------------------
//
//---------------------------------------------------------------------------------------------------------------
//                                                                                                               |
//	GIVEN - The Chekatrade Website 'SEARCHPAGE' is Presented on a Client Device                                  |
//                                                                                                               |
//	WHEN -  We Click on 'GIVE FEEDBACK' from the header banner on the homepage                                   |
//                                                                                                               |
//  THEN -  The GIVE FEEDBACK PORTAL is presented to the user, an entry fied is presented for entering           | 
//          Traders name or CAT ID.                                                                              |
//                                                                                                               |
//---------------------------------------------------------------------------------------------------------------
//-----------------------------------------
// Call Setup Process - Browser Startup, Navigate, Maximize and Close Cookie Nagging Element
//-----------------------------------------
def data = findTestData('Data Files/Give_Feedback (1)')
def YE_Recommend
def YE_WorkCarriedOut

//--------------------------------------------------------------------------------------------------------------------
// This is the first test of the suite (currently), included this (delay) to give the tool to catch it's breath TODO |        WATCH THIS SNIPPIT
// WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Utils/Wait_a_bit'), [:], FailureHandling.OPTIONAL)     //   |
//--------------------------------------------------------------------------------------------------------------------
GlobalVariable.PAGE = "GiveFeedback"

'For Loop to Iterate over the test data provided by the Excel spreadsheet, \r\nassociated with this test\r\n'
for (GlobalVariable.row = 1; GlobalVariable.row <= findTestData('Give_Feedback (1)').getRowNumbers(); (GlobalVariable.row)++) {
    //def removed for globalisation
    WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Setup'), [:], FailureHandling.OPTIONAL)

    //-----------------------------------------
    '-----------------------------------------------------'
    ' Hit the <Give Feedback> link in the header banner   |'
    '-----------------------------------------------------'
    WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Banner_Menu/Give_Feedback'), [:], FailureHandling.CONTINUE_ON_FAILURE)

    '-----------------------------------------------------'
    ' Enter Member Trade Name OR Checkatrade ID To Review |'
    '-----------------------------------------------------'
    WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Give_Feedback/Which_Member_to_Review'), [:], FailureHandling.CONTINUE_ON_FAILURE)

    '--------------------------------------'
    ' Your Experience (page 1) Processing  |'
    '--------------------------------------'
    WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Give_Feedback/Your_Experience/Your_Experience'), [:], FailureHandling.CONTINUE_ON_FAILURE)

    '--------------------------------------'
    ' Your Scores (page 2) Processing      |'
    '--------------------------------------'//--------
	// Page is MISSED OUT When Recomendation == 'NO'  |
	//------------------------------------------------
	YE_Recommend = data.getValue("YE_Recommendations", GlobalVariable.row)
	YE_WorkCarriedOut = data.getValue("YE_Work_Carried_Out", GlobalVariable.row)
	'-------------------------------------------------'
	if (YE_Recommend == ("Yes")) {
		WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Give_Feedback/Your_Scores/Your_Scores'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	}
    '--------------------------------------'//--------------------------------------------------------------
	// NEW Scores Page is Returned If Recommendation == 'NO' BUT WORK CARRIED OT AND/OR MONEY CHANGED HANDS |
	//------------------------------------------------------------------------------------------------------
	if (YE_Recommend == ("No") && (YE_WorkCarriedOut == "Yes")) {
		WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Give_Feedback/Your_Scores/Your_Scores_Alt'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	}
	
	'--------------------------------------'
    ' Your Details (page 3) Processing     |'
    '--------------------------------------'
    WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Give_Feedback/Your_Details/Your_Details'), [:], FailureHandling.CONTINUE_ON_FAILURE)

    '--------------------------------------'
    ' Further Info (page 4) Processing     |'
    '--------------------------------------'
    WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Give_Feedback/Further_Infomation/Further_Information'), [:], FailureHandling.CONTINUE_ON_FAILURE)

	'--------------------------------------'
	' Thank You! (page 5) Processing       |'
	'--------------------------------------'
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Give_Feedback/Final_Page'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	
	'--------------------------------------'
	'  Verify Return to Home Page          |' // Refactored 29/08/2019
	'--------------------------------------'
	
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Home'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	
    '--------------------------------------'
    ' Processing Completion                |'
    //------------------------------------------------------------------------
    // * * * * * * *   WIP - Work in progress - todo TODO   * * * * * * *    |
    //------------------------------------------------------------------------
    '--------------------------------------'
    //WebUI.delay(10) // for debug
    '--------------------------'
    ' Teardown - CLose Browser |'
    '--------------------------'

    WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Teardown'), [:], FailureHandling.OPTIONAL)
    '--------------------------'
    ' END                      |'
    '--------------------------'
}