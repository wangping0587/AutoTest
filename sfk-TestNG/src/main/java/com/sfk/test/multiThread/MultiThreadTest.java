package com.sfk.test.multiThread;

import org.testng.annotations.Test;

public class MultiThreadTest {
    @Test(invocationCount = 10,threadPoolSize = 4)
    public void  test(){
        System.out.println("1");
        System.out.printf("Thread id is :%s%n",Thread.currentThread().getId());

    }
}
