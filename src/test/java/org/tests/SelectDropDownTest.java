package org.tests;

import static com.codeborne.selenide.Selenide.*;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;


public class SelectDropDownTest {
	
	@Test
	public void userActions() throws InterruptedException {
		
		open("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		//Select html tag 
		$(By.id("Form_submitForm_Country")).selectOption(2);
		Thread.sleep(2000);
		$(By.id("Form_submitForm_Country")).selectOption("India");
		Thread.sleep(2000);
		$(By.id("Form_submitForm_Country")).selectOptionByValue("France");
		Thread.sleep(2000);

		//without using selectOption:
		
		ElementsCollection coll = $$(By.cssSelector("select#Form_submitForm_Country option"));
		System.out.println(coll.size());
		
		for(SelenideElement e : coll) {
			String text = e.getText();
			System.out.println(text);
				if(text.equals("Angola")) {
					e.click();
					break;
				}
		}

		Thread.sleep(2000);

	}
	
	
	

}
