import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\davidho\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Reusable_Test_Sequences\\Members_Area\\Validation\\Callback_Requests_Sub\\Callback_Requests_Notes\\20191002_160539\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCase('Test Cases/Reusable_Test_Sequences/Members_Area/Validation/Callback_Requests_Sub/Callback_Requests_Notes', new TestCaseBinding('Test Cases/Reusable_Test_Sequences/Members_Area/Validation/Callback_Requests_Sub/Callback_Requests_Notes',[:]), FailureHandling.STOP_ON_FAILURE , true, true)
    
