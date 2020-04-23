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
//  Settings->Web Office-> Sub Menu Item      |    09/04/2020   |        DH        |    a_System Administrator   |
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
//	WHEN - We CLICK on the <Settings> menu Item (Top Level) - Then Sub Menu Item WebOffice  (System Administrator|
//                                                                                                               |
//  THEN - Verify Details of the RETURNED Page are As Expected                                                   |
//                                                                                                               |
//---------------------------------------------------------------------------------------------------------------


WebUI.waitForPageLoad(60)
//WebUI.waitForElementVisible(findTestObject('Object Repository/WO_Consumer/Page_/Edit_Consumer_SAVE_Button'), 60)
WebUI.delay(1)

	// Header Buttons
//	'----------------------------------------------'
//	WebUI.verifyTextPresent("AccreditationExpiryCheck", false)
//	'----------------------------------------------'
//	WebUI.verifyTextPresent("AccreditationExpired", false)
//	'----------------------------------------------'
//	WebUI.verifyTextPresent("MembershipRetentionCheck", false)
//	'----------------------------------------------'
//	WebUI.verifyTextPresent("ThreeMonthNoContactCheck", false)
//	'----------------------------------------------'
//	WebUI.verifyTextPresent("MoveOnDesiredDirectories", false)
//	'----------------------------------------------'
//	WebUI.verifyTextPresent("ForgetOldScreenLocks", false)
//	'----------------------------------------------'
//	WebUI.verifyTextPresent("MembershipIntelChecks", false)
//	'----------------------------------------------'

	// SOLR Sub Header/Form Header - and Detail
	'----------------------------------------------'
	WebUI.verifyTextPresent("SOLR", false)
	'----------------------------------------------'

	'----------------------------------------------'
	WebUI.verifyTextPresent("Show SOLR Status", false)
	'----------------------------------------------'

	'----------------------------------------------'
	WebUI.verifyTextPresent("Executing SOLR commands may take a minute to start running, please do not spam SOLR with", false)
	'----------------------------------------------'

	'----------------------------------------------'
	WebUI.verifyTextPresent("Update Changed Records", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Execute Full Re-Index", false)
	'----------------------------------------------'

	//Button
	// WebUI.verifyTextPresent("Find Address", false) // Embedded Text in IFrame
	'----------------------------------------------'
	// Sub Section - Sales Appointment Area (Subset)
	// WebUI.verifyTextPresent("Save", false)
	'----------------------------------------------'

'--------------------------------'
'           END                  |'
'--------------------------------'
