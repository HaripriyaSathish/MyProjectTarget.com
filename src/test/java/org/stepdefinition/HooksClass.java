package org.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.utility.BaseClass;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass  extends BaseClass{
	
	@Before
	public void openBrowser() {
		chromeBrowser();
		maxWindow();
		launchUrl("https://www.target.com/");

	}
	
	@After
	public void browserClose(Scenario s) throws IOException {
		
//		if (s.isFailed()) {
//			String name = s.getName();
//			String replace = name.replace(" ", "_");
//			takeScreenshot(replace);
//		}
		//closeBrowser();
		
		if (s.isFailed()) {
			TakesScreenshot tk = (TakesScreenshot)driver;
			byte[] screenShot = tk.getScreenshotAs(OutputType.BYTES);
			s.embed(screenShot, "image/png");
		}
	}

}
