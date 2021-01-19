package ru.stqa.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.addressbook.model.GroupDate;

public class GroupHelper extends HelperBase {

    public GroupHelper(WebDriver driver) {
        super(driver);

    }

    public void fiilGroupForm(GroupDate groupDate) {
        type("group_name", groupDate.getName());
        type("group_header", groupDate.getHeader());
        type("group_footer", groupDate.getFooter());
    }

    public void submitGroupFormButton(String submit) {
        click(By.name(submit));
    }

    public void createNewGroupButton(String s) {
        click(By.name(s));
    }

    public void goToGroup(String groups) {
        click(By.linkText(groups));
    }

    public void deleteGroupButonClick() {
        click(By.xpath("(//input[@name='delete'])[2]"));
    }

    public void selectGroup() {
        click(By.name("selected[]"));
    }

    public void editGroupButton() {
        click(By.xpath("(//input[@name='edit'])[2]"));
    }

    public void submitGroupUpdate() {
        click(By.name("update"));
    }


}