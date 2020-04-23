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
//  Settings->Web Office-> Sub Menu Item      |    08/04/2020   |        DH        |       a_Vetting Schemes     |
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
//	WHEN - We CLICK on the <Settings> menu Item (Top Level) - Then Sub Menu Item WebOffice  (Vetting Schemes)    |
//                                                                                                               |
//  THEN - Verify Details of the RETURNED Page are As Expected                                                   |
//                                                                                                               |
//---------------------------------------------------------------------------------------------------------------


WebUI.waitForPageLoad(60)
//WebUI.waitForElementVisible(findTestObject('Object Repository/WO_Consumer/Page_/Edit_Consumer_SAVE_Button'), 60)
WebUI.delay(1)

	// Header
	'----------------------------------------------'
	WebUI.verifyTextPresent("Vetting Schemes", false)
	'----------------------------------------------'
	
	// Sub Header/Table Header - and Detail
	'----------------------------------------------'
	WebUI.verifyTextPresent("Active schemes", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Archived schemes", false)
	'----------------------------------------------'

	// Table Header
	'----------------------------------------------'
	WebUI.verifyTextPresent("CHECK", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("DESCRIPTION", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("CHECKATRADE", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("KENT TSA", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("BUCKINGHAMSHIRE AND SURREY TSA", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("NOTTINGHAMSHIRE TSA", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("BROMLEY TSA", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("SUFFOLK TSA", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("EAST SUSSEX TSA", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("NOTTINGHAM CITY TSA", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("FOC", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("WORCESTERSHIRE TSA", false)
	'----------------------------------------------'

	// Table Content (sample)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Accreditations", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("If accreditations are required for chosen work category, confirm with uploaded document", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("County Court Judgements", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Check for County Court Judgements", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Trading Standards Consent", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Company agrees to data sharing with Trading Standards", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Duplicate Check process step is done", false)
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
