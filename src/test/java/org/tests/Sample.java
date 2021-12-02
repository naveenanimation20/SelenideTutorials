package org.tests;

import static com.codeborne.selenide.Selenide.open;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;

public class Sample {

	@Test
	public void test() throws InterruptedException {

		Configuration.headless = false;
		open("http://zero.webappsecurity.com/feedback.html");
		WebDriver driver = WebDriverRunner.getWebDriver();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//String script = "document.getElementById('comment').value='naveen'";
		String value = "hi this is test automation hi this is test automation hi this is test automation hi this is test automation hi this is test automation "
				+ "hi this is test automation hi this is test automation hi this is test automation hi this is test automation "
				+ "hi this is test automation hi this is test automation hi this is test automation hi this is test automation "
				+ "hi this is test automation hi this is test automation hi this is test automation "
				+ "hi this is test automation hi this is test automation hi this is test automation "
				+ "";
		//js.executeScript("document.getElementById('comment').value='" + value + "'");
		driver.findElement(By.id("comment")).sendKeys(value);
		Thread.sleep(5000);
	}

}
