package com.sfk.test.groups;

import org.testng.annotations.Test;

@Test(groups="teacher")
public class GroupsOnClass1 {
    public void test1(){
        System.out.println("GroupsOnClass3中的teacher1");
    }
    public void test2(){
        System.out.println("GroupsOnClass3中的teacher2");
    }
}
