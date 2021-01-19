package ru.stqa.addressbook.tests;

import org.testng.annotations.Test;

public class GroupDeletion extends TestBase {

  @Test
  public void testDeleteGroup() throws Exception {
    app.getGroupHelper().goToGroup("groups");
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deleteGroupButonClick();
    app.getGroupHelper().goToGroup("group page");




  }

}
