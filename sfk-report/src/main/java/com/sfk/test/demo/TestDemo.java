package com.sfk.test.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDemo {
    @Test
    public void test1(){
        Assert.assertEquals(1,1);
    }
    @Test
    public void test2(){
        Assert.assertEquals(1,2);
    }
    @Test
    public void test3(){
        Assert.assertEquals("aaa","bbb");
    }
}
