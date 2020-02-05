package com.sfk.test.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {
    @Test(groups = "student")
    public void test1(){
        System.out.println("student对应的test1");
    }
    @Test(groups="student")
    public void test2(){
        System.out.println("student对应的test2");
    }
    @Test(groups="teacher")
    public  void test3(){
        System.out.println("teacher对应的test3");
    }
    @Test(groups="teacher")
    public void test4(){
        System.out.println("teacher对应的test4");
    }
    @BeforeGroups("student")
    public void beforeGroupsOnStu(){
        System.out.println("这是在student前执行的方法");
    }
    @AfterGroups("student")
    public void afterGroupsOnStu(){
        System.out.println("这是在student后的方法");
    }
}
