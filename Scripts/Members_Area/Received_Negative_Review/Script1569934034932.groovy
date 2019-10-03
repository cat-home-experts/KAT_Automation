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
// Members->Your Customers->Receive Negative  |                 |                  |                             |
// Review-> Function - PDF File Display/Intact|   01/10/2019    |       DH         | NOT PICKING UP MUCH PDF     |         TODO UPDATING
//                                            |                 |                  | DETAIL - PDFBOX Jar Research|
//                                            |                 |                  | needed                      |
//                                            |                 |                  |                             |
//                                            |                 |    import org.apache.pdfbox.pdmodel.PDDocument |
//                                            |                 |  import org.apache.pdfbox.text.PDFTextStripper |
//                                            |                 |                  |                             |
//    Currently, Just confirms the PDF        |                 |                  |                             |
//    (Viewer) Loads, maybe extend to basic   |                 |                  |                             |
//    document text capture snd verification  |                 |                  |                             |
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
//	GIVEN - TODO                      |
//                                                                                                               |
//	WHEN -  TODO  				      |
//                                                                                                               |
//  THEN -  TODO                      |
//                                                                                                               |
//---------------------------------------------------------------------------------------------------------------
// Specific Page Withing members That You Want To Visit
GlobalVariable.PAGE = "/assets/Resources/Documents/Membership%20Support%20Pack.pdf"

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
	// Navigate Received Negative Review Page |
	//-----------------------------------------
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Area_Menu/Your_Customers/Received_Negative_Review'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	
	//-----------------------------------------
	// Confirm Data on Top - NR Page          |
	//-----------------------------------------
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Validation/Received_Negative_Review'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	
	//-----------------------------------------
	// Log OFF the Members Area               |
	//-----------------------------------------
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Members_Area/Banner_Menu/log_Off'), [:], FailureHandling.STOP_ON_FAILURE)
}
///////////////////////////////////////
//                END                //    
///////////////////////////////////////

