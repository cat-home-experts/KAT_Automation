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

//--------------------------------------------------------------------------------
// Click Link to Search on Trade Name (and ID) From the Home Page search Screen  | - Snip - 07/08/2019
//--------------------------------------------------------------------------------

//---------------------------------------------------------------------------------------------------------------
//   extended to cater for OLD and NEW Site  |    02/01/2020    |       DH        |                             |
//---------------------------------------------------------------------------------------------------------------
	WebUI.waitForPageLoad(60)

   //-----------------------------------------
    'Hit Search Trade Person by Name (or CAT ID)'
	
	if (GlobalVariable.Website_Version != "new"){
		//WebUI.scrollToElement(findTestObject('Object Repository/New_CAT_Search/Page_Checkatrade Find a tradesperson you can trust/button_or look up a member by name'), 10)
		// New Website
		WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Checkatrade Find a tradesperson you can trust/a_or look up a member by name'), 5)
		WebUI.click(findTestObject('Object Repository/Page_Checkatrade Find a tradesperson you can trust/a_or look up a member by name'))
		
	}
	
	if (GlobalVariable.Website_Version != "old"){
		// Old website
		// WebUI.waitForElementClickable(findTestObject('Page_Checkatrade Find a tradesperson you can trust/a_or look up a member by name'), 5)
		WebUI.scrollToPosition(0, 0)
		WebUI.click(findTestObject('Object Repository/New_CAT_Search/Page_Checkatrade Find a tradesperson you can trust/button_or look up a member by name'))

	}
	
	//-----------------------------------------
	'Waits only as long as required'
    WebUI.waitForPageLoad(60)
	//-----------------------------------------

//------------------------------------
// END                               | - Snip - 07/08/2019
//------------------------------------
