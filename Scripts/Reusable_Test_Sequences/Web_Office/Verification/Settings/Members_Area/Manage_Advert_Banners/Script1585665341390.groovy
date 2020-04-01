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
//  Settings->Members_Area-> Sub Menu Item    |    01/04/2020   |        DH             a_Manage Advert Banners  
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
//	WHEN - We CLICK on the <Settings> menu Item (Top Level) - Then Members Area Sub Menu   (Manage Advert Banners
//                                                                                                               |
//  THEN - Verify Details of the RETURNED Page are As Expected                                                   |
//                                                                                                               |
//---------------------------------------------------------------------------------------------------------------



WebUI.waitForPageLoad(60)
//WebUI.waitForElementVisible(findTestObject('Object Repository/WO_Consumer/Page_/Edit_Consumer_SAVE_Button'), 60)
WebUI.delay(1)

	// Header
	'----------------------------------------------'
	WebUI.verifyTextPresent("Members Area Adverts", false)
	'----------------------------------------------'
	// Sub Header
	'----------------------------------------------'
	WebUI.verifyTextPresent("Add New Banner", false)
	'----------------------------------------------'
	// Body
	WebUI.verifyTextPresent("Banner Name", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Link URL", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Large", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Small", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Dimentions for the Large image should be 468 x 60px", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Dimentions for the small image should be 234 x 60px", false)
	'----------------------------------------------'
	
	// Section Current Banner List
	// Header
	
	WebUI.verifyTextPresent("Current Banners", false)
	'----------------------------------------------'

	// Sub Section - Table Header
	'----------------------------------------------'
	WebUI.verifyTextPresent("ID", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Name", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Banner URL", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Preview", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Is Active", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Delete", false)
	'----------------------------------------------'
	// Table Data Sample
	WebUI.verifyTextPresent("iforce", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("https://join.checkatrade.com/refer/", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("iForce", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Offers", false)
	'----------------------------------------------'


	'----------------------------------------------'

'--------------------------------'
'           END                  |'
'--------------------------------'
