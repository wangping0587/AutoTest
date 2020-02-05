package com.sfk.test;

import org.testng.annotations.*;

public class BasicAnnotation {
    @Test
    public void testcase1(){
        System.out.println("这是第一个测试案例1");
    }
    @Test(enabled = true)
    public void testcase2(){
        System.out.println("这是第一个测试案例enabled=true");
    }
    @Test(enabled = false)
    public  void testcase3(){
        System.out.println("这是第一个测试案例enabled=false");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod这是在执行方法前调用的方法");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod这是在执行方法后调用的方法");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("BeforeClass调用类前执行");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass调用类后执行");
    }
}

