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
// Prove the function under the GIVE FEEDBACK |                 |                  |                             |
// header link, Verify each of the defined    |    07/08/2019   |     Dave Horne   |                             |
// areas is intact and available              |                 |                  |                             |
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
//	WHEN -  We Click on 'GIVE FEEDBACK' from the header banner on the homepage                                   |
//                                                                                                               |
//  THEN -  The GIVE FEEDBACK PORTAL is presented to the user, an entry fied is presented for entering           |
//          Traders name or CAT ID.                                                                              |
//                                                                                                               |
//---------------------------------------------------------------------------------------------------------------

//-----------------------------------------
// Call Setup Process - Browser Startup, Navigate, Maximize and Close Cookie Nagging Element
//-----------------------------------------
'For Loop to Iterate over the test data provided by the Excel spreadsheet, \r\nassociated with this test\r\n   --------------------------------------------------------' 
for (GlobalVariable.row = 1; GlobalVariable.row <= findTestData('Give_Feedback (1)').getRowNumbers(); (GlobalVariable.row)++) {  // Will Only use the first row for validation purposes  |
    //def removed for globalisation                                                                            '-------------------------------------------------------'
    WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Setup_Old'), [:], FailureHandling.STOP_ON_FAILURE)

    //-----------------------------------------
    '-----------------------------------------------------'
    ' Hit the <Give Feedback> link in the header banner   |'
    '-----------------------------------------------------'
    WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Banner_Menu/Give_Feedback'), [:], FailureHandling.CONTINUE_ON_FAILURE)

    '-----------------------------------------------------'
    ' Enter Member Trade Name OR Checkatrade ID To Review |'
    '-----------------------------------------------------'
    WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Give_Feedback/Which_Member_to_Review'), [:], FailureHandling.STOP_ON_FAILURE)

	'--------------------------------------'
	' Your Experience (page 1) Validation  |'
	'--------------------------------------'
	'--------------------------------------'
    ' Your Experience (page 1) Processing  |'
    '--------------------------------------'
    WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Give_Feedback/Your_Experience/Your_Experience_Validation'), [:], FailureHandling.CONTINUE_ON_FAILURE)

	'--------------------------------------'
	' Your Scores (page 2) Validation      |'
	'--------------------------------------'
    '--------------------------------------'
    ' Your Scores (page 2) Processing      |'
    '--------------------------------------'
    WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Give_Feedback/Your_Scores/Your_Scores_Validation'), [:], FailureHandling.CONTINUE_ON_FAILURE)

    '--------------------------------------'
    ' Your Scores (page 3) Processing      |'
    '--------------------------------------'
    WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Give_Feedback/Your_Details/Your_Details_Validation'), [:], FailureHandling.CONTINUE_ON_FAILURE)

    '--------------------------------------'
    ' Further Info (page 4) Processing     |'                        // No Validation on Give Your Feedback (Value of Work) Page
    '--------------------------------------'
    WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Give_Feedback/Further_Infomation/Further_Infomation_Validation'), [:], FailureHandling.CONTINUE_ON_FAILURE)

	'--------------------------------------'
	' Thank You! (page 5) Processing       |'
	'--------------------------------------'
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Give_Feedback/Final_Page'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	
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

    WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Teardown'), [:], FailureHandling.STOP_ON_FAILURE)
	
	'--------------------------'
	' Break Out of FOR Loop    |' // FOr Validation, Only need to validate on the first DataPool Iteration
	'--------------------------'
	
	if (GlobalVariable.row > 1){
		break;
	}
	
    '--------------------------'
    ' END                      |'
    '--------------------------'
}