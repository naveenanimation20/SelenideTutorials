package org.tests;

import static com.codeborne.selenide.Selenide.*;

import org.testng.annotations.Test;

public class CloseBrowser {

	@Test
	public void closeBrowserTest() throws InterruptedException {

		open("https://opensource-demo.orangehrmlive.com/");// Parent - 0

		System.out.println(title());

		$("img[alt='OrangeHRM on youtube']").click();// child - 1

		switchTo().window(1);

		System.out.println(title());
		
		Thread.sleep(3000);

		closeWindow();

		switchTo().window(0);

		System.out.println(title());
		Thread.sleep(3000);

		closeWebDriver();

	}

}
