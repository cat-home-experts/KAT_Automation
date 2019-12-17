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
import java.lang.Integer as Integer


import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
//-----------------------
// TEST HISTORY HEADER - |                   FUNCTIONAL DEMO - REFACTOR TODO                                                                                            |
//-----------------------
// Any changes to this script, please update the next available row below, with date, in the DATE CREATED column,
// Your NAme in the CREATED BY column, and Finaly, The actual change implemented in the NOTES column.
//
//---------------------------------------------------------------------------------------------------------------
//       Test Definition / Description        |   Date Created  |    Created By    |             Notes           |
//---------------------------------------------------------------------------------------------------------------
// Test to confirm that the correct detail is |                 |                  | Single Search Undertaken    |
// returned for given 'Trade' and 'Location'  |    13/07/2019   |     Dave Horne   | Using External Test Data    |
// search criteria.                           |                 |                  | Provided on an Excel SSheet |
//---------------------------------------------------------------------------------------------------------------
// Extended to data Driven with var. X,Y      |    27/08/2019   |     Dave Horne   | Currently 5 different screen|
// Resolutions set, 1 rox of data driven XL   |                 |                  | resolutions tested          |
//---------------------------------------------------------------------------------------------------------------
// Extensive Changes to HMI Caused Refactor   |    06/12/2019   |     Dave Horne   | TODO script need to be Restr| 
//---------------------------------------------------------------------------------------------------------------
//                                            |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
//                                            |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
'------------------------------------------------------------------------------------------------------'
'TODO script need to be Restructure - Using browser Capabilities rather than setViewPortSize           |'
'------------------------------------------------------------------------------------------------------'
//---------------------------------------------------------------------------------------------------------------
//                                                                                                               |
//	GIVEN - The Chekatrade Website 'SEARCHPAGE' is Presented on a Client Device with Various Resolutions Set     |
//                                                                                                               |
//	WHEN -  We Enter Trade and Location Search Criteria and Hit SEARCH                                           |
//                                                                                                               |
//  THEN -  The Resulting Search Results Page is Returned Along With a Valid Set of Results                      |
//                                                                                                               |
//---------------------------------------------------------------------------------------------------------------
// FOR DEMO PURPOSES - REAL TEST CASE WOULD USE SHARED RESOURCES FROM REAUSABLE TEST SEQUENCES
//-----------------------------------------
//Test Listener Manages Startup Processes
//-----------------------------------------
//GlobalVariable.PAGE = "GiveFeedback"
//GlobalVariable.URL = GlobalVariable.URL+GlobalVariable.PAGE
//use external chromedriver
//ChromeOptions options = new ChromeOptions();
//DesiredCapabilities capabilities = new DesiredCapabilities();
//capabilities.setCapability(ChromeOptions.CAPABILITY, options);


	static String deviceName;
//public static void main(String[] args) {
 //some Sample Devices. Complete list can be found here: https://code.google.com/p/chromium/codesearch#chromium/src/chrome/test/chromedriver/chrome/mobile_device_list.cc
 //pick any of the device

//  deviceName = "Google Nexus 5";
//  deviceName = "Samsung Galaxy S4";
//  deviceName = "Samsung Galaxy Note 3";
//  deviceName = "Samsung Galaxy Note II";
//  deviceName = "Apple iPhone 4";           
	' default vakues Apple iPhone 5 is incorrect, should be iPhone 5/SE'
	 deviceName = "Apple iPhone 5"; // Galaxy S5, Pixel 2, Pixel 2 XL, iPhone 5/SE, iPhone 6/7/8, iPhone 6/7/8 Plus, iPhone X, iPad, iPad pro
//  deviceName = "Apple iPad 3 / 4";
 
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\davidho\\Katalon Studio\\Start\\Reports\\Project_Docs\\Updates\\chromedriver.exe");

//Map<String, String> mobileEmulation = new HashMap<>();
//
//mobileEmulation.put("deviceName", "Nexus 5");
//
//
//ChromeOptions chromeOptions = new ChromeOptions();
//chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
//
//WebDriver driver = new ChromeDriver(chromeOptions);



	  Map<String, String> mobileEmulation = new HashMap<String, String>();
	  mobileEmulation.put("deviceName", deviceName);

	  Map<String, Object> chromeOptions = new HashMap<String, Object>();
	  chromeOptions.put("mobileEmulation", mobileEmulation);

	  capabilities = DesiredCapabilities.chrome();
	  capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
	  WebDriver driver = new ChromeDriver(capabilities);

