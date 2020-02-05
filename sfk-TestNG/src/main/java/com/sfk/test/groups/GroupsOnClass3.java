package com.sfk.test.groups;

import org.testng.annotations.Test;

@Test(groups="stu")
public class GroupsOnClass3 {
    public void test1(){
        System.out.println("GroupsOnClass1中的stu111111");
    }
    public void test2(){
        System.out.println("GroupsOnClass1中的stu222222");
    }
}
