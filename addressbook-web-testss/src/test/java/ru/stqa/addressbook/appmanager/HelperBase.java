package ru.stqa.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperBase {
    protected WebDriver driver;

    public HelperBase(WebDriver driver) {
        this.driver = driver;
    }

    protected void click(By locator) {
        driver.findElement(locator).click();
    }

    protected void type(String group_name, String name) {
        click(By.name(group_name));
        driver.findElement(By.name(group_name)).clear();
        driver.findElement(By.name(group_name)).sendKeys(name);
    }
}
