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
// Give Feedback - Set Recommendation Yes OR No (Default = Yes)      | - Snip - 08/08/2019  - 28/08/2019 refactored, issues corrected
//--------------------------------------------------------------------
def data = findTestData('Data Files/Give_Feedback (1)')  
def YE_Recommend = data.getValue("YE_Recommendations", GlobalVariable.row) 
def YE_Other_Trade = data.getValue("YE_Other_Trade", GlobalVariable.row)
'--------------------------------'
'Read data from spreadsheet      |'
'--------------------------------'


//-------------------------------------------
'--------------------------------'
'Set Recommendation - Yes or No  |'
'--------------------------------'

if (YE_Recommend == ("Yes")) {
	'-----------------------------------------------------------'
	' Selected by Default - ReSelecting causes a tool exception |'
	' No need to re-select - RESOLVED                           |'
	'-----------------------------------------------------------'
    //WebUI.click(findTestObject('Page_Checkatrade Give your feedback/span_Yes_Recommend'), 1, FailureHandling.OPTIONAL)
	WebUI.waitForElementClickable(findTestObject('Object Repository/Feedback/Page_Checkatrade Give your feedback/Page_Checkatrade Give your feedback/span_Yes'), 5)
	WebUI.click(findTestObject('Object Repository/Feedback/Page_Checkatrade Give your feedback/Page_Checkatrade Give your feedback/span_Yes'))
	WebUI.waitForPageLoad(2)

	'---------------------------------------------------------------------------------------'
	' Your Experience (page 1) Trader Type?     NEW - 20/02/2020                            |'
	'---------------------------------------------------------------------------------------'
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Give_Feedback/Your_Experience/What_Type_Of_Trade_Used'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	
} 
else if (YE_Recommend == ("No")) {
    //WebUI.click(findTestObject('Page_Checkatrade Give your feedback/span_No_Experience_Feedback'))
	//WebUI.click(findTestObject('Page_Checkatrade Give your feedback/span_No_Recommend'), 1, FailureHandling.OPTIONAL)
	WebUI.waitForElementClickable(findTestObject('Object Repository/Feedback/Page_Checkatrade Give your feedback/Page_Checkatrade Give your feedback/span_No'), 5)
	WebUI.click(findTestObject('Object Repository/Feedback/Page_Checkatrade Give your feedback/Page_Checkatrade Give your feedback/span_No'))
	WebUI.waitForPageLoad(5)
	
	'---------------------------------------------------------------------------------------'
	' Your Experience (page 1) Trader Type?     NEW - 20/02/2020                            |'
	'---------------------------------------------------------------------------------------'
	// TODO Bug - Selecting Radios after selecting NO removes trade sealection - NEW
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Give_Feedback/Your_Experience/What_Type_Of_Trade_Used'), [:], FailureHandling.CONTINUE_ON_FAILURE)

	'original'
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Give_Feedback/Your_Experience/Not_Recommend'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	'original'
	
	'---------------------------------------------------------------------------------------'
	' Your Experience (page 1) Trader Type?     NEW - 20/02/2020                            |'
	'---------------------------------------------------------------------------------------'
	// TODO Bug - Selecting Radios after selecting NO removes trade sealection - NEW
	
	//WebUI.scrollToElement(findTestObject('Object Repository/Feedback/Page_Checkatrade Give your feedback/span_Other'), 3)
	//WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Give_Feedback/Your_Experience/What_Type_Of_Trade_Used'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	
	'------------------------------------------------------------------------------------------------------------------------'
	'DEFECT - Other Radio Button Resets in process, below cheat to reset - temporarily - now commented out again :-)         |'
	'------------------------------------------------------------------------------------------------------------------------'
	'Click on <OTHER> Radio'
//	WebUI.scrollToElement(findTestObject('Object Repository/Feedback/Page_Checkatrade Give your feedback/span_Other'), 3)
//	WebUI.waitForElementClickable(findTestObject('Object Repository/Feedback/Page_Checkatrade Give your feedback/span_Other'), 3)
//	WebUI.click(findTestObject('Object Repository/Feedback/Page_Checkatrade Give your feedback/span_Other'))
	// TODO Bug - Selecting Radios after selecting NO removes trade sealection - NEW
}
	'--------------------------------'
	System.out.println("Your Experience, Recommendation, Click on the <"+YE_Recommend+"> Option Button ");
	//-------------------------------------------
WebUI.waitForPageLoad(60)
//----------------------------------------
// End                                   | - Snip - 08/08/2019  - 28/08/2019 refactored, issues corrected
//----------------------------------------
