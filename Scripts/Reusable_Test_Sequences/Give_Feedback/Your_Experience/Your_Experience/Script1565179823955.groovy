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

//---------------------------------------------------------------------
// Test Sequence to Deal With Everything on the <Your Experience> Page | - Snip - 09/08/2019
//---------------------------------------------------------------------

'---------------------------------------------------------------------------------------'
' Your Experience (page 1) Returned with Recommendation Selection Set to Yes (Default)  |'
'---------------------------------------------------------------------------------------'
WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Give_Feedback/Your_Experience/Validation/Your_Experience_Initial_Page_State'), [:], FailureHandling.CONTINUE_ON_FAILURE)















//-------------------------------------------------------
// END                                                  | - Snip - 09/08/2019
//-------------------------------------------------------






