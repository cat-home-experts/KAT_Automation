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
// Implementation after debug                 |   13/01/2020    |        DH        |                             |
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

/*'--------------------------------'
'Read data from spreadsheet      | r_ = Returned Data'
'--------------------------------'
def data = findTestData('Data Files/Consumer_Data (1)')
def Consumer_ID = data.getValue("Consumer_ID", GlobalVariable.row)
def Title = data.getValue("r_Title", GlobalVariable.row)
def Forenames = data.getValue("r_Forenames", GlobalVariable.row)
def Surname = data.getValue("r_Surname", GlobalVariable.row)
def Housename = data.getValue("r_Housename", GlobalVariable.row)
def Number_Street = data.getValue("r_Number_and_Street", GlobalVariable.row)
def City = data.getValue("r_City", GlobalVariable.row)
def Town = data.getValue("r_Town", GlobalVariable.row)
def County = data.getValue("r_County", GlobalVariable.row)
def Postcode = data.getValue("r_Postcode", GlobalVariable.row)
def Phone1 = data.getValue("r_Phone_1", GlobalVariable.row)
def Phone2 = data.getValue("r_Phone_2", GlobalVariable.row)
def Fax = data.getValue("r_Fax", GlobalVariable.row)

'--------------------------------'
'Read data from spreadsheet      |'
'--------------------------------'*/
def text_content = ""


WebUI.waitForPageLoad(60)
//WebUI.waitForElementVisible(findTestObject('Object Repository/WO_Consumer/Page_/Edit_Consumer_SAVE_Button'), 60)
WebUI.delay(10)

//Synch

