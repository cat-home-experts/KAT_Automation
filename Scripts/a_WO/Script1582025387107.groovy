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

WebUI.navigateToUrl('https://admin.preview.checkatrade.com/Login.aspx?ReturnUrl=%2fSettings%2fWebSite%2fJoinNowPageSettings.aspx')

WebUI.setText(findTestObject('Page_Checkatrade - Administration - Login/input_Username_LoginControlUserName'), 'DavidHo')

WebUI.setEncryptedText(findTestObject('Page_Checkatrade - Administration - Login/input_Password_LoginControlPassword'), 
    'AmDSJqbCZAGZ34/Q6uJgMA==')

WebUI.click(findTestObject('Page_Checkatrade - Administration - Login/input_Remember me next time_LoginControlLog_86123a'))

WebUI.click(findTestObject('Page_/a_Join Now Campaigns'))

WebUI.click(findTestObject('Object Repository/WebOffice_Home_page/Page_/input_Set manual text_ctl00CP1btnCreateCampaign'))

WebUI.setText(findTestObject('Object Repository/WebOffice_Home_page/Page_/input_Title_ctl00CP1txtTitle'), 'Tester')

WebUI.setText(findTestObject('Object Repository/WebOffice_Home_page/Page_/input_Description_ctl00CP1txtDescription'), 'Testing')

WebUI.setText(findTestObject('Object Repository/WebOffice_Home_page/Page_/textarea_Terms and Conditions_ctl00CP1txtTerms'), 
    'Testing Tester')

WebUI.click(findTestObject('Page_/a_Join Now Campaigns'))

