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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.preview.checkatrade.com/')

WebUI.click(findTestObject('Page_Checkatrade Find a tradesperson you can trust/div_close'))

WebUI.click(findTestObject('Page_Checkatrade Find a tradesperson you can trust/a_Give feedback                                on a trade youve used'))

WebUI.setText(findTestObject('Object Repository/Feedback_Non_Recommend/Page_Checkatrade Give your feedback/input_Which member do you want to review_feedback-form__company_autocomplete_input'), 
    'test')

WebUI.click(findTestObject('Object Repository/Feedback_Non_Recommend/Page_Checkatrade Give your feedback/span_Chichester'))

WebUI.click(findTestObject('Object Repository/Feedback_Non_Recommend/Page_Checkatrade Give your feedback/span_No'))

WebUI.click(findTestObject('Object Repository/Feedback_Non_Recommend/Page_Checkatrade Give your feedback/span_No'))

WebUI.selectOptionByValue(findTestObject('Feedback_Non_Recommend/Page_Checkatrade Give your feedback/select_Please Select ShortForm'), 
    '38', true)

WebUI.selectOptionByValue(findTestObject('Feedback_Non_Recommend/Page_Checkatrade Give your feedback/select_Please Select ShortForm'), 
    '34', true)

WebUI.selectOptionByValue(findTestObject('Feedback_Non_Recommend/Page_Checkatrade Give your feedback/select_Please Select ShortForm'), 
    '35', true)

WebUI.selectOptionByValue(findTestObject('Feedback_Non_Recommend/Page_Checkatrade Give your feedback/select_Please Select ShortForm'), 
    '41', true)

WebUI.selectOptionByValue(findTestObject('Feedback_Non_Recommend/Page_Checkatrade Give your feedback/select_Please Select ShortForm'), 
    '36', true)

WebUI.click(findTestObject('Object Repository/Feedback_Non_Recommend/Page_Checkatrade Give your feedback/span_Yes (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Feedback_Non_Recommend/Page_Checkatrade Give your feedback/select_Please Select ---Order DisagreementMis-InformedMis-LeadInvoice not receivedTidinessReliabilityTimekeepingCommunication IssuesCall Out ChargeOverchargingNo guaranteewarrantyAftercareCourtesyAttitudePoor workmanship'), 
    '32', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Feedback_Non_Recommend/Page_Checkatrade Give your feedback/select_Please Select ---Order DisagreementMis-InformedMis-LeadInvoice not receivedTidinessReliabilityTimekeepingCommunication IssuesCall Out ChargeOverchargingNo guaranteewarrantyAftercareCourtesyAttitudePoor workmanship'), 
    '33', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Feedback_Non_Recommend/Page_Checkatrade Give your feedback/select_Please Select ---Order DisagreementMis-InformedMis-LeadInvoice not receivedTidinessReliabilityTimekeepingCommunication IssuesCall Out ChargeOverchargingNo guaranteewarrantyAftercareCourtesyAttitudePoor workmanship'), 
    '37', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Feedback_Non_Recommend/Page_Checkatrade Give your feedback/select_Please Select ---Order DisagreementMis-InformedMis-LeadInvoice not receivedTidinessReliabilityTimekeepingCommunication IssuesCall Out ChargeOverchargingNo guaranteewarrantyAftercareCourtesyAttitudePoor workmanship'), 
    '39', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Feedback_Non_Recommend/Page_Checkatrade Give your feedback/select_Please Select ---Order DisagreementMis-InformedMis-LeadInvoice not receivedTidinessReliabilityTimekeepingCommunication IssuesCall Out ChargeOverchargingNo guaranteewarrantyAftercareCourtesyAttitudePoor workmanship'), 
    '40', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Feedback_Non_Recommend/Page_Checkatrade Give your feedback/select_Please Select ---Order DisagreementMis-InformedMis-LeadInvoice not receivedTidinessReliabilityTimekeepingCommunication IssuesCall Out ChargeOverchargingNo guaranteewarrantyAftercareCourtesyAttitudePoor workmanship'), 
    '42', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Feedback_Non_Recommend/Page_Checkatrade Give your feedback/select_Please Select ---Order DisagreementMis-InformedMis-LeadInvoice not receivedTidinessReliabilityTimekeepingCommunication IssuesCall Out ChargeOverchargingNo guaranteewarrantyAftercareCourtesyAttitudePoor workmanship'), 
    '29', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Feedback_Non_Recommend/Page_Checkatrade Give your feedback/select_Please Select ---Order DisagreementMis-InformedMis-LeadInvoice not receivedTidinessReliabilityTimekeepingCommunication IssuesCall Out ChargeOverchargingNo guaranteewarrantyAftercareCourtesyAttitudePoor workmanship'), 
    '30', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Feedback_Non_Recommend/Page_Checkatrade Give your feedback/select_Please Select ---Order DisagreementMis-InformedMis-LeadInvoice not receivedTidinessReliabilityTimekeepingCommunication IssuesCall Out ChargeOverchargingNo guaranteewarrantyAftercareCourtesyAttitudePoor workmanship'), 
    '28', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Feedback_Non_Recommend/Page_Checkatrade Give your feedback/select_Please Select ---Order DisagreementMis-InformedMis-LeadInvoice not receivedTidinessReliabilityTimekeepingCommunication IssuesCall Out ChargeOverchargingNo guaranteewarrantyAftercareCourtesyAttitudePoor workmanship'), 
    '24', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Feedback_Non_Recommend/Page_Checkatrade Give your feedback/select_Please Select ---Order DisagreementMis-InformedMis-LeadInvoice not receivedTidinessReliabilityTimekeepingCommunication IssuesCall Out ChargeOverchargingNo guaranteewarrantyAftercareCourtesyAttitudePoor workmanship'), 
    '25', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Feedback_Non_Recommend/Page_Checkatrade Give your feedback/select_Please Select ---Order DisagreementMis-InformedMis-LeadInvoice not receivedTidinessReliabilityTimekeepingCommunication IssuesCall Out ChargeOverchargingNo guaranteewarrantyAftercareCourtesyAttitudePoor workmanship'), 
    '31', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Feedback_Non_Recommend/Page_Checkatrade Give your feedback/select_Please Select ---Order DisagreementMis-InformedMis-LeadInvoice not receivedTidinessReliabilityTimekeepingCommunication IssuesCall Out ChargeOverchargingNo guaranteewarrantyAftercareCourtesyAttitudePoor workmanship'), 
    '22', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Feedback_Non_Recommend/Page_Checkatrade Give your feedback/select_Please Select ---Order DisagreementMis-InformedMis-LeadInvoice not receivedTidinessReliabilityTimekeepingCommunication IssuesCall Out ChargeOverchargingNo guaranteewarrantyAftercareCourtesyAttitudePoor workmanship'), 
    '23', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Feedback_Non_Recommend/Page_Checkatrade Give your feedback/select_Please Select ---Order DisagreementMis-InformedMis-LeadInvoice not receivedTidinessReliabilityTimekeepingCommunication IssuesCall Out ChargeOverchargingNo guaranteewarrantyAftercareCourtesyAttitudePoor workmanship'), 
    '19', true)

WebUI.closeBrowser()

