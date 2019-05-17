import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

WebUI.callTestCase(findTestCase('login_user'), [('url') : GlobalVariable.url, ('username') : findTestData('user_credentials').getValue(
            1, 1), ('password') : findTestData('user_credentials').getValue(2, 1)], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('dropdown_button'))

WebUI.delay(3)

WebUI.click(findTestObject('gists_menu'))

WebUI.setText(findTestObject('Object Repository/Page_Create a new Gist/input_See all of your gists_gistcontentsname'), findTestData(
        'gists_data').getValue(1, 1))

WebUI.click(findTestObject('Object Repository/Page_Create a new Gist/pre_'))

WebUI.setText(findTestObject('Object Repository/Page_Create a new Gist/div_1input your gist here'), 'test shopee qa engineering')

WebUI.click(findTestObject('Object Repository/Page_Create a new Gist/button_Create public gist'))

WebUI.delay(3)

WebUI.callTestCase(findTestCase('list_existing_gists'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('edit_existing_gists'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_file 1c/button_Delete'))

WebUI.acceptAlert()

