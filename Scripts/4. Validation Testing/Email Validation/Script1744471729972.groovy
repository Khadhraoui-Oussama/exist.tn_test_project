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

WebUI.navigateToUrl('https://www.exist.com.tn/')

WebUI.click(findTestObject('Object Repository/4. Validation Testing/Email Validation/Page_Exist, vente en ligne vtement pour hom_b8fd83/div_Mon compte'))

WebUI.click(findTestObject('Object Repository/4. Validation Testing/Email Validation/Page_Exist, vente en ligne vtement pour hom_b8fd83/span_Connexion'))

WebUI.setText(findTestObject('Object Repository/4. Validation Testing/Email Validation/Page_Connexion/input_E-mail_email'), 
    'thisisnot_email.com')

WebUI.setEncryptedText(findTestObject('Object Repository/4. Validation Testing/Email Validation/Page_Connexion/input_Mot de passe_password'), 
    'nwr9I1qT+J0GbQ++JlYjHw==')

WebUI.click(findTestObject('Object Repository/4. Validation Testing/Email Validation/Page_Connexion/button_Connexion'))

WebUI.closeBrowser()

