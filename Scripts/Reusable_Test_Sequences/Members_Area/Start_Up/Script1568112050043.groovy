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
// TEST HISTORY HEADER - |                                                                                                               |
//-----------------------
// Any changes to this script, please update the next available row below, with date, in the DATE CREATED column,
// Your NAme in the CREATED BY column, and Finaly, The actual change implemented in the NOTES column.
//
//---------------------------------------------------------------------------------------------------------------
//       Test Definition / Description        |   Date Created  |    Created By    |             Notes           |
//---------------------------------------------------------------------------------------------------------------
//  Startup for Members Area                  |   10/09/2019    |      DH          |                             |
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

def data = findTestData('Members_Test_Data')
def Header_Text = ""
def Forgotten_Password = ""
def Forgotten_Username = ""
def Trouble_Logging_In = ""


'URL - Set from the ENVIRONMENT PROFILE '
'OPEN BROWSER'
WebUI.openBrowser(GlobalVariable.URL)// 10/09/2019

//-----------------------------------------
'MAXIMIZE BROWSER '
WebUI.maximizeWindow()

//-----------------------------------------
'WAIT for browser to load - waits up to 60 seconds before timeout occurs '
WebUI.waitForPageLoad(60)

//WebUI.setText(findTestObject('Object Repository/Checkatrade_Trade_Search_Page/Page_Checkatrade Find a tradesperson you can trust/input_Search_Button_FF'),
//	findTestData('searchTestData').getValue('tradeClassification', GlobalVariable.row))

//------------------------
// Verify Header Text   //
//------------------------
'Verify Header Text'
//WebUI.verifyTextPresent(findTestData(data).getValue(Header_Text, GlobalVariable.row), false)
//------------------------
// Verify Forgotten Text//
//------------------------
'Verify Forgotten Password Text - Link'
//WebUI.verifyTextPresent(findTestData(data).getValue(Forgotten_Password, GlobalVariable.row), false)
//------------------------
// Verify Forgotten Text//
//------------------------
'Verify Forgotten Username Text - Link'
//WebUI.verifyTextPresent(findTestData(data).getValue(Forgotten_Username, GlobalVariable.row), false)
//------------------------
// Verify Forgotten Text//
//------------------------
'Verify Trouble Logging In Text - Link'
//WebUI.verifyTextPresent(findTestData(data).getValue(Trouble_Logging_In, GlobalVariable.row), false)

///////////////////////////////////////
//                END                //
///////////////////////////////////////
