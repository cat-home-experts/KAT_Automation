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
	//----------------------------------------------------------
	//    def data = findTestData('searchTestData')
    //
    //    X_COORD = data.getValue('X_COORD', GlobalVariable.row)
    //
    //    Y_COORD = data.getValue('Y_COORD', GlobalVariable.row)
 	//----------------------------------------------------------
    //WebUI.setViewPortSize(703, 407)
    'Set viewport size 703x347'
    int XCOORD = 500
    int YCOORD = 700
	//----------------------------------------------------------	
	// Flaky Method, will break when the datasheet expands, issues grabbing data from excel using SetViewPortSize - 
	// Errors returned = property doesn't exist and data resolution issues - also, the dataset spreadsheet view, in the test suite is broken?
	//----------------------------------------------------------
	// Feed the View Port Settings From Here (Currentyl 5 Rows in 
	// the Datasheet - have set 10 rows here as an insurance polisy :-)
	//----------------------------------------------------------
	switch (GlobalVariable.row) {
		case 1: XCOORD = 200; YCOORD = 400; break
		case 2: XCOORD = 300; YCOORD = 500; break 
		case 3: XCOORD = 400; YCOORD = 600; break		
		case 4: XCOORD = 500; YCOORD = 700; break		
		case 5: XCOORD = 600; YCOORD = 800; break		
		case 6: XCOORD = 700; YCOORD = 900; break		
		case 7: XCOORD = 800; YCOORD = 1000; break
		case 8: XCOORD = 900; YCOORD = 1100; break
		case 9: XCOORD = 1000; YCOORD = 1200; break
		case 10:XCOORD = 1100; YCOORD = 1300; break
		default: XCOORD = 500; YCOORD = 700; break }
	//----------------------------------------------------------
	// Set View Port Size
	//----------------------------------------------------------
    WebUI.setViewPortSize(XCOORD, YCOORD)

    // WebUI.setViewPortSize(GlobalVariable.SetViewPortSize_XCOORD, GlobalVariable.SetViewPortSize_YCOORD)
    //WebUI.setViewPortSize(findTestData("searchTestData").ge
    //WebUI.setViewPortSize(findTestData('searchTestData').getValue('X_COORD', GlobalVariable.row),(findTestData('searchTestData').getValue('Y_COORD', GlobalVariable.row)))
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

	WebUI.delay(1)
    //------------------------------------------------------------------------------------------------------------------------------------------------
    'Expected cantantenated text is Returned'
    WebUI.verifyTextPresent('Crown Thinning in Gosport', false)
}

