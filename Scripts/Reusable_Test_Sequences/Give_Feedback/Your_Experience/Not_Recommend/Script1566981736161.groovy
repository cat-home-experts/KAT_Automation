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
// Give Feedback - Set Recommendation Yes OR No - (SET to NO)        | - Snip - 28/08/2019  -TO REFACTOR
//--------------------------------------------------------------------
def data = findTestData('Data Files/Give_Feedback (1)')  
def YE_WorkCarriedOut = data.getValue("YE_Work_Carried_Out", GlobalVariable.row) 
def YE_NatureOfIssue = data.getValue("YE_Nature_Of_Issue", GlobalVariable.row)
def YE_Comments = data.getValue("YE_Comments", GlobalVariable.row)
def YE_FeedbackPublished = data.getValue("YE_Feedback_Published", GlobalVariable.row)
def YE_ReasonNoFeedback = data.getValue("YE_Reason_No_Feedback", GlobalVariable.row)     // MISSES OUT YOUR SCORES PAGE
def YE_Resolve = data.getValue("YE_Resolve", GlobalVariable.row)
def YE_Recommend = data.getValue("YE_Recommendations", GlobalVariable.row)
'--------------------------------'
'Read data from spreadsheet      |'
'--------------------------------'
// This Process MISSES OUT THE SCORES PAGE (For Obvious Reasons)
'--------------------------------------'	//-----------------------------------
' Was work carried out/Money Exchanged |' 	// No reveals extra comment text field
'--------------------------------------'	//-----------------------------------

if (YE_WorkCarriedOut == ("No")) {
	WebUI.click(findTestObject('Feedback_Non_Recommend/Page_Checkatrade Give your feedback/work_Carried_Out_span_No'))
	// Enter Comment in Revealed Field	
	WebUI.setText(findTestObject('Object Repository/Feedback_Non_Recommend/Page_Checkatrade Give your feedback/textarea_Comments'),
		YE_Comments)
}
else if (YE_WorkCarriedOut == ("Yes")) {
	WebUI.click(findTestObject('Feedback_Non_Recommend/Page_Checkatrade Give your feedback/work_Carried_Out_span_Yes'))
}
WebUI.waitForPageLoad(60)
'--------------------------------------'	//-----------------------------------
' Would you like to Publish Feedback?  |'  	// No reveals extra comment text field (Reason), Yes Reveals Message Text
'--------------------------------------'	//-----------------------------------
if (YE_FeedbackPublished == ("No")) {
	WebUI.click(findTestObject('Feedback_Non_Recommend/Page_Checkatrade Give your feedback/feedback_Published_span_No'))
	//---------------------------------------
	// When NO Feedback Published Selected  |
	//---------------------------------------
	WebUI.verifyTextPresent('By ticking ‘No’ we will not contact the trader but we may contact you.', false)
	//---------------------------------------
	// Comment a to Reason for NON Publish  |
	//---------------------------------------
	WebUI.setText(findTestObject('Object Repository/Feedback_Non_Recommend/Page_Checkatrade Give your feedback/textarea_Please give your reason for this'),
		YE_ReasonNoFeedback)
	}
                                            //--------------------------------------------------------------
else if (YE_FeedbackPublished == ("Yes")) { // Yes Reveals another set of Selectors - Resolve Y/N          |
	WebUI.click(findTestObject('Feedback_Non_Recommend/Page_Checkatrade Give your feedback/feedback_Published_span_Yes'))
	//---------------------------------------
	// When YES Feedback Published Selected |
	//---------------------------------------
	WebUI.verifyTextPresent('By ticking ‘Yes’ you are giving us permission to contact the trade to discuss the issue. The trade will have the opportunity to a ‘right of reply’', false)
	if (YE_Resolve == ("Yes")) {
		WebUI.click(findTestObject('Feedback_Non_Recommend/Page_Checkatrade Give your feedback/attempt_Resolution_span_Yes'))
	}
	else if (YE_Resolve == ("No")) {
		WebUI.click(findTestObject('Feedback_Non_Recommend/Page_Checkatrade Give your feedback/attempt_Resolution_span_No'))
	}
}
'--------------------------------------'
' Nature of Issue - Selection Box      |' // Moved to bottom, last selected item, even though its about the 3rd item on the page
'--------------------------------------'
WebUI.waitForPageLoad(60)
WebUI.selectOptionByLabel(findTestObject('Feedback_Non_Recommend/Page_Checkatrade Give your feedback/select_Please Select ShortForm'), YE_NatureOfIssue, true)
WebUI.waitForPageLoad(60)
// Page refresh
WebUI.delay(1)
//----------------------------------------
// End                                   |
//----------------------------------------
