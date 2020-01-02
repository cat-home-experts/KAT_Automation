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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

//-----------------------
// TEST HISTORY HEADER - |                                                                                                               |
//-----------------------
// Any changes to this script, please update the next available row below, with date, in the DATE CREATED column,
// Your Name in the CREATED BY column, and Finaly, The actual change implemented in the NOTES column.
//
//---------------------------------------------------------------------------------------------------------------
//       Test Definition / Description        |   Date Created  |    Created By    |             Notes           |
//---------------------------------------------------------------------------------------------------------------
// Members Area URL Checks                    |                 |                  |                             |
// maybe should be more generis, evolution :-)|    02/12/2019   |        DH        |                             |
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
//
//---------------------------------------------------------------------------------------------------------------
//                                                                                                               |
//                                                                                                               |
//                                                                                                               |
//                                                                                                               |
//                                                                                                               |
//                                                                                                               |
//                                                                                                               |
//---------------------------------------------------------------------------------------------------------------

//------------------
WebUI.waitForPageLoad(10)
///////////////////////////////////////////////////////////
// Checks the URL is as expected                         //
///////////////////////////////////////////////////////////

// Verify We Are Returning to the CORRECT Home Page
GlobalVariable.CurrentUrl = WebUI.getUrl()
def step_Passed = "We have been redirected, correctly to the EXPECTED <MEMBERS> URL Page "+GlobalVariable.CurrentUrl
def step_Failed = "We have been redirected, incorrectly to this page "+GlobalVariable.CurrentUrl+" We should be on "+GlobalVariable.MembersURL+GlobalVariable.PAGE


if (GlobalVariable.CurrentUrl == GlobalVariable.MembersURL+GlobalVariable.PAGE){
	System.out.println(step_Passed);
	KeywordUtil.markPassed(step_Passed)
}
else {
	System.out.println(step_Failed);
	KeywordUtil.markFailed(step_Failed)
}
//-------------------------------------------------------
// END                                                  | - Snip - 02/12/2019 - ok
//-------------------------------------------------------
