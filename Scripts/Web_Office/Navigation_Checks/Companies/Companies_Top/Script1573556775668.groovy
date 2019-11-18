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
// Navigate and Verify Returned Content       |   12/11/2019    |        DH        |                             |
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
//	WHEN - We CLICK on the <COMPANIES> menu Item (Top Level)                                                         |
//                                                                                                               |
//  THEN - Verify Details of the RETURNED Page are As Expected                                                      |
//                                                                                                               |
//---------------------------------------------------------------------------------------------------------------

//-----------------------------------------
// Call Setup Process - Browser Startup, Navigate
//-----------------------------------------
'--------------------------------------'
' Web Office StartUp                  |'
'--------------------------------------'
WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Web_Office/Directives/WebOffice_StartUp'), [:], FailureHandling.OPTIONAL)

'--------------------------------------'
' Navigate Top level menu Item         |'
'--------------------------------------'
WebUI.delay(5)
WebUI.waitForPageLoad(60)
WebUI.waitForElementClickable(findTestObject('Object Repository/WebOffice_Home_page/a_Companies'), 60)
WebUI.click(findTestObject('Object Repository/WebOffice_Home_page/a_Companies'),)

//----------------------------------------------------
// Sync - Wait For Advanced Search Button to Appear  |
//----------------------------------------------------
WebUI.waitForElementClickable(findTestObject('Object Repository/WebOffice/Companies_Top/Page_/span_Advanced Search'), 120)
'--------------------------------------'
' Verify Returned Page Content         |'
'--------------------------------------'
// Header
WebUI.verifyTextPresent("Members  >  All Members", false)
WebUI.verifyTextPresent("Next", false)
WebUI.verifyTextPresent("Show", false)
WebUI.verifyTextPresent("per page", false)
WebUI.verifyTextPresent("Displaying 1 to 25 from", false)
// Table Sample Row
WebUI.verifyTextPresent("Astra Clean", false)
WebUI.verifyTextPresent("124", false)
WebUI.verifyTextPresent("Chichester", false)
WebUI.verifyTextPresent("West Sussex", false)
WebUI.verifyTextPresent("CARPET & UPHOLSTERY CLEANING", false)
WebUI.verifyTextPresent("MA Department", false)
// Footer
WebUI.verifyTextPresent("Mailmerge", false)
WebUI.verifyTextPresent("Export Email Addresses", false)
WebUI.verifyTextPresent("Bulk Export Email Addresses", false)
WebUI.verifyTextPresent("Export Mobile Numbers", false)
WebUI.verifyTextPresent("Show results on map", false)
WebUI.verifyTextPresent("Open Map in new Window (with All Results)", false)
// RH Navigator View
WebUI.verifyTextPresent("All Companies", false)
WebUI.verifyTextPresent("Members", false)
WebUI.verifyTextPresent("Non-Members", false)
WebUI.verifyTextPresent("Search By", false)
WebUI.verifyTextPresent("Mobile", false)
WebUI.verifyTextPresent("Filter", false)
WebUI.verifyTextPresent("Trader ID", false)
WebUI.verifyTextPresent("More Options", false)
WebUI.verifyTextPresent("Apply", false)
WebUI.verifyTextPresent("Clear", false)
WebUI.verifyTextPresent("Advanced Search", false)

'--------------------------'
' Teardown - CLose Browser |'
'--------------------------'
WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Teardown'), [:], FailureHandling.OPTIONAL)
		
'--------------------------'
' END                      |'
'--------------------------'

