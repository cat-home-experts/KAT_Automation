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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.openBrowser('')

WebUI.navigateToUrl('https://preview-ma.checkatrade.com/login?return=%2Fwork-alert')

WebUI.setText(findTestObject('Page_Members Area/input_Username_username'), 'check1234')

WebUI.setEncryptedText(findTestObject('Page_Members Area/input_Password_password'), 'fzqqY0qJjYTuJiVJRZh4ag==')

WebUI.click(findTestObject('Page_Members Area/button_Log in'))




WebUI.click(findTestObject('Object Repository/Page_Members Area/Profiles/Page_Members Area/button_Add Accreditation'))

WebUI.selectOptionByValue(findTestObject('Page_Members Area/Profiles/Page_Members Area/select_Select accreditation type_a'), 
    '128', true)

WebUI.setText(findTestObject('Object Repository/Page_Members Area/textarea_Notes_txtNotes'), 'random note for tesing purposes')

WebUI.click(findTestObject('Object Repository/Page_Members Area/button_Select Document'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/button_Close'))

