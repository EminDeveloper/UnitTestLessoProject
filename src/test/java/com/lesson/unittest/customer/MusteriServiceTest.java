package com.lesson.unittest.customer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.testng.asserts.Assertion;

class MusteriServiceTest {

    private MusteriService musteriService;
//    private MusteriRepository musteriRepository = new MusteriRepository();
    private MusteriRepositoryStub musteriRepository = new MusteriRepositoryStub();
    private BilgilendirmeService bilgilendirmeService;

    @BeforeEach
    void setUp() {
        musteriService = new MusteriService();
//        musteriRepository = Mockito.mock(MusteriRepository.class);
        bilgilendirmeService = Mockito.mock(BilgilendirmeService.class);
        musteriService.setMusteriRepository(musteriRepository);
        musteriService.setBilgilendirmeService(bilgilendirmeService);
    }

    @Test
    public void testMusteriKaydet(){

        Musteri musteri = new Musteri(1234);

        musteriService.musteriKaydet(musteri);

        // kontrol etmeniz gerekiyor
//        Mockito.verify(bilgilendirmeService).yeniKayitMailGonder(musteri);
//        Assertions.assertTrue(musteriRepository.getMusteriListesi().containsValue(musteri));
//        Mockito.verify(musteriRepository).kaydet(musteri);
        Assertions.assertEquals(musteri, musteriRepository.bul(musteri.getId()));
    }

    @Test
    public void testSil(){

        Assertions.assertNotNull(musteriRepository.getMusteriListesi().get(1234));

        musteriService.musteriSil(1234);

        Assertions.assertNull(musteriRepository.bul(1234));
    }
}