package com.sfk.test.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {
    @Test(dataProvider="data")
    public void test(String name,int age) {
        System.out.println("姓名：" + name + "; 年龄：" + age);
    }
    @DataProvider(name="data")
    public Object[][] dataProvider(){
        Object[][] o = new Object[][]{
                {"zhangsan",20},
                {"lisi",30},
                {"wangwu",40}
        };
        return o;
    }
     @Test(dataProvider = "methodData")
    public void test1(String name,int age){
        System.out.println("test11111  姓名：" + name + "; 年龄：" + age);
    }
    @Test(dataProvider = "methodData")
    public void test2(String name,int age){
        System.out.println("test22222  姓名：" + name + "; 年龄：" + age);
    }
    @DataProvider(name="methodData")
    public Object[][] methodData(Method method){
        Object[][]  result = null;
        if(method.getName().equals("test1")){
             result = new Object[][]{
                     {"zhangsan",20},
                     {"wangwu",30}
             };
        }else if(method.getName().equals("test2")){
            result = new Object[][]{
                    {"zhaoliu",50},
                    {"zhouqi",60}
            };
        }
        return result;
    }

}
