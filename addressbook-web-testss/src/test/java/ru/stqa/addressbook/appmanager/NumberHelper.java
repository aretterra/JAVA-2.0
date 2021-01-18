package ru.stqa.addressbook.appmanager;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.addressbook.model.NumberDate;

import static org.testng.Assert.assertTrue;

public class NumberHelper extends HelperBase{
    private boolean acceptNextAlert = true;

    public NumberHelper(WebDriver driver) {
        super(driver);
    }

    public void submitNumberCreation(String s) {
        driver.findElement(By.xpath(s)).click();
    }

    public void fiilNumberForm(NumberDate numberDate) {
        type("firstname", numberDate.getFirstname());
        type("middlename", numberDate.getMiddlename());
        type("lastname", numberDate.getLastname());
        type("nickname", numberDate.getNickname());
        type("title", numberDate.getTitle());
        type("company", numberDate.getCompany());
        type("address", numberDate.getAddress());
        driver.findElement(By.name("theform")).click();
        type("home", numberDate.getNumber());

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