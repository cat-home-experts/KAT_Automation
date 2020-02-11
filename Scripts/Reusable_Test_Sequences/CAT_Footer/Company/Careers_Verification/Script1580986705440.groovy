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

//-----------------------
// TEST HISTORY HEADER - |
//-----------------------
// Any changes to this script, please update the next available row below, with date, in the DATE CREATED column,
// Your Name in the CREATED BY column, and Finaly, The actual change implemented in the NOTES column.
//
//---------------------------------------------------------------------------------------------------------------
//       Test Definition / Description        |   Date Created  |    Created By    |             Notes           |
//---------------------------------------------------------------------------------------------------------------
// Verify Footer Navigation is correct        |                 |                  |                             |
// navigating Company->Careers Returns        |    06/02/2020   |         DH       |                             |
// Vacancies Page                             |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
//                                            |                 |                  |                             |
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
//     Wait for Customers Name Element Availability       //
////////////////////////////////////////////////////////////
//WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Members Area/input_concat(Customer  s name)_customerName'), 60)

'----------------------------------------------'
WebUI.delay(1)
'----------------------------------------------'
WebUI.waitForPageLoad(60)

////////////////////////////////////////////////////////////
//     Take an Initial Screenshot of Home After Login     //
////////////////////////////////////////////////////////////
//WebUI.takeScreenshot('Reports/Screenshots/Initial_Members_page.png')
// Stores in Project <Screenshots> Folder
// CustomKeywords.'kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeEntirePageScreenshot'('Your_Customers_Remind_Customer.png', FailureHandling.OPTIONAL)

////////////////////////////////////////////////////////////
//         Verify Header Text on Key Portal Areas         //
////////////////////////////////////////////////////////////
'Only When Needed'

'CONSIDERATION - Ribbon Menu - For Further Tests'

//WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Members Area/Community/Page_Checkatrade Community/img'), 60)
'----------------------------------------------'
'DEFAULT TAB - None - 1 Page Returned          |'
'----------------------------------------------'
// MEMBER ID CHECK
//WebUI.verifyTextPresent(findTestData('Members_Test_Data').getValue('MEMBER_ID', 1), false)
'----------------------------------------------'
//WebUI.verifyTextPresent("MEMBER ID", false)
'----------------------------------------------'
'Header'
	'Ribbon Menu Top Sevel Options'
	
'----------------------------------------------'
WebUI.verifyTextPresent("Our Vacancies", false)
'----------------------------------------------'
WebUI.verifyTextPresent("About Us", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Our Teams", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Our Benefits", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Charity Leave", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Our Offices", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Contact Us", false)

'----------------------------------------------'
WebUI.verifyTextPresent("Keywords", false) // no really required
'----------------------------------------------'
// WebUI.verifyTextPresent("Enter Keywords", false) // Embedded
'----------------------------------------------'
WebUI.verifyTextPresent("Location", false)
'----------------------------------------------'
//WebUI.verifyTextPresent("Enter Town/City or Postcode", false) // Embedded
'----------------------------------------------'
WebUI.verifyTextPresent("Search Jobs", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Vacancies", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Refine", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Sort By", false)
'----------------------------------------------'
// WebUI.verifyTextPresent("Date posted", false)  // Embedded
'----------------------------------------------'

'Page Body'

'----------------------------------------------'
'Changing Content :-)'
'----------------------------------------------'

WebUI.scrollToPosition(5000, 5000)
WebUI.delay(1)

'Footer'

'----------------------------------------------'
WebUI.verifyTextPresent("More Info", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Apply", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Sign up for job alerts and be the first to know about new opportunities", false)
'----------------------------------------------'
WebUI.verifyTextPresent("If you can’t see a job that’s an exact match for your skills and experience, please sign up for our jobs alerts here", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Register", false)
'----------------------------------------------'

///////////////////////////////////////
//                END                //
///////////////////////////////////////
