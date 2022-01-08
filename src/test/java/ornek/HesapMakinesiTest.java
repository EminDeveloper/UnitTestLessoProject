package ornek;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HesapMakinesiTest {

    @Test
    public void testTopla() {
        // on hazirlik
        HesapMakinesi hesapMakinesi = new HesapMakinesi();
        int sayi1 = 5;
        int sayi2 = 19;

        // methodu calistirmak
        int toplam = hesapMakinesi.topla(sayi1, sayi2);

        // sonucu kontrol et
        Assertions.assertEquals(24, toplam);
    }



    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }


}