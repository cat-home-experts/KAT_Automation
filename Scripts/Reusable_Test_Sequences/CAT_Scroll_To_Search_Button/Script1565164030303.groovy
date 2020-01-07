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

//------------------------------------
// Scroll - To Search Button         | - Snip - 07/08/2019
//------------------------------------

//-------------------------------------------

if (GlobalVariable.Website_Version == "new"){
	// New Website
	WebUI.waitForElementClickable(findTestObject('Object Repository/New_CAT_Search/Company_Search_Field'), 25)
	WebUI.scrollToElement(findTestObject('Object Repository/New_CAT_Search/Company_Search_Field'), 5)

}

else {
	// Old website
	'Scroll - To Search Button on the bottom of the page (sometimes off the screen '
	WebUI.waitForElementClickable(findTestObject('Object Repository/Checkatrade_Trade_Search_Page/Page_Checkatrade Find a tradesperson you can trust/a_Search'), 25)
	WebUI.scrollToElement(findTestObject('Object Repository/Checkatrade_Trade_Search_Page/Page_Checkatrade Find a tradesperson you can trust/a_Search'), 5)

}


//-------------------------------------------

//------------------------------------
// END                               | - Snip - 07/08/2019 - 07/01/2020
//------------------------------------
