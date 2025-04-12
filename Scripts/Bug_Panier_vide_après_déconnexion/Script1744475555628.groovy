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

// Open Browser and navigate to the login page
WebUI.openBrowser('')
WebUI.navigateToUrl('https://www.exist.com.tn/connexion?back=my-account')

// Log in with valid credentials
WebUI.setText(findTestObject('Object Repository/Bug_Panier_vide_après_déconnexion/Page_Connexion/input_E-mail_email'), 'ilyesmaya8@gmail.com')
WebUI.setEncryptedText(findTestObject('Object Repository/Bug_Panier_vide_après_déconnexion/Page_Connexion/input_Mot de passe_password'), 'nwr9I1qT+J0GbQ++JlYjHw==')
WebUI.click(findTestObject('Object Repository/Bug_Panier_vide_après_déconnexion/Page_Connexion/button_Connexion'))

// Search for a product (e.g., "montre")
WebUI.setText(findTestObject('Object Repository/Bug_Panier_vide_après_déconnexion/Page_Mon compte/input__s'), 'montre')
WebUI.click(findTestObject('Object Repository/Bug_Panier_vide_après_déconnexion/Page_Mon compte/button_Rechercher'))

// Select the first product and add it to the cart
WebUI.click(findTestObject('Object Repository/Bug_Panier_vide_après_déconnexion/Page_Recherche/img'))
WebUI.click(findTestObject('Object Repository/Bug_Panier_vide_après_déconnexion/Page_Montre/button_Ajouter au panier'))

// Continue shopping
WebUI.click(findTestObject('Object Repository/Bug_Panier_vide_après_déconnexion/Page_Montre/button_Continuer mes achats'))

// Log out
WebUI.click(findTestObject('Object Repository/Bug_Panier_vide_après_déconnexion/Page_Montre/a_Dconnexion'))

// Verify if the cart is empty after logout
WebUI.click(findTestObject('Object Repository/Bug_Panier_vide_après_déconnexion/Page_Montre/i_shopping_cart'))

// Close the browser
WebUI.closeBrowser()
