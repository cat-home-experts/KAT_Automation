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
// Set the Listbox <Reliability> on the <Your Scores> Screen   | - Snip - 30/08/2019 - ALT VARIANT (When Recommendattio = NO But Work Completed OR Money Exchanged
//--------------------------------------------------------------

def data = findTestData('Data Files/Give_Feedback (1)')  // put this into a method      // Points directly at datasource but resolution issue
def YS_Tidiness = data.getValue("YS_Tidiness_ALT", GlobalVariable.row)
def YS_Reliability = data.getValue("YS_Reliability_ALT", GlobalVariable.row)
def YS_Courtesy = data.getValue("YS_Courtesy_ALT", GlobalVariable.row)
def YS_Workmanship = data.getValue("YS_Workmanship_ALT", GlobalVariable.row)
'--------------------------------'
'Read data from spreadsheet      |'
'--------------------------------'
//stop:
'------------------------------------------------------'
' Wait Fro Top ListBox to be Active/Clickable          |'
'------------------------------------------------------'
//WebUI.waitForElementClickable(findTestObject('Feedback_Non_Recommend/Page_Checkatrade Give your feedback/select_--YS_Tidiness', 2))

'------------------------------------------------------'
'Select Tidiness Value form List                       |'
'------------------------------------------------------'
WebUI.selectOptionByValue(findTestObject('Feedback_Non_Recommend/Page_Checkatrade Give your feedback/select_--YS_Tidiness'),
	YS_Tidiness, false)

WebUI.waitForPageLoad(2)
'------------------------------------------------------'
'Select Reliability and Timekeeping Value form List    |'
'------------------------------------------------------'
WebUI.selectOptionByValue(findTestObject('Feedback_Non_Recommend/Page_Checkatrade Give your feedback/select_--YS_Reliability'),
	YS_Reliability, false)

WebUI.waitForPageLoad(2)
'------------------------------------------------------'
'Select Courtesy Value form List                       |'
'------------------------------------------------------'
WebUI.selectOptionByValue(findTestObject('Feedback_Non_Recommend/Page_Checkatrade Give your feedback/select_--YS_Courtesy'),
	YS_Reliability, false)

WebUI.waitForPageLoad(2)
'------------------------------------------------------'
'Select Quality and Workmanship Value form List        |'
'------------------------------------------------------'
WebUI.selectOptionByValue(findTestObject('Feedback_Non_Recommend/Page_Checkatrade Give your feedback/select_--YS_Workmanship'),
	YS_Workmanship, false)

WebUI.delay(1)

//--------------------------------------------------------------
// END                                                         | - Snip - 30/08/2019
//--------------------------------------------------------------