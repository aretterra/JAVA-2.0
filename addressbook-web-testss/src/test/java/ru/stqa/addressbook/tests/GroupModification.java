package ru.stqa.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.addressbook.model.GroupDate;

public class GroupModification extends TestBase{

    @Test
    public void testGroupModification(){
        app.getGroupHelper().goToGroup("groups");
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().editGroupButton();
        app.getGroupHelper().fiilGroupForm(new GroupDate("newtest1", "newtest2", "newtest3", "test1"));
        app.getGroupHelper().submitGroupUpdate();
        app.getGroupHelper().goToGroup("groups");


    }


}
