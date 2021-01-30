package ru.stqa.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.addressbook.model.GroupDate;

public class GroupCreate extends TestBase {

  @Test
  public void testGroupCreate() throws Exception {
    app.getGroupHelper().goToGroup("groups");
    app.getGroupHelper().createGroup(new GroupDate("test1", "test11", "null", "newtest1"));
     }

}
