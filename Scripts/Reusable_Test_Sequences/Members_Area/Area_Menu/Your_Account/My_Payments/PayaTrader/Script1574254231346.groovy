
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
//  Members Area Payments testing             |   20/11/2019    |      DH          | Make payments with dummy,   |
//  Fill initial page, then navigate to next  |                 |                  | Test Visa card -            |
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
'Previous Screen COMMIT Button'
WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Members Area/Payments/Pay_By_Card'), 25)

/////////////////////////////////////////////
// Click on <PAY BY CARD> Button           //
/////////////////////////////////////////////
WebUI.click(findTestObject('Object Repository/Page_Members Area/Payments/Pay_By_Card'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Members Area/Payments/Page_Payatrader/button_Next'), 25)
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
WebUI.verifyTextPresent(findTestData('Payments_Data').getValue('Account_ID', GlobalVariable.row))
'----------------------------------------------'
WebUI.verifyTextPresent("The Organisation you are going to pay is", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Checkatrade.com", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Description of Goods or Service / Reason for Payment", false)
'----------------------------------------------'
'Payment Description'
WebUI.verifyTextPresent(findTestData('Payments_Data').getValue('Payment_Description', GlobalVariable.row))
'----------------------------------------------'
// Date Provided - Defaults to TODAY        // Date goods or service provided
'----------------------------------------------'
WebUI.verifyTextPresent("Date goods or service provided", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Invoice Reference (if supplied)", false)
'----------------------------------------------'
'Invoice Reference'
WebUI.verifyTextPresent(findTestData('Payments_Data').getValue('Invoice_Reference', GlobalVariable.row))
'----------------------------------------------'
// Scroll To Footer
WebUI.scrollToPosition(500, 500)
'----------------------------------------------'
WebUI.verifyTextPresent("Payment Amount", false)
'----------------------------------------------'
// PAYMENT AMOUNT - <POUNDS><PENCE>
'Pounds'
WebUI.setText(findTestObject('Object Repository/Page_Members Area/Payments/Page_Paytrader/input_amount_pounds'),
	findTestData('Payments_Data').getValue('Payment_Pounds', GlobalVariable.row))
'Pence'
'----------------------------------------------'
WebUI.setText(findTestObject('Object Repository/Page_Members Area/Payments/Page_Paytrader/input_amount_pence'),
	findTestData('Payments_Data').getValue('Payment_Pounds', GlobalVariable.row))
'----------------------------------------------'
WebUI.verifyTextPresent("Customer Details", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Name", false)
'----------------------------------------------'
//WebUI.verifyTextPresent(EXCEL VALUE, false) // Checkatrade HQ - TRAINING/TEST PAGE  - Name Field
'Payee'
WebUI.verifyTextPresent(findTestData('Payments_Data').getValue('Name_Payee', GlobalVariable.row))
'----------------------------------------------'
WebUI.verifyTextPresent("First Line of Address", false)
'----------------------------------------------'
//WebUI.verifyTextPresent(EXCEL VALUE, false) // First Line of Address
'Address'
WebUI.setText(findTestObject('Object Repository/Page_Members Area/Payments/Page_Paytrader/input_Address'),
	findTestData('Payments_Data').getValue('Address', GlobalVariable.row))
'----------------------------------------------'
WebUI.verifyTextPresent("Postcode", false)
'----------------------------------------------'
//WebUI.verifyTextPresent(EXCEL VALUE, false) // Postcode
'Postcode'
WebUI.setText(findTestObject('Object Repository/Page_Members Area/Payments/Page_Paytrader/input_Postcode'),
	findTestData('Payments_Data').getValue('Postcode', GlobalVariable.row))
'----------------------------------------------'
WebUI.verifyTextPresent("Contact Telephone Number", false)
'----------------------------------------------'
//WebUI.verifyTextPresent(EXCEL VALUE, false) // Contact Telephone Number
'Telephone'
WebUI.setText(findTestObject('Object Repository/Page_Members Area/Payments/Page_Paytrader/input_Telephone'),
	findTestData('Payments_Data').getValue('Telephone', GlobalVariable.row))
'----------------------------------------------'
WebUI.verifyTextPresent("Email Address for Receipt", false)
'----------------------------------------------'
//WebUI.verifyTextPresent(EXCEL VALUE, false) // Email Address for Receipt
'Email'
WebUI.setText(findTestObject('Object Repository/Page_Members Area/Payments/Page_Paytrader/input_Email'),
	findTestData('Payments_Data').getValue('Email', GlobalVariable.row))
'----------------------------------------------'
WebUI.verifyTextPresent("leave blank if not UK", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Next Page", false)
'----------------------------------------------'
'NAVIGATE TO CARD ENTRY SCREEN'
'Hit <NEXT> Button'
WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Members Area/Payments/Page_Payatrader/button_Next'), 10)

WebUI.click(findTestObject('Object Repository/Page_Members Area/Payments/Page_Payatrader/button_Next'))
//WebUI.scrollToElement(findTestObject('Object Repository/Page_Members Area/a_Dashboard'), 10)


///////////////////////////////////////
//                END                //
///////////////////////////////////////