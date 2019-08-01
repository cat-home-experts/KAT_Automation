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
import com.sun.media.sound.SoftReverb.Delay as Delay
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//-----------------------
// TEST HISTORY HEADER - |                                                                                      
//-----------------------
// Any changes to this script, please update the next available row below, with date, in the DATE CREATED column,
// Your NAme in the CREATED BY column, and Finaly, The actual change implemented in the NOTES column.
//
//---------------------------------------------------------------------------------------------------------------
//       Test Definition / Description        |   Date Created  |    Created By    |             Notes           |
//---------------------------------------------------------------------------------------------------------------
// Test to confirm that the correct detail is |                 |                  | Single Searches Undertaken|
// returned for given 'Trade Name' OR CAT ID  |    13/07/2019   |     Dave Horne   | Using External Test Data    |
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
//
//---------------------------------------------------------------------------------------------------------------
//                                                                                                               |
//	GIVEN - The Chekatrade Website 'SEARCHPAGE' is Presented on a Client Device                                  |
//                                                                                                               |
//	WHEN -  We we Click on 'look up member by name' Below the Trade entry Text box                               |
//                                                                                                               |
//	AND  -	We Enter The Traders 'Business Name' OR 'CAT ID' as Search Criteria and Hit SEARCH                   |
//                                                                                                               |
//  THEN -  The Resulting Search Results Page is Returned, Along With a Valid Result                             |
//                                                                                                               |
//---------------------------------------------------------------------------------------------------------------
'For Loop to Iterate over the test data provided by the Excel spreadsheet, \r\nassociated with this test'
for (def row = 1; row <= findTestData('searchTestData').getRowNumbers(); row++) {
    //-----------------------------------------
    // Call Setup Process - Browser Startup, Navigate, Maximize and Close Cookie Nagging Element
    //-----------------------------------------
    WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Setup'), [:], FailureHandling.STOP_ON_FAILURE)

    //-----------------------------------------
    //-----------------------------------------
    'Hit Search Trade Person by Name (Trade Name)'
    //WebUI.click(findTestObject('Page_Checkatrade Find a tradesperson you can trust/Hit_Search_Trader')) // changed 26/07/19 new deployment
	WebUI.click(findTestObject('Page_Checkatrade Find a tradesperson you can trust/a_or look up a member by name'))
    //WebUI.delay(2)
    WebUI.waitForPageLoad(60)

    //-----------------------------------------
    ' Wait for Element '

    //WebUI.waitForElementVisible('Object Repository/Page_Checkatrade Find a tradesperson you can trust/Trader_Name_To_Search', 10)
    //-----------------------------------------
    'Enter Trade Name in Text Field'
    WebUI.setText(findTestObject('Page_Checkatrade Find a tradesperson you can trust/Trader_Name_To_Search'), findTestData(
            'searchTestData').getValue('tradeName', row))

    //-----------------------------------------
    'Trade Name is Highlighted within the Popup List Box'

    //-----------------------------------------
    'Click on the Page to Refresh Search Results'
    WebUI.click(findTestObject('Page_Checkatrade Find a tradesperson you can trust/span_Trade_Name'))

    //-----------------------------------------
    //WebUI.delay(2)
    WebUI.waitForPageLoad(60)

    //-----------------------------------------
    'Scroll Element into VIEW, as the following text to verify can be off the screen'
    WebUI.scrollToElement(findTestObject('Page_of_Results/div_see all_footer__van-with-trailer'), 60)
	WebUI.delay(1)
    //-----------------------------------------
    // Text OFF Page is NOT Detected - Need to scroll down to verify textual content)
    'Verify the Correct Tradesperson is Returned'
    WebUI.verifyTextPresent(findTestData('searchTestData').getValue('tradeNameLocationVerification', row), false)

    'Verify the Primary Contacts Name'
    WebUI.verifyTextPresent(findTestData('searchTestData').getValue('primeContact', row), false)

    //-----------------------------------------
    // Call Teardown Process -
    //-----------------------------------------
    WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Teardown'), [:], FailureHandling.STOP_ON_FAILURE 
	//------------------------------------------------------------------------------------------------------------------------------------------------
    )
}

