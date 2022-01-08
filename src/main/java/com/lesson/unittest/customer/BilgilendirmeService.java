package com.lesson.unittest.customer;

import com.lesson.unittest.customer.exception.MailServerUnavailableException;

public class BilgilendirmeService {

    public void yeniKayitMailGonder(Musteri musteri) {
        System.out.println("Mail gonderildi");
    }

    public void haftalikMailGonder() {
        throw new MailServerUnavailableException("mail server hata veriyor");
    }
}
