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
//  Verify <Profile><Vetting Information> Page|   25/09/2019    |      DH          |                             |
//  from <Grow Your Business>                 |                 |                  |                             |
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
//     Wait for Add Acreditation Button Availability      //
////////////////////////////////////////////////////////////
WebUI.waitForElementPresent(findTestObject('Object Repository/Profiles_Page/Page_Members Area/button_Add Accreditation'), 25)

////////////////////////////////////////////////////////////
//     Take an Initial Screenshot of Banner Image Page    //
////////////////////////////////////////////////////////////

// Stores in Project <Screenshots> Folder
//CustomKeywords.'kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeEntirePageScreenshot'('Your_Customers_Vetting_Info.png', FailureHandling.OPTIONAL)

'Expected Page'
GlobalVariable.PAGE = "vetting-information"

'Extra check - tabbing on area, just confirm stable URL'

'Check URL Is The Correct One :-)'
WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Utils/Check_URL'), [:], FailureHandling.CONTINUE_ON_FAILURE)

////////////////////////////////////////////////////////////
//         Verify Header Text on Key Portal Areas         //
////////////////////////////////////////////////////////////
'---------------------------------'
'THIS TAB - Vetting Information   |'
'----------------------------------------------'
// MEMBER ID CHECK
WebUI.verifyTextPresent(findTestData('Members_Test_Data').getValue('MEMBER_ID', 1), false)
'----------------------------------------------'
WebUI.verifyTextPresent("MEMBER ID", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Update your accreditations and services here", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Accreditations & Memberships", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Below are the accreditations and memberships displayed on your profile page. You can add more by clicking on the link below", false)
'----------------------------------------------'
// Table takes a time to update
WebUI.waitForPageLoad(25)
WebUI.delay(5)
'----------------------------------------------'
WebUI.verifyTextPresent("Approved", false) //2 Instances???
'----------------------------------------------'
WebUI.verifyTextPresent("Type", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Description", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Expires", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Add Accreditation", false)
'----------------------------------------------'
// WebUI.verifyTextPresent("All changes are monitored by Checkatrade staff", false) // covered under sub folder
'----------------------------------------------'
WebUI.verifyTextPresent("Services", false)
'----------------------------------------------'
WebUI.verifyTextPresent("You may update the services that you offer to customers", false)
'----------------------------------------------'
'----------------------------------------------'
// Hit <Add Accreditation>
WebUI.waitForElementClickable(findTestObject('Object Repository/Profiles_Page/Page_Members Area/button_Add Accreditation'), 25)
WebUI.click(findTestObject('Object Repository/Profiles_Page/Page_Members Area/button_Add Accreditation'))
//----------------------------------------------
// Seperate Container For Add Accreditation
WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Validation/Profiles/Vetting_Information_Sub/Add_Accreditation'), [:], FailureHandling.CONTINUE_ON_FAILURE)
//----------------------------------------------
// Seperate Container For Service Section of Screem
WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Validation/Profiles/Vetting_Information_Sub/Services_Section'), [:], FailureHandling.CONTINUE_ON_FAILURE)
//----------------------------------------------
// Need To HIT Back Button to Return to Previous Page
WebUI.back()
'----------------------------------------------'
///////////////////////////////////////
//                END                //
///////////////////////////////////////