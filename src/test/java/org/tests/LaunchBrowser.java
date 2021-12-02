package org.tests;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;

public class LaunchBrowser {
	
	@Test
	public void lauchBrowserTest() {
		
//		System.setProperty("webdriver.gecko.driver", "/Users/naveenautomationlabs/Downloads/geckodriver");
		Configuration.browser = "chrome";
		Configuration.headless = false;
		Configuration.baseUrl = "https://www.google.com";
		//Configuration.browserBinary = "/Users/naveenautomationlabs/Downloads/chromedriver";
		Configuration.startMaximized = true;
		//System.setProperty("selenide.browser", "chrome");
		//System.setProperty("selenide.browserBinary", "/Users/naveenautomationlabs/Downloads/geckodriver");
		//mvn clean install -Dselenide.browser="safari"
		Configuration.screenshots = false;
		
		open("/");
		$(By.name("q1")).setValue("Naveen AutomationLabs");
		$(By.name("btnK")).click();
		$(By.id("logo")).shouldHave(Condition.appear);
		String header = $(By.xpath("//h3[text()='Welcome to Naveen AutomationLabs - naveen automationlabs']")).getText();
		System.out.println(header);
		Assert.assertEquals(header, "Welcome to Naveen AutomationLabs - naveen automationlabs");
		
		
	}

}
