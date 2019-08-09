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
// Give Feedback - Set Estimate/Quotation Radio Button               | - Snip - 08/08/2019  -TO REFACTOR
//--------------------------------------------------------------------
'-----------------------'
'Check DEFAULT Setting  |     Default Setting - Nothing Selected'
'-----------------------'
//-------------------------------------------

'--------------------------------'
'Read data from spreadsheet      |'
'--------------------------------'
def data = findTestData('Data Files/Give_Feedback (1)')  // put this into a method
String YE_Estimate = data.getValue("YE_Estimate", GlobalVariable.row)// global rowindex 1
//-------------------------------------------

'---------------------------------------------------------------------------------------------------------------------------------------------------'
'Set Quotation - Agreed_estimate -OR- Additional_work -OR- More_than_agreed_price_informed -OR- More_than_agreed_price_not_informed -OR- No_estimate|'
'---------------------------------------------------------------------------------------------------------------------------------------------------'

switch (YE_Estimate)

{
	case 1:
	YE_Estimate = "Agreed_estimate"
	WebUI.click(findTestObject('Object Repository/Page_Checkatrade Give your feedback/span_The agreed price'))
	break;
	//-----------------------------
	case 2:
	YE_Estimate = "Additional_work"
	WebUI.click(findTestObject('Page_Checkatrade Give your feedback/span_I requested additional work and paid the agreed price'))
	break;
	//-----------------------------
	case 3:
	YE_Estimate = "More_than_agreed_price_informed"
	WebUI.click(findTestObject('Page_Checkatrade Give your feedback/span_More than the agreed price but I was kept informed'))
	break;
	//-----------------------------
	case 4:
	YE_Estimate = "More_than_agreed_price_not_informed"
	WebUI.click(findTestObject('Page_Checkatrade Give your feedback/span_More than the agreed price but I wasnt kept informed'))
	break;
	//-----------------------------
	case 1:
	YE_Estimate = "No_estimate"
	WebUI.click(findTestObject('Page_Checkatrade Give your feedback/span_Not applicable - no estimate given'))
	break;
	//-----------------------------

}

'--------------------------------'
//-------------------------------------------

//------------------------------------
// END                               | - Snip - 08/08/2019
//------------------------------------

