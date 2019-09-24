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
//  My Profile Text Update Page Initial       |   19/09/2019    |      DH          |                             |
//  Validation Checks  = My Profile Page      |                 |                  |                             |
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

////////////////////////////////////////////////////////////
//     Wait for Awareness Element Availability            //
////////////////////////////////////////////////////////////
WebUI.waitForPageLoad(25)
WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Members Area/Profiles/update_Your_Profile_Text_Here'), 25)

////////////////////////////////////////////////////////////
//Take an Initial Screenshot of Update Profilr After Login//
////////////////////////////////////////////////////////////

// Stores in Project <Screenshots> Folder
CustomKeywords.'kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeEntirePageScreenshot'('Grow_Your_Business_Profile_Text.png', FailureHandling.OPTIONAL)

////////////////////////////////////////////////////////////
//         Verify Header Text on Key Portal Areas         //
////////////////////////////////////////////////////////////
'---------------------------------'
'THIS TAB - Profile Text          |'
'---------------------------------'
WebUI.verifyTextPresent("Update your profile text here", false)
'----------------------------------------------'
WebUI.verifyTextPresent("your own personel web page available on", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Checkatrade web page they see your company profile", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Company profile is important as this will be a consumer’s first insight in to you", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Are you a family run business, sole trader", false)
'----------------------------------------------'
WebUI.verifyTextPresent("How long have you had your Company", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Your profile should be short - customers will only read a few lines", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Please note that only the first 650 characters", false)
'----------------------------------------------'
//-----------------------------
// Back to PROFILE Block menu |
WebUI.back()
///////////////////////////////////////
//                END                //
///////////////////////////////////////
