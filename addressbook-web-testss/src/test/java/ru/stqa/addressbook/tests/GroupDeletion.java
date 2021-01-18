package ru.stqa.addressbook.tests;

import org.testng.annotations.Test;

public class GroupDeletion extends TestBase {

  @Test
  public void testDeleteGroup() throws Exception {
    app.goToGroupCreation("groups");
    app.deleteGroup();
    app.deleteButon();
    app.goToGroupCreation("group page");




  }

}
