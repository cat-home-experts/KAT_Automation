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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

//---------------------------------------------------------------------------------------------------------------
//       Test Definition / Description        |   Date Created  |    Created By    |             Notes           |
//---------------------------------------------------------------------------------------------------------------
//  Settings->Web Office-> Sub Menu Item      |    23/04/2020   |        DH        |   a_Members Area Activity   |
//---------------------------------------------------------------------------------------------------------------
//                                            |                 |                  |      a_Laggards Report      |
//---------------------------------------------------------------------------------------------------------------
//                                            |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
//                                            |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
//                                            |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------
//                                                                                                               |
//	GIVEN -  With Web Office Open                                                                                |
//                                                                                                               |
//	WHEN - We CLICK on the <Settings> menu Item (Top Level) - Then Sub Menu Item WebOffice  (Members Area        |
//                                                                                                      Laggards |
//  THEN - Verify Details of the RETURNED Page are As Expected                                                   |
//                                                                                                               |
//---------------------------------------------------------------------------------------------------------------


'--------------------------------------'
' Navigate Top level menu Item         |'
'--------------------------------------'
WebUI.waitForPageLoad(60)
WebUI.waitForElementClickable(findTestObject('Object Repository/WebOffice_Home_page/a_Reports'), 60)


////////////////////////////////////////////
// Hover on Element                       //
////////////////////////////////////////////
WebUI.mouseOver(findTestObject('Object Repository/WebOffice_Home_page/a_Reports'))

////////////////////////////////////////////
// Hover on Element                       //
////////////////////////////////////////////
WebUI.click(findTestObject('Object Repository/WebOffice_Home_page/Page_/a_Members'))

////////////////////////////////////////////
// Hover on Element                       //
////////////////////////////////////////////
WebUI.click(findTestObject('Object Repository/WebOffice_Home_page/Page_/a_Members Area Activity'))

////////////////////////////////////////////
//  Select Target menuItem Element        //
////////////////////////////////////////////
WebUI.waitForPageLoad(5)
WebUI.waitForElementClickable(findTestObject('Object Repository/WebOffice_Home_page/Page_/a_Laggards Report'), 5)
WebUI.click(findTestObject('Object Repository/WebOffice_Home_page/Page_/a_Laggards Report'))

'--------------------------------------'

///////////////////////////////////////
//                END                //
///////////////////////////////////////
