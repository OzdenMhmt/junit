package junit5Tutorials;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

public class J01_Assertions {

    @Test
    @DisplayName("toassert testi")
    void testToAssert(){
        int actual="Hakan".length();
        int expected=5;

        //1.assertEquals(); --> actual ve expected beklenen degerlerin esit olma durumunda test basarili -->passed
        assertEquals(expected,actual,"beklenen ve aktuel deger esit");

        //inline style;her zamaqn kullanilmaz,simple teste aykiridir. code cosmetic' aykiri(kodun okunabilirligi)
        assertEquals(5,"Hakan".length(),"bu yontem cok kullanilmaz");

        //2.assertNotEquals(); --> actual ve expected beklenen degerlerin esit olmama durumunda test basarili -->passed
        expected=4;
        assertNotEquals(expected,actual,"beklenen ve aktuel deger esit ");

        //3.assertTrue(); --> olusturulan sart(boolean) true ise test basarili-->passed
        expected=5;
        assertTrue(expected==actual,"sart saglanmadi");

        //4.assertFalse(); --> olusturulan sart(boolean) false ise test basarili-->passed
        expected=5;
        assertFalse(expected!=actual,"sart saglanmadi");

    }
    @Test
    @DisplayName("ToConvertupper test")
    void testToConvertUpper(){
    String expected="BASRİ";
    String actual="basri".toUpperCase();
    assertEquals(actual,expected);//passed

        assertTrue(expected.equals(actual));//passed
        assertFalse(!expected.equals(actual));//passed
        actual=null;
        assertNull(actual,"actual deger null degil");//passed
        //assertNotNull(actual,"actual deger null;");//failed
        actual="Kenan";
        assertNotNull(actual,"actual deger null;");//passed
    }

    @Test
    @DisplayName("ToContain testi")
    void testToContain(){
        boolean actual="erdem".contains("hi");
        boolean expected=false;
        assertEquals(actual,expected,"degerler esit deil");//--passed
    }
    @Test
    @DisplayName("arrays test")
    void testWithArrays(){
        String str="junit ile ebik gabik testler";
        String actual[]=str.split(" ");//["junit", "ile", "ebik", "gabik", "testler"]
        String expected[]={"junit", "ile", "ebik", "gabik", "testler"};
        assertArrayEquals(actual,expected,"arraylar esit deil"); //-->passed
        String expected1[]={"junit", "ile", "ebik", "gabik"};
         //(actual,expected1,"arraylar esit deil"); //-->failed


    }
}
