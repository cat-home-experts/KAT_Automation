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

WebUI.navigateToUrl('https://www.preview.checkatrade.com/')

WebUI.click(findTestObject('Object Repository/New_Home/Page_Checkatrade Find a tradesperson you can trust/div_Cookie Policy'))

WebUI.click(findTestObject('Object Repository/New_Home/Page_Checkatrade Find a tradesperson you can trust/div_Checkatradecom uses cookies to make sur_bd828d'))

WebUI.click(findTestObject('Object Repository/New_Home/Page_Checkatrade Find a tradesperson you can trust/div_Close'))

WebUI.click(findTestObject('Object Repository/New_Home/Page_Checkatrade Find a tradesperson you can trust/div_Trades'))

WebUI.click(findTestObject('Object Repository/New_Home/Page_Checkatrade Find a tradesperson you can trust/a_Login To Members Area'))

WebUI.click(findTestObject('Object Repository/New_Home/Page_Checkatrade Find a tradesperson you can trust/div_Trades'))

WebUI.click(findTestObject('Object Repository/New_Home/Page_Checkatrade Find a tradesperson you can trust/a_Login To Members Area'))

WebUI.click(findTestObject('Object Repository/New_Home/Page_Checkatrade Find a tradesperson you can trust/div_Trades'))

WebUI.click(findTestObject('Object Repository/New_Home/Page_Checkatrade Find a tradesperson you can trust/a_Find out more'))

WebUI.click(findTestObject('Object Repository/New_Home/Page_Checkatrade Membership Overview/div_Homeowner'))

WebUI.click(findTestObject('Object Repository/New_Home/Page_Checkatrade Membership Overview/a_Find Your Expert'))

WebUI.click(findTestObject('Object Repository/New_Home/Page_Checkatrade Membership Overview/div_Homeowner'))

WebUI.click(findTestObject('Object Repository/New_Home/Page_Checkatrade Membership Overview/div_Leave a Review'))

WebUI.click(findTestObject('Object Repository/New_Home/Page_Checkatrade Membership Overview/div_Find out more'))

WebUI.click(findTestObject('Object Repository/New_Home/Page_Checkatrade Membership Overview/div_Homeowner'))

WebUI.click(findTestObject('Object Repository/New_Home/Page_Checkatrade Membership Overview/div_Trades'))

WebUI.click(findTestObject('Object Repository/New_Home/Page_Checkatrade Membership Overview/a_Find out more'))

WebUI.click(findTestObject('Object Repository/New_Home/Page_Trade Advice Centre - Checkatrade Blog/a_Trade'))

WebUI.click(findTestObject('Object Repository/New_Home/Page_Trade Advice Centre - Checkatrade Blog/a_Homeowner'))

WebUI.click(findTestObject('Object Repository/New_Home/Page_Homeowner Advice Centre - Checkatrade Blog/a_Trades sign in'))

WebUI.click(findTestObject('Object Repository/New_Home/Page_Homeowner Advice Centre - Checkatrade Blog/span_apply here'))

WebUI.click(findTestObject('Object Repository/New_Home/Page_Homeowner Advice Centre - Checkatrade Blog/a_Give feedbackon a trade youve used'))

WebUI.setText(findTestObject('Object Repository/New_Home/Page_Checkatrade Give your feedback/input_Which member do you want to review_fe_95fcf0'), 
    'bristol')

WebUI.click(findTestObject('Object Repository/New_Home/Page_Checkatrade Give your feedback/span_Bristol Car  Commercial'))

WebUI.click(findTestObject('Object Repository/New_Home/Page_Checkatrade Give your feedback/div_close'))

WebUI.click(findTestObject('Object Repository/New_Home/Page_Checkatrade Give your feedback/div_close_1'))

WebUI.click(findTestObject('Object Repository/New_Home/Page_Checkatrade Give your feedback/a_Checkatradecom'))

WebUI.click(findTestObject('Object Repository/New_Home/Page_Checkatrade Membership Overview/div_Trades'))

WebUI.click(findTestObject('Object Repository/New_Home/Page_Checkatrade Membership Overview/a_Login To Members Area'))

WebUI.click(findTestObject('Object Repository/New_Home/Page_Checkatrade Membership Overview/span_Trades Application'))

WebUI.click(findTestObject('Object Repository/New_Home/Page_Checkatrade Membership Overview/div_Trades'))

WebUI.click(findTestObject('Object Repository/New_Home/Page_Checkatrade Membership Overview/a_Login To Members Area'))

WebUI.click(findTestObject('Object Repository/New_Home/Page_Checkatrade Membership Overview/div_Trades'))

WebUI.click(findTestObject('Object Repository/New_Home/Page_Checkatrade Membership Overview/div_Trades'))

WebUI.click(findTestObject('Object Repository/New_Home/Page_Checkatrade Membership Overview/span_Trades Application'))

WebUI.click(findTestObject('Object Repository/New_Home/Page_Checkatrade Want to build your business/div_Trades'))

WebUI.click(findTestObject('Object Repository/New_Home/Page_Checkatrade Want to build your business/div_Trades'))

WebUI.click(findTestObject('Object Repository/New_Home/Page_Checkatrade Want to build your business/span_Trade Member Application'))

