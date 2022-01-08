package com.lesson.unittest.junit4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

public class AssertTest {

    @Test
    public void testAssertions(){
        Dummy d1 = new Dummy(5);
        Dummy d2 = new Dummy(5);

//        Assertions.assertSame("d1 d2 ye esit olmasi gerek. ",d1, d2.toString());

    }

    private static class Dummy{
        private int id;

        public Dummy(int id) {
            this.id = id;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }


}
