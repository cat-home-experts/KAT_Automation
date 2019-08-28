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
import java.lang.Integer as Integer

//-----------------------
// TEST HISTORY HEADER - |                   FUNCTIONAL DEMO - REFACTOR TODO                                                                                            |
//-----------------------
// Any changes to this script, please update the next available row below, with date, in the DATE CREATED column,
// Your NAme in the CREATED BY column, and Finaly, The actual change implemented in the NOTES column.
//
//---------------------------------------------------------------------------------------------------------------
//       Test Definition / Description        |   Date Created  |    Created By    |             Notes           |
//---------------------------------------------------------------------------------------------------------------
// Test to confirm that the correct detail is |                 |                  | Single Search Undertaken    |
// returned for given 'Trade' and 'Location'  |    13/07/2019   |     Dave Horne   | Using External Test Data    |
// search criteria.                           |                 |                  | Provided on an Excel SSheet |
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
//	GIVEN - The Chekatrade Website 'SEARCHPAGE' is Presented on a Client Device                                  |
//                                                                                                               |
//	WHEN -  We Enter Trade and Location Search Criteria and Hit SEARCH                                           |
//                                                                                                               |
//  THEN -  The Resulting Search Results Page is Returned Along With a Valid Set of Results                      |
//                                                                                                               |
//---------------------------------------------------------------------------------------------------------------
// FOR DEMO PURPOSES - REAL TEST CASE WOULD USE SHARED RESOURCES FROM REAUSABLE TEST SEQUENCES
//-----------------------------------------
//Test Listener Manages Startup Processes
//-----------------------------------------
//for (def row = 1; row <= findTestData('searchTestData').getRowNumbers(); row++) {
//-----------------------------------------
//Test Listener Manages Startup Processes
'For Loop to Iterate over the test data provided by the Excel spreadsheet, \r\nassociated with this test\r\n'

'--------------------------'

' Startup Sequence         |'

'--------------------------'
WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Setup'), [:], FailureHandling.STOP_ON_FAILURE)

'--------------------------'

' Mobile Device Emulation  |'

'--------------------------'

WebUI.setViewPortSize(400, 700) // 400, 700
'Set viewport size 703x347'
//WebUI.setViewPortSize(findTestData('searchTestData').getValue.toInteger('X_COORD', 1), findTestData('searchTestData').getValue('Y_COORD', 
  //      1))
//
//        1 // Need to change data binding type to integer for these cells
//        ))
// GlobalVariable.row
'--------------------------'

' Search Trade             |'

'--------------------------'

'Set and SEARCH TRADE CLASSIFICATION'
WebUI.setText(findTestObject('Object Repository/Page_Checkatrade Find a tradesperson you can trust/input_Search through overrecommended vetted and monitored trades and service providers for free_trade_autocomplete_input'), 
    findTestData('searchTestData').getValue('tradeClassification', 1))

//------------------------------------------------------------------------------------------------------------------------------------------------
'--------------------------'

' Search Location          |'

'--------------------------'

'Set and SEARCH SELECTED LOCATION'
WebUI.setText(findTestObject('Object Repository/Checkatrade_Trade_Search_Page/Page_Checkatrade Find a tradesperson you can trust/input_location'), 
    findTestData('searchTestData').getValue('tradeLocation', 1))

//------------------------------------------------------------------------------------------------------------------------------------------------
'HIT SEARCH'
WebUI.scrollToElement(findTestObject('Object Repository/Checkatrade_Trade_Search_Page/Page_Checkatrade Find a tradesperson you can trust/a_Search'), 
    25)

'-------------'
WebUI.doubleClick(findTestObject('Object Repository/Checkatrade_Trade_Search_Page/Page_Checkatrade Find a tradesperson you can trust/a_Search'))

//------------------------------------------------------------------------------------------------------------------------------------------------
//WebUI.verifyTextPresent(findTestData('Crown Thinning in Gosport'), false)
//WebUI.verifyTextPresent(WebUI('Crown Thinning in Gosport'), false)
'Expected cantantenated text is Returned'
WebUI.verifyTextPresent('Crown Thinning in Gosport', false)

