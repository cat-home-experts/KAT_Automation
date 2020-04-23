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
//  Settings->Web Office-> Sub Menu Item      |    03/04/2020   |        DH        |     a_Marketing Materials   |
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
//	WHEN - We CLICK on the <Settings> menu Item (Top Level) - Then Sub Menu Item WebOffice  (Marketing_Materials)|
//                                                                                                               |
//  THEN - Verify Details of the RETURNED Page are As Expected                                                   |
//                                                                                                               |
//---------------------------------------------------------------------------------------------------------------

WebUI.waitForPageLoad(60)
//WebUI.waitForElementVisible(findTestObject('Object Repository/WO_Consumer/Page_/Edit_Consumer_SAVE_Button'), 60)
WebUI.delay(1)

	// Header
	'----------------------------------------------'
	WebUI.verifyTextPresent("Edit Marketing Materials", false)
	'----------------------------------------------'

	// Sub Section - Table Header
	'----------------------------------------------'
	WebUI.verifyTextPresent("Status", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Title", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Description", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Price", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Batch Size", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Max. Order", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Printer Code", false)
	'----------------------------------------------'

	// Sub Section - Table Content Sample
	'----------------------------------------------'
	WebUI.verifyTextPresent("RVM Certificate", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("ent to Members when they become RVM. Ordered via Web Office only", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("SUF", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Suffolk Trading Standards Approved Vehicle Sticker", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Vehicle Sticker Suffolk County Council Trading Standards Approved in Partnership", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("WCR", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("NTC", false)
	'----------------------------------------------'
	
	'----------------------------------------------'

'--------------------------------'
'           END                  |'
'--------------------------------'
