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
//def data = findTestData('Data Files/Give_Feedback (1)' // put this into a method
//	)
//
//YE_Recommend = data.getValue('YE_Recommendations', GlobalVariable.row // global rowindex 1
//	)
//
//System.out.println(('Your Experience, Recommendation, Click on the ' + YE_Recommend) + ' Option Button ')

'--------------------'
'  Set  Salutation   |'
'--------------------'
WebUI.selectOptionByValue(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/select_MrMrsMissMsMr  MrsDrRevRevd'),
	'Mr', true)

'--------------------'
'  Set  Name         |'
'--------------------'
WebUI.setText(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/input_Name_ctl00contenttbCustomerName'),
	'Bert Millichip')

// Trade Customer Selection reveals extra text box - 

'----------------------'
' Name of you company  |'  // TODO
'----------------------'

// TODO

'--------------------'
'  Set Postcode     |'   // LOOKUP IS Long - Need to Synch with returned data
'--------------------'
WebUI.setText(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/input_Your postcode_ctl00contentctlCustomerAddresstbPostcodeSearch'),
	'po12 1sd')

'-----------------------------'
'  Address Lookup Selection   |'
'-----------------------------'
WebUI.click(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/input_Your postcode_ctl00contentctlCustomerAddressbtnPostcodeLookup'))

'-----------------------------'
'  Address Lookup Set         |'
'-----------------------------'
WebUI.selectOptionByValue(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/select_Please select your address'),
	'c1909b81-8db1-4a42-bfb8-8dbb5bbe7035', true)

'-----------------------------'
'  Verify Returned Address    |'  // TODO
'-----------------------------'

// TODO
//-------------------------------------------
//'--------------------------------'
//'Set Recommendation - Yes or No  |'
//'--------------------------------'
//if (YE_Recommend == ("Yes")) {
//    WebUI.click(findTestObject('Page_Checkatrade Give your feedback/span_Yes_Feedback'))
//}
//else if (YE_Recommend == ("No")) {
//    WebUI.click(findTestObject('Page_Checkatrade Give your feedback/span_No_Experience_Feedback'))
//}
//'--------------------------------'
//System.out.println("Your Experience, Recommendation, Click on the "+YE_Recommend+" Option Button ");
////-------------------------------------------
'-----------------------------------'
//
//'FAILS - Object Map Issue to Resolve'
//WebUI.click(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/span_a trade customer'))
//
//WebUI.click(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/span_an individual consumer'))

//try {
//	//WebUI.click(findTestObject('Page_Checkatrade Give your feedback/span_No - Copy'),1)
//	'-----------------------------------\r\nError handling det to Optional - Flags warning here for false failure'
//	WebUI.click(findTestObject('Page_Checkatrade Give your feedback/span_Yes_Recommend'), 1, FailureHandling.OPTIONAL)
//}	catch (Exception e) {
//	// nothing to do
//}

//----------------------------------------
// End                                   |  - Snip - 14/08/2019  -TO REFACTOR
//----------------------------------------