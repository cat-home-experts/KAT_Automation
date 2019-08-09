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

'------------------------'
'Check DEFAULT Settings  |     TODO  value="rbYes" checked="checked"> DONE?'
'------------------------'

'Database'

'Headings'

'-------------------------------------------------------------------------------------'
'    Recommendation <OPTION> button set to Checked by default - All else is unset     '
'-------------------------------------------------------------------------------------'
//WebUI.verifyElementChecked(findTestObject('//*[@id="ctl00_content_rbRecommend_rbYes"]'), 1)  TODO
//WebUI.verifyElementChecked(findTestObject('Object Repository/Page_Checkatrade Give your feedback/Default_Selected'), 10)
//WebUI.verifyElementAttributeValue('Object Repository/Page_Checkatrade Give your feedback/Default_Selected', 'value', '"rbYes" checked="checked">', 1)
WebUI.verifyElementPresent('Object Repository/Page_Checkatrade Give your feedback/Default_Selected', 1)
//-------------------------------------------
'----------------------------------'
'YOUR EXPERIENCE - Expected Fields '
'----------------------------------'
WebUI.verifyElementText('div_1_Your experience_ 2_Your scores_3_Your details', null)
WebUI.verifyElementVisible('Object Repository/Page_Checkatrade Give your feedback/span_No')
WebUI.verifyElementVisible('Object Repository/Page_Checkatrade Give your feedback/span_Yes')
WebUI.verifyElementVisible('Object Repository/Page_Checkatrade Give your feedback/span_The agreed price')
WebUI.verifyElementVisible('Object Repository/Page_Checkatrade Give your feedback/span_I requested additional work and paid the agreed price')
WebUI.verifyElementVisible('Object Repository/Page_Checkatrade Give your feedback/span_More than the agreed price but I was kept informed')
WebUI.verifyElementVisible('Object Repository/Page_Checkatrade Give your feedback/span_More than the agreed price but I wasnt kept informed')
WebUI.verifyElementVisible('Object Repository/Page_Checkatrade Give your feedback/span_Not applicable - no estimate given')
WebUI.verifyElementVisible('Object Repository/Page_Checkatrade Give your feedback/span_The agreed price')
WebUI.verifyElementVisible('Object Repository/Page_Checkatrade Give your feedback/span_Yes')
WebUI.verifyElementVisible('Object Repository/Page_Checkatrade Give your feedback/span_No')
WebUI.verifyElementVisible('Object Repository/Page_Checkatrade Give your feedback/span_Yes')
WebUI.verifyElementVisible('Object Repository/Page_Checkatrade Give your feedback/input_No_ctl00contentButton4')
'--------------------------------------'
'YOUR EXPERIENCE - Expected Fields End |'
'--------------------------------------'

' Traders Business Name'

' Traders Location'

' Membership Term'

'-----------------'
' Textual Content |'
'-----------------'
WebUI.verifyTextPresent('Give your feedback', false)
WebUI.verifyTextPresent('Is this the business you', false)
WebUI.verifyTextPresent('re looking for?', false)
WebUI.verifyTextPresent('We will review all comments and scores about our members before publishing them, to ensure honesty and fairness', false)
WebUI.verifyTextPresent('Your experience', false)
WebUI.verifyTextPresent('Your scores', false)
WebUI.verifyTextPresent('Your details', false)
WebUI.verifyTextPresent('Further information', false)
WebUI.verifyTextPresent('Would you recommend this company?', false)
WebUI.verifyTextPresent('Compared to the estimate/quotation were you charged', false)
WebUI.verifyTextPresent('Did you know before the work started that you would be able to give feedback when the work was finished?', false)

'--------------------------'
' END                      |'
'--------------------------'


