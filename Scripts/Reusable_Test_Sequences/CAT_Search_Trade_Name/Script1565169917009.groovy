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

//--------------------------------------------------------------------------------------
// Click Search Trade Name (and ID) From the Home Page after Entering Search Criteria  | - Snip - 07/08/2019
//--------------------------------------------------------------------------------------

   //-----------------------------------------
	'Hit Search Trade Person by Name (or CAT ID) after parameters are entered'
    //-----------------------------------------
    'Click on the Page to Refresh Search Results'
	WebUI.waitForElementPresent(findTestObject('Page_Checkatrade Find a tradesperson you can trust/span_Trade_Name'), 60)
    WebUI.click(findTestObject('Page_Checkatrade Find a tradesperson you can trust/span_Trade_Name'))
	//-----------------------------------------
	
	//-----------------------------------------
	'Waits only as long as required'
	WebUI.delay(2)
	WebUI.waitForPageLoad(60)
	//-----------------------------------------

//------------------------------------
// END                               | - Snip - 07/08/2019
//------------------------------------
