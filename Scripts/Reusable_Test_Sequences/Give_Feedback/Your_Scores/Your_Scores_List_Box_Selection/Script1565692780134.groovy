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
// Set the Listbox <Reliability> on the <Your Scores> Screen   | - Snip - 13/08/2019
//--------------------------------------------------------------

def data = findTestData('Data Files/Give_Feedback (1)')  // put this into a method      // Points directly at datasource but resolution issue
YS_Tidiness = data.getValue("YS_Tidiness", GlobalVariable.row)
YS_Reliability = data.getValue("YS_Reliability", GlobalVariable.row)
YS_Courtesy = data.getValue("YS_Courtesy", GlobalVariable.row)
YS_Workmanship = data.getValue("YS_Workmanship", GlobalVariable.row)
'--------------------------------'
'Read data from spreadsheet      |'
'--------------------------------'

'------------------------------------------------------'
'Select Tidiness Value form List                       |' 
'------------------------------------------------------'
WebUI.selectOptionByValue(findTestObject('Page_Checkatrade Give your feedback/select_--YS_Tidiness'),
	YS_Tidiness, true)

'------------------------------------------------------'
'Select Reliability and Timekeeping Value form List    |'  
'------------------------------------------------------'
WebUI.selectOptionByValue(findTestObject('Page_Checkatrade Give your feedback/select_--YS_Reliability'),
	YS_Reliability, true)

'------------------------------------------------------'
'Select Courtesy Value form List                       |'
'------------------------------------------------------'
WebUI.selectOptionByValue(findTestObject('Page_Checkatrade Give your feedback/select_--YS_Courtesy'),
	YS_Reliability, true)

'------------------------------------------------------'
'Select Quality and Workmanship Value form List        |'
'------------------------------------------------------'
WebUI.selectOptionByValue(findTestObject('Page_Checkatrade Give your feedback/select_--YS_Workmanship'),
	YS_Workmanship, true)

//--------------------------------------------------------------
// END                                                         | - Snip - 13/08/2019
//--------------------------------------------------------------



