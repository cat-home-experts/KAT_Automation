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
// Your Name in the CREATED BY column, and Finaly, The actual change implemented in the NOTES column.
//
//---------------------------------------------------------------------------------------------------------------
//       Test Definition / Description        |   Date Created  |    Created By    |             Notes           |
//---------------------------------------------------------------------------------------------------------------
//  My Feedback Page Initial Validation Checks|   12/09/2019    |      DH          |                             |
//  Sub Tab = Received Negative Feedback      |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
//  Currently unable to resolve PDF Textual   |                 |                  |  needs a method added to    |
//  COntent, so currently the test only opens |                 |      DH          |  verify selective PDF       |
//  The PDF and scrolls to bottome of doc     |                 |                  |  content        TODO        |
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
//     Wait for Customers Name Element Availability       //
////////////////////////////////////////////////////////////
'New PAGE Opened - Displaying the front page of the membershipt Support Pack'

////////////////////////////////////////////////////////////
//     Take an Initial Screenshot of Home After Login     //
////////////////////////////////////////////////////////////
// WebUI.takeScreenshot('Reports/Screenshots/Initial_Members_page.png')
// Stores in Project <Screenshots> Folder
// CustomKeywords.'kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeEntirePageScreenshot'('Your_Customers_Membership_Support_Pack.png', FailureHandling.OPTIONAL)

////////////////////////////////////////////////////////////
//         Verify Header Text on Key Portal Areas         //
////////////////////////////////////////////////////////////
//'---------------------------------'
//'DEFAULT TAB - Membership Support ' PDF Download File Presented in VIEW (new window)
//'---------------------------------'
// No Members ID Reported on this Page
'------------------------------------------------'

//Switch Context to NEW PDF Windo
//WebUI.delay(5)
//WebUI.switchToWindowUrl(URL+'/assets/Resources/Documents/Membership%20Support%20Pack.pdf')
//WebUI.switchToWindowIndex(1)
// WebUI.switchToWindowTitle(URL+'/assets/Resources/Documents/Membership%20Support%20Pack.pdf')
'------------------------------------------------'
WebUI.verifyTextPresent("Membership", false)
//'----------------------------------------------'
//WebUI.verifyTextPresent("Support Pack", false)
//'----------------------------------------------'
//WebUI.verifyTextPresent("Check check check", false)
'------------------------------------------------'
// Scroll to PAGE End
'------------------------------------------------'
WebUI.delay(1)
// Dispel Explorer
//WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ESCAPE))
Robot robot = new Robot()
robot.keyPress(KeyEvent.VK_END)
robot.keyRelease(KeyEvent.VK_END)
'----------------------------------------------'

//'----------------------------------------------'
//WebUI.scrollToPosition(2000, 2000)
//WebUI.waitForPageLoad(60)
//WebUI.delay(5)
//'----------------------------------------------'
// Checks on last page test to ensure dicument is intact
//'----------------------------------------------'
//WebUI.verifyTextPresent("The correct procedure", false)
//'----------------------------------------------'
//WebUI.verifyTextPresent("Checkatrade DO NOT:", false)
//'----------------------------------------------'
//WebUI.verifyTextPresent("Must do", false)
//'----------------------------------------------'
//WebUI.verifyTextPresent("Can do", false)
//'----------------------------------------------'
//WebUI.verifyTextPresent("Why", false)
//'----------------------------------------------'

'------------------------------'
'CLOSE Newly Opend PDF Window  |'
'------------------------------'

//WebUI.closeWindowUrl(URL+'/assets/Resources/Documents/Membership%20Support%20Pack.pdf')

//WebUI.closeWindowTitle(URL+'/assets/Resources/Documents/Membership%20Support%20Pack.pdf')
///////////////////////////////////////
//                END                //
///////////////////////////////////////