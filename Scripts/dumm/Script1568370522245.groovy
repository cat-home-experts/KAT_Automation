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

WebUI.navigateToUrl('https://www.payatrader.com/hhpt_specific_trader.php?do=confirm_page')

WebUI.click(findTestObject('Page_Members Area/Payments/page_Payatrader_Confirm/input_Account ID_public_trader_id'))

WebUI.click(findTestObject('Page_Members Area/Payments/page_Payatrader_Confirm/input_Account ID_public_trader_id'))

WebUI.click(findTestObject('Page_Members Area/Payments/page_Payatrader_Confirm/input_Organisation Name_trader_business_name'))

WebUI.click(findTestObject('Page_Members Area/Payments/page_Payatrader_Confirm/input_Payment Card_card_last_four_display'))

WebUI.click(findTestObject('Page_Members Area/Payments/page_Payatrader_Confirm/input_Payment Amount_transaction_amount_pounds'))

WebUI.click(findTestObject('Page_Members Area/Payments/page_Payatrader_Confirm/input_Payment Amount_transaction_amount_pence'))

WebUI.click(findTestObject('Page_Members Area/Payments/page_Payatrader_Confirm/input_TCs'))

WebUI.click(findTestObject('Page_Members Area/Payments/page_Payatrader_Confirm/button_Confirm_Payment'))

