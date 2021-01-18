package ru.stqa.addressbook.appmanager;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.addressbook.model.NumberDate;

import static org.testng.Assert.assertTrue;

public class NumberHelper {
    private WebDriver driver;
    private boolean acceptNextAlert = true;

    public NumberHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void submitNumberCreation(String s) {
        driver.findElement(By.xpath(s)).click();
    }

    public void fiilNumberForm(NumberDate numberDate) {
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

    public void newNemberCreateButton(By add_new) {
        driver.findElement(add_new).click();
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

    public void clickDeleteNumberButton(By xpath) {
        driver.findElement(By.xpath("//input[@value='Delete']")).click();
    }

    public void selectNumber() {
        driver.findElement(By.name("selected[]")).click();
        acceptNextAlert = true;
    }

    public void clickHomePage(By linkText) {
        driver.findElement(By.linkText("home")).click();
    }

    public void submitDeleteNumber() {
        assertTrue(closeAlertAndGetItsText().matches("^Delete 1 addresses[\\s\\S]$"));
    }
}
