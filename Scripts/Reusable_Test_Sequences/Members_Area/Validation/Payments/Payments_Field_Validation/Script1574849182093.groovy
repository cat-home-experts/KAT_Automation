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
// Your Name in the CREATED BY column, and Finaly, The actual change implemented in the NOTES column.
//
//---------------------------------------------------------------------------------------------------------------
//       Test Definition / Description        |   Date Created  |    Created By    |             Notes           |
//---------------------------------------------------------------------------------------------------------------
//  My payments Page - Input Validation on    |   27/11/2019    |      DH          |                             |
//  Fields                                    |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
//  Encroaches PAYATRADER Portal - Suspended  |                 |      DH          |                             |
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

////////////////////////////////////////////////////////////
//     Wait for Customers Name Element Availability       //
////////////////////////////////////////////////////////////

//WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Members Area/input_concat(Customer  s name)_customerName'), 60)

WebUI.waitForPageLoad(60)

////////////////////////////////////////////////////////////
//     Take an Initial Screenshot of Home After Login     //
////////////////////////////////////////////////////////////
//WebUI.takeScreenshot('Reports/Screenshots/Initial_Members_page.png')
// Stores in Project <Screenshots> Folder
// CustomKeywords.'kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeEntirePageScreenshot'('Your_Customers_Remind_Customer.png', FailureHandling.OPTIONAL)

////////////////////////////////////////////////////////////
//         Attempt to NAVIGATE To Card With No data Set   //
////////////////////////////////////////////////////////////

'----------------------------------------------'
// WebUI.verifyTextPresent("Next Page", false)
'----------------------------------------------'
'NAVIGATE TO CARD ENTRY SCREEN'
'Hit <NEXT> Button'
WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Members Area/Payments/Page_Payatrader/Page_Payatrader - card payments made easy/input_Email Address for Receipt_next'), 10)
'---------------------------------'
WebUI.click(findTestObject('Object Repository/Page_Members Area/Payments/Page_Payatrader/Page_Payatrader - card payments made easy/input_Email Address for Receipt_next'))
//WebUI.scrollToElement(findTestObject('Object Repository/Page_Members Area/a_Dashboard'), 10)
'---------------------------------'
' Verify, 1st Field Warnings'
WebUI.verifyTextPresent("Please enter a description of the goods or service")
'---------------------------------'
' Enter 1st Field, Description'
'PAYMENT DESCRIPTION'
WebUI.setText(findTestObject('Object Repository/Page_Members Area/Payments/Page_Payatrader/textarea_Description of Goods or Service  R_1e6ad8'),
	Payment_Description)
'----------------------------------------------'
// Scroll to Commit Button
WebUI.scrollToElement(findTestObject('Object Repository/Page_Members Area/Payments/Page_Payatrader/Page_Payatrader - card payments made easy/input_Email Address for Receipt_next'), 2)
// Hit next Again
WebUI.click(findTestObject('Object Repository/Page_Members Area/Payments/Page_Payatrader/Page_Payatrader - card payments made easy/input_Email Address for Receipt_next'))
'----------------------------------------------'
'---------------------------------'
' Verify, 2nd Field Warnings'
WebUI.verifyTextPresent("Please enter the pounds amount")
'---------------------------------'


'ENCROACHES PAYATRADER PORTAL - NOT COMPLETED'
//'---------------------------------'
//'DEFAULT TAB - Pay Checkatrade    '
//'----------------------------------------------'
//// MEMBER ID CHECK
//WebUI.verifyTextPresent(findTestData('Members_Test_Data').getValue('MEMBER_ID', 1), false)
//'----------------------------------------------'
//WebUI.verifyTextPresent("MEMBER ID", false)
//'----------------------------------------------'
//WebUI.verifyTextPresent("Pay Checkatrade", false)
//'----------------------------------------------'
//WebUI.verifyTextPresent("Welcome to the Checkatrade payment platform", false)
//'----------------------------------------------'
//WebUI.verifyTextPresent("This is a secure platform where you may pay for any membership, product or service provided by Checkatrade", false)
//'----------------------------------------------'
//WebUI.verifyTextPresent("There will be no charge for debit card or credit card payments", false)
//'----------------------------------------------'
//WebUI.verifyTextPresent("We are unable to accept payment by American Express", false)
//'----------------------------------------------'
//WebUI.verifyTextPresent("Receipts can be emailed to you should you enter your email address", false)
//'----------------------------------------------'
//WebUI.verifyTextPresent("Thank you for using this service. Click below to proceed", false)
//'----------------------------------------------'
//WebUI.verifyTextPresent("Pay by Card", false)
//'----------------------------------------------'
//WebUI.verifyTextPresent("Should you experience any difficulties in processing your payment please contact Checkatrade", false)
//'----------------------------------------------'

//WebUI.scrollToElement(findTestObject('Object Repository/Page_Members Area/a_Dashboard'), 10)

///////////////////////////////////////
//                END                //
///////////////////////////////////////
