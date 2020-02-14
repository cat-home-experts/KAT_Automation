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
// TEST HISTORY HEADER - | TODO Blind Import To Update
//-----------------------
// Any changes to this script, please update the next available row below, with date, in the DATE CREATED column,
// Your Name in the CREATED BY column, and Finaly, The actual change implemented in the NOTES column.
//
//---------------------------------------------------------------------------------------------------------------
//       Test Definition / Description        |   Date Created  |    Created By    |             Notes           |
//---------------------------------------------------------------------------------------------------------------
//  My Feedback Page Initial Validation Checks|   11/09/2019    |      DH          |                             |
//  on Start up, Sub Tab = Remind Customers   |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
//  Commented Ashot screen capture, evaluation|   30/09/2019    |      DH          |                             |
//  Extended Element Wait Times to 60         |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
// Major Content Chnange, Page Updated (old l |    04/12/2019   |      DH          | Old Commented, NEW Added    |
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

////////////////////////////////////////////////////////////
//     Take an Initial Screenshot of Home After Login     //
////////////////////////////////////////////////////////////
//WebUI.takeScreenshot('Reports/Screenshots/Initial_Members_page.png')
// Stores in Project <Screenshots> Folder
// CustomKeywords.'kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeEntirePageScreenshot'('Your_Customers_Remind_Customer.png', FailureHandling.OPTIONAL)

'Check URL Is The Correct One :-)'
WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Utils/Check_URL'), [:], FailureHandling.CONTINUE_ON_FAILURE)

////////////////////////////////////////////////////////////
//         Verify Header Text on Key Portal Areas         //
////////////////////////////////////////////////////////////
'---------------------------------'
'DEFAULT TAB - Advertise          '
'----------------------------------------------'
// MEMBER ID CHECK
WebUI.verifyTextPresent(findTestData('Members_Test_Data').getValue('MEMBER_ID', 1), false)
'----------------------------------------------'
WebUI.verifyTextPresent("MEMBER ID", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Directory Information", false)
'----------------------------------------------'
' Page Content Change (Preview, Below) 04/12/2019'
'----------------------------------------------'
//WebUI.verifyTextPresent("You can opt to upgrade your membership to be included in one of the printed directories", false)
//'----------------------------------------------'
//WebUI.verifyTextPresent("households within your working area", false)
//'----------------------------------------------'
//WebUI.verifyTextPresent("We allow several allocations for each trade and these vary depending on consumer demand", false)
//
//WebUI.verifyTextPresent("so if you would like to see if there is space available in an area which suits you", false)
//'----------------------------------------------'
//WebUI.verifyTextPresent("best to speak with us directly so that we can give you further information and run through pricing and payment options", false)
//'----------------------------------------------'
//WebUI.scrollToElement(findTestObject('Please contact us on 01243 952303'), 10)
'----------------------------------------------'
' NEW Page Content, Added Below'
'----------------------------------------------'
WebUI.verifyTextPresent("Did you know that there are two types of shoppers... online and offline?", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Why? Well, as there’s a limited selection of trades per area, customers perceive this to be our chosen short list", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Appealing to your offline customers will help you reach new customers, boost your business", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Benefits of featuring in a directory", false)

WebUI.verifyTextPresent("50+ calls, per year, per member", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Our directories generate over half a million calls for our featured member", false)
'----------------------------------------------'
WebUI.verifyTextPresent("Delivered to 50,000 households", false)
'----------------------------------------------'//'----------------------------------------------'
WebUI.verifyTextPresent("directories were delivered with volumes increasing year by year", false)
'----------------------------------------------'//'----------------------------------------------'
WebUI.verifyTextPresent("households with deliveries up to four times a year", false)
'----------------------------------------------'//'----------------------------------------------'
WebUI.verifyTextPresent("Expands your brand presence", false)
'----------------------------------------------'//'----------------------------------------------'
WebUI.verifyTextPresent("You can market different trade categories, in different directory areas, or have multiple trade categories in a single directory", false)
'----------------------------------------------'//'----------------------------------------------'
' Scroll To Footer'
WebUI.scrollToPosition(999, 999)
'----------------------------------------------'
WebUI.verifyTextPresent("directories can help you expand your business footprint", false)
'----------------------------------------------'//'----------------------------------------------'
'Removed on 12/02/2020'
//WebUI.verifyTextPresent("Increases your online profile page traffic", false)
'----------------------------------------------'//'----------------------------------------------'
WebUI.verifyTextPresent("Ready to feature in a directory?", false)
'----------------------------------------------'//'----------------------------------------------'
WebUI.verifyTextPresent("Drop us a call on 01243 952303 or Request a call back", false)
'----------------------------------------------'


///////////////////////////////////////
//                END                // TODO  TODO Blind Import To Update
///////////////////////////////////////
