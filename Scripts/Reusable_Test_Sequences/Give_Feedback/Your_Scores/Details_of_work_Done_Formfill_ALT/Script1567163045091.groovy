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
// Set the <Details of Work Done> on the <Your Scores> Screen  | - Snip - 30/08/2019 ALTERNATIVE PAGE RETURNED When Reccomendation = NO and Money Changed Hands OR Work Completed is YES
//--------------------------------------------------------------

def data = findTestData('Data Files/Give_Feedback (1)')
def YS_Work_Description = data.getValue("YS_Work_Description", GlobalVariable.row)
def YS_Work_Date = data.getValue("YS_Work_Date", GlobalVariable.row)
def YS_Days_to_Complete = data.getValue("YS_Days_to_Complete", GlobalVariable.row)
def YS_Work_Comments = data.getValue("YS_Work_Comments", GlobalVariable.row)
def YS_Feedback_Published = data.getValue("YS_Feedback_Published", GlobalVariable.row)

//  ALT Variables - As Specified In Header, Properties Page, Driver Script Comments et al.
def YS_Work_Covered = data.getValue("YS_Work_Covered_ALT", GlobalVariable.row)
def YS_Discussed_Complaint = data.getValue("YS_Discussed_Complaint_ALT", GlobalVariable.row)
def YS_Complaint_Response = data.getValue("YS_Complaint_Reponse_ALT", GlobalVariable.row)

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

'---------------------------------------'
' Work is Gauranteed       - Yes or No  |'
'---------------------------------------'
if (YS_Work_Covered == ("Yes")) {
	WebUI.click(findTestObject('Feedback_Non_Recommend/Page_Checkatrade Give your feedback/Warranty_Cover_span_Yes'))
	WebUI.waitForPageLoad(2)
}
else if (YS_Work_Covered == ("No")) {
	WebUI.click(findTestObject('Feedback_Non_Recommend/Page_Checkatrade Give your feedback/Warranty_Cover_span_No'))
	WebUI.waitForPageLoad(2)
}

'---------------------------------------'
' Complaint Discussed      - Yes or No  |'
'---------------------------------------'

if (YS_Discussed_Complaint == ("Yes")) {
	WebUI.click(findTestObject('Feedback_Non_Recommend/Page_Checkatrade Give your feedback/Discussed_Complaint_span_Yes'))
	WebUI.waitForPageLoad(2)
	WebUI.setText(findTestObject('Feedback_Non_Recommend/Page_Checkatrade Give your feedback/Complaint_Response', YS_Complaint_Response))
}
else if (YS_Discussed_Complaint == ("No")) {
	WebUI.click(findTestObject('Feedback_Non_Recommend/Page_Checkatrade Give your feedback/Discussed_Complaint_span_No'))
	WebUI.waitForPageLoad(2)
	WebUI. verifyTextPresent('discuss your concerns directly with the business', false)
}

'--------------------------------'
// System.out.println("Your Experience, Recommendation, Click on the "+YS_Feedback_Published+" Option Button ");
//-------------------------------------------
//} catch (Exception e) {
//	//KeywordUtil.markFailed("Your Experience, Recommendation, Click on the "+YE_Recommend+" Option Button Failed to Select");
//	System.out.println("Your Experience, Recommendation, Click on the "+YS_Feedback_Published+" Did nt Select ");
//}
'-----------------------------------'

'---------------------------------'
'Your comments about the work     |'
'---------------------------------'
//WebUI.click(findTestObject('Object Repository/Page_Checkatrade Give your feedback/input_No_ctl00contentButton6'))

//--------------------------------------------------------------
// END                                                         | - Snip - 30/08/2019
//--------------------------------------------------------------
