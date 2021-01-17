package ru.stqa.addressbook;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class DeleteNumber extends TestBase {

    @Test
    public void testGroupCreate() throws Exception {
        clickHomePage(By.linkText("home"));
        selectNumber();
        clickDeleteNumberButton(By.xpath("//input[@value='Delete']"));
        submitDelete();
        clickHomePage(By.linkText("home"));
    }


}
