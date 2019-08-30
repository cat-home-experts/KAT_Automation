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
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testdata.reader.ExcelFactory
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import sun.util.logging.resources.logging_pt_BR as logging_pt_BR
import com.kms.katalon.core.util.KeywordUtil

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
def data = findTestData('Data Files/Give_Feedback (1)')  // put this into a method     // Points directly at datasource but resolution issue
YE_Estimate = data.getValue("YE_Estimate", GlobalVariable.row)// global rowindex 1

'--------------------------------'
'Read data from spreadsheet      |'
'--------------------------------'
//Give_Feedback = ExcelFactory.getExcelDataWithDefaultSheet(GlobalVariable.DataSheet_Location, 'Sheet1', true)
//YE_Estimate = Give_Feedback.getValue('YE_Estimate', GlobalVariable.row)
//-------------------------------------------
System.out.println("Your Experience, Estimate Accuracy, Click on the "+YE_Estimate+" Option Button ");
'---------------------------------------------------------------------------------------------------------------------------------------------------'
'Set Quotation - Agreed_estimate -OR- Additional_work -OR- More_than_agreed_price_informed -OR- More_than_agreed_price_not_informed -OR- No_estimate|'
'---------------------------------------------------------------------------------------------------------------------------------------------------'
// Select Statement attempted, but issues resolving
'-------------------------------------------------'
//		//YE_Estimate = 1 // "Agreed_price"      //
'-------------------------------------------------'
if (YE_Estimate ==("Agreed_price")) {
	WebUI.click(findTestObject('Object Repository/Page_Checkatrade Give your feedback/span_The agreed price'))
	WebUI.waitForPageLoad(2)
}
'-------------------------------------------------'
//		//YE_Estimate = 2 // "Additional_work"   //
'-------------------------------------------------'
if (YE_Estimate ==("Additional_work")) {
	WebUI.click(findTestObject('Page_Checkatrade Give your feedback/span_I requested additional work and paid the agreed price'))
	WebUI.waitForPageLoad(2)
}
'-----------------------------------------------------------------------'
//		//YE_Estimate = 3 // "More_than_agreed_price_informed"         //
'-----------------------------------------------------------------------'
if (YE_Estimate ==("More_than_agreed_price_informed")) {
	WebUI.click(findTestObject('Page_Checkatrade Give your feedback/span_More than the agreed price but I was kept informed'))
	WebUI.waitForPageLoad(2)
}
'-----------------------------------------------------------------------'
//		//YE_Estimate = 4 // "More_than_agreed_price_not_informed"     //
'-----------------------------------------------------------------------'
if (YE_Estimate ==("More_than_agreed_price_not_informed")) {
	WebUI.click(findTestObject('Page_Checkatrade Give your feedback/span_More than the agreed price but I wasnt kept informed'))
	WebUI.waitForPageLoad(2)
}
'-----------------------------------------------------------------------'
//		//YE_Estimate = 5 // "No_estimate"                             //
'-----------------------------------------------------------------------'
if (YE_Estimate ==("No_estimate")) {
	WebUI.click(findTestObject('Page_Checkatrade Give your feedback/span_Not applicable - no estimate given'))
	WebUI.waitForPageLoad(2)
}

// Switch
	//switch (YE_Estimate)  // Switch Case Not Working?
	//
	//{
	//	case 1:
	//		//YE_Estimate = 1 // "Agreed_price"
	//		WebUI.click(findTestObject('Object Repository/Page_Checkatrade Give your feedback/span_The agreed price'))
	//		sYE_Estimate = "Agreed_price"
	//		break;
	//		//-----------------------------
	//	case 2:
	//		//YE_Estimate = 2 // "Additional_work"
	//		WebUI.click(findTestObject('Page_Checkatrade Give your feedback/span_I requested additional work and paid the agreed price'))
	//		sYE_Estimate = "Additional_work"
	//		break;
	//	//-----------------------------
	//	case 3:
	//		//YE_Estimate = 3 // "More_than_agreed_price_informed"
	//		WebUI.click(findTestObject('Page_Checkatrade Give your feedback/span_More than the agreed price but I was kept informed'))
	//		sYE_Estimate = "More_than_agreed_price_informed"
	//		break;
	//		//-----------------------------
	//	case 4:
	//		//YE_Estimate = 4 // "More_than_agreed_price_not_informed"
	//		WebUI.click(findTestObject('Page_Checkatrade Give your feedback/span_More than the agreed price but I wasnt kept informed'))
	//		sYE_Estimate = "More_than_agreed_price_not_informed"
	//		break;
	//	//-----------------------------
	//	case 5:
	//		//YE_Estimate = 5 // "No_estimate"
	//		//WebUI.click(findTestObject('Page_Checkatrade Give your feedback/span_Not applicable - no estimate given'))
	//		WebUI.click(findTestObject('Page_Checkatrade Give your feedback/span_Not applicable - no estimate given'))
	//		sYE_Estimate = "No_estimate"
	//		break;
	//		//-----------------------------
	//
	//}

'--------------------------------'
System.out.println("Your Experience, Estimate Accuracy, Click on the "+YE_Estimate+" Option Button ");
//-------------------------------------------

// WebUI.click(findTestObject('Object Repository/Page_Checkatrade Give your feedback/span_The agreed price'))

//------------------------------------
// END                               | - Snip - 08/08/2019
//------------------------------------

