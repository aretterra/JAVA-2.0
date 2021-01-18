package ru.stqa.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.addressbook.model.GroupDate;

public class GroupCreate extends TestBase {

  @Test
  public void testGroupCreate() throws Exception {
    app.goToGroupCreation("groups");
    app.createNewGroupButton("new");
    app.fiilGroupForm(new GroupDate("test1", "test2", "test3"));
    app.goToGroupCreation("group page");
  }

}
