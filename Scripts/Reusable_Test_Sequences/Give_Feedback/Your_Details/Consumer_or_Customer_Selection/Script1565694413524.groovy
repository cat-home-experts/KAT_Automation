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
// Give Feedback - Set Individual Consumer OR a Trade Costomer       | - Snip - 14/08/2019  -TO REFACTOR
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

'FAILS - Object Map Issue to Resolve'
//////WebUI.click(findTestObject('Object Repository/Page_Checkatrade Give your feedback/span_a trade customer'),1)


// Default
////WebUI.click(findTestObject('Object Repository/Page_Checkatrade Give your feedback/span_an individual consumer'),1)

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