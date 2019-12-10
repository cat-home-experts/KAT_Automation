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
import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

//-----------------------
// TEST HISTORY HEADER - |                                                                                                               |
//-----------------------
// Any changes to this script, please update the next available row below, with date, in the DATE CREATED column,
// Your Name in the CREATED BY column, and Finaly, The actual change implemented in the NOTES column.
//
//---------------------------------------------------------------------------------------------------------------
//       Test Definition / Description        |   Date Created  |    Created By    |             Notes           |
//---------------------------------------------------------------------------------------------------------------
// Fires up the website (CAT), Dispels Cookie |                 |                  |                             |
// Nagging the Maximizes Browser              |    18/07/2019   |         DH       |                             |
//                                            |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
// Changed OpenBrowser/Navigate URL method    |    20/08/2019   |         DH       | OpenBrowser with preset URL |
//---------------------------------------------------------------------------------------------------------------
// Added Privacy Policy Check and close also  |    20/08/2019   |         DH       |                             |
//---------------------------------------------------------------------------------------------------------------
// Also, Closed Cookie and Privacy Nags with IF    20/08/2019   |         DH       |                             |
//---------------------------------------------------------------------------------------------------------------
// If Either Cookie or Privacy Elements are   |                 |                  |                             |
// Not Presented, Then a WARNING Is Flagged,  |    27/08/2019   |         DH       |                             |
// But the Test Step Will Still Pass if all OK|                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
// Try/Catches Re-Applied to Cookie/Privacy   |                 |                  |                             |
// Detection, and dispel                      |    20/08/2019   |         DH       |                             |
//---------------------------------------------------------------------------------------------------------------
// Try/Catch Added for NEW Cookie Policy      |                 |                  |                             |
// Detection, and dispel                      |    04/12/2019   |         DH       |                             |
// Use of WebElementNotFoundException Implemt |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
//                                            |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
//                                            |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
//
//---------------------------------------------------------------------------------------------------------------
//                                                                                                               |
//                                                                                                               |
//                                                                                                               |
//                                                                                                               |
//                                                                                                               |
//                                                                                                               |
//                                                                                                               |
//---------------------------------------------------------------------------------------------------------------
//-----------------------------------------
//-----------------------------------------
// Startup Process -                      | NOTE: Members Area Function has it's OWN Startup Process
//-----------------------------------------

'URL - Set from the ENVIRONMENT PROFILE '
'OPEN BROWSER'
WebUI.openBrowser(GlobalVariable.URL)// 20/08/2019

//-----------------------------------------
'MAXIMIZE BROWSER '
WebUI.maximizeWindow()

//-----------------------------------------
'WAIT for browser to load - waits up to 60 seconds before timeout occurs '
//WebUI.delay(2)
WebUI.waitForPageLoad(60)
//WebUI.waitForElementVisible(findTestObject('Page_Checkatrade Find a tradesperson you can trust/a_Search'), 25)
// WebUI.waitForElementVisible(findTestObject('Checkatrade_Trade_Search_page/Page_Checkatrade Find a tradesperson you can trust/a_Search'), 25)
'COOKIE - ORIGINAL'
//try {
//	//----------------------------------------------
//	//'Closes COOKIE nagging element, If it Exists  |'
//	//----------------------------------------------
//	WebUI.verifyElementPresent(findTestObject('Page_Checkatrade Find a tradesperson you can trust/div_close'), 1, FailureHandling.OPTIONAL) 
//	'---------------------------------' // // Default locator was hide_button - stopped working, use close button locator now - 27/08/2019
//	WebUI.click(findTestObject('Page_Checkatrade Find a tradesperson you can trust/div_close'))
//	'---------------------------------'
//	'COOKIE POPOUT REMOVED - Confirmed'
//	'---------------------------------'
//	//WebUI.verifyElementNotPresent(findTestObject('Page_Checkatrade Find a tradesperson you can trust/div_close'), 5)
//	WebUI.delay(1)
//	WebUI.verifyTextNotPresent('Checkatrade.com uses cookies to make sure you get the best browsing experience', false)
//	
//} catch (WebElementNotFoundException e_cookie) {
//	KeywordUtil.markWarning("The Cookie Nagging Element Was not presented on the '+GlobalVariable.URL+' Web Page")
//}
////-----------------------------------------------------------------------------------------------------------------------------------------------------
//'PRIVACY - ORIGINAL'
//try {
//	//----------------------------------------------
//	//'Closes PRIVACY nagging element, If it Exists |'
//	//----------------------------------------------
//    WebUI.verifyElementPresent(findTestObject('Page_Checkatrade Find a tradesperson you can trust/div_close_1'), 1, FailureHandling.OPTIONAL)  
//	'---------------------------------'
//	WebUI.click(findTestObject('Page_Checkatrade Find a tradesperson you can trust/div_close_1'))
//	'---------------------------------'
//	'PRIVACY POPOUT REMOVED - Confirmed'
//	'---------------------------------'
//	//WebUI.verifyElementNotPresent(findTestObject('Page_Checkatrade Find a tradesperson you can trust/div_close_1'), 5)
//	WebUI.delay(1)
//	WebUI.verifyTextNotPresent('We have updated our Privacy Policy, please review this', false) 
//	 
//} catch (WebElementNotFoundException e_privacy) {
//	KeywordUtil.markWarning("The Privacy Policy Nagging Element Was not presented on the '+GlobalVariable.URL+' Web Page")
//	}
//----------------------------------------------
'COOKIE - NEW - 04/12/2019'
try {
	//----------------------------------------------
	//'Closes COOKIE nagging element, If it Exists  |'
	//----------------------------------------------
	WebUI.verifyElementPresent(findTestObject('Object Repository/New_Home/Page_Checkatrade Find a tradesperson you can trust/div_Close'), 1, FailureHandling.OPTIONAL)
	'---------------------------------' // // Default locator was hide_button - stopped working, use close button locator now - 27/08/2019
	WebUI.click(findTestObject('Object Repository/New_Home/Page_Checkatrade Find a tradesperson you can trust/div_Close'))
	'---------------------------------'
	'COOKIE POPOUT REMOVED - Confirmed'
	'---------------------------------'
	//WebUI.verifyElementNotPresent(findTestObject('Page_Checkatrade Find a tradesperson you can trust/div_close'), 5)
	WebUI.delay(1)
	WebUI.verifyTextNotPresent('Checkatrade.com uses cookies to make sure you get the best browsing experience', false)
	WebUI.verifyTextNotPresent('By continuing to use this website you are consenting to our use of cookies', false)
	WebUI.verifyTextNotPresent("For further information and to manage your cookie preferences, view Checkatrade's cookie policy", false)
		
} catch (WebElementNotFoundException e_cookie_popup) { //WebElementNotFoundException
	KeywordUtil.markWarning("The Cookie Nagging POPUP Was not presented on the '+GlobalVariable.URL+' Web Page")
}
//-----------------------------------------------------------------------------------------------------------------------------------------------------
' Home Page validation Checks after COOKIE Dispelled'
//WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Home'), [:], FailureHandling.CONTINUE_ON_FAILURE)

////-----------------------------
//// E N D                      |
////-----------------------------
