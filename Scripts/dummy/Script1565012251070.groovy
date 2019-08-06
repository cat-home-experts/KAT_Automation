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

WebUI.click(findTestObject('Page_Checkatrade Find a tradesperson you can trust/div_close'))

WebUI.click(findTestObject('Page_Checkatrade Find a tradesperson you can trust/span_apply here'))

WebUI.setText(findTestObject('Object Repository/Page_Checkatrade Want to build your business/input_Email Address_ctl00contenttbContactEmail'), 
    'hhhh')

WebUI.click(findTestObject('Object Repository/Page_Checkatrade Want to build your business/div_Email AddressPlease enter a valid email address'))

WebUI.setText(findTestObject('Object Repository/Page_Checkatrade Want to build your business/input_Company Name_ctl00contenttbCompanyName'), 
    'hhhh')

WebUI.click(findTestObject('Object Repository/Page_Checkatrade Want to build your business/div_Trades Application'))

WebUI.click(findTestObject('Object Repository/Page_Checkatrade Want to build your business/div_Trades Application_1'))

WebUI.setText(findTestObject('Object Repository/Page_Checkatrade Want to build your business/input_Email Address_ctl00contenttbContactEmail'), 
    'hhhh@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Checkatrade Want to build your business/input_Your Full Name_ctl00contenttbContactName'), 
    'hhggh ghghhg ghghhgh')

WebUI.setText(findTestObject('Object Repository/Page_Checkatrade Want to build your business/input_Trade Category_join-now__category_autocomplete_input'), 
    'roofer')

WebUI.setText(findTestObject('Page_Checkatrade Want to build your business/input_Postcode_ctl00contenttbPostCode'), 'po12 4sd')

WebUI.setText(findTestObject('Object Repository/Page_Checkatrade Want to build your business/input_Contact Number_ctl00contenttbContactMob'), 
    '02380565656')

WebUI.click(findTestObject('Object Repository/Page_Checkatrade Want to build your business/input_membership terms and conditions_ctl00contentbtnSubmit'))

