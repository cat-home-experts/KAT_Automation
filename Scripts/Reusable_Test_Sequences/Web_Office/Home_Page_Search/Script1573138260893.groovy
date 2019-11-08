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
// Search Items - Company/Person From WO Head |   07/11/2019    |        DH        |                             |
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

//---------------------------------------------------------------------
// Enter the Search Criteria on the Web Office Header Search Box    |
//---------------------------------------------------------------------
WebUI.setText(findTestObject('Object Repository/WebOffice_Home_page/input_Search_Criteria'),
	findTestData('searchTestData').getValue('Search_Selector', GlobalVariable.row))

//---------------------------------------------------------------------
// Synchronise on the Search Criteria on the Web Office Header Search |
//---------------------------------------------------------------------
//WebUI.waitForElementClickable(findTestObject('Object Repository/WebOffice_Home_page/popout_Search_Item'), 25)

WebUI.delay(1)
//---------------------------------------------------------------------
// Trigger the Search Criteria on the Web Office Header Search Box    |
//---------------------------------------------------------------------
WebUI.click(findTestObject('Object Repository/WebOffice_Home_page/popout_Search_Item'))

//---------------------------------------------------------------------
// Page Loading after Triggering the Search                           |
//---------------------------------------------------------------------
'Page Loading'
WebUI.waitForPageLoad(60)


///////////////////////////////////////
//                END                //
///////////////////////////////////////