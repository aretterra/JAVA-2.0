package ru.stqa.addressbook.tests;

import org.testng.annotations.Test;

public class GroupDeletion extends TestBase {

  @Test
  public void testDeleteGroup() throws Exception {
    app.getGroupHelper().goToGroupCreation("groups");
    app.getGroupHelper().deleteGroup();
    app.getGroupHelper().deleteGroupButonClick();
    app.getGroupHelper().goToGroupCreation("group page");




  }

}
