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

GlobalVariable.URL = 'https://admin.preview.checkatrade.com/Login.aspx?ReturnUrl=%2f'

WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Web_Office/Directives/WebOffice_StartUp'), [:], FailureHandling.OPTIONAL)

WebUI.navigateToUrl('https://admin.preview.checkatrade.com/')

GlobalVariable.URL = 'https://admin.preview.checkatrade.com/Login.aspx?ReturnUrl=%2f'

WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Web_Office/Directives/WebOffice_StartUp'), [:], FailureHandling.OPTIONAL)

WebUI.navigateToUrl('https://admin.preview.checkatrade.com/')

WebUI.openBrowser('')

WebUI.navigateToUrl('https://admin.preview.checkatrade.com/')

WebUI.click(findTestObject('Object Repository/WebOffice/Companies_Top/Page_Checkatrade Web Office (preview)/a_Companies'))

WebUI.click(findTestObject('Object Repository/WebOffice/Companies_Top/Page_/span_Advanced Search'))

WebUI.closeBrowser()

