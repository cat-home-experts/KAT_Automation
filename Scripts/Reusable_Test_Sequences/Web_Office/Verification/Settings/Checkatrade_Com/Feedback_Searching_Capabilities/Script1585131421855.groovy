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
//  WO/Settings->Settings->Checkatrade.com    |    27/03/2020   |        DH        |    Feedback Searching Caps  |
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
//	WHEN - We CLICK on the <SETTINGS> menu Item (Top Level) - Then Settings Sub Menu Item  (Feedback Search Caps)|
//                                                                                                               |
//  THEN - Verify Details of the RETURNED Page are As Expected                                                   |
//                                                                                                               |
//---------------------------------------------------------------------------------------------------------------


WebUI.waitForPageLoad(60)
//WebUI.waitForElementVisible(findTestObject('Object Repository/WO_Consumer/Page_/Edit_Consumer_SAVE_Button'), 60)
WebUI.delay(1)

	// Header
	'----------------------------------------------'
	WebUI.verifyTextPresent("Website Search Feedback Caps per Category", false)
	'----------------------------------------------'
	// Sub Section - Add New
	'----------------------------------------------'
	WebUI.verifyTextPresent("Add new category feedback cap", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Feedback cap", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("All TV Regions", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Valid for new members from", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Cap effective from", false)
	'----------------------------------------------'

	// Category Table Sub Section - Header
	'----------------------------------------------'
	WebUI.verifyTextPresent("TV REGION", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("MEMBERS JOINING AFTER", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("CAP EFFECTIVE FROM", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("MODIFIED BY", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("MODIFIED ON", false)
	'----------------------------------------------'
	// Category Column Sample
	'----------------------------------------------'
	WebUI.verifyTextPresent("ASBESTOS SERVICES", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("BUILDING", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("CENTRAL HEATING - GAS SAFE", false)
	'----------------------------------------------'

'--------------------------------'
'           END                  |'
'--------------------------------'
