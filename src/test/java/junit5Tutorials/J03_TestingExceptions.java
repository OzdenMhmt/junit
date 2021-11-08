package junit5Tutorials;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class J03_TestingExceptions {
/*
    assertThrow() metodu --> belirtilen işlemin (executable) belirtilen türde bir Exception oluşturup oluşturmadığını
    test eder.
        Dolayısıyla 2 parametre alır.
        1. parametre --> expected(beklenen) Exception(istisna) türü,
        2. parametre --> actual(oluşacak)  çalıştırılacak olan işlemdir.
    Eğer işlem belirtilen türde bir exception oluşturursa test başarılı olur.TEST PASSED
    Ama exception oluşmaz ise veya türü yanlış olursa test başarısız olur.TEST FAILED
    Exception.io türünde parent-child ilişkisi var ise yine test başarılı sayılır.
 */
@Test
    void testExceptions1(){
    String strSayi="1453";
    Integer sayi= Integer.parseInt(strSayi);
    //assertThrows(NumberFormatException.class,()->Integer.parseInt(strSayi));//failed
    assertThrows(NumberFormatException.class,()->Integer.parseInt("14a3"));//passed
    assertThrows(Exception.class,()->Integer.parseInt("14a3"));//passed
}
    @Test
    void testExceptions2(){
        String str=null;

        assertThrows(NullPointerException.class,()->str.length()); //passed
        //assertThrows(NumberFormatException.class,()->str.length()); //failed

    }
    @Test
    void testExceptions3(){
        assertThrows(IllegalArgumentException.class,()-> yasyazdir(-2)); //passed

    }

    private void yasyazdir(int yas) {
        if(yas<0){
            throw new IllegalArgumentException();
        }else System.out.println(yas);
    }

    @Test
    @DisplayName("ArithmeticException TEST")
    void testException4() {
        //assertThrows(ArithmeticException.class, () ->bol(3,2));//failed
        assertThrows(ArithmeticException.class, () ->bol(3,0));//failed

    }

    int bol(int a, int b) {
        return a / b;
    }


}
