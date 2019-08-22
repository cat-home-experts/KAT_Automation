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
//	GIVEN - The Chekatrade Website 'SEARCHPAGE' is Presented on a Client Device with Various Resolutions Set     |
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
//-----------------------------------------
// Call Setup Process - Browser Startup, Navigate, Maximize and Close Cookie Nagging Element
//-----------------------------------------
'For Loop to Iterate over the test data provided by the Excel spreadsheet, \r\nassociated with this test\r\n'
for (GlobalVariable.row = 1; GlobalVariable.row <= findTestData('searchTestData').getRowNumbers(); (GlobalVariable.row)++) {
    
	//def removed for globalisation
    WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Setup'), [:], FailureHandling.STOP_ON_FAILURE)

    def data = findTestData('searchTestData')

    X_COORD = data.getValue('X_COORD', GlobalVariable.row)

    Y_COORD = data.getValue('Y_COORD', GlobalVariable.row)

    '--------------------------------'

    'Read data from spreadsheet      |'

    '--------------------------------'

    '--------------------------'

    ' Mobile Device Emulation  |'

    '--------------------------'

    //WebUI.setViewPortSize(703, 407)
    'Set viewport size 703x347'
    WebUI.setViewPortSize(X_COORD, Y_COORD)

	WebUI.setViewPortSize(findTestData('searchTestData').getValue('X_COORD', GlobalVariable.row),(findTestData('searchTestData').getValue('Y_COORD', GlobalVariable.row)))
	
	
	//  'Set and SEARCH TRADE CLASSIFICATION'
    WebUI.setText(findTestObject('Object Repository/Page_Checkatrade Find a tradesperson you can trust/input_Search through overrecommended vetted and monitored trades and service providers for free_trade_autocomplete_input'), 
        findTestData('searchTestData').getValue('tradeClassification', GlobalVariable.row))

    //------------------------------------------------------------------------------------------------------------------------------------------------
    'Set and SEARCH SELECTED LOCATION'
    WebUI.setText(findTestObject('Object Repository/Checkatrade_Trade_Search_Page/Page_Checkatrade Find a tradesperson you can trust/input_location'), 
        findTestData('searchTestData').getValue('tradeLocation', GlobalVariable.row))

    //------------------------------------------------------------------------------------------------------------------------------------------------
    'HIT SEARCH'
    WebUI.scrollToElement(findTestObject('Object Repository/Checkatrade_Trade_Search_Page/Page_Checkatrade Find a tradesperson you can trust/a_Search'), 
        5)

    '-------------'
    WebUI.doubleClick(findTestObject('Object Repository/Checkatrade_Trade_Search_Page/Page_Checkatrade Find a tradesperson you can trust/a_Search'))

    //------------------------------------------------------------------------------------------------------------------------------------------------
    'Expected cantantenated text is Returned'
    WebUI.verifyTextPresent('Crown Thinning in Gosport', false)
}

