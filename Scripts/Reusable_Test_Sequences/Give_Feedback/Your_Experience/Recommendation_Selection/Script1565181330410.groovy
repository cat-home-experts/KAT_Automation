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
// Give Feedback - Set Recommendation Yes OR No (Default = Yes)      | - Snip - 08/08/2019
//--------------------------------------------------------------------
'Check DEFAULT Setting'
//WebUI.verifyElementChecked(findTestObject('//*[@id="ctl00_content_rbRecommend_rbYes"]'), 1)  TODO
'TODO'
//-------------------------------------------
'read data from spreadsheet'
def data = findTestData('Data Files/Give_Feedback (1)')  // put this into a method
String YE_Recommend = data.getValue("YE_Recommendations", 1)// global rowindex


//-------------------------------------------
'Set Recommendation - Yes or No                            TO  FIX'
if (YE_Recommend.equals("Yes")) {
    WebUI.click(findTestObject('Object Repository/Page_Checkatrade Give your feedback/span_Yes'))
	//Check Page Is Virgo Intactus
	
	
	
	
} else {
    WebUI.click(findTestObject('Object Repository/Page_Checkatrade Give your feedback/span_No'))
}
//-------------------------------------------

//------------------------------------
// END                               | - Snip - 08/08/2019
//------------------------------------
