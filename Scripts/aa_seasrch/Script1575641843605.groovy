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
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent

WebUI.openBrowser('')

WebUI.navigateToUrl('https://admin.preview.checkatrade.com/Consumers/')

WebUI.waitForPageLoad(60)

WebUI.maximizeWindow()

WebUI.waitForPageLoad(60)

WebUI.setText(findTestObject('Object Repository/WO_Consumer/Page_Checkatrade - Administration - Login/input_Username_LoginControlUserName'), 
    'davidHo')

WebUI.setEncryptedText(findTestObject('Object Repository/WO_Consumer/Page_Checkatrade - Administration - Login/input_Password_LoginControlPassword'), 
    '+TIXGDxHQ2djWoQBtb0BbQ==')

WebUI.click(findTestObject('Object Repository/WO_Consumer/Page_Checkatrade - Administration - Login/input_Remember me next time_LoginControlLog_86123a'))

WebUI.navigateToUrl('https://admin.preview.checkatrade.com/Login.aspx?ReturnUrl=%2fConsumers%2f')

WebUI.setEncryptedText(findTestObject('Object Repository/WO_Consumer/Page_Checkatrade - Administration - Login/input_Password_LoginControlPassword'), 
    'AmDSJqbCZAGZ34/Q6uJgMA==')

WebUI.click(findTestObject('Object Repository/WO_Consumer/Page_Checkatrade - Administration - Login/input_Remember me next time_LoginControlLog_86123a'))

WebUI.click(findTestObject('Object Repository/WO_Consumer/Page_/a_Find Consumer'))

WebUI.setText(findTestObject('Object Repository/WO_Consumer/Page_/input_Forename_ctl00CP1ctlSearchtbForenames'), 'Gordon')

WebUI.setText(findTestObject('Object Repository/WO_Consumer/Page_/input_Surname_ctl00CP1ctlSearchtbSurname'), 'Brown')

WebUI.setText(findTestObject('Object Repository/WO_Consumer/Page_/input_County_ctl00CP1ctlSearchtbCounty'), 'West Sussex')

WebUI.click(findTestObject('Object Repository/WO_Consumer/Page_/input_Clear_ctl00CP1ctlSearchbtnSearch'))

WebUI.click(findTestObject('Object Repository/WO_Consumer/Page_/a_Feedback'))

WebUI.click(findTestObject('Object Repository/WO_Consumer/Page_/a_Feedback'))

WebUI.click(findTestObject('WO_Consumer/Page_/td_TopRow'))

