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
// Give Feedback - Set Recommendation Yes OR No (Default = Yes)      | - Snip - 07/08/2019
//--------------------------------------------------------------------
'Check DEFAULT Setting'
WebUI.verifyElementChecked(findTestObject('Object Repository/Page_Checkatrade Give your feedback/span_Yes'), 1)

//-------------------------------------------
'Set Recommendation - Yes or No'
if (GlobalVariable.YE_Recommendations == "Yes") {
    WebUI.click(findTestObject('Object Repository/Page_Checkatrade Give your feedback/span_Yes'))
} else {
    WebUI.click(findTestObject('Object Repository/Page_Checkatrade Give your feedback/span_No'))
}
//-------------------------------------------

//------------------------------------
// END                               | - Snip - 07/08/2019
//------------------------------------


