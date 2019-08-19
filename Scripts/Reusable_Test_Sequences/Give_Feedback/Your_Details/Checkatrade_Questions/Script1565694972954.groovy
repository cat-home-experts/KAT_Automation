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
// Checkadtrade Questions - Formfill                                 | - Snip - 14/08/2019  
//--------------------------------------------------------------------
'--------------------------------'
'Read data from spreadsheet      |'
'--------------------------------'
def data = findTestData('Data Files/Give_Feedback (1)') // put this into a method
YD_Feedback_Method = data.getValue('YD_Feedback_Method', GlobalVariable.row)
YD_How_Did_You_Hear = data.getValue('YD_How_Did_You_Hear', GlobalVariable.row)
YD_Other_Response = data.getValue('YD_Other_Response', GlobalVariable.row)
YD_Reason_For_Tradeperson_Selection = data.getValue('YD_Reason_For_Tradeperson_Selection', GlobalVariable.row)
YD_Receive_Chekatrade_Updates = data.getValue('YD_Receive_Chekatrade_Updates', GlobalVariable.row)
YD_Receive_Third_Party_Updates = data.getValue('YD_Receive_Third_Party_Updates', GlobalVariable.row)

//---------------------------------------------------------------------------------------------
System.out.println(('Your Experience, Your details, Set the ' + YD_Feedback_Method) + ' Text Box ')
//---------------------------------------------------------------------------------------------

'------------------------------------'
'  Set Verify Options - SMS OR Email |'
'------------------------------------'
if (YD_Feedback_Method == "email"){
	WebUI.click(findTestObject('Object Repository/Page_Checkatrade Give your feedback/span_Verify by email'))
}
else {
	WebUI.click(findTestObject('Object Repository/Page_Checkatrade Give your feedback/span_Verify by SMS (Please provide a mobile number)'))
}

'--------------------------------------'
' Scroll to <Next> Button              |'
'--------------------------------------'

WebUI.scrollToPosition(200, 0)
//WebUI.scrollToElement('Object Repository/New Folder/Page_Checkatrade Give your feedback/input_here_ctl00contentButtonSubmit', 0)  // xpath = //*[@id="ButtonSubmit"]

'--------------------------------------'
'  Set How You Heard About Checkatrade |'
'--------------------------------------'

WebUI.waitForPageLoad(1)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Page_Checkatrade Give your feedback/select_Please selectTVRadioOnlineDirectoryWord'), 
     YD_How_Did_You_Hear, true)

'--------------------------------------'
'  How did you hear about Textbox      |'   // Answer to Question - Set How You Heard About Checkatrade - Above 'OTHER' Selected (Extra Text Box Appears)
'--------------------------------------'

if (YD_How_Did_You_Hear == "Other"){
	WebUI.setText(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/input_How did you hear about Checkatrade_ctl00contenttbOther'),
		'YD_Other_Response')
}

'--------------------------------------'
'  Why Use The Selected Tradesperson   |'   // Answer to Question - Set you selected the tradesperson - Above
'--------------------------------------'

WebUI.selectOptionByLabel(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/select_Prefer not to sayFound the Tradesperson via CheckatradecomDirected to Checkatradecom by the Tradesperson'), 
    YD_Reason_For_Tradeperson_Selection, true)

'----------------------------------------------------'
' Select - I am happy to receive Updates - Checkatra |'
'----------------------------------------------------'
if (YD_Receive_Chekatrade_Updates == "Yes"){
	WebUI.click(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/input_I am happy to receive updates from Checkatrade_ctl00contentchkEmailUpdates'))
}

'----------------------------------------------------'
' Select - I am happy to receive Updates - 3rd party |'
'----------------------------------------------------'
if (YD_Receive_Third_Party_Updates == "Yes"){
	WebUI.click(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/label_I am happy to receive updates from selected third parties'))
}

'--------------------------------------'
'   SUBMIT Page                        |'
'--------------------------------------'
WebUI.click(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/input_here_ctl00contentButtonSubmit'))

//----------------------------------------
// End                                   |  - Snip - 14/08/2019  - TO REFACTOR - Done - 16/08/2019
//----------------------------------------