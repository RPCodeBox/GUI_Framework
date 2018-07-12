package com.ch.aut.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * Purpose: This class contains objects specific to the Aut module of the application.
 */
public class Aut {
	WebDriver driver;

	public Aut(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Clothing']")
	public WebElement HOME_CLOTHING;

	@FindBy(xpath = "//a[text()='Polos & Tees']")
	public WebElement HOME_CLOTHING_POLOSTEES;

	@FindBy(xpath = "//a[text()='Polos']")
	public WebElement HOME_CLOTHING_POLOSTEES_POLOS;

	@FindBy(xpath = "//h1[contains(text(),'Clothing')]")
	public WebElement PLP_CLOTHING;

	@FindBy(xpath = "//h1[contains(text(),'Polos & Tees')]")
	public WebElement PLP_CLOTHING_POLOSTEES;

	@FindBy(xpath = "//h1[contains(text(),'Polos')]")
	public WebElement PLP_CLOTHING_POLOSTEES_POLOS;

	@FindBy(xpath = "//a[text()='Shoes']")
	public WebElement HOME_SHOES;

	@FindBy(xpath = "//*[@id=\"mainContent\"]/div[1]/div/a/img")
	public WebElement PLP_SHOES;

	@FindBy(xpath = "//a[text()='Brands']")
	public WebElement HOME_BRANDS;

	@FindBy(xpath = "//*[@id=\"DXL_LP_Brands_Update_092017\"]")
	public WebElement PLP_BRANDS;
	// input[@id='quickSearch-query']
	@FindBy(xpath = "//input[@id='quickSearch-query']")
	public WebElement GLOBAL_SEARCHBOX;

	@FindBy(xpath = "//*[@id=\"quickSearch-submit\"]")
	public WebElement SEARCHSUBMITFROMHOME;

	@FindBy(xpath = "//h1[starts-with(text(),'Results')]")
	public WebElement ONSEARCHPAGE;

	@FindBy(xpath = "//*[@id=\"secondaryContent\"]/div[6]/h2")
	public WebElement ONPDP;

	@FindBy(xpath = "//*[@id=\"productListingItems\"]/div[1]/a")
	public WebElement PROD_CLOTHING;

	@FindBy(xpath = "//*[@id=\"newPersistentCart\"]/a/img")
	public WebElement HOMEPAGE_SHOPPING_BAG;

	@FindBy(xpath = "//*[@alt='my account']")
	public WebElement HOMEPAGE_SIGNIN;

	@FindBy(xpath = "//*[@id='quickSearch-query']")
	public WebElement HOMEPAGE_SEARCH_OPTION;

	@FindBy(xpath = "(//img[@class='hero-img'])[1]")
	public WebElement HOMEPAGE_PROMOTION_BANNER;

	@FindBy(xpath = "//div[@id='enzo']/div/p/span/img")
	public WebElement HOMEPAGE_XLSTYLISH;

	@FindBy(xpath = "//div[@id='chat-icon']")
	public WebElement HOMEPAGE_CHAT_OPTION;

	@FindBy(xpath = "//*[contains(text(),'Limit one offer')]")
	public WebElement PROMOTION_OFFER_PAGE;

	@FindBy(xpath = "//*[contains(text(),'Information')]")
	public WebElement HOMEPAGE_FOOTER_INFO_TITLE;

	@FindBy(xpath = "//strong[contains(text(),'Sign up for our very best deals')]")
	public WebElement HOMEPAGE_FOOTER_SIGNUP_TITLE;

	@FindBy(xpath = "//*[contains(text(),'Follow us and stay up to date')]")
	public WebElement HOMEPAGE_FOOTER_SOCIAL_ICONS_TITLE;

	@FindBy(xpath = "//strong[contains(text(),'Get the DXL app')]")
	public WebElement HOMEPAGE_FOOTER_APPS_TITLE;

	@FindBy(xpath = "//*[contains(text(),'All contents © 2011-2018. Destination XL Group, Inc. All Rights Reserved.')]")
	public WebElement HOMEPAGE_FOOTER_COPYRIGHTS;

	@FindBy(xpath = "//strong[contains(text(),'Find a store near you')]")
	public WebElement HOMEPAGE_FOOTER_FINDSTORE_TITLE;

	@FindBy(xpath = "//a[contains(text(),'Sizing chart')]")
	public WebElement HOMEPAGE_FOOTER_SIZING_CHART;

	@FindBy(xpath = "//a[contains(text(),'Shipping')]")
	public WebElement HOMEPAGE_FOOTER_SHIPPHING;

	@FindBy(xpath = "//a[contains(text(),'Returns')]")
	public WebElement HOMEPAGE_FOOTER_RETURNS;

	@FindBy(xpath = "//a[contains(text(),'Store pickup')]")
	public WebElement HOMEPAGE_FOOTER_STORE_PICKUP;

	@FindBy(xpath = "//h1")
	public WebElement VALIDATE_PAGES;

	@FindBy(xpath = "//a[contains(text(),'Store finder')]")
	public WebElement HOMEPAGE_FOOTER_STORE_FINDER;

	@FindBy(xpath = "//*[@class='logo']")
	public WebElement DXL_LOGO;

	@FindBy(xpath = "//*[@class='storeFinder tooltips']")
	public WebElement HEADER_STOREFINDER;

	@FindBy(xpath = "//*[@alt='checkout']")
	public WebElement HEARER_SHOPPINGBAG;

	@FindBy(xpath = "//*[@alt='my account']")
	public WebElement HEADER_SIGNIN;

	@FindBy(xpath = "(//*[@class='hero-img'])[2]")
	public WebElement HOMEPAGE_HERO_BANNER;

	@FindBy(id = "SignInForm.emailAddress")
	public WebElement SIGNIN_EMAIL_TEXTBOX;

	@FindBy(id = "SignInForm.password")
	public WebElement SIGNIN_PASSWORD_TEXTBOX;

	@FindBy(xpath = "//h1[text()='My Profile']")
	public WebElement MY_ACCOUNT_PAGE;

	@FindBy(id = "login-submit")
	public WebElement SIGNIN_LOGIN_BUTTON;

	@FindBy(xpath = "//a[contains(text(),' Sign Up')]")
	public WebElement SIGNIN_SIGNUP_LINK;

	@FindBy(xpath = "//input[@name='email']")
	public WebElement HOMEPAGE_FOOTER_EMAIL;

	@FindBy(xpath = "//h1")
	public WebElement PLP_RESULTSFOR_LABEL;

	@FindBy(xpath = "//button[@id='showRegForm']")
	public WebElement CREATE_ACC_BUTTON;

}