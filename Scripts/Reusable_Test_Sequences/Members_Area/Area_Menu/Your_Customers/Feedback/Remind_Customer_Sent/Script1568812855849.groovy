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
//  Reminder Sent <Your Customers>            |   18/09/2019    |      DH          |                             |
//  <Remind Customer> From Members Feedback   |                 |                  |                             |
//  Pre-Existing Test Data "Mr Feedback of    |                 |                  |                             |
//  Chichester (From xlsheet, so extendable   |                 |                  |                             |
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

//////////////////////////////////////////////////
//   Wait for customer_Name Element Availability//
//////////////////////////////////////////////////
WebUI.waitForPageLoad(60)
WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Members Area/remind_Name'), 60)

//////////////////////////////////////////////////
//   Enter Criteria Customer SURNAME            // // Customer name and Customer Surname are treated equally in this test  (1 and the same)
//////////////////////////////////////////////////
WebUI.click(findTestObject('Object Repository/Page_Members Area/remind_Name'))
WebUI.setText(findTestObject('Object Repository/Page_Members Area/remind_Name'),
	findTestData('Members_Test_Data').getValue('customer_Surname', GlobalVariable.row))// re-use of previously search data

//////////////////////////////////////////////////
//   Enter Criteria Description of Work         //
//////////////////////////////////////////////////
WebUI.click(findTestObject('Object Repository/Page_Members Area/remind_Work_Description'))
WebUI.setText(findTestObject('Object Repository/Page_Members Area/remind_Work_Description'),
	findTestData('Members_Test_Data').getValue('returned_Search_Head', GlobalVariable.row)) // re-use of previously search data

//////////////////////////////////////////////////
//   Enter Criteria Customer EMAIL              // // Customer name and Customer Surname are treated equally in this test  (1 and the same)
//////////////////////////////////////////////////
WebUI.click(findTestObject('Object Repository/Page_Members Area/remind_Email'))
WebUI.setText(findTestObject('Object Repository/Page_Members Area/remind_Email'),
	findTestData('Members_Test_Data').getValue('customer_Email', GlobalVariable.row)) // re-use of previously search data

//////////////////////////////////////////////////
//   Enter Criteria Customer PHONE              // // Customer name and Customer Surname are treated equally in this test  (1 and the same)
//////////////////////////////////////////////////
WebUI.click(findTestObject('Object Repository/Page_Members Area/remind_Phone'))
WebUI.setText(findTestObject('Object Repository/Page_Members Area/remind_Phone'),
	findTestData('Members_Test_Data').getValue('Customer_Phone', GlobalVariable.row)) // re-use of previously search data

//////////////////////////////////////////////////
//   Hit <Submit>                               //
//////////////////////////////////////////////////
WebUI.scrollToPosition(250, 250)
WebUI.delay(2)
WebUI.waitForPageLoad(25)
WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Members Area/remind_Submit_Button'), 60)
WebUI.click(findTestObject('Object Repository/Page_Members Area/remind_Submit_Button'))

//////////////////////////////////////////////////
// Confirm Thank You Message and other Messaging//
//////////////////////////////////////////////////

WebUI.waitForPageLoad(60)
WebUI.delay(2) // will look at puttting aa waitforelement here - Not sure if the remind_Submit_Button is still visible and enabled after hitting once

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Members Area/remind_Message_Dispel'), 60)
'----------------------------------------------'
WebUI.verifyTextPresent('Thank you', false)
'----------------------------------------------'
WebUI.verifyTextPresent('Your data has been submitted', false)
'----------------------------------------------'

//////////////////////////////////////////////////
//   Dispel Thank You Message                   //
//////////////////////////////////////////////////
WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Members Area/remind_Message_Dispel'), 60)
WebUI.click(findTestObject('Object Repository/Page_Members Area/remind_Message_Dispel'))
WebUI.scrollToPosition(250, 250)
WebUI.waitForPageLoad(25)
///////////////////////////////////////
//                END                //
///////////////////////////////////////