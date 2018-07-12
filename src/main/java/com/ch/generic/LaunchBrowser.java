package com.ch.generic;

import java.io.File;
import java.util.concurrent.TimeUnit;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.ch.excelutils.PropertyLibrary;
import com.ch.listeners.TestReporter;
/**
 * Purpose : This class contains methods to launch the browser, navigate to url and close the browser.
 */
public class LaunchBrowser extends TestReporter implements IInvokedMethodListener, AutomationConstants
{
    public static long                    timeout;
    public static String                  url;
    public static String                  browserType;

    private static final ThreadLocal<WebDriver> webDriver = new ThreadLocal<WebDriver>();

    @Override
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult)
    {
        boolean beforeMethodConfiguration = method.isTestMethod();
        if (beforeMethodConfiguration)
        {
            try
            {
                resetWebDriver();
            } catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void afterInvocation(IInvokedMethod method, ITestResult testResult)
    {
        if (method.isTestMethod())
        {
            try
            {
                quitDriver();
            } catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }

    private static void quitDriver() throws Exception
    {
        WebDriver driver = getDriver();
        boolean b = driver != null;
        if (b)
        {
            driver.quit();
            driver = null;
        }
    }
    

    public static void setWebDriver(WebDriver driver)
    {
        webDriver.set(driver);
    }

    public static void resetWebDriver() throws Exception
    {
        quitDriver();
        System.out.println("*********************************");
        WebDriver driver;
        driver = launchBrowser();
        setWebDriver(driver);
    }

    public static WebDriver launchBrowser() throws Exception
    {
        try
        {
            WebDriver webdriver = null;
            File fXmlFile = new File("./pom.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);
            doc.getDocumentElement().normalize();
            NodeList nList = doc.getElementsByTagName("properties");
            System.out.println("----------------------------");
            for (int temp = 0; temp < nList.getLength(); temp++)
            {
                Node nNode = nList.item(temp);
                if (nNode.getNodeType() == Node.ELEMENT_NODE)
                {
                    Element eElement = (Element) nNode;
                    String GL_TEST_PLATFORM = eElement.getElementsByTagName("Application.Platform").item(0)
                            .getTextContent();
                    String GL_TEST_BROWSER = eElement.getElementsByTagName("Application.Browser").item(0)
                            .getTextContent();
                    System.out.println("*********** Initialising Framework ***********");
                    browserType = GL_TEST_BROWSER;
                    timeout = Long.parseLong((PropertyLibrary.getPropertyValue(CONFIG_PATH + CONFIG_FILE, "IMPLICIT")));
                    System.out.println("Browser  :  ----" + browserType + "----");
                    if (browserType.equalsIgnoreCase("Google Chrome"))
                    {
                        System.setProperty(CHROME_KEY, DRIVER_PATH + CHROME_FILE);
                        ChromeOptions option = new ChromeOptions();
                        option.addArguments("disable-infobars");
                        webdriver = new ChromeDriver(option);

                    } else if (browserType.equalsIgnoreCase("Internet Explorer"))
                    {
                        System.setProperty(IE_KEY, DRIVER_PATH + IE_FILE);
                        webdriver = new InternetExplorerDriver();
                    } else if (browserType.equalsIgnoreCase("Mozilla Firefox"))
                    {
                        System.setProperty(GECKO_KEY, DRIVER_PATH + GECKO_FILE);
                        webdriver = new FirefoxDriver();
                    }
                    webdriver.manage().window().maximize();
                    System.out.println("TimeOut:" + timeout);
                    webdriver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
                    System.out.println("Browser Variable: " + GL_TEST_BROWSER);
                    System.out.println("Platform Variable: " + GL_TEST_PLATFORM);
                    System.out.println("Browser launched and maximized Successfully");
                    Reporter.log("Browser launched successfully");
                }
            }
            return webdriver;
        } catch (Exception e)
        {
            e.printStackTrace();
            throw e;
        }
    }

    /*
     * **************************************************** 
     * Method Name : navigateToUrl(String url) 
     * Purpose : To naviate for the specified url
     * Author : Shiva 
     * Date Created : 09/02/18 
     * Date Modified : 
     * Reviewed By : CH
     * ******************************************************
     */

    public static boolean navigateToUrl() throws Exception
    {
        try
        {
            File fXmlFile = new File("./pom.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);
            doc.getDocumentElement().normalize();
            NodeList nList = doc.getElementsByTagName("properties");
            for (int temp = 0; temp < nList.getLength(); temp++)
            {
                Node nNode = nList.item(temp);
                if (nNode.getNodeType() == Node.ELEMENT_NODE)
                {
                    Element eElement = (Element) nNode;
                    String GL_TEST_URL = eElement.getElementsByTagName("Application.URL").item(0).getTextContent();
                    url = GL_TEST_URL;
                    getDriver().navigate().to(url);
                    System.out.println("URL :  ----" + url + "----");
                    System.out.println("Navigated to url Specified");
                    Reporter.log("User navigated to DXL site");
                }
            }
            return true;
        } catch (Exception e)
        {
            e.printStackTrace();
            Reporter.log("User is not navigated to DXL UAT site<br>");
            throw e;
        }
    }

    /*
     * **************************************************** 
     * Method Name : close() 
     * Purpose : To terminate the browser 
     * Author : Shiva 
     * Date Created :09/02/18 
     * Date Modified : 
     * Reviewed By :
     * ******************************************************
     */

    public static void close() throws Exception
    {
        try
        {
            System.out.println("********Finalising Frmework********");
            webDriver.get().quit();
            System.out.println("********Browser Terminated********");
        } catch (Exception e)
        {
            e.printStackTrace();
            throw e;
        }
    }

    /*
     * ****************************************************
     *  Method Name :close() 
     *  Purpose : To terminate the browser
     *  Author : Shiva 
     *  Date Created :09/02/18 
     *  Date Modified : 
     *  Reviewed By :
     * ******************************************************
     */

    public boolean waitForElement() throws Exception
    {
        try
        {
            Thread.sleep(3000);
            return true;
        } catch (Exception e)
        {
            e.printStackTrace();
            throw e;
        }
    }

    public static final WebDriver getDriver()
    {
        return webDriver.get();
    }
    
    
    


}