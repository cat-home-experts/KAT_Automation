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
// Nagging the Maximizes Browser              |    18/07/2019   |     Dave Horne   |                             |
//                                            |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
// Changed OpenBrowser/Navigate URL method    |    20/08/2019   |     Dave Horne   | OpenBrowser with preset URL |
//---------------------------------------------------------------------------------------------------------------
// Added Privacy Policy Check and close also  |    20/08/2019   |     Dave Horne   |                             |
//---------------------------------------------------------------------------------------------------------------
// Also, Closed Cookie and Privacy Nags with IF    20/08/2019   |     Dave Horne   |                             |
//---------------------------------------------------------------------------------------------------------------
// If Either Cookie or Privacy Elements are   |                 |                  |                             |
// Not Presented, Then a WARNING Is Flagged,  |    27/08/2019   |     Dave Horne   |                             |
// But the Test Step Will Still Pass if all OK|                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
// Try/Catches Re-Applied to Cookie/Privacy   |                 |                  |                             |
// Detection, and dispel                      |    20/08/2019   |     Dave Horne   |                             |
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
'URL - Set from the ENVIRONMENT PROFILE '
'OPEN BROWSER'
WebUI.openBrowser(GlobalVariable.URL)// 20/08/2019

//-----------------------------------------
'MAXIMIZE BROWSER '
WebUI.maximizeWindow()

//-----------------------------------------
'WAIT for browser to load - waits up to 60 seconds before timeout occurs '
WebUI.waitForPageLoad(60)
WebUI.waitForElementVisible(findTestObject('Page_Checkatrade Find a tradesperson you can trust/a_Search'), 25)
// WebUI.waitForElementVisible(findTestObject('Checkatrade_Trade_Search_page/Page_Checkatrade Find a tradesperson you can trust/a_Search'), 25)
try {
	//----------------------------------------------
	//'Closes COOKIE nagging element, If it Exists  |'
	//----------------------------------------------
	if (WebUI.verifyElementPresent(findTestObject('Page_Checkatrade Find a tradesperson you can trust/div_close'), 1, FailureHandling.OPTIONAL)) { 
		'---------------------------------' // // Default locator was hide_button - stopped working, use close button locator now - 27/08/2019
		WebUI.click(findTestObject('Page_Checkatrade Find a tradesperson you can trust/div_close'))
		'---------------------------------'
		'COOKIE POPOUT REMOVED - Confirmed'
		'---------------------------------'
		//WebUI.verifyElementNotPresent(findTestObject('Page_Checkatrade Find a tradesperson you can trust/div_close'), 5)
		WebUI.delay(1)
		WebUI.verifyTextNotPresent('Checkatrade.com uses cookies to make sure you get the best browsing experience', false)
	} 
} catch (Exception e_cookie) {
	System.out.println('The Cookie Nagging Element Was not presented on the '+GlobalVariable.URL+' Web Page' )
}
//-----------------------------------------------------------------------------------------------------------------------------------------------------
try {
	//----------------------------------------------
	//'Closes PRIVACY nagging element, If it Exists |'
	//----------------------------------------------
	if (WebUI.verifyElementPresent(findTestObject('Page_Checkatrade Find a tradesperson you can trust/div_close_1'), 1, FailureHandling.OPTIONAL)) { 
		'---------------------------------'
		WebUI.click(findTestObject('Page_Checkatrade Find a tradesperson you can trust/div_close_1'))
		'---------------------------------'
		'PRIVACY POPOUT REMOVED - Confirmed'
		'---------------------------------'
		//WebUI.verifyElementNotPresent(findTestObject('Page_Checkatrade Find a tradesperson you can trust/div_close_1'), 5)
		WebUI.delay(1)
		WebUI.verifyTextNotPresent('We have updated our Privacy Policy, please review this', false) 
	}
} catch (Exception e_privacy) {
	System.out.println('The Privacy Policy Nagging Element Was not presented on the '+GlobalVariable.URL+' Web Page' )
}
//----------------------------------------------

////-----------------------------
//// E N D                      |
////-----------------------------
