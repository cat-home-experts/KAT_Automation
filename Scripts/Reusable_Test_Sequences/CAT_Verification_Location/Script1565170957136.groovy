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

//-------------------------------------------------------
// Verification - Required Search Returned as Expected  | - Snip - 07/08/2019
//-------------------------------------------------------

// verifies the returns of Location for a Trader Name or CAT ID Search
//-------------------------------------------
   'Verify the Correct Location for the Trader is Returned'
   WebUI.waitForPageLoad(60)
    WebUI.verifyTextPresent(findTestData('Search_CAT_ID_Data (1)').getValue('tradeNameLocationVerification', GlobalVariable.row), false)
//-------------------------------------------

//------------------------------------
// END                               | - Snip - 07/08/2019
//------------------------------------
