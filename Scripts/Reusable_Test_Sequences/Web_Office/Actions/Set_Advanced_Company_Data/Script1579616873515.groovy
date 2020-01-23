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
// Set Search Items - WO Adv Company Search   |   29/11/2019    |        DH        |                             |
//---------------------------------------------------------------------------------------------------------------
// Implementation after debug                 |   21/01/2020    |        DH        | iFrame issues for all of WO | DEBUGGING
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
'Read data from spreadsheet      |'
'--------------------------------'
def data = findTestData('Data Files/Advanced_Company_Search_Data')

def Trader_ID = data.getValue("Trader_ID", GlobalVariable.row)
def Limited_Company_Number = data.getValue("Limited_Company_Number", GlobalVariable.row)

def Forename = data.getValue("Forename", GlobalVariable.row)
def Surname = data.getValue("Surname", GlobalVariable.row)
def Mobile = data.getValue("Mobile", GlobalVariable.row)
def Email = data.getValue("Email", GlobalVariable.row)
def House = data.getValue("House", GlobalVariable.row)     // MISSES OUT YOUR SCORES PAGE
def Street = data.getValue("Street", GlobalVariable.row)
def Town = data.getValue("Town", GlobalVariable.row)
def City = data.getValue("City", GlobalVariable.row)
def County = data.getValue("County", GlobalVariable.row)
def Postcode = data.getValue("Postcode", GlobalVariable.row)
def Phone = data.getValue("Phone", GlobalVariable.row)
def Status = data.getValue("Status", GlobalVariable.row)
def Type = data.getValue("Type", GlobalVariable.row)


//'GlobalVariable.aFirstName Used For No Data Test case (No Record Existing) String Detection '
//GlobalVariable.aFirstName = data.getValue("Forename", GlobalVariable.row) // Used For 'Select_Consumer, no data existing case'

'--------------------------------'
'Read data from spreadsheet      |'
'--------------------------------'
//-----------------------
'--------------------------------'
' Synchronisation                |'
'--------------------------------'
WebUI.waitForPageLoad(60)
WebUI.waitForElementVisible(findTestObject('Object Repository/Web_Office_Advanced_Company_Search/Page_/input_Clear_ctl00ctl00CP1ctlSearchbtnSearch'), 60)

'https://admin.preview.checkatrade.com/Companies/Search.aspx' //search url
'-------------------------------------------------------------------------------------------------------------------------------------'
'Set Trader_ID'
	WebUI.setText(findTestObject('Object Repository/Web_Office_Advanced_Company_Search/Page_/table_Trader ID'), Trader_ID)
'-------------------------------------------------------------------------------------------------------------------------------------'





'Set Surname'
	WebUI.setText(findTestObject('Object Repository/WebOffice/Consumers/Page_/input_Surname_ctl00CP1ctlSearchtbSurname'), Surname)
'-------------------------------------------------------------------------------------------------------------------------------------'
'Set Mobile'
	WebUI.setText(findTestObject('Object Repository/WebOffice/Consumers/Page_/input_Mobile_ctl00CP1ctlSearchtbMobile'), Mobile)
'-------------------------------------------------------------------------------------------------------------------------------------'
'Set Email'
	WebUI.setText(findTestObject('Object Repository/WebOffice/Consumers/Page_/input_Email_ctl00CP1ctlSearchtbEmail'), Email)
'-------------------------------------------------------------------------------------------------------------------------------------'
'Set House'
WebUI.setText(findTestObject('Object Repository/WebOffice/Consumers/Page_/input_House_ctl00CP1ctlSearchtbHouse'), House)
'-------------------------------------------------------------------------------------------------------------------------------------'
'Set Street'
	WebUI.setText(findTestObject('Object Repository/WebOffice/Consumers/Page_/input_Street_ctl00CP1ctlSearchtbStreet'), Street)
