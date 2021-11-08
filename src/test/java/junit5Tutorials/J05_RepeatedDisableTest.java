package junit5Tutorials;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
public class J05_RepeatedDisableTest {
    /*
    @RepeatedTest(a) --> test edilecek method a kadar döngü içinde test edilir
    junit 5 ile yeni gelmiştir.
     */
    @AfterEach
    void afterEachTest(){
        System.out.println("after çalıştı");
        System.out.println("    *****    ");
    }
    @BeforeEach
    void beforeEachTest(){
        System.out.println("before çalıştı");
    }
    @RepeatedTest(7)
    @DisplayName("Contains method 7 kez test edildi")
    void continesTest(){
        assertFalse("Erdem".contains("hi"));
        System.out.println("contains method çalıştı");
    }
    @RepeatedTest(5)
    @DisplayName("topla method 5 kez test edildi")
    void toplaTest(){
        assertEquals(5,(2+3));
        System.out.println("topla method çalıştı");
    }
    @Disabled("ham karpuz bıçak vurmayın...")
    @Test
    void karpuzTest() {
        String karpuz="adana karpuzu, guldurur yuzu";
        assertEquals(28,karpuz.length());
    }
}
