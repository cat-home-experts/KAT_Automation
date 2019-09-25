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

WebUI.navigateToUrl('https://preview-ma.checkatrade.com/work-area')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Profiles_Page/Page_Members Area/input_Username_username'), 'check1234')

WebUI.setEncryptedText(findTestObject('Object Repository/Profiles_Page/Page_Members Area/input_Password_password'), 'fzqqY0qJjYTuJiVJRZh4ag==')

WebUI.click(findTestObject('Object Repository/Profiles_Page/Page_Members Area/button_Log in'))

WebUI.click(findTestObject('Object Repository/Profiles_Page/Page_Members Area/a_Profile text') // //*[@id="profilePage"]/a/div[1]/img
    )

WebUI.openBrowser('')

WebUI.navigateToUrl('https://preview-ma.checkatrade.com/work-area')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Profiles_Page/Page_Members Area/input_Username_username'), 'check1234')

WebUI.setEncryptedText(findTestObject('Object Repository/Profiles_Page/Page_Members Area/input_Password_password'), 'fzqqY0qJjYTuJiVJRZh4ag==')

WebUI.click(findTestObject('Object Repository/Profiles_Page/Page_Members Area/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_Members Area/Profiles/Page_Members Area/a_Profile text') // //*[@id="profilePage"]/a/div[1]/img
    )

WebUI.setText(findTestObject('Object Repository/Page_Members Area/Profiles/Page_Members Area/textarea_All BN postcode areas_w-100 ng-untouched ng-valid ng-dirty'), 
    '  This profile has been set up by Checkatrade.com for training/testing purposes. Please do not use the details on this page for contacting US!!')

WebUI.click(findTestObject('Object Repository/Page_Members Area/Profiles/Page_Members Area/button_Save Work Location'))