'-------------------------------------------------------------------------------------------------------------------------------------'
'Set Town'
	WebUI.setText(findTestObject('Object Repository/WebOffice/Consumers/Page_/input_Town_ctl00CP1ctlSearchtbTown'), Town)
'-------------------------------------------------------------------------------------------------------------------------------------'
'Set City'
	WebUI.setText(findTestObject('Object Repository/WebOffice/Consumers/Page_/input_City_ctl00CP1ctlSearchtbCity'), City)
'-------------------------------------------------------------------------------------------------------------------------------------'
'Set County'
	WebUI.setText(findTestObject('Object Repository/WebOffice/Consumers/Page_/input_County_ctl00CP1ctlSearchtbCounty'), County)
'-------------------------------------------------------------------------------------------------------------------------------------'
'Set Postcode'
	WebUI.setText(findTestObject('Object Repository/WebOffice/Consumers/Page_/input_Postcode_ctl00CP1ctlSearchtbPostcode'), Postcode)
'-------------------------------------------------------------------------------------------------------------------------------------'
'Set Phone'
	WebUI.setText(findTestObject('Object Repository/WebOffice/Consumers/Page_/input_Phone_ctl00CP1ctlSearchtbTel'), Phone)
'-------------------------------------------------------------------------------------------------------------------------------------'
'Set Status'
	//WebUI.waitForElementClickable(findTestObject('Object Repository/WebOffice/Consumers/Page_/select_AllActiveDeleted', 60))
	//WebUI.selectOptionByValue(findTestObject('Object Repository/WebOffice/Consumers/Page_/select_AllActiveDeleted'), Status, true)
'-------------------------------------------------------------------------------------------------------------------------------------'
'Status 3 Options'
//WebUI.selectOptionByValue(findTestObject('Object Repository/WebOffice/Consumers/Page_/select_AllActiveDeleted'), 'ALL',
//    true)
//
//WebUI.selectOptionByValue(findTestObject('Object Repository/WebOffice/Consumers/Page_/select_AllActiveDeleted'), 'ACTIVE',
//    true)
//
//WebUI.selectOptionByValue(findTestObject('Object Repository/WebOffice/Consumers/Page_/select_AllActiveDeleted'), 'DELETED',
//    true)

'-------------------------------------------------------------------------------------------------------------------------------------'
'Set Type'
	//WebUI.waitForElementClickable(findTestObject('Object Repository/WebOffice/Consumers/Page_/select_BothConsumerTrade', 60))
	//WebUI.selectOptionByValue(findTestObject('Object Repository/WebOffice/Consumers/Page_/select_BothConsumerTrade'), Type, true)
