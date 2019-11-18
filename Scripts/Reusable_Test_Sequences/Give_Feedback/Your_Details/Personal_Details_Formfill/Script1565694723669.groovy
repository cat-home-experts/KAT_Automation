import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

//--------------------------------------------------------------------
// Give Feedback - Personal Details - Formfill                       | - Snip - 14/08/2019  -TO REFACTOR
//--------------------------------------------------------------------
'--------------------------------'
'Read data from spreadsheet      |'
'--------------------------------'
def data = findTestData('Data Files/Give_Feedback (1)') // put this into a method
YD_Salutation = data.getValue('YD_Salutation', GlobalVariable.row) 
YD_Name = data.getValue('YD_Name', GlobalVariable.row)
YD_Company_Name = data.getValue('YD_Company_Name', GlobalVariable.row)
YD_Postcode = data.getValue('YD_Postcode', GlobalVariable.row)
YD_Verify_Address = data.getValue('YD_Verify_Address', GlobalVariable.row)
YD_Consumer_Customer = data.getValue('YD_Consumer_Customer', GlobalVariable.row)

//---------------------------------------------------------------------------------------------
System.out.println(('Your Experience, Your details, Set the ' + YD_Salutation) + ' Text Box ')
//---------------------------------------------------------------------------------------------
'--------------------'
'  Set  Salutation   |'
'--------------------'
//WebUI.waitForElementClickable(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/select_MrMrsMissMsMr  MrsDrRevRevd'),
//	YD_Salutation, true)
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/select_MrMrsMissMsMr  MrsDrRevRevd'),
	YD_Salutation, true)

'--------------------'
'  Set  Name         |' // If Customer Type Previously Selected = Consumer - Then Fill The Consumer Name Details
'--------------------'
if (YD_Consumer_Customer == ("Consumer")) {
	//WebUI.waitForElementClickable(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/input_Name_ctl00contenttbCustomerName'),
	//	YD_Name)
	WebUI.setText(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/input_Name_ctl00contenttbCustomerName'),
	YD_Name)
}
'----------------------'
' Name of you company  |'   // If Customer Type Previously Selected = Customer - Then Fill The Customer Trading Name Details
'----------------------'
if (YD_Consumer_Customer == ("Customer")) {
	//WebUI.waitForElementClickable(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/input_Name of your company_ctl00contenttbCustomerCompany'),
	//	YD_Company_Name)
	WebUI.setText(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/input_Name of your company_ctl00contenttbCustomerCompany'), 
    YD_Company_Name)
}
'--------------------'
'  Set Postcode     |'   // LOOKUP IS Long - Need to Synch with returned data
'--------------------'
//WebUI.waitForElementClickable(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/input_Your postcode_ctl00contentctlCustomerAddresstbPostcodeSearch'),
//	YD_Postcode)
WebUI.setText(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/input_Your postcode_ctl00contentctlCustomerAddresstbPostcodeSearch'),
	YD_Postcode)

'-----------------------------'
'  Address Lookup Selection   |'
'-----------------------------'
//WebUI.waitForElementClickable(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/input_Your postcode_ctl00contentctlCustomerAddressbtnPostcodeLookup'))
WebUI.click(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/input_Your postcode_ctl00contentctlCustomerAddressbtnPostcodeLookup'))

'-----------------------------'
'  Address Lookup Set         |'
'-----------------------------'
//WebUI.waitForElementClickable(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/select_Please select your address'),
//	YD_Verify_Address, true) // YD_Verify_Address // 'c1909b81-8db1-4a42-bfb8-8dbb5bbe7035'
WebUI.selectOptionByLabel(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/select_Please select your address'),
	YD_Verify_Address, true) // YD_Verify_Address // 'c1909b81-8db1-4a42-bfb8-8dbb5bbe7035'


//WebUI.selectOptionByValue(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/select_Please select your address'),
//	'c1909b81-8db1-4a42-bfb8-8dbb5bbe7035', true)

'-----------------------------'
'  Verify Returned Address    |'  
'-----------------------------'
WebUI.verifyTextPresent(YD_Verify_Address, false)
//-------------------------------------------

//----------------------------------------
// End                                   |  - Snip - 14/08/2019  - TO REFACTOR - Done 16/08/2019
//----------------------------------------