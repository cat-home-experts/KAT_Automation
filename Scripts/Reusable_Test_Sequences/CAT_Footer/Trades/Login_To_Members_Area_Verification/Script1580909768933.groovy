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
// Verify Footer Navigation is correct        |                 |                  |                             |
// navigating Trades->Login Members Returns   |    05/02/2020   |         DH       |                             |
// Membership Login Page VALIDATION           |                 |                  |                             |
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
WebUI.verifyTextPresent("membershipadvice@checkatrade.com", false) // memberservices@checkatrade.com


///////////////////////////////////////
//                END                //
///////////////////////////////////////
