package com.sfk.test.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SuiteConfig {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite  套件开始运行了！");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite  套件运行结束了!");
    }


}
