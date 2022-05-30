package com.uuu.demo.test;

import org.junit.*;

public class Test1 {
    @BeforeClass
    public static void setupOnce() {
        System.out.println("one term start up");
    }
    @AfterClass
    public static void finish() {
        System.out.println("one term clean up");
    }
    @Before
    public void prepareEnv() {
        System.out.println("prepare env");
    }
    @After
    public void storeData() {
        System.out.println("store test data");
    }
    @Test
    public void firstTest() {
        System.out.println("run first test");
    }
    @Test
    @Ignore("not yet implemented")
    public void secondTest() {
        System.out.println("run second test");
    }
}
