package com.lesson.unittest.junit4;

import static junit.framework.Assert.*;

import com.lesson.unittest.ornek.HesapMakinesi;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(JUnitParamsRunner.class)
public class AssertKolayTest {

    private HesapMakinesi hesapMakinesi = new HesapMakinesi();

    @Test
    @Parameters({"10,2,20", "20,3,60"})
    public void testMetreKareHesaplama(int eni, int boyu, int toplamMetreKare) throws Exception {

        assertEquals(toplamMetreKare, hesapMakinesi.metreKareHesapla(eni, boyu));

    }
}