package ru.stqa.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.addressbook.model.GroupDate;

public class GroupModification extends TestBase{

    @Test
    public void testGroupModification(){
        app.getGroupHelper().goToGroup("groups");
        if (! app.getGroupHelper().isThereGroup()){
            app.getGroupHelper().createGroup(new GroupDate("test1", "test11", "null", null));
            app.getGroupHelper().goToGroup("groups");}
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().editGroupButton();
        app.getGroupHelper().fiilGroupForm(new GroupDate("newtest1", "newtest2", "newtest3", null));
        app.getGroupHelper().submitGroupUpdate();
        app.getGroupHelper().goToGroup("groups");


    }


}
