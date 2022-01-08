package com.lesson.unittest.customer.junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class YasamDongusu {

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
