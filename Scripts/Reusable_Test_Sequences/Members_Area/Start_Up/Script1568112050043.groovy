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
//  Extended to Access Specific Pages within  |                 |                  |                             |
//  The Members Areas                         |   16/09/2019    |      DH          | GlobalVariable.PAGE Added   |
//---------------------------------------------------------------------------------------------------------------
// Added the call to URL_Handler - Refer below|   23/09/2019    |      DH          |                             |
//---------------------------------------------------------------------------------------------------------------
// URL_Handler changes to cope with other     |   07/11/2019    |      DH          |                             |
// Functional Areas of the Web Site(s)        |                 |                  |                             |
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

//def data = findTestData('Members_Test_Data')
//def Header_Text = ""
//def Forgotten_Password = ""
//def Forgotten_Username = ""
//def Trouble_Logging_In = ""
'----------------------------------------------------'
'Set Function Area for "URL_Handler", URL Resolution'
GlobalVariable.FUNCTION_AREA = "Members_Area"
//-----------------------------------------
'Do Some Magic with URL(s) See the comments within URL Handler '
//WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Utils/URL_Handler'), [:], FailureHandling.CONTINUE_ON_FAILURE)
//-----------------------------------------
'URL - Set from the ENVIRONMENT PROFILE - Specific Page Address Provided By +GlobalVariable.MembersURL  '
'OPEN BROWSER'
WebUI.openBrowser(GlobalVariable.MembersURL)// 10/09/2019 - 16/09/2-19 - 23/09/2019
// WebUI.openBrowser(GlobalVariable.URL+"/my-profile-page") // Options for breaking up the Members Test into Reasonable Size Chunks // 13/09/2019
//-----------------------------------------
'WAIT for browser to load - waits up to 60 seconds before timeout occurs '
WebUI.waitForPageLoad(60)

//-----------------------------------------
'MAXIMIZE BROWSER '
WebUI.maximizeWindow()

//WebUI.setText(findTestObject('Object Repository/Checkatrade_Trade_Search_Page/Page_Checkatrade Find a tradesperson you can trust/input_Search_Button_FF'),
//	findTestData('searchTestData').getValue('tradeClassification', GlobalVariable.row))
//-----------------------------------------

//delay(1)
//------------------------
// Verify Header Text   //
//------------------------
'Verify Header Text'
// WebUI.verifyTextPresent(data.getValue("Header_Text", GlobalVariable.row), false)
WebUI.verifyTextPresent("EXCLUSIVE ACCESS FOR CHECKATRADE MEMBERS ONLY", false)
//------------------------
// Verify Forgotten Text//
//------------------------
'Verify Forgotten Password Text - Link'
//WebUI.verifyTextPresent(data.getValue("Forgotten_Password", GlobalVariable.row), false)
WebUI.verifyTextPresent("Forgotten password?", false)
//------------------------
// Verify Forgotten Text//
//------------------------
'Verify Forgotten Username Text - Link'
//WebUI.verifyTextPresent(data.getValue("Forgotten_Username", GlobalVariable.row), false)
WebUI.verifyTextPresent("Forgotten username?", false)

//------------------------
// Trouble Logging In    //
//------------------------
'Verify Trouble Logging In Text - Link'
WebUI.verifyTextPresent("Trouble logging in? No username and password? Contact Checkatrade Member Services by", false)
//WebUI.verifyTextPresent(data.getValue("Trouble_Logging_In", GlobalVariable.row), false)

//------------------------
// Member Services Link  //
//------------------------
'Member Services - Link'
WebUI.verifyTextPresent("memberservices@checkatrade.com", false)



///////////////////////////////////////
//                END                //
///////////////////////////////////////