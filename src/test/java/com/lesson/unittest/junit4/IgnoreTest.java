package com.lesson.unittest.junit4;


import org.junit.Ignore;
import org.junit.Test;

@Ignore
public class IgnoreTest {

    @Test
    public void testMerhaba() throws Exception {
        System.out.println("Merhaba");
    }

    @Test
    @Ignore("Bu method daha sonra kullanilacak")
    public void testMerhaba2() throws Exception {
        System.out.println("Merhaba 2");
    }
}