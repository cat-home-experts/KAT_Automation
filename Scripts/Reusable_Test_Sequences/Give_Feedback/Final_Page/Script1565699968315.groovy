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
def Account_Verification_Name = data.getValue('Account_Verification_Name', GlobalVariable.row)
def YE_Recommend = data.getValue("YE_Recommendations", GlobalVariable.row) // 
def YE_Work_Carried_Out = data.getValue("YE_Work_Carried_Out", GlobalVariable.row)

//-------------------------------------------------------------------------------
// Ensure Page is HERE Before Testing (Firefox was slow - hence this check)     |
//-------------------------------------------------------------------------------
WebUI.waitForElementVisible(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/a_Finish'), 60)  

'------------------------------------'
'  Verify Page Detail                |'
'------------------------------------'
// If Recommendation = NO, these fields are not shown on the final page
if (YE_Recommend == ("Yes")) {
	'------------------------------------'
	//WebUI.delay(2)
	// Subtext review details is displayed
	WebUI.verifyTextPresent('A Checkatrade staff member will now review your feedback for', false)
	'------------------------------------'
	// Account name that left the Feedback
	WebUI.verifyTextPresent(Account_Verification_Name, false)
	'------------------------------------'
	// Finish Button is Displayed
	WebUI.verifyTextPresent('Finish', false)
	'------------------------------------'
}
// Clearly the customer isn't happy, and reflecting appology and compassion on the final page
else if (YE_Recommend == ("No") && (YE_Work_Carried_Out) == ("No"))  {
	'------------------------------------'
	//WebUI.delay(2)
	// Subtext review details is displayed
	WebUI.verifyTextPresent('We are very sorry that you have had a bad experience', false)
	'------------------------------------'
}

'------------------------------------'
// Thank You! is Displayed (Success contains !, Non Success Doesn't
WebUI.verifyTextPresent('Thank you', true)

'------------------------------------'
'  Hit Finish                        |'
'------------------------------------'
WebUI.waitForElementClickable(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/a_Finish'), 60)
WebUI.click(findTestObject('Object Repository/New Folder/Page_Checkatrade Give your feedback/a_Finish')) // or 4 tabs
//WebUI.sendKeys(findTestObject(URL), Keys.chord(Keys.ENTER))

//-------------------------------------------------------
// END                                                  | - Snip - 14/08/2019 - To Refactor
//-------------------------------------------------------