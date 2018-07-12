package com.ch.aut.desktop;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.ch.generic.LaunchBrowser;

@Listeners(com.ch.generic.LaunchBrowser.class)

public class Demo {
	LaunchBrowser launchbrowser;
	com.ch.aut.utility.Demo demo;

	@Test(groups = { "Demo", "REGRESSION", "Ready.*", "P1-HIGH" })
	public void TS01_validateUserAbleToNavigateToClothingCategory() throws Exception {
		Reporter.log("Scenario: Verify user is able to navigate to clothing category page.");
		demo = new com.ch.aut.utility.Demo(LaunchBrowser.getDriver());
		demo.T_verifyUserAbleToNavigateToClothingCategory();
	}

	@Test(groups = { "Demo", "REGRESSION", "Ready.*", "P1-HIGH" })
	public void TS02_validateUserAbleToNavigateToShoesCategory() throws Exception {
		Reporter.log("Scenario: Verify user is able to navigate to 'clothing' category page.");
		demo = new com.ch.aut.utility.Demo(LaunchBrowser.getDriver());
		demo.T_verifyUserAbleToNavigateToShoesCategory();
	}

	@Test(groups = { "Demo", "REGRESSION", "Ready.*", "P1-HIGH" })
	public void TS03_validateUserAbleToNavigateToBrandsCategory() throws Exception {
		Reporter.log("Scenario: Verify user is able to navigate to polosandtees subcategory page.");
		demo = new com.ch.aut.utility.Demo(LaunchBrowser.getDriver());
		demo.T_verifyUserAbleToNavigateToBrandsCategory();
	}

	@Test(groups = { "Demo", "REGRESSION", "Ready.*", "P1-HIGH" })
	public void TS04_validateUserAbleToNavigateToPolosnTeesSubCategory() throws Exception {
		Reporter.log("Scenario: Verify user is able to navigate to polos subsubcategory page.");
		demo = new com.ch.aut.utility.Demo(LaunchBrowser.getDriver());
		demo.T_verifyUserAbleToNavigateToPolosAndTeesSubCategory();
	}

	@Test(groups = { "Demo", "REGRESSION", "Ready.*", "P1-HIGH" })
	public void TS05_validateUserAbleToNavigateToPolosSubSubCategory() throws Exception {
		Reporter.log("Scenario: Verify user is able to see global search header present in homepage.");
		demo = new com.ch.aut.utility.Demo(LaunchBrowser.getDriver());
		demo.T_verifyUserAbleToNavigateToPolosSubSubCategory();
	}

	@Test(groups = { "Demo", "REGRESSION", "Ready.*", "P1-HIGH" })
	public void TS06_validateGlobalSearchHeaderPresentInHomepage() throws Exception {
		Reporter.log("Scenario: Verify user is able to see global search header present in homepage.");
		demo = new com.ch.aut.utility.Demo(LaunchBrowser.getDriver());
		demo.T_verifyGlobalSearchHeaderPresentInHomepage();
	}

	@Test(groups = { "Demo", "REGRESSION", "Ready.*", "P1-HIGH" })
	public void TS07_validateUserAbleToSearchForAnItemFromHomepage() throws Exception {
		Reporter.log("Scenario: Verify user is able to search for an item from homepage.");
		demo = new com.ch.aut.utility.Demo(LaunchBrowser.getDriver());
		demo.T_verifyUserAbleToSearchForAnItemFromHomepage();
	}

	@Test(groups = { "Demo", "REGRESSION", "Ready.*", "P1-HIGH" })
	public void TS08_validateUserAbleToSearchByBrandNameFromHomepage() throws Exception {
		Reporter.log("Scenario: Verify user is able to search by brand name from homepage.");
		demo = new com.ch.aut.utility.Demo(LaunchBrowser.getDriver());
		demo.T_verifyUserAbleToSearchByBrandNameFromHomepage();
	}

	@Test(groups = { "Demo", "REGRESSION", "Ready.*", "P1-HIGH" })
	public void TS09_validateUserAbleToNavigateToPDPByClickingOnAnyItem() throws Exception {
		Reporter.log("Scenario: Verify user is able to navigate to PDP by clicking on any product category page.");
		demo = new com.ch.aut.utility.Demo(LaunchBrowser.getDriver());
		demo.T_validateUserAbleToNavigateToPDPByClickingOnAnyItem();
	}
	
	@Test(groups = { "Demo", "REGRESSION", "Ready.*", "P1-HIGH" })
	public void TS10_validateUserAbleToNavigateToPDPBySearchingProductid() throws Exception {
		Reporter.log("Scenario: Verify user is able to navigate directly to PDP by searching for a product id.");
		demo = new com.ch.aut.utility.Demo(LaunchBrowser.getDriver());
		demo.T_verifyUserAbleToNavigateToPDPBySearchingProductid();
	}
	}
