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

WebUI.navigateToUrl('https://www.checkatrade.com/')

WebUI.click(findTestObject('Page_Checkatrade Find a tradesperson you can trust/div_close'))

WebUI.click(findTestObject('Page_Checkatrade Find a tradesperson you can trust/span_on a trade youve used'))

WebUI.setText(findTestObject('Object Repository/Page_Checkatrade Give your feedback/input_Which member do you want to review_feedback-form__company_autocomplete_input'), 
    'test')

WebUI.click(findTestObject('Object Repository/Page_Checkatrade Give your feedback/span_Test Account'))

WebUI.verifyElementVisible('Object Repository/Page_Checkatrade Give your feedback/span_The agreed price')

WebUI.click(findTestObject('Object Repository/Page_Checkatrade Give your feedback/span_The agreed price'))

WebUI.click(findTestObject('Page_Checkatrade Give your feedback/span_Yes_Feedback'))

WebUI.click(findTestObject('Object Repository/Page_Checkatrade Give your feedback/input_No_ctl00contentButton4'))

//-------------
WebUI.selectOptionByValue(findTestObject('Page_Checkatrade Give your feedback/select_--YS_Tidiness'), 
    '10', true)

WebUI.selectOptionByValue(findTestObject('Page_Checkatrade Give your feedback/select_--YS_Reliability'), 
    '10', true)

WebUI.selectOptionByValue(findTestObject('Page_Checkatrade Give your feedback/select_--YS_Courtesy'), 
    '10', true)

WebUI.selectOptionByValue(findTestObject('Page_Checkatrade Give your feedback/select_--YS_Workmanship'), 
    '10', true)
//-------------



WebUI.setText(findTestObject('Object Repository/Page_Checkatrade Give your feedback/input_Brief description of work done_ctl00contenttbWorkDescription'), 
    'Test Fixed Something')

WebUI.setText(findTestObject('Object Repository/Page_Checkatrade Give your feedback/input_How many days did this job take'), 
    '3')

WebUI.setText(findTestObject('Object Repository/Page_Checkatrade Give your feedback/textarea_Your comments about the work_ctl00contenttbWorkComments'), 
    'test comments')

WebUI.click(findTestObject('Page_Checkatrade Give your feedback/span_Yes_Feedback'))

WebUI.click(findTestObject('Object Repository/Page_Checkatrade Give your feedback/input_No_ctl00contentButton6'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Checkatrade Give your feedback/select_MrMrsMissMsMr  MrsDrRevRevd'), 
    'Mr', true)

WebUI.setText(findTestObject('Object Repository/Page_Checkatrade Give your feedback/input_Name_ctl00contenttbCustomerName'), 
    'Burt Tester Millichip')

WebUI.setText(findTestObject('Object Repository/Page_Checkatrade Give your feedback/input_Your postcode_ctl00contentctlCustomerAddresstbPostcodeSearch'), 
    'po12 2he')

WebUI.click(findTestObject('Object Repository/Page_Checkatrade Give your feedback/input_Your postcode_ctl00contentctlCustomerAddressbtnPostcodeLookup'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Checkatrade Give your feedback/select_Please select your address'), 
    '4798bfc4-62dc-41a3-aad7-8eb71a67e273', true)

WebUI.setText(findTestObject('Object Repository/Page_Checkatrade Give your feedback/input_Home telephone_ctl00contenttbCustomerHomePhone'), 
    '02392501673')

WebUI.setText(findTestObject('Object Repository/Page_Checkatrade Give your feedback/input_Best time to contact you_ctl00contenttbCustomerContactTime'), 
    'daytime')

WebUI.setText(findTestObject('Object Repository/Page_Checkatrade Give your feedback/input_Email_ctl00contenttbCustomerEmail'), 
    'test@hotmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Checkatrade Give your feedback/input_Mobile_ctl00contenttbCustomerMobile'), 
    '08899721721')

WebUI.click(findTestObject('Object Repository/Page_Checkatrade Give your feedback/span_Verify by SMS (Please provide a mobile number)'))

WebUI.click(findTestObject('Object Repository/Page_Checkatrade Give your feedback/span_Verify by email'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Checkatrade Give your feedback/select_Please selectTVRadioOnlineDirectoryWord'), 
    'trader', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Checkatrade Give your feedback/select_Prefer not to sayFound the Tradesperson via CheckatradecomDirected'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/Page_Checkatrade Give your feedback/input_I am happy to receive updates from selected third parties'))

WebUI.click(findTestObject('Object Repository/Page_Checkatrade Give your feedback/input_here_ctl00contentButtonSubmit'))

//WebUI.setText(findTestObject('Object Repository/Page_Checkatrade Give your feedback/input_Value Of Work_ctl00contenttbValueOfWork'), 
//    '10000')
//
//WebUI.click(findTestObject('Object Repository/Page_Checkatrade Give your feedback/input_Value Of Work_ctl00contentButton1'))


