import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication('C:\\Users\\ALVARO ANDRES\\Desktop\\EriBank_1.0.apk', true)

Mobile.setText(findTestObject('android.widget.EditText0 - Username'), 'company', 0)

Mobile.setText(findTestObject('android.widget.EditText1 - Password'), 'company', 0)

Mobile.tap(findTestObject('android.widget.Button0 - Login'), 0)

Mobile.tap(findTestObject('android.widget.Button0 - Make Payment'), 0)

Mobile.setText(findTestObject('android.widget.EditText0 - Phone'), '3043758194', 0)

Mobile.setText(findTestObject('android.widget.EditText1 - Name'), 'Alvaro Loaiza', 0)

Mobile.setText(findTestObject('android.widget.EditText2 - Amount'), '10', 0)

Mobile.tap(findTestObject('android.widget.Button0 - Select'), 0)

Mobile.tap(findTestObject('android.widget.TextView7 - New Zealand'), 0)

Mobile.tap(findTestObject('android.widget.Button1 - Send Payment'), 0)

Mobile.tap(findTestObject('android.widget.Button0 - Yes'), 0)

Mobile.tap(findTestObject('android.widget.Button1 - Mortgage Request'), 0)

Mobile.setText(findTestObject('android.widget.EditText0 - First Name'), 'Carlos', 0)

Mobile.setText(findTestObject('android.widget.EditText1 - Last Name'), 'Pareja', 0)

Mobile.setText(findTestObject('android.widget.EditText2 - Age'), '21', 0)

Mobile.setText(findTestObject('android.widget.EditText3 - Address 1'), 'Calle 12 # 34-76', 0)

Mobile.setText(findTestObject('android.widget.EditText4 - Address 2'), 'carrera 26 # 34-56', 0)

Mobile.tap(findTestObject('android.widget.Button0 - Select (1)'), 0)

Mobile.tap(findTestObject('android.widget.TextView13 - France'), 0)

Mobile.tap(findTestObject('android.widget.Button1 - Next'), 0)

Mobile.tap(findTestObject('android.widget.CheckedTextView3 - Education'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('android.widget.Button2 - Cancel'), 0)

Mobile.tap(findTestObject('android.widget.Button2 - Expense Report'), 0)

Mobile.tap(findTestObject('android.widget.Button0 - Add'), 0)

Mobile.tap(findTestObject('android.widget.TextView4 - Expense  2'), 0)

Mobile.tap(findTestObject('android.widget.Button1 - Back'), 0)

Mobile.tap(findTestObject('android.widget.Button3 - Logout'), 0)

Mobile.closeApplication()

