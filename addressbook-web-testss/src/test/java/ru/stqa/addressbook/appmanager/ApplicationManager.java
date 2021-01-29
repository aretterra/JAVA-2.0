package ru.stqa.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    private SessionHelper sessionHelper;
    WebDriver driver;
    private NumberHelper numberHelper;
    private GroupHelper groupHelper;
    public StringBuffer verificationErrors = new StringBuffer();
    private String browser;

    public ApplicationManager(String browser) {
        this.browser = browser;
    }


    public void init() {
        if (browser.equals(BrowserType.FIREFOX)){
            driver = new FirefoxDriver();
        }else if (browser.equals(BrowserType.CHROME)){
            driver = new ChromeDriver();
        }else driver = new InternetExplorerDriver();

        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        sessionHelper = new SessionHelper(driver);
        numberHelper = new NumberHelper(driver);
        groupHelper = new GroupHelper(driver);
        sessionHelper.login("admin", "secret");
    }

    public void stop() {
        driver.quit();
    }

    private boolean isElementPresent(By by) {
      try {
        driver.findElement(by);
        return true;
      } catch (NoSuchElementException e) {
        return false;
      }
    }

    private boolean isAlertPresent() {
      try {
        driver.switchTo().alert();
        return true;
      } catch (NoAlertPresentException e) {
        return false;
      }
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NumberHelper getNumberHelper() {
        return numberHelper;
    }

    public SessionHelper getSessionHelper() {
        return sessionHelper;
    }
}
