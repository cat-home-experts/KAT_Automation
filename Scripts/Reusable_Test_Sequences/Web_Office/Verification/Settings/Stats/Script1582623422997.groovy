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
//  WO/Settings/Statts Page Verify            |    25/02/2020   |        DH        |                             |
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
//	WHEN - We CLICK on the <SETTINGS> menu Item (Top Level) - Then STATS Sub Menu                                |
//                                                                                                               |
//  THEN - Verify Details of the RETURNED Page are As Expected                                                   |
//                                                                                                               |
//---------------------------------------------------------------------------------------------------------------


WebUI.waitForPageLoad(60)
//WebUI.waitForElementVisible(findTestObject('Object Repository/WO_Consumer/Page_/Edit_Consumer_SAVE_Button'), 60)
WebUI.delay(1)

	// Header
	'----------------------------------------------'
	WebUI.verifyTextPresent("Statistics", false)
	'----------------------------------------------'
	// Sub Section - Personal Details (Subset)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Members Count", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Currently Displayed Printed Directories Count", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Displayed Members Count", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("New Printed Directories Count", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Use Currently Displayed Value", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Use New Value", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("million", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("thousand", false)
	'----------------------------------------------'

	'----------------------------------------------'

'--------------------------------'
'           END                  |'
'--------------------------------'
