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

'--------------------------------------------------------------------------'
' Created on 08/01/2020 During Mobile Device Emulation Investigation       |'
'--------------------------------------------------------------------------'

'KEYS'
'Select Emulation viaa Keystrokes'
'F12'
'Control+Shift+M'

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

WebUI.delay(1)

'KEYS'
'Select Mobile Emulator Via Keystrokes'
'Tabs x 1'
'Enter'
'Down Arrow n'
'Enter'


'-6 tabs from startup'
'Enter'  // Default values
'Down 1' // Responsive
'Down 1' // Galaxy S5
'Down 1' // Pixel 2
'Down 1' // Pixel 2 XL
'Down 1' // iPhone 5/SE
'Down 1' // iPhone 6/7/8
'Down 1' // iPhone 6/7/8 Plus
'Down 1' // iPhone X
'Down 1' // iPad
'Down 1' // iPad Pro
'Down 1' // Edit Above Values

//Robot robot = new Robot()
robot.keyPress(KeyEvent.VK_SHIFT)
robot.keyPress(KeyEvent.VK_TAB)
WebUI.delay(1)
robot.keyRelease(KeyEvent.VK_TAB)
robot.keyRelease(KeyEvent.VK_SHIFT)

robot.keyPress(KeyEvent.VK_SHIFT)
robot.keyPress(KeyEvent.VK_TAB)
WebUI.delay(1)
robot.keyRelease(KeyEvent.VK_TAB)
robot.keyRelease(KeyEvent.VK_SHIFT)

robot.keyPress(KeyEvent.VK_SHIFT)
robot.keyPress(KeyEvent.VK_TAB)
WebUI.delay(1)
robot.keyRelease(KeyEvent.VK_TAB)
robot.keyRelease(KeyEvent.VK_SHIFT)

robot.keyPress(KeyEvent.VK_SHIFT)
robot.keyPress(KeyEvent.VK_TAB)
WebUI.delay(1)
robot.keyRelease(KeyEvent.VK_TAB)
robot.keyRelease(KeyEvent.VK_SHIFT)

robot.keyPress(KeyEvent.VK_SHIFT)
robot.keyPress(KeyEvent.VK_TAB)
WebUI.delay(1)
robot.keyRelease(KeyEvent.VK_TAB)
robot.keyRelease(KeyEvent.VK_SHIFT)

robot.keyPress(KeyEvent.VK_ENTER)
WebUI.delay(1)
robot.keyRelease(KeyEvent.VK_ENTER)

robot.keyPress(KeyEvent.VK_DOWN)
WebUI.delay(1)
robot.keyRelease(KeyEvent.VK_DOWN)

robot.keyPress(KeyEvent.VK_DOWN)
WebUI.delay(1)
robot.keyRelease(KeyEvent.VK_DOWN)

robot.keyPress(KeyEvent.VK_DOWN)
WebUI.delay(1)
robot.keyRelease(KeyEvent.VK_DOWN)

robot.keyPress(KeyEvent.VK_DOWN)
WebUI.delay(1)
robot.keyRelease(KeyEvent.VK_DOWN)

robot.keyPress(KeyEvent.VK_DOWN)
WebUI.delay(1)
robot.keyRelease(KeyEvent.VK_DOWN)

robot.keyPress(KeyEvent.VK_DOWN)
WebUI.delay(1)
robot.keyRelease(KeyEvent.VK_DOWN)

robot.keyPress(KeyEvent.VK_DOWN)
WebUI.delay(1)
robot.keyRelease(KeyEvent.VK_DOWN)

robot.keyPress(KeyEvent.VK_DOWN)
WebUI.delay(1)
robot.keyRelease(KeyEvent.VK_DOWN)

robot.keyPress(KeyEvent.VK_DOWN)
WebUI.delay(1)
robot.keyRelease(KeyEvent.VK_DOWN)

WebUI.delay(5)
///////////////////////////////////////
//                END                //
///////////////////////////////////////
