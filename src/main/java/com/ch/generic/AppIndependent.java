package com.ch.generic;

import static org.testng.Assert.assertEquals;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.ch.excelutils.PropertyLibrary;

public class AppIndependent implements AutomationConstants {
	/**
	 * Purpose: This class contains to create reusable methods which can be used across all kind of applications.
	 */
	public AppIndependent(WebDriver driver) {

	}

	/*
	 * **************************************************** Method Name :
	 * ClickOnElement(WebElement element) Purpose : To perform click on the
	 * element in the site Author : Shiva,Hitesh Date Created : 16/04/18 Date
	 * Modified : Reviewed By :
	 * ******************************************************
	 */
	public boolean ClickOnElement(WebElement element) throws Exception {
		try {
			WebDriverWait wait = new WebDriverWait(LaunchBrowser.getDriver(), 15);
			wait.until(ExpectedConditions.elementToBeClickable(element));
			element.click();
			System.out.println("Clicked on element Successfully");
			// Reporter.log("Element is clickable");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			// Reporter.log("Element is not clickable"+element);
			throw e;
		}
	}

	/*
	 * **************************************************** Method Name :
	 * checkVisibilityOfElement(WebElement element) Purpose : To perform check
	 * the visibility of element in the site Author : Shiva,Hitesh Date Created
	 * : 16/04/18 Date Modified : Reviewed By :
	 * ******************************************************
	 */
	public boolean checkVisibilityOfElement(WebElement element) throws Exception {
		try {
			WebDriverWait wait = new WebDriverWait(LaunchBrowser.getDriver(), 15);
			wait.until(ExpectedConditions.visibilityOf(element));
			boolean Status = element.isDisplayed();
			return Status;
		} catch (Exception e) {
			e.printStackTrace();
			// Reporter.log("Element is not visible"+element);
			throw e;
		}
	}

	/*
	 * **************************************************** Method Name :
	 * enterValue(WebElement element, String string) Purpose : To perform enter
	 * the String value in the site Author : Shiva,Hitesh Date Created :
	 * 16/04/18 Date Modified : Reviewed By :
	 * ******************************************************
	 */
	public boolean enterValue(WebElement element, String string) throws Exception {
		try {
			WebDriverWait wait = new WebDriverWait(LaunchBrowser.getDriver(), 15);
			wait.until(ExpectedConditions.elementToBeClickable((element)));
			element.clear();
			element.sendKeys(string);
			System.out.println("Value is entered successfully");
			// Reporter.log("Element is enterd");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			// Reporter.log("Element is not enterd"+element);
			throw e;
		}
	}

	/*
	 * **************************************************** Method Name :
	 * onHoverForElement(WebElement element) Purpose : To perform onHover the
	 * element in the site Author : Shiva,Hitesh Date Created : 16/04/18 Date
	 * Modified : Reviewed By :
	 * ******************************************************
	 */
	public boolean onHoverForElement(WebElement element) throws Exception {
		try {
			WebDriverWait wait = new WebDriverWait(LaunchBrowser.getDriver(), 15);
			wait.until(ExpectedConditions.visibilityOf((element)));
			Actions act = new Actions(LaunchBrowser.getDriver());
			act.moveToElement(element).build().perform();
			// Reporter.log("Element is Hovered");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			// Reporter.log("Element is not Hovered");
			throw e;
		}
	}

	/*
	 * **************************************************** Method Name :
	 * dragANDDrop(WebElement source,WebElement destination) Purpose : To
	 * perform drag and drop the element from source to destination in the site
	 * Author : Shiva,Hitesh Date Created : 17/04/18 Date Modified : Reviewed By
	 * : ******************************************************
	 */
	public boolean dragANDDrop(WebElement source, WebElement destination) throws Exception {
		try {
			Actions act = new Actions(LaunchBrowser.getDriver());
			act.dragAndDrop(source, destination).build().perform();
			System.out.println("Drand and Drop operation is Successfull");
			// Reporter.log("Drand and Drop operation is Successfull");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			// Reporter.log("Drand and Drop operation is not Successfull");
			throw e;
		}
	}

	/*
	 * **************************************************** Method Name :
	 * clickAndHoldElement(WebElement element) Purpose : To perform click and
	 * hold the element in the site Author : Shiva Date Created : 17/04/18 Date
	 * Modified : Reviewed By :
	 * ******************************************************
	 */

	public boolean clickAndHoldElement(WebElement element) throws Exception {
		try {
			Actions act = new Actions(LaunchBrowser.getDriver());
			act.clickAndHold(element).build().perform();
			System.out.println("Click and Hold operation is successfull");
			// Reporter.log("Element is clicked and Hold");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			// Reporter.log("Element is not clicked and Hold"+element);
			throw e;
		}
	}

	/*
	 * **************************************************** Method Name :
	 * contextClick(WebElement element) Purpose : To perform contextclick in the
	 * site Author : Shiva Date Created : 17/04/18 Date Modified : Reviewed By :
	 * ******************************************************
	 */

