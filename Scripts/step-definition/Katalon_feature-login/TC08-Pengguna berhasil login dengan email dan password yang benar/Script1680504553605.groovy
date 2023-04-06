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

'Click ok button'
WebUI.callTestCase(findTestCase('Test Cases/pageObject/registration-page/Click Ok button'), [:], FailureHandling.STOP_ON_FAILURE)

'Input email'
WebUI.callTestCase(findTestCase('Test Cases/pageObject/login-page/Input Email'), [('email') : 'shidqiadiatma@dispostable.com'], 
    FailureHandling.STOP_ON_FAILURE)

'Input password'
WebUI.callTestCase(findTestCase('Test Cases/pageObject/login-page/Input Password'), [('password') : 'passwordBenar12*'], 
    FailureHandling.STOP_ON_FAILURE)

'Click masuk button'
WebUI.callTestCase(findTestCase('Test Cases/pageObject/login-page/Click Masuk button'), [:], FailureHandling.STOP_ON_FAILURE)

'Verify success login user'
WebUI.callTestCase(findTestCase('Test Cases/pageObject/login-page/Verify success login user'), [:], FailureHandling.STOP_ON_FAILURE)

