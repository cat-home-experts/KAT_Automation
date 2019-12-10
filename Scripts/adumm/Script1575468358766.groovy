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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject


WebUI.openBrowser('')

WebUI.navigateToUrl('https://preview-ma.checkatrade.com/login?return=%2Fmy-feedback')

WebUI.setText(findTestObject('Object Repository/Page_Members Area/input_Username_username'), 'check1234')

WebUI.setText(findTestObject('Object Repository/Page_Members Area/input_Password_password'), 'testing123')

WebUI.click(findTestObject('Object Repository/Page_Members Area/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/button_Go Away Maybe Later'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/button_Go Away Maybe Later'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/Header_Menus/Page_Members Area/a_Member Achievements'))

WebUI.click(findTestObject('Page_Members Area/Header_Menus/Page_Members Area/a_Policy TCs'))

WebUI.navigateToUrl('https://www.checkatrade.com/blog/terms-and-conditions/')

WebUI.click(findTestObject('Object Repository/Page_Members Area/button_Go Away Maybe Later'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/Header_Menus/Page_Members Area/a_Whistle Blower'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/Header_Menus/Page_Members Area/a_Acceptacard'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/Header_Menus/Page_Members Area/a_Featured Items'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/Header_Menus/Page_Members Area/a_Team Photos'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/Header_Menus/Page_Members Area/a_Manage Albums'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/Header_Menus/Page_Members Area/a_Contact Preferences'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/Header_Menus/Page_Members Area/a_Marketing Materials'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/Header_Menus/Page_Members Area/a_Scams'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/Header_Menus/Page_Members Area/a_Trading Standards Documents'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/Header_Menus/Page_Members Area/a_Your Account'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/Header_Menus/Page_Members Area/a_Grow Your Business'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/Header_Menus/Page_Members Area/a_Your Customers'))

