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
// Search Items - WO Consumer Search          |   29/11/2019    |        DH        |                             |
//---------------------------------------------------------------------------------------------------------------
// Implementation after debug                 |   13/01/2020    |        DH        |                             |
//                                            |                 |                  | iFrame issues for all of WO |
//---------------------------------------------------------------------------------------------------------------
// Key fields verified of returned data,      |                 |                  |                             |
// Maybe look at greater detail in the future |   15/01/2020    |        DH        | iFrame, to rationalise      |
//---------------------------------------------------------------------------------------------------------------
//                                            |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
//                                            |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------
//                                                                                                               |
//	GIVEN -  With Web Office Open and focus on the Search Header text Box                                        |
//                                                                                                               |
//	WHEN - When you search for a company/Person/Phone Number/CATNumber Via The Search Header and Select That Item|
//                                                                                                               |
//  THEN - The Details of the Search Criteria Will Be Returned in COMPANY View, All The Available Details Return |
//                                                                                                               |
//---------------------------------------------------------------------------------------------------------------

//-----------------------------------------
// Call Setup Process - Browser Startup, Navigate, Maximize and Close Cookie Nagging Element
//-----------------------------------------
'For Loop to Iterate over the test data provided by the Excel spreadsheet, \r\nassociated with this test\r\n'
for (GlobalVariable.row = 1; GlobalVariable.row <= findTestData('Consumer_Data (1)').getRowNumbers(); (GlobalVariable.row)++) {
		'--------------------------------------'
		' Web Office StartUp                   |'
		'--------------------------------------'
		WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Web_Office/Directives/WebOffice_StartUp'), [:], FailureHandling.STOP_ON_FAILURE)
		
		'--------------------------------------'
		' Navigate to <Consumer> Menu Item     |'
		'--------------------------------------'
		WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Web_Office/navigation/Navigate_Consumers'), [:], FailureHandling.STOP_ON_FAILURE)
		
		'--------------------------------------'
		' LH Pane  - Apply Search Criteria     |'
		'--------------------------------------'
		WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Web_Office/Actions/Set_Consumer_Data'), [:], FailureHandling.STOP_ON_FAILURE)
		
		'--------------------------------------'
		' Select Returned Record to Verify     |'
		'--------------------------------------'
		WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Web_Office/Actions/Select_Consumer'), [:], FailureHandling.OPTIONAL)
		
		'--------------------------------------'
		' Verify Returned Consumer Record      |'
		'--------------------------------------'
		WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Web_Office/Verification/Consumer_Returned_Search_Record'), [:], FailureHandling.OPTIONAL)

		'--------------------------'
		' Teardown - CLose Browser |'
		'--------------------------'
		WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Teardown'), [:], FailureHandling.OPTIONAL)
		
		'--------------------------'
		' END  Of ITERATION        |'
		'--------------------------'
}
'--------------------------'
' END                      |'
'--------------------------'
