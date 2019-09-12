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
// Your Name in the CREATED BY column, and Finaly, The actual change implemented in the NOTES column.
//
//---------------------------------------------------------------------------------------------------------------
//       Test Definition / Description        |   Date Created  |    Created By    |             Notes           |
//---------------------------------------------------------------------------------------------------------------
// Prove the function Under Members Area      |                 |                  |  Numorous issues correcting |
// URL Not as expected, preview-ma.ch*.com    |    10/09/2019   |     Dave Horne   |  SUNNY DAY ONLY             |
// areas is intact and available  (PREVIEW)   |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
//                                            |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
//                                            |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
//                                            |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
//                                            |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
'WARNING - Be AWARE that, for example, That the Members Area Link on Preview doesnt take you to Preview, but takes you to LIVE Members Area' 
//---------------------------------------------------------------------------------------------------------------
//                                                                                                               |
//	GIVEN - The Chekatrade Members Area Login Page is Presented on a Client Device                               |
//                                                                                                               |
//	WHEN -  We Enter Valid Log On Credentials, and commit, and hit <OK> on the page 							 |
//                                                                                                               |
//  THEN -  The MEMBERS HOME PAGE PORTAL is presented to the user, The Default view is on the <DASHBOARD> View   |
//          There are a number of different views and functional elements available                              |
//                                                                                                               |
//---------------------------------------------------------------------------------------------------------------
//-----------------------------------------
// Call Setup Process - Browser Startup, Navigate, Maximize and Close Cookie Nagging Element
//-----------------------------------------
def data = findTestData('Members_Test_Data')
def YE_Recommend
def YE_WorkCarriedOut

