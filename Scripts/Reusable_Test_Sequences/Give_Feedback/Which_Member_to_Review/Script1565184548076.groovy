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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import internal.GlobalVariable as GlobalVariable

//----------------------------------------------------------------------------------
// Give Feedback - Enter Company Name or Checkatrade ID in the Member Review Field  | - Snip - 07/08/2019
//----------------------------------------------------------------------------------

//'--------------------------------------------------'
//' Set the Trade Name or CAT ID in the Review Field |'
//'--------------------------------------------------'

// First hit from cold sometimes takes and age to render member lookup values
WebUI.waitForPageLoad(60)
WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Checkatrade Give your feedback/input_Which member do you want to review'), 25)

//----------------------------------------------------------
WebUI.setText(findTestObject('Object Repository/Page_Checkatrade Give your feedback/input_Which member do you want to review'), 
    findTestData('Give_Feedback (1)').getValue('Account_Verification_Name', GlobalVariable.row))

//----------------------------------------------------------------------------------
WebUI.delay(1) // page load 29/08/2019 - Delay reapplied 14/08/19, integral with the previous Settext Command (waits up to 1 second for activity to complete/work
   
//-------------------------------------------
'Submit the search criteria using click     |'
'-------------------------------------------'

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Checkatrade Give your feedback/div_Which member do you want to review'), 25)

'----------------------------------------------------------------------'
try {
    'Try Catch Included 14/08/2019 - Sometimes the Trader isnt returned?   |'
    '----------------------------------------------------------------------'

	//----------------------------------------------------------------------------------
    WebUI.click(findTestObject('Page_Checkatrade Give your feedback/div_Which member do you want to review')) 
}
catch (Exception e) {
    System.out.println.(' * * * Trader OR CAT ID <Detail reported in log>') 

    KeywordUtil.markFailed(' * * * Trader OR CAT ID ') 
} 
'----------------------------------------------------------------------'
//////////////////////////////
//// END
//////////////////////////////