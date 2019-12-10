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

WebUI.navigateToUrl('https://www.preview.checkatrade.com/Join/JoinNow.aspx')

WebUI.setText(findTestObject('Object Repository/aajunk/Page_Checkatrade Want to build your business/input_find out more_ctl00contenttbContactFirstName'), 
    'bxbxbbxxb')

WebUI.setText(findTestObject('Object Repository/aajunk/Page_Checkatrade Want to build your business/input_find out more_ctl00contenttbContactLastName'), 
    'hdhdhdhd')

WebUI.setText(findTestObject('Object Repository/aajunk/Page_Checkatrade Want to build your business/input_find out more_ctl00contenttbContactEmail'), 
    'hdhdhd')

WebUI.setText(findTestObject('Object Repository/aajunk/Page_Checkatrade Want to build your business/input_Please enter a valid email address_ct_099db5'), 
    'jsjsjsjsjsjs')

WebUI.setText(findTestObject('Object Repository/aajunk/Page_Checkatrade Want to build your business/input_Please enter a valid email address_ct_683ced'), 
    'dhdhhdhdh')

WebUI.setText(findTestObject('Object Repository/aajunk/Page_Checkatrade Want to build your business/input_Please specify a valid phone number_c_b145b4'), 
    'jsjsjsjsjss')

WebUI.setText(findTestObject('Object Repository/aajunk/Page_Checkatrade Want to build your business/input_find out more_ctl00contenttbContactFirstName'), 
    '')

WebUI.setText(findTestObject('Object Repository/aajunk/Page_Checkatrade Want to build your business/input_find out more_ctl00contenttbContactLastName'), 
    '')

WebUI.setText(findTestObject('Object Repository/aajunk/Page_Checkatrade Want to build your business/input_find out more_ctl00contenttbContactEmail'), 
    '')

WebUI.setText(findTestObject('Object Repository/aajunk/Page_Checkatrade Want to build your business/input_Please enter a valid email address_ct_099db5'), 
    '')

WebUI.setText(findTestObject('Object Repository/aajunk/Page_Checkatrade Want to build your business/input_Please enter a valid email address_ct_683ced'), 
    '')

WebUI.setText(findTestObject('Object Repository/aajunk/Page_Checkatrade Want to build your business/input_Please specify a valid phone number_c_b145b4'), 
    '')

