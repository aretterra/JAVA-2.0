package ru.stqa.addressbook;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateNumber extends TestBase {

    @Test
    public void testGroupCreate() throws Exception {
        newNemberCreateButton(By.linkText("add new"));
        fiilNumberForm(new NumberDate("test1", "test2", "test3", "test4", "test5", "test6", "test7", "+37533333333333"));
        submitNumberCreation("(//input[@name='submit'])[2]");
    }


}
