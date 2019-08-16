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
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.exception.StepErrorException as StepErrorException
import org.openqa.selenium.Keys as Keys

WebUI.waitForPageLoad(1)

////WebUI.setText(findTestObject('Object Repository/Page_Checkatrade Give your feedback/input_Value Of Work_ctl00contenttbValueOfWork'), '10000')
//WebUI.setText(findTestObject('Object Repository/New Folder1/Page_Checkatrade Give your feedback/input_Value Of Work_ctl00contenttbValueOfWork'), '12000')

WebUI.sendKeys(findTestObject(URL), Keys.chord(Keys.ENTER))
WebUI.delay(1)
WebUI.sendKeys(findTestObject(URL), Keys.chord(Keys.ENTER))
WebUI.delay(1)
WebUI.sendKeys(findTestObject(URL), Keys.chord(Keys.NUMPAD1))
WebUI.delay(1)
WebUI.sendKeys(findTestObject(URL), Keys.chord(Keys.NUMPAD0))
WebUI.delay(1)
WebUI.sendKeys(findTestObject(URL), Keys.chord(Keys.NUMPAD0))
WebUI.delay(1)
WebUI.sendKeys(findTestObject(URL), Keys.chord(Keys.NUMPAD0))
WebUI.delay(1)
KeywordUtil.markPassed(" * * *  PASSED  * * *")
''
// end
