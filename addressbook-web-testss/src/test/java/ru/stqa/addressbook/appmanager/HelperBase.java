package ru.stqa.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
        if (name != null){
            String existingText = driver.findElement(By.name(group_name)).getAttribute("value");
            if (! name.equals(existingText)){
        driver.findElement(By.name(group_name)).clear();
        driver.findElement(By.name(group_name)).sendKeys(name);
    }
}}

    protected boolean isElementPresent(By locator) {
        try{
            driver.findElement(locator);
            return true;
        }catch (NoSuchElementException ex){
            return false;
        }

    }
}
