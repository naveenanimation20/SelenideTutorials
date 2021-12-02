package org.tests;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;

import java.util.List;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.ElementsCollection;

public class FooterList {

	@Test
	public void elementsTest() {

		Configuration.headless = true;
		open("https://www.freshworks.com/");
		ElementsCollection colls = $$(By.xpath("//footer//ul/li/a"));
		System.out.println(colls.size());
		
//		colls.forEach(e -> System.out.println(e.getText()));
//		colls.last(10).forEach(e -> System.out.println(e.getText()));
		List<String> footerTextList = colls.texts();
		footerTextList.forEach(e -> System.out.println(e));
	}

}