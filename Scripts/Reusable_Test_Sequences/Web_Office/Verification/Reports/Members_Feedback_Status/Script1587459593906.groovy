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
//  Settings->Web Office-> Sub Menu Item      |    21/04/2020   |        DH        |      a_Members Feedback     |
//---------------------------------------------------------------------------------------------------------------
//                                            |                 |                  |        Status Report        |
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
//	WHEN - We CLICK on the <Settings> menu Item (Top Level) - Then Sub Menu Item WebOffice  (a_Members Feedback  |
//                                                                                            Status Report      |
//  THEN - Verify Details of the RETURNED Page are As Expected                                                   |
//                                                                                                               |
//---------------------------------------------------------------------------------------------------------------

WebUI.waitForPageLoad(120)
//WebUI.waitForElementVisible(findTestObject('Object Repository/WO_Consumer/Page_/Edit_Consumer_SAVE_Button'), 60)
WebUI.delay(1)

	// Header
	'----------------------------------------------'
	WebUI.verifyTextPresent("Members Feedback : Status Report", false)
	'----------------------------------------------'
	
	// Sub Headers -

	'----------------------------------------------'
	WebUI.verifyTextPresent("Feedback status", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Companies", false)
	'----------------------------------------------'

	// Table Header
	'----------------------------------------------'
	WebUI.verifyTextPresent("Company name", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Company status", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Total feedbacks", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Selected feedbacks", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Percentage", false)
	'----------------------------------------------'

	
	// Table Content Sample
	
	WebUI.verifyTextPresent("5 Star Cleaning", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("100%", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("5d Compliance", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("ABD Homes Ltd", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("B Nicol Joinery", false)
	'----------------------------------------------'

		// Footer
	'----------------------------------------------'
	//WebUI.verifyTextPresent("Unsubmit Selected Application", false)
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
