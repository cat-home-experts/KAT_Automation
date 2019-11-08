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
// Search Items - Verify The Returned Record  |   09/11/2019    |        DH        |                             |
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
//	GIVEN -  With Web Office Open and focus on the Search Header text Box                                        |
//                                                                                                               |
//	WHEN - When you search for a company/Person/Phone Number/CATNumber Via The Search Header and Select That Item|
//                                                                                                               |
//  THEN - The Details of the Search Criteria Will Be Returned in COMPANY View, All The Available Details Return |
//                                                                                                               |
//---------------------------------------------------------------------------------------------------------------

//////////////////////////////////////////////////
// Confirm Traders Name is Present on WO Page   //
//////////////////////////////////////////////////
WebUI.verifyTextPresent(findTestData('searchTestData').getValue('tradeName', GlobalVariable.row), false,
	FailureHandling.CONTINUE_ON_FAILURE)

//////////////////////////////////////////////////
// Confirm Contact Name is Present on WO Page   //
//////////////////////////////////////////////////
WebUI.verifyTextPresent(findTestData('searchTestData').getValue('primeContact', GlobalVariable.row), false,
	FailureHandling.CONTINUE_ON_FAILURE)

//////////////////////////////////////////////////
// Confirm Address is Present on WO Page        //
//////////////////////////////////////////////////
WebUI.verifyTextPresent(findTestData('searchTestData').getValue('address', GlobalVariable.row), false,
	FailureHandling.CONTINUE_ON_FAILURE)

//////////////////////////////////////////////////
// Confirm Mobile Number is Present on WO Page  //
//////////////////////////////////////////////////
WebUI.verifyTextPresent(findTestData('searchTestData').getValue('mobile', GlobalVariable.row), false,
	FailureHandling.CONTINUE_ON_FAILURE)

//////////////////////////////////////////////////
// Confirm Contact Number is Present on WO Page //
//////////////////////////////////////////////////
WebUI.verifyTextPresent(findTestData('searchTestData').getValue('contact', GlobalVariable.row), false,
	FailureHandling.CONTINUE_ON_FAILURE)

//////////////////////////////////////////////////
// Confirm Email is Present on WO Page          //
//////////////////////////////////////////////////
WebUI.verifyTextPresent(findTestData('searchTestData').getValue('email', GlobalVariable.row), false,
	FailureHandling.CONTINUE_ON_FAILURE)

//////////////////////////////////////////////////
// Confirm Join Date is Present on WO Page      //
//////////////////////////////////////////////////
WebUI.verifyTextPresent(findTestData('searchTestData').getValue('join_Date', GlobalVariable.row), false,
	FailureHandling.CONTINUE_ON_FAILURE)

//////////////////////////////////////////////////
// Confirm Date of Birth is Present on WO Page  //
//////////////////////////////////////////////////
WebUI.verifyTextPresent(findTestData('searchTestData').getValue('dob', GlobalVariable.row), false,
	FailureHandling.CONTINUE_ON_FAILURE)

//////////////////////////////////////////////////
// Confirm Trader Web URL is Present on WO Page //
//////////////////////////////////////////////////
WebUI.verifyTextPresent(findTestData('searchTestData').getValue('website', GlobalVariable.row), false,
	FailureHandling.CONTINUE_ON_FAILURE)

'--------------------------'
' END                      |'
'--------------------------'