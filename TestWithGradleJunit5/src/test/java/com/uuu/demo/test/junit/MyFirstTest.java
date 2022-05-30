package com.uuu.demo.test.junit;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MyFirstTest {
    @BeforeAll
    static void prepareOnce() {
        System.out.println("prepare only once");
    }
    @AfterAll
    static void clearOne() {
        System.out.println("store data, logout and bye bye");
    }
    @BeforeEach
    void prepareTestEnv() {
        System.out.println("prepare data...");
    }
    @AfterEach
    void recordTestResult() {
        System.out.println("record test result");
    }
    @Test
    void testDemo1() {
        System.out.println("my first unit test");
        assertTrue(true, "should be true");
    }

    @Test
    void testDemo2() {
        System.out.println("my second test");
    }
    @Test
    @Disabled
    void testDemo3() {
        System.out.println("will be release at 4Q, 2022");
        assertFalse(true, "this is not yet implemented");
    }
}
