package com.lesson.unittest.junit4;

import org.junit.jupiter.api.*;

public class YasamDongusu {

    @BeforeAll
    static void beforeAll() {
        System.out.println("Her test sinifi icin - oncesi");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Her test sinifi icin - sonrasi");
    }

    @BeforeEach
    void setUp() {
        System.out.println("Method oncesi");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Method sonrasi");
    }

    @Test
    public void testHelloWorld1(){
        System.out.println("Test Hello World 1");
    }

    @Test
    public void testHelloWorld2() {
        System.out.println("Test Hello World 2");


    }
}
