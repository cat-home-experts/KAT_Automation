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

//-----------------------------------------------
// Hit SUBMIT Button on Trades Application form  | - Snip - 30/07/2019
//-----------------------------------------------
'----------------------------------------------------------------------------------'
'SUBMIT BUTTON IS OFF THE BOTTOM OF THE PAGE - SO NEED TO SCROLL TO BOTTOM OF PAGE  |'
'----------------------------------------------------------------------------------'
WebUI.scrollToElement(findTestObject('Object Repository/Page_Checkatrade Want to build your business/input_membership terms and conditions_ctl00contentbtnSubmit'), 5)
'-------------'
WebUI.delay(1)
'-------------'
'Click Submit |'
'-------------'
WebUI.click(findTestObject('Object Repository/Page_Checkatrade Want to build your business/input_membership terms and conditions_ctl00contentbtnSubmit'))
//WebUI.click(findTestObject('contentbtnSubmit')) old object reference left for debug purposes

//-------------------------------------------------------
// END                                                  | - Snip - 30/07/2019
//-------------------------------------------------------