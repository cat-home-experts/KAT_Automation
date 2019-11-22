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

WebUI.navigateToUrl('https://www.payatrader.com/hhpt_specific_trader.php?tid=1061477&name=Checkatrade%20HQ%20-%20TRAINING/TEST%20PAGE%20&reference=218630')

WebUI.setText(findTestObject('Object Repository/Page_Members Area/Payments/Page_Payatrader/textarea_Description of Goods or Service  R_1e6ad8'), 
    'this is a test')

WebUI.setText(findTestObject('Object Repository/Page_Members Area/Payments/Page_Payatrader/Page_Payatrader/input_Payment Amount_transaction_amount_pounds'), 
    '500')

WebUI.setText(findTestObject('Object Repository/Page_Members Area/Payments/Page_Payatrader/Page_Payatrader/input_Payment Amount_transaction_amount_pence'), 
    '50')

WebUI.setText(findTestObject('Object Repository/Page_Members Area/Payments/Page_Payatrader/Page_Payatrader/input_First Line of Address_householder_bui_104364'), 
    'Bilding 200, Lakesdie')

WebUI.setText(findTestObject('Object Repository/Page_Members Area/Payments/Page_Payatrader/Page_Payatrader/input_Postcode_householder_postcode'), 
    'PO3 6NH')

WebUI.setText(findTestObject('Object Repository/Page_Members Area/Payments/Page_Payatrader/Page_Payatrader/input_Contact Telephone Number_householder__a6db33'), 
    '02392 123456')

WebUI.setText(findTestObject('Object Repository/Page_Members Area/Payments/Page_Payatrader/Page_Payatrader - card payments made easy/input_Email Address for Receipt_customer_email'), 
    'automation_tesr@chewckatrade.com')

WebUI.click(findTestObject('Object Repository/Page_Members Area/Payments/Page_Payatrader/Page_Payatrader/input_Email Address for Receipt_next'))

WebUI.navigateToUrl('https://www.payatrader.com/hhpt_details.php?do=details')

WebUI.click(findTestObject('Object Repository/Page_Members Area/Payments/Page_Payatrader/Page_Payatrader/input_Email Address for Receipt_next'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/Payments/Page_Payatrader/Page_Payatrader - card payments made easy/div_Email Address for Receipt'))

WebUI.setText(findTestObject('Object Repository/Page_Members Area/Payments/Page_Payatrader/Page_Payatrader - card payments made easy/input_Email Address for Receipt_customer_email'), 
    'megga@megga.com')

WebUI.click(findTestObject('Object Repository/Page_Members Area/Payments/Page_Payatrader/Page_Payatrader/input_Email Address for Receipt_next'))

WebUI.navigateToUrl('https://www.payatrader.com/hhpt_details.php?do=details')

WebUI.click(findTestObject('Object Repository/Page_Members Area/Payments/Page_Payatrader/Page_Payatrader - card payments made easy/input_Email Address for Receipt_next'))

