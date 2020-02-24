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
//                                            |    24/02/2020   |        DH        |                             |
//---------------------------------------------------------------------------------------------------------------
//                                            |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
//                                            |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
//                                            |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
//                                            |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------

'WIP TODO'

//---------------------------------------------------------------------------------------------------------------
//                                                                                                               |
//	GIVEN -  With Web Office Open                                                                                |
//                                                                                                               |
//	WHEN - We CLICK on the <CONSUMERS> menu Item (Top Level)                                                     |
//                                                                                                               |
//  THEN - Verify Details of the RETURNED Page are As Expected                                                   |
//                                                                                                               |
//---------------------------------------------------------------------------------------------------------------

'--------------------------------------'
' Navigate Top level menu Item         |'
'--------------------------------------'
WebUI.waitForPageLoad(60)
WebUI.waitForElementClickable(findTestObject('Object Repository/WebOffice_Home_page/a_Companies'), 60)


////////////////////////////////////////////
// Hover on Element                       //
////////////////////////////////////////////
WebUI.mouseOver(findTestObject('Object Repository/WebOffice_Home_page/a_Companies'))

////////////////////////////////////////////
//  Select Target menuItem Element        //
////////////////////////////////////////////
WebUI.waitForElementClickable(findTestObject('Object Repository/WebOffice_Home_page/a_Company_Advanced_Search'), 1)
WebUI.click(findTestObject('Object Repository/WebOffice_Home_page/a_Company_Advanced_Search'))

'--------------------------------------'

////////////////////////////////////////////
// Hover on Element                       //
////////////////////////////////////////////
WebUI.mouseOver(findTestObject('Object Repository/WebOffice_Home_page/a_Tools'))

////////////////////////////////////////////
//  Select Target menuItem Element        //
////////////////////////////////////////////
WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Members Area/Header_Menus/Page_Members Area/a_Acceptacard'), 1)
WebUI.click(findTestObject('Object Repository/Page_Members Area/Header_Menus/Page_Members Area/a_Acceptacard'))


///////////////////////////////////////
//                END                //
///////////////////////////////////////


'--------------------------'
' END                      |'
'--------------------------'
