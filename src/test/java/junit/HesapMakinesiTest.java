package junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HesapMakinesiTest {

    @Test
    @DisplayName("ebik gabik sayilari toplar") //kullaniciyi  veya yonetici bilgilendirmek icin test etikettir
    void topla() {
        assertEquals(3,HesapMakinesi.topla(1,2));
        assertEquals(4,HesapMakinesi.topla(-8,12));
        assertEquals(-1,HesapMakinesi.topla(1,-2));
        //assertEquals(3,HesapMakinesi.topla(1,12));org.opentest4j.AssertionFailedError:Expected :3.0 Actual   :13.0
    }

    @Test
    @DisplayName("ebik gabik sayilari carpar")
    void carp() {
        assertEquals(2,HesapMakinesi.carp(1,2));
        assertEquals(-24,HesapMakinesi.carp(-8,3));
        assertEquals(-2,HesapMakinesi.carp(1,-2));
        //
    }
}