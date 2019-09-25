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
// TEST HISTORY HEADER - |                                                                                                               |
//-----------------------
// Any changes to this script, please update the next available row below, with date, in the DATE CREATED column,
// Your Name in the CREATED BY column, and Finaly, The actual change implemented in the NOTES column.
//
//---------------------------------------------------------------------------------------------------------------
//       Test Definition / Description        |   Date Created  |    Created By    |             Notes           |
//---------------------------------------------------------------------------------------------------------------
// URL Discrepency Handler                    |                 |                  |                             |
//                                            |    23/09/2019   |        DH        |                             |
//                                            |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
//                                            |                 |                  |                             |
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
// There are some irregularities in the URL specification/standardisation.....                                   |
//                                                                                                               |
//      Preview    (the page link takes you to the Live Members Area)                                            | 
// eg - Members Area is on - https://preview-ma.checkatrade.com                                                  |   
//      Dev Test                                                                                                 |
//          Dev Test is on - http://members.dev.checkatrade.com                                                  |
//                                                                                                               |
//                                 This script handles these URL Discrepencies (Hopefully)                       |
//                                                                                                               |
//---------------------------------------------------------------------------------------------------------------
//     URLs Listing
'      CURRENT DEV (MASTER) Environment'
//     1) https://www.current.dev.checkatrade.com/
//     2) https://admin.current.dev.checkatrade.com/
//     3) https://www.members.current.dev.checkatrade.com/
'      Dev Test Environment'
//     1) http://www.dev.checkatrade.com/
//     2) http://admin.dev.checkatrade.com/
//     3) http://members.dev.checkatrade.com/
'      Next Dev Environment'
//     1) https://www.next.dev.checkatrade.com/
//     2) http://admin.next.dev.checkatrade.com/
//     3) http://members.next.dev.checkatrade.com/
'      Preview Environment'
//     1) https://www.preview.checkatrade.com/
//     2) https://www.admin.preview.checkatrade.com/ * IIS * 
//     3) https://preview-ma.checkatrade.com/
'      Live'
//     3) https://members.checkatrade.com/
//
//-----------------------------------------
// if (GlobalVariable.Portal_Subfunction == "members"  // GlobalVariable.PAGE == "/my-feedback"

//if (GlobalVariable.Portal_Subfunction == "members" && GlobalVariable.URL == "https://www.preview.checkatrade.com/"){
//	GlobalVariable.URL = "https://preview-ma.checkatrade.com/"
//}
//
//else {
//	GlobalVariable.URL = "https://preview-ma.checkatrade.com/"
//}

'######################################################################################################################################################'
'#  OF COURSE, FOR THIS TO WORK THE TEST CREDENTIALS SHOULD BE AVAILABLE ACROSS ALL ENVIRONMENTS - Username = check1234 - & - Password = testing123   #'
'######################################################################################################################################################'

//----------------------------------------------
	switch (GlobalVariable.URL) {
		case ~/.*www.current.dev.checkatrade.*/: 	// Current Dev MASTER
			GlobalVariable.URL = "https://members.current.dev.checkatrade.com/login?return=%2Fdashboard"
			break
		case ~/.*www.dev.checkatrade.*/: 			// Dev
			GlobalVariable.URL = "http://members.dev.checkatrade.com/login?return=%2Fdashboard"
			break
		case ~/.*www.next.dev.checkatrade.*/: 		// Next Dev
			GlobalVariable.URL = "http://members.next.dev.checkatrade.com/login?return=%2Fdashboard"
			break
		case ~/.*www.preview.checkatrade.*/: 		// Preview
			GlobalVariable.URL = "https://preview-ma.checkatrade.com/login?return=%2Fdashboard"
			break
		case ~/.*www.checkatrade.*/: 				// Live
			GlobalVariable.URL = "https://members.checkatrade.com/login?return=%2Fdashboard"
			break
		default:									// DEFAULT
			GlobalVariable.URL = "https://members.current.dev.checkatrade.com/login?return=%2Fdashboard" // Going to set DEFAULT to CURRENT
			System.out.println("*  *  *  There is Currently No Configuration for this URL, We have defaulted URL to CURRENT (URL_Handler) *  *  * ")
			break
	}
	GlobalVariable.URL

//----------------------------------------------
//WebUI.delay(10)
////-----------------------------
//// E N D                      |
////-----------------------------
