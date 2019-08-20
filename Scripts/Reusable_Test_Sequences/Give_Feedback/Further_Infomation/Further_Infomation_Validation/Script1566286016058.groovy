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
import org.openqa.selenium.Keys as Keys

//-------------------------------------------------------------------------
// Give Feedback - Further Information Page - Value of Work - and Commit  | - Snip - 14/08/2019 - To Refactor - NO VALIDATION ON THIS PAGE, Future Enhancement?
//-------------------------------------------------------------------------

'--------------------------------'
' Set the Value of Work Textbox  |'  // Warning! The previous page fill auto commits, even though there is a commit button on the form (watch for behaviour change)
'--------------------------------'
WebUI.setText(findTestObject('Object Repository/New Folder1/Page_Checkatrade Give your feedback/input_Value Of Work_ctl00contenttbValueOfWork'), "0") // Set 0 

'--------------------------------'
'Hit <Submit> button to Commit   |'
'--------------------------------'
WebUI.click(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/input_Value Of Work_ctl00contentButton1'))

//-------------------------------------------------------
// END                                                  | - Snip - 14/08/2019 - To Refactor - Done 19/08/2019