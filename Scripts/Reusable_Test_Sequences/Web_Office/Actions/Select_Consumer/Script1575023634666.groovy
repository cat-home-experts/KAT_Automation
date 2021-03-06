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
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.util.KeywordUtil

//-----------------------
// TEST HISTORY HEADER - |
//-----------------------
// Any changes to this script, please update the next available row below, with date, in the DATE CREATED column,
// Your Name in the CREATED BY column, and Finaly, The actual change implemented in the NOTES column.
//
//---------------------------------------------------------------------------------------------------------------
//       Test Definition / Description        |   Date Created  |    Created By    |             Notes           |
//---------------------------------------------------------------------------------------------------------------
// Set Search Items - WO Consumer Search      |   29/11/2019    |        DH        |                             |
//---------------------------------------------------------------------------------------------------------------
// Implementation after debug                 |   13/01/2020    |        DH        | iFrame issues for all of WO |
//---------------------------------------------------------------------------------------------------------------
//                                            |                 |                  |                             |
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



// WebUI.setText(findTestObject('Page_/input_Forename_ctl00CP1ctlSearchtbForenames'), 'Jim')

// WebUI.setText(findTestObject('Page_/input_Surname_ctl00CP1ctlSearchtbSurname'), 'Smith')

'--------'
'Search  |'
'--------'
WebUI.waitForPageLoad(60)
WebUI.waitForElementClickable(findTestObject('Object Repository/WO_Consumer/Page_/input_Clear_ctl00CP1ctlSearchbtnSearch'), 60)
WebUI.click(findTestObject('Object Repository/WO_Consumer/Page_/input_Clear_ctl00CP1ctlSearchbtnSearch'))
WebUI.delay(5)
'--------'
'Synch   |'
'--------'
WebUI.waitForPageLoad(120)
WebUI.waitForElementClickable(findTestObject('Object Repository/WO_Consumer/Page_/a_Feedback'), 60)

'----------------------------------------'
'Initial Table View (Populated or Not    |'
'----------------------------------------'

//try {
'---------------------------------------------------'
'If Record Exists Then rocess, Otherwise Jump Over  |'
'---------------------------------------------------'

//KeywordUtil.markPassed("* * * * "+GlobalVariable.aFirstName+" * * * *")

//if (!GlobalVariable.aFirstName == ''){ // set in 'Set_Consumer_Data' // 'No Record Existing'
	'----------------------------------------'
	'Initial Table Return Checks'
//if	(WebUI.(findTestObject('Object Repository/WO_Consumer/Page_/a_Feedback')){
//	'Full Name'
//	WebUI.verifyTextPresent("Mr Gordon Brown", false)
//	'City'
//	WebUI.verifyTextPresent("Haywards Heath", false)
//	'Postcode'
//	WebUI.verifyTextPresent("RH16 4ER", false)
//	'Email'
//	WebUI.verifyTextPresent("gordbro@gmail.com", false)
	
	'----------------------------------------'
	'--------'
	'Sort    |'
	'--------'
	WebUI.click(findTestObject('Object Repository/WO_Consumer/Page_/a_Feedback'))
	//WebUI.waitForElementClickable(findTestObject('Object Repository/WO_Consumer/Page_/a_Feedback'), 60)
	//WebUI.waitForPageLoad(60)
	WebUI.delay(5)
	'--------'
	'Sort    |'
	'--------'
	WebUI.click(findTestObject('Object Repository/WO_Consumer/Page_/a_Feedback'))
	//WebUI.waitForElementClickable(findTestObject('Object Repository/WO_Consumer/Page_/a_Feedback'), 60)
	//WebUI.waitForPageLoad(60)
	WebUI.delay(5)
	'--------'
	'Select  |'
	'--------'
	WebUI.waitForElementClickable(findTestObject('WO_Consumer/Page_/td_TopRow'), 60)
	WebUI.click(findTestObject('WO_Consumer/Page_/td_TopRow'))
	WebUI.delay(1)
	//WebUI.click(findTestObject('Page_/input_Clear_ctl00CP1ctlSearchbtnSearch'))
//}	
	//WebUI.click(findTestObject('Object Repository/WebOffice/Consumers/Page_/td_Jim Smith'))
	
//}
//catch (Exception e) {
//else {(KeywordUtil.markPassed("No Data Returned as Expected for Invalid Search Criteria"))}
	
//}


'--------------------------------'
'           END                  |'
'--------------------------------'
