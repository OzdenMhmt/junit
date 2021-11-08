package junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class C03_ArrayEsitMiTest {

    @ParameterizedTest
    @MethodSource("ArraySaglayici")//parametrenin alinacagi method name girilir.Haricden bir method bu teste parametre kaynagi olacak
    void diziKiyasla(boolean sonuc,Object[]a ,Object[]b) {
    assertEquals(sonuc,C03_ArrayEsitMi.diziKiyasla(a,b));
    }

    static Stream<Arguments> ArraySaglayici(){
        // trick return parametre için dondururken Stream <Arguments> komut ile 3 parametre dondurecek
        // ArraySaglayici methodu Stream class'ina Arguments paramtreleri olarak return ediyor
        Integer []a1={1,2,3};
        Integer []a2={2,3,1};

        String []s1={"h","a","y"};
        String []s2={"y","a","h"};

        Double []d1={1.2,3.4,8.9};
        Double []d2={3.4,8.9,1.2};

        Float []f1={1f,3f,5.6f}  ;
        Float []f2={1f,2f,5.6f}  ;


        return Stream.of(
                Arguments.of(true,a1,a2),
                Arguments.of(true,s1,s2),
                Arguments.of(true,d1,d2),
                Arguments.of(false,f1,f2)
        );
    }
    }
