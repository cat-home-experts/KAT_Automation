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

//---------------------------------------------------------------------------------------------------------------
// Verify Footer Navigation is correct        |                 |                  |                             |
// navigating Company->Contact Us Returns     |    06/02/2020   |         DH       |                             |
// Contact Us Page                            |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
//    Contact us Link selector changed        |    29/04/2020   |         DH       |  Changed from xpath to Attr |
//---------------------------------------------------------------------------------------------------------------
//                                            |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
//                                            |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
//                                            |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
//                                            |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
//                                            |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
//                                            |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------
//                                                                                                               |
//	GIVEN - The Chekatrade Website 'HOMEPAGE' is Presented on a Client Device                                    |
//                                                                                                               |
//	WHEN -  We Navigate Company-Contact Us from the Page Footer Hyperlink                                           |
//                                                                                                               |
//  THEN -  The Resulting Outcome is that the <Contacts Us> Page is Returned                                       |
//                                                                                                               |
//---------------------------------------------------------------------------------------------------------------

	
	//-----------------------------------------
	// Call Startup Process - Browser Startup, Navigate, Maximize and Close Cookie Nagging Element
	//-----------------------------------------
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Setup'), [:], FailureHandling.OPTIONAL)
	//-----------------------------------------

	' Home Page validation Checks after COOKIE Dispelled'
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Home'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	
	'---------------------------------------'
	' Navigate to Trades->Find out More     |' //  Only Used ONCE - Hence, Not In Reuse Folder
	'---------------------------------------'
	WebUI.scrollToElement(findTestObject('Object Repository/CAT_Footer/Page_Checkatrade Find a tradesperson you can trust/div_Contact Us'), 3)
	WebUI.click(findTestObject('Object Repository/CAT_Footer/Page_Checkatrade Find a tradesperson you can trust/div_Contact Us'))
	
	'---------------------------------------'
	' Verify Returned Page is as Expected   |'
	'---------------------------------------'
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Footer/Company/COntact_Us_Verification'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	
	'--------------------------'
	' Teardown - CLose Browser |'
	'--------------------------'
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Teardown'), [:], FailureHandling.OPTIONAL)
	
	'--------------------------'
	' END                      |'
	'--------------------------'
