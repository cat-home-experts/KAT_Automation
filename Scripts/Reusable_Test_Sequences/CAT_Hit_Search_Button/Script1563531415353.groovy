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
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
//import com.kms.katalon.core.webui.driver
//import com.kms.katalon.core.util
//import com.kms.katalon.core.driver
//import com.kms.katalon.core.configuration
import com.kms.katalon.core.webui.driver.DriverFactory

//----------------------------------------------------------------------------------------------------------
// Double click on the CAT Search Button                                                                   |
//----------------------------------------------------------------------------------------------------------
'---------------------------------'
'HIT SEARCH'
'---------------------------------'
///////////////////////////////////////////////////////////
// Originally taking a double click to fire the search   // 
///////////////////////////////////////////////////////////
//WebUI.doubleClick(findTestObject('Object Repository/Checkatrade_Trade_Search_Page/Page_Checkatrade Find a tradesperson you can trust/a_Search'))
//WebUI.waitForElementVisible(findTestObject('Object Repository/Checkatrade_Trade_Search_Page/Page_Checkatrade Find a tradesperson you can trust/a_Search'), 10)

//WebUI.doubleClick(findTestObject('Object Repository/Page_Checkatrade Find a tradesperson you can trust/a_Search'))

'-------------------------'
//WebUI.doubleClick(findTestObject('Object Repository/Checkatrade_Trade_Search_Page/Page_Checkatrade Find a tradesperson you can trust/a_Search'))


try {
	// New Website
	WebUI.waitForElementClickable(findTestObject('Object Repository/New_CAT_Search/Search_Button'), 25)
	WebUI.click(findTestObject('Object Repository/New_CAT_Search/Search_Button'))

	//-----------------------------------------
} catch (Exception e) { // ObjectNotFound
	// Old website
	WebUI.waitForElementClickable(findTestObject('Object Repository/Checkatrade_Trade_Search_Page/Page_Checkatrade Find a tradesperson you can trust/Page_Checkatrade Find a tradesperson you can trust/a_Search'), 25)
	WebUI.click(findTestObject('Object Repository/Checkatrade_Trade_Search_Page/Page_Checkatrade Find a tradesperson you can trust/Page_Checkatrade Find a tradesperson you can trust/a_Search'))

	//-----------------------------------------
}




'---------------------------------------------------------------------'
' Investigation into detecting specic browser currently active Below  |'
'---------------------------------------------------------------------'

//WebUI.sendKeys(findTestObject('Object Repository/Checkatrade_Trade_Search_Page/Page_Checkatrade Find a tradesperson you can trust/a_Search'), Keys.chord(Keys.RETURN))
'-------------------------'
//WebUI.openBrowser(GlobalVariable.URL)// 20/08/2019
////if(DriverFactory.getExecutedBrowser().getName() == "IE_DRIVER") {	println "IE"}else {	println "not IE"}
//
//Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
//String browserName = cap.getBrowserName().toLowerCase();
//System.out.println(browserName);
//String os = cap.getPlatform().toString();
//System.out.println(os);
//String v = cap.getVersion().toString();
//System.out.println(v);

//String userAgent = request.getHeader("user-agent")
//println ("userAgent -->"+userAgent)
'---------------------------------------------------------------------'
' Investigation into detecting specic browser currently active Above  |'
'---------------------------------------------------------------------'

//---------------------------------
// END                            |
//---------------------------------