'For Loop to Iterate over the test data provided by the Excel spreadsheet, \r\nassociated with this test\r\n'
for (GlobalVariable.row = 1; GlobalVariable.row <= findTestData('Members_Test_Data').getRowNumbers(); (GlobalVariable.row)++) {
	
	//-----------------------------------------
	// Call Startup Process - Browser Startup |
	//-----------------------------------------
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Start_Up'), [:], FailureHandling.STOP_ON_FAILURE)
	//-----------------------------------------
	
	//-----------------------------------------
	// Log In to the Members Area             |
	//-----------------------------------------
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/log_On'), [:], FailureHandling.STOP_ON_FAILURE)
	//-----------------------------------------

	//-----------------------------------------
	//Verify Initial Home Page Arrival Success|
	//-----------------------------------------
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Validation/Home_Page'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	
	//-----------------------------------------
	// Hit <Your Customers> on the Banner menu|
	//-----------------------------------------
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Banner_Menu/Your_Customers'), [:], FailureHandling.STOP_ON_FAILURE)
	'-----------------------------------------'// My Feedback Page (<Published Feedback> - Default Tab)
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Area_Menu/Your_Customers/My_Feedback'), [:], FailureHandling.STOP_ON_FAILURE)
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Area_Menu/Validation/My_Feedback'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	'-----------------------------------------'// My Feedback Sub Page <Remind Customer>
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Area_Menu/Your_Customers/Feedback/Remind_Customers'), [:], FailureHandling.STOP_ON_FAILURE)
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Area_Menu/Validation/Remind_Customers'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	'-----------------------------------------'// My Feedback Sub Page <Your Customers>
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Area_Menu/Your_Customers/Your_Customers'), [:], FailureHandling.STOP_ON_FAILURE)
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Area_Menu/Validation/Your_Customers'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	'-----------------------------------------'// My Feedback Sub Page <Awareness>
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Area_Menu/Your_Customers/Feedback/Awareness'), [:], FailureHandling.STOP_ON_FAILURE)
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Area_Menu/Validation/Awareness'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	'-----------------------------------------'
	//////////////////////////////////////////////////////////
	//  RETURN TO DASHBOARD - Then Resume <Your Customers>  //
	//////////////////////////////////////////////////////////
	'-----------------------------------------'// Dashboard
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Banner_Menu/Dashboard'), [:], FailureHandling.STOP_ON_FAILURE)
	'-----------------------------------------'// Your Customers Page
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Banner_Menu/Your_Customers'), [:], FailureHandling.STOP_ON_FAILURE)	
	'-----------------------------------------'// My Callback Requests Page
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Area_Menu/Your_Customers/Callback_Requests'), [:], FailureHandling.STOP_ON_FAILURE)
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Area_Menu/Validation/Callback_Requests'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	'-----------------------------------------'
	//////////////////////////////////////////////////////////
	//  RETURN TO DASHBOARD - Then Resume <Your Customers>  //
	//////////////////////////////////////////////////////////
	'-----------------------------------------'// Dashboard
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Banner_Menu/Dashboard'), [:], FailureHandling.STOP_ON_FAILURE)
	'-----------------------------------------'// Your Customers Page
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Banner_Menu/Your_Customers'), [:], FailureHandling.STOP_ON_FAILURE)
	'-----------------------------------------'// My Received Negative Review Page
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Area_Menu/Your_Customers/Received_Negative_Review'), [:], FailureHandling.STOP_ON_FAILURE)
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Area_Menu/Validation/Received_Negative_Review'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	
	//-----------------------------------------
	// Hit <Grow Your Business> on Banner menu|
	//-----------------------------------------
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Banner_Menu/Grow_Your_Business'), [:], FailureHandling.STOP_ON_FAILURE)
	'-----------------------------------------'// My Profile Page
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Area_Menu/Grow_Your_Business/My_Profile'), [:], FailureHandling.STOP_ON_FAILURE)
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Area_Menu/Validation/My_Profile'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	'-----------------------------------------'// My Photos Page
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Area_Menu/Grow_Your_Business/My_Photos'), [:], FailureHandling.STOP_ON_FAILURE)
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Area_Menu/Validation/My_Photos'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	'-----------------------------------------'// My Stats Page
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Area_Menu/Grow_Your_Business/My_Stats'), [:], FailureHandling.STOP_ON_FAILURE)
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Area_Menu/Validation/My_Stats'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	'-----------------------------------------'// My Advertise Page
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Area_Menu/Grow_Your_Business/Advertise'), [:], FailureHandling.STOP_ON_FAILURE)
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Area_Menu/Validation/Advertise'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	'-----------------------------------------'
	
	//-----------------------------------------
	// Hit <Your Account> on the Banner menu  |
	//-----------------------------------------
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Banner_Menu/Your_Account'), [:], FailureHandling.STOP_ON_FAILURE)
	'-----------------------------------------'// My Membership Page
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Area_Menu/Your_Account/Membership'), [:], FailureHandling.STOP_ON_FAILURE)
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Area_Menu/Validation/Membership'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	'-----------------------------------------'// My Useful Documents Page
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Area_Menu/Your_Account/Useful_Documents'), [:], FailureHandling.STOP_ON_FAILURE)
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Area_Menu/Validation/Useful_Documents'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	'-----------------------------------------'// My Payments Page
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Area_Menu/Your_Account/Payments'), [:], FailureHandling.STOP_ON_FAILURE)
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Area_Menu/Validation/Payments'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	'-----------------------------------------'// My Offers Page
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Area_Menu/Your_Account/Offers'), [:], FailureHandling.STOP_ON_FAILURE)
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Area_Menu/Validation/Offers'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	'-----------------------------------------'
	
	//-----------------------------------------
	// Hit <Dashboard> on the Banner menu     |
	//-----------------------------------------
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Banner_Menu/dashboard'), [:], FailureHandling.STOP_ON_FAILURE)
	'-----------------------------------------'
	
	
	
	
	//-----------------------------------------
	// Hit <Contact Us> above the Banner menu |
	//-----------------------------------------
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Banner_Menu/Contact_Us'), [:], FailureHandling.STOP_ON_FAILURE)
	
	
	
	
	//-----------------------------------------
	// Hit <Recommend a friend> above the menu|
	//-----------------------------------------
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Banner_Menu/Recommend_a_Friend'), [:], FailureHandling.STOP_ON_FAILURE)
	
	
	
	
	//-----------------------------------------
	// Log OFF the Members Area               |
	//-----------------------------------------
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Banner_Menu/log_Off'), [:], FailureHandling.STOP_ON_FAILURE)
	//-----------------------------------------

	
}