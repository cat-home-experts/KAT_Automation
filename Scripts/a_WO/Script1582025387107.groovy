import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.dev.checkatrade.com/GiveFeedback/')

WebUI.setText(findTestObject('Page_Checkatrade Give your feedback/input_Which member do you want to review_fe_95fcf0'), 
    'test Account')

WebUI.click(findTestObject('Page_Checkatrade Give your feedback/span_Test Account'))

WebUI.click(findTestObject('Page_Checkatrade Give your feedback/span_No'))

WebUI.click(findTestObject('Page_Checkatrade Give your feedback/span_Yes'))

WebUI.click(findTestObject('Object Repository/Feedback/Page_Checkatrade Give your feedback/span_Other'))

WebUI.click(findTestObject('Object Repository/Feedback/Page_Checkatrade Give your feedback/span_Plumber'))

WebUI.click(findTestObject('Object Repository/Feedback/Page_Checkatrade Give your feedback/span_Other'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Feedback/Page_Checkatrade Give your feedback/select_Air ConditioningAlarms  SecurityAppl_6c61d9'), 
    '11', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Feedback/Page_Checkatrade Give your feedback/select_Air ConditioningAlarms  SecurityAppl_6c61d9'), 
    '1140', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Feedback/Page_Checkatrade Give your feedback/select_Air ConditioningAlarms  SecurityAppl_6c61d9'), 
    '9', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Feedback/Page_Checkatrade Give your feedback/select_Air ConditioningAlarms  SecurityAppl_6c61d9'), 
    '15', true)

