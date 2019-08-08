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

//--------------------------------------------------------------------
// Give Feedback - Set Recommendation Yes OR No (Default = Yes)      | - Snip - 07/08/2019
//--------------------------------------------------------------------

'Peculiarity - a disabled <NEXT> button is on the signin page, you enter criteria and load is automatic'

//-------------------------------------------
' Set the Trade Name or CAT ID in the Text Search Field'
WebUI.setText(findTestObject('Object Repository/Page_Checkatrade Give your feedback/input_Which member do you want to review_feedback-form__company_autocomplete_input'),
	findTestData('Give_Feedback (1)').getValue('Account_Verification_Name', GlobalVariable.row))

WebUI.delay(1)
//-------------------------------------------
'Submit the search criteria using click'
WebUI.click(findTestObject('Page_Checkatrade Give your feedback/div_Which member do you want to review'))
//WebUI.click(findTestObject('Object Repository/Page_Checkatrade Give your feedback/span_Test Account'))
//WebUI.click(findTestObject('Page_Checkatrade Give your feedback/input_Which member do you want to review_feedback-form__company_autocomplete_input'))
//-------------------------------------------

//------------------------------------
// END                               | - Snip - 07/08/2019
//------------------------------------