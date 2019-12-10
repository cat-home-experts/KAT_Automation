import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
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
//  Created in Mid July                       |   15/07/2019    |        DH        |                             |
//---------------------------------------------------------------------------------------------------------------
//  XPath statement changed/updated           |   30/09/2019    |        DH        |  //*[@id="tbContactName"]   |
//---------------------------------------------------------------------------------------------------------------
//  Major Changes With Function, Implemented  |   06/12/2019    |        DH        |                             |
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

//------------------------------------------------------------------------
// Set Full Name during membership application form fill form fill       | - Snip - 31/07/2019
//------------------------------------------------------------------------
// old Function Left Intact
//WebUI.setText(findTestObject('Page_Checkatrade Want to build your business/input_Your Full Name_ctl00contenttbContactName'), GlobalVariable.FullName)

'---------------------------------'
' Set First Name Field on App Sc  |'
'---------------------------------'
WebUI.waitForElementClickable(findTestObject('Object Repository/Trades_Apply_Here/Page_Checkatrade Want to build your business/input_find out more_ctl00contenttbContactFirstName'), 10)
WebUI.setText(findTestObject('Object Repository/Trades_Apply_Here/Page_Checkatrade Want to build your business/input_find out more_ctl00contenttbContactFirstName'), GlobalVariable.aFirstName)

'---------------------------------'
' Set First Surname Field on App S|'
'---------------------------------'
WebUI.waitForElementClickable(findTestObject('Object Repository/Trades_Apply_Here/Page_Checkatrade Want to build your business/input_find out more_ctl00contenttbContactLastName'), 10)
WebUI.setText(findTestObject('Object Repository/Trades_Apply_Here/Page_Checkatrade Want to build your business/input_find out more_ctl00contenttbContactLastName'), GlobalVariable.aSurName)

//-------------------------------------------------------
// END                                                  | 
//-------------------------------------------------------
