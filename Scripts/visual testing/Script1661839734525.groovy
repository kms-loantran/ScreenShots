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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.Rectangle

WebUI.openBrowser('')

//WebUI.setViewPortSize(480, 768)
WebUI.setViewPortSize(1920,1080)

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(findTestObject('Object Repository/screenshot/webui/Page_CURA Healthcare Service/a_Make Appointment'))

'1. loantestTakeScreenshotAsCheckpoint'
WebUI.takeScreenshotAsCheckpoint('takeScreenshot')

'2. takeElementScreenshotAsCheckpoint'
obj = findTestObject('Object Repository/screenshot/webui/Page_CURA Healthcare Service/area_login info')
WebUI.takeElementScreenshotAsCheckpoint('takeElementScreenshot', obj)

'3. takeAreaScreenshotAsCheckpoint'
area = new Rectangle(0, 0, 500, 600)
WebUI.takeAreaScreenshotAsCheckpoint('takeAreaScreenshot' , area)

'6. takeFullPageScreenshotAsCheckpoint'
WebUI.takeFullPageScreenshotAsCheckpoint('takeFullPageScreenshot.png')
