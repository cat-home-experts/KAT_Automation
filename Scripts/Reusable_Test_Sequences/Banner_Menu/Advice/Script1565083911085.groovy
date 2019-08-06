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

//------------------------------------------------------------------------
// Hit Advice - from the Homepage Header Banner                          | - Snip - 06/08/2019  
//------------------------------------------------------------------------

//-------------------------------------------
'Hit Advice - from the Homepage Header Banner '
WebUI.click(findTestObject('Object Repository/Page_Checkatrade Find a tradesperson you can trust/a_Advice'))
//-------------------------------------------

//-------------------------------------------
'Verify, when the page loads that the text "Welcome to the Checkatrade advice centre" is returned'
WebUI.verifyTextPresent('Welcome to the Checkatrade advice centre', false)
//-------------------------------------------

//-------------------------------------------------------
// END                                                  | - Snip - 06/08/2019
//-------------------------------------------------------
