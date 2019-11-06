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
//  Verify <Profile><Maximise Your Profile>   |   13/09/2019    |      DH          |                             |
//  page from <Grow Your Business>            |                 |                  |                             |
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

'######################################################################################################################################################################'
// Probaly not worth doing anything with YOUTUBE, apart from confirming Youtube/Checkatrade launches, clearly, any issues are 3rd Party, not 'in house' development   #'
'######################################################################################################################################################################'

////////////////////////////////////////////////////////////
//  Wait for Maximise Your Profile Element Availability   //
////////////////////////////////////////////////////////////
WebUI.delay(2)
WebUI.switchToWindowUrl('https://www.youtube.com/watch?v=ujuJlrazzGc&t=3s')
//WebUI.waitForElementPresent(findTestObject('Object Repository/Profiles_Page/Page_Checkatrade - Maximise your profile - YouTube/h1_Checkatrade -  Maximise your profile'), 25)

////////////////////////////////////////////////////////////
//Take an Initial Screenshot of Maximise Your Profile Page//
////////////////////////////////////////////////////////////

// Stores in Project <Screenshots> Folder
// CustomKeywords.'kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeEntirePageScreenshot'('Your_Customers_Maximise_Profile.png', FailureHandling.OPTIONAL)

////////////////////////////////////////////////////////////
//         Verify Header Text on Key Portal Areas         //
////////////////////////////////////////////////////////////
'---------------------------------'
'THIS TAB - Maximise Your Profile |'
'---------------------------------'
// Verify Heading Container Displayed Below Youtube Video window
//WebUI.verifyElementVisible(findTestObject("Object Repository/Profiles_Page/Page_Checkatrade - Maximise your profile - YouTube/h1_Checkatrade -  Maximise your profile"))
'----------------------------------------------'
// Verify Profile  Container Displayed Below Youtube Video window
//WebUI.verifyElementVisible(findTestObject("Object Repository/Profiles_Page/Page_Checkatrade - Maximise your profile - YouTube/ytd-expander_Your online tradesperson profile"))
'----------------------------------------------'
// WebUI.verifyElementVisible("Object Repository/Profiles_Page/h1_Checkatrade -  Maximise your profile")
'----------------------------------------------'
WebUI.delay(2)
'----------------------------------------------'
// Close the YOUTUBE Checkatrade Page
WebUI.closeWindowUrl('https://www.youtube.com/watch?v=ujuJlrazzGc&t=3s')
'----------------------------------------------'
// Wait for residual Youtube Death
WebUI.delay(1)
//WebUI.waitForPageLoad(60)
'----------------------------------------------'
// Switch Back To My Profile - Dashboard
WebUI.switchToWindowUrl('https://preview-ma.checkatrade.com/my-profile-page')
'----------------------------------------------'
///////////////////////////////////////
//                END                //
///////////////////////////////////////

