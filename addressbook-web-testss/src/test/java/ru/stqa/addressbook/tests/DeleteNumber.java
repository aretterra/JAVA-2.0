package ru.stqa.addressbook.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class DeleteNumber extends TestBase {

    @Test
    public void testNumberDelete() throws Exception {
        app.getNumberHelper().clickHomePage(By.linkText("home"));
        app.getNumberHelper().selectNumber();
        app.getNumberHelper().clickDeleteNumberButton(By.xpath("//input[@value='Delete']"));
        app.getNumberHelper().submitDeleteNumber();
        app.getNumberHelper().clickHomePage(By.linkText("home"));
    }


}
