import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
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
//  WO/Sales Area/Consultancy Questions Page  |    16/03/2020   |        DH        |           WIP               |
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
//	GIVEN -  With Web Office Open                                                                                |
//                                                                                                               |
//	WHEN - We CLICK on the <SALES AREA> menu Item (Top Level) - Then <Consultancy Questions> Sub Menu            |
//                                                                                                               |
//  THEN - Verify Details of the RETURNED Page are As Expected                                                   |
//                                                                                                               |
//---------------------------------------------------------------------------------------------------------------


WebUI.waitForPageLoad(60)
//WebUI.waitForElementVisible(findTestObject('Object Repository/WO_Consumer/Page_/Edit_Consumer_SAVE_Button'), 60)
WebUI.delay(1)

	// Header
	'----------------------------------------------'
	WebUI.verifyTextPresent("Consultancy Questions", false)
	'----------------------------------------------'
	// Buttons
	WebUI.verifyTextPresent("Add new section", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Save changes", false)
	'----------------------------------------------'
	
	// Sub Header
	WebUI.verifyTextPresent("Configure the consultancy questions that are listed on the sales area screen", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Edit the consultancy questions and re-order them", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Questions can be marked as hidden from the sales area screen or can be deleted permenantly", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent('You can add new sections and related questions', false)
	'----------------------------------------------'
	WebUI.verifyTextPresent('All changes will take effect when you click "Save Changes"', false)
	'----------------------------------------------'

	// Table Header
	WebUI.verifyTextPresent("Is displayed", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Question Description", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("ID", false)
	'----------------------------------------------'
	
//	// Selective Table Content How did you hear about us
//	WebUI.verifyTextPresent("How did you hear about us", false)
//	'----------------------------------------------'
//	WebUI.verifyTextPresent("Is your business where you want it to be", false)
//	'----------------------------------------------'
//	WebUI.verifyTextPresent("How long have you been trading", false)
//	'----------------------------------------------'

	
	// Only Pick 2 Items From The List (Attempt at Robustness of Test (NA)
	//WebUI.verifyTextPresent("You control the trade category and the distance you travel", false)
	'----------------------------------------------'
	//WebUI.verifyTextPresent("Membership Advisor to help you achieve success", false)
	'----------------------------------------------'


'--------------------------------'
'           END                  |'
'--------------------------------'
