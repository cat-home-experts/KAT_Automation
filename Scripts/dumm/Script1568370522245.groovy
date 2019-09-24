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

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Profiles_Page/Page_Members Area/input_Username_username'), 'check1234')

WebUI.setEncryptedText(findTestObject('Object Repository/Profiles_Page/Page_Members Area/input_Password_password'), 'fzqqY0qJjYTuJiVJRZh4ag==')

WebUI.click(findTestObject('Object Repository/Profiles_Page/Page_Members Area/button_Log in'))

WebUI.click(findTestObject('Object Repository/Profiles_Page/Page_Members Area/a_Profile text')) // //*[@id="profilePage"]/a/div[1]/img

WebUI.delay(10)

//WebUI.click(findTestObject('Object Repository/Profiles_Page/Page_Members Area/a_Search appearances'))
//
//WebUI.click(findTestObject('Object Repository/Profiles_Page/Page_Members Area/a_Where you work'))
//
//WebUI.click(findTestObject('Object Repository/Profiles_Page/Page_Members Area/a_Company logo'))
//
//WebUI.click(findTestObject('Object Repository/Profiles_Page/Page_Members Area/a_Banner image'))
//
//WebUI.click(findTestObject('Object Repository/Profiles_Page/Page_Members Area/a_Vetting information'))
//
//WebUI.click(findTestObject('Object Repository/Profiles_Page/Page_Members Area/a_Insurance'))
//'-----------------------------------------------------------------------------------------'
//// Select from main COMPANY
//WebUI.click(findTestObject('Object Repository/Profiles_Page/Page_Members Area/a_Company logo'))
//// checkbox
//WebUI.click(findTestObject('Profiles_Page/Page_Members Area/input_image file_chkHouseRules'))
////  upload button
//WebUI.click(findTestObject('Object Repository/Profiles_Page/Page_Members Area/button_Upload Company Logo'))
//// popout window header
//WebUI.click(findTestObject('Object Repository/Profiles_Page/Page_Members Area/div_Add Company Logo'))
//// Hit Select on popout - windows explorer appears
//WebUI.click(findTestObject('Object Repository/Profiles_Page/Page_Members Area/button_Select Logo'))
//// close popout
//WebUI.click(findTestObject('Object Repository/Profiles_Page/Page_Members Area/button_Close'))
//'---------------------------------------------------------------------------------------'
//// Select from main BANNER
//WebUI.click(findTestObject('Object Repository/Profiles_Page/Page_Members Area/a_Banner image'))
//// checkbox
//WebUI.click(findTestObject('Profiles_Page/Page_Members Area/input_image file_chkHouseRules'))
////  upload button
//WebUI.click(findTestObject('Object Repository/Profiles_Page/Page_Members Area/button_Upload Banner Image'))
//// popout window header
//WebUI.click(findTestObject('Object Repository/Profiles_Page/Page_Members Area/div_Add Banner Image'))
//// Hit Select on popout - windows explorer appears
//WebUI.click(findTestObject('Object Repository/Profiles_Page/Page_Members Area/button_Select Banner Image'))
//// close popout
//WebUI.click(findTestObject('Object Repository/Profiles_Page/Page_Members Area/button_Close'))
//'------------------------------------------'
//
