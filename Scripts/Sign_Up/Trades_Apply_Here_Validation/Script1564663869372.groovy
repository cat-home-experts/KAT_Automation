import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.interactions.Pause
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
import com.kms.katalon.core.util.KeywordUtil
/*import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;*/

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
//  AND  -  We attemt to commit the application form (FILL) with NO DATA and Partially Set Incorrect Form Data   |
//                                                                                                               |
//  THEN -  Various prompts will be displayed, This field is required, Please enter a valid email address, etc.. |
//                                                                                                               |
//---------------------------------------------------------------------------------------------------------------

    //-----------------------------------------
	// Call Startup Process - Browser Startup, Navigate, Maximize and Close Cookie Nagging Element
	//-----------------------------------------
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Setup'), [:], FailureHandling.OPTIONAL)
	//-----------------------------------------
	'--------------------------------------'
	' Hit the <TRADES, APPLY HERE> Button  |'
	'--------------------------------------'
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/TRADES_Application/Hit_Signup'), [:], FailureHandling.OPTIONAL)
	
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
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/TRADES_Application/Set_INVALID_Email_Address'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	
	'--------------------------------------'
	' Check Email Validation Message       |'
	'--------------------------------------'
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/TRADES_Application/Validation/Please_Enter_Valid_Email'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	WebUI.delay(5)	
	'--------------------------'
	' Set - Email Address      |'
	'--------------------------'
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/TRADES_Application/Set_Email_Address'), [:], FailureHandling.CONTINUE_ON_FAILURE)

	'---------------------------------------------------------------------------------'
	' FIll Remaining Empty Fields With Random Data - To Elicit Validation Message(s)  |'
	'---------------------------------------------------------------------------------'
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/TRADES_Application/Set_Random_Data_In_Empty_Fields'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	
	'---------------------------------------------'
	' Check Trade Category Validation Message     |'
	'---------------------------------------------'
	//WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/TRADES_Application/Validation/Sorry_No_Results_Found'), [:], FailureHandling.CONTINUE_ON_FAILURE)

	'---------------------------------------------------------'
	' Check specify a valid phone number Validation Message   |'
	'---------------------------------------------------------'
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/TRADES_Application/Validation/Please_Specify_Valid_Phone_Number'), [:], FailureHandling.CONTINUE_ON_FAILURE)

	'---------------------------------------------------------'
	' Check Remaining Fields with NULL Data Validation Message|'
	'---------------------------------------------------------'
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/TRADES_Application/Set_NULL_Data_In_Fields_Containing_Invalid_Data'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	
	'--------------------------------------------------'
	' Check initial Validation Message(s) are Produced |' // should be 5 of these
	'--------------------------------------------------'
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/TRADES_Application/Validation/This_Field_Is_Required'), [:], FailureHandling.CONTINUE_ON_FAILURE)

	// Proceed to add the remaining 5 items and commit
	
	'--------------------------'
	' Set - Company Name       |'
	'--------------------------'
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/TRADES_Application/Set_Company_Name'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	
	'--------------------------'
	' Set - Full Name          |'
	'--------------------------'
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/TRADES_Application/Set_Full_Name'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	
	'--------------------------'
	' Set - Trade Category     |'// Changes 04/09/2019 - removed this field
	'--------------------------'
	//WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/TRADES_Application/Set_Trade_Category'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	
	'--------------------------'
	' lookup - Trade Category  |'// Changes 04/09/2019 - removed this field
	'--------------------------'
	//WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/TRADES_Application/Lookup_Trade_Category'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	
	'--------------------------'
	' Postcode Prompt          |'// Changes 04/09/2019 - removed this prompt
	'--------------------------'
	//WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/TRADES_Application/Postcode_Prompt'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	
	'--------------------------'
	' Set - Postcode           |'
	'--------------------------'
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/TRADES_Application/Set_Postcode'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	
	'--------------------------'
	' Set - Contact Number     |'
	'--------------------------'
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/TRADES_Application/Set_Contact_Number'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	
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

	'5 fields reporting "This field is required'
	
	//WebDriver driver;
	//int size = driver.findElements(By.xpath("//*[text()='This field is required']")).size();
	
	//KeywordUtil.markWarning('This field is required appears!'+ size +'times, as expected')
	
	//WebUI.delay(50)
	
	KeywordUtil.markWarning('No Validation of POSTCODE apart from NULL Entry Check! * FOR INRORMATION ONLY *')
	KeywordUtil.markWarning('No Validation of COMPANY NAME apart from NULL Entry Check! * FOR INRORMATION ONLY *')
	KeywordUtil.markWarning('No Validation of YOUR FULL NAME apart from NULL Entry Check! * FOR INRORMATION ONLY *')

/////////////////////////
// END                 //
/////////////////////////