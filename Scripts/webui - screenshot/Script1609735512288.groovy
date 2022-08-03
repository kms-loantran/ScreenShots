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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(findTestObject('Object Repository/screenshot/webui/Page_CURA Healthcare Service/a_Make Appointment'))


'1. loantestTakeScreenshotAsCheckpoint'

String pathtttttttttttttt = WebUI.takeScreenshotAsCheckpoint('vicky111 takeScreenshotAsCheckpoint')
//
//println 'loan test takeScreenshot: ' + pathtttttttttttttt
//
//WebUI.takeScreenshotAsCheckpoint(null, FailureHandling.OPTIONAL)
//
//hiddenObjs = [
//	findTestObject('Object Repository/screenshot/webui/Page_CURA Healthcare Service/btnLogin'),	
//	findTestObject('Object Repository/screenshot/webui/Page_CURA Healthcare Service/txtUsername'),
//	findTestObject('Object Repository/screenshot/webui/Page_CURA Healthcare Service/txtPassword'),
//	findTestObject('Object Repository/screenshot/android/android.widget.TextView - Graphics')
//]
//
//String checkPointName = '/Users/loantran/Documents/loan Test Screen Shot/'
//WebUI.takeScreenshotAsCheckpoint(checkPointName + 'loan test takeScreenshotAsCheckpoint 111', hiddenObjs)
//
//String loanPath = WebUI.takeScreenshotAsCheckpoint(checkPointName + 'loan test takeScreenshotAsCheckpoint 222', hiddenObjs, Color.RED, FailureHandling.STOP_ON_FAILURE )
//println 'loan test pathhhhhhhhhhhhhhhh: ' + loanPath


'2. takeElementScreenshotAsCheckpoint'

obj = findTestObject('Object Repository/screenshot/webui/Page_CURA Healthcare Service/area_login info')

String path1 = WebUI.takeElementScreenshotAsCheckpoint('vicky111 takeElementScreenshotAsCheckpoint', obj)
//
//println 'loan test element screenshottttttttttttttttt: ' + path1
//
//WebUI.takeElementScreenshotAsCheckpoint('loan test element screenshot 111111111', null, FailureHandling.OPTIONAL)
//
//invalidObj = findTestObject('Object Repository/screenshot/android/android.widget.TextView - Graphics')
//WebUI.takeElementScreenshotAsCheckpoint('loan test element screenshot 222222222', invalidObj, FailureHandling.OPTIONAL)
//
//hiddenObjs = [
//	findTestObject('Object Repository/screenshot/webui/Page_CURA Healthcare Service/btnLogin'),
//	findTestObject('Object Repository/screenshot/webui/Page_CURA Healthcare Service/txtUsername'),
//	findTestObject('Object Repository/screenshot/webui/Page_CURA Healthcare Service/txtPassword'),
//	findTestObject('Object Repository/screenshot/android/android.widget.TextView - Graphics')
//]
//
//String checkPointName = '/Users/loantran/Documents/loan Test Screen Shot/'
//WebUI.takeElementScreenshotAsCheckpoint(checkPointName + 'loan test takeElementScreenshotAsCheckpoint 333', obj, hiddenObjs)
//
//String loanPath = WebUI.takeElementScreenshotAsCheckpoint(checkPointName + 'loan test takeElementScreenshotAsCheckpoint 4444', obj, hiddenObjs, Color.RED, FailureHandling.STOP_ON_FAILURE )
//println 'loan test pathhhhhhhhhhhhhhhh: ' + loanPath


'3. takeAreaScreenshotAsCheckpoint'

area = new Rectangle(0, 0, 500, 600)

String path111 = WebUI.takeAreaScreenshotAsCheckpoint('vicky111 takeAreaScreenshotAsCheckpoint' , area)
//println 'loan test 1111111111111: ' + path111
//
//WebUI.takeAreaScreenshotAsCheckpoint('loan test area screenshot as checkpoint 111111111', null, FailureHandling.OPTIONAL)
//
//invalidArea = new Rectangle(0, 0, 0, 0)
//WebUI.takeAreaScreenshotAsCheckpoint('loan test area screenshot as checkpoint 222222222', invalidArea, FailureHandling.OPTIONAL)
//
//hiddenObjs = [
//	findTestObject('Object Repository/screenshot/webui/Page_CURA Healthcare Service/btnLogin'),
//	findTestObject('Object Repository/screenshot/webui/Page_CURA Healthcare Service/txtUsername'),
//	findTestObject('Object Repository/screenshot/webui/Page_CURA Healthcare Service/txtPassword'),
//	findTestObject('Object Repository/screenshot/android/android.widget.TextView - Graphics')
//]
//
//String checkPointName = '/Users/loantran/Documents/loan Test Screen Shot/'
//WebUI.takeAreaScreenshotAsCheckpoint(checkPointName + 'loan test takeAreaScreenshotAsCheckpoint 33333', area, hiddenObjs)
//
//String loanPath = WebUI.takeAreaScreenshotAsCheckpoint(checkPointName + 'loan test takeAreaScreenshotAsCheckpoint 44444', area, hiddenObjs, Color.GREEN, FailureHandling.STOP_ON_FAILURE )
//println 'loan test pathhhhhhhhhhhhhhhh: ' + loanPath


