package com.course.testng;

import org.testng.annotations.Test;

/**
 * TestNG依赖测试
 * 如果被依赖的方法执行失败了，则以来的方法忽略不执行
 */
public class DependTest {

    @Test
    public void test1(){
        System.out.println("test1 run");
        throw new RuntimeException();
    }

    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test2 run");
    }
}
