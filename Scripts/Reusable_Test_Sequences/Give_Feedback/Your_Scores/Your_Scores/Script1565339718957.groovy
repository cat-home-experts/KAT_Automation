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

//-------------------------------------------------------------------------------------
// Test Sequence to Deal With Everything on the <Your Scores> Page 2                  | - Snip - 13/08/2019
//-------------------------------------------------------------------------------------
'------------------------------------------------------------------------------------------'
' Your Scores (page 2) Returned with 2 Main Sections - <Your Scores> and <Details of Work> |'
'                                             Tidiness Listbox Selection, NA, 0 through 10 |'
'------------------------------------------------------------------------------------------'

'------------------------------------------------------------------------------------------'
' Your Scores (page 2) Returned with 2 Main Sections - <Your Scores> and <Details of Work> |'
'                          Reliability and Timekeeping Listbox Selection, NA, 0 through 10 |'
'------------------------------------------------------------------------------------------'

'------------------------------------------------------------------------------------------'
' Your Scores (page 2) Returned with 2 Main Sections - <Your Scores> and <Details of Work> |'
'                                             Courtesy Listbox Selection, NA, 0 through 10 |'
'------------------------------------------------------------------------------------------'

'------------------------------------------------------------------------------------------'
' Your Scores (page 2) Returned with 2 Main Sections - <Your Scores> and <Details of Work> |'
'                                     Standard of Work Listbox Selection, NA, 0 through 10 |'
'------------------------------------------------------------------------------------------'

// ListBox Selection Process //
WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Give_Feedback/Your_Scores/Your_Scores_List_Box_Selection'), [:], 
    FailureHandling.CONTINUE_ON_FAILURE)

'------------------------------------------------------------------------------------------'
' Your Scores (page 2) Returned with 2 Main Sections - <Your Scores> and <Details of Work> |'
' Details of Work Done - Form FIll<Description>,<Approx. date>,<How Long>, <Comments> and  |'
'                                                               <Feedback Publish Confirm> |'
'------------------------------------------------------------------------------------------'

// Remaining Form Fill Process
WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Give_Feedback/Your_Scores/Details_of_work_Done_Formfill'), [:], 
    FailureHandling.CONTINUE_ON_FAILURE)

'Need to SCROLL TO <Feedback Published> Option Buttons (Controls/object off the screen, so inoporable until Visible'
// Scroll Bottom of page into View
WebUI.scrollToPosition(125, 0)

'------------------------------------------------------------------------------------------'
' Your Experience (page 2) Hit <Next> Button to Continue to <Your Details>- (page 3)       |'
'------------------------------------------------------------------------------------------'

// Hit <Next>
try {
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Give_Feedback/Your_Scores/Hit_Next'), 1)
	WebUI.waitForPageLoad(60)
	
} catch (Exception e){
	// button sometimes misses, will need to watch this - scrolling down to ensure in vieww, scroll was incorrectly configured previously, hopefull this will be OK now
}

//--------------------------------------------------------------
// END                                                         | - Snip - 16/08/2019
//--------------------------------------------------------------