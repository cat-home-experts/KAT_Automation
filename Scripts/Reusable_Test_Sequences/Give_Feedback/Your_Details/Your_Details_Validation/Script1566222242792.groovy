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

//------------------------------------------------------------------
// Test Sequence to Deal With Everything on the <Your_Details> Page | - Snip - 09/08/2019
//------------------------------------------------------------------
'------------------------------------------------'
'Trade  Customer Path Not Currently Implenmented |'
'------------------------------------------------'
'---------------------------------------------------------------------------------------'
' Your Details (page 3)                                                                 |'
'---------------------------------------------------------------------------------------'

'-------------------------------------'
' Submit Form - Trigger Validation    |'  
'-------------------------------------'
WebUI.waitForPageLoad(1)

WebUI.scrollToPosition(250, 0)

WebUI.waitForPageLoad(1)

WebUI.click(findTestObject('Object Repository/Page_Checkatrade Give your feedback/input_here_ctl00contentButtonSubmit')) // input_Value Of Work_ctl00contentButton1

'---------------------------------------------------------------------------------------'
' Your Experience (page 3) Verify Validation> Messages - This Field Is Required         |' // VERIFICATION AVAILABLE FROM sIGNUP fUNCTION
'---------------------------------------------------------------------------------------'
WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/TRADES_Application/Validation/This_Field_Is_Required'), [:], FailureHandling.CONTINUE_ON_FAILURE)

'---------------------------------------------------------------------------------------'
' Your Experience (page 3) Verify Validation> Messages  - Please Supply Home Phone      |' // Reuse of verification From Trades Function
'---------------------------------------------------------------------------------------'
WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Give_Feedback/Validation/Please_Supply_Home_Telephone_Number'), [:], FailureHandling.CONTINUE_ON_FAILURE)

'-------------------------------------'
' Consumer or Customer Selection      |'
'-------------------------------------'
WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Give_Feedback/Your_Details/Consumer_or_Customer_Selection'), [:], FailureHandling.CONTINUE_ON_FAILURE)

'-------------------------------------'
' Fill Personal Details               |'
'-------------------------------------'
WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Give_Feedback/Your_Details/Personal_Details_Formfill'), [:], FailureHandling.CONTINUE_ON_FAILURE)

'-------------------------------------'
' Fil Contact Details                 |'
'-------------------------------------'
WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Give_Feedback/Your_Details/Contact_Details_Formfill'), [:], FailureHandling.CONTINUE_ON_FAILURE)

'-------------------------------------'
' CHeckatrade Questions               |'
'-------------------------------------'
WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Give_Feedback/Your_Details/Checkatrade_Questions'), [:], FailureHandling.CONTINUE_ON_FAILURE)

'-------------------------------------'
' Commit form                         |'  // WARNING - Details Auto Commit No Need To Hit The Commit Button
'-------------------------------------'
//WebUI.click(findTestObject('Object Repository/Page_Checkatrade Give your feedback/input_Value Of Work_ctl00contentButton1'))


//-------------------------------------------------------
// END                                                  | - Snip - 09/08/2019
//-------------------------------------------------------