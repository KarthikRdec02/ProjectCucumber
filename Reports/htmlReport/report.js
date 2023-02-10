$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFile/MyNewProject.feature");
formatter.feature({
  "name": "",
  "description": "  to validate ubuy App",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "",
  "description": "    to validate ubuy home page",
  "keyword": "Scenario"
});
formatter.step({
  "name": "to launch chrome",
  "keyword": "Given "
});
formatter.match({
  "location": "MyproStepDefinition.to_launch_chrome()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "to launch ubuy url",
  "keyword": "And "
});
formatter.match({
  "location": "MyproStepDefinition.to_launch_ubuy_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "to clear popup",
  "keyword": "And "
});
formatter.match({
  "location": "MyproStepDefinition.to_clear_popup()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "to enter product in search box",
  "keyword": "When "
});
formatter.match({
  "location": "MyproStepDefinition.to_enter_product_in_search_box()"
});
formatter.result({
  "error_message": "org.openqa.selenium.ElementNotInteractableException: element not interactable\n  (Session info: chrome\u003d109.0.5414.120)\nBuild info: version: \u00274.6.0\u0027, revision: \u002779f1c02ae20\u0027\nSystem info: os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002718.0.2.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [63076bbbeb8438660cbeeee3e082ef8f, sendKeysToElement {id\u003d5863bf83-760e-4c55-8d06-1b8f3ccf59a2, value\u003d[Ljava.lang.CharSequence;@934b52f}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 109.0.5414.120, chrome: {chromedriverVersion: 109.0.5414.74 (e7c5703604da..., userDataDir: C:\\Users\\SANTHO~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:61494}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://localhost:61494/devtoo..., se:cdpVersion: 109.0.5414.120, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nElement: [[ChromeDriver: chrome on WINDOWS (63076bbbeb8438660cbeeee3e082ef8f)] -\u003e xpath: //div[contains(@Class,\u0027custom\u0027)]//div//form[contains(@id,\u0027search-\u0027)]]\nSession ID: 63076bbbeb8438660cbeeee3e082ef8f\r\n\tat java.base/jdk.internal.reflect.DirectConstructorHandleAccessor.newInstance(DirectConstructorHandleAccessor.java:67)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:483)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:184)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:167)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:142)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:541)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:257)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.sendKeys(RemoteWebElement.java:113)\r\n\tat java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:577)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:52)\r\n\tat jdk.proxy2/jdk.proxy2.$Proxy20.sendKeys(Unknown Source)\r\n\tat org.BaseClasscucu.BaseFrame.fillTextBox(BaseFrame.java:133)\r\n\tat www.MyProject.MyproStepDefinition.to_enter_product_in_search_box(MyproStepDefinition.java:62)\r\n\tat ✽.to enter product in search box(file:src/test/resources/FeatureFile/MyNewProject.feature:10)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "to enter the search button",
  "keyword": "And "
});
formatter.match({
  "location": "MyproStepDefinition.to_enter_the_search_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "to ensure user in correct page",
  "keyword": "And "
});
formatter.match({
  "location": "MyproStepDefinition.to_ensure_user_in_correct_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "to click the first product",
  "keyword": "When "
});
formatter.match({
  "location": "MyproStepDefinition.to_click_the_first_product()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "to switch next window",
  "keyword": "And "
});
formatter.match({
  "location": "MyproStepDefinition.to_switch_next_window()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "to ensure user is correct window",
  "keyword": "And "
});
formatter.match({
  "location": "MyproStepDefinition.to_ensure_user_is_correct_window()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "to click AddToCart button",
  "keyword": "When "
});
formatter.match({
  "location": "MyproStepDefinition.to_click_AddToCart_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "to check view cart",
  "keyword": "And "
});
formatter.match({
  "location": "MyproStepDefinition.to_check_view_cart()"
});
formatter.result({
  "status": "skipped"
});
});