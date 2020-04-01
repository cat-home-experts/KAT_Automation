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
//  WO/Settings->Settings->Members Area       |    01/04/2020   |        DH        | Members Panel Suggestions   |
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
//	WHEN - We CLICK on the <SETTINGS> menu Item (Top Level) - Then Settings Sub Menu Item  (Members Pane Suggest)|
//                                                                                                               |
//  THEN - Verify Details of the RETURNED Page are As Expected                                                   |
//                                                                                                               |
//---------------------------------------------------------------------------------------------------------------


WebUI.waitForPageLoad(60)
//WebUI.waitForElementVisible(findTestObject('Object Repository/WO_Consumer/Page_/Edit_Consumer_SAVE_Button'), 60)
WebUI.delay(1)

	// Header
	'----------------------------------------------'
	WebUI.verifyTextPresent("Member Panel Suggestions", false)
	'----------------------------------------------'
	// Sub Header 
	'----------------------------------------------'
	WebUI.verifyTextPresent("Filter", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Suggestion Status", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Show", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("entries", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Search", false)
	'----------------------------------------------'

	// Sub Section - Table Header
	'----------------------------------------------'
	WebUI.verifyTextPresent("Status", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Category", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Suggested by", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Created Date", false)
	'----------------------------------------------'
	//WebUI.verifyTextPresent("Quote", false)
	'----------------------------------------------'
	// Table Body (sample)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Archived", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Members Area", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Membership Advisor", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Plastering Services", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Misc.", false)
	'----------------------------------------------'

	'----------------------------------------------'

'--------------------------------'
'           END                  |'
'--------------------------------'
