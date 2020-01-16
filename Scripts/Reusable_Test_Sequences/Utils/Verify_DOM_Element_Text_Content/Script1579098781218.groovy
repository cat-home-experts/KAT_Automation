import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI




String parentObjectPath = ".//div[1]/div/div/ng-view/div[4]/div/div[7]/div/div[2]/div"
String childObjectPath = "//div[text()='textYouLookFor']"

TestObject to = new TestObject().addProperty("xpath", ConditionType.EQUALS, parentObjectPath + childObjectPath)

WebUI.verifyElementVisible(to)