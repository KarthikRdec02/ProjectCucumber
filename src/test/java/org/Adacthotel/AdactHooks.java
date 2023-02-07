package org.Adacthotel;

import org.BaseClasscucu.BaseFrame;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class AdactHooks extends BaseFrame {
	@Before
	public void beforeScenario() {
		openChromeBrowser();
		maxWindow();
		Implicitwait(10);
		System.out.println("starts before");
	}

	@After
	public void afterScenario() {
		// closeCurrentTab();
		System.out.println("Scenario ends");
	}

}
