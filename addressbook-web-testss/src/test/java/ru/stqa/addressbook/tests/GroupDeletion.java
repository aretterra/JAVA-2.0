package ru.stqa.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.addressbook.model.GroupDate;

public class GroupDeletion extends TestBase {

  @Test
  public void testDeleteGroup() throws Exception {
    app.getGroupHelper().goToGroup("groups");
    if (! app.getGroupHelper().isThereGroup()){
      app.getGroupHelper().createGroup(new GroupDate("test1", "test11", "null", null));
      app.getGroupHelper().goToGroup("groups");
    }
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deleteGroupButonClick();





  }

}
