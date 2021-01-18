package ru.stqa.addressbook.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class DeleteNumber extends TestBase {

    @Test
    public void testNumberDelete() throws Exception {
        app.clickHomePage(By.linkText("home"));
        app.selectNumber();
        app.clickDeleteNumberButton(By.xpath("//input[@value='Delete']"));
        app.submitDelete();
        app.clickHomePage(By.linkText("home"));
    }


}