	public boolean contextClick(WebElement element) throws Exception {
		try {
			Actions act = new Actions(LaunchBrowser.getDriver());
			act.contextClick(element).build().perform();
			System.out.println("ContextClick Operation is successfull");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * **************************************************** Method Name :
	 * doubleClick(WebElement element) Purpose : To perform the double click in
	 * the site Author : Shiva Date Created : 17/04/18 Date Modified : Reviewed
	 * By : ******************************************************
	 */
	public boolean doubleClick(WebElement element) throws Exception {
		try {
			Actions act = new Actions(LaunchBrowser.getDriver());
			act.doubleClick(element).build().perform();
			System.out.println("Double click Operation is successfull");
			// Reporter.log("Element is double clicked");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			// Reporter.log("Element is not double clicked"+element);
			throw e;
		}
	}

	/*
	 * **************************************************** Method Name :
	 * moveToElement(WebElement element) Purpose : To perform move to element
	 * operation in the site Author : Shiva Date Created : 18/04/18 Date
	 * Modified : Reviewed By :
	 * ******************************************************
	 */
	public boolean moveToElement(WebElement element) throws Exception {
		try {
			Actions act = new Actions(LaunchBrowser.getDriver());
			act.moveToElement(element).build().perform();
			System.out.println("move to element is successfull");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * **************************************************** Method Name :
	 * implicitWait() Purpose : To perform the implicit wait for the page in the
	 * site Author : Shiva Date Created : 18/04/18 Date Modified : Reviewed By :
	 * ******************************************************
	 */
	public boolean implicitWait() throws Exception {
		try {
			LaunchBrowser.getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			System.out.println("implicit wait Operation is successfull");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * **************************************************** Method Name : a()
	 * Purpose : To Author : Shiva Date Created : 18/04/18 Date Modified :
	 * Reviewed By : ******************************************************
	 */
	public boolean a() throws Exception {
		try {

			System.out.println("explicit wait Operation is successfull");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * **************************************************** Author : Subhendu
	 * Sekhar Date Created : 03/06/18 line 287 -- 574
	 * ******************************************************
	 */
	public Alert getAlert() {
		return LaunchBrowser.getDriver().switchTo().alert();
	}

	public void AcceptAlert() {
		getAlert().accept();
	}

	public void DismissAlert() {
		getAlert().dismiss();
	}

	public static synchronized boolean verifyElementPresent(WebElement element) {
		boolean isDispalyed = false;
		try {
			isDispalyed = element.isDisplayed();
		} catch (Exception ex) {
		}

		return isDispalyed;
	}

	public static synchronized boolean verifyElementNotPresent(WebElement element) {
		boolean isDispalyed = false;
		try {
			element.isDisplayed();
		} catch (Exception ex) {
			isDispalyed = true;
		}

		return isDispalyed;
	}

	public static synchronized boolean verifyTextEquals(WebElement element, String expectedText) {
		boolean flag = false;
		try {
			String actualText = element.getText();
			if (actualText.equals(expectedText)) {
				return flag = true;
			} else {
				return flag;
			}
		} catch (Exception ex) {
			return flag;
		}
	}

	public void goBack() {
		LaunchBrowser.getDriver().navigate().back();
	}

	public void goForward() {
		LaunchBrowser.getDriver().navigate().forward();
	}

	public void refresh() {
		LaunchBrowser.getDriver().navigate().refresh();
	}

	public Set<String> getWindowHandlens() {
		return LaunchBrowser.getDriver().getWindowHandles();
	}

	public void SwitchToWindow(int index) {

		LinkedList<String> windowsId = new LinkedList<String>(getWindowHandlens());

		if (index < 0 || index > windowsId.size()) {
			throw new IllegalArgumentException("Invalid Index : " + index);
		}
		LaunchBrowser.getDriver().switchTo().window(windowsId.get(index));
	}

	public void switchToParentWindow() {
		LinkedList<String> windowsId = new LinkedList<String>(getWindowHandlens());
		LaunchBrowser.getDriver().switchTo().window(windowsId.get(0));
	}

	public void switchToParentWithChildClose() {
		LinkedList<String> windowsId = new LinkedList<String>(getWindowHandlens());

		for (int i = 1; i < windowsId.size(); i++) {
			LaunchBrowser.getDriver().switchTo().window(windowsId.get(i));
			LaunchBrowser.getDriver().close();
		}

		switchToParentWindow();
	}

	public void switchToFrame(String nameOrId) {
		LaunchBrowser.getDriver().switchTo().frame(nameOrId);
	}

	public void SelectUsingVisibleValue(WebElement element, String visibleValue) {
		Select select = new Select(element);
		select.selectByVisibleText(visibleValue);
	}

	public String getSelectedValue(WebElement element) {
		String value = new Select(element).getFirstSelectedOption().getText();
		return value;
	}

	public void SelectUsingIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	public void SelectUsingVisibleText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	public List<String> getAllDropDownValues(WebElement locator) {
		Select select = new Select(locator);
		List<WebElement> elementList = select.getOptions();
		List<String> valueList = new LinkedList<String>();

		for (WebElement element : elementList) {
			valueList.add(element.getText());
		}
		return valueList;
	}

	public String readValueFromElement(WebElement element) {

		if (null == element) {
			return null;
		}

		boolean displayed = false;
		try {
			displayed = isDisplayed(element);
		} catch (Exception e) {
			Reporter.log(e.fillInStackTrace().toString());
			return null;
		}

		if (!displayed) {
			return null;
		}
		String text = element.getText();
		return text;
	}

	public String readValueFromInput(WebElement element) {
		if (null == element) {
			return null;
		}
		if (!isDisplayed(element)) {
			return null;
		}
		String value = element.getAttribute("value");
		return value;
	}

	public boolean isDisplayed(WebElement element) {
		try {
			element.isDisplayed();
			return true;
		} catch (Exception e) {
			Reporter.log(e.fillInStackTrace().toString());
			return false;
		}
	}

	protected boolean isNotDisplayed(WebElement element) {
		try {
			element.isDisplayed();
			return false;
		} catch (Exception e) {
			Reporter.log(e.fillInStackTrace().toString());
			return true;
		}

	}

	protected String getDisplayText(WebElement element) {
		if (null == element) {
			return null;
		}
		if (!isDisplayed(element)) {
			return null;
		}
		return element.getText();
	}

	public static synchronized String getElementText(WebElement element) {
		if (null == element) {
			return null;
		}
		String elementText = null;
		try {
			elementText = element.getText();
		} catch (Exception ex) {
			Reporter.log(ex.fillInStackTrace().toString());
		}
		return elementText;
	}

	public Object executeScript(String script) {
		JavascriptExecutor exe = (JavascriptExecutor) LaunchBrowser.getDriver();
		return exe.executeScript(script);
	}

	public Object executeScript(String script, Object... args) {
		JavascriptExecutor exe = (JavascriptExecutor) LaunchBrowser.getDriver();
		return exe.executeScript(script, args);
	}

	public void scrollToElemet(WebElement element) {
		executeScript("window.scrollTo(arguments[0],arguments[1])", element.getLocation().x, element.getLocation().y);
	}

	public void scrollToElemetAndClick(WebElement element) {
		scrollToElemet(element);
		element.click();
	}

	public void scrollIntoView(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) LaunchBrowser.getDriver();
		executor.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public void scrollIntoViewAndClick(WebElement element) {
		scrollIntoView(element);
		element.click();
	}

	public void scrollDownVertically() {
		executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	public void scrollUpVertically() {
		executeScript("window.scrollTo(0, -document.body.scrollHeight)");
	}

	public void scrollDownByPixel() {
		executeScript("window.scrollBy(0,1500)");
	}

	public void scrollUpByPixel() {
		executeScript("window.scrollBy(0,-1500)");
	}

	public void ZoomInBypercentage() {
		executeScript("document.body.style.zoom='40%'");
	}

	public void ZoomBy100percentage() {
		executeScript("document.body.style.zoom='100%'");
	}

	public void setImplicitWait(long timeout, TimeUnit unit) {
		LaunchBrowser.getDriver().manage().timeouts().implicitlyWait(timeout, unit == null ? TimeUnit.SECONDS : unit);
	}

	public void setPageLoadTimeout(long timeout, TimeUnit unit) {
		LaunchBrowser.getDriver().manage().timeouts().pageLoadTimeout(timeout, unit == null ? TimeUnit.SECONDS : unit);
	}

	private WebDriverWait getWait(int timeOutInSeconds, int pollingEveryInMiliSec) {
		WebDriverWait wait = new WebDriverWait(LaunchBrowser.getDriver(), timeOutInSeconds);
		wait.pollingEvery(pollingEveryInMiliSec, TimeUnit.MILLISECONDS);
		wait.ignoring(NoSuchElementException.class);
		wait.ignoring(ElementNotVisibleException.class);
		wait.ignoring(StaleElementReferenceException.class);
		wait.ignoring(NoSuchFrameException.class);
		return wait;
	}

	public void waitForElementVisible(WebElement locator, int timeOutInSeconds, int pollingEveryInMiliSec) {
		WebDriverWait wait = getWait(timeOutInSeconds, pollingEveryInMiliSec);
		wait.until(ExpectedConditions.visibilityOf(locator));
	}

	public void waitForElement(WebDriver driver, WebElement element, long timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public WebElement waitForElement(WebDriver driver, long time, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		return wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public static void wait(String sleep) throws Exception {
		String data = PropertyLibrary.getPropertyValue(CONFIG_PATH + CONFIG_FILE, sleep);
		int milliseconds = Integer.parseInt(data);
		Thread.sleep(milliseconds);
	}

	public void scrollToElement(WebElement element) {
		JavascriptExecutor exe = (JavascriptExecutor) LaunchBrowser.getDriver();
		exe.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public boolean isSelected(WebElement element) {
		try {
			element.isSelected();
			return true;
		} catch (Exception e) {
			Reporter.log(e.fillInStackTrace().toString());
			return false;
		}
	}

	public void scroll(WebElement ele) throws Exception {
		JavascriptExecutor executor = (JavascriptExecutor) LaunchBrowser.getDriver();
		int yScrollPosition = ele.getLocation().getY() - 200;
		executor.executeScript("window.scroll(0, " + yScrollPosition + ");");
	}
	/*
	 * Method Name :verifyForgotPasswordFunctionality() Purpose : To validate the
	 * functionality of the forgot password . Date Created : 17/04/18
	 */

	public boolean verifyForgotPasswordFunctionality(WebElement forgotPassText, WebElement forgotTextBox, String email,
			WebElement continueButton, WebElement successMsg) throws Exception {
		try {
			checkVisibilityOfElement(forgotPassText);
			enterValue(forgotTextBox, email);
			ClickOnElement(continueButton);
			Thread.sleep(2000);
			checkVisibilityOfElement(successMsg);
			System.out.println();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name : sendKeysFunctionality() Purpose : To validate the
	 * functionality of the enter and navigation . Date Created : 19/04/18
	 */

	public boolean sendKeysFunctionality(WebElement textbox, String enterKeyword, WebElement verify) throws Exception {
		try {

			enterValue(textbox, enterKeyword + Keys.ENTER);
			Thread.sleep(2000);
			checkVisibilityOfElement(verify);
			System.out.println();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name : getAttributePlaceHolder() Purpose : To validate the display of place
	 * holder Date Created : 20/04/18 By :
	 * 
	 */

	public boolean getAttributePlaceHolder(String compareStringValue, WebElement ele) throws Exception {
		try {
			assertEquals(compareStringValue, ele.getAttribute("placeHolder"));

			System.out.println();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name : verifyBackgroundColor() Purpose : To validate the display of
	 * background color Date Created : 20/04/18 By :
	 * 
	 */

	public boolean getCSSBackgroudColorValue(String compareColorValue, WebElement ele) throws Exception {
		try {
			assertEquals(compareColorValue, ele.getCssValue("background-color"));
			System.out.println();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name : getText() Purpose : To validate to get text from the page. Date
	 * Created : 20/04/18
	 * 
	 */

	public static void getText(WebElement ele) throws Exception {
		try {
			ele.getText();
			System.out.println();

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name : verifySignInFunctionality(WebElement element) Purpose : To
	 * Verify SignInFunctionality Author : Date Created : 16/04/18 : Reviewed By :
	 */

	public boolean verifySignIn(WebElement Username, String usernamedata, WebElement Password, String string,
			WebElement SignInButton, WebElement element) throws Exception {
		try {

			enterValue(Username, usernamedata);
			Thread.sleep(2000);
			enterValue(Password, string);
			Thread.sleep(2000);
			ClickOnElement(SignInButton);
			Thread.sleep(2000);
			checkVisibilityOfElement(element);
			Thread.sleep(4);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name : clickandVerify() Purpose : To click and check the functionality
	 * Author : Date Created : 20/04/18
	 * 
	 */

	public boolean clickandVerify(WebElement eleclick, WebElement displayOfEle) throws Exception {
		try {

			ClickOnElement(eleclick);
			Thread.sleep(2);
			checkVisibilityOfElement(displayOfEle);
			Thread.sleep(4);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name : productCount() Purpose : To get count of Products in Anypage.
	 * Author : Date Created : 20/04/18
	 * 
	 */

	public int productCount(List<WebElement> Product) throws Exception {
		try {

			int size = Product.size();
			Thread.sleep(4);
			return size;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	/*
	 * Method Name : hoverAndClick() Purpose : To Hover and click Author : Date
	 * Created : 20/04/18
	 * 
	 */

	public boolean hoverAndClick(WebElement element, WebElement eleclick) throws Exception {
		try {
			onHoverForElement(element);
			ClickOnElement(eleclick);
			Thread.sleep(2);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name : validatePricesWithUpdateButtonInCart() Purpose : To Validate
	 * Prices In shopping Cart when Quantity update button is present Author : Date
	 * Created : 20/04/18
	 */
	public boolean verifyPriceWithUpdateButtonInCart(WebElement beforeUpdatePrice, WebElement quantityField,
			String quantityValue, WebElement updateButton) throws Exception {
		try {

			String beforeUpdate = beforeUpdatePrice.getText();
			int beforePrice = Integer.parseInt(beforeUpdate);
			enterValue(quantityField, quantityValue);
			ClickOnElement(updateButton);
			int quanValue = Integer.parseInt(quantityValue);
			Thread.sleep(3000);
			int actualPrice = beforePrice * quanValue;
			System.out.println("ActualPrice: " + actualPrice);
			String afterPriceFromPage = ""; // get
			int expPrice = Integer.parseInt(afterPriceFromPage);
			System.out.println("ExpPrice: " + expPrice);
			assertEquals(actualPrice, expPrice);
			Thread.sleep(2);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name : VerifyPDP_AddToBag() Purpose : To validate the functionality of
	 * pdp and adding items to cart . Date Created : 17/04/18
	 * 
	 */
	public boolean VerifyPDP_AddToBag(WebElement element, WebElement eleclick) throws Exception {
		try {
			checkVisibilityOfElement(element);
			ClickOnElement(eleclick);

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name : VerifyShipToAddress() Purpose : To validate the functionality
	 * of the ship to address button . Date Created : 17/04/18
	 * 
	 */
	public boolean VerifyShipToAddress(WebElement eleclick) throws Exception {
		try {
			ClickOnElement(eleclick);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name : VerifyPDP_AddWishToList() Purpose : To validate the
	 * functionality of the add to wish list . Date Created : 21/06/18
	 * 
	 */
	public boolean VerifyPDP_AddWishToList(WebElement element, WebElement addtowishlist) throws Exception {
		try {
			checkVisibilityOfElement(element);
			ClickOnElement(addtowishlist);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name : VerifyShipToStore() Purpose : To validate the functionality of
	 * the ship to store button . Date Created : 17/04/18
	 * 
	 */
	public boolean VerifyShipToStore(WebElement element, WebElement selectshiptostore, WebElement addtobag)
			throws Exception {
		try {
			ClickOnElement(selectshiptostore);
			ClickOnElement(addtobag);
			checkVisibilityOfElement(element);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name : VerifyCart() Purpose : To validate the functionality of the add
	 * to cart and bag . Date Created : 22/06/18
	 */
	public boolean VerifyCart(WebElement addtobag, WebElement checkbag) throws Exception {
		try {
			ClickOnElement(addtobag);
			checkVisibilityOfElement(checkbag);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name : VerifyRemove() Purpose : To validate the functionality of
	 * remove from bag button . Date Created : 17/04/18
	 * 
	 */
	public boolean VerifyRemove(WebElement incart, WebElement afterremove, WebElement eleclick) throws Exception {
		try {
			checkVisibilityOfElement(incart);
			ClickOnElement(eleclick);
			checkVisibilityOfElement(afterremove);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name : VerifyShareSocialMedia() Purpose : To validate the
	 * functionality of share on social media section . Date Created : 17/04/18
	 */
	public boolean VerifyShareSocialMedia(WebElement socialmedia) throws Exception {
		try {
			checkVisibilityOfElement(socialmedia);
			ClickOnElement(socialmedia);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name : VerifyAddQuantity() Purpose : To validate the functionality of
	 * add quantity on pdp . Date Created : 17/04/18
	 * 
	 */
	public boolean VerifyAddQuantity(WebElement quantity, WebElement element, String noofquantity) throws Exception {
		try {
			checkVisibilityOfElement(quantity);
			enterValue(element, noofquantity);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name : VerifyAppyCoupon() Purpose : To validate the functionality of
	 * the coupons . Date Created : 17/04/18
	 */
	public boolean VerifyAppyCoupon(WebElement applycoupon, String coupon, WebElement apply, WebElement afterapply)
			throws Exception {
		try {
			enterValue(applycoupon, coupon);
			ClickOnElement(apply);
			checkVisibilityOfElement(afterapply);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name : VerifyOrderSummary() Purpose : To validate the summary section.
	 * Date Created : 17/04/18
	 * 
	 */
	public boolean VerifyOrderSummary(WebElement item, WebElement quantity) throws Exception {
		try {
			checkVisibilityOfElement(item);
			checkVisibilityOfElement(quantity);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name : VerifyClearCart() Purpose : To validate the functionality of
	 * clearcart button . Date Created : 17/04/18
	 */
	public boolean VerifyClearCart(WebElement incart, WebElement afterremove, WebElement removeitem) throws Exception {
		try {
			checkVisibilityOfElement(incart);
			ClickOnElement(removeitem);
			checkVisibilityOfElement(afterremove);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name : VerifyCheckoutButton() Purpose : To validate the functionality
	 * of checkout button . Date Created : 17/04/18
	 * 
	 */
	public boolean VerifyCheckoutButton(WebElement checkout, WebElement afterclickoncheckout) throws Exception {
		try {
			checkVisibilityOfElement(checkout);
			ClickOnElement(checkout);
			checkVisibilityOfElement(afterclickoncheckout);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	/*
	 * Method Name : verifyForgotPasswordFunctionality() Purpose : To validate the
	 * functionality of the forgot password . Date Created : 17/04/18
	 */

	public boolean VerifyContinueShoppingLink(WebElement continueshopping, WebElement onplp) throws Exception {
		try {
			checkVisibilityOfElement(continueshopping);
			ClickOnElement(continueshopping);
			checkVisibilityOfElement(onplp);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	/*
	 * Method Name : VerifyProductItem() Purpose : To validate the
	 * functionality of the forgot password . Date Created : 17/04/18
	 * 
	 */

	public boolean VerifyProductItem(WebElement productitem) throws Exception {
		try {
			checkVisibilityOfElement(productitem);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	/*
	 * Method Name : VerifyChangePassword() Purpose : To validate the
	 * functionality of the change password . Date Created : 17/04/18
	 */

	public boolean VerifyChangePassword(WebElement incart, WebElement afterremove, WebElement eleclick)
			throws Exception {
		try {
			checkVisibilityOfElement(incart);
			ClickOnElement(eleclick);
			checkVisibilityOfElement(afterremove);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name : VerifyZipCode() Purpose : To validate the
	 * functionality of the zip code . Date Created : 17/04/18
	 */
	public boolean VerifyZipCode(WebElement zipcode) throws Exception {
		try {
			checkVisibilityOfElement(zipcode);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	/*
	 * Method Name : VerifyUseMyLocation() Purpose : To validate the
	 * functionality of the use my location . Date Created : 17/04/18
	 */

	public boolean VerifyUseMyLocation(WebElement usemylocation) throws Exception {
		try {
			checkVisibilityOfElement(usemylocation);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name : VerifyFindStoreButton() Purpose : To validate the
	 * functionality of the find store button . Date Created : 17/04/18
	 * 
	 */
	public boolean VerifyFindStoreButton(WebElement findstorebutton) throws Exception {
		try {
			checkVisibilityOfElement(findstorebutton);
			ClickOnElement(findstorebutton);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name : VerifySetMyStore() Purpose : To validate the
	 * functionality of the set my store . Date Created : 17/04/18
	 */
	public boolean VerifySetMyStore(WebElement setstore) throws Exception {
		try {
			checkVisibilityOfElement(setstore);
			ClickOnElement(setstore);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name : VerifyStoreCount() Purpose : To validate the
	 * number of store . Date Created : 17/04/18
	 * 
	 */
	public int VerifyStoreCount(List<WebElement> storecount) throws Exception {
		try {

			int size = storecount.size();
			Thread.sleep(4);
			return size;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name : VerifyMap() Purpose : To validate the
	 * functionality of the map . Date Created : 17/04/18
	 */
	public boolean VerifyMap(WebElement map) throws Exception {
		try {
			checkVisibilityOfElement(map);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name : VerifyShippingAddress() Purpose : To validate the
	 * functionality of the shipping address . Date Created : 17/04/18
	 * 
	 */
	public boolean VerifyShippingAddress(WebElement shippingaddress) throws Exception {
		try {
			checkVisibilityOfElement(shippingaddress);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name : SelectShippingMethodStandard() Purpose : To validate the
	 * functionality of the shipping method standard . Date Created : 17/04/18
	 */
	public boolean SelectShippingMethodStandard(WebElement standardshippingmethod) throws Exception {
		try {
			checkVisibilityOfElement(standardshippingmethod);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name : SelectShippingMethodNextDay() Purpose : To validate the
	 * functionality of the  . Date Created : 17/04/18
	 * 
	 */
	public boolean SelectShippingMethodNextDay(WebElement shippingnextday) throws Exception {
		try {
			checkVisibilityOfElement(shippingnextday);
			ClickOnElement(shippingnextday);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name : verifyForgotPasswordFunctionality() Purpose : To validate the
	 * functionality of the forgot password . Date Created : 17/04/18
	 */
	public boolean SelectShippingMethodWithinTwoDays(WebElement shippingwithintwodays) throws Exception {
		try {
			checkVisibilityOfElement(shippingwithintwodays);
			ClickOnElement(shippingwithintwodays);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name : verifyForgotPasswordFunctionality() Purpose : To validate the
	 * functionality of the forgot password . Date Created : 17/04/18
	 * 
	 */
	public boolean VerifyCheckoutSignIn(WebElement checkoutsignin) throws Exception {
		try {
			checkVisibilityOfElement(checkoutsignin);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name : verifyForgotPasswordFunctionality() Purpose : To validate the
	 * functionality of the forgot password . Date Created : 17/04/18
	 */
	public boolean VerifyBackToShoppingCart(WebElement backtoshpppingcart) throws Exception {
		try {
			checkVisibilityOfElement(backtoshpppingcart);
			ClickOnElement(backtoshpppingcart);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name : verifyForgotPasswordFunctionality() Purpose : To validate the
	 * functionality of the forgot password . Date Created : 17/04/18
	 * 
	 */
	public boolean VerifyCreditCardOption(WebElement creditcardoption) throws Exception {
		try {
			checkVisibilityOfElement(creditcardoption);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name : verifyForgotPasswordFunctionality() Purpose : To validate the
	 * functionality of the forgot password . Date Created : 17/04/18
	 */
	public boolean VerifyPaypalOption(WebElement paypaloption) throws Exception {
		try {
			checkVisibilityOfElement(paypaloption);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name : verifyForgotPasswordFunctionality() Purpose : To validate the
	 * functionality of the forgot password . Date Created : 17/04/18
	 */
	public boolean VerifyDebitCardOption(WebElement debitcardoption) throws Exception {
		try {
			checkVisibilityOfElement(debitcardoption);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name : verifyForgotPasswordFunctionality() Purpose : To validate the
	 * functionality of the forgot password . Date Created : 17/04/18
	 * 
	 */
	public boolean VerifyVisaCard(WebElement visacard) throws Exception {
		try {
			checkVisibilityOfElement(visacard);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name : verifyForgotPasswordFunctionality() Purpose : To validate the
	 * functionality of the forgot password . Date Created : 17/04/18
	 */
	public boolean VerifyMasterCard(WebElement mastercard) throws Exception {
		try {
			checkVisibilityOfElement(mastercard);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name : verifyForgotPasswordFunctionality() Purpose : To validate the
	 * functionality of the forgot password . Date Created : 17/04/18
	 * 
	 */
	public boolean VerifyDiscoverCard(WebElement discovercard) throws Exception {
		try {
			checkVisibilityOfElement(discovercard);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name : verifyForgotPasswordFunctionality() Purpose : To validate the
	 * functionality of the forgot password . Date Created : 17/04/18
	 */
	public boolean VerifyAmericanExpressCard(WebElement americanexpresscard) throws Exception {
		try {
			checkVisibilityOfElement(americanexpresscard);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name : verifyForgotPasswordFunctionality() Purpose : To validate the
	 * functionality of the forgot password . Date Created : 17/04/18
	 */
	public boolean VerifyEditShippingAddress(WebElement americanexpresscard) throws Exception {
		try {
			checkVisibilityOfElement(americanexpresscard);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name : verifyForgotPasswordFunctionality() Purpose : To validate the
	 * functionality of the forgot password . Date Created : 17/04/18
	 */
	public boolean VerifyAppyCouponInCheckout(WebElement applycoupon) throws Exception {
		try {
			checkVisibilityOfElement(applycoupon);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name :verifySiteLogo() Purpose : To validate the logo present in the
	 * Home page of site Date Created : 17/04/18 Reviewed By :
	 */

	public boolean verifySiteLogo(WebElement ele) throws Exception {
		try {
			checkVisibilityOfElement(ele);
			System.out.println();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name :clickSiteLogo() Purpose : To validate the functionality of the
	 * logo in the homepage Date Created : 17/04/18
	 *
	 */

	public boolean clickSiteLogo(WebElement ele) throws Exception {
		try {
			ClickOnElement(ele);
			System.out.println();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name :verifySignInButton() Purpose : To validate the signIn link
	 * present in theHome page Date Created : 17/04/18
	 * 
	 */

	public boolean verifySignInButton(WebElement ele) throws Exception {
		try {
			checkVisibilityOfElement(ele);
			System.out.println();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	/*
	 * Method Name :clickSignInButton() Purpose : To validate the functionality of
	 * the signIn Date Created : 17/04/18 *
	 */

	public boolean clickSignInButton(WebElement ele) throws Exception {
		try {
			ClickOnElement(ele);
			System.out.println();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	/*
	 * Method Name :verifySignOutButton() Purpose : To validate the signOut link
	 * present in theHome page Date Created : 17/04/18
	 *
	 */

	public boolean verifySignOutButton(WebElement ele) throws Exception {
		try {
			checkVisibilityOfElement(ele);
			System.out.println();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name :clickSignOutButton() Purpose : To validate the functionality of
	 * the signOut link in the Home page Date Created : 17/04/18
	 * 
	 */

	public boolean clickSignOutButton(WebElement ele) throws Exception {
		try {
			ClickOnElement(ele);
			System.out.println();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * 
	 * Method Name : verifyCartButton() Purpose : To validate the cart button
	 * present in the Homepage Date Created : 17/04/18
	 * 
	 */

	public boolean verifyCartButton(WebElement ele) throws Exception {
		try {
			checkVisibilityOfElement(ele);
			System.out.println();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * 
	 * Method Name :clickCartButton() Purpose : To validate the functionality of the
	 * cart button in the Home page Date Created : 17/04/18
	 * 
	 */

	public boolean clickCartButton(WebElement ele) throws Exception {
		try {
			ClickOnElement(ele);
			System.out.println();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * 
	 * Method Name :verifyHeroBanner() Purpose : To validate the Hero banner present
	 * in the Homepage Date Created : 17/04/18
	 * 
	 */

	public boolean verifyHeroBanner(WebElement ele) throws Exception {
		try {
			checkVisibilityOfElement(ele);
			System.out.println();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name : clickHeroBanner() Purpose : To validate the functionality of
	 * the Hero banner in the Home page Date Created : 17/04/18
	 */
	public boolean clickHeroBanner(WebElement ele) throws Exception {
		try {
			ClickOnElement(ele);
			System.out.println();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	/*
	 * Method Name : verifyPromoBanner() Purpose : To validate the promo banner
	 * present in the Home page Date Created : 17/04/18 By :
	 * 
	 */

	public boolean verifyPromoBanner(WebElement ele) throws Exception {
		try {
			checkVisibilityOfElement(ele);
			System.out.println();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	/*
	 * Method Name :clickPromoBanner() Purpose : To validate the Hero banner present
	 * in the Homepage Date Created : 17/04/18
	 */

	public boolean clickPromoBanner(WebElement ele) throws Exception {
		try {
			ClickOnElement(ele);
			System.out.println();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name : verifySearchBox() Purpose : To validate the search box present
	 * in the Home page Date Created : 18/04/18
	 */

	public boolean verifySearchBox(WebElement ele) throws Exception {
		try {
			checkVisibilityOfElement(ele);
			System.out.println();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name : enterSearchBox() Purpose : To validate the functionality of the
	 * search box in the Home page Date Created : 18/04/18
	 * 
	 */

	public boolean enterSearchBox(WebElement ele, String name) throws Exception {
		try {
			enterValue(ele, name);
			System.out.println();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name : verifySiteEntryPopUp() Purpose : To validate the site entry pop
	 * up present in the Home page Date Created : 18/04/18
	 */

	public boolean verifySiteEntryPopUp(WebElement ele) throws Exception {
		try {
			checkVisibilityOfElement(ele);
			System.out.println();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name : closeSiteEntryPopUp() Purpose : To validate the functionality
	 * of the site enter search box in the Home page Date Created : 18/04/18
	 */

	public boolean closeSiteEntryPopUp(WebElement ele) throws Exception {
		try {
			ClickOnElement(ele);
			System.out.println();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name : closeSiteEntryPopUp() Purpose : To validate the functionality
	 * of the site enter search box in the Home page Date Created : 18/04/18
	 */
	public boolean verifyStoreFinder_Naviagtion(WebElement eleclick, WebElement displayOfElement) throws Exception {
		try {

			checkVisibilityOfElement(displayOfElement);
			ClickOnElement(eleclick);
			Thread.sleep(2);
			checkVisibilityOfElement(displayOfElement);
			Thread.sleep(4);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * 
	 * Method Name :verifyHeroBanner() Purpose : To validate the Hero banner present
	 * in the Homepage Date Created : 17/04/18
	 * 
	 */
	public boolean verifyAboutUs_Navigation(WebElement eleclick, WebElement displayOfElement, WebElement aboutOfElement)
			throws Exception {
		try {

			checkVisibilityOfElement(displayOfElement);
			ClickOnElement(eleclick);
			Thread.sleep(2);
			checkVisibilityOfElement(aboutOfElement);
			Thread.sleep(4);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * 
	 * Method Name :verifyHeroBanner() Purpose : To validate the Hero banner present
	 * in the Homepage Date Created : 17/04/18
	 * 
	 */
	public boolean VerifySocialMedia_Navigation(WebElement eleclick, WebElement displayOfElement,
			WebElement displayOfElement1, WebElement displayOfElement2, WebElement displayOfElement3,
			WebElement socialOfElement) throws Exception {
		try {

			checkVisibilityOfElement(displayOfElement);
			checkVisibilityOfElement(displayOfElement1);
			checkVisibilityOfElement(displayOfElement2);
			checkVisibilityOfElement(displayOfElement3);
			ClickOnElement(eleclick);
			Thread.sleep(2);
			checkVisibilityOfElement(socialOfElement);
			Thread.sleep(4);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name :verifyHeroBanner() Purpose : To validate the Hero banner present
	 * in the Homepage Date Created : 17/04/18
	 */
	public boolean VerifySignUpDeals(WebElement eleclick, WebElement displayOfElement, WebElement signupOfElement)
			throws Exception {
		try {

			checkVisibilityOfElement(displayOfElement);
			checkVisibilityOfElement(signupOfElement);
			Thread.sleep(4);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name :verifyHeroBanner() Purpose : To validate the Hero banner present
	 * in the Homepage Date Created : 17/04/18
	 */
	public boolean verifyContactUs_Navigation(WebElement eleclick, WebElement displayOfElement,
			WebElement contactOfElement) throws Exception {
		try {

			checkVisibilityOfElement(displayOfElement);
			ClickOnElement(eleclick);
			Thread.sleep(2);
			checkVisibilityOfElement(contactOfElement);
			Thread.sleep(4);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name :verifyHeroBanner() Purpose : To validate the Hero banner present
	 * in the Homepage Date Created : 17/04/18
	 */
	public boolean VerifyChangeCountry(WebElement eleclick, WebElement displayOfElement, WebElement countryOfElement)
			throws Exception {
		try {

			checkVisibilityOfElement(displayOfElement);
			ClickOnElement(eleclick);
			Thread.sleep(2);
			checkVisibilityOfElement(countryOfElement);
			Thread.sleep(4);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name :verifyHeroBanner() Purpose : To validate the Hero banner present
	 * in the Homepage Date Created : 17/04/18
	 */
	public boolean VerifyPrivacyPolicyLink_Navigation(WebElement eleclick, WebElement displayOfElement,
			WebElement policyOfElement) throws Exception {
		try {

			checkVisibilityOfElement(displayOfElement);
			ClickOnElement(eleclick);
			Thread.sleep(2);
			checkVisibilityOfElement(policyOfElement);
			Thread.sleep(4);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name :verifyHeroBanner() Purpose : To validate the Hero banner present
	 * in the Homepage Date Created : 17/04/18
	 */
	public boolean VerifyTermsLink_Navigation(WebElement eleclick, WebElement displayOfElement,
			WebElement termsOfElement) throws Exception {
		try {

			checkVisibilityOfElement(displayOfElement);
			ClickOnElement(eleclick);
			Thread.sleep(2);
			checkVisibilityOfElement(termsOfElement);
			Thread.sleep(4);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name :verifyHeroBanner() Purpose : To validate the Hero banner present
	 * in the Homepage Date Created : 17/04/18
	 */
	public boolean verifySignUp(WebElement eleclick, WebElement displayOfElement, WebElement signupOfElement)
			throws Exception {
		try {

			checkVisibilityOfElement(displayOfElement);
			ClickOnElement(eleclick);
			Thread.sleep(2);
			checkVisibilityOfElement(signupOfElement);
			Thread.sleep(4);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name :verifyHeroBanner() Purpose : To validate the Hero banner present
	 * in the Homepage Date Created : 17/04/18
	 */
	public boolean verifySignUpWithEmailButton(WebElement eleclick, WebElement displayOfElement,
			WebElement signupOfElementpage) throws Exception {
		try {

			checkVisibilityOfElement(displayOfElement);
			ClickOnElement(eleclick);
			Thread.sleep(2);
			checkVisibilityOfElement(signupOfElementpage);
			Thread.sleep(4);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name :verifyHeroBanner() Purpose : To validate the Hero banner present
	 * in the Homepage Date Created : 17/04/18
	 */
	public boolean verifySignInLink_Navigation(WebElement eleclick, WebElement displayOfElement,
			WebElement signinOfElementpage) throws Exception {
		try {

			checkVisibilityOfElement(displayOfElement);
			ClickOnElement(eleclick);
			Thread.sleep(2);
			checkVisibilityOfElement(signinOfElementpage);
			Thread.sleep(4);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * 
	 * Method Name :verifyHeroBanner() Purpose : To validate the Hero banner present
	 * in the Homepage Date Created : 17/04/18
	 * 
	 */
	public boolean verifySignInWithEmail(WebElement errormsg, WebElement eleclick, WebElement element1,
			WebElement element2, String username, String password) throws Exception {
		try {

			enterValue(element1, username);
			enterValue(element2, password);
			ClickOnElement(eleclick);
			Thread.sleep(2);
			checkVisibilityOfElement(errormsg);
			Thread.sleep(4);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * 
	 * Method Name :verifyHeroBanner() Purpose : To validate the Hero banner present
	 * in the Homepage Date Created : 17/04/18
	 * 
	 */
	public boolean verifyRegistrationLink_Navigation(WebElement eleclick, WebElement displayOfElement,
			WebElement registrationOfElementpage) throws Exception {
		try {

			checkVisibilityOfElement(displayOfElement);
			ClickOnElement(eleclick);
			Thread.sleep(2);
			checkVisibilityOfElement(registrationOfElementpage);
			Thread.sleep(4);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name :verifyHeroBanner() Purpose : To validate the Hero banner present
	 * in the Homepage Date Created : 17/04/18
	 */
	public boolean verifyPLP_Price(WebElement productprice) throws Exception {
		try {

			Thread.sleep(2);
			checkVisibilityOfElement(productprice);
			Thread.sleep(4);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name :verifyHeroBanner() Purpose : To validate the Hero banner present
	 * in the Homepage Date Created : 17/04/18
	 */
	public boolean verifyPLP_Reviews(WebElement eleclick, WebElement displayOfElement, WebElement reviewlink)
			throws Exception {
		try {

			checkVisibilityOfElement(displayOfElement);
			ClickOnElement(eleclick);
			Thread.sleep(2);
			checkVisibilityOfElement(reviewlink);
			Thread.sleep(4);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name :verifyHeroBanner() Purpose : To validate the Hero banner present
	 * in the Homepage Date Created : 22/06/18
	 */
	public boolean verifySort(WebElement eleclick, WebElement displayOfElement, WebElement sortoption)
			throws Exception {
		try {

			checkVisibilityOfElement(displayOfElement);
			ClickOnElement(eleclick);
			Thread.sleep(2);
			checkVisibilityOfElement(sortoption);
			Thread.sleep(4);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name :verifyHeroBanner() Purpose : To validate the Hero banner present
	 * in the Homepage Date Created : 22/06/18
	 */
	public boolean verifyBrandFilter(WebElement eleclick, WebElement displayOfElement, WebElement brandfilter)
			throws Exception {
		try {

			checkVisibilityOfElement(displayOfElement);
			ClickOnElement(eleclick);
			Thread.sleep(2);
			checkVisibilityOfElement(brandfilter);
			Thread.sleep(4);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name :verifyHeroBanner() Purpose : To validate the Hero banner present
	 * in the Homepage Date Created : 22/06/18
	 */
	public boolean VerifyPriceFilter(WebElement eleclick, WebElement displayOfElement, WebElement pricefilter)
			throws Exception {
		try {

			checkVisibilityOfElement(displayOfElement);
			ClickOnElement(eleclick);
			Thread.sleep(2);
			checkVisibilityOfElement(pricefilter);
			Thread.sleep(4);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name :verifyHeroBanner() Purpose : To validate the Hero banner present
	 * in the Homepage Date Created : 17/04/18
	 */
	public boolean verifyPLP_AddToBag(WebElement eleclick, WebElement displayOfElement, WebElement addtobag)
			throws Exception {
		try {

			checkVisibilityOfElement(displayOfElement);
			ClickOnElement(eleclick);
			Thread.sleep(2);
			checkVisibilityOfElement(addtobag);
			Thread.sleep(4);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name :verifyHeroBanner() Purpose : To validate the Hero banner present
	 * in the Homepage Date Created : 22/06/18
	 */
	public boolean verifyQuickView(WebElement eleclick, WebElement displayOfElement, WebElement quickview)
			throws Exception {
		try {

			checkVisibilityOfElement(displayOfElement);
			ClickOnElement(eleclick);
			Thread.sleep(2);
			checkVisibilityOfElement(quickview);
			Thread.sleep(4);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name :verifyHeroBanner() Purpose : To validate the Hero banner present
	 * in the Homepage Date Created : 22/06/18
	 */
	public boolean VerifyPLP_Image(WebElement eleclick, WebElement displayOfElement, WebElement prodImage)
			throws Exception {
		try {

			checkVisibilityOfElement(displayOfElement);
			ClickOnElement(eleclick);
			Thread.sleep(2);
			checkVisibilityOfElement(prodImage);
			Thread.sleep(4);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name :verifyHeroBanner() Purpose : To validate the Hero banner present
	 * in the Homepage Date Created : 17/04/18
	 */
	public boolean VerifyPLP_PageNavigation(WebElement eleclick, WebElement displayOfElement, WebElement naviagtion)
			throws Exception {
		try {

			checkVisibilityOfElement(displayOfElement);
			ClickOnElement(eleclick);
			Thread.sleep(2);
			checkVisibilityOfElement(naviagtion);
			Thread.sleep(4);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name :verifyHeroBanner() Purpose : To validate the Hero banner present
	 * in the Homepage Date Created : 22/06/18
	 */
	public boolean VerifyPDP(WebElement eleclick, WebElement displayOfElement, WebElement productpage)
			throws Exception {
		try {

			checkVisibilityOfElement(displayOfElement);
			ClickOnElement(eleclick);
			Thread.sleep(2);
			checkVisibilityOfElement(productpage);
			Thread.sleep(4);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name :verifyHeroBanner() Purpose : To validate the Hero banner present
	 * in the Homepage Date Created : 17/04/18
	 */
	public boolean verifyPDP_Quantity(WebElement eleclick, WebElement displayOfElement, WebElement producttitle,
			String quantity) throws Exception {
		try {

			checkVisibilityOfElement(displayOfElement);
			eleclick.sendKeys(quantity);
			Thread.sleep(2);
			checkVisibilityOfElement(producttitle);
			Thread.sleep(4);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name :verifyHeroBanner() Purpose : To validate the Hero banner present
	 * in the Homepage Date Created : 22/06/18
	 */
	public boolean verifyPDP_ProductColor(WebElement categoryName, String CATEGORY1, String CATEGORY2)
			throws Exception {
		try {

			WebElement CATEGORY = LaunchBrowser.getDriver().findElement(By.xpath(CATEGORY1 + categoryName + CATEGORY2));
			CATEGORY.click();
			Thread.sleep(4);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	/*
	 * Method Name :verifyHeroBanner() Purpose : To validate the Hero banner present
	 * in the Homepage Date Created : 17/04/18
	 */

	public boolean verifyEditEmail(WebElement eleclick, WebElement displayOfElement, WebElement email)
			throws Exception {
		try {

			checkVisibilityOfElement(displayOfElement);
			ClickOnElement(eleclick);
			Thread.sleep(2);
			checkVisibilityOfElement(email);
			Thread.sleep(4);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name :verifyHeroBanner() Purpose : To validate the Hero banner present
	 * in the Homepage Date Created : 22/06/18
	 */
	public boolean verifyOrderHistory(WebElement eleclick, WebElement displayOfElement, WebElement orderhistory)
			throws Exception {
		try {

			checkVisibilityOfElement(displayOfElement);
			ClickOnElement(eleclick);
			Thread.sleep(2);
			checkVisibilityOfElement(orderhistory);
			Thread.sleep(4);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name :verifyHeroBanner() Purpose : To validate the Hero banner present
	 * in the Homepage Date Created : 22/06/18
	 */
	public boolean verifyEditProfile(WebElement eleclick, WebElement displayOfElement, WebElement editprofile)
			throws Exception {
		try {

			checkVisibilityOfElement(displayOfElement);
			ClickOnElement(eleclick);
			Thread.sleep(2);
			checkVisibilityOfElement(editprofile);
			Thread.sleep(4);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name :verifyHeroBanner() Purpose : To validate the Hero banner present
	 * in the Homepage Date Created : 22/06/18
	 */
	public boolean verifyEditAddress(WebElement eleclick, WebElement displayOfElement, WebElement editadddress)
			throws Exception {
		try {

			checkVisibilityOfElement(displayOfElement);
			ClickOnElement(eleclick);
			Thread.sleep(2);
			checkVisibilityOfElement(editadddress);
			Thread.sleep(4);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name :verifyHeroBanner() Purpose : To validate the Hero banner present
	 * in the Homepage Date Created : 22/06/18
	 */
	public boolean verifyZipCode(WebElement eleclick, WebElement displayOfElement, WebElement zipcode)
			throws Exception {
		try {

			checkVisibilityOfElement(displayOfElement);
			ClickOnElement(eleclick);
			Thread.sleep(2);
			checkVisibilityOfElement(zipcode);
			Thread.sleep(4);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name :verifyHeroBanner() Purpose : To validate the Hero banner present
	 * in the Homepage Date Created : 22/06/18
	 */
	public boolean verifyUseMyLocation(WebElement eleclick, WebElement displayOfElement, WebElement mylocation)
			throws Exception {
		try {

			checkVisibilityOfElement(displayOfElement);
			ClickOnElement(eleclick);
			Thread.sleep(2);
			checkVisibilityOfElement(mylocation);
			Thread.sleep(4);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Method Name :verifyHeroBanner() Purpose : To validate the Hero banner present
	 * in the Homepage Date Created : 22/06/18
	 */
	public boolean VerifyFindStoreButton(WebElement eleclick, WebElement displayOfElement, WebElement findstore)
			throws Exception {
		try {

			checkVisibilityOfElement(displayOfElement);
			ClickOnElement(eleclick);
			Thread.sleep(2);
			checkVisibilityOfElement(findstore);
			Thread.sleep(4);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	/*
	 * Method Name :VerifyPlaceOrderButton() Purpose : To validate the Hero banner present
	 * in the Homepage Date Created : 22/06/18
	 */
	public boolean VerifyPlaceOrderButton(WebElement eleclick, WebElement displayOfElement, WebElement findstore)
			throws Exception {
		try {

			checkVisibilityOfElement(displayOfElement);
			ClickOnElement(eleclick);
			Thread.sleep(2);
			checkVisibilityOfElement(findstore);
			Thread.sleep(4);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	/*
	 * Method Name :verifyHeroBanner() Purpose : To validate the Hero banner present
	 * in the Homepage Date Created : 22/06/18
	 */
	public boolean verifyHeroBanner(WebElement eleclick, WebElement displayOfElement, WebElement findstore)
			throws Exception {
		try {

			checkVisibilityOfElement(displayOfElement);
			ClickOnElement(eleclick);
			Thread.sleep(2);
			checkVisibilityOfElement(findstore);
			Thread.sleep(4);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	/*
	 * Method Name :VerifySameAsShippingAddressButton() 
	 * Purpose : To validate the same as shipping address button present Date Created : 22/06/18
	 */
	public boolean VerifySameAsShippingAddressButton(WebElement eleclick, WebElement displayOfElement, WebElement findstore)
			throws Exception {
		try {

			checkVisibilityOfElement(displayOfElement);
			ClickOnElement(eleclick);
			Thread.sleep(2);
			checkVisibilityOfElement(findstore);
			Thread.sleep(4);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	/*
	 * Method Name :verifyHeroBanner() Purpose : To validate the checkout button is present
	 *  Date Created : 22/06/18
	 */
	public boolean VerifyGuestCheckoutButton(WebElement eleclick, WebElement displayOfElement, WebElement findstore)
			throws Exception {
		try {

			checkVisibilityOfElement(displayOfElement);
			ClickOnElement(eleclick);
			Thread.sleep(2);
			checkVisibilityOfElement(findstore);
			Thread.sleep(4);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	/*
	 * Method Name :verifyHeroBanner() Purpose : To validate the Hero banner present
	 * in the Homepage Date Created : 22/06/18
	 */
	public boolean VerifySignInCheckout(WebElement eleclick, WebElement displayOfElement, WebElement findstore)
			throws Exception {
		try {

			checkVisibilityOfElement(displayOfElement);
			ClickOnElement(eleclick);
			Thread.sleep(2);
			checkVisibilityOfElement(findstore);
			Thread.sleep(4);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	/*
	 * Method Name :VerifyCheckoutOrderSummary() Purpose : To validate the checkout order summary is present
	 *  Date Created : 22/06/18
	 */
	public boolean VerifyCheckoutOrderSummary(WebElement eleclick, WebElement displayOfElement, WebElement findstore)
			throws Exception {
		try {

			checkVisibilityOfElement(displayOfElement);
			Thread.sleep(2);
			checkVisibilityOfElement(findstore);
			Thread.sleep(4);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
