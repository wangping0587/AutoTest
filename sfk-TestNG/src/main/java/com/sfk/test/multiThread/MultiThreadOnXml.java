package com.sfk.test.multiThread;

import org.testng.annotations.Test;

public class MultiThreadOnXml {
    @Test
    public void multiThread1(){
        System.out.printf("Thread1 id is :%s%n",Thread.currentThread().getId());
    }
    @Test
    public void multiThread2(){
        System.out.printf("Thread2 id is :%s%n",Thread.currentThread().getId());
    }
    @Test
    public void multiThread3(){
        System.out.printf("Thread3 id is :%s%n",Thread.currentThread().getId());
    }
}
