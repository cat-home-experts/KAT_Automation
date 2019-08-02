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
// TEST HISTORY HEADER - |                                                                                                               |
//-----------------------
// Any changes to this script, please update the next available row below, with date, in the DATE CREATED column,
// Your Name in the CREATED BY column, and Finaly, The actual change implemented in the NOTES column.
//
//---------------------------------------------------------------------------------------------------------------
//       Test Definition / Description        |   Date Created  |    Created By    |             Notes           |
//---------------------------------------------------------------------------------------------------------------
// Fires up the website (CAT), Dispels Cookie |                 |                  |                             |
// Nagging the Maximizes Browser              |    18/07/2019   |     Dave Horne   |                             |
//                                            |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
//                                            |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
//                                            |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
//                                            |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
//                                            |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
//
//---------------------------------------------------------------------------------------------------------------
//                                                                                                               |
//                                                                                                               |
//                                                                                                               |
//                                                                                                               |
//                                                                                                               |
//                                                                                                               |
//                                                                                                               |
//---------------------------------------------------------------------------------------------------------------
//-----------------------------------------
'OPEN BROWSER'
WebUI.openBrowser("")

//-----------------------------------------
'URL - Set from the ENVIRONMENT PROFILE '
WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.waitForPageLoad(60)

//-----------------------------------------
'MAXIMIZE BROWSER '
WebUI.maximizeWindow()

//-----------------------------------------
'COOKIE POLICY POPOUT'
WebUI.verifyTextPresent('Checkatrade.com uses cookies to make sure you get the best browsing experience', false)

//-----------------------------------------
'Closes COOKIE nagging element '
WebUI.click(findTestObject('Page_Checkatrade Find a tradesperson you can trust/div_close'))

//-----------------------------------------
'COOKIE POPOUT REMOVED'
WebUI.verifyTextNotPresent('Checkatrade.com uses cookies to make sure you get the best browsing experience', false)

//-----------------------------------------
// END