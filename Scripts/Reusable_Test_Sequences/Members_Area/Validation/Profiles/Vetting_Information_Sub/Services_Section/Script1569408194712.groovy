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
// TEST HISTORY HEADER - |
//-----------------------
// Any changes to this script, please update the next available row below, with date, in the DATE CREATED column,
// Your NAme in the CREATED BY column, and Finaly, The actual change implemented in the NOTES column.
//
//---------------------------------------------------------------------------------------------------------------
//       Test Definition / Description        |   Date Created  |    Created By    |             Notes           |
//---------------------------------------------------------------------------------------------------------------
//  Verify <Profile><Vetting Information> Page|   25/09/2019    |      DH          |                             |
//  from <Grow Your Business>Servicess Section|                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
//                                            |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
//                                            |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
//                                            |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------
//                                                                                                               |
//	GIVEN -                                                                                                      |
//                                                                                                               |
//	WHEN -                                                                                                       |
//                                                                                                               |
//  THEN -                                                                                                       |
//                                                                                                               |
//---------------------------------------------------------------------------------------------------------------

////////////////////////////////////////////////////////////
//     Scroll to Add Save Vetting Information             //
////////////////////////////////////////////////////////////
WebUI.scrollToElement(findTestObject('Object Repository/Page_Members Area/Profiles/Page_Members Area/button_Save Vetting Information'), 5)

////////////////////////////////////////////////////////////
//  Take an Initial Screenshot of Services Page Section   //
////////////////////////////////////////////////////////////

// Stores in Project <Screenshots> Folder
//CustomKeywords.'kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeEntirePageScreenshot'('Your_Customers_Services_Settings.png', FailureHandling.OPTIONAL)

////////////////////////////////////////////////////////////
//         Verify Header Text on Key Portal Areas         //
////////////////////////////////////////////////////////////

