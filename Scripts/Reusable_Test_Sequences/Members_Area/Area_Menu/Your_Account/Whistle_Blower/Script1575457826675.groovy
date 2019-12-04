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
import org.openqa.selenium.Keys as Keys

///TODO

// Option Buttons need work (3 duplicates :-) , put data into sheet

WebUI.setText(findTestObject('Object Repository/Page_Members Area/Whistle_Blower/Page_Members Area/input_Start typing to select a member_mat-input-0'), 
    'TEST')

WebUI.click(findTestObject('Object Repository/Page_Members Area/Whistle_Blower/Page_Members Area/span_DO NOT ACTION - IT SUPPORT TEST ACCOUNT'))

WebUI.setText(findTestObject('Object Repository/Page_Members Area/Whistle_Blower/Page_Members Area/textarea_Enter your comments_txtComments'), 
    'DO NOT ACTION - TEST AUTOMATION ACTIVITY')

WebUI.click(findTestObject('Object Repository/Page_Members Area/Whistle_Blower/Page_Members Area/input_Enter your comments_form-field-radio'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/Whistle_Blower/Page_Members Area/input_Enter your comments_form-field-radio'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/Whistle_Blower/Page_Members Area/input_Enter your comments_form-field-radio'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/Whistle_Blower/Page_Members Area/button_Submit'))


'----------------------------------------------'
WebUI.verifyTextPresent('Thank you', false)
'----------------------------------------------'
WebUI.verifyTextPresent('Your data has been submitted', false)
'----------------------------------------------'

// TODO

// END