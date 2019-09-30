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
// Test to FORM FILL, of TRADE (Membership    |                 |                  |                             |
// Application - Confirming the CONGRATS      |    30/07/2019   |    Dave Horne    |  SUNNY DAY Scenario         |
// Message text is presented after form submit|                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
// Trade Category is Removed - Test Commented |    04/09/2019   |    Dave Horne    |  SUNNY DAY Scenario         |
//---------------------------------------------------------------------------------------------------------------
// Postcode Entry Type Also Changed, Commented|                 |                  |                             |
// Renewed - added new with extension 04092019|    04/09/2019   |    Dave Horne    |  SUNNY DAY Scenario         |
//---------------------------------------------------------------------------------------------------------------
// Full Name Field XPATH change, Dev UI Rework|    30/09/2019   |        DH        |                             |
//---------------------------------------------------------------------------------------------------------------
//                                            |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------
//                                                                                                               |
//	GIVEN - The Chekatrade Website 'HOMEPAGE' is Presented on a Client Device                                    |
//                                                                                                               |
//	WHEN -  We Click on the 'TRADES APPLY HERE' Button - THEN a trades application form is presented             |
//                                                                                                               |
//  AND  -  We complete the application form (FILL) and HIT Submit                                               |
//                                                                                                               |
//  THEN -  A CONGRATULATIONS salutation is presented (confirming you application is being processed             |
//                                                                                                               |
//---------------------------------------------------------------------------------------------------------------

    //-----------------------------------------
	// Call Startup Process - Browser Startup, Navigate, Maximize and Close Cookie Nagging Element
	//-----------------------------------------
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Setup'), [:], FailureHandling.STOP_ON_FAILURE)
	//-----------------------------------------
	'--------------------------------------'
	' Hit the <TRADES, APPLY HERE> Button  |'
	'--------------------------------------'
	//WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/TRADES_Application/Hit_Signup'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Banner_Menu/Trades_Apply_Here'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	
	'--------------------------'
	' Set - Full Name          |'
	'--------------------------'
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/TRADES_Application/Set_Full_Name'), [:], FailureHandling.CONTINUE_ON_FAILURE)

	'--------------------------'
	' Set - Email Address      |'
	'--------------------------'
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/TRADES_Application/Set_Email_Address'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	
	'--------------------------'
	' Set - Company Name       |'
	'--------------------------'
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/TRADES_Application/Set_Company_Name'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		
	'--------------------------'
	' Set - Trade Category     |' // Field removed from View 31/07/2019
	'--------------------------'
	//WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/TRADES_Application/Set_Trade_Category'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	
	'--------------------------'
	' lookup - Trade Category  |' // Field removed from View 31/07/2019
	'--------------------------'
	//WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/TRADES_Application/Lookup_Trade_Category'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	
	'--------------------------'
	' Postcode Prompt          |'  // Field removed from View 31/07/2019
	'--------------------------'
	//WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/TRADES_Application/Postcode_Prompt'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	
	'--------------------------'
	' Set - Postcode           |' // See Below
	'--------------------------'
	//WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/TRADES_Application/Set_Postcode'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	
	'--------------------------'
	' Set - Contact Number     |'
	'--------------------------'
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/TRADES_Application/Set_Contact_Number'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	
	'--------------------------'
	' Set - Postcode NEW       |'
	'--------------------------'
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/TRADES_Application/Set_Postcode'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	
	'--------------------------'
	' Hit the <SUBMIT> Button  |'
	'--------------------------'
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/TRADES_Application/Hit_Submit'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	
	'---------------------------------------------------'
	'Verify CONGRATULATIONS is reported after form fill '
	'---------------------------------------------------'
    WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/TRADES_Application/Congratulations_Reported'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	
	'--------------------------'
	' Teardown - CLose Browser |'
	'--------------------------'
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Teardown'), [:], FailureHandling.STOP_ON_FAILURE)
	
	'-------------------------------------------'
	' Web Office Call to Ensure NEW CASE Opened |'
	'-------------------------------------------'
	
	'------'
	'TODO  |'
	'------'
	
	WebUI.callTestCase(findTestCase('Web_Office/Case_Opened'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	
	'--------------------------'
	' END                      |'
	'--------------------------'
