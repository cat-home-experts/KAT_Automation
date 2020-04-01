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
//  WO/Settings->Settings->Members Area       |    01/04/2020   |        DH        |    Members Panel Minutes    |
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
//	WHEN - We CLICK on the <SETTINGS> menu Item (Top Level) - Then Settings Sub Menu Item  (Members Pane Minutes)|
//                                                                                                               |
//  THEN - Verify Details of the RETURNED Page are As Expected                                                   |
//                                                                                                               |
//---------------------------------------------------------------------------------------------------------------


WebUI.waitForPageLoad(60)
//WebUI.waitForElementVisible(findTestObject('Object Repository/WO_Consumer/Page_/Edit_Consumer_SAVE_Button'), 60)
WebUI.delay(1)

	// Header
	'----------------------------------------------'
	WebUI.verifyTextPresent("Members Panel Minutes", false)
	'----------------------------------------------'
	// Sub Header Upload Members panel minutes.
	'----------------------------------------------'
	WebUI.verifyTextPresent("Upload Members panel minutes", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Select file", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Select Date", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Upload", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Browse", false)
	'----------------------------------------------'
	// Sub Header Previously Uploaded Minutes.
	'----------------------------------------------'
	WebUI.verifyTextPresent("Previously Uploaded Minutes", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Panel Meeting Minutes", false)
	'----------------------------------------------'
	// Sub Header Set next members panel meeting date.
	'----------------------------------------------'
	WebUI.verifyTextPresent("Set next members panel meeting date", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Next Meeting Date Currently", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Next meeting on hold", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Please continue to make suggestions", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Set Date", false)
	'----------------------------------------------'

	'----------------------------------------------'

'--------------------------------'
'           END                  |'
'--------------------------------'
