package org.tests;

import static com.codeborne.selenide.Selenide.*;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.codeborne.selenide.SelenideElement;



public class UserActions {
	
	
	@Test
	public void moveToElement() throws InterruptedException {
		open("https://www.spicejet.com/");
		SelenideElement addOn = $(By.xpath("//div[text()='Add-ons']"));	
		
		actions().moveToElement(addOn).build().perform();
		
		SelenideElement visaServices = $(By.xpath("//div[text()='Visa Services']"));	
		visaServices.click();
		
		Thread.sleep(5000);		
	}
	
	@Test
	public void dragAndDropTest() throws InterruptedException {
		open("https://jqueryui.com/resources/demos/droppable/default.html");
		SelenideElement sourceEle = $(By.id("draggable"));
		SelenideElement targetEle = $(By.id("droppable"));
		
//		actions()
//			.clickAndHold(sourceEle)
//				.moveToElement(targetEle)
//					.release()
//						.build()
//							.perform();
		
		actions().dragAndDrop(sourceEle, targetEle).build().perform();
		Thread.sleep(5000);		

	}
	
	@Test
	public void rightClickTest() throws InterruptedException {
		open("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		SelenideElement rightClick = $(By.xpath("//span[text()='right click me']"));	
		
		actions().contextClick(rightClick).build().perform();
		//actions().contextClick().build().perform();
		Thread.sleep(5000);		
	}
	
	

}
