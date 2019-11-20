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
//  Verify Members <Dashboard> Content        |   26/09/2019    |      DH          |                             |
//  from The Homepage Header Menus            |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
//  Commented Ashot screen capture, evaluation|   30/09/2019    |      DH          |                             |
//  Extended Element Wait Times to 60         |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
//  New Website Popup presented on start up   |   15/11/2019    |      DH          |   Now detects and closes    |
//---------------------------------------------------------------------------------------------------------------
//  Aligned sync between this page an log_On  |   20/11/2019    |      DH          |                             |
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

/////////////////////////////////////////////////////
//     Wait for Dashboard Element Availability     //
/////////////////////////////////////////////////////

//WebUI.delay(5)
//WebUI.waitForPageLoad(60)
//WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Members Area/Header_Attention_Text'), 60)

//------------------------
// Popout Detectino   //
//------------------------
//WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Utils/Popout_Handler'), [:], FailureHandling.CONTINUE_ON_FAILURE) // TODO

// Page Refresh - Suddenly page not fully loading on PREVIEW - 26/09/2019
//WebUI.refresh()
WebUI.delay(2)
'---------------------------------'
'THIS TAB - DASHBOARD - PRIMARY   |' // DOC HEAD
'----------------------------------------------'
// MEMBER ID CHECK
WebUI.verifyTextPresent(findTestData('Members_Test_Data').getValue('MEMBER_ID', 1), false)
'----------------------------------------------'
WebUI.verifyTextPresent("MEMBER ID", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Dashboard", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Your Customers", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Grow Your Business", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Your Account", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Log off", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Contact us", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Item(s) that need your attention", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Accreditation(s) have expired", false)
'----------------------------------------------'
WebUI.verifyTextPresent("GAS SAFE REGISTER", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Reputation Report Cards", false)
'----------------------------------------------'
WebUI.verifyTextPresent("PAST 30 DAYS", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Add Your Company Logo", false)
'----------------------------------------------'
WebUI.verifyTextPresent("WHY NOT DISPLAY IT", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Your membership T", false)
'----------------------------------------------'
WebUI.verifyTextPresent("been updated", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Your Visitors", false)
'----------------------------------------------'

////////////////////////////////////////////
//           Scroll To Element            //
////////////////////////////////////////////
WebUI.scrollToElement(findTestObject('Object Repository/Page_Members Area/My_Profile_Page_img'), 5)

////////////////////////////////////////////
//              DOC CONTENT               //
////////////////////////////////////////////

'----------------------------------------------'
WebUI.verifyTextPresent("My Feedback", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Callback Requests", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Received a Negative Review", false)
'----------------------------------------------'
WebUI.verifyTextPresent("My Profile Page", false)
'----------------------------------------------'
WebUI.verifyTextPresent("My Photos", false)
'----------------------------------------------'
WebUI.verifyTextPresent("My Stats", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Advertise in a Directory", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Membership", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Useful Documents", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Payments", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Offers and Discounts", false)
'----------------------------------------------'

////////////////////////////////////////////
//           VISITORS SECTIONS            //
////////////////////////////////////////////

'----------------------------------------------'
WebUI.verifyTextPresent("Feedback", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Score", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Tidiness", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Reliability", false)
'----------------------------------------------'
WebUI.verifyTextPresent("TimeKeeping", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Courtesy", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Workmanship", false)
'----------------------------------------------'
WebUI.verifyTextPresent("3w", false)
'----------------------------------------------'
WebUI.verifyTextPresent("3m", false)
'----------------------------------------------'
WebUI.verifyTextPresent("3y", false)
'----------------------------------------------'


////////////////////////////////////////////
//                  END                   //
////////////////////////////////////////////

