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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.preview.checkatrade.com/')

WebUI.click(findTestObject('Object Repository/Delete_me/Page_Checkatrade Find a tradesperson you can trust/div_close'))

WebUI.click(findTestObject('Object Repository/Delete_me/Page_Checkatrade Find a tradesperson you can trust/a_Give feedback on a trade youve used'))

WebUI.setText(findTestObject('Object Repository/Delete_me/Page_Checkatrade Give your feedback/input_Which member do you want to review_feedback-form__company_autocomplete_input'), 
    'test account')

WebUI.click(findTestObject('Object Repository/Delete_me/Page_Checkatrade Give your feedback/input_No_ctl00contentButton4'))

WebUI.click(findTestObject('Object Repository/Delete_me/Page_Checkatrade Give your feedback/span_The agreed price'))

WebUI.click(findTestObject('Object Repository/Delete_me/Page_Checkatrade Give your feedback/span_Yes'))

WebUI.click(findTestObject('Object Repository/Delete_me/Page_Checkatrade Give your feedback/input_Please select an answer_ctl00contentButton4'))

WebUI.click(findTestObject('Object Repository/Delete_me/Page_Checkatrade Give your feedback/input_No_ctl00contentButton6'))

WebUI.setText(findTestObject('Object Repository/Delete_me/Page_Checkatrade Give your feedback/input_Brief description of work done_ctl00contenttbWorkDescription'), 
    'dgfgdgdgdfgdgdfg')

WebUI.setText(findTestObject('Object Repository/Delete_me/Page_Checkatrade Give your feedback/textarea_Your comments about the work_ctl00contenttbWorkComments'), 
    'dgdgdgdgdgdgdgdgdgd')

WebUI.click(findTestObject('Object Repository/Delete_me/Page_Checkatrade Give your feedback/span_No'))

WebUI.click(findTestObject('Object Repository/Delete_me/Page_Checkatrade Give your feedback/label_We understand that you may not want us to'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Delete_me/Page_Checkatrade Give your feedback/select_--109876543210NA'), 
    '10', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Delete_me/Page_Checkatrade Give your feedback/select_--109876543210NA_1'), 
    '10', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Delete_me/Page_Checkatrade Give your feedback/select_--109876543210NA_2'), 
    '10', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Delete_me/Page_Checkatrade Give your feedback/select_--109876543210NA_3'), 
    '10', true)

WebUI.click(findTestObject('Object Repository/Delete_me/Page_Checkatrade Give your feedback/span_Yes'))

WebUI.click(findTestObject('Object Repository/Delete_me/Page_Checkatrade Give your feedback/input_No_ctl00contentButton6'))

WebUI.click(findTestObject('Object Repository/Delete_me/Page_Checkatrade Give your feedback/input_here_ctl00contentButtonSubmit'))

WebUI.click(findTestObject('Object Repository/Delete_me/Page_Checkatrade Give your feedback/label_Please supply a home telephone number so we can verify your feedback if necessary'))

WebUI.click(findTestObject('Object Repository/Delete_me/Page_Checkatrade Give your feedback/span_a trade customer'))

WebUI.click(findTestObject('Object Repository/Delete_me/Page_Checkatrade Give your feedback/input_here_ctl00contentButtonSubmit'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Delete_me/Page_Checkatrade Give your feedback/select_Please selectDirectoryRadioTVSports sponsorshipOnline'), 
    'tv', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Delete_me/Page_Checkatrade Give your feedback/select_Prefer not to sayFound the Tradesperson via Checkatradecom'), 
    '2', true)

