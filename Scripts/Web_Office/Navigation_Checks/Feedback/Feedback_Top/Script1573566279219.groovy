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
// Implemented                                |   28/11/2019    |        DH        |                             |
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
//	WHEN - We CLICK on the <FEEDBACK> menu Item (Top Level)                                                         |
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
WebUI.waitForElementClickable(findTestObject('Object Repository/WebOffice_Home_page/a_Feedback'), 60)
WebUI.click(findTestObject('Object Repository/WebOffice_Home_page/a_Feedback'))

//----------------------------------------------------
// Sync - Wait For Advanced Search Button to Appear  |
//----------------------------------------------------
WebUI.waitForElementClickable(findTestObject('Object Repository/WebOffice/Feedback_Top/Feedback_Graphic'), 20) // iframe actuallly :-)
// Graphic XPATH = //*[@id="form1"]/div[3]/div/div/table/tbody/tr[2]/td[1] // iframe - //*[@id="ctl00_CP1_content"]
WebUI.delay(2)
WebUI.waitForPageLoad(60)
'--------------------------------------'
' Verify Returned Page Content         |'
'--------------------------------------'
// Central pane
// WebUI.switchToFrame(findTestObject('Object Repository/WebOffice/Feedback_Top/Feedback_Graphic'))
'Central pane - Iframe - Data Grabbed from Backend - Tool Doesnt Resolve Off The Shelf, Will Need Tweeking at some point'
//WebUI.verifyTextPresent("Feedback Management", false)
//WebUI.verifyTextPresent("Feedback Quick Statistics", false)
//WebUI.verifyTextPresent("Feedback published last month", false)
//WebUI.verifyTextPresent("Feedback published so far this month", false)
//WebUI.verifyTextPresent("Feedback cards entered today", false)
//WebUI.verifyTextPresent("Web Submissions for review", false)
//WebUI.verifyTextPresent("Feedback selected for spot checking yesterday", false)
//WebUI.verifyTextPresent("Feedback spot checking done today", false)
//WebUI.verifyTextPresent("Feedback Submissions (by week)", false)
//WebUI.verifyTextPresent("Feedback - Last modified by you", false)
//WebUI.verifyTextPresent("Data Entry Statistics (last 7 days)", false)
// Left Hand Tree View (Top) Detail (Sample of Available)
WebUI.verifyTextPresent("Reference Requests", false)
WebUI.verifyTextPresent("References To Call", false)
WebUI.verifyTextPresent("Online Reference Review", false)
WebUI.verifyTextPresent("Free Of Charge Members", false)
WebUI.verifyTextPresent("Non Member", false)
WebUI.verifyTextPresent("Unused", false)
WebUI.verifyTextPresent("Scanned Cards", false)
WebUI.verifyTextPresent("Unvalidated Emails", false)
WebUI.verifyTextPresent("Unvalidated Text", false)
WebUI.verifyTextPresent("For Review", false)
WebUI.verifyTextPresent("IP warnings", false)
WebUI.verifyTextPresent("Invalid Details", false)
WebUI.verifyTextPresent("Investigations", false)
WebUI.verifyTextPresent("Published", false)
// Left Hand Tree View (Filter) Detail (Sample of Available)
WebUI.verifyTextPresent("Filter", false)
WebUI.verifyTextPresent("Feedback about Member", false)
WebUI.verifyTextPresent("Submitted by", false)
WebUI.verifyTextPresent("Work date between", false)
WebUI.verifyTextPresent("Description contains", false)
'Buttons'
//WebUI.verifyTextPresent("Apply", false)
//WebUI.verifyTextPresent("Clear", false)

'--------------------------'
' Teardown - CLose Browser |'
'--------------------------'
WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Teardown'), [:], FailureHandling.OPTIONAL)
		
'--------------------------'
' END                      |'
'--------------------------'

