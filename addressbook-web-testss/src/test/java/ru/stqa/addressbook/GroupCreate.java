package ru.stqa.addressbook;

import org.testng.annotations.Test;

public class GroupCreate extends TestBase {

  @Test
  public void testUntitledTestCase() throws Exception {
    goToGroupCreation("groups");
    createNewGroupButton("new");
    fiilGroupForm(new GroupDate("test1", "test2", "test3"));
    goToGroupCreation("group page");
  }

}
