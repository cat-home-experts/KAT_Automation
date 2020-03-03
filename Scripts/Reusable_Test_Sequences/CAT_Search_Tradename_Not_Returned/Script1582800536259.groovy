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
import com.kms.katalon.core.util.KeywordUtil

//-----------------------------------------------------------
// Verification - Required Search NOT Returned as Expected  | - Snip - 03/03/2020
//-----------------------------------------------------------
'For later Extension'
'--------------------------------'
' Verify Sorry and Not Here Link |'
'--------------------------------'

WebUI.delay(1)
WebUI.waitForPageLoad(60)
WebUI.verifyElementPresent(findTestObject('Page_Checkatrade Find a tradesperson you can trust/a_or look up a member by name'), 10)

// Sorry, no results found
WebUI.verifyTextPresent('Sorry, no results found', false)

// Not here Link
WebUI.verifyTextPresent('Not here', false)

'--------------------------------'
' Navigate Not Here Link         |'
'--------------------------------'

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Checkatrade Find a tradesperson you can trust/a_Not here'), 10)
WebUI.click(findTestObject('Object Repository/Page_Checkatrade Find a tradesperson you can trust/a_Not here'))

'--------------------------------'
' Verify Returned Page           |'
'--------------------------------'

WebUI.delay(2)
WebUI.waitForPageLoad(60)

'---------------------------------------'
WebUI.verifyTextPresent('Company not listed?', false)
'----------------------------------------'
WebUI.verifyTextPresent('If you are considering employing a particular company but cannot find them in our list of members', false)
'----------------------------------------'
WebUI.verifyTextPresent('it may be because they are not a member of Checkatrade', false)
'----------------------------------------'
WebUI.verifyTextPresent('If you would like to recommend a company to us, please give your feedback', false)
'----------------------------------------'
WebUI.verifyTextPresent('If you would like help searching for a company, please call 0333 0146 190', false)
'----------------------------------------'
'----------------------------------------'
'Give Feedback Link NOT CHECKED Here     |'
'----------------------------------------'


//------------------------------------
// END                               | - Snip - 27/02/2020
//------------------------------------
