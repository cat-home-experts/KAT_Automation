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
//  Members Area Payments testing             |   21/11/2019    |      DH          | Make payments with dummy,   |
//  Confirmation page                         |                 |                  | Test Visa card -            |
//---------------------------------------------------------------------------------------------------------------
//                                            |                 |                  |                             |
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

'--------------------------------'
'Read data from spreadsheet      |'
'--------------------------------'
def data = findTestData('Payments_Data') // put this into a method
def Account_ID = data.getValue('Account_ID', GlobalVariable.row)
def Payment_Description = data.getValue("Payment_Description", GlobalVariable.row) //
def Card_Mask = data.getValue("Card_Mask", GlobalVariable.row)
def Payment_Pounds = data.getValue('Payment_Pounds', GlobalVariable.row)
def Payment_Pence = data.getValue('Payment_Pence', GlobalVariable.row)




/////////////////////////////////////////////
//Wait for My Payments Element Availability//
/////////////////////////////////////////////

'--------------------------------------------'
'Test Creditcard Numbers Sourced from SAGEPAY'
.// https://www.sagepay.co.uk/support/12/36/test-card-details-for-your-test-transactions
'////////////////////////////////////////////'
'--------------------------------------------'
'Previous Screen COMMIT Button'
//WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Members Area/Payments/Pay_By_Card'), 25)

/////////////////////////////////////////////
// Click on <PAY BY CARD> Button           //
/////////////////////////////////////////////
//WebUI.click(findTestObject('Object Repository/Page_Members Area/Payments/Pay_By_Card'))

/////////////////////////////////////////////
// Verification of Card Details Page       //
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
WebUI.verifyTextPresent("Please check the details of your payment, indicate your acceptance of the terms and conditions and then click the 'Confirm Payment' button", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Confirm", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Organisation Details", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Account ID", false)
'----------------------------------------------'
WebUI.verifyTextPresent(Account_ID, false)
'----------------------------------------------'
WebUI.verifyTextPresent("Organisation Name", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Checkatrade.com", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Description of Goods or Service", false)
'----------------------------------------------'
'Payment Description'
WebUI.verifyTextPresent(Payment_Description, false)
'----------------------------------------------'
WebUI.verifyTextPresent("Payment Details", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Payment Card", false)
'----------------------------------------------'
'Last 4 digits of Card'
'----------------------------------------------'
'Masked Card Number'
WebUI.verifyTextPresent(Card_Mask, false)
'----------------------------------------------'
WebUI.verifyTextPresent("Payment Amount", false)
'----------------------------------------------'
// Scroll To Footer
WebUI.scrollToPosition(500, 500)
'----------------------------------------------'
'Payment Pounds Amount'
WebUI.verifyTextPresent(Payment_Pounds, false)
'----------------------------------------------'
'payment Pence Amount'
WebUI.verifyTextPresent(Payment_Pence, false)
'----------------------------------------------'
WebUI.verifyTextPresent("Terms and Conditions", false)
'----------------------------------------------'
WebUI.verifyTextPresent("I have read and agree to the terms and conditions", false)
'----------------------------------------------'
WebUI.verifyTextPresent("When you click 'Confirm Payment', you may be taken to the secure Verified by Visa", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Mastercard SecureCode or Amex SafeKey web site for credit card verification", false)
'----------------------------------------------'
WebUI.verifyTextPresent("You will be returned to this website when this process is complete", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Previous page", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Confirm payment", false)
'----------------------------------------------'
'Select <TERMS> Checkbow'
'----------------------------------------------'

'CONFIRM PAYMENT'
WebUI.click(findTestObject('Object Repository/Page_Members Area/Payments/Page_Paytrader_Confirm/Confirm_Payment'))

'NAVIGATE TO CARD ENTRY SCREEN'
'Hit <NEXT> Button'
WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Members Area/Payments/Page_Paytrader_Confirm/Confirm_Payment'), 10)

WebUI.click(findTestObject('Object Repository/Page_Members Area/Payments/Page_Paytrader_Confirm/Confirm_Payment'))


///////////////////////////////////////
//                END                //
///////////////////////////////////////

