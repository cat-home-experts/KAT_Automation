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
// Checkadtrade Questins - Formfill                        | - Snip - 14/08/2019  -TO REFACTOR
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

'------------------------------------'
'  Set Verify Options - SMS OR Email |'
'------------------------------------'
WebUI.click(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/span_Verify by SMS (Please provide a mobile number)'))

WebUI.click(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/span_Verify by email'))

'--------------------------------------'
'  Set How You Heard About Checkatrade |'
'--------------------------------------'
WebUI.selectOptionByValue(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/select_Please selectOnlineRadioSports sponsorshipWord of mouthDirectoryTVTrader (including feedback cards)Other'), 
    'other', true)

WebUI.setText(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/input_How did you hear about Checkatrade_ctl00contenttbOther'), 
    'word of mouth')

'--------------------------------------'
'  If Other Selected - Extra Textbox   |'   // Answer to Question - Set How You Heard About Checkatrade - Above
'--------------------------------------'

WebUI.selectOptionByValue(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/select_Please selectOnlineRadioSports sponsorshipWord of mouthDirectoryTVTrader (including feedback cards)Other'), 
    'directory', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/select_Prefer not to sayFound the Tradesperson via CheckatradecomDirected to Checkatradecom by the Tradesperson'), 
    '2', true)

'----------------------------------------------------'
' Select - I am happy to receive Updates - Checkatra |'
'----------------------------------------------------'
WebUI.click(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/input_I am happy to receive updates from Checkatrade_ctl00contentchkEmailUpdates'))

'----------------------------------------------------'
' Select - I am happy to receive Updates - 3rd party |'
'----------------------------------------------------'
WebUI.click(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/label_I am happy to receive updates from selected third parties'))


'--------------------------------------'
'   SUBMIT Page                        |'
'--------------------------------------'
WebUI.click(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/input_here_ctl00contentButtonSubmit'))



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
//
//'FAILS - Object Map Issue to Resolve'
//WebUI.click(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/span_a trade customer'))
//
//WebUI.click(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/span_an individual consumer'))

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