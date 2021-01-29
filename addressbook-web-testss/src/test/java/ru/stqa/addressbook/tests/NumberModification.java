package ru.stqa.addressbook.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import ru.stqa.addressbook.model.NumberDate;
@Test
public class NumberModification extends TestBase {
    public void testNumberModification() {
        app.getNumberHelper().clickHomePage(By.linkText("home"));
        app.getNumberHelper().selectNumber();
        app.getNumberHelper().clickEditButton();
        app.getNumberHelper().fiilNumberForm(new NumberDate("newtest1", "newtest2", "newtest3", "newtest4", "newtest5", "newtest6", "newtest7", "+375444444444", null), false);
        app.getNumberHelper().submitUpdateNumber();
        app.getNumberHelper().clickHomePage(By.linkText("home"));
    }
}
