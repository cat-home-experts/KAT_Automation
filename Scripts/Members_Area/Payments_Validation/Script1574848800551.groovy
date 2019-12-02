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
// Prove the function Under Members Area      |                 |                  |                             |
// Your Account - Payments- Validate Input    |    27/11/2019   |        DH        |                             |
// New Implementation                         |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
//                                            |                 |                  |                             |
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
//GlobalVariable.PAGE = "N/A" //Live - https://www.payatrader.com/hhpt_specific_trader.php?tid=1061477&name=Checkatrade%20HQ%20-%20TRAINING/TEST%20PAGE%20&reference=218630

'For Loop to Iterate over the test data provided by the Excel spreadsheet, \r\nassociated with this test\r\n'
for (GlobalVariable.row = 1; GlobalVariable.row <= findTestData('Payments_Data').getRowNumbers(); (GlobalVariable.row)++) {
	
	//-----------------------------------------
	// Call Startup Process - Browser Startup |
	//-----------------------------------------
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Start_Up'), [:], FailureHandling.STOP_ON_FAILURE)
	//-----------------------------------------
	
	//-----------------------------------------
	// Log In to the Members Area             |
	//-----------------------------------------
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/log_On'), [:], FailureHandling.OPTIONAL)
	//-----------------------------------------

	//-----------------------------------------
	// Navigate Payments Documents Page       |
	//-----------------------------------------
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Area_Menu/Your_Account/Payments'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	
	//-----------------------------------------
	// Confirm Data Entry Conforms             |
	//-----------------------------------------
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Validation/Payments/Payments_Field_Validation'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	
	//-----------------------------------------
	// Make Payment - Welcome Page Validation |
	//            and Settings                |
	//-----------------------------------------
	//WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Area_Menu/Your_Account/My_Payments/PayaTrader'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	
	'---------------------------------------------------------------------------------------------------------------------------'
	' External Website for Payments - So Stop at this point - We have connfirmed payments infrastructure is available to CAT    |'
	'---------------------------------------------------------------------------------------------------------------------------'
	
	//-----------------------------------------
	// Make Payment - Card Details page       |
	//-----------------------------------------
	// WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Area_Menu/Your_Account/My_Payments/PayTrader_Card'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	
	//-----------------------------------------
	// Payment Confirm page                   |
	//-----------------------------------------
	//WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Area_Menu/Your_Account/My_Payments/PayaTrader_Confirm'), [:], FailureHandling.CONTINUE_ON_FAILURE)

	//-----------------------------------------
	// Payment Portal resopns                 |
	//-----------------------------------------
	//WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Area_Menu/Your_Account/My_Payments/PayaTrader_Decline'), [:], FailureHandling.CONTINUE_ON_FAILURE)

	
	// Will Terminate the Test at this POINT :-)
	
	
	
	// https://www.payatrader.com/hhpt_specific_trader.php?tid=1061477&name=Checkatrade%20HQ%20-%20TRAINING/TEST%20PAGE%20&reference=218630
	
	'--------------------------'
	' Teardown - CLose Browser |'
	'--------------------------'
	
	' THIS MEMBERS TEST IS UNIQUE REGARDS SHUTDOWN - ALL THE OTHER MEMBERS TESTS LOG-OFF, THIS TEST USES CAT TEARDOWN TO CLOSE (there are 2 Browser Instances Present, CAT + Payment)'
	'So The Easy Option is to call CAT'
	//-----------------------------------------
	// Log OFF the Members Area               |
	//-----------------------------------------
	//WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Banner_Menu/log_Off'), [:], FailureHandling.OPTIONAL)

	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Teardown'), [:], FailureHandling.OPTIONAL)
	 
}
///////////////////////////////////////
//                END                //   
///////////////////////////////////////