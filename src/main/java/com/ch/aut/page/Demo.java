package com.ch.aut.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.ch.aut.objectrepository.Aut;
/**
 * Purpose: This class contains reusable methods specific to the Demo module of the application.
 * 
 */
public class Demo extends Aut{
	public Demo(WebDriver driver){
		super(driver);
	}
	public void searchForAnItem(WebElement searchtextbox,String searchkeyword,WebElement searchsubmit) throws InterruptedException {
		searchtextbox.sendKeys(searchkeyword);
		searchsubmit.click();
	}
}
