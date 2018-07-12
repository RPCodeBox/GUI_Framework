package com.ch.aut.utility;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import com.ch.aut.objectrepository.Aut;
import com.ch.excelutils.PropertyLibrary;
import com.ch.generic.AppIndependent;
import com.ch.generic.AutomationConstants;
import com.ch.generic.LaunchBrowser;
import com.ch.generic.ScreenShot;

/**
 * Fully qualified name for the Demo page class has been used to avoid
 * ambiguity.
 * 
 * Purpose: This class contains test scripts for demo purpose.
 */
public class Demo extends com.ch.aut.page.Demo implements AutomationConstants {
	WebDriver driver;

	public Demo(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	LaunchBrowser launchbrowser;
	Aut objectrepo;
	AppIndependent apindependent;

	public boolean T_verifyUserAbleToNavigateToClothingCategory() throws Exception {
		try {
			LaunchBrowser.navigateToUrl();
			objectrepo = new Aut(driver);
			apindependent = new AppIndependent(driver);
			apindependent.ClickOnElement(objectrepo.HOME_CLOTHING);
			AppIndependent.wait("MEDIUM_WAIT");
			ScreenShot.getScreenShot("verifyUserAbleToNavigateToClothingCategory");
			Assert.assertTrue(apindependent.checkVisibilityOfElement(objectrepo.PLP_CLOTHING));
			Reporter.log("User is able to navigate to 'clothing' category page.");
			return true;
		} catch (Exception e) {
			ScreenShot.getScreenShot("verifyUserAbleToNavigateToClothingCategory");
			Reporter.log("User is not able to navigate to 'clothing' category page.");
			e.printStackTrace();
			throw e;
		}

	}

	public boolean T_verifyUserAbleToNavigateToShoesCategory() throws Exception {
		try {
			LaunchBrowser.navigateToUrl();
			objectrepo = new Aut(driver);
			apindependent = new AppIndependent(driver);
			apindependent.ClickOnElement(objectrepo.HOME_SHOES);
			AppIndependent.wait("MEDIUM_WAIT");
			ScreenShot.getScreenShot("verifyUserAbleToNavigateToShoesCategory");
			Assert.assertTrue(apindependent.checkVisibilityOfElement(objectrepo.PLP_SHOES));
			Reporter.log("User is able to navigate to 'shoes' category page.");
			return true;
		} catch (Exception e) {
			ScreenShot.getScreenShot("verifyUserAbleToNavigateToShoesCategory");
			Reporter.log("User is not able to navigate to 'shoes' category page.");
			e.printStackTrace();
			throw e;
		}
	}

	public boolean T_verifyUserAbleToNavigateToBrandsCategory() throws Exception {
		try {
			Reporter.log("Scenario: Verify user is able to navigate to clothing category page.");
			LaunchBrowser.navigateToUrl();
			objectrepo = new Aut(driver);
			apindependent = new AppIndependent(driver);
			apindependent.ClickOnElement(objectrepo.HOME_BRANDS);
			AppIndependent.wait("MEDIUM_WAIT");
			ScreenShot.getScreenShot("verifyUserAbleToNavigateToBrandsCategory");
			Assert.assertTrue(apindependent.checkVisibilityOfElement(objectrepo.PLP_BRANDS));
			Reporter.log("User is able to navigate to 'brands' category page.");
			return true;
		} catch (Exception e) {
			ScreenShot.getScreenShot("verifyUserAbleToNavigateToBrandsCategory");
			Reporter.log("User is not able to navigate to 'brands' category page.");
			e.printStackTrace();
			throw e;
		}

	}

	public boolean T_verifyUserAbleToNavigateToPolosAndTeesSubCategory() throws Exception {
		try {
			LaunchBrowser.navigateToUrl();
			objectrepo = new Aut(driver);
			apindependent = new AppIndependent(driver);
			apindependent.onHoverForElement(objectrepo.HOME_CLOTHING);
			AppIndependent.wait("SHORT_WAIT");
			apindependent.ClickOnElement(objectrepo.HOME_CLOTHING_POLOSTEES);
			AppIndependent.wait("SHORT_WAIT");
			ScreenShot.getScreenShot("verifyUserAbleToNavigateToPolosnTeesSubCategory");
			Assert.assertTrue(apindependent.checkVisibilityOfElement(objectrepo.PLP_CLOTHING_POLOSTEES));
			Reporter.log("User is able to navigate to 'polos and tees' subcategory page.");
			return true;
		} catch (Exception e) {
			ScreenShot.getScreenShot("verifyUserAbleToNavigateToPolosnTeesSubCategory");
			Reporter.log("User is not able to navigate to 'polos and tees' subcategory page.");
			e.printStackTrace();
			throw e;
		}

	}

	public boolean T_verifyUserAbleToNavigateToPolosSubSubCategory() throws Exception {
		try {
			LaunchBrowser.navigateToUrl();
			objectrepo = new Aut(driver);
			apindependent = new AppIndependent(driver);
			apindependent.onHoverForElement(objectrepo.HOME_CLOTHING);
			AppIndependent.wait("SHORT_WAIT");
			apindependent.onHoverForElement(objectrepo.HOME_CLOTHING_POLOSTEES);
			AppIndependent.wait("SHORT_WAIT");
			apindependent.ClickOnElement(objectrepo.HOME_CLOTHING_POLOSTEES_POLOS);
			ScreenShot.getScreenShot("verifyUserAbleToNavigateToPolosSubSubCategory");
			Assert.assertTrue(apindependent.checkVisibilityOfElement(objectrepo.PLP_CLOTHING_POLOSTEES_POLOS));
			Reporter.log("User is able to navigate to 'polos' subsubcategory page.");
			return true;
		} catch (Exception e) {
			ScreenShot.getScreenShot("verifyUserAbleToNavigateToPolosSubSubCategory");
			Reporter.log("User is not able to navigate to 'polos' subsubcategory page.");
			e.printStackTrace();
			throw e;
		}

	}

	public boolean T_verifyGlobalSearchHeaderPresentInHomepage() throws Exception {
		try {
			LaunchBrowser.navigateToUrl();
			objectrepo = new Aut(driver);
			apindependent = new AppIndependent(driver);
			ScreenShot.getScreenShot("verifyGlobalSearchHeaderPresentInHomepage");
			Assert.assertTrue(apindependent.checkVisibilityOfElement(objectrepo.GLOBAL_SEARCHBOX));
			Reporter.log("Global search header present in homepage.");
			return true;
		} catch (Exception e) {
			ScreenShot.getScreenShot("verifyGlobalSearchHeaderPresentInHomepage");
			Reporter.log("User is not able to see global search header present in homepage");
			e.printStackTrace();
			throw e;
		}

	}

	public boolean T_verifyUserAbleToSearchForAnItemFromHomepage() throws Exception {
		try {
			LaunchBrowser.navigateToUrl();
			objectrepo = new Aut(driver);
			apindependent = new AppIndependent(driver);
			searchForAnItem(objectrepo.GLOBAL_SEARCHBOX,
					PropertyLibrary.getPropertyValue(CONFIG_PATH + CONFIG_FILE, "SEARCHKEYWORD"),
					objectrepo.SEARCHSUBMITFROMHOME);
			ScreenShot.getScreenShot("verifyUserAbleToSearchForAnItemFromHomepage");
			AppIndependent.wait("SHORT_WAIT");
			Assert.assertTrue(apindependent.checkVisibilityOfElement(objectrepo.ONSEARCHPAGE));
			Reporter.log("User is able to search for an item from homepage.");
			return true;
		} catch (Exception e) {
			ScreenShot.getScreenShot("verifyUserAbleToSearchForAnItemFromHomepage");
			Reporter.log("User is not able to search for an item from homepage.");
			e.printStackTrace();
			throw e;
		}

	}

	public boolean T_verifyUserAbleToSearchByBrandNameFromHomepage() throws Exception {
		try {
			LaunchBrowser.navigateToUrl();
			objectrepo = new Aut(driver);
			apindependent = new AppIndependent(driver);
			searchForAnItem(objectrepo.GLOBAL_SEARCHBOX,
					PropertyLibrary.getPropertyValue(CONFIG_PATH + CONFIG_FILE, "BRANDNAME"),
					objectrepo.SEARCHSUBMITFROMHOME);
			ScreenShot.getScreenShot("verifyUserAbleToSearchForAnItemFromHomepage");
			AppIndependent.wait("SHORT_WAIT");
			Assert.assertTrue(apindependent.checkVisibilityOfElement(objectrepo.ONSEARCHPAGE));
			Reporter.log("User is able to search by brand name from homepage.");
			return true;
		} catch (Exception e) {
			ScreenShot.getScreenShot("verifyUserAbleToSearchForAnItemFromHomepage");
			Reporter.log("User is not able to search by brand name from homepage.");
			e.printStackTrace();
			throw e;
		}

	}

	public boolean T_verifyUserAbleToNavigateToPDPBySearchingProductid() throws Exception {
		try {
			LaunchBrowser.navigateToUrl();
			objectrepo = new Aut(driver);
			apindependent = new AppIndependent(driver);
			searchForAnItem(objectrepo.GLOBAL_SEARCHBOX,
					PropertyLibrary.getPropertyValue(CONFIG_PATH + CONFIG_FILE, "PRODID"),
					objectrepo.SEARCHSUBMITFROMHOME);
			ScreenShot.getScreenShot("verifyUserAbleToSearchForAnItemFromHomepage");
			AppIndependent.wait("SHORT_WAIT");
			Assert.assertTrue(apindependent.checkVisibilityOfElement(objectrepo.ONPDP));
			Reporter.log("User is able navigate directly to PDP by searching for a product id.");
			return true;
		} catch (Exception e) {
			ScreenShot.getScreenShot("verifyUserAbleToSearchForAnItemFromHomepage");
			Reporter.log("User is not able to navigate directly to PDP by searching for a product id.");
			e.printStackTrace();
			throw e;
		}

	}

	public boolean T_validateUserAbleToNavigateToPDPByClickingOnAnyItem() throws Exception {
		try {
			LaunchBrowser.navigateToUrl();
			objectrepo = new Aut(driver);
			apindependent = new AppIndependent(driver);
			apindependent.ClickOnElement(objectrepo.HOME_CLOTHING);
			AppIndependent.wait("MEDIUM_WAIT");
			apindependent.ClickOnElement(objectrepo.PROD_CLOTHING);
			ScreenShot.getScreenShot("verifyUserAbleToNavigateToClothingCategory");
			Assert.assertTrue(apindependent.checkVisibilityOfElement(objectrepo.ONPDP));
			Reporter.log("User is able to navigate to PDP by clicking on any product category page.");
			return true;
		} catch (Exception e) {
			ScreenShot.getScreenShot("verifyUserAbleToNavigateToClothingCategory");
			Reporter.log("User is not able to navigate to PDP by clicking on any product category page.");
			e.printStackTrace();
			throw e;
		}

	}
}
