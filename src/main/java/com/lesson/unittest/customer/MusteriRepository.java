package com.lesson.unittest.customer;

public class MusteriRepository {

    public void kaydet(Musteri musteri){

        System.out.println("kaydedildi");

    }

    public void sil(Integer musteriId){
        System.out.println("musteri silindi");
    }

    public Musteri bul(Integer musterId){
        return null;
    }
}
