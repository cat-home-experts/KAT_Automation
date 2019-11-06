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
import org.openqa.selenium.Keys as Keys
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent

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
WebUI.waitForElementPresent(findTestObject('Object Repository/Profiles_Page/Page_Members Area/button_Upload Company Logo'), 25)

////////////////////////////////////////////////////////////
// Take an Initial Screenshot of Company Logo Image Page  //
////////////////////////////////////////////////////////////

// Stores in Project <Screenshots> Folder
//CustomKeywords.'kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeEntirePageScreenshot'('Your_Customers_Company_Logo_Image.png', FailureHandling.OPTIONAL)

////////////////////////////////////////////////////////////
//         Verify Header Text on Key Portal Areas         //
////////////////////////////////////////////////////////////
'---------------------------------'
'THIS TAB - Company Logo Image    |'
'----------------------------------------------'
// MEMBER ID CHECK
WebUI.verifyTextPresent(findTestData('Members_Test_Data').getValue('MEMBER_ID', 1), false)
'----------------------------------------------'
WebUI.verifyTextPresent("MEMBER ID", false)
'----------------------------------------------'
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
WebUI.verifyTextPresent("Upload Company Logo", false)
'----------------------------------------------'
WebUI.verifyTextPresent("By uploading a logo you are confirming", false)
'----------------------------------------------'
WebUI.verifyTextPresent("House rules: All changes will be moderated", false)
'----------------------------------------------'
'----------------------------------------------'
// CHECKBOX IMAGE UPLOAD - CheckBox to enable Upload Button
WebUI.waitForElementClickable(findTestObject('Page_Members Area/Profiles/Page_Members Area/label_By uploading a logo'), 25)
WebUI.click(findTestObject('Page_Members Area/Profiles/Page_Members Area/label_By uploading a logo'))
'----------------------------------------------'
// Click UPLOAD Button - CheckBox to enable Upload Button
WebUI.waitForElementClickable(findTestObject('Object Repository/Profiles_Page/Page_Members Area/button_Upload Company Logo'), 25)
WebUI.click(findTestObject('Object Repository/Profiles_Page/Page_Members Area/button_Upload Company Logo'))
'----------------------------------------------'
// POPUP INPORT DIALOG/WINDOW
'----------------------------------------------'
// Sync on Dialog CLOSE Button Appearance
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('Object Repository/Profiles_Page/Page_Members Area/button_Close'), 25)
'----------------------------------------------'
WebUI.verifyTextPresent("Add Company Logo", false) // TODO
'----------------------------------------------'
WebUI.verifyTextPresent("Your New Logo", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Select Logo", false)
'----------------------------------------------'
WebUI.verifyTextPresent("The new photo needs to be a JPEG", false)
'----------------------------------------------'
WebUI.verifyTextPresent("For best results, the image should be", false)
'----------------------------------------------'
WebUI.verifyTextPresent("The image has to be 8MB or smaller", false)
'----------------------------------------------'
WebUI.verifyTextPresent("We recommend these browsers", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Close", false)
'----------------------------------------------'
// NEED TO EXTEND THE TOOL IF WE ARE TO INTERACT WITH WINDOWS COMPONENTS (Explorer)
// Clicking Select Brings Up Explorer Search Dialog) extension = Winnium
'----------------------------------------------'
// Open Windows Explorer to SEARCH - Disable Open Dialog Consistency Issues
// WebUI.click(findTestObject('Object Repository/Profiles_Page/Page_Members Area/button_Select Logo'))
// SELECT BANNER IMAGE FILE IN THE FUTURE // TODO
'----------------------------------------------'
WebUI.delay(2)
//// Dispel Explorer
////WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ESCAPE))
//Robot robot = new Robot()
//// Alt+F - Explorer File Menu
//// C     - Select C (Close
////robot.keyPress(KeyEvent.VK_ALT)
////robot.keyPress(KeyEvent.VK_F)
////robot.keyRelease(KeyEvent.VK_ALT)
////robot.keyRelease(KeyEvent.VK_F)
////robot.keyPress(KeyEvent.VK_C)
////robot.keyRelease(KeyEvent.VK_C)
//robot.keyPress(KeyEvent.VK_ESCAPE)
//robot.keyRelease(KeyEvent.VK_ESCAPE)
//robot.keyPress(KeyEvent.VK_ESCAPE)
//robot.keyRelease(KeyEvent.VK_ESCAPE)

///////////////////////////////////////
// Dispel The Windows Dialog         //
///////////////////////////////////////
'----------------------------------------------'
//WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Utils/Dispel_Windows_Dialog'), [:], FailureHandling.CONTINUE_ON_FAILURE)
'----------------------------------------------'

'----------------------------------------------'
'----------------------------------------------'
// Need To Close The popout
// WebUI.switchToWindowTitle("Add Company Logo")
WebUI.waitForElementClickable(findTestObject('Object Repository/Profiles_Page/Page_Members Area/button_Close'), 25)
WebUI.click(findTestObject('Object Repository/Profiles_Page/Page_Members Area/button_Close'))
'----------------------------------------------'
//WebUI.switchToWindowIndex(0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Profiles_Page/Page_Members Area/button_Upload Company Logo'), 25)
'----------------------------------------------'
// Need To HIT Back Button to Return to Previous Page
WebUI.back()
'----------------------------------------------'

///////////////////////////////////////
//                END                //
///////////////////////////////////////