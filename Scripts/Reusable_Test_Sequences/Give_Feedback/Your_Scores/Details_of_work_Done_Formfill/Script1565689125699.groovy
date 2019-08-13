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

'---------------------------------'
'Brief description of work done   |'
'---------------------------------'
WebUI.setText(findTestObject('Object Repository/Page_Checkatrade Give your feedback/input_Brief description of work done_ctl00contenttbWorkDescription'),
	'Test Fixed Something')

'---------------------------------'
'Date work was done (approx)      |'
'---------------------------------'
WebUI.setText(findTestObject('Object Repository/Page_Checkatrade Give your feedback/input_How many days did this job take'), '3')

'---------------------------------'
'How many days did this job take? |'
'---------------------------------'
WebUI.setText(findTestObject('Object Repository/Page_Checkatrade Give your feedback/textarea_Your comments about the work_ctl00contenttbWorkComments'),
	'test comments')

'---------------------------------'
'Your comments about the work     |'
'---------------------------------'
WebUI.click(findTestObject('Page_Checkatrade Give your feedback/span_Yes_Feedback'))

'------------------------------------------'
'Would you like your feedback published?   |'
'------------------------------------------'
WebUI.click(findTestObject('Object Repository/Page_Checkatrade Give your feedback/input_No_ctl00contentButton6'))


//--------------------------------------------------------------
// END                                                         | - Snip - 13/08/2019
//--------------------------------------------------------------
