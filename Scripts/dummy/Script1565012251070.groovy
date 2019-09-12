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

WebUI.click(findTestObject('Object Repository/Page_Members Area/a_Your Customers'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/div_My Feedback'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/a_Published Feedback'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/a_Remind customer'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/a_Your Customers_1'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/a_Awareness'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/a_Your Customers'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/a_Dashboard'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/a_Your Customers'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/div_Callback Requests'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/a_Settings'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/a_Dashboard'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/a_Your Customers'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/div_Received a Negative Review'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/div_Received a Negative Review'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/a_Grow Your Business'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/div_My Profile Page'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/i_Profile text_ace-icon fa fa-file-text-o bigger-400'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/a_Grow Your Business'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/a_Grow Your Business'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/a_Dashboard'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/a_Grow Your Business'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/div_My Photos'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/a_Dashboard'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/a_Grow Your Business'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/div_My Stats'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/a_Dashboard'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/a_Grow Your Business'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/div_Advertise in a Directory'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/a_Dashboard'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/a_Your Account'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/div_Membership'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/a_Dashboard'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/a_Your Account'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/div_Useful Documents'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/a_Dashboard'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/a_Your Account'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/div_Payments'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/a_Pay by Card'))

WebUI.switchToWindowTitle('Payatrader - card payments made easy')

WebUI.click(findTestObject('Object Repository/Page_Payatrader - card payments made easy/div_Welcome'))

WebUI.click(findTestObject('Object Repository/Page_Payatrader - card payments made easy/div_Details'))

WebUI.click(findTestObject('Object Repository/Page_Payatrader - card payments made easy/div_Pay'))

WebUI.click(findTestObject('Object Repository/Page_Payatrader - card payments made easy/div_Confirm'))

WebUI.switchToWindowTitle('Members Area')

WebUI.click(findTestObject('Object Repository/Page_Members Area/a_Dashboard'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/a_Your Account'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/div_Offers and Discounts'))

