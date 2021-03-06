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
// Only validate on one DataSet for obvious R |    04/09/2019   |     Dave Horne   |                             |
//---------------------------------------------------------------------------------------------------------------
// Added <HOMEOWNER> Step - Due To Method Chge|    26/02/2020   |        DH        |                             |
//---------------------------------------------------------------------------------------------------------------
// Also Changed The User Account to 443671    |                 |                  |    Test Account Hardwierd   |
// As The Original TEST ACCOUNT was Dropped?  |    26/02/2020   |        DH        |    on FINAL PAGE Verify     |
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
//  THEN -  The GIVE FEEDBACK PORTAL is presented to the user, an entry field is presented for entering          |
//          Traders name or CAT ID.                                                                              |
//                                                                                                               |
//---------------------------------------------------------------------------------------------------------------
'-----------------------------------------------------------------'
'Run as a Suite, this is ignored, stand alone, then this applies  |'
'-----------------------------------------------------------------'
'Withdrawn'
//if (!GlobalVariable.PAGE == "GiveFeedback"){
//	GlobalVariable.PAGE = "GiveFeedback" // inherited from last test
//	GlobalVariable.URL = GlobalVariable.URL+GlobalVariable.PAGE
//} 
//GlobalVariable.PAGE = ""
//GlobalVariable.PAGE = "GiveFeedback"
//GlobalVariable.URL = GlobalVariable.URL+GlobalVariable.PAGE
'------------------------------------------------------------'
//-----------------------------------------
// Call Setup Process - Browser Startup, Navigate, Maximize and Close Cookie Nagging Element
//-----------------------------------------
'For Loop to Iterate over the test data provided by the Excel spreadsheet, \r\nassociated with this test\r\n   --------------------------------------------------------' 
for (GlobalVariable.row = 1; GlobalVariable.row <= findTestData('Give_Feedback (1)').getRowNumbers(); (GlobalVariable.row)++) {  // Will Only use the first row for validation purposes  |
    //def removed for globalisation                                                                            '-------------------------------------------------------'
    
	//-----------------------------------------
	'--------------------------'
	' Break Out of FOR Loop    |' // FOr Validation, Only need to validate on the first DataPool Iteration
	'--------------------------'
	if (GlobalVariable.row > 1){
		break;
	}
	
	// StartUp Sequence
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Setup'), [:], FailureHandling.STOP_ON_FAILURE)

	'-----------------------------------------------------'
	' Hit the <HomeOwner> link in the header banner   |'
	'-----------------------------------------------------'
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Banner_Menu/HomeOwner'), [:], FailureHandling.STOP_ON_FAILURE)
	
    '-----------------------------------------------------'
    ' Hit the <Give Feedback> link in the header banner   |'
    '-----------------------------------------------------'
    WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Banner_Menu/Give_Feedback'), [:], FailureHandling.STOP_ON_FAILURE)

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
    WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Give_Feedback/Your_Experience/Your_Experience_Validation'), [:], FailureHandling.STOP_ON_FAILURE)

	'--------------------------------------'
	' Your Scores (page 2) Validation      |'
	'--------------------------------------'
    '--------------------------------------'
    ' Your Scores (page 2) Processing      |'
    '--------------------------------------'
    WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Give_Feedback/Your_Scores/Your_Scores_Validation'), [:], FailureHandling.STOP_ON_FAILURE)

    '--------------------------------------'
    ' Your Scores (page 3) Processing      |'
    '--------------------------------------'
    WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Give_Feedback/Your_Details/Your_Details_Validation'), [:], FailureHandling.STOP_ON_FAILURE)

    '--------------------------------------'
    ' Further Info (page 4) Processing     |'                        // No Validation on Give Your Feedback (Value of Work) Page
    '--------------------------------------'
    WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Give_Feedback/Further_Infomation/Further_Infomation_Validation'), [:], FailureHandling.STOP_ON_FAILURE)

	'--------------------------------------'
	' Thank You! (page 5) Processing       |'
	'--------------------------------------'
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Give_Feedback/Final_Page'), [:], FailureHandling.STOP_ON_FAILURE)
	
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