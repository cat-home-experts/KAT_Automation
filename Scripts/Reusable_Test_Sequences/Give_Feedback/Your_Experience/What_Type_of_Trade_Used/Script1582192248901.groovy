import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

def data = findTestData('Data Files/Give_Feedback (1)')
def YE_Recommend = data.getValue("YE_Recommendations", GlobalVariable.row)
def YE_Other_Trade = data.getValue("YE_Other_Trade", GlobalVariable.row)
'--------------------------------'
'Read data from spreadsheet      |'
'--------------------------------'
 
'--------------------'
'Changes 19/02/2020 v| Plumber/Other Option Buttons, Other Produces a <Trades> ListBox'
'--------------------'
if (YE_Other_Trade == ("Yes")) {

	WebUI.waitForElementClickable(findTestObject('Object Repository/Feedback/Page_Checkatrade Give your feedback/Page_Checkatrade Give your feedback/span_Other'), 5)
	WebUI.click(findTestObject('Object Repository/Feedback/Page_Checkatrade Give your feedback/Page_Checkatrade Give your feedback/span_Other'))
	
//		WebUI.waitForElementClickable(findTestObject('Object Repository/Feedback/Page_Checkatrade Give your feedback/Page_Checkatrade Give your feedback/select_Air ConditioningAlarms  SecurityAppl_6c61d9'), 5)
//		WebUI.click(findTestObject('Object Repository/Feedback/Page_Checkatrade Give your feedback/Page_Checkatrade Give your feedback/select_Air ConditioningAlarms  SecurityAppl_6c61d9'))
//		WebUI.selectOptionByValue(findTestObject('Object Repository/Feedback/Page_Checkatrade Give your feedback/Page_Checkatrade Give your feedback/select_Air ConditioningAlarms  SecurityAppl_6c61d9'),
// 			YE_Other_Trade, true)
//		WebUI.click(findTestObject('Object Repository/Feedback/Page_Checkatrade Give your feedback/Page_Checkatrade Give your feedback/select_Air ConditioningAlarms  SecurityAppl_6c61d9'))
//		WebUI.selectOptionByLabel(findTestObject('Object Repository/Feedback/Page_Checkatrade Give your feedback/Page_Checkatrade Give your feedback/select_Air ConditioningAlarms  SecurityAppl_6c61d9'),
//			YE_Other_Trade, true)
	WebUI.click(findTestObject('Object Repository/Feedback/Page_Checkatrade Give your feedback/Page_Checkatrade Give your feedback/select_Air ConditioningAlarms  SecurityAppl_6c61d9'))
	WebUI.selectOptionByValue(findTestObject('Object Repository/Feedback/Page_Checkatrade Give your feedback/select_Air ConditioningAlarms  SecurityAppl_6c61d9'), '11', true)
//	WebUI.click(findTestObject('Object Repository/Feedback/Page_Checkatrade Give your feedback/Page_Checkatrade Give your feedback/select_Air ConditioningAlarms  SecurityAppl_6c61d9'))
	//WebUI.click(findTestObject('Object Repository/Feedback/Page_Checkatrade Give your feedback/Page_Checkatrade Give your feedback/span_Other'))
	
}
if (YE_Other_Trade == ("No")) {
	'TODO Add the <Plumber> Radio Button Selector Here'
	// TODO Add the <Plumber> Radio Button Selector Here
}
'--------------------'
'Changes 19/02/2020 ^| Plumber/Other Option Buttons, Other Produces a <Trades> ListBox'
'--------------------'

