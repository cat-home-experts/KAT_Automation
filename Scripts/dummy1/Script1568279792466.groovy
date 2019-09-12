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

WebUI.navigateToUrl('https://preview-ma.checkatrade.com/login?return=%2Fdashboard')

WebUI.setText(findTestObject('Object Repository/Page_Members Area/input_Username_username'), 'check1234')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Members Area/input_Password_password'), 'fzqqY0qJjYTuJiVJRZh4ag==')

WebUI.click(findTestObject('Object Repository/Page_Members Area/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/div_My Feedback'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/input_Customer Town_btn btn-primary filter'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/a_Remind customer'))

WebUI.setText(findTestObject('Object Repository/Page_Members Area/input_concat(Customer  s name)_customerName'), 'Fred')

WebUI.click(findTestObject('Object Repository/Page_Members Area/a_Your Customers'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/p_These are your customers who have left feedback'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/a_Awareness'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/h2_Customer Feedback Awareness'))

