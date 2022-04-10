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

WebUI.openBrowser('https://www.deviantart.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Register_Page/Join_button'))

WebUI.setText(findTestObject('Register_Page/Username_input'), 'adnan')

WebUI.setText(findTestObject('Register_Page/Email_input'), 'adnan@gmail.com')

WebUI.setText(findTestObject('Register_Page/Confirmemail_input'), 'adnan@gmail.com')

WebUI.setText(findTestObject('Register_Page/Password_input'), 'p@ssword123')

WebUI.click(findTestObject('Register_Page/Month_select'))

WebUI.click(findTestObject('Register_Page/March_list'))

WebUI.click(findTestObject('Register_Page/Day_select'))

WebUI.click(findTestObject('Register_Page/2_list'))

WebUI.click(findTestObject('Register_Page/year_select'))

WebUI.click(findTestObject('Register_Page/2018_list'))

WebUI.click(findTestObject('Register_Page/submit_button'))

not_run: WebUI.verifyElementVisible(findTestObject(null))

