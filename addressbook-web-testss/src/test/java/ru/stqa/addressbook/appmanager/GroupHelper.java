package ru.stqa.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.addressbook.model.GroupDate;

public class GroupHelper {
    private WebDriver driver;

    public GroupHelper(WebDriver driver) {
        this.driver = driver;

    }

    public void fiilGroupForm(GroupDate groupDate) {
      driver.findElement(By.name("group_name")).click();
      driver.findElement(By.name("group_name")).clear();
      driver.findElement(By.name("group_name")).sendKeys(groupDate.getName());
      driver.findElement(By.name("group_header")).click();
      driver.findElement(By.name("group_header")).clear();
      driver.findElement(By.name("group_header")).sendKeys(groupDate.getHeader());
      driver.findElement(By.name("group_footer")).click();
      driver.findElement(By.name("group_footer")).clear();
      driver.findElement(By.name("group_footer")).sendKeys(groupDate.getFooter());
      driver.findElement(By.name("submit")).click();
    }

    public void createNewGroupButton(String s) {
      driver.findElement(By.name(s)).click();
    }

    public void goToGroupCreation(String groups) {
      driver.findElement(By.linkText(groups)).click();
    }

    public void deleteGroupButonClick() {
      driver.findElement(By.xpath("(//input[@name='delete'])[2]")).click();
    }

    public void deleteGroup() {
      driver.findElement(By.name("selected[]")).click();
    }
}
