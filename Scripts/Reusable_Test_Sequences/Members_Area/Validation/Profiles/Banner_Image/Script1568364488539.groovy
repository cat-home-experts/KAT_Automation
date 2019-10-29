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
//  Verify <Profile><Banner Image> Page       |   13/09/2019    |      DH          |                             |
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
//     Wait for Update Banner Element Availability        //
////////////////////////////////////////////////////////////
WebUI.waitForElementPresent(findTestObject('Object Repository/Profiles_Page/Page_Members Area/button_Upload Banner Image'), 25)

////////////////////////////////////////////////////////////
//     Take an Initial Screenshot of Banner Image Page    //
////////////////////////////////////////////////////////////

// Stores in Project <Screenshots> Folder
//CustomKeywords.'kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeEntirePageScreenshot'('Your_Customers_Banner_Image.png', FailureHandling.OPTIONAL)

////////////////////////////////////////////////////////////
//         Verify Header Text on Key Portal Areas         //
////////////////////////////////////////////////////////////
'---------------------------------'
'THIS TAB - Banner Image          |'
'----------------------------------------------'
// MEMBER ID CHECK
WebUI.verifyTextPresent(findTestData('Members_Test_Data').getValue('MEMBER_ID', 1), false)
'----------------------------------------------'
WebUI.verifyTextPresent("MEMBER ID", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Update your company banner image here", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Choose a new image", false)
'----------------------------------------------'
WebUI.verifyTextPresent("The new banner image needs to be a JPEG", false)
'----------------------------------------------'
WebUI.verifyTextPresent("For best results, the image should be", false)
'----------------------------------------------'
WebUI.verifyTextPresent("The image has to be 8MB or smaller", false)
'----------------------------------------------'
WebUI.verifyTextPresent("All changes are monitored by Checkatrade staff", false)
'----------------------------------------------'
WebUI.verifyTextPresent("By uploading an image you are confirming", false)
'----------------------------------------------'
WebUI.verifyTextPresent("House rules: All changes will be moderated", false)
'----------------------------------------------'
'----------------------------------------------'
// CHECKBOX IMAGE UPLOAD - CheckBox to enable Upload Button
WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Members Area/Profiles/Page_Members Area/label_By uploading an image'), 25)
WebUI.click(findTestObject('Object Repository/Page_Members Area/Profiles/Page_Members Area/label_By uploading an image'))
'----------------------------------------------'
'----------------------------------------------'
// Click UPLOAD Button - CheckBox to enable Upload Button
WebUI.waitForElementClickable(findTestObject('Object Repository/Profiles_Page/Page_Members Area/button_Upload Banner Image'), 25)
WebUI.click(findTestObject('Object Repository/Profiles_Page/Page_Members Area/button_Upload Banner Image'))
'----------------------------------------------'
// POPUP INPORT DIALOG/WINDOW
'----------------------------------------------'
// Sync on Dialog CLOSE Button Appearance
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('Object Repository/Profiles_Page/Page_Members Area/button_Close'), 25)
'----------------------------------------------'
WebUI.verifyTextPresent("Add Banner Image", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Your New Banner Image", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Select Banner Image", false)
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
// Open Windows Explorer to SEARCH
WebUI.click(findTestObject('Object Repository/Profiles_Page/Page_Members Area/button_Select Banner Image'))
// SELECT BANNER IMAGE FILE IN THE FUTURE // TODO
'----------------------------------------------'
//WebUI.delay(2)
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
WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Utils/Dispel_Windows_Dialog'), [:], FailureHandling.CONTINUE_ON_FAILURE)
'----------------------------------------------'

'----------------------------------------------'
'----------------------------------------------'
// Need To Close The popout
//WebUI.switchToWindowTitle("Add Banner Image", FailureHandling.CONTINUE_ON_FAILURE)
//WebUI.waitForElementClickable(findTestObject('Object Repository/Profiles_Page/Page_Members Area/button_Close'), 25)
//WebUI.click(findTestObject('Object Repository/Profiles_Page/Page_Members Area/button_Close'))
'----------------------------------------------'
WebUI.waitForElementPresent(findTestObject('Object Repository/Profiles_Page/Page_Members Area/button_Upload Banner Image'), 25)
'----------------------------------------------'
// Need To HIT Back Button to Return to Previous Page
WebUI.back()
'----------------------------------------------'

///////////////////////////////////////
//                END                //
///////////////////////////////////////