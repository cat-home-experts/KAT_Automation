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
//  Search <My Feedback><Published Feedback>  |   18/09/2019    |      DH          |                             |
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
//   Wait for a_Awareness Element Availability  //
//////////////////////////////////////////////////
WebUI.waitForPageLoad(25)
WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Members Area/customer_Surname'), 5)

//////////////////////////////////////////////////
//   Enter Search Criteria Customer SURNAME     //
//////////////////////////////////////////////////
WebUI.click(findTestObject('Object Repository/Page_Members Area/customer_Surname'))
WebUI.setText(findTestObject('Object Repository/Page_Members Area/customer_Surname'),
	findTestData('Members_Test_Data').getValue('customer_Surname', GlobalVariable.row))

//////////////////////////////////////////////////
//   Enter Search Criteria Customer TOWN        //
//////////////////////////////////////////////////
WebUI.click(findTestObject('Object Repository/Page_Members Area/customer_Town'))
WebUI.setText(findTestObject('Object Repository/Page_Members Area/customer_Town'),
	findTestData('Members_Test_Data').getValue('customer_Town', GlobalVariable.row))

//////////////////////////////////////////////////
//   Hit <Apply Filter>                         //
//////////////////////////////////////////////////
WebUI.click(findTestObject('Object Repository/Page_Members Area/apply_Filter'))

//////////////////////////////////////////////////
//   Synchronise                                //
//////////////////////////////////////////////////
WebUI.delay(10) // desperation :-) other 2 syncs don't seem to work on this page - Not really, takes at leaast 10 seconds, so stick with this
WebUI.waitForPageLoad(60)
WebUI.scrollToPosition(500, 500)
WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Members Area/apply_Filter'), 60)

//////////////////////////////////////////////////
//   Verify Returned data from Search           //
//////////////////////////////////////////////////

WebUI.waitForPageLoad(25)
'---------------------------------' //---------------------------------------------------
'THIS TAB - Published Feedback    ' // Default, navigation back here to complete test   |
'---------------------------------' //---------------------------------------------------
WebUI.verifyTextPresent(findTestData('Members_Test_Data').getValue('returned_Search_Head', GlobalVariable.row), false)
'----------------------------------------------'
WebUI.verifyTextPresent(findTestData('Members_Test_Data').getValue('returned_Search_Comment', GlobalVariable.row), false)
'----------------------------------------------'
WebUI.verifyTextPresent(findTestData('Members_Test_Data').getValue('returned_Work_Done_Date', GlobalVariable.row), false)
'----------------------------------------------'
WebUI.verifyTextPresent(findTestData('Members_Test_Data').getValue('returned_Feedback_Status', GlobalVariable.row), false)
'----------------------------------------------'

///////////////////////////////////////
//                END                //
///////////////////////////////////////