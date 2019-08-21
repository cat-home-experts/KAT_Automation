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
WebUI.openBrowser(GlobalVariable.URL, FailureHandling.STOP_ON_FAILURE)
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
try {
	//-----------------------------------------
	if (WebUI.verifyElementPresent(findTestObject('Object Repository/div_close'))){
		//-----------------------------------------
		'COOKIE POLICY POPOUT'
		//WebUI.verifyTextPresent('Checkatrade.com uses cookies to make sure you get the best browsing experience', false)
		WebUI.verifyTextPresent('Checkatrade.com uses cookies to make sure you get the best browsing experience', false)
		//-----------------------------------------
		'Closes COOKIE nagging element '
		WebUI.click(findTestObject('Page_Checkatrade Find a tradesperson you can trust/div_close'))
		//-----------------------------------------
		'COOKIE POPOUT REMOVED'
		WebUI.verifyTextNotPresent('Checkatrade.com uses cookies to make sure you get the best browsing experience', false)

	} else if (WebUI.verifyElementPresent(findTestObject('Object Repository/div_close')).FALSE)  {
		
		throw new com.kms.katalon.core.exception.StepErrorException('Cookie Policy Checkbox was not Presented')
	}
	
} catch (Exception e) {
	// nothing to do but continue
	System.out.println('Cookie Policy Message was not Presented');
	
	//-----------------------------
}   // PRIVACY POLICY CHECKBOX    |
	//-----------------------------
try {
	//-----------------------------------------
	if (WebUI.verifyElementPresent(findTestObject('Object Repository/div_close_1'))){
		//-----------------------------------------
		'PRIVACY POLICY POPOUT'
		WebUI.verifyTextPresent('We have updated our Privacy Policy, please review this', false)
		//-----------------------------------------
		'Closes PRIVACY nagging element '
		WebUI.click(findTestObject('Page_Checkatrade Find a tradesperson you can trust/div_close_1'))
		//-----------------------------------------
		'PRIVACY POPOUT REMOVED'
		WebUI.verifyTextNotPresent('We have updated our Privacy Policy, please review this', false)

	} else if (WebUI.verifyElementPresent(findTestObject('Object Repository/div_close_1')).FALSE)  {
	
		throw new com.kms.katalon.core.exception.StepErrorException('Privacy Policy Checkbox was not Presented')
	}

			
} catch (Exception e1) {
	// nothing to do but continue
	System.out.println('Privacy Policy Message was not Presented');
}

