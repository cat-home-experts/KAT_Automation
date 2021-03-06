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

//----------------------------------------------------------------------------------------
// Give Feedback - Knowledge that you could provide feedback? Yes OR No (Default = NONE) | - Snip - 08/08/2019  -TO REFACTOR
//----------------------------------------------------------------------------------------

'--------------------------------'
'Read data from spreadsheet      |'
'--------------------------------'
def data = findTestData('Data Files/Give_Feedback (1)')  // put this into a method
YE_Feedback_Knowledge = data.getValue("YE_Feedback_Knowledge", GlobalVariable.row)// global rowindex 1

//-------------------------------------------
System.out.println("Your Experience, Feedback Knowledge, Click on the "+YE_Feedback_Knowledge+" Option Button ");
'------------------------------------------------'
'Set Knowledge of feedback process? - Yes or No  |'
'------------------------------------------------'
if (YE_Feedback_Knowledge == ("Yes")) {
	WebUI.waitForElementClickable(findTestObject('Page_Checkatrade Give your feedback/span_Yes - Copy'), 5)
	WebUI.click(findTestObject('Page_Checkatrade Give your feedback/span_Yes - Copy'))
	WebUI.waitForPageLoad(2)
} 
else if (YE_Feedback_Knowledge == ("No")) {
	WebUI.waitForElementClickable(findTestObject('Page_Checkatrade Give your feedback/span_No_Experience_Feedback'), 5)
	WebUI.click(findTestObject('Page_Checkatrade Give your feedback/span_No_Experience_Feedback'))
	WebUI.waitForPageLoad(2)
}
'--------------------------------'
System.out.println('Your Experience, Feedback Knowledge, Click on the <'+YE_Feedback_Knowledge+'> Option Button ');
//-------------------------------------------

// WebUI.click(findTestObject('Page_Checkatrade Give your feedback/span_Yes - Copy')) // span_Yes_Feedback_Possible

//------------------------------------
// END                               | - Snip - 08/08/2019
//------------------------------------
