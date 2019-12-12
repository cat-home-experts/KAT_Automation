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
//	WHEN - We CLICK on the <REPORTS> menu Item (Top Level)                                                         |
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
WebUI.waitForPageLoad(60)
WebUI.waitForElementClickable(findTestObject('Object Repository/WebOffice_Home_page/a_Reports'), 60)
WebUI.click(findTestObject('Object Repository/WebOffice_Home_page/a_Reports'))
WebUI.delay(2)
WebUI.waitForPageLoad(60)
WebUI.waitForElementVisible(findTestObject("Object Repository/WebOffice/Cases_Top/Reports_Top/Page_/img_See more _ctl00_CP1_WebChart1"), 60)
'--------------------------------------'
' Verify Returned Page Content         |'
'--------------------------------------'
// All One Page
'Recent Searches Table'
WebUI.verifyTextPresent("Web Activity", false)
WebUI.verifyTextPresent("Recent Searches", false)
WebUI.verifyTextPresent("Search on", false)
WebUI.verifyTextPresent("Search for", false)
WebUI.verifyTextPresent("In", false)
WebUI.verifyTextPresent("No. Results", false)
WebUI.verifyTextPresent("See more …", false)

'Most Viewed Companies Table'
WebUI.verifyTextPresent("Most Viewed Companies (in past 7 days)", false)
WebUI.verifyTextPresent("Company", false)
WebUI.verifyTextPresent("From Search", false)
WebUI.verifyTextPresent("Checkatrade", false)
WebUI.verifyTextPresent("External Link", false)
WebUI.verifyTextPresent("Other", false)
WebUI.verifyTextPresent("Total", false)

' Daily Activity Graphic'
WebUI.verifyElementVisible(findTestObject("Object Repository/WebOffice/Cases_Top/Reports_Top/Page_/img_See more _ctl00_CP1_WebChart1"))
//WebUI.verifyTextPresent("Date	", false)
WebUI.verifyElementVisible(findTestObject('Object Repository/WebOffice/Cases_Top/Reports_Top/Page_/th_Date'))
//WebUI.verifyTextPresent("Unique Visitors	", false)
WebUI.verifyElementVisible(findTestObject('Object Repository/WebOffice/Cases_Top/Reports_Top/Page_/th_Unique Visitors'))

WebUI.verifyElementVisible(findTestObject('Object Repository/WebOffice/Cases_Top/Reports_Top/Page_/th_Searches'))
//WebUI.verifyTextPresent("Company Views", false)
WebUI.verifyElementVisible(findTestObject('Object Repository/WebOffice/Cases_Top/Reports_Top/Page_/th_Company Views'))

'--------------------------'
' Teardown - CLose Browser |'
'--------------------------'
WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Teardown'), [:], FailureHandling.OPTIONAL)
		
'--------------------------'
' END                      |'
'--------------------------'

