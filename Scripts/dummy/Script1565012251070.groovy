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

WebUI.click(findTestObject('Page_Checkatrade Find a tradesperson you can trust/a_Give feedbackon a trade youve used'))

WebUI.click(findTestObject('Object Repository/Feedback_Non_Recommend/Page_Checkatrade Give your feedback/div_Which member do you want to review'))

WebUI.setText(findTestObject('Object Repository/Feedback_Non_Recommend/Page_Checkatrade Give your feedback/input_Which member do you want to review_feedback-form'), 
    'test')

WebUI.click(findTestObject('Object Repository/Feedback_Non_Recommend/Page_Checkatrade Give your feedback/span_Test Account'))

WebUI.click(findTestObject('Object Repository/Feedback_Non_Recommend/Page_Checkatrade Give your feedback/span_No'))

WebUI.click(findTestObject('Object Repository/Feedback_Non_Recommend/Page_Checkatrade Give your feedback/span_Yes'))

WebUI.click(findTestObject('Object Repository/Feedback_Non_Recommend/Page_Checkatrade Give your feedback/span_Yes'))

WebUI.click(findTestObject('Object Repository/Feedback_Non_Recommend/Page_Checkatrade Give your feedback/span_No'))

WebUI.selectOptionByValue(findTestObject('Feedback_Non_Recommend/Page_Checkatrade Give your feedback/select_Please Select_Nature_of_Issue'), 
    '39', true)

