package ru.stqa.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase{

    public SessionHelper(WebDriver driver) {
        super(driver);
    }

    protected void login(String login, String password) {
        driver.get("http://localhost/addressbook/");
        type("user", login);
        type("pass", password);

        click(By.xpath("//input[@value='Login']"));
    }
}