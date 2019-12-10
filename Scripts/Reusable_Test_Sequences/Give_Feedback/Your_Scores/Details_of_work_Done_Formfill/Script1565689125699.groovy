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

//--------------------------------------------------------------
// Set the <Details of Work Done> on the <Your Scores> Screen  | - Snip - 13/08/2019
//--------------------------------------------------------------

def data = findTestData('Data Files/Give_Feedback (1)')  
def YS_Work_Description = data.getValue("YS_Work_Description", GlobalVariable.row)
def YS_Work_Date = data.getValue("YS_Work_Date", GlobalVariable.row)
def YS_Days_to_Complete = data.getValue("YS_Days_to_Complete", GlobalVariable.row)
def YS_Work_Comments = data.getValue("YS_Work_Comments", GlobalVariable.row)
def YS_Feedback_Published = data.getValue("YS_Feedback_Published", GlobalVariable.row)
'---------------------------------'
'Read data from spreadsheet       |'
'---------------------------------'
//----------------------------------------------------------------------------------
'---------------------------------'
'Brief description of work done   |'
'---------------------------------'
WebUI.setText(findTestObject('Object Repository/Page_Checkatrade Give your feedback/input_Brief description of work done_ctl00contenttbWorkDescription'),
	YS_Work_Description)

'---------------------------------'
'Date work was done (approx)      |'
'---------------------------------'

// * * *  No Date Currently Entered, Except Default (Today) * * *  -- defined - YS_Work_Date - worksheet

'---------------------------------'
'How many days did this job take? |'
'---------------------------------'
WebUI.setText(findTestObject('Object Repository/Page_Checkatrade Give your feedback/input_How many days did this job take'), YS_Days_to_Complete)

'---------------------------------'
'Your comments about the work     |'
'---------------------------------'
WebUI.setText(findTestObject('Object Repository/Page_Checkatrade Give your feedback/textarea_Your comments about the work_ctl00contenttbWorkComments'),
	YS_Work_Comments)

'---------------------------------------'
' Scroll Bottom of Page Into View       |'
'---------------------------------------'

//WebUI.scrollToElement('Reusable_Test_Sequences/Give_Feedback/Your_Scores/Hit_Next', 1)

'-----------------------------------------------------'
'Would you like your feedback published? - Yes or No  |'
'-----------------------------------------------------'
//try {
if (YS_Feedback_Published == ("Yes")) {
	WebUI.waitForElementClickable(findTestObject('Feedback/Page_Checkatrade Give your feedback/span_Publish_Feedback_Yes'), 10)
	WebUI.click(findTestObject('Feedback/Page_Checkatrade Give your feedback/span_Publish_Feedback_Yes'))
	WebUI.waitForPageLoad(60)
}
else if (YS_Feedback_Published == ("No")) {
	WebUI.waitForElementClickable(findTestObject('Feedback/Page_Checkatrade Give your feedback/span_Publish_Feedback_No'), 10)
	WebUI.click(findTestObject('Feedback/Page_Checkatrade Give your feedback/span_Publish_Feedback_No'))
	//WebUI.click(findTestObject('Page_Checkatrade Give your feedback/span_No_Feedback'))
	//WebUI.scrollToElement(findTestObject('Object Repository/Page_Checkatrade Give your feedback/input_No_ctl00contentButton6'), 2)
	// Wait for page, after selection, then verify expected text is present	
	WebUI.waitForPageLoad(60)
	WebUI.delay(1)
	WebUI. verifyTextPresent('We understand that you may not want us to contact the member, and we would like to understand why', false)
}
'--------------------------------'
System.out.println("Your Experience, Recommendation, Click on the "+YS_Feedback_Published+" Option Button ");
//-------------------------------------------
//} catch (Exception e) {
//	//KeywordUtil.markFailed("Your Experience, Recommendation, Click on the "+YE_Recommend+" Option Button Failed to Select");
//	System.out.println("Your Experience, Recommendation, Click on the "+YS_Feedback_Published+" Did nt Select ");
//}
'-----------------------------------'
WebUI.delay(1)    // Timing Issues, the above text capture fails if there is no pause here (text verification processing time? - desktop devices arn't great performance wise)
'---------------------------------'
'Your comments about the work     |'
'---------------------------------'
WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Checkatrade Give your feedback/input_No_ctl00contentButton6'), 60)
WebUI.click(findTestObject('Object Repository/Page_Checkatrade Give your feedback/input_No_ctl00contentButton6'))

//--------------------------------------------------------------
// END                                                         | - Snip - 13/08/2019
//--------------------------------------------------------------