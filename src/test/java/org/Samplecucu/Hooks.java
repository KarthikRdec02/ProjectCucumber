package org.Samplecucu;

import org.BaseClasscucu.BaseFrame;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseFrame {
	@Before
public void beforeScenario() {
		openChromeBrowser();
		Implicitwait(10);
		System.out.println("starts before");
}
	@After
	public void afterScenario(Scenario s ) {
		if (s.isFailed()) {
			TakesScreenshot tk=(TakesScreenshot)driver;
			byte[] screenshotAs = tk.getScreenshotAs(OutputType.BYTES);
			s.embed(screenshotAs, "image/png");
		}
	}

}
