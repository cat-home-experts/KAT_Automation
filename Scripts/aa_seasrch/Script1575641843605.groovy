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

WebUI.click(findTestObject('Object Repository/WO_Consumer/Page_/Page_/a_Find Consumer'))

WebUI.setText(findTestObject('Object Repository/WO_Consumer/Page_/Page_/input_Forename_ctl00CP1ctlSearchtbForenames'), 'Gordon')

WebUI.setText(findTestObject('Object Repository/WO_Consumer/Page_/Page_/input_Surname_ctl00CP1ctlSearchtbSurname'), 'Brown')

WebUI.setText(findTestObject('Object Repository/WO_Consumer/Page_/Page_/input_County_ctl00CP1ctlSearchtbCounty'), 'West Sussex')

WebUI.click(findTestObject('Object Repository/WO_Consumer/Page_/Page_/input_Clear_ctl00CP1ctlSearchbtnSearch'))

WebUI.click(findTestObject('Object Repository/WO_Consumer/Page_/Page_/a_Feedback'))

WebUI.click(findTestObject('Object Repository/WO_Consumer/Page_/Page_/a_Feedback'))

WebUI.click(findTestObject('Object Repository/WO_Consumer/Page_/Page_/td_TopRow'))

WebUI.click(findTestObject('Object Repository/WO_Consumer/Page_/Page_/td_gordbrogmailcom'))

WebUI.click(findTestObject('Object Repository/WO_Consumer/Page_/Page_/a_Mr Gordon Brown'))

WebUI.click(findTestObject('Object Repository/WO_Consumer/Page_/Page_/a_5 reputation reports'))

WebUI.click(findTestObject('Object Repository/WO_Consumer/Page_/Page_/a_0 recommendations'))

WebUI.click(findTestObject('Object Repository/WO_Consumer/Page_/Page_/a_1 negative comment'))

WebUI.click(findTestObject('Object Repository/WO_Consumer/Page_/Page_/a_0 callback shortlists'))

WebUI.click(findTestObject('Object Repository/WO_Consumer/Page_/Page_/a_1 feedback request'))

WebUI.click(findTestObject('Object Repository/WO_Consumer/Page_/Page_/a_0 vetting references'))

WebUI.click(findTestObject('Object Repository/WO_Consumer/Page_/Page_/span_447772535248'))

WebUI.click(findTestObject('Object Repository/WO_Consumer/Page_/Page_/div_Haywards Heath West Sussex RH16 4ER4477_d20822'))

WebUI.click(findTestObject('Object Repository/WO_Consumer/Page_/Page_/h4_Vetting References'))

WebUI.click(findTestObject('Object Repository/WO_Consumer/Page_/Page_/input_Clear_ctl00CP1ctlSearchbtnSearch'))

WebUI.click(findTestObject('Object Repository/WO_Consumer/Page_/Page_/td_5'))

WebUI.click(findTestObject('Object Repository/WO_Consumer/Page_/Page_/h4_Edit Consumer'))

WebUI.click(findTestObject('Object Repository/WO_Consumer/Page_/Page_/input_Title_ctledittbTitle'))

WebUI.click(findTestObject('Object Repository/WO_Consumer/Page_/Page_/input_Forenames_ctledittbForename'))

WebUI.click(findTestObject('Object Repository/WO_Consumer/Page_/Page_/input_Surname_ctledittbSurname'))

WebUI.click(findTestObject('Object Repository/WO_Consumer/Page_/Page_/input_Email_ctledittbEmail'))

WebUI.click(findTestObject('Object Repository/WO_Consumer/Page_/Page_/input_Mobile_ctledittbMobile'))

WebUI.click(findTestObject('Object Repository/WO_Consumer/Page_/Page_/label_Receive updates from Checkatrade'))

WebUI.click(findTestObject('Object Repository/WO_Consumer/Page_/Page_/label_Receive updates from selected third parties'))

WebUI.click(findTestObject('Object Repository/WO_Consumer/Page_/Page_/label_Receive updates from selected third parties'))

WebUI.click(findTestObject('Object Repository/WO_Consumer/Page_/Page_/label_Receive updates from Checkatrade'))

WebUI.click(findTestObject('Object Repository/WO_Consumer/Page_/Page_/input_House name  building_ctleditctlConsum_c82a25'))

WebUI.click(findTestObject('Object Repository/WO_Consumer/Page_/Page_/input_Number and Street_ctleditctlConsumerA_20e0c9'))

WebUI.click(findTestObject('Object Repository/WO_Consumer/Page_/Page_/input_Town_ctleditctlConsumerAddresstbTown'))

WebUI.click(findTestObject('Object Repository/WO_Consumer/Page_/Page_/span_Please ensure the Street  Road name is_e38a58'))

WebUI.click(findTestObject('Object Repository/WO_Consumer/Page_/Page_/input_City_ctleditctlConsumerAddresstbCity'))

WebUI.click(findTestObject('Object Repository/WO_Consumer/Page_/Page_/input_County_ctleditctlConsumerAddresstbCounty'))

WebUI.click(findTestObject('Object Repository/WO_Consumer/Page_/Page_/input_Postcode_ctleditctlConsumerAddresstbPostcode'))

WebUI.click(findTestObject('Object Repository/WO_Consumer/Page_/Page_/input_Telephone 1_ctleditctlConsumerAddress_e485b7'))

WebUI.click(findTestObject('Object Repository/WO_Consumer/Page_/Page_/input_Telephone 2_ctleditctlConsumerAddress_4d855f'))

WebUI.click(findTestObject('Object Repository/WO_Consumer/Page_/Page_/input_Fax_ctleditctlConsumerAddresstbFax'))

WebUI.click(findTestObject('Object Repository/WO_Consumer/Page_/Page_/input_Please supply a valid phone number_btnCancel'))

WebUI.click(findTestObject('Object Repository/WO_Consumer/Page_/Page_/input_Please supply a valid phone number_btnSave'))

