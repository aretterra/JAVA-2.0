package ru.stqa.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import ru.stqa.addressbook.model.GroupDate;

public class GroupHelper extends HelperBase {

    public GroupHelper(WebDriver driver) {
        super(driver);

    }

    public void fiilGroupForm(GroupDate groupDate) {
        type("group_name", groupDate.getName());
        type("group_header", groupDate.getHeader());
        type("group_footer", groupDate.getFooter());
        //new Select(driver.findElement(By.name("group_parent_id"))).selectByVisibleText(groupDate.getParent());
    }

    public void submitGroupFormButton(String submit) {
        click(By.name(submit));
    }

    public void createNewGroupButton(String s) {
        click(By.name(s));
    }

    public void goToGroup(String groups) {
        if (isElementPresent(By.tagName("h1"))
                && driver.findElement(By.tagName("h1")).getText().equals("Groups")
                && isElementPresent(By.name("new"))) {
            return;
        }
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


    public void createGroup(GroupDate group) {
        createNewGroupButton("new");
        fiilGroupForm(group);
        submitGroupFormButton("submit");
    }

    public boolean isThereGroup() {
       return isElementPresent(By.name("selected[]"));
    }
}