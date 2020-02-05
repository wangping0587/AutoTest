package com.sfk.test;

import org.testng.annotations.Test;

public class DependTest {
    @Test
    public void test1(){
        System.out.println("执行操作步骤第一步");
        throw new NullPointerException();
    }
    @Test(dependsOnMethods = "test1")
    public void test2(){
        System.out.println("执行操作步骤第二步");
    }
}