//if (WebUI.verifyTextPresent("No matching consumers", false)){
//	//'Forename == No Record Existing' should return 'no matching consumers'
//	WebUI.verifyTextPresent(findTestData('Data Files/Consumer_Data (1)').getValue('r_Forenames', 1), false)
//	KeywordUtil.markPassed("No Matching Consumers returned as Expected")
//}
//else {
/*	'--------------------------------------------------'
	'RETURNED RECORD FIXED (COMMON Returned Content)   |'
	'--------------------------------------------------'
	WebUI.verifyTextPresent("Edit Consumer", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Delete Consumer", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Find Address", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("reputation reports", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("vetting references", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("recommendations", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("feedback request", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("negative comment", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("callback shortlists", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Receive updates from Checkatrade", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Receive updates from selected third parties", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Preferences:", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Title:", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Forenames:", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Address", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("House name / building:", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Number and Street:", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Please ensure the Street / Road name is not in the Town field", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Telephone 1:", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Telephone 2:", false)
	'----------------------------------------------'
	WebUI.verifyTextPresent("Fax", false)
	'----------------------------------------------'*/
	
	'--------------------------------------------------'
	'RETURNED RECORD VARIABLE (UNIQUE Returned Content)|'
	'--------------------------------------------------'
	
	'-------------------------------------------------------------------------------------------------------------------------------------------------'
	'Ensure Data Checks are UNIQUE, Cheking theat the iteration checks returned the expected test data that wasnt actually presented, but expected    |'
	'-------------------------------------------------------------------------------------------------------------------------------------------------'
	
	// MEMBER ID CHECK - All returned data on ROW 1
	'----------------'
	'Consumer ID     |'
	'----------------'
	WebUI.verifyTextPresent(findTestData('Data Files/Consumer_Data (1)').getValue('Consumer_ID', 1), false)
	'----------------------------------------------'
	'----------------'
	'Title           |'
	'----------------'
	WebUI.verifyTextPresent(findTestData('Data Files/Consumer_Data (1)').getValue('r_Title', 1), false)
	'----------------------------------------------'
	'----------------'
	'Forenames       |'
	'----------------'
	//WebUI.verifyTextPresent(findTestData('Data Files/Consumer_Data (1)').getValue('r_Forenames', 1), false)
	//WebUI.verifyElementText(findTestObject('Page_/input_Forenames_ctledittbForename'), (findTestData('Data Files/Consumer_Data (1)').getValue('r_Forenames', 1), false)	)	
	'----------------------------------------------'
	'----------------'
	'Surname         |'
	'----------------'
	WebUI.verifyTextPresent(findTestData('Data Files/Consumer_Data (1)').getValue('r_Surname', 1), false)
	'----------------------------------------------'
	'----------------'
	'Number & Street |'
	'----------------'
	WebUI.verifyTextPresent(findTestData('Data Files/Consumer_Data (1)').getValue('r_Number_and_Street', 1), false)
	'----------------------------------------------'
	'----------------'
	'City            |'
	'----------------'
	WebUI.verifyTextPresent(findTestData('Data Files/Consumer_Data (1)').getValue('r_City', 1), false)
	'----------------------------------------------'
	'----------------'
	'Town            |'
	'----------------'
	WebUI.verifyTextPresent(findTestData('Data Files/Consumer_Data (1)').getValue('r_Town', 1), false)
	'----------------------------------------------'
	'----------------'
	'County          |'
	'----------------'
	WebUI.verifyTextPresent(findTestData('Data Files/Consumer_Data (1)').getValue('r_County', 1), false)
	'----------------------------------------------'
	'----------------'
	'Postcode        |'
	'----------------'
	WebUI.verifyTextPresent(findTestData('Data Files/Consumer_Data (1)').getValue('r_Postcode', 1), false)
	'----------------------------------------------'
	'----------------'
	'Phone 1         |'
	'----------------'
	WebUI.verifyTextPresent(findTestData('Data Files/Consumer_Data (1)').getValue('r_Phone_1', 1), false)
	'----------------------------------------------'
	'----------------'
	'Phone 2         |'
	'----------------'
	WebUI.verifyTextPresent(findTestData('Data Files/Consumer_Data (1)').getValue('r_Phone_2', 1), false)
	'----------------------------------------------'
	'----------------'
	'Fax            |'
	'----------------'
	WebUI.verifyTextPresent(findTestData('Data Files/Consumer_Data (1)').getValue('r_Fax', 1), false)
	'----------------------------------------------'
	'----------------'
	'Full Name       |'
	'----------------'
	WebUI.verifyTextPresent(findTestData('Data Files/Consumer_Data (1)').getValue('r_Full_Name', 1), false)
	'----------------'
	'Full Address    |'
	'----------------'
	WebUI.verifyTextPresent(findTestData('Data Files/Consumer_Data (1)').getValue('r_Full_Address', 1), false)

	
	WebUI.click(findTestObject('Page_/input_Title_ctledittbTitle'))
	//
	//WebUI.click(findTestObject('Page_/input_Forenames_ctledittbForename'))
	//
	//WebUI.click(findTestObject('Page_/input_Surname_ctledittbSurname'))
	//
	//WebUI.click(findTestObject('Page_/input_Email_ctledittbEmail'))
	//
	//WebUI.click(findTestObject('Page_/input_Mobile_ctledittbMobile'))
	//
	//WebUI.click(findTestObject('Page_/input_Preferences_ctleditchkEmail'))
	//
	//WebUI.click(findTestObject('Page_/input_Preferences_ctleditchkEmail'))
	//
	//WebUI.click(findTestObject('Page_/input_Receive updates from Checkatrade_ctle_79da42'))
	//
	//WebUI.click(findTestObject('Page_/input_Receive updates from Checkatrade_ctle_79da42'))
	//
	//WebUI.click(findTestObject('Page_/input_House name  building_ctleditctlConsum_c82a25'))
	//
	//WebUI.click(findTestObject('Page_/input_Number and Street_ctleditctlConsumerA_20e0c9'))
	//
	//WebUI.click(findTestObject('Page_/td_Please ensure the Street  Road name is n_8691ee'))
	//
	//WebUI.click(findTestObject('Page_/input_Town_ctleditctlConsumerAddresstbTown'))
	//
	//WebUI.click(findTestObject('Page_/input_City_ctleditctlConsumerAddresstbCity'))
	//
	//WebUI.click(findTestObject('Page_/input_County_ctleditctlConsumerAddresstbCounty'))
	//
	//WebUI.click(findTestObject('Page_/input_Postcode_ctleditctlConsumerAddresstbPostcode'))
	//
	//WebUI.click(findTestObject('Page_/input_Telephone 1_ctleditctlConsumerAddress_e485b7'))
	//
	//WebUI.click(findTestObject('Page_/input_Telephone 2_ctleditctlConsumerAddress_4d855f'))
	//
	//WebUI.click(findTestObject('Page_/input_Fax_ctleditctlConsumerAddresstbFax'))
	//
	//WebUI.click(findTestObject('Page_/input_Please supply a valid phone number_btnCancel'))
	//
	//WebUI.click(findTestObject('Page_/input_Please supply a valid phone number_btnSave'))
	
//}

'--------------------------------'
'           END                  |'
'--------------------------------'

