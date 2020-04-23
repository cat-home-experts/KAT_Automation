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
//  Settings->Web Office-> Sub Menu Item      |    07/04/2020   |        DH        |           a_Pricing         |
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
//	WHEN - We CLICK on the <Settings> menu Item (Top Level) - Then Sub Menu Item WebOffice  (Pricing)            |
//                                                                                                               |
//  THEN - Verify Details of the RETURNED Page are As Expected                                                   |
//                                                                                                               |
//---------------------------------------------------------------------------------------------------------------


WebUI.waitForPageLoad(60)
//WebUI.waitForElementVisible(findTestObject('Object Repository/WO_Consumer/Page_/Edit_Consumer_SAVE_Button'), 60)
WebUI.delay(1)

	// Header
	'----------------------------------------------'
	WebUI.verifyTextPresent("Pricing", false)
	'----------------------------------------------'
	
	//Sub Header - and Detail
	'----------------------------------------------'
	WebUI.verifyTextPresent("All prices exclude VAT, currently charged at a rate of 20%.", false)
	// Base Price
	'----------------------------------------------'
	WebUI.verifyTextPresent("Base price", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Directory Membership", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Website Membership", false)
	'----------------------------------------------'
	//WebUI.verifyTextPresent("Cancel", false)
	'----------------------------------------------'

	// Header - Vetting Schemes
	'----------------------------------------------'
	//WebUI.verifyTextPresent("Add marketing source", false)
	'----------------------------------------------'

	// Top 4 Visible Section Headers (5 inc above)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Vetting Schemes", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Discounted regions", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Extras", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Payment Instalments", false)
	'----------------------------------------------'

// Sample of fields from these sections
	
	'----------------------------------------------'
	WebUI.verifyTextPresent("Buckinghamshire and Surrey TSA", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Directory Membership", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Website Membership", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("East Sussex TSA", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Extra web category", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Extra directory area (discounted", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Directory Membership extended", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Website Membership extended:", false)
	'----------------------------------------------'
	
	// Scroll Down
	WebUI.scrollToPosition(750, 750)
	
	// Other Data Samples
	'----------------------------------------------'
	WebUI.verifyTextPresent("Discounts", false)
	'----------------------------------------------'
	
	// Table Header

	'----------------------------------------------'
	WebUI.verifyTextPresent("NAME", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("DESCRIPTION", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("AMOUNT (WEB)", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("AMOUNT (DIR)", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("CODE", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("ENABLED", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("DELETE", false)
	'----------------------------------------------'

	// Table Sub Headings
	
	WebUI.verifyTextPresent("Discounted Heading", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Full Payment Up Front", false)
	'----------------------------------------------'
	
	// Table Content - Sample
//	'----------------------------------------------'
//	WebUI.verifyTextPresent("Affiliate Membership", false)
//	'----------------------------------------------'
//	WebUI.verifyTextPresent("3 month trial", false)
//	'----------------------------------------------'
//	WebUI.verifyTextPresent("CAP Category", false)
//	'----------------------------------------------'
//	WebUI.verifyTextPresent("N/A", false)
//	'----------------------------------------------'
	
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
