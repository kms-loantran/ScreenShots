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
import org.openqa.selenium.Keys as Keys
import java.awt.Color
import org.openqa.selenium.Rectangle



Mobile.startApplication('/Users/loantran/Documents/Katalon/Script/exercise/Mobile/Integrations/Apps/iPad/Coffee Timer.ipa', 
    true)



'1. takeScreenshot()'
//List hidenObjs = [
//	findTestObject('Object Repository/screenshot/iOS/XCUIElementTypeStaticText - Teas'),
//	findTestObject('Object Repository/screenshot/iOS/XCUIElementTypeStaticText - Oolong'),
//	findTestObject('Object Repository/screenshot/android/android.widget.TextView - Graphics')
//	]
//
//Mobile.takeScreenshot()  //a screenshot will be added to the report folder with name like '1606194325481.png'
//
//Mobile.takeScreenshotAsCheckpoint('loan test takeScreenshotAsCheckpoint', hidenObjs, Color.GREEN, FailureHandling.STOP_ON_FAILURE)
//		//a screenshot named 'keyes-loan test takeScreenshotAsCheckpoint.png' will be added into subfolder 'keyeys' under report folder
//
//Mobile.takeScreenshotAsCheckpoint('/Users/loantran/Documents/loan test screeenshot/loan test takeScreenshotAsCheckpoint.jpg', hidenObjs, Color.GREEN, FailureHandling.STOP_ON_FAILURE)
//		//a screenshot named 'keyes-loantest.jpg.png' will be added to folder /Users/loantran/Documents/loan test screeenshot
//		//hiden objects will be covered by green color
//
//String screenshotPath = Mobile.takeScreenshotAsCheckpoint('',[])     //a screenshot named 'keyes-.png' will be added to keyeyes subfolder under reprot folder
//println 'loan testtttttttttt: ' + screenshotPath




'2. takeElementScreenshot'

obj = findTestObject('Object Repository/screenshot/iOS/XCUIElementTypeStaticText - Mexican')

List hidenObjs = [
	findTestObject('Object Repository/screenshot/iOS/XCUIElementTypeStaticText - Teas'),
	findTestObject('Object Repository/screenshot/iOS/XCUIElementTypeStaticText - Oolong'),
	findTestObject('Object Repository/screenshot/android/android.widget.TextView - Graphics')
	]
Mobile.takeElementScreenshot(obj)

path = Mobile.takeElementScreenshot('loan test takeElementScreenshot', obj)
println 'loan testtttttttttttt: ' + path

Mobile.takeElementScreenshot('/Users/loantran/Documents/loan screeenshot/loan takeElementScreenshot.png', obj, hidenObjs, Color.PINK, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeElementScreenshot(null, FailureHandling.CONTINUE_ON_FAILURE)



'3. takeElementScreenshotAsCheckpoint'
//obj = findTestObject('Object Repository/screenshot/iOS/XCUIElementTypeStaticText - Mexican')
//
//List hidenObjs = [
//	findTestObject('Object Repository/screenshot/iOS/XCUIElementTypeStaticText - Teas'),
//	findTestObject('Object Repository/screenshot/iOS/XCUIElementTypeStaticText - Oolong'),
//	findTestObject('Object Repository/screenshot/android/android.widget.TextView - Graphics')
//	]
//
//Mobile.takeElementScreenshotAsCheckpoint('loan test takeElementScreenshotAsCheckpoint111', obj)
//
//Mobile.takeElementScreenshotAsCheckpoint('loan test takeElementScreenshotAsCheckpoint2222', obj, hidenObjs, Color.YELLOW, FailureHandling.OPTIONAL)
//
//String path111 = Mobile.takeElementScreenshotAsCheckpoint('/Users/loantran/Documents/loan test screeenshot/loan test takeElementScreenshotAsCheckpoint.png', obj, hidenObjs, Color.BLUE, FailureHandling.OPTIONAL)
//println 'loan testttttt11111: ' + path111
//
//String path222 = Mobile.takeElementScreenshotAsCheckpoint('', obj, hidenObjs, Color.BLUE)
//println 'loan testttttt22222: ' + path222



'4. takeAreaScreenshot'
//area = new Rectangle(0, 0, 500, 600)
//
//Mobile.takeAreaScreenshot(area)
//
//Mobile.takeAreaScreenshot('loan teest takeAreaScreenshottttttt', area)
//
//Mobile.takeAreaScreenshot('/Users/loantran/Documents/loan screenshot/loan teest11111.png', area)
//
//Mobile.takeAreaScreenshot('/Users/loantran/Documents/loan screeenshot/loan teest takeAreaScreenshot.png', area)
//
//invlidArea = new Rectangle(0, 0, 00, 00)
//path = Mobile.takeAreaScreenshot('loan teest222222.png', invlidArea, FailureHandling.CONTINUE_ON_FAILURE)
//println 'loan testttttttttttttttt: ' + path
//
//
//List hidenObjs = [
//	findTestObject('Object Repository/screenshot/iOS/XCUIElementTypeStaticText - Teas'),
//	findTestObject('Object Repository/screenshot/iOS/XCUIElementTypeStaticText - Oolong'),
//	findTestObject('Object Repository/screenshot/android/android.widget.TextView - Graphics')
//	]
//
//Mobile.takeAreaScreenshot('/Users/loantran/Documents/loan screenshot/loan teest333333333.png', area, hidenObjs, Color.WHITE)


Mobile.closeApplication()

