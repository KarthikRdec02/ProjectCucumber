$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFile/AustraliaProject.feature");
formatter.feature({
  "name": "",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "",
  "description": "to validate identitydirect project",
  "keyword": "Scenario"
});
formatter.step({
  "name": "to open chrome",
  "keyword": "Given "
});
formatter.match({
  "location": "AusStepDefinition.to_open_chrome()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "to give wait and max window",
  "keyword": "And "
});
formatter.match({
  "location": "AusStepDefinition.to_give_wait_and_max_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "to open project",
  "keyword": "When "
});
formatter.match({
  "location": "AusStepDefinition.to_open_project()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "to search produt",
  "keyword": "And "
});
formatter.match({
  "location": "AusStepDefinition.to_search_produt()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "to click popup",
  "keyword": "And "
});
formatter.match({
  "location": "AusStepDefinition.to_click_popup()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "to select first product wishlist",
  "keyword": "And "
});
formatter.match({
  "location": "AusStepDefinition.to_select_first_product_wishlist()"
});
formatter.result({
  "error_message": "org.openqa.selenium.ElementClickInterceptedException: element click intercepted: Element \u003cdiv class\u003d\"jm2XV LQ8an IQP1X KCZo5\"\u003e...\u003c/div\u003e is not clickable at point (897, 592). Other element would receive the click: \u003cdiv class\u003d\"mSfFT test-product-list-item_brand\"\u003e...\u003c/div\u003e\n  (Session info: chrome\u003d109.0.5414.120)\nBuild info: version: \u00274.6.0\u0027, revision: \u002779f1c02ae20\u0027\nSystem info: os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002718.0.2.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [ba38215a4ca3ac65c1a52e27a7fdf16d, clickElement {id\u003d86a07d4b-6311-425b-99ae-245c6d5d04ee}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 109.0.5414.120, chrome: {chromedriverVersion: 109.0.5414.74 (e7c5703604da..., userDataDir: C:\\Users\\SANTHO~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:55686}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://localhost:55686/devtoo..., se:cdpVersion: 109.0.5414.120, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nElement: [[ChromeDriver: chrome on WINDOWS (ba38215a4ca3ac65c1a52e27a7fdf16d)] -\u003e xpath: //div[text()\u003d\u0027Add product to Wishlist\u0027]]\nSession ID: ba38215a4ca3ac65c1a52e27a7fdf16d\r\n\tat java.base/jdk.internal.reflect.DirectConstructorHandleAccessor.newInstance(DirectConstructorHandleAccessor.java:67)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:483)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:184)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:167)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:142)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:541)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:257)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:78)\r\n\tat org.AustraliaProject.AusStepDefinition.to_select_first_product_wishlist(AusStepDefinition.java:49)\r\n\tat ✽.to select first product wishlist(file:src/test/resources/FeatureFile/AustraliaProject.feature:9)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "to click first product",
  "keyword": "And "
});
formatter.match({
  "location": "AusStepDefinition.to_click_first_product()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "to select first product Addtocart",
  "keyword": "When "
});
formatter.match({
  "location": "AusStepDefinition.to_select_first_product_Addtocart()"
});
formatter.result({
  "status": "skipped"
});
});