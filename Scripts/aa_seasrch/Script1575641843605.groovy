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

WebUI.navigateToUrl('https://www.preview.checkatrade.com/')

WebUI.waitForPageLoad(60)

WebUI.maximizeWindow()

WebUI.waitForPageLoad(60)

WebUI.click(findTestObject('Object Repository/Page_Checkatrade Find a tradesperson you can trust/button_Accept All'))

WebUI.click(findTestObject('Object Repository/Page_Checkatrade Find a tradesperson you can trust/div_Helping you find the right trade or ser_6c48f1'))

Robot robot = new Robot();

robot.keyPress(KeyEvent.VK_F12)
robot.keyRelease(KeyEvent.VK_F12)

WebUI.delay(1)

robot.keyPress(KeyEvent.VK_CONTROL)
robot.keyPress(KeyEvent.VK_SHIFT)
robot.keyPress(KeyEvent.VK_M)

WebUI.delay(1)

robot.keyRelease(KeyEvent.VK_M)
robot.keyRelease(KeyEvent.VK_SHIFT)
robot.keyRelease(KeyEvent.VK_CONTROL)


// CTRL+P is now released