'----------------------------------------------'
WebUI.verifyTextPresent("Services", false)
'----------------------------------------------'
WebUI.verifyTextPresent("You may update the services that you offer to customers", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Domestic Work", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Commercial Work", false)
'----------------------------------------------'
WebUI.verifyTextPresent("24hr Call-out", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Free Estimates", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Insurance Work Undertaken", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Cards accepted", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Free Estimates (excl. Insurance)", false)
'----------------------------------------------'
WebUI.verifyTextPresent("VAT Registration", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Are you VAT registered", false)
'----------------------------------------------'
WebUI.verifyTextPresent("update your registration number here", false)
'----------------------------------------------'
// WebUI.verifyTextPresent("123 4567 89", false) //TODO or Bin
'----------------------------------------------'
WebUI.verifyTextPresent("House rules: All changes will be moderated by Checkatrade staff", false)
'----------------------------------------------'
// Exesize CheckBoxes
'----------------------------------------------'
'DOMESTIC WORK'
'----------------------------------------------'
WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Members Area/Profiles/Page_Members Area/input_Domestic Work_workDomestic'), 2)
WebUI.click(findTestObject('Object Repository/Page_Members Area/Profiles/Page_Members Area/input_Domestic Work_workDomestic'))
'----------------------------------------------'
'COMMERCIAL WORK'
'----------------------------------------------'
WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Members Area/Profiles/Page_Members Area/input_Commercial Work_workCommercial'), 2)
WebUI.click(findTestObject('Object Repository/Page_Members Area/Profiles/Page_Members Area/input_Commercial Work_workCommercial'))
'----------------------------------------------'
'24 HOUR CALLOUT'
'----------------------------------------------'
WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Members Area/Profiles/Page_Members Area/input_Commercial Work_work24Hours'), 2)
WebUI.click(findTestObject('Object Repository/Page_Members Area/Profiles/Page_Members Area/input_Commercial Work_work24Hours'))
'----------------------------------------------'
'FREE ESTIMATES'
'----------------------------------------------'
WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Members Area/Profiles/Page_Members Area/input_Free Estimates_workFreeEstimates'), 2)
WebUI.click(findTestObject('Object Repository/Page_Members Area/Profiles/Page_Members Area/input_Free Estimates_workFreeEstimates'))
'----------------------------------------------'
'INSURANCE WORK UNDERTAKEN'
'----------------------------------------------'
WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Members Area/Profiles/Page_Members Area/input_Insurance Work Undertaken_workInsurance'), 2)
WebUI.click(findTestObject('Object Repository/Page_Members Area/Profiles/Page_Members Area/input_Insurance Work Undertaken_workInsurance'))
'----------------------------------------------'
'CARDS ACCEPTED'
'----------------------------------------------'
WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Members Area/Profiles/Page_Members Area/input_Cards accepted_cardsAccepted'), 2)
WebUI.click(findTestObject('Object Repository/Page_Members Area/Profiles/Page_Members Area/input_Cards accepted_cardsAccepted'))
'----------------------------------------------'
'FREE ESTIMATES'
'----------------------------------------------'
WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Members Area/Profiles/Page_Members Area/input_Free Estimates (excl Insurance)_workFreeEstimatesExclIns'), 2)
WebUI.click(findTestObject('Object Repository/Page_Members Area/Profiles/Page_Members Area/input_Free Estimates (excl Insurance)_workFreeEstimatesExclIns'))
'----------------------------------------------'
'DOMESTIC WORK'
'----------------------------------------------'
WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Members Area/Profiles/Page_Members Area/input_Domestic Work_workDomestic'), 2)
WebUI.click(findTestObject('Object Repository/Page_Members Area/Profiles/Page_Members Area/input_Domestic Work_workDomestic'))
'----------------------------------------------'
'COMMERCIAL WORK'
'----------------------------------------------'
WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Members Area/Profiles/Page_Members Area/input_Commercial Work_workCommercial'), 2)
WebUI.click(findTestObject('Object Repository/Page_Members Area/Profiles/Page_Members Area/input_Commercial Work_workCommercial'))
'----------------------------------------------'
'24 HOUR CALLOUT'
'----------------------------------------------'
WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Members Area/Profiles/Page_Members Area/input_Commercial Work_work24Hours'), 2)
WebUI.click(findTestObject('Object Repository/Page_Members Area/Profiles/Page_Members Area/input_Commercial Work_work24Hours'))
'----------------------------------------------'
'FREE ESTIMATES'
'----------------------------------------------'
WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Members Area/Profiles/Page_Members Area/input_Free Estimates_workFreeEstimates'), 2)
WebUI.click(findTestObject('Object Repository/Page_Members Area/Profiles/Page_Members Area/input_Free Estimates_workFreeEstimates'))
'----------------------------------------------'
'INSURANCE WORK UNDERTAKEN'
'----------------------------------------------'
WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Members Area/Profiles/Page_Members Area/input_Insurance Work Undertaken_workInsurance'), 2)
WebUI.click(findTestObject('Object Repository/Page_Members Area/Profiles/Page_Members Area/input_Insurance Work Undertaken_workInsurance'))
'----------------------------------------------'
'CARDS ACCEPTED'
'----------------------------------------------'
WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Members Area/Profiles/Page_Members Area/input_Cards accepted_cardsAccepted'), 2)
WebUI.click(findTestObject('Object Repository/Page_Members Area/Profiles/Page_Members Area/input_Cards accepted_cardsAccepted'))
'----------------------------------------------'
'FREE ESTIMATES'
'----------------------------------------------'
WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Members Area/Profiles/Page_Members Area/input_Free Estimates (excl Insurance)_workFreeEstimatesExclIns'), 2)
WebUI.click(findTestObject('Object Repository/Page_Members Area/Profiles/Page_Members Area/input_Free Estimates (excl Insurance)_workFreeEstimatesExclIns'))
'----------------------------------------------'
// SAVE VETTING INFORMATION
WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Members Area/Profiles/Page_Members Area/button_Save Vetting Information'), 2)
WebUI.click(findTestObject('Object Repository/Page_Members Area/Profiles/Page_Members Area/button_Save Vetting Information'))

///////////////////////////////////////
//                END                //
///////////////////////////////////////