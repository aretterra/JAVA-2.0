package ru.stqa.addressbook.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import ru.stqa.addressbook.model.NumberDate;

public class CreateNumber extends TestBase {

    @Test
    public void testNumberCreate() throws Exception {
        app.getNumberHelper().newNemberCreateButton(By.linkText("add new"));
        app.getNumberHelper().fiilNumberForm(new NumberDate("test1", "test2", "test3", "test4", "test5", "test6", "test7", "+37533333333333", "test1"), true);
        app.getNumberHelper().submitNumberCreation("(//input[@name='submit'])[2]");
        app.getNumberHelper().clickHomePage(By.linkText("home"));
    }


}
