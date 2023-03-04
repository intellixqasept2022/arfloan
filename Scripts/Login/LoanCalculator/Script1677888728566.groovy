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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.ArfloanURL)

WebUI.setText(findTestObject('HomePage/input_User Name_ctl00MainContenttxtUserName'), 'gtraining')

WebUI.setEncryptedText(findTestObject('HomePage/input_Password_ctl00MainContenttxtPassword'), '2lMKB5e33hiMq1mi4J/iRg==')

WebUI.click(findTestObject('HomePage/a_Log In'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/DealerHomePage/a_Calculator'))

WebUI.setText(findTestObject('Object Repository/CalculatorPage/input__ctl00MainContenttxtLoanAmount'), '1000')

WebUI.click(findTestObject('Object Repository/CalculatorPage/a_Calculate'))

WebUI.verifyElementText(findTestObject('Object Repository/CalculatorPage/span_30'), '$ 30')

WebUI.closeBrowser()

