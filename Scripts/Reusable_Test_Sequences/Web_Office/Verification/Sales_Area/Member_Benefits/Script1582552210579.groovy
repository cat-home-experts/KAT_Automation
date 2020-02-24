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
//  WO/Sales Area/Members Benefits Page Verify|    24/02/2020   |        DH        |                             |
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
//	WHEN - We CLICK on the <SALES AREA> menu Item (Top Level) - Then MEMBER BENEFITS Sub Menu                    |
//                                                                                                               |
//  THEN - Verify Details of the RETURNED Page are As Expected                                                   |
//                                                                                                               |
//---------------------------------------------------------------------------------------------------------------


WebUI.waitForPageLoad(60)
//WebUI.waitForElementVisible(findTestObject('Object Repository/WO_Consumer/Page_/Edit_Consumer_SAVE_Button'), 60)
WebUI.delay(1)

	// Header
	'----------------------------------------------'
	WebUI.verifyTextPresent("Member Benefits", false)
	'----------------------------------------------'
	// Buttons
	WebUI.verifyTextPresent("Add New...", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Save Changes", false)
	'----------------------------------------------'
	
	// Sub Header
	WebUI.verifyTextPresent("Configure the Member Benefits that are listed on the Sales Area screen", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Edit the member benefit descriptions and re-order them", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Benefits can be marked as hidden from the Sales Area screen or can be deleted permenantly", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent('All changes will take effect when you click "Save Changes"', false)
	'----------------------------------------------'
	
	// Table Header
	WebUI.verifyTextPresent("ID", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Is Displayed", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Member Benefit Description", false)
	'----------------------------------------------'
	
	// Only Pick 2 Items From The List (Attempt at Robustness of Test (NA)
	//WebUI.verifyTextPresent("You control the trade category and the distance you travel", false)
	'----------------------------------------------'
	//WebUI.verifyTextPresent("Membership Advisor to help you achieve success", false)
	'----------------------------------------------'


'--------------------------------'
'           END                  |'
'--------------------------------'
