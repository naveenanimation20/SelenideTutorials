package org.tests;

import static com.codeborne.selenide.Selenide.*;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class AuthPopUpHandle {
	
	@Test
	public void authPopTest() throws InterruptedException, MalformedURLException  {
		
		//open("https://the-internet.herokuapp.com/basic_auth");
//		open("https://the-internet.herokuapp.com/basic_auth", 
//					"", "admin", "admin");
		System.setProperty("webdriver.gecko.driver", "/Users/naveenautomationlabs/Downloads/geckodriver");
		System.setProperty("selenide.browser", "firefox");
		
		open(new URL("https://the-internet.herokuapp.com/basic_auth"), 
				"", "admin", "admin");
		
		Thread.sleep(5000);
		
		String text = $(By.cssSelector("div.example")).getText();
		System.out.println(text);
		Assert.assertTrue(text.contains("Congratulations"));
		
		
	}
	
	

}
