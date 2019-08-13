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

WebUI.click(findTestObject('Object Repository/New Folder/Page_Checkatrade Find a tradesperson you can trust/div_close'))

WebUI.click(findTestObject('Object Repository/New Folder/Page_Checkatrade Find a tradesperson you can trust/a_Give feedback                                on a trade youve used'))

WebUI.setText(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/input_Which member do you want to review_feedback-form__company_autocomplete_input'), 
    'test')

WebUI.click(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/span_Chichester'))

WebUI.comment('Your Experience - First Page')

WebUI.click(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/span_Yes'))

WebUI.click(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/span_The agreed price'))

WebUI.click(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/span_Yes'))

WebUI.click(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/input_No_ctl00contentButton4'))

WebUI.comment('Page 3 - Your Scores')

WebUI.selectOptionByValue(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/select_--109876543210NA'), 
    '10', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/select_--109876543210NA_1'), 
    '10', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/select_--109876543210NA_2'), 
    '10', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/select_--109876543210NA_3'), 
    '10', true)

WebUI.click(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/div_Details of work done_Brief description of'))

WebUI.setText(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/input_Brief description of work done_ctl00contenttbWorkDescription'), 
    'New Kitchen Fitted')

WebUI.setText(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/input_How many days did this job take(Please enter a number between 0 and 180)_ctl00contenttbDuration'), 
    '3')

WebUI.setText(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/textarea_Your comments about the work_ctl00contenttbWorkComments'), 
    'work done')

WebUI.click(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/span_Yes'))

WebUI.click(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/input_No_ctl00contentButton6'))

WebUI.comment('Page 3 - Your Details')

WebUI.click(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/span_a trade customer'))

WebUI.click(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/span_an individual consumer'))

WebUI.selectOptionByValue(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/select_MrMrsMissMsMr  MrsDrRevRevd'), 
    'Mr', true)

WebUI.setText(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/input_Name_ctl00contenttbCustomerName'), 
    'Bert Millichip')

WebUI.setText(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/input_Your postcode_ctl00contentctlCustomerAddresstbPostcodeSearch'), 
    'po12 1sd')

WebUI.click(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/input_Your postcode_ctl00contentctlCustomerAddressbtnPostcodeLookup'))

WebUI.selectOptionByValue(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/select_Please select your address'), 
    'c1909b81-8db1-4a42-bfb8-8dbb5bbe7035', true)

WebUI.setText(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/input_Home telephone_ctl00contenttbCustomerHomePhone'), 
    '02392887766')

WebUI.setText(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/input_Best time to contact you_ctl00contenttbCustomerContactTime'), 
    'Any')

WebUI.setText(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/input_Email_ctl00contenttbCustomerEmail'), 
    'fggfgfg@dfddfdfd.com')

WebUI.click(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/div_I am'))

WebUI.setText(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/input_Mobile_ctl00contenttbCustomerMobile'), 
    '07788123456')

WebUI.click(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/span_Verify by SMS (Please provide a mobile number)'))

WebUI.click(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/span_Verify by email'))

WebUI.selectOptionByValue(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/select_Please selectOnlineRadioSports sponsorshipWord of mouthDirectoryTVTrader (including feedback cards)Other'), 
    'other', true)

WebUI.setText(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/input_How did you hear about Checkatrade_ctl00contenttbOther'), 
    'word of mouth')

WebUI.selectOptionByValue(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/select_Please selectOnlineRadioSports sponsorshipWord of mouthDirectoryTVTrader (including feedback cards)Other'), 
    'directory', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/select_Prefer not to sayFound the Tradesperson via CheckatradecomDirected to Checkatradecom by the Tradesperson'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/input_I am happy to receive updates from Checkatrade_ctl00contentchkEmailUpdates'))

WebUI.click(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/label_I am happy to receive updates from selected third parties'))

WebUI.click(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/input_here_ctl00contentButtonSubmit'))

WebUI.comment('')

WebUI.setText(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/input_Value Of Work_ctl00contenttbValueOfWork'), 
    '10000')

WebUI.click(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/input_Value Of Work_ctl00contentButton1'))

WebUI.comment('Give Yoir Feedback - Commited final Page')

WebUI.verifyTextPresent('Test Account', false)

WebUI.comment('Finish')

WebUI.verifyTextPresent('Finish', false)

WebUI.click(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/a_Finish'))

WebUI.comment('Verify Home Page is Returned')

WebUI.verifyTextPresent('Helping you find the right trade or service', false)

