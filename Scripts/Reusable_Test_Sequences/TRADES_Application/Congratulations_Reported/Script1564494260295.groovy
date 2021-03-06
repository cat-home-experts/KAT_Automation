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
// Verify CONGRATULATIONS' is reported after form fill  | - Snip - 30/07/2019
//-------------------------------------------------------
'-----------------------------'
'Wait for SUCCESS page to load'
 WebUI.waitForPageLoad(60) // dynamic, waits only for page load, not the full, alloted time (unless slow or broken url)
 WebUI.delay(1)
 //--------------------------
 // Synch Added - 09/09/2019
// WebUI.waitForElementVisible(findTestObject('Page_Checkatrade Thank you/hi_Congratulations Header'), 10)
 '-----------------------------'
'Congratulation screen appears'
 WebUI.verifyTextPresent("Congratulations, you're one step closer to becoming a Checkatrade Member!", false)
'-----------------------------'
 WebUI.verifyTextPresent("One of the team will call you within 1 working day to discuss how a Checkatrade membership can work for you", false)
 '-----------------------------'
 WebUI.verifyTextPresent("Thank you for your interest, we look forward to speaking to you", false)
 '-----------------------------'
//-------------------------------------------------------
// END                                                  | - Snip - 30/07/2019 - 09/09/2019 hardening
//-------------------------------------------------------