/*'-------------------------------------------------------------------------------------------------------------------------------------'
'Set Forename'
if (Forename==null){
	WebUI.setText(findTestObject('Object Repository/WebOffice/Consumers/Page_/input_Forename_ctl00CP1ctlSearchtbForenames'), Forename)
}

'-------------------------------------------------------------------------------------------------------------------------------------'
'Set Surname'
if (Surname==null){
	WebUI.setText(findTestObject('Object Repository/WebOffice/Consumers/Page_/input_Surname_ctl00CP1ctlSearchtbSurname'), Surname)
}

'-------------------------------------------------------------------------------------------------------------------------------------'
'Set Mobile'
if (Mobile==null){
	WebUI.setText(findTestObject('Object Repository/WebOffice/Consumers/Page_/input_Mobile_ctl00CP1ctlSearchtbMobile'), Mobile)
}

'-------------------------------------------------------------------------------------------------------------------------------------'
'Set Email'
if (Email==null){
	WebUI.setText(findTestObject('Object Repository/WebOffice/Consumers/Page_/input_Email_ctl00CP1ctlSearchtbEmail'), Email)
}

'-------------------------------------------------------------------------------------------------------------------------------------'
'Set House'
if (House==null){
WebUI.setText(findTestObject('Object Repository/WebOffice/Consumers/Page_/input_House_ctl00CP1ctlSearchtbHouse'), House)
}

'-------------------------------------------------------------------------------------------------------------------------------------'
'Set Street'
if (Street==null){
	WebUI.setText(findTestObject('Object Repository/WebOffice/Consumers/Page_/input_Street_ctl00CP1ctlSearchtbStreet'), Street)
}

'-------------------------------------------------------------------------------------------------------------------------------------'
'Set Town'
if (Town==null){
	WebUI.setText(findTestObject('Object Repository/WebOffice/Consumers/Page_/input_Town_ctl00CP1ctlSearchtbTown'), Town)
}

'-------------------------------------------------------------------------------------------------------------------------------------'
'Set City'
if (City==null){
	WebUI.setText(findTestObject('Object Repository/WebOffice/Consumers/Page_/input_City_ctl00CP1ctlSearchtbCity'), City)
}

'-------------------------------------------------------------------------------------------------------------------------------------'
'Set County'
if (County==null){
	WebUI.setText(findTestObject('Object Repository/WebOffice/Consumers/Page_/input_County_ctl00CP1ctlSearchtbCounty'), County)
}

'-------------------------------------------------------------------------------------------------------------------------------------'
'Set Postcode'
if (Postcode==null){
	WebUI.setText(findTestObject('Object Repository/WebOffice/Consumers/Page_/input_Postcode_ctl00CP1ctlSearchtbPostcode'), Postcode)
}

'-------------------------------------------------------------------------------------------------------------------------------------'
'Set Phone'
if (Phone==null){
	WebUI.setText(findTestObject('Object Repository/WebOffice/Consumers/Page_/input_Phone_ctl00CP1ctlSearchtbTel'), Phone)
}

'-------------------------------------------------------------------------------------------------------------------------------------'
'Set Status'
if (Status==null){
	WebUI.selectOptionByValue(findTestObject('Object Repository/WebOffice/Consumers/Page_/select_AllActiveDeleted'), Status, true)
}

'-------------------------------------------------------------------------------------------------------------------------------------'
'Status 3 Options'
//WebUI.selectOptionByValue(findTestObject('Object Repository/WebOffice/Consumers/Page_/select_AllActiveDeleted'), 'ALL',
//    true)
//
//WebUI.selectOptionByValue(findTestObject('Object Repository/WebOffice/Consumers/Page_/select_AllActiveDeleted'), 'ACTIVE',
//    true)
//
//WebUI.selectOptionByValue(findTestObject('Object Repository/WebOffice/Consumers/Page_/select_AllActiveDeleted'), 'DELETED',
//    true)

'-------------------------------------------------------------------------------------------------------------------------------------'
'Set Type'
if (Type==null){
	WebUI.selectOptionByValue(findTestObject('Object Repository/WebOffice/Consumers/Page_/select_BothConsumerTrade'), Type, true)
}*/
'-------------------------------------------------------------------------------------------------------------------------------------'
'Type 3 Options'
//WebUI.selectOptionByValue(findTestObject('Object Repository/WebOffice/Consumers/Page_/select_BothConsumerTrade'), '1', true)
//
//WebUI.selectOptionByValue(findTestObject('Object Repository/WebOffice/Consumers/Page_/select_BothConsumerTrade'), '2', true)
//
//WebUI.selectOptionByValue(findTestObject('Object Repository/WebOffice/Consumers/Page_/select_BothConsumerTrade'), '0', true)
'-------------------------------------------------------------------------------------------------------------------------------------'
'Commit Search Query'
WebUI.click(findTestObject('Object Repository/WebOffice/Consumers/Page_/input_Clear_ctl00CP1ctlSearchbtnSearch'))

'Clear Button'
// WebUI.click(findTestObject('Object Repository/WebOffice/Consumers/Page_/a_Clear'))

'--------------------------------'
'           END                  |'
'--------------------------------'