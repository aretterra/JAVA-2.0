package ru.stqa.addressbook;

import org.testng.annotations.Test;

public class GroupDeletion extends TestBase {

  @Test
  public void testDeleteGroup() throws Exception {
    goToGroupCreation("groups");
    deleteGroup();
    deleteButon();
    goToGroupCreation("group page");




  }

}
