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

WebUI.openBrowser('')

//-----------------------
// TEST HISTORY HEADER - |                                                                                                               |
//-----------------------
// Any changes to this script, please update the next available row below, with date, in the DATE CREATED column,
// Your NAme in the CREATED BY column, and Finaly, The actual change implemented in the NOTES column.
//
//---------------------------------------------------------------------------------------------------------------
//       Test Definition / Description        |   Date Created  |    Created By    |             Notes           |
//---------------------------------------------------------------------------------------------------------------
// Test to FORM FILL, Field Validation, of the|                 |                  |                             |
// TRADE (Membership Application Form)        |    01/08/2019   |    Dave Horne    |  SUNNY DAY Scenario         |
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
//---------------------------------------------------------------------------------------------------------------
//                                                                                                               |
//	GIVEN - The Chekatrade Website 'HOMEPAGE' is Presented on a Client Device                                    |
//                                                                                                               |
//	WHEN -  We Click on the 'TRADES APPLY HERE' Button - THEN a trades application form is presented             |
//                                                                                                               |
//  AND  -  We attemt to commit the application form (FILL) with NO DATA and Partially Set Incorrect Form Data   |
//                                                                                                               |
//  THEN -  Various prompts will be displayed, This field is required, Please enter a valid email address, etc.. |
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
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/TRADES_Application/Hit_Signup'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	
	'---------------------------------------------------------------------------'
	' Hit the <SUBMIT> Button  | Attempt a COMMITAL of form with no data filled |'
	'---------------------------------------------------------------------------'
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/TRADES_Application/Hit_Submit'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	
	'--------------------------------------------------'
	' Check initial Validation Message(s) are Produced |'
	'--------------------------------------------------'
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/TRADES_Application/Validation/This_Field_Is_Required'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	
	'--------------------------------------'
	' Set - Email Address Incorrect Form   |'
	'--------------------------------------'
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/TRADES_Application/Set_Invalid_Email_Address'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	
	'--------------------------------------'
	' Check Email Validation Message       |'
	'--------------------------------------'
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/TRADES_Application/Validation/Please_Enter_Valid_Email'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		
	'--------------------------'
	' Set - Email Address      |'
	'--------------------------'
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/TRADES_Application/Set_Email_Address'), [:], FailureHandling.CONTINUE_ON_FAILURE)

	'---------------------------------------'
	' Set - Company Name Validation Message |'
	'---------------------------------------'
	WebUI.delay(10)
//	'--------------------------'
//	' Set - Company Name       |'
//	'--------------------------'
//	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/TRADES_Application/Set_Company_Name'), [:], FailureHandling.CONTINUE_ON_FAILURE)
//
//	
//WebUI.click(findTestObject('Object Repository/Page_Checkatrade Want to build your business/input_membership terms and conditions_ctl00contentbtnSubmit'))
//
//WebUI.verifyTextPresent('This field is required', false)
//
//WebUI.setText(findTestObject('Object Repository/Page_Checkatrade Want to build your business/input_Email Address_ctl00contenttbContactEmail'), 
//    'billy bob')
//
//WebUI.verifyTextPresent('Please enter a valid email address', false)
//
//WebUI.setText(findTestObject('Object Repository/Page_Checkatrade Want to build your business/input_Company Name_ctl00contenttbCompanyName'), 
//    '')
//
//WebUI.setText(findTestObject('Object Repository/Page_Checkatrade Want to build your business/input_Email Address_ctl00contenttbContactEmail'), 
//    'billy_bob@gstring.com')
//
//WebUI.setText(findTestObject('Object Repository/Page_Checkatrade Want to build your business/input_Company Name_ctl00contenttbCompanyName'), 
//    'ACompanyName')
//
//WebUI.setText(findTestObject('Object Repository/Page_Checkatrade Want to build your business/input_Your Full Name_ctl00contenttbContactName'), 
//    'a')
//
//WebUI.setText(findTestObject('Object Repository/Page_Checkatrade Want to build your business/input_Trade Category_join-now__category_autocomplete_input'), 
//    'arthuritise')
//
//WebUI.verifyTextPresent('Sorry, no results found', false)
//
//WebUI.setText(findTestObject('Object Repository/Page_Checkatrade Want to build your business/input_Trade Category_join-now__category_autocomplete_input'), 
//    'Scaffolde')
//
//WebUI.click(findTestObject('Object Repository/Page_Checkatrade Want to build your business/a_Scaffolder'))
//
//WebUI.setText(findTestObject('Object Repository/Page_Checkatrade Want to build your business/input_Trade Category_join-now__category_autocomplete_input'), 
//    'Scaffolder')
//
//WebUI.click(findTestObject('Object Repository/Page_Checkatrade Want to build your business/a_Scaffolder'))
//
//WebUI.setText(findTestObject('Object Repository/Page_Checkatrade Want to build your business/input_Trade Category_join-now__category_autocomplete_input'), 
//    'Scaffolder')
//
//WebUI.click(findTestObject('Object Repository/Page_Checkatrade Want to build your business/b_Scaffolder'))
//
//WebUI.setText(findTestObject('Object Repository/Page_Checkatrade Want to build your business/input_Postcode_ctl00contenttbPostCode'), 
//    'ffffff')
//
//WebUI.setText(findTestObject('Object Repository/Page_Checkatrade Want to build your business/input_Contact Number_ctl00contenttbContactMob'), 
//    'gggg')
//
//WebUI.verifyTextPresent('', false)
//
//WebUI.setText(findTestObject('Object Repository/Page_Checkatrade Want to build your business/input_Contact Number_ctl00contenttbContactMob'), 
//    '02380223344')
//
//WebUI.click(findTestObject('Object Repository/Page_Checkatrade Want to build your business/input_membership terms and conditions_ctl00contentbtnSubmit'))

