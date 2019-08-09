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
import sun.util.logging.resources.logging_pt_BR

//--------------------------------------------------------------------
// Give Feedback - Set Recommendation Yes OR No (Default = Yes)      | - Snip - 08/08/2019  -TO REFACTOR
//--------------------------------------------------------------------
'-----------------------'
'Check DEFAULT Setting  |     TODO  value="rbYes" checked="checked"> DONE?'
'-----------------------'
//WebUI.verifyElementChecked(findTestObject('//*[@id="ctl00_content_rbRecommend_rbYes"]'), 1)  TODO
//WebUI.verifyElementChecked(findTestObject('Object Repository/Page_Checkatrade Give your feedback/Default_Selected'), 10)
//WebUI.verifyElementAttributeValue('Object Repository/Page_Checkatrade Give your feedback/Default_Selected', 'value', '"rbYes" checked="checked">', 1)
WebUI.verifyElementPresent('Object Repository/Page_Checkatrade Give your feedback/Default_Selected', 1)
//-------------------------------------------

'--------------------------------'
'Read data from spreadsheet      |'
'--------------------------------'
def data = findTestData('Data Files/Give_Feedback (1)')  // put this into a method
String YE_Recommend = data.getValue("YE_Recommendations", GlobalVariable.row)// global rowindex 1
//-------------------------------------------

'--------------------------------'
'Set Recommendation - Yes or No  |'
'--------------------------------'
if (YE_Recommend.equals("Yes")) {
    WebUI.click(findTestObject('Object Repository/Page_Checkatrade Give your feedback/span_Yes'))
} 
else if (YE_Recommend.equals("No")) {
    WebUI.click(findTestObject('Object Repository/Page_Checkatrade Give your feedback/span_No'))
}
'--------------------------------'
//-------------------------------------------

//------------------------------------
// END                               | - Snip - 08/08/2019
//------------------------------------
