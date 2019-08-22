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

//com.sun.org.apache.xpath.internal.operations.String Datasheet_Parser(def Data_Source, def Column_Header, def Cell_Content) {
//
//	'-----------------------------------------------------------------------------------------'
//	'Extract a cell value/content from the specified data source, column_header at row_count  |'
//	'-----------------------------------------------------------------------------------------'
//	
//	def data = findTestData(Data_Source)  
//	String Cell_Content = data.getValue(Column_Header, GlobalVariable.row)
//	
//	}
//
//WebUI.openBrowser("") // 20/08/2019 this 1 line below, replaces the 2 previous lines of code
'OPEN BROWSER'
WebUI.openBrowser(GlobalVariable.URL, FailureHandling.STOP_ON_FAILURE)
//-----------------------------------------
'URL - Set from the ENVIRONMENT PROFILE '
//WebUI.navigateToUrl(GlobalVariable.URL)  // 20/08/2019
//-----------------------------------------
'WAIT for browser to load - waits up to 60 seconds before timeout occurs '
WebUI.waitForPageLoad(60)
//-----------------------------------------
'MAXIMIZE BROWSER '
WebUI.maximizeWindow()
//-----------------------------------------
//-----------------------------
// COOKIE POLICY CHECKBOX     |
//-----------------------------
WebUI.delay(1)
//-----------------------------------------
if (WebUI.verifyTextPresent('Checkatrade.com uses cookies to make sure you get the best browsing experience', false). TRUE){
	//-----------------------------------------
	'COOKIE POLICY POPOUT'
	//WebUI.verifyTextPresent('Checkatrade.com uses cookies to make sure you get the best browsing experience', false)
	//-----------------------------------------
	'Closes COOKIE nagging element '
	WebUI.click(findTestObject('Page_Checkatrade Find a tradesperson you can trust/div_close'))
	//-----------------------------------------
	'COOKIE POPOUT REMOVED'
	WebUI.verifyTextNotPresent('Checkatrade.com uses cookies to make sure you get the best browsing experience', false)
}