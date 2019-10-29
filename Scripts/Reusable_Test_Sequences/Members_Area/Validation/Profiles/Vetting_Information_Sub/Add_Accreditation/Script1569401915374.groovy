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
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent

//-----------------------
// TEST HISTORY HEADER - |
//-----------------------
// Any changes to this script, please update the next available row below, with date, in the DATE CREATED column,
// Your NAme in the CREATED BY column, and Finaly, The actual change implemented in the NOTES column.
//
//---------------------------------------------------------------------------------------------------------------
//       Test Definition / Description        |   Date Created  |    Created By    |             Notes           |
//---------------------------------------------------------------------------------------------------------------
//  Verify <Profile><Vetting Information><Add |   25/09/2019    |      DH          |                             |
//  Accreditation> Page from <Grow Your       |                 |                  |                             |
//  Business>                                 |                 |                  |                             |
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
//     Wait for Select Document Button Availability       //
////////////////////////////////////////////////////////////
WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Members Area/Profiles/Page_Members Area/button_Select Document'), 
    25)

////////////////////////////////////////////////////////////
//     Take an Initial Screenshot of Banner Image Page    //
////////////////////////////////////////////////////////////
// Stores in Project <Screenshots> Folder
//CustomKeywords.'kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeEntirePageScreenshot'('Your_Customers_Add_New_Accreditation.png', FailureHandling.OPTIONAL)
////////////////////////////////////////////////////////////
//         Verify Header Text on Key Portal Areas         //
////////////////////////////////////////////////////////////
'---------------------------------------------------'
'THIS TAB - Vetting Information-> New Accreditation |'
// MEMBER ID CHECK
WebUI.verifyTextPresent(findTestData('Members_Test_Data').getValue('MEMBER_ID', 1), false)
'----------------------------------------------'
WebUI.verifyTextPresent("MEMBER ID", false)
'----------------------------------------------'
WebUI.verifyTextPresent('Add New Accreditation', false)
'----------------------------------------------'
WebUI.verifyTextPresent('Proof of accreditation is required before it can be listed on your web page', false)
'----------------------------------------------'
WebUI.verifyTextPresent('Supporting Documents', false)
'----------------------------------------------'
WebUI.verifyTextPresent('Select Document', false)
'----------------------------------------------'
WebUI.verifyTextPresent('Add Accreditation', false)
'----------------------------------------------'
WebUI.verifyTextPresent('Type', false)
'----------------------------------------------'
WebUI.verifyTextPresent('Notes', false)
'----------------------------------------------'
WebUI.verifyTextPresent('The file size must be smaller than 9MB', false)
'----------------------------------------------'
WebUI.verifyTextPresent('Services', false)
'----------------------------------------------'
WebUI.verifyTextPresent('Close', false)
//--------------------------------------------------------
// Select a Accreditation TYPE and Type Some Notes Text  |
//--------------------------------------------------------
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Members Area/Profiles/Page_Members Area/select_Select accreditation type'),
	'128', true)
'----------------------------------------------'
WebUI.setText(findTestObject('Object Repository/Page_Members Area/Profiles/Page_Members Area/textarea_Notes_txtNotes'),
	'testing, testing, 123')
'----------------------------------------------'
// Hit <Select Document>
'----------------------------------------------'
WebUI.click(findTestObject('Object Repository/Page_Members Area/Profiles/Page_Members Area/button_Select Document'))

'----------------------------------------------'
///////////////////////////////////////
// Dispel The Windows Dialog         //
///////////////////////////////////////
'----------------------------------------------'
WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Utils/Dispel_Windows_Dialog'), [:], FailureHandling.CONTINUE_ON_FAILURE)
'----------------------------------------------'

'----------------------------------------------'
'----------------------------------------------'
// Scroll to CLOSE Button
//WebUI.scrollToElement(findTestObject('Object Repository/Page_Members Area/Profiles/Page_Members Area/button_Close'), 5)
// Close Dialog
//WebUI.click(findTestObject('Object Repository/Page_Members Area/Profiles/Page_Members Area/button_Close'))
//
///////////////////////////////////////
//                END                //
///////////////////////////////////////
