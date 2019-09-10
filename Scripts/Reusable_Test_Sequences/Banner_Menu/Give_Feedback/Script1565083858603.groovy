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
// Hit Give Feedback from the Homepage Header Banner                     | - Snip - 06/08/2019 - 09/09/2019 - need to tidy repo to remove the space in the string
//------------------------------------------------------------------------

//----------------------------------------
'Hit Give Feedback from the Homepage Header Banner '
WebUI.click(findTestObject('Object Repository/Page_Checkatrade Find a tradesperson you can trust/a_Give feedback'))
//----------------------------------------

WebUI.waitForElementVisible(findTestObject('Page_Give_Feedback_Enhanced_OBJ_Repo/Page_Checkatrade Give your feedback/input_Which member do you want to review_feedback-form__company_autocomplete_input'), 25)
//WebUI.waitForPageLoad(60)

//----------------------------------------
'Verify "Give your feedback" text is returned when the page loads '
WebUI.verifyTextPresent('Give your feedback', false)
//----------------------------------------

//----------------------------------------
'Verify "Which member do you want to review?" text is returned when the page loads '
WebUI.verifyTextPresent('Which member do you want to review?', false)
//----------------------------------------

//-------------------------------------------------------
// END                                                  | - Snip - 06/08/2019 - wait for element added - this seems to be the last brrittle area 09/09/2019
//-------------------------------------------------------

