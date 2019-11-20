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
//  Log On for Members Area                   |   10/09/2019    |      DH          |                             |
//---------------------------------------------------------------------------------------------------------------
//  New popout - Nagging, New Website Navige  |   19/11/2019    |      DH          |Extra dymamic delay added,   |
//                                            |                 |                  |wait 4 Logon Button to dispel|
//                                            |                 |                  |to aid synchronisation       |
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

///////////////////////////////////////
//  Wait for Login Element to Appear //
///////////////////////////////////////
WebUI.waitForElementPresent(findTestObject('Object Repository/Members/Page_Members Area/button_Log in'), 10)

///////////////////////////////////////
//  Enter Username                   //
///////////////////////////////////////

WebUI.click(findTestObject('Object Repository/Members/Page_Members Area/input_Username_username'))
WebUI.setText(findTestObject('Object Repository/Members/Page_Members Area/input_Username_username'), GlobalVariable.Username)

///////////////////////////////////////
//  Enter Password                   //
///////////////////////////////////////

WebUI.click(findTestObject('Object Repository/Members/Page_Members Area/input_Password_password'))
WebUI.setText(findTestObject('Object Repository/Members/Page_Members Area/input_Password_password'), GlobalVariable.Password) // setEncryptedText

///////////////////////////////////////
//   Hit the <Login> Button          //
///////////////////////////////////////

WebUI.click(findTestObject('Object Repository/Members/Page_Members Area/button_Log in'))
WebUI.waitForElementNotPresent(findTestObject('Object Repository/Members/Page_Members Area/button_Log in'), 25)

//-----------------------------------------
// New popout Window - 15/11/2019         |
//-----------------------------------------
WebUI.waitForPageLoad(60)
WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Members Area/Header_Attention_Text'), 60)
WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Utils/Popout_Handler'), [:], FailureHandling.CONTINUE_ON_FAILURE)


///////////////////////////////////////
//                END                //
///////////////////////////////////////