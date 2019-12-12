package utiliities
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

import com.kms.katalon.core.exception.StepErrorException as StepErrorException
import com.kms.katalon.core.util.KeywordUtil

class Directives {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I want to write a step with (.*)")
	def I_want_to_write_a_step_with_name(String name) {
		println name
	}

	@When("I check for the (\\d+) in step")
	def I_check_for_the_value_in_step(int value) {
		println value
	}

	@Then("I verify the (.*) in step")
	def I_verify_the_status_in_step(String status) {
		println status
	}
}

//public class mytools
//	{  static void FORCESTOP()
//		{    throw new StepErrorException("FORCEDSTOP")
//		}
//	}
//public class SwitchExample {
//		def int XCOORD, def int YCOORD
//		static main() {
//
//			switch (GlobalVariable.row) {
//				case 1: XCOORD = 200; YCOORD = 400; break
//				case 2: XCOORD = 300; YCOORD = 500; break
//				case 3: XCOORD = 400; YCOORD = 600; break
//				case 4: XCOORD = 500; YCOORD = 700; break
//				case 5: XCOORD = 600; YCOORD = 800; break
//				case 6: XCOORD = 700; YCOORD = 900; break
//				case 7: XCOORD = 800; YCOORD = 1000; break
//				case 8: XCOORD = 900; YCOORD = 1100; break
//				case 9: XCOORD = 1000; YCOORD = 1200; break
//				case 10:XCOORD = 1100; YCOORD = 1300; break
//				default: break }
//		   }
//		return XCOORD, YCOORD
//	}
