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

	try {
		// New Website
		WebUI.setText(findTestObject('Object Repository/New_CAT_Search/Company_Search_Field'), findTestData(
			'Search_CAT_ID_Data (1)').getValue('tradeName', GlobalVariable.row))
	
		//-----------------------------------------
	} catch (Exception e) { // ObjectNotFound
		// Old website
		// WebUI.waitForElementClickable(findTestObject('Page_Checkatrade Find a tradesperson you can trust/a_or look up a member by name'), 5)
	    WebUI.setText(findTestObject('Page_Checkatrade Find a tradesperson you can trust/Trader_Name_To_Search'), findTestData(
			'Search_CAT_ID_Data (1)').getValue('tradeName', GlobalVariable.row))

		//-----------------------------------------
	}

	
//------------------------------------
// END                               | - Snip - 07/08/2019
//------------------------------------
