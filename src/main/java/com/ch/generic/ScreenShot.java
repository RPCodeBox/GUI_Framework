package com.ch.generic;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.google.common.io.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import com.ch.aut.objectrepository.Aut;
import com.ch.generic.LaunchBrowser;
/**
 * Purpose : This class contains method to take a screenshot while executing the code.
 */
public class ScreenShot extends Aut{
	public ScreenShot(WebDriver driver) {
		super(driver);
		
	}
	public void getScreenShot1(String name) {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		File scrFile = ((TakesScreenshot) LaunchBrowser.getDriver()).getScreenshotAs(OutputType.FILE);
		try {
			String reportDirectory = new File(System.getProperty("user.dir")).getAbsolutePath() + "/screenshot/";
			File destFile = new File((String) reportDirectory + name + "_" + formater.format(calendar.getTime()) + ".png");
			Files.copy(scrFile, destFile);
			// This will help us to link the screen shot in testNG report
			Reporter.log("<a href='" + destFile.getAbsolutePath() + "'> <img src='" + destFile.getAbsolutePath() + "' height='100' width='100'/> </a>");
		} catch (IOException e) {
			e.printStackTrace();
		}
}
	public static void getScreenShot(String strScriptName) {
				String strImageBinary = ((TakesScreenshot)LaunchBrowser.getDriver()).getScreenshotAs(OutputType.BASE64);
				Reporter.log("ScreenShot: <a target=\"_blank\" alt=\"" + strScriptName + "\" href='data:image/png;base64," + strImageBinary + "'>ScreenShot</a>");
		}
}
