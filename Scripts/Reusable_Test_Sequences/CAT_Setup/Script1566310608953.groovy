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
//WebUI.openBrowser("") // 20/08/2019 this 1 line below, replaces the 2 previous lines of code
'OPEN BROWSER'
WebUI.openBrowser(GlobalVariable.URL, FailureHandling.OPTIONAL)

//-----------------------------------------
'URL - Set from the ENVIRONMENT PROFILE '

//WebUI.navigateToUrl(GlobalVariable.URL)  // 20/08/2019
//-----------------------------------------
'WAIT for browser to load - waits up to 60 seconds before timeout occurs '
WebUI.waitForPageLoad(60)

//-----------------------------------------
'MAXIMIZE BROWSER '
WebUI.maximizeWindow()

//-----------------------------------------
//-----------------------------
// COOKIE POLICY CHECKBOX     |
//-----------------------------
//-----------------------------------------
if (WebUI.verifyTextPresent('Checkatrade.com uses cookies to make sure you get the best browsing experience', false).TRUE) {
    // (WebUI.verifyElementVisible(findTestObject('Page_Checkatrade Find a tradesperson you can trust/div_close'), false).TRUE){
    //-----------------------------------------
    'COOKIE POLICY POPOUT'
    //WebUI.verifyTextPresent('Checkatrade.com uses cookies to make sure you get the best browsing experience', false)
    //-----------------------------------------
    'Closes COOKIE nagging element '
    WebUI.click(findTestObject('Page_Checkatrade Find a tradesperson you can trust/div_close'))
    //-----------------------------------------
    'COOKIE POPOUT REMOVED'
    WebUI.verifyTextNotPresent('Checkatrade.com uses cookies to make sure you get the best browsing experience', false) 
	//-----------------------------------------
	} else (WebUI.verifyTextNotPresent('Checkatrade.com uses cookies to make sure you get the best browsing experience', false).FALSE) {
    System.out.println('Cookie Policy Update Not Displayed')
}

//-----------------------------
// PRIVACY POLICY CHECKBOX    |
//-----------------------------
//-----------------------------------------
if (WebUI.verifyTextPresent('We have updated our Privacy Policy, please review this', false).TRUE) {
    //-----------------------------------------
    'PRIVACY POLICY POPOUT'
    //WebUI.verifyTextPresent('We have updated our Privacy Policy, please review this', false)
    //-----------------------------------------
    'Closes PRIVACY nagging element '
    WebUI.click(findTestObject('Page_Checkatrade Find a tradesperson you can trust/div_close_1'))
    //-----------------------------------------
    'PRIVACY POPOUT REMOVED'
    WebUI.verifyTextNotPresent('We have updated our Privacy Policy, please review this', false)
    // '
	} else (WebUI.verifyTextNotPresent('We have updated our Privacy Policy, please review this', false).FALSE) {
    System.out.println('Privacy Policy Update Not Displayed')
}
///////////////////////////////
//  END
///////////////////////////////
	
		
	
