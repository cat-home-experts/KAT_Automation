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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://preview-ma.checkatrade.com/vetting-information')

WebUI.setText(findTestObject('Page_Members Area/input_Username_username'), 'check1234')

WebUI.setEncryptedText(findTestObject('Page_Members Area/input_Password_password'), 'fzqqY0qJjYTuJiVJRZh4ag==')

WebUI.click(findTestObject('Page_Members Area/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/Profiles/Page_Members Area/button_Save Vetting Information'))

WebUI.openBrowser('')

WebUI.navigateToUrl('https://preview-ma.checkatrade.com/vetting-information')

WebUI.setText(findTestObject('Object Repository/Page_Members Area/input_Username_username'), 'check1234')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Members Area/input_Password_password'), 'fzqqY0qJjYTuJiVJRZh4ag==')

WebUI.click(findTestObject('Object Repository/Page_Members Area/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/Profiles/Page_Members Area/button_Save Vetting Information'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/Profiles/Page_Members Area/input_Domestic Work_workDomestic'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/Profiles/Page_Members Area/input_Commercial Work_workCommercial'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/Profiles/Page_Members Area/input_Commercial Work_work24Hours'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/Profiles/Page_Members Area/input_Free Estimates_workFreeEstimates'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/Profiles/Page_Members Area/input_Insurance Work Undertaken_workInsurance'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/Profiles/Page_Members Area/input_Cards accepted_cardsAccepted'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/Profiles/Page_Members Area/input_Free Estimates (excl Insurance)_workFreeEstimatesExclIns'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/Profiles/Page_Members Area/input_Domestic Work_workDomestic'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/Profiles/Page_Members Area/input_Commercial Work_workCommercial'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/Profiles/Page_Members Area/input_Commercial Work_work24Hours'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/Profiles/Page_Members Area/input_Free Estimates_workFreeEstimates'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/Profiles/Page_Members Area/input_Insurance Work Undertaken_workInsurance'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/Profiles/Page_Members Area/input_Cards accepted_cardsAccepted'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/Profiles/Page_Members Area/input_Free Estimates (excl Insurance)_workFreeEstimatesExclIns'))

