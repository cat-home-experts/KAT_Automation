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

WebUI.click(findTestObject('Object Repository/Page_Members Area/Payments/Page_Payatrader - card payments made easy/div_Welcome'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/Payments/Page_Payatrader - card payments made easy/div_Details'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/Payments/Page_Payatrader - card payments made easy/div_Pay'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/Payments/Page_Payatrader - card payments made easy/div_Confirm'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/Payments/Page_Payatrader - card payments made easy/label_Please complete all details'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/Payments/Page_Payatrader - card payments made easy/h1_Organisation Details'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/Payments/Page_Payatrader - card payments made easy/label_Account ID'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/Payments/Page_Payatrader - card payments made easy/input_Account ID_public_trader_id'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/Payments/Page_Payatrader - card payments made easy/label_The Organisation you are going to pay is'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/Payments/Page_Payatrader - card payments made easy/input_The Organisation you are going to pay_88e5ac'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/Payments/Page_Payatrader - card payments made easy/label_Description of Goods or Service  Reas_d0dc7f'))

WebUI.setText(findTestObject('Object Repository/Page_Members Area/Payments/Page_Payatrader - card payments made easy/textarea_Description of Goods or Service  R_1e6ad8'), 
    'Test Activity, Not a real transaction')

WebUI.click(findTestObject('Object Repository/Page_Members Area/Payments/Page_Payatrader - card payments made easy/div_010203040506070809101112131415161718192_392b5d'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/Payments/Page_Payatrader - card payments made easy/div_010203040506070809101112'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/Payments/Page_Payatrader - card payments made easy/label_Invoice Reference (if supplied)'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/Payments/Page_Payatrader - card payments made easy/input_Invoice Reference (if supplied)_trade_c0991f'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/Payments/Page_Payatrader - card payments made easy/label_Payment Amount'))

WebUI.setText(findTestObject('Object Repository/Page_Members Area/Payments/Page_Payatrader - card payments made easy/input_Payment Amount_transaction_amount_pounds'), 
    '500.0')

WebUI.setText(findTestObject('Object Repository/Page_Members Area/Payments/Page_Payatrader - card payments made easy/input_Payment Amount_transaction_amount_pence'), 
    '50')

WebUI.click(findTestObject('Object Repository/Page_Members Area/Payments/Page_Payatrader - card payments made easy/h3_Customer Details'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/Payments/Page_Payatrader - card payments made easy/input_Name_customer_name'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/Payments/Page_Payatrader - card payments made easy/label_First Line of Address'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/Payments/Page_Payatrader - card payments made easy/label_Postcode'))

WebUI.setText(findTestObject('Object Repository/Page_Members Area/Payments/Page_Payatrader - card payments made easy/input_First Line of Address_householder_bui_104364'), 
    'Test Address')

WebUI.setText(findTestObject('Object Repository/Page_Members Area/Payments/Page_Payatrader - card payments made easy/input_Postcode_householder_postcode'), 
    'SO4 9SD')

WebUI.click(findTestObject('Object Repository/Page_Members Area/Payments/Page_Payatrader - card payments made easy/div_leave blank if not UK'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/Payments/Page_Payatrader - card payments made easy/label_Contact Telephone Number'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/Payments/Page_Payatrader - card payments made easy/label_Email Address for Receipt'))

WebUI.setText(findTestObject('Object Repository/Page_Members Area/Payments/Page_Payatrader - card payments made easy/input_Contact Telephone Number_householder__a6db33'), 
    '07788461994')

WebUI.setText(findTestObject('Object Repository/Page_Members Area/Payments/Page_Payatrader - card payments made easy/input_Email Address for Receipt_customer_email'), 
    'testautomation.com')

WebUI.click(findTestObject('Object Repository/Page_Members Area/Payments/Page_Payatrader - card payments made easy/input_Email Address for Receipt_next'))

