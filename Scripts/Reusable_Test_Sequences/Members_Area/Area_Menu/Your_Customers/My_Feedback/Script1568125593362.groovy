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
//  Navigate <My Feedback>                    |   11/09/2019    |      DH          |                             |
//  from <Your Customers>                     |                 |                  |                             |
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
//   Wait for My Feedback Element Availability  //
//////////////////////////////////////////////////
//WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Members Area/div_My Feedback'), 25)

WebUI.waitForPageLoad(60)
WebUI.delay(1)
WebUI.scrollToElement(findTestObject('Object Repository/Page_Members Area/h_Dashboard_Header'), 25)
//WebUI.waitForPageLoad(60)
//WebUI.delay(5)
//WebUI.scrollToPosition(0, 0)

// Page Up
//WebUI.delay(1)
// Scroll Up a page
//WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ESCAPE))
//WebUI.sendKeys(findTestObject('Object Repository/Page_Members Area/p_Dashboard_Page'), Keys.chord(Keys.PAGE_UP))
//Robot robot = new Robot()
//robot.keyPress(KeyEvent.VK_PAGE_UP)
//robot.keyRelease(KeyEvent.VK_PAGE_UP)
//WebUI.waitForPageLoad(60)

//////////////////////////////////////////////////
//   Click Log My Feedback Request Element      //
//////////////////////////////////////////////////
WebUI.click(findTestObject('Object Repository/Page_Members Area/div_My Feedback'))

///////////////////////////////////////
//                END                //
///////////////////////////////////////