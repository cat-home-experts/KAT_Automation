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
// Your NAme in the CREATED BY column, and Finaly, The actual change implemented in the NOTES column.
//
//---------------------------------------------------------------------------------------------------------------
//       Test Definition / Description        |   Date Created  |    Created By    |             Notes           |
//---------------------------------------------------------------------------------------------------------------
//  Navigate <MY PROFILE> from <Grow Your Bus>|   11/09/2019    |      DH          |                             |
//---------------------------------------------------------------------------------------------------------------
//  Selection Method Broken, Changed          |   19/11/2019    |      DH          |                             |
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

////////////////////////////////////////////
//Wait for My Profile Element Availability//
////////////////////////////////////////////

//WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Members Area/My_Profile_Page_img'), 25)
//WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Members Area/div_My Profile Page'), 60)
WebUI.waitForPageLoad(60)
////////////////////////////////////////////
//           Scroll To Element            //
////////////////////////////////////////////
//WebUI.scrollToElement(findTestObject('Object Repository/Page_Members Area/My_Profile_Page_img'), 5)
WebUI.scrollToElement(findTestObject('Object Repository/Page_Members Area/div_My Profile Page'), 5)

////////////////////////////////////////////
//  Click Log My Profile Element          //
////////////////////////////////////////////
//WebUI.click(findTestObject('Object Repository/Page_Members Area/My_Profile_Page_img'))
WebUI.click(findTestObject('Object Repository/Page_Members Area/div_My Profile Page'))

///////////////////////////////////////
//                END                //
///////////////////////////////////////