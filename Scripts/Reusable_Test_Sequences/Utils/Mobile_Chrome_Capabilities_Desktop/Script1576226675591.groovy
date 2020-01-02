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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.configuration.RunConfiguration
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import com.kms.katalon.core.webui.driver.DriverFactory
import java.io.FileWriter
import java.io.PrintWriter
import java.io.IOException

//import org.openqa.selenium.chrome //
//-----------------------
// TEST HISTORY HEADER - |
//-----------------------
// Any changes to this script, please update the next available row below, with date, in the DATE CREATED column,
// Your Name in the CREATED BY column, and Finaly, The actual change implemented in the NOTES column.
//
//---------------------------------------------------------------------------------------------------------------
//       Test Definition / Description        |   Date Created  |    Created By    |             Notes           |
//---------------------------------------------------------------------------------------------------------------
// Use of Chrome Desired Capabilities to test |   13/12/2019    |        DH        | The last data row resets    |
// Emulations of Mobile Devices on the        |                 |                  | the Browser back to Default,|
// Chrome Desktop                             |                 |                  | No Emulator Set             |
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
//	GIVEN -                                                                                                      |
//                                                                                                               |
//	WHEN -                                                                                                       |
//                                                                                                               |
//  THEN -                                                                                                       |
//                                                                                                               |
//---------------------------------------------------------------------------------------------------------------


// TODO Revisit, 3 methodes withing, write a new properties file, set capabilities and set chrome options, 1st option was the closest to success, 
// file ownership issues prevent (partially worked setting mobile devicese discernable in kS propery settings after run
//def emulator // Device to use
def data = findTestData('Data Files/Mobile_Test_Data')
def file = "com.kms.katalon.core.webui.chrome.properties"
def filePath = "C:\\Users\\davidho\\Katalon Studio\\Start\\settings\\internal\\"+file
//def file

            // "C:\\Users\\davidho\\Katalon Studio\\Start\\settings\\internal\\com.kms.katalon.core.webui.chrome.properties"
'---------------------------------------------------------------------------------------------------------------------------'
// Examples of expected changes to 'com.kms.katalon.core.webui.chrome.properties' Located in
// C:\Users\davidho\Katalon Studio\Start\settings\internal - locally
'Example Setting Applied'
// {"CHROME_DRIVER":{"mobileEmulation":{"deviceName":"iPhone X"},"orientation":"LANDSCAPE"}}
'No Settings Applied'
// {"CHROME_DRIVER":{}}
'Default values Available from Chrome'
// iPhone 5/SE' Galaxy S5, Pixel 2, Pixel 2 XL, iPhone 5/SE, iPhone 6/7/8, iPhone 6/7/8 Plus, iPhone X, iPad, iPad pro
'Other available values from Chrome that can be set'
// Blackberry Z30, Blackberry PlayBook, Galaxy Note 3, Galaxy Note II, Galaxy S III, Kindle Fire HDX, LG Optimus HDX, Laptop with HiDPI screen
// Laptop with MDPI screen, Laptop with touch, Microsoft Lumia 550, Microsoft Lumia 950, Nexus 10, Nexus 4, Nexus 5, Nexus 5X, Nexus 6, Nexus 6P
// Nexus 7, Nokia Lumia 520, Nokia N9, iPad Mini, iPhone 4, jioPhone 2   
'The settings are accessible via Katalon Studio, via menuItem "Project/Settings/Desired" capabilities/WebUI/Chrome'

'Question - Why have I used this approach, rather than setting the Chrome Properties Directly'
// I've utilised the Katalon Infrastructure, and kept the process integral to Katalon, rather than external manipulation, which might be more
// brittle in the long term? I Will continuially review and adapt the best, and most compact and robust approach I can find
'--------------------------------------------------------------------------------------------------------------------------'
//use external chromedriver
//ChromeOptions options = new ChromeOptions();
//DesiredCapabilities capabilities = new DesiredCapabilities();
//capabilities.setCapability(ChromeOptions.CAPABILITY, options);
//System.setProperty("webdriver.chrome.driver", "C:\\Users\\davidho\\Katalon Studio\\Start\\Reports\\Project Docs\\Updates\\chromedriver.exe");
//ChromeDriver driver = new ChromeDriver(capabilities);
////DriverFactory.changeWebDriver(driver)
//DriverFactory.changeWebDriver(driver)
'--------------------------------------------------------------------------------------------------------------------------'


// Error
// B22618561.245350752;sz=1x2;ord=1655007740981536527555:1 Failed to execute 'write' on 'Document': 
// It isn't possible to write into a document from an asynchronously-loaded external script unless it is explicitly opened.

'Dec 16, 2019 10:06:12 AM org.openqa.selenium.remote.DesiredCapabilities chrome'
'INFO: Using `new ChromeOptions()` is preferred to `DesiredCapabilities.chrome()'


try{
	'------------------------------------------'
	// Set Emulator Device as specified in the DataSet Row
	'------------------------------------------'
	//emulator = data.getValue("Emulation", GlobalVariable.row)
	//String mobileDevice = emulator;  // Change the path to dynamic
	String mobileDevice = data.getValue("Emulation", GlobalVariable.row)
	'------------------------------------------'
	
	// Open (existing) file to modify/Overwrite
	'------------------------------------------'
	// File file = new File(filePath);
	'------------------------------------------'
	' Set Capabilities'
	'------------------------------------------'
	//file.setReadable(true)
	//file.setWritable(true)
	//	Map<String, String> mobileEmulation = new HashMap<>();
	//	
	//	mobileEmulation.put("deviceName", mobileDevice);
	//	
	//	
	//	ChromeOptions chromeOptions = new ChromeOptions();
	//	chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
	//	
	//	DriverFactory.changeWebDriver(driver)
//	WebDriver driver = new ChromeDriver(chromeOptions);
//	
 	ChromeOptions options = new ChromeOptions()
//		Map<String, Object> prefs = new HashMap<String, Object>()
//		prefs.put("profile.default_content_settings.popups", 0)
//		options.setExperimentalOption("prefs", prefs)
	//set.
	//options.
	
	//options.BinaryLocation = "\path\to\chrome";
	ChromeDriver driver = new ChromeDriver(options);
	'------------------------------------------'
	
    // Write Emulator Configuration to File
	'------------------------------------------'
	FileWriter fw = new FileWriter(file.getAbsoluteFile());
	BufferedWriter bw = new BufferedWriter(fw);
	bw.write(mobileDevice);
	'------------------------------------------'
	//Close and Report
	'------------------------------------------'
	bw.close();
	KeywordUtil.markPassed("The Mobile Device Emulated, is the "+mobileDevice+" on test iteration "+GlobalVariable.row)
	'------------------------------------------'
	//mobileDevice = ""
	'------------------------------------------'
	// WebUI.refresh()
	'------------------------------------------'
}catch(Exception e){ // IOException
	e.printStackTrace()
}

'--------------------------------------------------------------------------------------------------------------'
///////////////////////////////////////
//                END                //
///////////////////////////////////////