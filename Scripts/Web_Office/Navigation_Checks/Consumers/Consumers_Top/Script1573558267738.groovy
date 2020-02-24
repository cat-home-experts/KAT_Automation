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
// IFrame Checks Added                        |   11/12/2019    |        DH        |Minimal- need to expand Test |
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
//	WHEN - We CLICK on the <CONSUMERS> menu Item (Top Level)                                                         |
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
WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Web_Office/Directives/WebOffice_StartUp'), [:], FailureHandling.STOP_ON_FAILURE)

'--------------------------------------'
' Navigate Top level menu Item         |'
'--------------------------------------'
WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Web_Office/Navigation/Navigate_Consumers'), [:], FailureHandling.STOP_ON_FAILURE)

'--------------------------------------'
' Verify Returned Page Content         |'
'--------------------------------------'
// Central pane
'Central pane'
//WebUI.verifyElementVisible(findTestObject('Object Repository/WebOffice/Feedback_Top/Page_/a_Feedback'))
//WebUI.verifyTextPresent("Consumer Search", false)
WebUI.verifyElementVisible(findTestObject('Object Repository/WebOffice/Consumers/Page_/a_Consumers'))

WebUI.verifyElementVisible(findTestObject('Object Repository/WebOffice/Consumers/Page_/h4_Consumers'))

//WebUI.verifyElementVisible(findTestObject('Object Repository/WebOffice/Consumers/Page_/input_Consumers_btn'))
'-------------------------------'
'Left Hand Consumer Management  |'
'-------------------------------'
"Add Consumers"
//WebUI.verifyTextPresent("Add Consumer", false)
'Filter'

//WebUI.verifyElementVisible(findTestObject('Object Repository/Page_/h1_Consumer Search'))

//WebUI.verifyElementVisible(findTestObject('Object Repository/Page_/p_Use the filter on the left to perform a s_1828ae'))

//WebUI.verifyTextPresent("Use the filter on the left to perform a search of Consumers", false)
//Filter
WebUI.verifyTextPresent("Filter", false)
WebUI.verifyTextPresent("Forename", false)
WebUI.verifyTextPresent("Surname", false)
WebUI.verifyTextPresent("Mobile", false)
WebUI.verifyTextPresent("Email", false)
WebUI.verifyTextPresent("House", false)
WebUI.verifyTextPresent("Street", false)
WebUI.verifyTextPresent("Town", false)
WebUI.verifyTextPresent("City", false)
WebUI.verifyTextPresent("County", false)
WebUI.verifyTextPresent("Postcode", false)
WebUI.verifyTextPresent("Phone", false)
WebUI.verifyTextPresent("Status", false)
WebUI.verifyTextPresent("Type", false)
'Buttons'
//WebUI.verifyTextPresent("Apply", false)
WebUI.verifyTextPresent("Clear", false)

'--------------------------'
' Teardown - CLose Browser |'
'--------------------------'
WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Teardown'), [:], FailureHandling.OPTIONAL)
		
'--------------------------'
' END                      |'
'--------------------------'
