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
//  Card Details Fill                         |                 |                  | Test Visa card -            |
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
WebUI.verifyTextPresent("Confirm", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Please enter your Payment Card details", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Payment", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Name as it appears on your Card", false)
'----------------------------------------------'
'Name'
WebUI.setText(findTestObject('Object Repository/Page_Members Area/Payments/Page_Paytrader_Payment/input_Name as it appears'),
	findTestData('Payments_Data').getValue('Name_Payee', GlobalVariable.row))
'----------------------------------------------'
WebUI.verifyTextPresent("Card Number", false)
'----------------------------------------------'
'Card Number'
WebUI.setText(findTestObject('Object Repository/Page_Members Area/Payments/Page_Paytrader_Payment/input_Card Number'),
	findTestData('Payments_Data').getValue('Card_Number', GlobalVariable.row))
'----------------------------------------------'
WebUI.verifyTextPresent("Expiry Date", false)
'----------------------------------------------'
'Expiry MM'
WebUI.setText(findTestObject('Object Repository/Page_Members Area/Payments/Page_Paytrader_Payment/input_Expiry Date_MM'),
	findTestData('Payments_Data').getValue('Expiry_Date_MM', GlobalVariable.row))
'----------------------------------------------'
'Expiry YYYY'
WebUI.setText(findTestObject('Object Repository/Page_Members Area/Payments/Page_Paytrader_Payment/input_Expiry Date_YYYY'),
	findTestData('Payments_Data').getValue('Expiry_Date_YYYY', GlobalVariable.row))
'----------------------------------------------'
WebUI.verifyTextPresent("Solo/Maestro Only - Valid From", false)
'----------------------------------------------'
'Card Verification Number CVN'
WebUI.setText(findTestObject('Object Repository/Page_Members Area/Payments/Page_Paytrader_Payment/input_Card verification Number'),
	findTestData('Payments_Data').getValue('Card_Verification_Code', GlobalVariable.row))
'----------------------------------------------'
 
'----------------------------------------------'
WebUI.verifyTextPresent("Last 3 digits on the reverse of your card or 4 digits on the front for Amex", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Amount Payable", false)
'----------------------------------------------'
// PAYMENT AMOUNT - <POUNDS><PENCE>
'Pounds'
WebUI.setText(findTestObject('Object Repository/Page_Members Area/Payments/Page_Paytrader_Payment/input_Amount pounds'),
	findTestData('Payments_Data').getValue('Payment_Pounds', GlobalVariable.row))
'Pence'
'----------------------------------------------'
WebUI.setText(findTestObject('Object Repository/Page_Members Area/Payments/Page_Paytrader/input_Amount pence'),
	findTestData('Payments_Data').getValue('Payment_Pounds', GlobalVariable.row))
'----------------------------------------------'
// Scroll To Footer
WebUI.scrollToPosition(500, 500)
'----------------------------------------------'
WebUI.verifyTextPresent("Previous Page", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Next Page", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Any MasterCard, Visa or American Express card can be used with Paya Card Services including Maestro and Visa Electron card", false)
'----------------------------------------------'

'----------------------------------------------'
'NAVIGATE TO CARD ENTRY SCREEN'
'Hit <NEXT> Button'
WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Members Area/Payments/Page_Paytrader_Payment/page_Next'), 10)

WebUI.click(findTestObject('Object Repository/Page_Members Area/Payments/Page_Paytrader_Payment/page_Next'))


///////////////////////////////////////
//                END                //
///////////////////////////////////////
