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

WebUI.click(findTestObject('Page_Checkatrade Find a tradesperson you can trust/a_Give feedback                                on a trade youve used'))

WebUI.setText(findTestObject('Object Repository/Non Recommend/Page_Checkatrade Give your feedback/input_Which member do you want to review'), 
    'testt')

WebUI.click(findTestObject('Object Repository/Non Recommend/Page_Checkatrade Give your feedback/div_Which member do you want to review'))

WebUI.click(findTestObject('Object Repository/Non Recommend/Page_Checkatrade Give your feedback/span_More than the agreed price but I was kept informed'))

WebUI.click(findTestObject('Object Repository/Non Recommend/Page_Checkatrade Give your feedback/span_No'))

WebUI.click(findTestObject('Object Repository/Non Recommend/Page_Checkatrade Give your feedback/span_No'))

WebUI.click(findTestObject('Object Repository/Non Recommend/Page_Checkatrade Give your feedback/span_Yes'))

WebUI.click(findTestObject('Object Repository/Non Recommend/Page_Checkatrade Give your feedback/span_No'))

WebUI.click(findTestObject('Object Repository/Non Recommend/Page_Checkatrade Give your feedback/span_Yes'))

WebUI.click(findTestObject('Object Repository/Non Recommend/Page_Checkatrade Give your feedback/span_No'))

WebUI.click(findTestObject('Object Repository/Non Recommend/Page_Checkatrade Give your feedback/span_Yes'))

