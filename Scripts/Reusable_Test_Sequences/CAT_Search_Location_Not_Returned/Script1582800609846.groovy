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
import com.kms.katalon.core.util.KeywordUtil

//-------------------------------------------------------
// Verification - Required Search Returned as Expected  | - Snip - 27/02/2020
//-------------------------------------------------------
'For later Extension'
'--------------------------------'
'Read data from spreadsheet      | r_ = Returned Data'
'--------------------------------'
//def data = findTestData('Data Files/Consumer_Data (1)')
//def Consumer_ID = data.getValue("Search_Trader_Location_Data_NEG", GlobalVariable.row)
//
//def r_Full_Name = data.getValue("r_Full_Name", 1)
//def r_Full_Address = data.getValue("r_Full_Address", 1)
//
//'--------------------------------'
//'Read data from spreadsheet      |'
//'--------------------------------'
//def Actual_Page_Text = ""
//def Expected_Page_Text = ""
'------------------------------------------------------------------------'
'VALUES - 1 = Enter Trade Location Status - 2 = 404 No File or Directory |'
'------------------------------------------------------------------------'
def Flag_Search_Location_Error = "0"

WebUI.delay(1)
WebUI.waitForPageLoad(60)


'-------------------------------------------------------------------------------------------------------------------------'
'Scenario 1 - Location, Incorrect Numeric Value or Posecode Returns Highlighted (RED) Text Please enter a valid Location  |'
'-------------------------------------------------------------------------------------------------------------------------'
try{

	WebUI.verifyTextPresent('Please enter a trade and a location', false,FailureHandling.OPTIONAL)
	//KeywordUtil.markPassed("Enter a VALID Trade and Location is Reported, As Expected")
	Flag_Search_Location_Error = "1"
} 
catch (Exception e1){
  
	Flag_Search_Location_Error = "0"
	'Nothing to do :-)'
  }
  
'-----------------------------------------------------------------------------------------------------------------------------------'
'Scenario 2 - Location, Incorrect or Non Existing Data Beyond the Realms of the Database - Return 404 - File or Directory NOT FOUND |'
'-----------------------------------------------------------------------------------------------------------------------------------'
  
try{
	  
	WebUI.verifyTextPresent('404 - File or directory not found', false,FailureHandling.OPTIONAL)
	//KeywordUtil.markPassed("Enter a VALID Trade and Location is Reported, As Expected")
	Flag_Search_Location_Error = "2"
} 
catch (Exception e2){
		
	Flag_Search_Location_Error = "0"
	  'Nothing to do :-)'
    }
'Scenario 1 Reporting'		  
if (Flag_Search_Location_Error == "1"){
	KeywordUtil.markPassed("Enter a VALID Trade and Location is Reported, As Expected") // for Location "
}
'Scenario 2 Reporting'
if (Flag_Search_Location_Error == "2"){
	KeywordUtil.markPassed("Error 404 Reported as Expected, Resource Unavailable")
}
'Unexpected Outcome Reporting'
if (Flag_Search_Location_Error == "0"){
	KeywordUtil.markFailed("Page Content Returned, Is Not What Was Expected - INVESTIGATE! :-)") 
}
//// verifies the NON returns of Classification against Invalid Location
////-------------------------------------------
//'Expected cantantenated text is Returned'
//' DYNAMIC DELAY - Wait for <SEARCH> Button to Re-Appear after Search is completed'
//
//WebUI.delay(1)
//WebUI.waitForPageLoad(60)
//
//'-------------------------------------------------------------------------------------------------------------------------'
//'Scenario 1 - Location, Incorrect Numeric Value or Posecode Returns Highlighted (RED) Text Please enter a valid Location  |'
//'-------------------------------------------------------------------------------------------------------------------------'
//
//if (WebUI.verifyTextPresent('Please enter a trade and a location', false)) {
//	Flag_Search_Location_Error = "1"
//	WebUI.closeBrowser()
//	'Need To Terminate WebDriver Process Also'
//'-----------------------------------------------------------------------------------------------------------------------------------'
//'Scenario 2 - Location, Incorrector Non Existing Data Beyond the Realms of the Database - Return 404 - File or Directory NOT FOUND  |'
//'-----------------------------------------------------------------------------------------------------------------------------------'
//	} 
//
//else if (!WebUI.verifyTextPresent('404 - File or directory not found', false)) {
//	Flag_Search_Location_Error = "2"
//} 
//
//else {
//	KeywordUtil.markFailed("Page Returned, Is Not What Was Expected - INVESTIGATE! :-)") // for Location "
//}
//
//if (Flag_Search_Location_Error == "1"){
//	KeywordUtil.markPassed("Enter a VALID Trade and Location is Reported, As Expected") // for Location "
//}
//
//if (Flag_Search_Location_Error == "2"){
//	KeywordUtil.markPassed("Error 404 Reported as Expected, Resource Unavailable")
//}
//
//// snip for future reference
//// WebUI.verifyTextPresent(findTestData('Search_Trader_Location_Data_NEG').getValue('tradeClassification', GlobalVariable.row), false)
// //WebUI.verifyTextPresent(findTestData('Search_Trader_Location_Data_NEG').getValue('tradeLocation', GlobalVariable.row), false)
// 
////-------------------------------------------

//------------------------------------
// END                               | - Snip - 27/02/2020
//------------------------------------