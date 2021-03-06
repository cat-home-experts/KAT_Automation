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
import com.kms.katalon.core.util.KeywordUtil

//----------------------------------------------------------------------------------------------------------
// Set the defined value from the associated spreadsheet into the associated CAT Search Location Text Box   | Updated to work with Firefox - Click on field before entry
//---------------------------------------------------------------------------------------------------------- 
'---------------------------------'
'Set and SEARCH SELECTED LOCATION |'
'---------------------------------'
//------------
// ORIGINAL  |
//------------
//WebUI.setText(findTestObject('Object Repository/Checkatrade_Trade_Search_Page/Page_Checkatrade Find a tradesperson you can trust/input_location'), 
//    findTestData('searchTestData').getValue('tradeLocation', GlobalVariable.row))
//------------
// ORIGINAL  |
//------------

if (GlobalVariable.Website_Version != "new"){

	// Old website
	WebUI.click(findTestObject('Object Repository/Checkatrade_Trade_Search_Page/Page_Checkatrade Find a tradesperson you can trust/input_Not here_location'))
	WebUI.setText(findTestObject('Object Repository/Checkatrade_Trade_Search_Page/Page_Checkatrade Find a tradesperson you can trust/input_Not here_location'),
		findTestData('Search_Trader_Location_Data_NEG').getValue('tradeNameLocation', GlobalVariable.row))

}

else {

	// New Website
	WebUI.waitForElementPresent(findTestObject('Object Repository/New_CAT_Search/Postcode_Search_Field'), 60)
	WebUI.click(findTestObject('Object Repository/New_CAT_Search/Postcode_Search_Field'))
	WebUI.setText(findTestObject('Object Repository/New_CAT_Search/Postcode_Search_Field'),	findTestData('Search_Trader_Location_Data_NEG').getValue('tradeNameLocation', GlobalVariable.row))

	
}

//-----------------------------------------
'Detect LOOKUP Issue - No Data'


if (WebUI.verifyTextNotPresent("Sorry, no results found", false)){
	
	KeywordUtil.markPassed("The Expected Lookup Result(s) ARE being returned by the Lookup Service, AS EXPECTED")
}
else {
	KeywordUtil.markWarning("The Expected Lookup Result(s) ARE NOT being returned by the Lookup Service")
	
	WebUI.closeBrowser()
}

//------------------------------------
// END                               | - Snip - 07/08/2019 - Update - 06/09/2019 - 07/01/2020
//------------------------------------
