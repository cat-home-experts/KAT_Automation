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
// Set Search Items - WO Advanced Company Srch|   31/01/2020    |        DH        |                             |
//---------------------------------------------------------------------------------------------------------------
// Implementation after debug                 |   13/01/2020    |        DH        | iFrame issues for all of WO |
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

'--------------------------------'
'Read data from spreadsheet      | r_ = Returned Data'
'--------------------------------'
def data = findTestData('Data Files/Advance_Company_Search_Data')

def Trader_ID = data.getValue("Trader_ID", GlobalVariable.row)
def Limited_Company_Number = data.getValue("Limited_Company_Number", GlobalVariable.row)
def Company_Name = data.getValue("Company_Name", GlobalVariable.row)
def Owner_Surname = data.getValue("Owner_Surname", GlobalVariable.row)
def Owner_DOB = data.getValue("Owner_DOB", GlobalVariable.row)
def Name_House = data.getValue("Name_House", GlobalVariable.row)
def Number_Street = data.getValue("Number_Street", GlobalVariable.row)
def Town = data.getValue("Town", GlobalVariable.row)
def City = data.getValue("City", GlobalVariable.row)
def County = data.getValue("County", GlobalVariable.row)
def Postcode = data.getValue("Postcode", GlobalVariable.row)
def Tel = data.getValue("Tel", GlobalVariable.row)
def Email = data.getValue("Email", GlobalVariable.row)

'--------------------------------'
'Read data from spreadsheet      |'
'--------------------------------'
def Actual_Page_Text = ""
def Expected_Page_Text = ""

WebUI.waitForPageLoad(60)
WebUI.delay(1)

'---------------------------------------------------------------------------------------------------------------------'
'HEADER DETAIL - iFrame'

'-----------------'
'PAGE_HEADER TEXT |'
'-----------------'
WebUI.verifyTextPresent(findTestData('Data Files/Advance_Company_Search_Data').getValue('Page_Header_Text', GlobalVariable.row), false)
'----------------'
'Email Address   |'
'----------------'
WebUI.verifyTextPresent(findTestData('Data Files/Advance_Company_Search_Data').getValue('Email', GlobalVariable.row), false)
'----------------'
'Phone Number    |'
'----------------'
WebUI.verifyTextPresent(findTestData('Data Files/Advance_Company_Search_Data').getValue('Tel', GlobalVariable.row), false)
'----------------'
'Trader ID       |'
'----------------'
WebUI.verifyTextPresent(findTestData('Data Files/Advance_Company_Search_Data').getValue('Trader_ID', GlobalVariable.row), false)
'----------------'
'Postcode        |'
'----------------'
WebUI.verifyTextPresent(findTestData('Data Files/Advance_Company_Search_Data').getValue('Postcode', GlobalVariable.row), false)
'----------------'
'Full Name       |'
'----------------'
WebUI.verifyTextPresent(findTestData('Data Files/Advance_Company_Search_Data').getValue('Full_Name', GlobalVariable.row), false)
'----------------'
'Date of Birth   |'
'----------------'
WebUI.verifyTextPresent(findTestData('Data Files/Advance_Company_Search_Data').getValue('Owner_DOB', GlobalVariable.row), false)
'----------------'
'Full Address    |'
'----------------'
WebUI.verifyTextPresent(findTestData('Data Files/Advance_Company_Search_Data').getValue('Full_Address', GlobalVariable.row), false)
'----------------'
'Web Site        |'
'----------------'
//WebUI.verifyTextPresent(findTestData('Data Files/Advance_Company_Search_Data').getValue('Website', GlobalVariable.row), false) // Inconsistent


'--------------------------------'
'           END                  |'
'--------------------------------'
