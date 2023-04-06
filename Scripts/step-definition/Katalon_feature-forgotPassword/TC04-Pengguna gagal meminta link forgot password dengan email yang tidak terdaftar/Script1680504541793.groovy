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

'Import faker library'
import com.github.javafaker.Faker as Faker
Faker faker = new Faker(new Locale('in-ID'))

'Generate random  email'
String randomEmail = faker.internet().emailAddress()

'Click Ok button'
WebUI.callTestCase(findTestCase('Test Cases/pageObject/registration-page/Click Ok button'), [:], FailureHandling.STOP_ON_FAILURE)

'Go to forgot password page'
WebUI.callTestCase(findTestCase('Test Cases/pageObject/forgotPassword-page/Go to forgot password page'), [:], FailureHandling.STOP_ON_FAILURE)

'Input email'
WebUI.callTestCase(findTestCase('Test Cases/pageObject/forgotPassword-page/Input Email'), [('email') : randomEmail], 
    FailureHandling.STOP_ON_FAILURE)

'Click kirim link button'
WebUI.callTestCase(findTestCase('Test Cases/pageObject/forgotPassword-page/Click Kirim Link button'), [:], FailureHandling.STOP_ON_FAILURE)

'Verify failed to request forgot password link'
WebUI.callTestCase(findTestCase('Test Cases/pageObject/forgotPassword-page/Verify failed to request forgot password link'), 
    [:], FailureHandling.STOP_ON_FAILURE)

