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

//-------------------------------------------------------------------------
// Give Feedback - Final page - Thank You!                                | - Snip - 14/08/2019 - To Refactor
//-------------------------------------------------------------------------


'------------------------------------'
'  Verify Page Detail                |'
'------------------------------------'
WebUI.verifyTextPresent('A Checkatrade staff member will now review your feedback for Test Account', false)

WebUI.verifyTextPresent('Finish', false)

WebUI.verifyTextPresent('Thank you!', false)


'------------------------------------'
'  Hit Finish                        |'
'------------------------------------'
WebUI.click(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/a_Finish'))


'------------------------------------'
'  Verify Return to Home Page        |'
'------------------------------------'
WebUI.verifyTextPresent('Helping you find the right trade or service', false)

WebUI.verifyTextPresent('Search through over 30,000 recommended, vetted and monitored trades and service providers for free.', false)

WebUI.verifyTextPresent('or look up a member by name', false)

//-------------------------------------------------------
// END                                                  | - Snip - 14/08/2019 - To Refactor
//-------------------------------------------------------