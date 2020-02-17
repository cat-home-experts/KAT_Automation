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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.preview.checkatrade.com/')

WebUI.click(findTestObject('Object Repository/CAT_Footer/Homeowner/Ribbon_Menu/Page_Checkatrade Find a tradesperson you can trust/div_Why Checkatrade'))

WebUI.click(findTestObject('CAT_Footer/Homeowner/Ribbon_Menu/span_Why Checkatrade'))

WebUI.click(findTestObject('CAT_Footer/Homeowner/Ribbon_Menu/span_The Checkatrade Standard'))

WebUI.click(findTestObject('Object Repository/CAT_Footer/Homeowner/Ribbon_Menu/Page_Checkatrade the standard every member holds/span_Resolving issues'))

WebUI.click(findTestObject('CAT_Footer/Homeowner/Ribbon_Menu/span_FAQ'))

WebUI.click(findTestObject('Object Repository/CAT_Footer/Homeowner/Ribbon_Menu/Page_Checkatrade Frequently asked questions/div_The Checkatrade Standard'))

WebUI.click(findTestObject('CAT_Footer/Homeowner/Ribbon_Menu/div_Complaints About A Member'))

WebUI.click(findTestObject('CAT_Footer/Homeowner/Ribbon_Menu/div_Complaints About A Member (1)'))

WebUI.click(findTestObject('Object Repository/CAT_Footer/Homeowner/Ribbon_Menu/Page_Checkatrade Complaints About A Member/div_FAQ'))

WebUI.click(findTestObject('Object Repository/CAT_Footer/Homeowner/Ribbon_Menu/Page_Checkatrade Frequently asked questions/div_Secure Contacts'))

WebUI.click(findTestObject('Object Repository/CAT_Footer/Homeowner/Ribbon_Menu/Page_Checkatrade Secure Contacts/div_Advice  Inspiration'))

