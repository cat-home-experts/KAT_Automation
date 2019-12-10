import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

' New Function to Dispel Trades Header (on Deployment 05/12/20190) '

' WHOLE FUNCTION NEED REWRITTING DH'
//WebUI.click

//try (findTestObject('Page_Checkatrade Find a tradesperson you can trust/a_Find out more')){
//	WebUI.click(findTestObject('Page_Checkatrade Find a tradesperson you can trust/div_Trades'))
//} catch 
//
//
//if (WebUI.verifyElementVisible(findTestObject('Page_Checkatrade Find a tradesperson you can trust/a_Find out more'))){
//	//WebUI.click(findTestObject('Page_Checkatrade Find a tradesperson you can trust/div_Trades'))
//WebUI.click(findTestObject('Trades_Apply_Here/Page_Checkatrade Find a tradesperson you can trust/div_Use my location'))
//	KeywordUtil.markPassed(" The <TRADES HEADER> Was Presented on the desktop, and was Dispeled")
//}
//
//WebUI.click(findTestObject('Object Repository/Trades_Apply_Here/Page_Checkatrade Find a tradesperson you can trust/div_Close'))
//
//WebUI.click(findTestObject('Page_Checkatrade Find a tradesperson you can trust/div_Trades'))
if (GlobalVariable.row == 4){
	//WebUI.click(findTestObject('Trades_Apply_Here/Page_Checkatrade Find a tradesperson you can trust/div_Use my location'))
	KeywordUtil.markPassed(" * * * * * *  The <TRADES HEADER> Was Presented on the desktop, and was Dispelled - NOT! * * * * * *")
	//WebUI.click(findTestObject('Page_Checkatrade Find a tradesperson you can trust/div_Trades'))
	WebUI.click(findTestObject('Trades_Apply_Here/Page_Checkatrade Find a tradesperson you can trust/nav_Homeowner'))
	//WebUI.delay(5)
}



//}
//} catch (StepFailedException eDispelTradeBanner) {
//}
//try {
//	WebUI.click(findTestObject('Page_Checkatrade Find a tradesperson you can trust/a_Find out more'))
//	KeywordUtil.markPassed(" The <TRADES HEADER> Was Presented on the desktop, and was Dispeled")
//} catch (StepFailedException eDispelTradeBanner) {
//	KeywordUtil.markPassed(" The <TRADES HEADER> Was NOT Presented on the desktop, as Expected")
//}

//------------------------------------
// END                               | 
//------------------------------------
