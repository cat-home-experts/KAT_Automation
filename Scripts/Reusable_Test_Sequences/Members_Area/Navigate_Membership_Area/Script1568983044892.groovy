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

//WebUI.waitForElementPresent(findTestObject('Object Repository/Members/Page_Members Area/button_Log in'), 10)

//////////////////////////////////////////////
//  Click on <Trade Membership> Header link //
//////////////////////////////////////////////
WebUI.click(findTestObject('Object Repository/Page_Members Area/Page_Checkatrade Find a tradesperson you can trust/a_Trade Membership'))

//////////////////////////////////////////////
//  Verify Popout Detail From First Click   //  20/09/2019 Created
//////////////////////////////////////////////

WebUI.verifyTextPresent("Manage your account", false)
WebUI.verifyTextPresent("Adjust your listing, review callback requests and request feedback", false)
WebUI.verifyTextPresent("Become a Checkatrade Member", false)
WebUI.verifyTextPresent("Every month, Checkatrade receives over 1 million potential customers looking for reliable", false)
WebUI.verifyTextPresent("Enquire about membership now", false)
WebUI.verifyTextPresent("Login to your member area", false)

//////////////////////////////////////////////
//Click on <Login to your member area> link //
//////////////////////////////////////////////
WebUI.click(findTestObject('Object Repository/Page_Members Area/Page_Checkatrade Find a tradesperson you can trust/a_Login to your member area'))

//////////////////////////////////////////////
//   END                                    //
//////////////////////////////////////////////


