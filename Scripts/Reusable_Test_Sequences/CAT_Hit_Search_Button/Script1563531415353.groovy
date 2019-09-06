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


WebUI.doubleClick(findTestObject('Object Repository/Checkatrade_Trade_Search_Page/Page_Checkatrade Find a tradesperson you can trust/a_Search'))

WebUI.sendKeys(findTestObject('Object Repository/Checkatrade_Trade_Search_Page/Page_Checkatrade Find a tradesperson you can trust/a_Search'), Keys.chord(Keys.RETURN))
//---------------------------------
// END                            |
//---------------------------------