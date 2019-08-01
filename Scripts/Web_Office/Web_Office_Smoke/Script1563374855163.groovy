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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://admin.checkatrade.com/Login.aspx?ReturnUrl=%2f')

WebUI.setText(findTestObject('Object Repository/Web_Office/Page_Checkatrade - Administration - Login/Page_Checkatrade - Administration - Login/input_Username_LoginControlUserName'), 
    'DavidHo')

WebUI.setEncryptedText(findTestObject('Object Repository/Web_Office/Page_Checkatrade - Administration - Login/Page_Checkatrade - Administration - Login/input_Password_LoginControlPassword'), 
    'AmDSJqbCZAGZ34/Q6uJgMA==')

//WebUI.click(findTestObject('Object Repository/Web_Office/Page_Checkatrade - Administration - Login/Page_Checkatrade - Administration - Login/input_Remember me next time_LoginControlLoginButton'))

//WebUI.closeBrowser()

