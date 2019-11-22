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
//  Members Area Payments testing             |   22/11/2019    |      DH          | Make payments with dummy,   |
//  Payment Declined page                     |                 |                  | Test Visa card -            |
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


'----------------------------------------------'
WebUI.verifyTextPresent("Payment Declined", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Unfortunately your payment was declined by the card issuer", false)
'----------------------------------------------'
WebUI.verifyTextPresent("What would you like to do", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Try again", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Continue without completing payment", false)
'----------------------------------------------'

'----------------------------------------------'


///////////////////////////////////////
//                END                //
///////////////////////////////////////

