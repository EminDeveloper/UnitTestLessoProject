package com.lesson.unittest.junit4;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        AssertKolayTest.class,
        AssertTest.class,
        ParametreTest.class,
        YasamDongusu.class
}
)
public class SuiteTest {

}