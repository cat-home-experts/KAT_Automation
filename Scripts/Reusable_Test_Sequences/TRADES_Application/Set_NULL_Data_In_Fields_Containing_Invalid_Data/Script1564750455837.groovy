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


//-------------------------------------------------------------------------------------------------
// Set REMAINING Fields Containing Special Chars (back) to NULL, To Elicit Validation Messaging    | - Snip - 02/08/2019
//-------------------------------------------------------------------------------------------------

'----------------------------------------------------------------------------------------------'
' Major Changes 05/12/2019 Factored in - As highlighted In The TOP (Driver) Script Header      |'
'----------------------------------------------------------------------------------------------'

'COMPANY NAME'    // No Validation on Company Name Currently (Apart from NULL Detection)
WebUI.setText(findTestObject('Page_Checkatrade Want to build your business/input_Company Name_ctl00contenttbCompanyName'), '')

'YOUR FULL NAME'  // No Validation on FUll Name Currently (Apart from NULL Detection)
//WebUI.setText(findTestObject('Page_Checkatrade Want to build your business/input_Your Full Name_ctl00contenttbContactName'), "")

'---------------------------------'
' Set First Name Field on App Sc  |'
'---------------------------------'
WebUI.setText(findTestObject('Object Repository/Trades_Apply_Here/Page_Checkatrade Want to build your business/input_find out more_ctl00contenttbContactFirstName'), '')

'---------------------------------'
' Set First Surname Field on App S|'
'---------------------------------'
WebUI.setText(findTestObject('Object Repository/Trades_Apply_Here/Page_Checkatrade Want to build your business/input_find out more_ctl00contenttbContactLastName'), '')


'TRADE CATEGORY' // Changes 04/09/2019 - removed this field
//WebUI.setText(findTestObject('Page_Checkatrade Want to build your business/input_Trade Category_join-now__category_autocomplete_input'), "")

'POSTCODE'        // No Validation on Postcode Name Currently (Apart from NULL Detection)
WebUI.setText(findTestObject('Page_Checkatrade Want to build your business/input_Postcode_ctl00contenttbPostCode'), '')

'CONTACT NUMBER'
WebUI.setText(findTestObject('Page_Checkatrade Want to build your business/input_Contact Number_ctl00contenttbContactMob'), '')

//-------------------------------------------------------
// END                                                  | - Snip - 02/08/2019
//-------------------------------------------------------
