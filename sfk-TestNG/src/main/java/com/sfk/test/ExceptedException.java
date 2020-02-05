package com.sfk.test;

import org.testng.annotations.Test;

public class ExceptedException {
    @Test(expectedExceptions = NullPointerException.class)
    public void runException(){
        System.out.println("捕获空指针异常");
        throw  new NullPointerException();
    }
}
