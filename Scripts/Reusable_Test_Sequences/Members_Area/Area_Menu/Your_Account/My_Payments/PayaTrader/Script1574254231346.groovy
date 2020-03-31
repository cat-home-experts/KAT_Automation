
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

//-----------------------
// TEST HISTORY HEADER - |
//-----------------------
// Any changes to this script, please update the next available row below, with date, in the DATE CREATED column,
// Your NAme in the CREATED BY column, and Finaly, The actual change implemented in the NOTES column.
//
//---------------------------------------------------------------------------------------------------------------
//       Test Definition / Description        |   Date Created  |    Created By    |             Notes           |
//---------------------------------------------------------------------------------------------------------------
//  Members Area Payments testing             |   20/11/2019    |        DH        | Make payments with dummy,   |
//  Fill initial page, then navigate to next  |                 |                  | Test Visa card -            |
//---------------------------------------------------------------------------------------------------------------
// URL Link to the payments portal changed    |    27/03/2020   |        DH        |                             |
//---------------------------------------------------------------------------------------------------------------
//                                            |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
//                                            |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
//                                            |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------
//                                                                                                               |
//	GIVEN -                                                                                                      |
//                                                                                                               |
//	WHEN -                                                                                                       |
//                                                                                                               |
//  THEN -                                                                                                       |
//                                                                                                               |
//---------------------------------------------------------------------------------------------------------------
'-----------------------------------------------------------------------------------------------------------'
// Intermediat stage - issues Verify Preset Values - Will Attemp Verification After This Form is Processed '|'
'-----------------------------------------------------------------------------------------------------------'
'--------------------------------'
'Read data from spreadsheet      |'
'--------------------------------'
def data = findTestData('Payments_Data') // put this into a method
def Account_ID = data.getValue('Account_ID', GlobalVariable.row)
def Address = data.getValue('Address', GlobalVariable.row)
def Email = data.getValue('Email', GlobalVariable.row)
def Invoice_Reference = data.getValue("Invoice_Reference", GlobalVariable.row)
def Name_Payee = data.getValue('Name_Payee', GlobalVariable.row)
def Payment_Description = data.getValue("Payment_Description", GlobalVariable.row) //
def Payment_Pence = data.getValue('Payment_Pence', GlobalVariable.row)
def Payment_Pounds = data.getValue('Payment_Pounds', GlobalVariable.row)
def Postcode = data.getValue('Postcode', GlobalVariable.row)
def Telephone = data.getValue('Telephone', GlobalVariable.row)

/////////////////////////////////////////////
//Wait for My Payments Element Availability//
/////////////////////////////////////////////
'--------------------------------------------'
'Previous Screen COMMIT Button'
WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Members Area/Payments/Pay_By_Card'), 25)

/////////////////////////////////////////////
// Click on <PAY BY CARD> Button           //
/////////////////////////////////////////////
WebUI.click(findTestObject('Object Repository/Page_Members Area/Payments/Pay_By_Card'))

/////////////////////////////////////////////
// Swith to NEW URL - Payments Portal      //
/////////////////////////////////////////////
WebUI.waitForPageLoad(20)

WebUI.switchToWindowUrl('https://www.payatrader.com/hhpt_specific_trader.php?tid=1061477&name=Checkatrade%20HQ%20-%20TRAINING/TEST%20PAGE&reference=218630')
//WebUI.switchToWindowUrl('https://www.payatrader.com/hhpt_specific_trader.php?tid=1061477&name=Checkatrade%20HQ%20-%20TRAINING/TEST%20PAGE%20&reference=218630')
//                         https://www.payatrader.com/hhpt_specific_trader.php?tid=1061477&name=Checkatrade%20HQ%20-%20TRAINING/TEST%20PAGE&reference=218630
WebUI.waitForPageLoad(20)
WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Members Area/Payments/Page_Payatrader/textarea_Description'), 25)
WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Members Area/Payments/Page_Payatrader/input_Account ID_public_trader_id'), 25)

/////////////////////////////////////////////
// Verification of Initial WELCOME Page    //
/////////////////////////////////////////////

