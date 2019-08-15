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

WebUI.click(findTestObject('Object Repository/New Folder1/Page_Checkatrade Find a tradesperson you can trust/div_close'))

WebUI.click(findTestObject('Object Repository/New Folder1/Page_Checkatrade Find a tradesperson you can trust/span_on a trade youve used'))

WebUI.setText(findTestObject('Object Repository/New Folder1/Page_Checkatrade Give your feedback/input_Which member do you want to review_feedback-form__company_autocomplete_input'), 
    'test')

WebUI.click(findTestObject('Object Repository/New Folder1/Page_Checkatrade Give your feedback/span_Test Account'))

WebUI.click(findTestObject('Object Repository/New Folder1/Page_Checkatrade Give your feedback/span_The agreed price'))

WebUI.click(findTestObject('Object Repository/New Folder1/Page_Checkatrade Give your feedback/span_Yes'))

WebUI.click(findTestObject('Object Repository/New Folder1/Page_Checkatrade Give your feedback/input_No_ctl00contentButton4'))

WebUI.selectOptionByValue(findTestObject('Object Repository/New Folder1/Page_Checkatrade Give your feedback/select_--109876543210NA'), 
    '10', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/New Folder1/Page_Checkatrade Give your feedback/select_--109876543210NA_1'), 
    '10', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/New Folder1/Page_Checkatrade Give your feedback/select_--109876543210NA_2'), 
    '10', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/New Folder1/Page_Checkatrade Give your feedback/select_--109876543210NA_3'), 
    '10', true)

WebUI.setText(findTestObject('Object Repository/New Folder1/Page_Checkatrade Give your feedback/input_Brief description of work done_ctl00contenttbWorkDescription'), 
    'gggddggdgdg')

WebUI.setText(findTestObject('Object Repository/New Folder1/Page_Checkatrade Give your feedback/input_How many days did this job take'), 
    '3')

WebUI.setText(findTestObject('Object Repository/New Folder1/Page_Checkatrade Give your feedback/textarea_Your comments about the work_ctl00contenttbWorkComments'), 
    '34dfdffddffd')

WebUI.click(findTestObject('Object Repository/New Folder1/Page_Checkatrade Give your feedback/span_Yes'))

WebUI.click(findTestObject('Object Repository/New Folder1/Page_Checkatrade Give your feedback/input_No_ctl00contentButton6'))

WebUI.selectOptionByValue(findTestObject('Object Repository/New Folder1/Page_Checkatrade Give your feedback/select_MrMrsMissMsMr  MrsDrRevRevd'), 
    'Mr', true)

WebUI.setText(findTestObject('Object Repository/New Folder1/Page_Checkatrade Give your feedback/input_Name_ctl00contenttbCustomerName'), 
    'ddffdfdfdfd')

WebUI.setText(findTestObject('Object Repository/New Folder1/Page_Checkatrade Give your feedback/input_Your postcode_ctl00contentctlCustomerAddresstbPostcodeSearch'), 
    'po12 1sd')

WebUI.click(findTestObject('Object Repository/New Folder1/Page_Checkatrade Give your feedback/input_Your postcode_ctl00contentctlCustomerAddressbtnPostcodeLookup'))

WebUI.selectOptionByValue(findTestObject('Object Repository/New Folder1/Page_Checkatrade Give your feedback/select_Please select your address'), 
    'c1909b81-8db1-4a42-bfb8-8dbb5bbe7035', true)

WebUI.setText(findTestObject('Object Repository/New Folder1/Page_Checkatrade Give your feedback/input_Home telephone_ctl00contenttbCustomerHomePhone'), 
    '02392123456')

WebUI.setText(findTestObject('Object Repository/New Folder1/Page_Checkatrade Give your feedback/input_Best time to contact you_ctl00contenttbCustomerContactTime'), 
    'any')

WebUI.setText(findTestObject('Object Repository/New Folder1/Page_Checkatrade Give your feedback/input_Email_ctl00contenttbCustomerEmail'), 
    'sdsdds@dsdsds.com')

WebUI.setText(findTestObject('Object Repository/New Folder1/Page_Checkatrade Give your feedback/input_Mobile_ctl00contenttbCustomerMobile'), 
    '07788123345')

WebUI.selectOptionByValue(findTestObject('Object Repository/New Folder1/Page_Checkatrade Give your feedback/select_Please select'), 
    'online', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/New Folder1/Page_Checkatrade Give your feedback/select_Prefer not to say'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/New Folder1/Page_Checkatrade Give your feedback/input_here_ctl00contentButtonSubmit'))

WebUI.setText(findTestObject('Object Repository/New Folder1/Page_Checkatrade Give your feedback/input_Value Of Work_ctl00contenttbValueOfWork'), 
    '12000')

WebUI.click(findTestObject('Object Repository/New Folder1/Page_Checkatrade Give your feedback/input_Value Of Work_ctl00contentButton1'))

WebUI.click(findTestObject('Object Repository/New Folder1/Page_Checkatrade Give your feedback/a_Finish'))

