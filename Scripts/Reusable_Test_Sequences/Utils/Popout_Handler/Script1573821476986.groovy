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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

//Snippit that was produced to handle the sudden appearance of a POPUP Screen - New Website Nagger

'---------------------------------------------------------------------------------'
// Bahvioral changes - 10/02/2020 - Removed Try Catch for If Else - DH
'---------------------------------------------------------------------------------'

//WebUI.delay(2)
//WebUI.waitForPageLoad(60)
//
//
//if (!WebUI.verifyElementPresent(findTestObject('Object Repository/Popout/go_Away'))) {
//	
//	KeywordUtil.markPassed(" View Our New Website POPOUT NOT Displayed")
//} else {
//
//	WebUI.click(findTestObject('Object Repository/Popout/go_Away'))
//	KeywordUtil.markPassed(" View Our New Website POPOUT Displayed and Dispelled")
//}

// Commented 10/02/2020

//try {
//
//	if ('Object Repository/Popout/go_Away'){
//		WebUI.click(findTestObject('Object Repository/Popout/go_Away'))
//		KeywordUtil.markPassed(" View Our New Website POPOUT Displayed")
//	}	
//} catch (Exception e) {
//   // Nothing to do, as popout wasn't presented
//		KeywordUtil.markPassed(" View Our New Website POPOUT NOT Displayed")
//}

// End
