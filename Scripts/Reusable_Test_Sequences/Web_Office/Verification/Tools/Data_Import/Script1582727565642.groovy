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
//  WO/Tools/Data Import Page                 |    26/02/2020   |        DH        |                             |
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
//	WHEN - We CLICK on the <FINANCE> menu Item (Top Level) - Then EUREKA FILE EXPORT PROCESS Sub Menu            |
//                                                                                                               |
//  THEN - Verify Details of the RETURNED Page are As Expected                                                   |
//                                                                                                               |
//---------------------------------------------------------------------------------------------------------------

WebUI.waitForPageLoad(60)
//WebUI.waitForElementVisible(findTestObject('Object Repository/WO_Consumer/Page_/Edit_Consumer_SAVE_Button'), 60)
WebUI.delay(1)

	// Header
	'----------------------------------------------'
	WebUI.verifyTextPresent("Sales Lead Data Import", false)
	'----------------------------------------------'
	// Sub Header
	'----------------------------------------------'
	WebUI.verifyTextPresent("Step 1: Upload CSV file", false)
	'----------------------------------------------'
	 
	'----------------------------------------------'
	// Body -
	'----------------------------------------------'
	WebUI.verifyTextPresent("Use this tool to import Sales Lead data into the database from a CSV file", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("The Sales Leads data contains companies, contact personson and a Directory Heading", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("The import process ensures that there are no duplicate companies", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("The first row in the CSV file must contain the column names", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Choose a .csv file from your local machine", false)
	'----------------------------------------------'
	//WebUI.verifyTextPresent("Choose File", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Hit the Upload button when you are ready to upload the CSV file", false)
	'----------------------------------------------'
	'----------------------------------------------'
//	WebUI.verifyTextPresent("Requires Splitting", false)
//	'----------------------------------------------'
//	WebUI.verifyTextPresent("Number of Splits", false)
//	'----------------------------------------------'
//	WebUI.verifyTextPresent("Frequency", false)

	'----------------------------------------------'

'--------------------------------'
'           END                  |'
'--------------------------------'
