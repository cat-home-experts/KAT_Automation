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
// Navigate and Verify Returned Content       |   10/12/2019    |        DH        |                             |
//---------------------------------------------------------------------------------------------------------------
// IFrame Checks Added                        |   11/12/2019    |        DH        |                             |
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
//	WHEN - We CLICK on the <CASES> menu Item (Top Level)                                                         |
//                                                                                                               |
//  THEN - Verify Details of the RETURNED Page are As Expected                                                        |
//                                                                                                               |
//---------------------------------------------------------------------------------------------------------------

//-----------------------------------------
// Call Setup Process - Browser Startup, Navigate
//-----------------------------------------
'--------------------------------------'
' Web Office StartUp                  |'
'--------------------------------------'
WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Web_Office/Directives/WebOffice_StartUp'), [:], FailureHandling.STOP_ON_FAILURE)

'--------------------------------------'
' Navigate Top level menu Item         |'
'--------------------------------------'
WebUI.delay(5)
WebUI.waitForPageLoad(60)
WebUI.waitForElementClickable(findTestObject('Object Repository/WebOffice_Home_page/a_Cases'), 60)
WebUI.click(findTestObject('Object Repository/WebOffice_Home_page/a_Cases'))

'--------------------------------------'
' Verify Returned Page Content         |'
'--------------------------------------'
WebUI.waitForPageLoad(60)
WebUI.delay(5)
// WebUI.switchToDefaultContent(FailureHandling.CONTINUE_ON_FAILURE)
// Wait for Header table element
//WebUI.waitForElementClickable(findTestObject('Object Repository/WebOffice_Home_page/a_Table'), 60)
// Header
//WebUI.verifyTextPresent("Today's Activity", false)
WebUI.verifyElementVisible(findTestObject("Object Repository/WebOffice/Cases_Top/Page_Checkatrade - Administration - Login/Page_/div_Todays Activity"))

WebUI.verifyElementVisible(findTestObject("Object Repository/WebOffice/Cases_Top/Page_Checkatrade - Administration - Login/Page_/table_My To Do List"))
// WebUI.verifyTextPresent("My Recent Comments", false)
WebUI.verifyElementVisible(findTestObject("Object Repository/WebOffice/Cases_Top/Page_Checkatrade - Administration - Login/Page_/h3_My Recent Comments"))
//WebUI.verifyTextPresent("By You", false)
WebUI.verifyElementVisible(findTestObject("Object Repository/WebOffice/Cases_Top/Page_Checkatrade - Administration - Login/Page_/th_By You"))
// WebUI.verifyTextPresent("Your Department", false)
WebUI.verifyElementVisible(findTestObject("Object Repository/WebOffice/Cases_Top/Page_Checkatrade - Administration - Login/Page_/th_Your Department"))
// WebUI.verifyTextPresent("Everybody", false)
WebUI.verifyElementVisible(findTestObject("Object Repository/WebOffice/Cases_Top/Page_Checkatrade - Administration - Login/Page_/th_Everybody"))
// WebUI.verifyTextPresent("Cases Created", false)
WebUI.verifyElementVisible(findTestObject("Object Repository/WebOffice/Cases_Top/Page_Checkatrade - Administration - Login/Page_/td_Cases Created"))
// WebUI.verifyTextPresent("Comments Added", false)
WebUI.verifyElementVisible(findTestObject("Object Repository/WebOffice/Cases_Top/Page_Checkatrade - Administration - Login/Page_/td_Comments Added"))
// WebUI.verifyTextPresent("My To Do List", false)
WebUI.verifyElementVisible(findTestObject("Object Repository/WebOffice/Cases_Top/Page_Checkatrade - Administration - Login/Page_/td_To Do Items Done"))

'Selection of Primary Nodes Displayed (Not Exhaustive)'
// LH Navigator View
WebUI.verifyTextPresent("Cases", false)
WebUI.verifyTextPresent("My To Do List", false)
WebUI.verifyTextPresent("Member Engagement Calls", false)
WebUI.verifyTextPresent("TradeRegister", false)
// Central navigator Area
WebUI.verifyTextPresent("Admin", false)
WebUI.verifyTextPresent("Appointment", false)
WebUI.verifyTextPresent("Cold Call", false)
//WebUI.verifyTextPresent("Sales Automated", false)
WebUI.verifyTextPresent("New Recommendation", false)
WebUI.verifyTextPresent("Membership Tasks", false)
WebUI.verifyTextPresent("Cancellation > MA", false)
WebUI.verifyTextPresent("Follow Up Call", false)

'--------------------------'
' Teardown - CLose Browser |'
'--------------------------'
WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Teardown'), [:], FailureHandling.OPTIONAL)
		


'--------------------------'
' END                      |'
'--------------------------'
