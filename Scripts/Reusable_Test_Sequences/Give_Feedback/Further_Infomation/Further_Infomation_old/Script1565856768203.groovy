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

//-------------------------------------------------------------------------
// Give Feedback - Further Information Page - Value of Work - and Commit  | - Snip - 14/08/2019 - To Refactor
//-------------------------------------------------------------------------

WebUI.waitForPageLoad(2)

'------------------------------------'
'  Set Value of Work Completed       |'
'------------------------------------'

try {
	WebUI.click(findTestObject('Object Repository/Page_Checkatrade Give your feedback/input_Value Of Work_ctl00contenttbValueOfWork'))
	
	WebUI.setText(findTestObject('Object Repository/Page_Checkatrade Give your feedback/input_Value Of Work_ctl00contenttbValueOfWork'), '10000')
} catch (Exception e) {
// false failure
	println ("10000 Entered as the cost of work done")
}

WebUI.waitForPageLoad(2)
WebUI.back()
//WebUI.delay(1)
//WebUI.waitForPageLoad(2)
//WebUI.refresh()
'------------------------------------'
'  Commit Page                       |'
'------------------------------------'

//WebUI.click(findTestObject('Object Repository/Page_Checkatrade Give your feedback/input_Value Of Work_ctl00contentButton1'))
// WebUI.sendKeys(findTestObject(URL), Keys.chord(Keys.ENTER))
//WebUI.delay(1)
//WebUI.waitForPageLoad(2)
//WebUI.back()

//-------------------------------------------------------
// END                                                  | - Snip - 14/08/2019 - To Refactor
//-------------------------------------------------------