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
// Your NAme in the CREATED BY column, and Finaly, The actual change implemented in the NOTES column.
//
//---------------------------------------------------------------------------------------------------------------
//       Test Definition / Description        |   Date Created  |    Created By    |             Notes           |
//---------------------------------------------------------------------------------------------------------------
// Verify Footer Navigation is correct        |                 |                  |                             |
// navigating Homeowner->Ribbon Menu Returns  |    10/02/2020   |         DH       |                             |
// The Correct Set Of Pages                   |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
//                                            |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
//                                            |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
//                                            |                 |                  |                             |
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
//	GIVEN - The Chekatrade Website 'HOMEPAGE' is Presented on a Client Device                                    |
//                                                                                                               |
//	WHEN -  We Navigate Homeowner - Ribbon, Menu Items from the Page Header Ribbon Menu                          |
//                                                                                                               |
//  THEN -  The Resulting Outcome is that the <Relevent, Context> Page is Returned                               |
//                                                                                                               |
//---------------------------------------------------------------------------------------------------------------
	
	//-----------------------------------------
	// Call Startup Process - Browser Startup, Navigate, Maximize and Close Cookie Nagging Element
	//-----------------------------------------
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Setup'), [:], FailureHandling.OPTIONAL)
	//-----------------------------------------

	' Home Page validation Checks after COOKIE Dispelled'
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Home'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	
	'---------------------------------------'
	' Navigate to Company->Careers          |' //  Only Used ONCE - Hence, Not In Reuse Folder
	'---------------------------------------'
	WebUI.waitForElementClickable(findTestObject('Object Repository/CAT_Footer/Page_Checkatrade Find a tradesperson you can trust/div_Careers'), 3)
	WebUI.click(findTestObject('Object Repository/CAT_Footer/Page_Checkatrade Find a tradesperson you can trust/div_Careers'))
	
	'--------------------------'
	' Ribbon - About Us Menu   |'   //  Only Used ONCE - Hence, Not In Reuse Folder
	'--------------------------'
	
	WebUI.waitForElementClickable(findTestObject('Object Repository/CAT_Footer/Ribbon_Menu/Page_Vacancy Search Results - Checkatrade/a_About Us'), 3)
	WebUI.click(findTestObject('Object Repository/CAT_Footer/Ribbon_Menu/Page_Vacancy Search Results - Checkatrade/a_About Us'))
	
	'--------------------------'
	' Verify - About Us Return |'
	'--------------------------'

	WebUI.verifyTextPresent('Home', false)
	WebUI.scrollToPosition(500, 500)
	WebUI.verifyTextPresent('Checka-who', false)
	WebUI.scrollToPosition(0, 0)
	
	'--------------------------'
	' Ribbon - Our Teams Menu  |' //  Only Used ONCE - Hence, Not In Reuse Folder
	'--------------------------'
	
	WebUI.waitForElementClickable(findTestObject('Object Repository/CAT_Footer/Ribbon_Menu/Page_About Us - Checkatrade/a_Our Teams'), 3)
	WebUI.click(findTestObject('Object Repository/CAT_Footer/Ribbon_Menu/Page_About Us - Checkatrade/a_Our Teams'))

	'--------------------------'
	' Verify - Our Teams Return|'
	'--------------------------'

	WebUI.verifyTextPresent('Home', false)
	WebUI.scrollToPosition(500, 500)
	WebUI.verifyTextPresent('Sales', false)
	WebUI.verifyTextPresent('Vetting', false)
	WebUI.scrollToPosition(0, 0)
	
	'--------------------------'
	' Ribbon - Our Benefits    |'  //  Only Used ONCE - Hence, Not In Reuse Folder
	'--------------------------'
	
	WebUI.waitForElementClickable(findTestObject('Object Repository/CAT_Footer/Ribbon_Menu/Page_Our Teams - Checkatrade/a_Our Benefits'), 3)
	WebUI.click(findTestObject('Object Repository/CAT_Footer/Ribbon_Menu/Page_Our Teams - Checkatrade/a_Our Benefits'))

	'--------------------------'
	' Verify - Our Benefits Ret|'
	'--------------------------'
  
	WebUI.verifyTextPresent('Home', false)
	WebUI.scrollToPosition(500, 500)
	WebUI.verifyTextPresent('Join us and you’ll soon become part of the Checkatrade culture', false)
	WebUI.verifyTextPresent('Gym memberships', false)
	WebUI.scrollToPosition(0, 0)
	
	'--------------------------'
	' Ribbon - Charity Leave   |'  //  Only Used ONCE - Hence, Not In Reuse Folder
	'--------------------------'
	
	WebUI.waitForElementClickable(findTestObject('Object Repository/CAT_Footer/Ribbon_Menu/Page_Our Benefits - Checkatrade/a_Charity Leave'), 3)
	WebUI.click(findTestObject('Object Repository/CAT_Footer/Ribbon_Menu/Page_Our Benefits - Checkatrade/a_Charity Leave'))

	'--------------------------'
	' Verify - Charity Leave Re|'
	'--------------------------'

	WebUI.verifyTextPresent('Home', false)
	WebUI.scrollToPosition(500, 500)
	WebUI.verifyTextPresent('Our Communications Manager Tash Peddell spent a week', false)
	WebUI.scrollToPosition(0, 0)

	'--------------------------'
	' Ribbon - Our Offices Menu|' //  Only Used ONCE - Hence, Not In Reuse Folder
	'--------------------------'
	
	WebUI.waitForElementClickable(findTestObject('Object Repository/CAT_Footer/Ribbon_Menu/Page_Charity leave - Checkatrade/a_Our Offices'), 3)
	WebUI.click(findTestObject('Object Repository/CAT_Footer/Ribbon_Menu/Page_Charity leave - Checkatrade/a_Our Offices'))

	'--------------------------'
	' Verify - Our Offices Ret |'
	'--------------------------'

	WebUI.verifyTextPresent('Home', false)
	WebUI.scrollToPosition(500, 500)
	WebUI.verifyTextPresent('Life at Lakeside', false)
	WebUI.verifyTextPresent('Got an interview', false)
	WebUI.scrollToPosition(0, 0)

	'--------------------------'
	' Ribbon - Contact Us Menu |' //  Only Used ONCE - Hence, Not In Reuse Folder
	'--------------------------'

	WebUI.waitForElementClickable(findTestObject('Object Repository/CAT_Footer/Ribbon_Menu/Page_Our Offices - Checkatrade/a_Contact Us'), 3)
	WebUI.click(findTestObject('Object Repository/CAT_Footer/Ribbon_Menu/Page_Our Offices - Checkatrade/a_Contact Us'))

	'--------------------------'
	' Verify - Contact Us Ret  |'
	'--------------------------'
	
	WebUI.verifyTextPresent('Home', false)
	WebUI.scrollToPosition(500, 500)
	WebUI.verifyTextPresent('Agencies - please note', false)
	WebUI.verifyTextPresent('We’re lucky enough to have lots of great people applying to us directly', false)
	WebUI.scrollToPosition(0, 0)

	'--------------------------'
	' Ribbon - Our vacancies   |' //  Only Used ONCE - Hence, Not In Reuse Folder
	'--------------------------'
	
	WebUI.waitForElementClickable(findTestObject('Object Repository/CAT_Footer/Ribbon_Menu/Page_Contact Us - Checkatrade/a_Our Vacancies'), 3)
	WebUI.click(findTestObject('Object Repository/CAT_Footer/Ribbon_Menu/Page_Contact Us - Checkatrade/a_Our Vacancies'))
	
	'---------------------------------------'
	' Verify Returned Page is as Expected   | Return to Initial Company/DEFAULT PAGE - Verified from Ribbon Test (here) and Footer CAT Test (2 paths)'
	'---------------------------------------'
	
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Footer/Company/Careers_Verification'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		
	'--------------------------'
	' Teardown - CLose Browser |'
	'--------------------------'
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Teardown'), [:], FailureHandling.OPTIONAL)
	
	'--------------------------'
	' END                      |'
	'--------------------------'