'----------------------------------------------'
WebUI.verifyTextPresent("Call us on 0333 123 1243", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Welcome", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Details", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Pay", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Confirm", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Please complete all details", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Organisation Details", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Account ID", false)
'----------------------------------------------'
'Account ID'
//WebUI.verifyTextPresent(EXCEL VALUE, false) // 106147701 - account ID

//WebUI.verifyElementText(findTestObject('Object Repository/Page_Members Area/Payments/Page_Payatrader/input_Account ID_public_trader_id'), Account_ID)

//WebUI.verifyElementText(findTestObject('Object Repository/Page_Members Area/Payments/Page_Payatrader/input_Account ID_public_trader_id'), Account_ID)
//WebUI.verifyTextPresent(Account_ID, false)
'----------------------------------------------'
WebUI.verifyTextPresent("The Organisation you are going to pay is", false)
'----------------------------------------------'
//WebUI.verifyTextPresent("Checkatrade.com", false)
//WebUI.verifyTextPresent(findTestObject('Object Repository/Page_Members Area/Payments/Page_Payatrader/h_Organisation Details'), "Checkatrade.com")

'----------------------------------------------'
WebUI.verifyTextPresent("Description of Goods or Service / Reason for Payment", false)
'----------------------------------------------'
//WebUI.setText(findTestObject('Object Repository/Page_Members Area/Payments/Page_Paytrader/textarea_description'),
	//findTestData('Payments_Data').getValue('Payment_Description', GlobalVariable.row))
'PAYMENT DESCRIPTION'
WebUI.setText(findTestObject('Object Repository/Page_Members Area/Payments/Page_Payatrader/textarea_Description of Goods or Service  R_1e6ad8'),
	Payment_Description)
'----------------------------------------------'
'Payment Description'
//WebUI.verifyTextPresent(Payment_Description, false)
'----------------------------------------------'
// Date Provided - Defaults to TODAY        // Date goods or service provided
'----------------------------------------------'
WebUI.verifyTextPresent("Date goods or service provided", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Invoice Reference (if supplied)", false)
'----------------------------------------------'
'Invoice Reference'
//WebUI.verifyTextPresent(Invoice_Reference, false)
'----------------------------------------------'
// Scroll To Footer
WebUI.scrollToPosition(500, 500)
'----------------------------------------------'
WebUI.verifyTextPresent("Payment Amount", false)
'----------------------------------------------'
// PAYMENT AMOUNT - <POUNDS><PENCE>
'Pounds'
WebUI.setText(findTestObject('Object Repository/Page_Members Area/Payments/Page_Payatrader/input_Payment Amount_transaction_amount_pounds'), Payment_Pounds)
//WebUI.setText(findTestObject('Object Repository/Page_Members Area/Payments/Page_Paytrader/input_amount_pounds'),
//	findTestData('Payments_Data').getValue('Payment_Pounds', GlobalVariable.row))
'Pence'
'----------------------------------------------'
WebUI.setText(findTestObject('Object Repository/Page_Members Area/Payments/Page_Payatrader/input_Payment Amount_transaction_amount_pence'), Payment_Pence)
//WebUI.setText(findTestObject('Object Repository/Page_Members Area/Payments/Page_Paytrader/input_amount_pence'),
//	findTestData('Payments_Data').getValue('Payment_Pounds', GlobalVariable.row))
'----------------------------------------------'
WebUI.verifyTextPresent("Customer Details", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Name", false)
'----------------------------------------------'
'PAYEE'
//WebUI.setText(findTestObject('Object Repository/Page_Members Area/Payments/Page_Payatrader/input_The Organisation to pay'), Payment_Pence)

//WebUI.verifyTextPresent(EXCEL VALUE, false) // Checkatrade HQ - TRAINING/TEST PAGE  - Name Field
'Payee'
//WebUI.verifyTextPresent(Name_Payee, false)
'----------------------------------------------'
WebUI.verifyTextPresent("First Line of Address", false)
'----------------------------------------------'
//WebUI.verifyTextPresent(EXCEL VALUE, false) // First Line of Address
'Address'
WebUI.setText(findTestObject('Object Repository/Page_Members Area/Payments/Page_Payatrader/input_First Line of Address_householder_bui_104364'), Address)
//WebUI.setText(findTestObject('Object Repository/Page_Members Area/Payments/Page_Paytrader/input_Address'),
//	findTestData('Payments_Data').getValue('Address', GlobalVariable.row))
'----------------------------------------------'
WebUI.verifyTextPresent("Postcode", false)
'----------------------------------------------'
//WebUI.verifyTextPresent(EXCEL VALUE, false) // Postcode
'Postcode'
WebUI.setText(findTestObject('Object Repository/Page_Members Area/Payments/Page_Payatrader/input_Postcode_householder_postcode'), Postcode)
//WebUI.setText(findTestObject('Object Repository/Page_Members Area/Payments/Page_Paytrader/input_Postcode'),
//	findTestData('Payments_Data').getValue('Postcode', GlobalVariable.row))
'----------------------------------------------'
WebUI.verifyTextPresent("Contact Telephone Number", false)
'----------------------------------------------'
//WebUI.verifyTextPresent(EXCEL VALUE, false) // Contact Telephone Number
'Telephone'
WebUI.setText(findTestObject('Object Repository/Page_Members Area/Payments/Page_Payatrader/input_Contact Telephone Number_householder__a6db33'), Telephone)
//WebUI.setText(findTestObject('Object Repository/Page_Members Area/Payments/Page_Paytrader/input_Telephone'),
//	findTestData('Payments_Data').getValue('Telephone', GlobalVariable.row))
'----------------------------------------------'
WebUI.verifyTextPresent("Email Address for Receipt", false)
'----------------------------------------------'
//WebUI.verifyTextPresent(EXCEL VALUE, false) // Email Address for Receipt
'Email'
WebUI.setText(findTestObject('Object Repository/Page_Members Area/Payments/Page_Payatrader/input_Email Address for Receipt_customer_email'), Email)

//WebUI.setText(findTestObject('Object Repository/Page_Members Area/Payments/Page_Paytrader/input_Email'),
//	findTestData('Payments_Data').getValue('Email', GlobalVariable.row))
'----------------------------------------------'
WebUI.verifyTextPresent("leave blank if not UK", false)
'----------------------------------------------'
// WebUI.verifyTextPresent("Next Page", false)
'----------------------------------------------'
'NAVIGATE TO CARD ENTRY SCREEN'
'Hit <NEXT> Button'
WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Members Area/Payments/Page_Payatrader/Page_Payatrader - card payments made easy/input_Email Address for Receipt_next'), 10)

WebUI.click(findTestObject('Object Repository/Page_Members Area/Payments/Page_Payatrader/Page_Payatrader - card payments made easy/input_Email Address for Receipt_next'))
//WebUI.scrollToElement(findTestObject('Object Repository/Page_Members Area/a_Dashboard'), 10)


'NEED TO REVERT TO PREVIOUS URL - to satisfy logoff process'
//WebUI.switchToWindowUrl(GlobalVariable.MembersURL)

///////////////////////////////////////
//                END                //
///////////////////////////////////////