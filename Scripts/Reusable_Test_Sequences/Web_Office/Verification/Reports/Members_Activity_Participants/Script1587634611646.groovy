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
//  Settings->Web Office-> Sub Menu Item      |    23/04/2020   |        DH        |   a_Members Area Activity   |
//---------------------------------------------------------------------------------------------------------------
//                                            |                 |                  |    a_Participants Report    |
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
//	WHEN - We CLICK on the <Settings> menu Item (Top Level) - Then Sub Menu Item WebOffice  (Members Area        |
//                                                                                                      Laggards |
//  THEN - Verify Details of the RETURNED Page are As Expected                                                   |
//                                                                                                               |
//---------------------------------------------------------------------------------------------------------------


WebUI.waitForPageLoad(120)
//WebUI.waitForElementVisible(findTestObject('Object Repository/WO_Consumer/Page_/Edit_Consumer_SAVE_Button'), 60)
WebUI.delay(1)

	// Header
	'----------------------------------------------'
	WebUI.verifyTextPresent("Good Morning!", false)
	'----------------------------------------------'
	
	// Sub Headers -

	'----------------------------------------------'
	WebUI.verifyTextPresent("Things to review:", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Feedback to review", false)
	'----------------------------------------------'

	// Table Header
	'----------------------------------------------'
	WebUI.verifyTextPresent("Recent members photos:", false)
	'----------------------------------------------'
	
	// Forum HEaders
	WebUI.verifyTextPresent("Members area forum activity:", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Members joining", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("and leaving", false)
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
