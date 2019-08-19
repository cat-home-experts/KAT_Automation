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
// Give Feedback - Final page - Thank You!                                | - Snip - 14/08/2019 - To Refactor
//-------------------------------------------------------------------------
WebUI.waitForPageLoad(2)

'--------------------------------'
'Read data from spreadsheet      |'
'--------------------------------'
def data = findTestData('Data Files/Give_Feedback (1)') // put this into a method
Account_Verification_Name = data.getValue('Account_Verification_Name', GlobalVariable.row)

'------------------------------------'
'  Verify Page Detail                |'
'------------------------------------'
'------------------------------------'
// Subtext review details is displayed
WebUI.verifyTextPresent('A Checkatrade staff member will now review your feedback for', false)
'------------------------------------'
// Account name that left the Feedback
WebUI.verifyTextPresent(Account_Verification_Name, false)
'------------------------------------'
// Finish Button is Displayed
WebUI.verifyTextPresent('Finish', false)
'------------------------------------'
// Thank You! is Displayed
WebUI.verifyTextPresent('Thank you!', false)

'------------------------------------'
'  Hit Finish                        |'
'------------------------------------'
WebUI.click(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/a_Finish')) // or 4 tabs
//WebUI.sendKeys(findTestObject(URL), Keys.chord(Keys.ENTER))

'------------------------------------'
'  Verify Return to Home Page        |'
'------------------------------------'

WebUI.waitForPageLoad(2)
'------------------------------------'
// Returned to Home Page
'------------------------------------'
// Homepage Header Displyed
WebUI.verifyTextPresent('Helping you find the right trade or service', false)
'------------------------------------'
// Homepage Service Informaation is Displayed
WebUI.verifyTextPresent('Search through over 30,000 recommended, vetted and monitored trades and service providers for free.', false)
'------------------------------------'
// Search by Member Trade Name is Displayed
WebUI.verifyTextPresent('or look up a member by name', false)
'------------------------------------'
// Number of Reviews Published so far is Displayed
WebUI.verifyTextPresent('reviews published so far – thank you!', false)

//-------------------------------------------------------
// END                                                  | - Snip - 14/08/2019 - To Refactor
//-------------------------------------------------------