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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

//-------------------------------------------------------
// Verification - Required Search Returned as Expected  | - Snip - 07/08/2019
//-------------------------------------------------------
'Updated 05/12/2019 due to wholesale Home page changes'

// verifies the returns of Classification against Location
//-------------------------------------------
'Expected cantantenated text is Returned'
' DYNAMIC DELAY - Wait for <SEARCH> Button to Re-Appear after Search is completed'

'Unable To Wait For Object issue - Hence Hard Delay Prior To Web Page Loader'
WebUI.delay(3)
WebUI.waitForPageLoad(60)
//WebUI.waitForAngularLoad(30)
WebUI.delay(1)
'--------------------'
'----------------------------------------------------------------------------------------------------'
'PREVIEW INCONSISTENCY - SOMETIME THE FIRST ITERATION RETURNS 404 - SEEMS TO BE A PREVIEW GLITCH THAT OCCURS TOO OFTEN   |  23/03/2020 - DH'
'------------------------------------------------------------------------------------------------------------------------'


//if (WebUI.verifyTextPresent("404", false)){
//		
//	KeywordUtil.markFailed("FAILED TO RETURN SEARCH RESULTS - SYSTEM ERROR")
//}


'NEW Approach - Detect IMPROVE SEARCH PoPout and Syn on THIS'
//WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Checkatrade Find a tradesperson you can trust/aa_Improve_Your_Search_Popout'), 60)

//WebUI.delay(2)
//WebUI.waitForElementPresent(findTestObject('Object Repository/Checkatrade_Trade_Search_page/Page_Checkatrade Find a tradesperson you can trust/Searc_Sync_Point'), 25)
//WebUI.waitForPageLoad(60)
//WebUI.delay(2)
// COncantanation unrelaible - watch this space
//WebUI.verifyTextPresent(findTestData('searchTestData').getValue('tradeLocationVerification', GlobalVariable.row), false)
'Verify Returned Trade classification and Locaion is Returned'
WebUI.verifyTextPresent(findTestData('searchTestData').getValue('tradeClassification', GlobalVariable.row), false)
WebUI.verifyTextPresent(findTestData('searchTestData').getValue('tradeLocation', GlobalVariable.row), false)

//-------------------------------------------

//------------------------------------
// END                               | - Snip - 07/08/2019
//------------------------------------