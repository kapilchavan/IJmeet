$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/Features/SignUp.feature");
formatter.feature({
  "name": "Verify Sign Up page",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "Verify user navigates to Sign Up page",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "launch chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefination.SignUpSteps.launch_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Opens URL \"https://ijmeet.com/\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefination.SignUpSteps.opens_URL(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Check visibility of Sign Up button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefination.SignUpSteps.check_visibility_of_Sign_Up_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Sign Up button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.SignUpSteps.click_on_Sign_Up_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigate to Sign Up Page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.SignUpSteps.navigate_to_Sign_Up_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify user navigates to google account",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Click on Sign in with google account button",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefination.SignUpSteps.click_on_Sign_in_with_google_account_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigates to google account",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.SignUpSteps.navigates_to_google_account()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "Verify user navigates to Sign Up page",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "launch chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefination.SignUpSteps.launch_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Opens URL \"https://ijmeet.com/\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefination.SignUpSteps.opens_URL(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Check visibility of Sign Up button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefination.SignUpSteps.check_visibility_of_Sign_Up_button()"
});
formatter.result({
  "error_message": "org.openqa.selenium.StaleElementReferenceException: stale element reference: element is not attached to the page document\n  (Session info: chrome\u003d85.0.4183.121)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/stale_element_reference.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027KAPIL-PC\u0027, ip: \u0027192.168.0.4\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_261\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 85.0.4183.121, chrome: {chromedriverVersion: 85.0.4183.87 (cd6713ebf92fa..., userDataDir: C:\\Users\\KAPIL\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:55256}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: fb1cca17fe89ea83d0ce532e41b177d3\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.isDisplayed(RemoteWebElement.java:326)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy19.isDisplayed(Unknown Source)\r\n\tat com.ijmeet.pageobject.SignUpPage.SignUpButtonVisibility(SignUpPage.java:41)\r\n\tat stepDefination.SignUpSteps.check_visibility_of_Sign_Up_button(SignUpSteps.java:48)\r\n\tat ✽.Check visibility of Sign Up button(file:///C:/Users/KAPIL/eclipse-workspace-2020/IJmeet/./src/test/java/Features/SignUp.feature:6)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Click on Sign Up button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.SignUpSteps.click_on_Sign_Up_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Navigate to Sign Up Page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.SignUpSteps.navigate_to_Sign_Up_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Verify user navigates to facebook account",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Click on Sign in with facebook button",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefination.SignUpSteps.click_on_Sign_in_with_facebook_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "navigates to facebook login page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.SignUpSteps.navigates_to_facebook_login_page()"
});
formatter.result({
  "status": "skipped"
});
});