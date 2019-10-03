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

WebUI.navigateToUrl('https://preview-ma.checkatrade.com/membership')

WebUI.setText(findTestObject('Object Repository/Membership/Page_Members Area/input_Username_username'), 'check1234')

WebUI.setEncryptedText(findTestObject('Object Repository/Membership/Page_Members Area/input_Password_password'), 'fzqqY0qJjYTuJiVJRZh4ag==')

WebUI.click(findTestObject('Object Repository/Membership/Page_Members Area/i_Log in_ace-icon fa fa-arrow-right'))

WebUI.navigateToUrl('https://preview-ma.checkatrade.com/membership')

WebUI.setText(findTestObject('Object Repository/Membership/Page_Members Area/input_Username_username'), 'check1234')

WebUI.setEncryptedText(findTestObject('Object Repository/Membership/Page_Members Area/input_Password_password'), 'fzqqY0qJjYTuJiVJRZh4ag==')

WebUI.click(findTestObject('Object Repository/Membership/Page_Members Area/i_Log in_ace-icon fa fa-arrow-right'))

WebUI.setEncryptedText(findTestObject('Object Repository/Membership/Page_Members Area/input_Password_password'), 'fzqqY0qJjYTuJiVJRZh4ag==')

WebUI.click(findTestObject('Object Repository/Membership/Page_Members Area/i_Log in_ace-icon fa fa-arrow-right'))

WebUI.click(findTestObject('Object Repository/Membership/Page_Members Area/a_Dashboard'))

WebUI.click(findTestObject('Object Repository/Membership/Page_Members Area/img'))

WebUI.click(findTestObject('Object Repository/Members/Page_Members Area/i_Settings'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Membership/Page_Members Area/select_Do not sendOtherCompany email address jonwoodcheckatradecomMr Daniel Davis danieldavisedaxiscoukMr Testing Team supportcheckatradecomMr Testing Team supportcheckatradecomMr Alexander Nunn alexandernunncheckatradec'), 
    '1: Object', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Membership/Page_Members Area/select_Do not sendOtherCompany email address jonwoodcheckatradecomMr Daniel Davis danieldavisedaxiscoukMr Testing Team supportcheckatradecomMr Testing Team supportcheckatradecomMr Alexander Nunn alexandernunncheckatradec'), 
    '14: Object', true)

WebUI.click(findTestObject('Object Repository/Membership/Page_Members Area/input_Send your customers initial information about your rates and services_chkAutoResponder'))

WebUI.click(findTestObject('Object Repository/Membership/Page_Members Area/input_Send your customers initial information about your rates and services_chkAutoResponder'))

WebUI.click(findTestObject('Object Repository/Membership/Page_Members Area/button_Submit'))

WebUI.click(findTestObject('Object Repository/Membership/Page_Members Area/button_Close'))

WebUI.click(findTestObject('Object Repository/Members/Page_Members Area/i_Settings'))