'4. takeElementScreenshot'
obj = findTestObject('Object Repository/screenshot/webui/Page_CURA Healthcare Service/area_login info')

WebUI.takeElementScreenshot('loan test takeElementScreenshot 000.png', obj)
//
//String path2 = WebUI.takeElementScreenshot(obj)
//
//println 'loan test element screenshottttttttttttttttt: ' + path2
//
//WebUI.takeElementScreenshot('loan test element screenshot 111111111', null, FailureHandling.OPTIONAL)
//
//invalidObj = findTestObject('Object Repository/screenshot/android/android.widget.TextView - Graphics')
//WebUI.takeElementScreenshot('loan test element screenshot 222222222', invalidObj, FailureHandling.OPTIONAL)
//
//hiddenObjs = [
//	findTestObject('Object Repository/screenshot/webui/Page_CURA Healthcare Service/btnLogin'),
//	findTestObject('Object Repository/screenshot/webui/Page_CURA Healthcare Service/txtUsername'),
//	findTestObject('Object Repository/screenshot/webui/Page_CURA Healthcare Service/txtPassword'),
//	findTestObject('Object Repository/screenshot/android/android.widget.TextView - Graphics')
//]
//
//String checkPointName = '/Users/loantran/Documents/loan Test Screen Shot/'
//WebUI.takeElementScreenshot(checkPointName + 'loan test takeElementScreenshot 333.jpeg', obj, hiddenObjs)
//
//String loanPath = WebUI.takeElementScreenshot(checkPointName + 'loan test takeElementScreenshot 4444.png', obj, hiddenObjs, Color.RED, FailureHandling.STOP_ON_FAILURE )
//println 'loan test pathhhhhhhhhhhhhhhh: ' + loanPath

'5. takeAreaScreenshot'

area = new Rectangle(0, 0, 500, 600)

WebUI.takeAreaScreenshot(area)

//
//String path2 = WebUI.takeAreaScreenshot('loan test area screenshot 000000' , area)
//println 'loan test 1111111111111: ' + path2
//
//WebUI.takeAreaScreenshot('loan test area screenshot 111111111', null, FailureHandling.OPTIONAL)
//
//invalidArea = new Rectangle(0, 0, 0, 0)
//WebUI.takeAreaScreenshot('loan test area screenshot 222222222', invalidArea, FailureHandling.OPTIONAL)
//
//hiddenObjs = [
//	findTestObject('Object Repository/screenshot/webui/Page_CURA Healthcare Service/btnLogin'),
//	findTestObject('Object Repository/screenshot/webui/Page_CURA Healthcare Service/txtUsername'),
//	findTestObject('Object Repository/screenshot/webui/Page_CURA Healthcare Service/txtPassword'),
//	findTestObject('Object Repository/screenshot/android/android.widget.TextView - Graphics')
//]
//
//String checkPointName = '/Users/loantran/Documents/loan Test Screen Shot/'
//WebUI.takeAreaScreenshot(checkPointName + 'loan test takeAreaScreenshot 33333.png', area, hiddenObjs)
//
//String loanPath = WebUI.takeAreaScreenshot(checkPointName + 'loan test takeAreaScreenshot 44444.jpeg', area, hiddenObjs, Color.GREEN, FailureHandling.STOP_ON_FAILURE )
//println 'loan test pathhhhhhhhhhhhhhhh: ' + loanPath


'6. takeFullPageScreenshotAsCheckpoint'

