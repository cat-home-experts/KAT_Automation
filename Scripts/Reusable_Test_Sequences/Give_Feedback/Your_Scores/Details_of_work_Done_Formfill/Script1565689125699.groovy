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
YS_Work_Description = data.getValue("YS_Work_Description", GlobalVariable.row)
YS_Work_Date = data.getValue("YS_Work_Date", GlobalVariable.row)
YS_Days_to_Complete = data.getValue("YS_Days_to_Complete", GlobalVariable.row)
YS_Work_Comments = data.getValue("YS_Work_Comments", GlobalVariable.row)
YS_Feedback_Published = data.getValue("YS_Feedback_Published", GlobalVariable.row)
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

// * * *  No Date Currently Entered, Except Default (Today) * * *  -- YS_Work_Date

'---------------------------------'
'How many days did this job take? |'
'---------------------------------'
WebUI.setText(findTestObject('Object Repository/Page_Checkatrade Give your feedback/input_How many days did this job take'), YS_Days_to_Complete)

'---------------------------------'
'Your comments about the work     |'
'---------------------------------'
WebUI.setText(findTestObject('Object Repository/Page_Checkatrade Give your feedback/textarea_Your comments about the work_ctl00contenttbWorkComments'),
	YS_Work_Comments)

'-----------------------------------------------------'
'Would you like your feedback published? - Yes or No  |'
'-----------------------------------------------------'
try {
	if (YS_Feedback_Published == ("Yes")) {
		WebUI.click(findTestObject('Page_Checkatrade Give your feedback/span_Yes_Feedback'))
	}
	else if (YS_Feedback_Published == ("No")) {
		//WebUI.click(findTestObject('Page_Checkatrade Give your feedback/span_No_Experience_Feedback'))
		WebUI.click(findTestObject('Page_Checkatrade Give your feedback/span_No_Feedback'))
	}
	'--------------------------------'
	System.out.println("Your Experience, Recommendation, Click on the "+YS_Feedback_Published+" Option Button ");
	//-------------------------------------------
} catch (Exception e) {
	//KeywordUtil.markFailed("Your Experience, Recommendation, Click on the "+YE_Recommend+" Option Button Failed to Select");
	System.out.println("Your Experience, Recommendation, Click on the "+YS_Feedback_Published+" Did nt Select ");
}
'-----------------------------------'

'---------------------------------'
'Your comments about the work     |'
'---------------------------------'
WebUI.click(findTestObject('Object Repository/Page_Checkatrade Give your feedback/input_No_ctl00contentButton6'))


//--------------------------------------------------------------
// END                                                         | - Snip - 13/08/2019
//--------------------------------------------------------------
