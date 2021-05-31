package com.onemount;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertFalse;

public class DemoUnitTest {
    DemoUnit demo = new DemoUnit();
    @Test
    @DisplayName("1. assert equal or not equal")
    void test1() {
        assertEquals(2, demo.sum(1, 1));
        assertNotEquals(3, demo.sum(1, 1));
    }

    @Test
    @DisplayName("2. assertArrayEquals")
    void test2() {
        int[] arr = {1, 2, 3};
        int[] arr1 = {1, 2, 3};
        assertArrayEquals(arr, arr1);
    }

    @Test
    @DisplayName("3. assertNull+ not null")
    void test3() {
        String a = null;
        String b = "I love u";

        //passed
        assertNull(null, a);
        assertNull(a);
        assertNotNull("i love u", b);
        assertNotNull(b);

        //Failed
        assertNull(b);
        assertNotNull(a);
    }

    @Test
    @DisplayName("4. assertTrue + false")
    void test4(){
        assertTrue(2<3,"2 nhỏ hơn 3");
        assertTrue(demo.sum(5,3)>demo.sub(5,3), "tổng lớn hơn hiệu");
        assertFalse("hiệu lớn hơn tổng",demo.sub(5,3)>demo.sum(5,3));
    }

    @Test
    @DisplayName("5. same/ not same")
    void test5(){
        String a = "i love u";
        String b = "u love me";
        String c = a;
        assertSame("i love u",a);
        assertSame(c,a);
        assertNotSame("u love me",a);
        assertNotSame(b,a);
    }

}
