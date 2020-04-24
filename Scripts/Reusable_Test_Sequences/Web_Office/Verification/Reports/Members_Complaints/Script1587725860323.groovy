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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

//---------------------------------------------------------------------------------------------------------------
//       Test Definition / Description        |   Date Created  |    Created By    |             Notes           |
//---------------------------------------------------------------------------------------------------------------
//  Settings->Web Office-> Sub Menu Item      |    24/04/2020   |        DH        |     a_Member Complaints     |
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
//	WHEN - We CLICK on the <Settings> menu Item (Top Level) - Then Sub Menu Item WebOffice (a_Member Complaints) |
//                                                                                                               |
//  THEN - Verify Details of the RETURNED Page are As Expected                                                   |
//                                                                                                               |
//---------------------------------------------------------------------------------------------------------------

WebUI.waitForPageLoad(120)
//WebUI.waitForElementVisible(findTestObject('Object Repository/WO_Consumer/Page_/Edit_Consumer_SAVE_Button'), 60)
WebUI.delay(1)

	// Header
	'----------------------------------------------'
	WebUI.verifyTextPresent("Member Complaints", false)
	'----------------------------------------------'
						  
	// Sub Headers -

	// Detail
	'----------------------------------------------'
	WebUI.verifyTextPresent("All Available Dates", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Trading Standards Area Filter", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Complaint Nature", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Directory Heading", false)
	'----------------------------------------------'
	
	// Table Header
	
	WebUI.verifyTextPresent("Company", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Total FBCs", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Complaints", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Failed Spot Check", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Negative Vs Positive", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("On Probation", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("On Warning", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("FBC Probation", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("FBC Warning", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Overall Score", false)
	'----------------------------------------------'

	
	//Table Data Sample
	'----------------------------------------------'
	WebUI.verifyTextPresent("Ace Lockfast Locksmiths (Sussex)", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Clean-a-Carpet Ltd", false)
	'----------------------------------------------'
//	WebUI.verifyTextPresent("Total", false)
//	'----------------------------------------------'
//	WebUI.verifyTextPresent("Total", false)
//	'----------------------------------------------'
//	WebUI.verifyTextPresent("Total", false)
	'----------------------------------------------'

	'----------------------------------------------'
'--------------------------------'
'           END                  |'
'--------------------------------'
