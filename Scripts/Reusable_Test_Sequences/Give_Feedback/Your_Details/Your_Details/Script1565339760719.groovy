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

'---------------------------------------------------------------------------------------'
' Your Details (page 3)                                                                 |'
'---------------------------------------------------------------------------------------'

'-------------------------------------'
' Consumer or Customer Selection      |'
'-------------------------------------'
WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Give_Feedback/Your_Details/Consumer_or_Customer_Selection'), [:], FailureHandling.STOP_ON_FAILURE)

'-------------------------------------'
' Fill Personal Details               |'
'-------------------------------------'
WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Give_Feedback/Your_Details/Personal_Details_Formfill'), [:], FailureHandling.STOP_ON_FAILURE)

'-------------------------------------'
' Fil Contact Details                 |'
'-------------------------------------'
WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Give_Feedback/Your_Details/Contact_Details_Formfill'), [:], FailureHandling.STOP_ON_FAILURE)

'-------------------------------------'
' CHeckatrade Questions               |'
'-------------------------------------'
WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Give_Feedback/Your_Details/Checkatrade_Questions'), [:], FailureHandling.STOP_ON_FAILURE)

'-------------------------------------'
' Commit form                         |'  // WARNING - Details Auto Commit No Need To Hit The Commit Button
'-------------------------------------'
//WebUI.click(findTestObject('Object Repository/Page_Checkatrade Give your feedback/input_Value Of Work_ctl00contentButton1'))
WebUI.waitForPageLoad(60)

//-------------------------------------------------------
// END                                                  | - Snip - 09/08/2019
//-------------------------------------------------------