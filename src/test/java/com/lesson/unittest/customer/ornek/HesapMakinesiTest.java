package com.lesson.unittest.customer.ornek;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HesapMakinesiTest {

    @Test
    public void testTopla() {
        // on hazirlik  -  GiVEN
        HesapMakinesi hesapMakinesi = new HesapMakinesi();
        int sayi1 = 5;
        int sayi2 = 19;

        // methodu calistirmak  -  WHEN
        int toplam = hesapMakinesi.topla(sayi1, sayi2);

        // sonucu kontrol et  -  THEN
        Assertions.assertEquals(24, toplam);

    }

    @Test
    public void testCikart(){
        HesapMakinesi hesapMakinesi = new HesapMakinesi();
        Assertions.assertEquals(20, hesapMakinesi.cikart(50, 30));
    }

    @Test
    void testSifirdanCikincaEksiOlur() {
        HesapMakinesi hesapMakinesi = new HesapMakinesi();
        Assertions.assertEquals(-15, hesapMakinesi.cikart(0, 15));
    }

    @Test
    void testSayidanSifirCikincaSayiKalir() {
        HesapMakinesi hesapMakinesi = new HesapMakinesi();
        Assertions.assertEquals(15, hesapMakinesi.cikart(15, 0));
    }




    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }


}