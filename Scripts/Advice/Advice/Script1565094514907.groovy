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
// Proving the function under the ADVICE      |                 |                  |                             |
// header link, Verify each of the defined    |    06/08/2019   |     Dave Horne   |                             |
// areas is intact and available              |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
//                                            |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
//                                            |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
//                                            |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
//                                            |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
//
//---------------------------------------------------------------------------------------------------------------
//                                                                                                               |
//	GIVEN - The Chekatrade Website 'SEARCHPAGE' is Presented on a Client Device                                  |
//                                                                                                               |
//	WHEN -  We Click on 'ADVICE' from the header banner on the homepage                                          |
//                                                                                                               |
//  THEN -  The ADVICE PORTAL portal is presented to the user, with Homeowner and Trade navigational paths,      |
//          along with a selection of selected topics, that are topical, and subject to change, along with       |
//          an ADVICE Search facility                                                                            |
//                                                                                                               |
//---------------------------------------------------------------------------------------------------------------

//-----------------------------------------
// Call Setup Process - Browser Startup, Navigate, Maximize and Close Cookie Nagging Element
//-----------------------------------------
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Setup'), [:], FailureHandling.STOP_ON_FAILURE)
	//-----------------------------------------
	'---------------------------------------------'
	' Hit the <ADVICE> link in the header banner  |'
	'---------------------------------------------'
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Banner_Menu/Advice'), [:], FailureHandling.CONTINUE_ON_FAILURE)

	
	//------------------------------------------------------------------------
	// * * * * * * *   WIP - Work in progress - todo TODO   * * * * * * *    |
	//------------------------------------------------------------------------
	

	'--------------------------'
	' Teardown - CLose Browser |'
	'--------------------------'
	//WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Teardown'), [:], FailureHandling.STOP_ON_FAILURE)

	
	'--------------------------'
	' END                      |'
	'--------------------------'


