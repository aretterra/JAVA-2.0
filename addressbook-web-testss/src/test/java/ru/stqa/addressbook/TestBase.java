package ru.stqa.addressbook;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.mustache.Value;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

public class TestBase {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    private static WebDriver getFirefoxDriver(){
      System.setProperty("webdriver.gecko.driver",
              "c://geckodriver.exe");
      return new FirefoxDriver();
    }

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
      driver = TestBase.getFirefoxDriver();
      baseUrl = "https://www.google.com/";
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      login("admin", "secret");
    }

    private void login(String login, String password) {
      driver.get("http://localhost/addressbook/");
      driver.findElement(By.name("user")).click();
      driver.findElement(By.name("user")).sendKeys(login);
      driver.findElement(By.name("pass")).click();
      driver.findElement(By.name("pass")).sendKeys(password);
      driver.findElement(By.xpath("//input[@value='Login']")).click();
    }

    protected void fiilGroupForm(GroupDate groupDate) {
      driver.findElement(By.name("group_name")).click();
      driver.findElement(By.name("group_name")).clear();
      driver.findElement(By.name("group_name")).sendKeys(groupDate.getName());
      driver.findElement(By.name("group_header")).click();
      driver.findElement(By.name("group_header")).clear();
      driver.findElement(By.name("group_header")).sendKeys(groupDate.getHeader());
      driver.findElement(By.name("group_footer")).click();
      driver.findElement(By.name("group_footer")).clear();
      driver.findElement(By.name("group_footer")).sendKeys(groupDate.getFooter());
      driver.findElement(By.name("submit")).click();
    }

    protected void createNewGroupButton(String s) {
      driver.findElement(By.name(s)).click();
    }

    protected void goToGroupCreation(String groups) {
      driver.findElement(By.linkText(groups)).click();
    }

    protected void submitNumberCreation(String s) {
        driver.findElement(By.xpath(s)).click();
    }

    protected void fiilNumberForm(NumberDate numberDate) {
        driver.findElement(By.name("firstname")).click();
        driver.findElement(By.name("firstname")).clear();
        driver.findElement(By.name("firstname")).sendKeys(numberDate.getFirstname());
        driver.findElement(By.name("middlename")).click();
        driver.findElement(By.name("middlename")).clear();
        driver.findElement(By.name("middlename")).sendKeys(numberDate.getMiddlename());
        driver.findElement(By.name("lastname")).click();
        driver.findElement(By.name("lastname")).clear();
        driver.findElement(By.name("lastname")).sendKeys(numberDate.getLastname());
        driver.findElement(By.name("nickname")).click();
        driver.findElement(By.name("nickname")).clear();
        driver.findElement(By.name("nickname")).sendKeys(numberDate.getNickname());
        driver.findElement(By.name("title")).click();
        driver.findElement(By.name("title")).clear();
        driver.findElement(By.name("title")).sendKeys(numberDate.getTitle());
        driver.findElement(By.name("company")).click();
        driver.findElement(By.name("company")).clear();
        driver.findElement(By.name("company")).sendKeys(numberDate.getCompany());
        driver.findElement(By.name("address")).click();
        driver.findElement(By.name("address")).clear();
        driver.findElement(By.name("address")).sendKeys(numberDate.getAddress());
        driver.findElement(By.name("theform")).click();
        driver.findElement(By.name("home")).click();
        driver.findElement(By.name("home")).clear();
        driver.findElement(By.name("home")).sendKeys(numberDate.getNumber());
    }

    protected void newNemberCreateButton(By add_new) {
        driver.findElement(add_new).click();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
      driver.quit();
      String verificationErrorString = verificationErrors.toString();
      if (!"".equals(verificationErrorString)) {
        fail(verificationErrorString);
      }
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

    private String closeAlertAndGetItsText() {
      try {
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        if (acceptNextAlert) {
          alert.accept();
        } else {
          alert.dismiss();
        }
        return alertText;
      } finally {
        acceptNextAlert = true;
      }
    }

    protected void deleteButon() {
      driver.findElement(By.xpath("(//input[@name='delete'])[2]")).click();
    }

    protected void deleteGroup() {
      driver.findElement(By.name("selected[]")).click();
    }



    protected void clickDeleteNumberButton(By xpath) {
        driver.findElement(By.xpath("//input[@value='Delete']")).click();
    }

    protected void selectNumber() {
        driver.findElement(By.name("selected[]")).click();
        acceptNextAlert = true;
    }

    protected void clickHomePage(By home) {
        driver.findElement(home).click();
    }

    protected void submitDelete() {
        assertTrue(closeAlertAndGetItsText().matches("^Delete 1 addresses[\\s\\S]$"));
    }
}
