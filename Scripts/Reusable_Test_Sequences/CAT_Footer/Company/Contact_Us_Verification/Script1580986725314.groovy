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
// navigating Company->Contact Us Returns     |    05/02/2020   |         DH       |                             |
// Contact Us Page VALIDATION                 |                 |                  |                             |
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
WebUI.waitForPageLoad(120)
//WebUI.waitForElementClickable(findTestObject('Object Repository/CAT_Footer/Page_Checkatrade Contact us/div_Apply Online'), 20)

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
WebUI.verifyTextPresent("Contact us", false)
'----------------------------------------------'
'Sub Header'
WebUI.verifyTextPresent("Please note that our offices are open from 9am to 5pm, Monday to Friday and calls to Checkatrade", false)
'----------------------------------------------'
WebUI.verifyTextPresent("may be monitored or recorded for verification and training purposes", false)
'----------------------------------------------'

'Page Body'

'Join'
WebUI.verifyTextPresent("Trades, Join Today", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Grow your business, become a Checkatrade member", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Our team are on hand to advise you on how Checkatrade can help your business and talk you through our vetting requirements", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Apply Online or call", false)
'----------------------------------------------'
def contactno = "03301 626 328"
///WebUI.verifyTextPresent("03301 626 328", false)
WebUI.verifyMatch('03301 626 328', contactno, false)
'----------------------------------------------'


'Customer Service'
WebUI.verifyTextPresent("Customer Service", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Want to know more about Checkatrade and the checks we carry out", false)
'----------------------------------------------'
WebUI.verifyTextPresent("We display the results of our vetting checks on the profile page for each Checkatrade", false)
'----------------------------------------------'
WebUI.verifyTextPresent("member, as well as feedback about the work they have carried out. If you have any further", false)
'----------------------------------------------'
WebUI.verifyTextPresent("questions or are unable to access the internet, our Reception Team will be happy to help", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Call 0333 0146 190*", false)
'----------------------------------------------'

'Existing Members'
WebUI.verifyTextPresent("Existing Members", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Are you an existing Checkatrade member with a query", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Your dedicated Membership Advisor would be happy to help you. You can find their direct dial", false)
'----------------------------------------------'
WebUI.verifyTextPresent("phone number in your Members Area. Alternatively", false)
'----------------------------------------------'
WebUI.verifyTextPresent("call our Reception Team on 01243 601234 who will direct your call to the appropriate person", false)
'----------------------------------------------'

'Member Finance Services'
WebUI.verifyTextPresent("Member Finance Services", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Are you an existing Checkatrade member with a query regarding your payments", false)
'----------------------------------------------'
WebUI.verifyTextPresent("If you are an existing member with a query regarding your payments for membership", false)
'----------------------------------------------'
WebUI.verifyTextPresent("please contact our Finance Team on 01243 608808", false)
'----------------------------------------------'

WebUI.scrollToPosition(500, 500)
WebUI.delay(1)

'Careers'
WebUI.verifyTextPresent("Interested in a career at Checkatrade", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Click here to view our current vacancies", false)
'----------------------------------------------'

'Where to find us'
WebUI.verifyTextPresent("Where to find us", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Checkatrade Portsmouth", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Building 2000", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Lakeside North Harbour", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Western Road", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Portsmouth", false)
'----------------------------------------------'
WebUI.verifyTextPresent("PO6 3EN", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Tel:01243 601234", false)
'----------------------------------------------'
WebUI.verifyTextPresent("contact@checkatrade.com", false)
'----------------------------------------------'
//                       contact@checkatrade.com

WebUI.scrollToPosition(1000, 1000)
WebUI.delay(1)


//WebUI.verifyTextPresent("03301", false)
//'----------------------------------------------'
//WebUI.verifyTextPresent("625", false)
//'----------------------------------------------'
//WebUI.verifyTextPresent("349", false)
'----------------------------------------------'
//WebUI.verifyTextPresent("Get Started", false)
'----------------------------------------------'
//WebUI.verifyTextPresent("Why Join Checkatrade?", false)
'----------------------------------------------'
//WebUI.verifyTextPresent("Every month we get over 1 million customers visiting checkatrade.com looking for a reliable tradesperson like you", false)
'----------------------------------------------'

WebUI.scrollToPosition(1000, 1000)
WebUI.delay(1)

'Footer'

'----------------------------------------------'
//WebUI.verifyTextPresent("Call us on", false)
'----------------------------------------------'
//WebUI.verifyTextPresent("03301", false)
//'----------------------------------------------'
//WebUI.verifyTextPresent("625", false)
//'----------------------------------------------'
//WebUI.verifyTextPresent("349", false)
'----------------------------------------------'
//WebUI.verifyTextPresent("Get Started", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Checkatrade.com all rights reserved", false)
'----------------------------------------------'
'cookie text change 12022020'
// WebUI.verifyTextPresent("We use cookies to help make this website better", false)

'----------------------------------------------'

///////////////////////////////////////
//                END                //
///////////////////////////////////////
