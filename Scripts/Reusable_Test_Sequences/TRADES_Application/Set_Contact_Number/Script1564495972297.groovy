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

//------------------------------------------------------------------------
// Set Contact Number during membership application form fill form fill  | - Snip - 30/07/2019
//---------------------------------------------------------------------------------------------------------------
// Element name Changed on Contact Number Fld |    16/01/2020   |        DH        | tbContactMob to tbContactNum|
//---------------------------------------------------------------------------------------------------------------

WebUI.setText(findTestObject('Page_Checkatrade Want to build your business/input_Contact Number_ctl00contenttbContactMob'),  GlobalVariable.ContactNumber)

//-------------------------------------------------------
// END                                                  | - Snip - 30/07/2019
//-------------------------------------------------------