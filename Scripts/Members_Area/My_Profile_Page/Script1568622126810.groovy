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
// Stand Alone Test Created For My Profile    |                 |                  |             URL             |
// Functionality - From members Area          |    16/09/2019   |        DH        | checkatrade.com/my-profile  |
// Integrity Checks                           |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
// Added Test Coverage, extended extensively  |    24/09/2019   |        DH        |                             |
//---------------------------------------------------------------------------------------------------------------
//                                            |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
//                                            |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
'WARNING - Be AWARE that, for example, That the Members Area Link on Preview doesnt take you to Preview, but takes you to LIVE Members Area'
//---------------------------------------------------------------------------------------------------------------
//                                                                                                               |
//	GIVEN - TODO                      |
//                                                                                                               |
//	WHEN -  TODO  				      |
//                                                                                                               |
//  THEN -  TODO                      |
//                                                                                                               |
//---------------------------------------------------------------------------------------------------------------
// Specific Page Withing members That You Want To Visit
GlobalVariable.PAGE = "/my-profile-page"

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
	// Navigate to Profile Text - Sub section |
	//-----------------------------------------
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Area_Menu/Grow_You_Business/My_Profile'), [:], FailureHandling.STOP_ON_FAILURE)

	//-----------------------------------------
	// Verify Data on Top - My_profile Page   |
	//-----------------------------------------
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Validation/My_Profile'), [:], FailureHandling.CONTINUE_ON_FAILURE)

	//-----------------------------------------
	// Navigate - To profile text Page        |
	//-----------------------------------------// My Profile Page - Profile text
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Area_Menu/Grow_You_Business/Profiles/Profile_Text'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	
	//-----------------------------------------
	// Verify Profile Text - Sub section      |
	//-----------------------------------------
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Validation/Profiles/Profile_Text'), [:], FailureHandling.CONTINUE_ON_FAILURE)

	//-----------------------------------------
	// Navigate - To Search appearances Page  |
	//-----------------------------------------// My Profile Page - Search appearances
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Area_Menu/Grow_You_Business/Profiles/Search_Appearances'), [:], FailureHandling.STOP_ON_FAILURE)
	
	//-----------------------------------------
	// Verify Search appearances - Sub section|
	//-----------------------------------------
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Validation/Profiles/Search_Appearances'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		
	//-----------------------------------------
	// Navigate - To Where you work Page      |
	//-----------------------------------------// My Profile Page - Where you work
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Area_Menu/Grow_You_Business/Profiles/Where_You_Work'), [:], FailureHandling.STOP_ON_FAILURE)
	
	//-----------------------------------------
	//Verify Where you work Page - Sub section|
	//-----------------------------------------
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Validation/Profiles/Where_You_Work'), [:], FailureHandling.CONTINUE_ON_FAILURE) 
		
	//-----------------------------------------
	// Navigate - To the Company logo Page    |
	//-----------------------------------------// My Profile Page - Company logo 	
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Area_Menu/Grow_You_Business/Profiles/Company_Logo'), [:], FailureHandling.STOP_ON_FAILURE)
	
	//-----------------------------------------
	// Verify Company logo - Sub section      |
	//-----------------------------------------
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Validation/Profiles/Company_Logo'), [:], FailureHandling.CONTINUE_ON_FAILURE) 
		
	//-----------------------------------------
	// Navigate - To the Banner Iname Page    |
	//-----------------------------------------// My Profile Page - Banner image
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Area_Menu/Grow_You_Business/Profiles/BAnner_Image'), [:], FailureHandling.STOP_ON_FAILURE)
	
	//-----------------------------------------
	// Verify Banner image - Sub section      |
	//-----------------------------------------
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Validation/Profiles/Banner_Image'), [:], FailureHandling.CONTINUE_ON_FAILURE) 
		
	//-----------------------------------------
	// Navigate - To Vetting Information Page |
	//-----------------------------------------// My Profile Page - Vetting information
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Area_Menu/Grow_You_Business/Profiles/Vetting_Information'), [:], FailureHandling.STOP_ON_FAILURE)
	
	//-----------------------------------------
	// Verify Vetting info - Sub section      |
	//-----------------------------------------
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Validation/Profiles/Vetting_Information'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	
	//-----------------------------------------
	// Navigate - To the Insurance Page       |
	//-----------------------------------------// My Profile Page - Insurance
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Area_Menu/Grow_You_Business/Profiles/Insurance'), [:], FailureHandling.STOP_ON_FAILURE)
	
	//-----------------------------------------
	// Verify Insurance - Sub section         |
	//-----------------------------------------
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Validation/Profiles/Insurance'), [:], FailureHandling.CONTINUE_ON_FAILURE)  
		
	//-----------------------------------------
	// Navigate - To Maximise your Profile Pge|
	//-----------------------------------------// My Profile Page - 'Maximise your profile' video
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Area_Menu/Grow_You_Business/Profiles/Maximise_Your_Profile'), [:], FailureHandling.STOP_ON_FAILURE)
	
	//-----------------------------------------
	// Verify Maximise your profile - Sub Sec |
	//-----------------------------------------
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Validation/Profiles/Maximise_You_Profile'), [:], FailureHandling.CONTINUE_ON_FAILURE) 
		
	//-----------------------------------------
	// Log OFF the Members Area               |
	//-----------------------------------------
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Banner_Menu/log_Off'), [:], FailureHandling.STOP_ON_FAILURE)
}

///////////////////////////////////////
//                END                //
///////////////////////////////////////