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

//-----------------------
// TEST HISTORY HEADER -|
//-----------------------
// Any changes to this script, please update the next available row below, with date, in the DATE CREATED column,
// Your Name in the CREATED BY column, and Finaly, The actual change implemented in the NOTES column.
//
//---------------------------------------------------------------------------------------------------------------
//       Test Definition / Description        |   Date Created  |    Created By    |             Notes           |
//---------------------------------------------------------------------------------------------------------------
// Validation of Members Marketing Materials  |    19/12/2019   |        DH        |                             |
//                                            |                 |                  |                             |
//---------------------------------------------------------------------------------------------------------------
// Content and Behavioral changes factored in |    10/02/2020   |        DH        |                             |
//---------------------------------------------------------------------------------------------------------------
// Embedded Textual Content - Verifying Prime |    13/02/2020   |        DH        |                             |
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

////////////////////////////////////////////////////////////
//     Wait for Apply Filter Element Availability         //
////////////////////////////////////////////////////////////

'SEEMS TO BE A DEFECT SELECTING ITEMS?'

WebUI.waitForPageLoad(60)
WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Members Area/Page_Members Area/mat-panel-title_Download your Checkatrade report'), 60)
// Dispel Popout Menu by Hovering on Link
WebUI.mouseOver(findTestObject('Object Repository/Page_Members Area/a_Log off'))
'-----------------------------------------------------------'
//Expand Each of the 4 Elements to Expose Sub Area Content  |
'-----------------------------------------------------------'
// (1)
'----------------------------------------------'
'Sub Header (common)Textual Content'
'----------------------------------------------'
'-----------------------------------------------------------'
'EXPAND'
WebUI.click(findTestObject('Object Repository/Page_Members Area/Page_Members Area/mat-panel-title_Download your Checkatrade report'))
WebUI.waitForPageLoad(60)
WebUI.delay(1)
//WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Members Area/Page_Members Area/mat-panel-title_Download your Checkatrade report'), 2)
'-----------------------------------------------------------'
'CHECK'
'-----------------------------------------------------------'
' Textual presentation changed - 10/02/2020'

//WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Members Area/Page_Members Area/Marketing_Report_Download_Button'), 60)
' Content Change'

//WebUI.verifyTextPresent("The Checkatrade Report is a detailed report about your company", false)
////                       The Checkatrade Report is a detailed report about your company
//WebUI.verifyTextPresent("that you can give to potential customers to show them your credentials", false)
////                       that you can give to potential customers to show them your credentials
//WebUI.verifyTextPresent("Choose from these reports", false)
//                       Choose from these reports 
'----------------------------------------------'
'Marketing Materials Header - Top View'
'----------------------------------------------'
WebUI.verifyTextPresent("Marketing Materials", false)
'----------------------------------------------'
'Marketing Materials Sub Header "Download your Checkatrade report"'
'----------------------------------------------'
WebUI.verifyTextPresent("Download your Checkatrade report", false)
'----------------------------------------------'
'Marketing Materials Sub Header "Order free stickers and feedback cards"'
'----------------------------------------------'
WebUI.verifyTextPresent("Order free stickers and feedback cards", false)
'----------------------------------------------'
'Marketing Materials Sub Header "Images for your website"'
'----------------------------------------------'
WebUI.verifyTextPresent("Images for your website", false)
'----------------------------------------------'
'Marketing Materials Sub Header "Your free QR code"'
'----------------------------------------------'
WebUI.verifyTextPresent("Your free QR code", false)
'----------------------------------------------'
'COLLAPSE'
WebUI.click(findTestObject('Object Repository/Page_Members Area/Page_Members Area/mat-panel-title_Download your Checkatrade report'))
'-----------------------------------------------------------'
//Expand Each of the 4 Elements to Expose Sub Area Content  |
'-----------------------------------------------------------'
WebUI.delay(1)
// (2) 5 Elements to this Area - Need to Scroll the BOTTOM 2 into VIEW
'-----------------------------------------------------------'
'EXPAND'
WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Members Area/Page_Members Area/mat-panel-title_Order free stickers and fee_adb7c6'), 5)
WebUI.click(findTestObject('Object Repository/Page_Members Area/Page_Members Area/mat-panel-title_Order free stickers and fee_adb7c6'))
WebUI.waitForPageLoad(60)
//WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Members Area/Page_Members Area/mat-panel-title_Order free stickers and fee_adb7c6'), 2)
'-----------------------------------------------------------'
'CHECK'
'-----------------------------------------------------------'
// WebUI.verifyTextPresent("If you run out of feedback cards or stickers, order more below", false) // Embedded text changed 12/02/2020
//WebUI.verifyTextPresent("We will send them free of charge to the address we have registered for your company", false) // Embedded text changed 12/02/2020
//WebUI.verifyTextPresent("To order, add the number of items you require. Confirm and", false) // Embedded text changed 12/02/2020
// WebUI.verifyTextPresent("place your order with the blue button at the bottom of this section", false) // Embedded text changed 12/02/2020
'----------------------------------------------'
'Customer Reputation'
'----------------------------------------------'
// WebUI.verifyTextPresent("Customer Reputation Report Cards (Feedback Cards)", false)  // Embedded text changed 12/02/2020
// WebUI.verifyTextPresent("Feedback Card. Sent in batches of 10", false)  // Embedded text changed 12/02/2020
// WebUI.verifyTextPresent("The most important element of your membership", false)  // Embedded text changed 12/02/2020
// WebUI.verifyTextPresent("You can now order", false)  // Embedded text changed 12/02/2020
// WebUI.verifyTextPresent("Change comments that appear on your cards", false)
// WebUI.verifyTextPresent("Preview (pdf)", false)
'----------------------------------------------'
'Checkatrade Vehicle Vinyl - Small'
'----------------------------------------------'
// WebUI.verifyTextPresent("Checkatrade Vehicle Vinyl - Small", false)  // Embedded text changed 12/02/2020
// WebUI.verifyTextPresent("Checkatrade vinyl for your van or vehicle", false) // Multiple occurances  // Embedded text changed 12/02/2020
// WebUI.verifyTextPresent("Exterior use, size small (21 cm x 5.5cm)", false)  // Embedded text changed 12/02/2020  // Embedded text changed 12/02/2020
// WebUI.verifyTextPresent("There are different designs to suit different vehicle body colours", false) // Multiple occurances  // Embedded text changed 12/02/2020
// WebUI.verifyTextPresent("All vinyls are coloured letters on a clear background.", false)      	// Multiple occurances  // Embedded text changed 12/02/2020
// WebUI.verifyTextPresent("Please contact Members Services if you require more than 3", false)	// Multiple occurances  // Embedded text changed 12/02/2020
// WebUI.verifyTextPresent("What colour is your vehicle?", false)	// Multiple occurances  // Embedded text changed 12/02/2020
// WebUI.verifyTextPresent("Quantity", false)	// Multiple occurances

