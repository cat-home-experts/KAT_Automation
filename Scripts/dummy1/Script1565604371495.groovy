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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.preview.checkatrade.com/')

WebUI.click(findTestObject('Page_Checkatrade Find a tradesperson you can trust/div_close'))

WebUI.click(findTestObject('Page_Checkatrade Find a tradesperson you can trust/span_on a trade youve used'))

WebUI.setText(findTestObject('Page_Checkatrade Give your feedback/input_Which member do you want to review_feedback-form__company_autocomplete_input'), 
    'test')

WebUI.click(findTestObject('Page_Checkatrade Give your feedback/span_Test Account'))

WebUI.click(findTestObject('Page_Checkatrade Give your feedback/span_Yes_Feedback'))

WebUI.click(findTestObject('Page_Checkatrade Give your feedback/span_No_Experience_Feedback'))

WebUI.click(findTestObject('Page_Checkatrade Give your feedback/span_Yes_Feedback'))

WebUI.click(findTestObject('Page_Checkatrade Give your feedback/span_The agreed price'))

WebUI.click(findTestObject('Page_Checkatrade Give your feedback/span_I requested additional work and paid the agreed price'))

WebUI.click(findTestObject('Page_Checkatrade Give your feedback/span_More than the agreed price but I was kept informed'))

WebUI.click(findTestObject('Page_Checkatrade Give your feedback/span_More than the agreed price but I wasnt kept informed'))

WebUI.click(findTestObject('Page_Checkatrade Give your feedback/span_Not applicable - no estimate given'))

WebUI.click(findTestObject('Page_Checkatrade Give your feedback/span_Yes_Feedback'))

WebUI.click(findTestObject('Page_Checkatrade Give your feedback/span_No_Experience_Feedback'))

WebUI.click(findTestObject('Page_Checkatrade Give your feedback/span_Yes_Feedback'))

