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
//  Verify <Profile><Company Logo Image> Page |   13/09/2019    |      DH          |                             |
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
//   Wait for Update Company Logo Element Availability    //
////////////////////////////////////////////////////////////
WebUI.waitForElementPresent(findTestObject('Object Repository/Profiles_Page/Page_Members Area/h2_Update your company banner image here'), 25)

////////////////////////////////////////////////////////////
// Take an Initial Screenshot of Company Logo Image Page  //
////////////////////////////////////////////////////////////

// Stores in Project <Screenshots> Folder
CustomKeywords.'kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeEntirePageScreenshot'('Your_Customers_Company_Logo_Image.png', FailureHandling.OPTIONAL)

////////////////////////////////////////////////////////////
//         Verify Header Text on Key Portal Areas         //
////////////////////////////////////////////////////////////
'---------------------------------'
'THIS TAB - Company Logo Image    |'
'---------------------------------'
WebUI.verifyTextPresent("Choose a new image", false)
'----------------------------------------------'
WebUI.verifyTextPresent("The new logo needs to be a JPEG", false)
'----------------------------------------------'
WebUI.verifyTextPresent("For best results, the image should be", false)
'----------------------------------------------'
WebUI.verifyTextPresent("The image has to be 8MB or smaller", false)
'----------------------------------------------'
WebUI.verifyTextPresent("All changes are monitored by Checkatrade staff", false)
'----------------------------------------------'
WebUI.verifyTextPresent("By uploading a logo you are confirming", false)
'----------------------------------------------'
WebUI.verifyTextPresent("House rules: All changes will be moderated", false)
'----------------------------------------------'
'----------------------------------------------'
// CHECKBOX IMAGE UPLOAD - CheckBox to enable Upload Button
WebUI.click(findTestObject('Object Repository/Profiles_Page/Page_Members Area/input_image file_chkHouseRules'),5)
'----------------------------------------------'
'----------------------------------------------'
// Click UPLOAD Button - CheckBox to enable Upload Button
WebUI.click(findTestObject('Object Repository/Profiles_Page/Page_Members Area/button_Upload Company Logo'),5)
'----------------------------------------------'
'----------------------------------------------'
WebUI.verifyTextPresent("Add Company Logo", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Your New logo", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Select Logo", false)
'----------------------------------------------'
// NEED TO EXTEND THE TOOL IF WE ARE TO INTERACT WITH WINDOWS COMPONENTS (Explorer)
// Clicking Select Brings Up Explorer Search Dialog) extension = Winnium
'----------------------------------------------'
'----------------------------------------------'
// Need To Close The popout
WebUI.click(findTestObject('Object Repository/Profiles_Page/Page_Members Area/button_Close'))
'----------------------------------------------'
'----------------------------------------------'
// Need To HIT Back Button to Return to Previous Page
WebUI.back()
'----------------------------------------------'

///////////////////////////////////////
//                END                //
///////////////////////////////////////