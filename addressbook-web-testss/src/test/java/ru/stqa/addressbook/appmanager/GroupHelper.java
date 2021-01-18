package ru.stqa.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.addressbook.model.GroupDate;

public class GroupHelper extends HelperBase{

    public GroupHelper(WebDriver driver) {
        super(driver);

    }

    public void fiilGroupForm(GroupDate groupDate) {
        type("group_name", groupDate.getName());
        type("group_header", groupDate.getHeader());
        type("group_footer", groupDate.getFooter());
        click(By.name("submit"));
    }

    public void createNewGroupButton(String s) {
        click(By.name(s));
    }

    public void goToGroupCreation(String groups) {
        click(By.linkText(groups));
    }

    public void deleteGroupButonClick() {
        click(By.xpath("(//input[@name='delete'])[2]"));
    }

    public void deleteGroup() {
        click(By.name("selected[]"));
    }
}