package ru.stqa.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.addressbook.model.GroupDate;

public class GroupCreate extends TestBase {

  @Test
  public void testGroupCreate() throws Exception {
    app.getGroupHelper().goToGroupCreation("groups");
    app.getGroupHelper().createNewGroupButton("new");
    app.getGroupHelper().fiilGroupForm(new GroupDate("test1", "test2", "test3"));
    app.getGroupHelper().goToGroupCreation("group page");
  }

}