WebUI.takeFullPageScreenshotAsCheckpoint('vicky111 takeFullPageScreenshotAsCheckpoint.png')
println 'loan test element screenshottttttttttttttttt: ' 
//
//hiddenObjs = [
//	findTestObject('Object Repository/screenshot/webui/Page_CURA Healthcare Service/btnLogin'),
//	findTestObject('Object Repository/screenshot/webui/Page_CURA Healthcare Service/txtUsername'),
//	findTestObject('Object Repository/screenshot/android/android.widget.TextView - Graphics')
//]
//
//String checkPointName = '/Users/loantran/Documents/loan Test Screen Shot/'
//
//WebUI.takeFullPageScreenshotAsCheckpoint(checkPointName + 'loan test takeElementScreenshot 222.jpeg', hiddenObjs)
//
//WebUI.takeFullPageScreenshotAsCheckpoint(checkPointName + 'loan test takeElementScreenshot 333.jpeg', hiddenObjs, Color.RED, FailureHandling.STOP_ON_FAILURE)
//
//
//
//WebUI.setText(findTestObject('Object Repository/screenshot/webui/Page_CURA Healthcare Service/txtUsername'), 
//    'John Doe')
//WebUI.setEncryptedText(findTestObject('Object Repository/screenshot/webui/Page_CURA Healthcare Service/txtPassword'), 
//    'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')
//WebUI.click(findTestObject('Object Repository/screenshot/webui/Page_CURA Healthcare Service/btnLogin'))
//WebUI.click(findTestObject('screenshot/webui/Page_CURA Healthcare Service/btnBookAppointment'))
//
//hiddenObjs1 = [
//	findTestObject('Object Repository/screenshot/webui/Page_CURA Healthcare Service/txtComment'),
//	findTestObject('Object Repository/screenshot/webui/Page_CURA Healthcare Service/txtUsername'),
//	findTestObject('Object Repository/screenshot/android/android.widget.TextView - Graphics')
//]
//
//
//ignoredObjs1 = [
//	findTestObject('Object Repository/screenshot/webui/Page_CURA Healthcare Service/calendar')
//]
//
//WebUI.takeFullPageScreenshotAsCheckpoint(checkPointName + 'loan test takeElementScreenshot 444', null, Color.RED, ignoredObjs1, FailureHandling.STOP_ON_FAILURE )
//
//
//String loanPath = WebUI.takeFullPageScreenshotAsCheckpoint(checkPointName + 'loan test takeElementScreenshot 555.png', hiddenObjs1, Color.RED, ignoredObjs1, FailureHandling.STOP_ON_FAILURE )
//println 'loan test pathhhhhhhhhhhhhhhh: ' + loanPath


'7. takeFullPageScreenshot'

WebUI.takeFullPageScreenshot()

WebUI.takeFullPageScreenshot('loan test takeFullPageScreenshot 111.png')

//println 'loan test element screenshottttttttttttttttt: '
//
//hiddenObjs = [
//	findTestObject('Object Repository/screenshot/webui/Page_CURA Healthcare Service/ico-user'),
//	findTestObject('Object Repository/screenshot/webui/Page_CURA Healthcare Service/ico-lock'),
//	findTestObject('Object Repository/screenshot/android/android.widget.TextView - Graphics')
//]
//
//String checkPointName = '/Users/loantran/Documents/loan Test Screen Shot/'
//
//WebUI.takeFullPageScreenshot(checkPointName + 'loan test takeElementScreenshot 222.jpeg', hiddenObjs)
//
//WebUI.takeFullPageScreenshot(checkPointName + 'loan test takeElementScreenshot 333.jpeg', hiddenObjs, Color.RED, FailureHandling.STOP_ON_FAILURE)
//
//
//
//WebUI.setText(findTestObject('Object Repository/screenshot/webui/Page_CURA Healthcare Service/txtUsername'),
//	'John Doe')
//WebUI.setEncryptedText(findTestObject('Object Repository/screenshot/webui/Page_CURA Healthcare Service/txtPassword'),
//	'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')
//WebUI.click(findTestObject('Object Repository/screenshot/webui/Page_CURA Healthcare Service/btnLogin'))
//WebUI.click(findTestObject('screenshot/webui/Page_CURA Healthcare Service/btnBookAppointment'))
//
//hiddenObjs1 = [
//	findTestObject('Object Repository/screenshot/webui/Page_CURA Healthcare Service/txtComment'),
//	findTestObject('Object Repository/screenshot/webui/Page_CURA Healthcare Service/txtUsername'),
//	findTestObject('Object Repository/screenshot/android/android.widget.TextView - Graphics')
//]
//
//ignoredObjs1 = [
//	findTestObject('Object Repository/screenshot/webui/Page_CURA Healthcare Service/calendar')
//]
//
//WebUI.takeFullPageScreenshot(checkPointName + 'loan test takeElementScreenshot 444', null, Color.RED, ignoredObjs1, FailureHandling.STOP_ON_FAILURE )
//
//
//String loanPath = WebUI.takeFullPageScreenshot(checkPointName + 'loan test takeElementScreenshot 555.png', hiddenObjs1, Color.RED, ignoredObjs1, FailureHandling.STOP_ON_FAILURE )
//println 'loan test pathhhhhhhhhhhhhhhh: ' + loanPath



WebUI.closeBrowser()

