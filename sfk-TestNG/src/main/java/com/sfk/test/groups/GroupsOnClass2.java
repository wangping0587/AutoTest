package com.sfk.test.groups;

import org.testng.annotations.Test;

@Test(groups="stu")
public class GroupsOnClass2 {
    public void test1(){
        System.out.println("GroupsOnClass2中的stu111111");
    }
    public void test2(){
        System.out.println("GroupsOnClass2中的stu222222");
    }
}
