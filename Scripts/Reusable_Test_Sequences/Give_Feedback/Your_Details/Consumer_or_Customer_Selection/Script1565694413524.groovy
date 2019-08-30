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
// Give Feedback - Set Individual Consumer OR a Trade Costomer       | - Snip - 14/08/2019  -TO REFACTOR
//--------------------------------------------------------------------
'--------------------------------'
'Read data from spreadsheet      |'
'--------------------------------'
def data = findTestData('Data Files/Give_Feedback (1)') // put this into a method
def YD_Consumer_Customer = data.getValue('YD_Consumer_Customer', GlobalVariable.row) // global rowindex 1
System.out.println(('Your Details, Consumer OR Trade Customer, Click on the ' + YD_Consumer_Customer) + ' Option Button ')

//-------------------------------------------
//'--------------------------------'
//'Set Consumer OR Trade Customer  |'
//'--------------------------------'

try {
	if (YD_Consumer_Customer == ("Consumer")) // Default Selection
		WebUI.click(findTestObject('Object Repository/Page_Checkatrade Give your feedback/span_an individual consumer'),1)
} catch (Exception e) {
	// Nothing to do - Default Value - Can't Reselect using tool
}
'-------------------------------------------'
if (YD_Consumer_Customer == ("Customer")) {
    WebUI.click(findTestObject('Object Repository/Page_Checkatrade Give your feedback/span_a trade customer'),1)
}
'--------------------------------'
System.out.println("Your Experience, Recommendation, Click on the "+YD_Consumer_Customer+" Option Button ");
//-------------------------------------------
'-----------------------------------'

//----------------------------------------
// End                                   |  - Snip - 14/08/2019  -TO REFACTOR - Done 16/08/2019
//----------------------------------------