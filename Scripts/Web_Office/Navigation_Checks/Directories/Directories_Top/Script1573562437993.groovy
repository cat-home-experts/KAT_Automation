import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
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
// Navigate and Verify Returned Content       |   12/11/2019    |        DH        |                             |
//---------------------------------------------------------------------------------------------------------------
// IFrame Checks Added                        |   11/12/2019    |        DH        |                             |
//---------------------------------------------------------------------------------------------------------------
// Removed Retention Letter Reference for Sync|   18/02/2020    |        DH        |                             |
//---------------------------------------------------------------------------------------------------------------
//                                            |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
//                                            |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------
//                                                                                                               |
//	GIVEN -  With Web Office Open                                                                                |
//                                                                                                               |
//	WHEN - We CLICK on the <DIRECTORIES> menu Item (Top Level)                                                         |
//                                                                                                               |
//  THEN - Verify Details of the RETURNED Page are As Expected                                                      |
//                                                                                                               |
//---------------------------------------------------------------------------------------------------------------

//-----------------------------------------
// Call Setup Process - Browser Startup, Navigate
//-----------------------------------------
'--------------------------------------'
' Web Office StartUp                  |'
'--------------------------------------'
WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Web_Office/Directives/WebOffice_StartUp'), [:], FailureHandling.OPTIONAL)

'--------------------------------------'
' Navigate Top level menu Item         |'
'--------------------------------------'
WebUI.waitForPageLoad(60)
WebUI.waitForElementClickable(findTestObject('Object Repository/WebOffice_Home_page/a_Directories'), 60)
WebUI.click(findTestObject('Object Repository/WebOffice_Home_page/a_Directories'))
// Synch on page Load
WebUI.waitForElementClickable(findTestObject('Object Repository/WebOffice/Directories_Top/Navigation_Search_Box'), 60)

'--------------------------------------'
' Verify Returned Page Content         |'
'--------------------------------------'
// Header
//WebUI.verifyTextPresent("Checkatrade Web Office", false)
WebUI.verifyTextPresent("Settings", false)
WebUI.verifyTextPresent("Include Non Members", false)
WebUI.verifyTextPresent("Welcome", false)
WebUI.verifyTextPresent("Not you?", false)
// Retention Letter Navigation
'Missing from DEV default - Could Use Edition Zero as these are Duplicates, Na'
// WebUI.verifyElementVisible(findTestObject("Object Repository/WebOffice/Directories_Top/Page_/a_Retention Letters"))
'-------------------------------'         
// Table Header Row
//WebUI.verifyTextPresent("CHURN +", false)
WebUI.verifyElementVisible(findTestObject("Object Repository/WebOffice/Directories_Top/Page_/th_Net Churn ()"))
//WebUI.verifyTextPresent("CHURN + (%)", false)
WebUI.verifyElementVisible(findTestObject("Object Repository/WebOffice/Directories_Top/Page_/th_Churn - ()"))
//WebUI.verifyTextPresent("CHURN -", false)
WebUI.verifyElementVisible(findTestObject("Object Repository/WebOffice/Directories_Top/Page_/th_Churn -"))
//WebUI.verifyTextPresent("CHURN - (%)", false)
WebUI.verifyElementVisible(findTestObject("Object Repository/WebOffice/Directories_Top/Page_/th_Churn  ()"))
//WebUI.verifyTextPresent("NET CHURN (%)", false)
WebUI.verifyElementVisible(findTestObject("Object Repository/WebOffice/Directories_Top/Page_/th_Churn"))
//WebUI.verifyTextPresent("P.E.", false)
WebUI.verifyElementVisible(findTestObject("Object Repository/WebOffice/Directories_Top/Page_/th_PE"))
'--------------------------------'
// Left Hand Navigation Tree
WebUI.verifyTextPresent("Directories", false)
WebUI.verifyTextPresent("Current", false)
WebUI.verifyTextPresent("Next", false)
WebUI.verifyTextPresent("Future Editions", false)
WebUI.verifyTextPresent("Previous Editions", false)
WebUI.verifyTextPresent("Edition Zero", false)
// Search Footer
WebUI.verifyTextPresent("Search", false)
WebUI.verifyTextPresent("Include future and previous editions", false)
WebUI.verifyTextPresent("SpaceFinder", false)

'--------------------------'
' Teardown - CLose Browser |'
'--------------------------'
WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Teardown'), [:], FailureHandling.OPTIONAL)
		
'--------------------------'
' END                      |'
'--------------------------'

