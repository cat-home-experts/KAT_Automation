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

//------------------------------------
// Scroll - To Footer                | - Snip - 07/08/2019
//------------------------------------

'-----------------------------------------------------'
' Major changes factored into function 05/12/2019     |'
'-----------------------------------------------------'

'Animation Removed '
//-------------------------------------------
'Scroll - To Footer on the bottom of the page (sometime off the screen) '
'Scroll Element into VIEW, as the following text to verify can be off the screen'
//WebUI.waitForElementVisible(findTestObject('Page_of_Results/div_see all_footer__van-with-trailer'), 60)
//WebUI.scrollToElement(findTestObject('Page_of_Results/div_see all_footer__van-with-trailer'), 4)
WebUI.waitForPageLoad(60)
//WebUI.waitForElementVisible(findTestObject('Page_of_Results/Printable_Reports-Link'), 60)
//WebUI.scrollToElement(findTestObject('Page_of_Results/Printable_Reports-Link'), 4)
WebUI.scrollToPosition(999, 999)

WebUI.delay(1)
//-------------------------------------------

//------------------------------------
// END                               | - Snip - 07/08/2019
//------------------------------------
