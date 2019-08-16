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
// Give Feedback - Contact Details - Formfill                        | - Snip - 14/08/2019  -TO REFACTOR
//--------------------------------------------------------------------
'--------------------------------'
'Read data from spreadsheet      |'
'--------------------------------'
def data = findTestData('Data Files/Give_Feedback (1)') // put this into a method
YD_Home_Phone = data.getValue('YD_Home_Phone', GlobalVariable.row)
YD_Name = data.getValue('YD_Name', GlobalVariable.row)
YD_Best_Contact_Time = data.getValue('YD_Best_Contact_Time', GlobalVariable.row)
YD_Email = data.getValue('YD_Email', GlobalVariable.row)
YD_Mobile = data.getValue('YD_Mobile', GlobalVariable.row)
YD_Consumer_Customer = data.getValue('YD_Consumer_Customer', GlobalVariable.row)

//---------------------------------------------------------------------------------------------
System.out.println(('Your Experience, Your details, Set the ' + YD_Home_Phone) + ' Text Box ')
//---------------------------------------------------------------------------------------------
'------------------------------'
'  Set Home Telephone Number   |'
'------------------------------'
WebUI.setText(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/input_Home telephone_ctl00contenttbCustomerHomePhone'), 
    YD_Home_Phone)
'------------------------------'
'  Set Best Time to Contact    |'  // Not Available When <Trade Customer> was previously selected
'------------------------------'
if (YD_Consumer_Customer == ("Consumer")) {
WebUI.setText(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/input_Best time to contact you_ctl00contenttbCustomerContactTime'), 
    YD_Best_Contact_Time)
}
'------------------------------'
'  Set Email Address           |'
'------------------------------'
WebUI.setText(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/input_Email_ctl00contenttbCustomerEmail'), 
    YD_Email)

'------------------------------'
'  Set Mobile Telephone Number |'
'------------------------------'
WebUI.setText(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/input_Mobile_ctl00contenttbCustomerMobile'),
	YD_Mobile)

'-----------------------------------'

//----------------------------------------
// End                                   |  - Snip - 14/08/2019  -TO REFACTOR - Done 16/08/2019
//----------------------------------------