//WebDriver driver = new ChromeDriver(chromeOptions);
//
//Map<String, String> mobileEmulation = new HashMap<>();
//mobileEmulation.put(“deviceName”, “Nexus 5”);
//
//
// 
//
//ChromeOptions chromeOptions = new ChromeOptions();
//chromeOptions.setExperimentalOption(“mobileEmulation”, mobileEmulation);




//ChromeDriver driver = new ChromeDriver(capabilities);
//DriverFactory.changeWebDriver(driver)


//-----------------------------------------
// Call Setup Process - Browser Startup, Navigate, Maximize and Close Cookie Nagging Element
//-----------------------------------------
'For Loop to Iterate over the test data provided by the Excel spreadsheet, \r\nassociated with this test\r\n'
for (GlobalVariable.row = 1; GlobalVariable.row <= findTestData('Mobile_Test_Data').getRowNumbers(); (GlobalVariable.row)++) { // Mobile_Test_Data
    //def removed for globalisation
    WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Setup'), [:], FailureHandling.OPTIONAL)
	//----------------------------------------------------------
	' ALTERNATIVE SCREEN RESOLUTION SELECTION METHOD'        // |
    //----------------------------------------------------------
    //    def data = findTestData('searchTestData')
    //
    //    X_COORD = data.getValue('X_COORD', GlobalVariable.row)
    //
    //    Y_COORD = data.getValue('Y_COORD', GlobalVariable.row)
    //----------------------------------------------------------
    //WebUI.setViewPortSize(703, 407)
    //int XCOORD = 500
    //int YCOORD = 700
    //----------------------------------------------------------	
    // Flaky Method, will break when the datasheet expands, issues grabbing data from excel using SetViewPortSize - 
    // Errors returned = property doesn't exist and data resolution issues - also, the dataset spreadsheet view, in the test suite is broken?
    //----------------------------------------------------------
    // Feed the View Port Settings From Here (Currentyl 5 Rows in 
    // the Datasheet - have set 10 rows here as an insurance polisy :-)
    //----------------------------------------------------------
    //	switch (GlobalVariable.row) {
    //		case 1: XCOORD = 200; YCOORD = 400; break
    //		case 2: XCOORD = 300; YCOORD = 500; break 
    //		case 3: XCOORD = 400; YCOORD = 600; break		
    //		case 4: XCOORD = 500; YCOORD = 700; break		
    //		case 5: XCOORD = 600; YCOORD = 800; break		
    //		case 6: XCOORD = 700; YCOORD = 900; break		
    //		case 7: XCOORD = 800; YCOORD = 1000; break
    //		case 8: XCOORD = 900; YCOORD = 1100; break
    //		case 9: XCOORD = 1000; YCOORD = 1200; break
    //		case 10:XCOORD = 1100; YCOORD = 1300; break
    //		default: XCOORD = 500; YCOORD = 700; break }
    //----------------------------------------------------------
    // Set View Port Size
    //----------------------------------------------------------
	//----------------------------------------------------------
	' ACTUAL SCREEN RESOLUTION SELECTION METHOD USED'       // |
	//----------------------------------------------------------
    // Pul X and Y from the spreadsheet (parse Integer from data sheet string value)
    //----------------------------------------------------------
    'Set viewport size eg. 703x347'
    int XCOORD = Integer.parseInt(findTestData('searchTestData').getValue('X_COORD', GlobalVariable.row))
    int YCOORD = Integer.parseInt(findTestData('searchTestData').getValue('Y_COORD', GlobalVariable.row))
	//----------------------------------------------------------
	// Set the Integer Vlues of X and Y for View Port Viewing  |
	//----------------------------------------------------------
    WebUI.setViewPortSize(XCOORD, YCOORD)
	'Page Loading'
    WebUI.waitForPageLoad(60)
	//---------------------------------------------------------
	'Report on  the Current Set View Port Settings'        // |
	//---------------------------------------------------------
	System.out.println((('Set View Port Size is currently SET to X AXIS ' + XCOORD) + ' Y AXIS ') + YCOORD)
	//---------------------------------------------------------------------
	// Set The Trade Classification to Select on the Trade Search Screen  |
    //------------------------------------------------------------------------------------------------------------------------------------------------
//    'Set and SEARCH SELECTED TRADE'
//	'---------------------------------'    WebUI.setText(findTestObject('Page_Checkatrade Find a tradesperson you can trust/input_Search through'), 
//        findTestData('searchTestData').getValue('tradeClassification', GlobalVariable.row))
//	
//	WebUI.click(findTestObject('Page_Checkatrade Find a tradesperson you can trust/input_Search through'))
//	//---------------------------------------------------------------------
//	'Page Loading'
//    WebUI.waitForPageLoad(60)
//    //------------------------------------------------------------------------------------------------------------------------------------------------
//    'Set and SEARCH SELECTED LOCATION'
//	'---------------------------------'
//    WebUI.setText(findTestObject('Object Repository/Checkatrade_Trade_Search_Page/Page_Checkatrade Find a tradesperson you can trust/input_location'), 
//        findTestData('searchTestData').getValue('tradeLocation', GlobalVariable.row))
//	
//	WebUI.click(findTestObject('Object Repository/Checkatrade_Trade_Search_Page/Page_Checkatrade Find a tradesperson you can trust/input_location'))
//
//	

//	'Page Loading'
//    WebUI.waitForPageLoad(60)
//	
//	'---------------------------------------'
//	' Hit Search Button                     |'
//	'---------------------------------------'
//	//WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Hit_Search_Button'), [:], FailureHandling.CONTINUE_ON_FAILURE)
//    //------------------------------------------------------------------------------------------------------------------------------------------------
//	
//    'Scroll to Element (off screen)'
//    //WebUI.scrollToElement(findTestObject('Object Repository/Checkatrade_Trade_Search_Page/Page_Checkatrade Find a tradesperson you can trust/a_Search'), 
//    //    5)
//	
//	'Page Loading'
//    //WebUI.waitForPageLoad(60)
//    '-------------'
//    'HIT SEARCH'
//   // WebUI.doubleClick(findTestObject('Object Repository/Checkatrade_Trade_Search_Page/Page_Checkatrade Find a tradesperson you can trust/a_Search'))
//	WebUI.click(findTestObject('Object Repository/Checkatrade_Trade_Search_Page/Page_Checkatrade Find a tradesperson you can trust/Page_Checkatrade Find a tradesperson you can trust/a_Search'))
//	
//	'Page Loading'
//    WebUI.waitForPageLoad(60)
//    //------------------------------------------------------------------------------------------------------------------------------------------------
//    'Scroll to Element Containing The Concantanated Test data (off screen)'
//    WebUI.scrollToElement(findTestObject('Object Repository/Page_Returned_Concantanated_Text/h1_Concantanated_Returned_Result'), 
//        5)
//	WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Returned_Concantanated_Text/h1_Concantanated_Returned_Result'),
//		5)
//	'Page Loading'
//    WebUI.delay(1)
    //------------------------------------------------------------------------------------------------------------------------------------------------
	'---------------------------------------'
	' Set and SEARCH TRADE CLASSIFICATION   |'
	'---------------------------------------'
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Enter_Trade_Classification'), [:], FailureHandling.CONTINUE_ON_FAILURE)

	'---------------------------------------'
	' Dispel New trades Header              |'  // TODO WTS
	'---------------------------------------'
	//WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Dispel_Trade_Header'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	
	'---------------------------------------'
	' Set and SEARCH TRADE LOCATION         |'
	'---------------------------------------'
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Enter_Trade_Location'), [:], FailureHandling.CONTINUE_ON_FAILURE)

	'---------------------------------------'
	' Dispel New trades Header              |'  // TODO WTS
	'---------------------------------------'
	//WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Dispel_Trade_Header'), [:], FailureHandling.CONTINUE_ON_FAILURE)

	'---------------------------------------'
	' Scroll Search Button into View        |' // SUperceeded
	'---------------------------------------'
	//WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Scroll_To_Search_Button'), [:], FailureHandling.CONTINUE_ON_FAILURE)

	'---------------------------------------'
	' Dispel New trades Header              |'  // TODO WTS
	'---------------------------------------'
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Dispel_Trade_Header'), [:], FailureHandling.CONTINUE_ON_FAILURE)

	'---------------------------------------'
	' Hit Search Button                     |'
	'---------------------------------------'
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Hit_Search_Button'), [:], FailureHandling.CONTINUE_ON_FAILURE)

	
	'---------------------------------------'
	' Verify Returned Page is as Expected   |'
	'---------------------------------------'
	WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Verification'), [:], FailureHandling.CONTINUE_ON_FAILURE)
//    WebUI.verifyTextPresent(findTestData('searchTestData').getValue('tradeLocationVerification', GlobalVariable.row), false, 
//        FailureHandling.CONTINUE_ON_FAILURE)
//    'Expected cantantenated text is Returned'
	    // WebUI.verifyTextPresent(findTestData('searchTestData').getValue('tradeLocationVerification', GlobalVariable.row), FailureHandling.CONTINUE_ON_FAILURE)
	'--------------------------'
    ' Teardown - CLose Browser |'
    '--------------------------'
    WebUI.callTestCase(findTestCase('Reusable_Test_Sequences/CAT_Teardown'), [:], FailureHandling.OPTIONAL)
    '--------------------------'
    ' END  Of ITERATION        |'
    '--------------------------'
}
