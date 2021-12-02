package org.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.codeborne.selenide.WebDriverRunner;

import static com.codeborne.selenide.Selenide.*;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebDriverRunnerTest {

	@Test
	public void myTest() {

		open("https://opensource-demo.orangehrmlive.com/");

		WebDriverRunner.clearBrowserCache();
		System.out.println(WebDriverRunner.url());
		Assert.assertTrue(WebDriverRunner.url().contains("orangehrmlive"));

		// System.out.println(WebDriverRunner.source());

		WebDriverRunner.getWebDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		System.out.println(WebDriverRunner.isChrome());

		if (WebDriverRunner.isChrome()) {
			System.out.println("click on button");
		}

		WebDriverRunner.getAndCheckWebDriver();

		System.out.println(WebDriverRunner.supportsJavascript());

		List<File> fileList = WebDriverRunner.getBrowserDownloadsFolder().files();
		
		System.out.println(fileList.size());//0
		
		WebDriverRunner.getWebDriver();
		
		
		WebDriverRunner.closeWebDriver();

	}

}