'----------------------------------------------'
'Checkatrade Vehicle Vinyl - Medium'
'----------------------------------------------'
// WebUI.verifyTextPresent("Checkatrade Vehicle Vinyl - Medium", false) // Embedded text changed 12/02/2020
// WebUI.verifyTextPresent("Exterior use, size medium (45 cm x 12cm)", false) // Embedded text changed 12/02/2020
'----------------------------------------------'
'NEED TO SCROLL TO HALF SCREEN'
'Scroll Half Page Down'
WebUI.scrollToPosition(600, 600)
'----------------------------------------------'
'Checkatrade Vehicle Vinyl - Large'
'----------------------------------------------'
// WebUI.verifyTextPresent("Checkatrade Vehicle Vinyl - Large", false) // Embedded text changed 12/02/2020
// WebUI.verifyTextPresent("Exterior use, Size large (75 cm x 20cm)", false) // Embedded text changed 12/02/2020
// WebUI.verifyTextPresent("PLEASE BE AWARE THESE ARE NEARLY 1", false) // Embedded text changed 12/02/2020
// WebUI.verifyTextPresent("METRE LONG SO THEREFORE PLEASE", false) // Embedded text changed 12/02/2020
// WebUI.verifyTextPresent("ENSURE THERE IS ENOUGH SPACE ON YOUR VEHICLE", false) // Embedded text changed 12/02/2020
// WebUI.verifyTextPresent("These vinyls are coloured letter cut-outs with no background.", false)  // Embedded text changed 12/02/2020
// WebUI.verifyTextPresent("Please contact Members Services if you require these", false)  // Embedded text changed 12/02/2020
'----------------------------------------------'
'Avoid Rogue Trades - Vinyl'
'----------------------------------------------'
// WebUI.verifyTextPresent("Avoid Rogue Trades - Vinyl", false) // Embedded text changed 12/02/2020
// WebUI.verifyTextPresent("(24 cm x 3 cm) Vehicle Vinyl,", false) // Embedded text changed 12/02/2020
// WebUI.verifyTextPresent("printed on a red background", false) // Embedded text changed 12/02/2020
// WebUI.verifyTextPresent("can be used in conjunction with Checkatrade vehicle vinyls", false) // Embedded text changed 12/02/2020
'----------------------------------------------'
'NEED TO SCROLL A BIT MORE'
'Scroll Half Page Down'
WebUI.scrollToPosition(400, 400)
'----------------------------------------------'
'FOOTER'
// WebUI.verifyTextPresent("Review, edit and place your order", false) // Embedded text changed 12/02/2020
// WebUI.verifyTextPresent("please allow 7 to 10 days for your order to arrive", false) // Embedded text changed 12/02/2020
//WebUI.verifyTextPresent("Select items to order", false)                       
WebUI.verifyTextPresent("Images for your website", false)
WebUI.verifyTextPresent("Your free QR code", false)
'----------------------------------------------'
'NEED TO SCROLL BACK Up'
'Scroll Half Page Down'
//WebUI.scrollToPosition(-600, -600)
'----------------------------------------------'
'COLLAPSE'
WebUI.click(findTestObject('Object Repository/Page_Members Area/Page_Members Area/mat-panel-title_Order free stickers and fee_adb7c6'))
'-----------------------------------------------------------'
//Expand Each of the 4 Elements to Expose Sub Area Content  |
'-----------------------------------------------------------'
WebUI.delay(1)
// (3) 3 Elements to this Area - Need to Scroll the BOTTOM 1 into VIEW
'-----------------------------------------------------------'
'EXPAND'
WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Members Area/Page_Members Area/mat-panel-title_Images for your website'), 5)
WebUI.click(findTestObject('Object Repository/Page_Members Area/Page_Members Area/mat-panel-title_Images for your website'))
WebUI.waitForPageLoad(60)
//WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Members Area/Page_Members Area/mat-panel-title_Images for your website'), 2)
'-----------------------------------------------------------'
'CHECK'
'-----------------------------------------------------------'
// WebUI.verifyTextPresent("A powerful way of displaying your reputation on your website", false) // Embedded text changed 12/02/2020
// WebUI.verifyTextPresent("If you have your own website, below are some useful images", false) // Embedded text changed 12/02/2020
// WebUI.verifyTextPresent("that you can use to impress your customers", false) // Embedded text changed 12/02/2020
// WebUI.verifyTextPresent("Feedback Chart - Sample", false) // Embedded text changed 12/02/2020
// WebUI.verifyTextPresent("Feedback Summary - Sample", false) // Embedded text changed 12/02/2020
// WebUI.verifyTextPresent("Click on the image to preview the link", false) // Embedded text changed 12/02/2020
'----------------------------------------------'
'NEED TO SCROLL TO HALF SCREEN'
'Scroll Half Page Down'
WebUI.scrollToPosition(400, 400)
'----------------------------------------------'
// WebUI.verifyTextPresent("Checkatrade Logo - Sample", false) // Embedded text changed 12/02/2020
// WebUI.verifyTextPresent("Download jpg", false) // Embedded text changed 12/02/2020
// WebUI.verifyTextPresent("Download tif", false) // Embedded text changed 12/02/2020
// WebUI.verifyTextPresent("Download EPS", false) // Embedded text changed 12/02/2020
// WebUI.verifyTextPresent("Download EPS (small)", false) // Embedded text changed 12/02/2020
// WebUI.verifyTextPresent("Code for your website", false) // Embedded text changed 12/02/2020
'----------------------------------------------'
'NEED TO SCROLL BACK Up'
'Scroll Half Page Down'
//WebUI.scrollToPosition(-400, -400)
'----------------------------------------------'
'COLLAPSE'
WebUI.click(findTestObject('Object Repository/Page_Members Area/Page_Members Area/mat-panel-title_Images for your website'))
'-----------------------------------------------------------'
//Expand Each of the 4 Elements to Expose Sub Area Content  |
'-----------------------------------------------------------'
// 43) 
'-----------------------------------------------------------'
WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Members Area/Page_Members Area/mat-panel-title_Your free QR code'), 5)
WebUI.click(findTestObject('Object Repository/Page_Members Area/Page_Members Area/mat-panel-title_Your free QR code'))
WebUI.waitForPageLoad(60)
//WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Members Area/Page_Members Area/mat-panel-title_Your free QR code'), 2)
'-----------------------------------------------------------'
'CHECK'
'-----------------------------------------------------------'
'Sub Header Textual Content'
'----------------------------------------------'
// WebUI.verifyTextPresent("This is your personal QR code!", false) // Embedded text changed 12/02/2020
// WebUI.verifyTextPresent("The code can be read by any mobile device that has QR software installed", false)
// WebUI.verifyTextPresent("link to your web page", false) // Embedded text changed 12/02/2020 // Embedded text changed 12/02/2020
// WebUI.verifyTextPresent("You can download this image and print it on to stickers, business cards and stationery", false) // Embedded text changed 12/02/2020
// WebUI.verifyTextPresent("To download your QR code, simply use your mouse to right click", false) // Embedded text changed 12/02/2020
// WebUI.verifyTextPresent("on the image and select 'Save image as' from the menu that appears", false) // Embedded text changed 12/02/2020
// WebUI.verifyTextPresent("Need A QR Code For Your Van?", false) // Embedded text changed 12/02/2020
// WebUI.verifyTextPresent("If you would like to order your own unique QR code printed on vinyl that you", false) // Embedded text changed 12/02/2020
// WebUI.verifyTextPresent("can place on your vehicle then please contact marketing@checkatrade.com or call", false) // Embedded text changed 12/02/2020
'----------------------------------------------'
'COLLAPSE'
WebUI.click(findTestObject('Object Repository/Page_Members Area/Page_Members Area/mat-panel-title_Your free QR code'))
'-----------------------------------------------------------'

///////////////////////////////////////
//                END                //
///////////////////////////////////////
