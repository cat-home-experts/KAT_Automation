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

WebUI.navigateToUrl('https://preview-ma.checkatrade.com/login?return=%2Fmy-profile-page')

WebUI.setText(findTestObject('Object Repository/Profiles_Page/Page_Members Area/input_Username_username'), 'check1234')

WebUI.setEncryptedText(findTestObject('Object Repository/Profiles_Page/Page_Members Area/input_Password_password'), 'fzqqY0qJjYTuJiVJRZh4ag==')

WebUI.click(findTestObject('Object Repository/Profiles_Page/Page_Members Area/button_Log in'))

//WebUI.click(findTestObject('Object Repository/Profiles_Page/Page_Members Area/a_Profile text'))

WebUI.click(findTestObject('Object Repository/Profiles_Page/Page_Members Area/h2_Update your profile text here'))

WebUI.click(findTestObject('Object Repository/Profiles_Page/Page_Members Area/i_Search appearances_ace-icon fa fa-list-alt bigger-400'))

WebUI.click(findTestObject('Object Repository/Profiles_Page/Page_Members Area/button_Save Search Appearance Info'))

//WebUI.click(findTestObject('Object Repository/Profiles_Page/Page_Members Area/a_Where you work'))

WebUI.click(findTestObject('Object Repository/Profiles_Page/Page_Members Area/h2_Update your work area here'))

//WebUI.click(findTestObject('Object Repository/Profiles_Page/Page_Members Area/a_Company logo'))

WebUI.click(findTestObject('Object Repository/Profiles_Page/Page_Members Area/h2_Update your company logo here'))

//WebUI.click(findTestObject('Object Repository/Profiles_Page/Page_Members Area/a_Banner image'))

WebUI.click(findTestObject('Object Repository/Profiles_Page/Page_Members Area/h2_Update your company banner image here'))

//WebUI.click(findTestObject('Object Repository/Profiles_Page/Page_Members Area/a_Vetting information'))

WebUI.click(findTestObject('Object Repository/Profiles_Page/Page_Members Area/h2_Update your accreditations and services here'))

WebUI.click(findTestObject('Object Repository/Profiles_Page/Page_Members Area/button_Add Accreditation'))

WebUI.click(findTestObject('Object Repository/Profiles_Page/Page_Members Area/h5_Add New Accreditation'))

WebUI.click(findTestObject('Object Repository/Profiles_Page/Page_Members Area/div_Checkatradecom_modal-backdrop fade show'))

//WebUI.click(findTestObject('Object Repository/Profiles_Page/Page_Members Area/a_Insurance'))

WebUI.click(findTestObject('Object Repository/Profiles_Page/Page_Members Area/h2_Update your Public Liability Insurance here'))

WebUI.click(findTestObject('Object Repository/Profiles_Page/Page_Members Area/button_Select Document'))

WebUI.click(findTestObject('Object Repository/Profiles_Page/Page_Members Area/a_Maximise your profile video'))

WebUI.switchToWindowTitle('Checkatrade - Maximise your profile - YouTube')

WebUI.click(findTestObject('Object Repository/Profiles_Page/Page_Checkatrade - Maximise your profile - YouTube/div_Back_logo-icon-container'))

