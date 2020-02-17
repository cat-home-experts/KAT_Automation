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
// navigating Homeowner->Homeowner Component, |    17/02/2020   |         DH       |  Uses FULL XPath to resolve |
// Ribbon Menu Returns The Correct Set Of Page|                 |                  |  Ribbon Menu Items          |
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
//	GIVEN -                                                                                                      |
//                                                                                                               |
//	WHEN -                                                                                                       |
//                                                                                                               |
//  THEN -                                                                                                       |
//                                                                                                               |
//---------------------------------------------------------------------------------------------------------------
	
    '----------------------------------------------------------------------------------------------------------------------------------------'
	'This test is dependent on being called by ->Homeowner-> Why Checkatarade OR The Checkatrade Standard OR COmplaints About A Member       |'
	'                                       OR FAQ - From CAT Footer Tests       - NOT STANDALONE -                                          |'
	'----------------------------------------------------------------------------------------------------------------------------------------'
		
	'Scroll to Page Top'
	WebUI.scrollToPosition(0, 0)
	WebUI.delay(1)
	
	'--------------------------------------------------------------------------------------'
	' Navigate to Homeowner->Why Checkatrade->Ribbon Menu Item <Why Checkatrade>           |' //  Reuse for each of 4 Homeowners Options From CAT Footer
	'--------------------------------------------------------------------------------------'
	WebUI.waitForElementClickable(findTestObject('Object Repository/CAT_Footer/Homeowner/Ribbon_Menu/span_Why Checkatrade'), 3)
	WebUI.click(findTestObject('Object Repository/CAT_Footer/Homeowner/Ribbon_Menu/span_Why Checkatrade'))
	
	WebUI.waitForPageLoad(60)
		
	'Basic Verification, as the page gets extensively checked from the parent test, just looking here from the parent ribbon menu'
	
	WebUI.verifyTextPresent('Millions of reviews', false)
	WebUI.verifyTextPresent('Free to use', false)
	WebUI.verifyTextPresent('Nationwide', false)
	
	'-----------------------------------------------------------------------------------------------'
	' Navigate to Homeowner->The Checkatrade Standard->Ribbon Menu Item <The Checkatrade Standard>  |' //  Reuse for each of 4 Homeowners Options From CAT Footer
	'-----------------------------------------------------------------------------------------------'
	
	WebUI.waitForElementClickable(findTestObject('Object Repository/CAT_Footer/Homeowner/Ribbon_Menu/span_The Checkatrade Standard'), 3)
	WebUI.click(findTestObject('Object Repository/CAT_Footer/Homeowner/Ribbon_Menu/span_The Checkatrade Standard'))
	
	WebUI.waitForPageLoad(60)
	
	'Basic Verification, as the page gets extensively checked from the parent test, just looking here from the parent ribbon menu'
	
	WebUI.verifyTextPresent('The Checkatrade Standard', false)
	WebUI.verifyTextPresent('Our members are proud to be part of Checkatrade.com', false)
	WebUI.verifyTextPresent('Be honest in all dealings with you', false)
	
	'--------------------------------------------------------------------------------------'
	' Navigate to Homeowner->Resolving Issues->Ribbon Menu Item <Resolving Issues>         |' //  Reuse for each of 4 Homeowners Options From CAT Footer
	'--------------------------------------------------------------------------------------'
	WebUI.waitForElementClickable(findTestObject('Object Repository/CAT_Footer/Homeowner/Ribbon_Menu/div_Complaints About A Member'), 3)
	WebUI.click(findTestObject('Object Repository/CAT_Footer/Homeowner/Ribbon_Menu/div_Complaints About A Member'))
	
	WebUI.waitForPageLoad(60)
	
	'Basic Verification, as the page gets extensively checked from the parent test, just looking here from the parent ribbon menu'
	
	WebUI.verifyTextPresent('Resolving Issues', false)
	WebUI.verifyTextPresent('Our members promise to meet The Checkatrade standard', false)
	WebUI.verifyTextPresent('Checkatrade encourage and recommend you to make all reasonable efforts to discuss', false)
	
	'--------------------------------------------------------------------------------------'
	' Navigate to Homeowner->FAQ->Ribbon Menu Item <FAQ>                                   |' //  Reuse for each of 4 Homeowners Options From CAT Footer
	'--------------------------------------------------------------------------------------'
	WebUI.waitForElementClickable(findTestObject('Object Repository/CAT_Footer/Homeowner/Ribbon_Menu/span_FAQ'), 3)
	WebUI.click(findTestObject('Object Repository/CAT_Footer/Homeowner/Ribbon_Menu/span_FAQ'))
	
	WebUI.waitForPageLoad(60)
	
	'Basic Verification, as the page gets extensively checked from the parent test, just looking here from the parent ribbon menu'
	
	WebUI.verifyTextPresent('Frequently asked questions', false)
	WebUI.verifyTextPresent('Using the Checkatrade Service', false)
	WebUI.verifyTextPresent('How do you vet prospective members?', false)
	
	'--------------------------'
	' END                      |'
	'--------------------------'
