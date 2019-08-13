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
// Test Sequence to Deal With Everything on the <Your Experience> Page 1               | - Snip - 09/08/2019
//-------------------------------------------------------------------------------------

'---------------------------------------------------------------------------------------'
' Your Experience (page 1) Returned with Recommendation Selection Set to Yes (Default)  |'
'---------------------------------------------------------------------------------------'
//WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Give_Feedback/Your_Experience/Validation/Your_Experience_Initial_Page_State'), [:], FailureHandling.CONTINUE_ON_FAILURE)


'---------------------------------------------------------------------------------------'
' Your Experience (page 1) Recomment this trader?                                       |'
'---------------------------------------------------------------------------------------'
WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Give_Feedback/Your_Experience/Recommendation_Selection'), [:], FailureHandling.CONTINUE_ON_FAILURE)


'---------------------------------------------------------------------------------------'
' Your Experience (page 1) Estimation/Quotation Accuracy?                               |'
'---------------------------------------------------------------------------------------'
WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Give_Feedback/Your_Experience/Quotation_Selection'), [:], FailureHandling.CONTINUE_ON_FAILURE)


'---------------------------------------------------------------------------------------'
' Your Experience (page 1) Knowledge of Feedback Process?                               |'
'---------------------------------------------------------------------------------------'
WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Give_Feedback/Your_Experience/Feedback_Knowledge'), [:], FailureHandling.CONTINUE_ON_FAILURE)


'---------------------------------------------------------------------------------------'
' Your Experience (page 1) Hit <Next> Button to Continue to <Your Scores>- (page 2)     |'
'---------------------------------------------------------------------------------------'
    WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/Give_Feedback/Hit_Next'), [:], FailureHandling.CONTINUE_ON_FAILURE)


//------------------------------------
// END                               | - Snip - 12/08/2019
//------------------------------------








