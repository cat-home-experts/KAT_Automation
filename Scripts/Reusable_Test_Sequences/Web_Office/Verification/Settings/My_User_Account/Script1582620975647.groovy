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
//  WO/Settings/My User Account Page Verify   |    25/02/2020   |        DH        |                             |
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
//	WHEN - We CLICK on the <SETTINGS> menu Item (Top Level) - Then MY USER ACCCOUNT Sub Menu                     |
//                                                                                                               |
//  THEN - Verify Details of the RETURNED Page are As Expected                                                   |
//                                                                                                               |
//---------------------------------------------------------------------------------------------------------------


//-----------------------
// TEST HISTORY HEADER - |
//-----------------------
// Any changes to this script, please update the next available row below, with date, in the DATE CREATED column,
// Your Name in the CREATED BY column, and Finaly, The actual change implemented in the NOTES column.
//
//---------------------------------------------------------------------------------------------------------------
//       Test Definition / Description        |   Date Created  |    Created By    |             Notes           |
//---------------------------------------------------------------------------------------------------------------
//  WO/Settings/Preferences Page Verification |    24/02/2020   |        DH        |                             |
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
//	WHEN - We CLICK on the <SETTINGS> menu Item (Top Level) - Then PREFERENCES Sub Menu                          |
//                                                                                                               |
//  THEN - Verify Details of the RETURNED Page are As Expected                                                   |
//                                                                                                               |
//---------------------------------------------------------------------------------------------------------------


WebUI.waitForPageLoad(60)
//WebUI.waitForElementVisible(findTestObject('Object Repository/WO_Consumer/Page_/Edit_Consumer_SAVE_Button'), 60)
WebUI.delay(1)

	// Header
	'----------------------------------------------'
	WebUI.verifyTextPresent("Edit Staff Details", false)
	'----------------------------------------------'
	// Sub Section - Personal Details (Subset)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Personal Details", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("First Name", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("SalesForce User ID", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Management", false)
	'----------------------------------------------'
	// Sub Section - Field Sales (Subset)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Field Sales information", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Base Address", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("House name", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Postcode", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Please ensure the Street / Road name is not in the Town field", false)
	'----------------------------------------------'
	//Button
	// WebUI.verifyTextPresent("Find Address", false) // Embedded Text in IFrame
	'----------------------------------------------'
	// Sub Section - Sales Appointment Area (Subset)
	WebUI.verifyTextPresent("Sales Appointment Areas", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Enter two character postcode prefixes", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Account Details", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Username", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("New Password", false)
	'----------------------------------------------'
	// Scroll
	WebUI.scrollToPosition(500, 500)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Last login", false)
	'----------------------------------------------'

	// Permissions (Subset)
	WebUI.verifyTextPresent("Permissions", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("This staff member can access the following areas", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Web Office: Can login to the Web Office", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Software Staff: Can access IT Pages", false)
	'----------------------------------------------'
	// Scroll
	WebUI.scrollToPosition(1000, 1000)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Vetting Scheme Reference Request Administration: Is able to update Vetting Sceheme Reference Requirements", false)
	'----------------------------------------------'
	// Buttons (Footer
	WebUI.verifyTextPresent("Save", false)
	'----------------------------------------------'
	// WebUI.verifyTextPresent("Cancel", false)
	'----------------------------------------------'

'--------------------------------'
'           END                  |'
'--------------------------------'
