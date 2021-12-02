package org.tests;

import org.testng.annotations.Test;

import com.codeborne.selenide.Driver;
import com.codeborne.selenide.WebDriverRunner;

import static com.codeborne.selenide.Selenide.*;


public class NavigationConcepts {

	@Test
	public void navigateTest() throws InterruptedException {

		open("https://www.google.com");
		System.out.println(title());

		open("http://www.amazon.com");
		System.out.println(title());

		back();
		System.out.println(title());

		forward();
		System.out.println(title());

		back();
		System.out.println(title());
		
		//Thread.sleep(5000);
		
		refresh();
	}

}
