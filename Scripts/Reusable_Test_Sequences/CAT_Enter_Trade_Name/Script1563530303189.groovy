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


//---------------------------------------------
// Enter Trade Name or CAT Identity to Search  | - Snip - 07/08/2019
//---------------------------------------------

//---------------------------------------------------------------------------------------------------------------
//   extended to cater for OLD and NEW Site  |    02/01/2020    |       DH        |                             |
//---------------------------------------------------------------------------------------------------------------

	//-------------------------------------------
    'Enter Trade Name (OR CAT ID) in Text Field'
	//WebUI.waitForElementClickable(findTestObject('Page_Checkatrade Find a tradesperson you can trust/Trader_Name_To_Search'), 2)
	//-------------------------------------------

	if (GlobalVariable.Website_Version != "new"){
		// Old website
		// WebUI.waitForElementClickable(findTestObject('Page_Checkatrade Find a tradesperson you can trust/a_or look up a member by name'), 5)
		WebUI.setText(findTestObject('Page_Checkatrade Find a tradesperson you can trust/Trader_Name_To_Search'), findTestData(
			'Search_CAT_ID_Data (1)').getValue('tradeName', GlobalVariable.row))

	}

	else {
		// New Website
		WebUI.setText(findTestObject('Object Repository/New_CAT_Search/Company_Search_Field'), findTestData(
			'Search_CAT_ID_Data (1)').getValue('tradeName', GlobalVariable.row))
		
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
// END                               | - Snip - 07/08/2019 - 07/01/2020
//------------------------------------
