package ru.stqa.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.addressbook.model.GroupDate;

public class GroupCreate extends TestBase {

  @Test
  public void testGroupCreate() throws Exception {
    app.getGroupHelper().goToGroup("groups");
    app.getGroupHelper().createNewGroupButton("new");
    app.getGroupHelper().fiilGroupForm(new GroupDate("test1", null, null));
    app.getGroupHelper().submitGroupFormButton("submit");
    app.getGroupHelper().goToGroup("group page");
  }

}
