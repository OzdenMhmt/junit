package junit5Tutorials;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class J02_BeforeAfterEachAll {
    /* =========================================== @BeforeEach - @AfterEach ============================================
   A-) @BeforeEach anatosyonu kullanılan bir method, her test methodu çalışmadan önce çalıştırılır.
       Bu özelliği sayesinde test verilerinin ayarlanması (başlatılması) için kullanılabilir.
       Araç --> her vites'te debriyaja basma   Namaz --> her rekatın Fatiha'sı
   B-) @AfterEach anatosyonu kullanılan bir method, her test metodu bittikten sonra çalıştırılır.
       Bu özelliği sayesinde test verilerinin temizlenmesi için kullanılabilir.
       Araç --> her vites'te debriyajdan ayagı cekme   Namaz --> her rekatın ayaga kalkma'sı
   C-) JUnit4 de bu anatosyonlar yerine @Before ve @After kullanıyordu.

   D-) Ahanda trick : @afterEach veya @BeforeEach yazim sirsi oneli degildir.Hangisi once yazilirsa yazilsin java Java once @BeforeEach
   compile eder, sonra @AfterEach compile eder.
    ========================================== @BeforeAll - @AfterAll ===============================================
A-) @BeforeALl tüm test methodlarından önce çalışan bir method oluşturmak için kullanılır.
       Dolayısıyla veritabanı içeren bir test işleminde ilk olarak veritabanına bağlanmak gerekeceğinden @BeforeAll
       anatosyonu ile bir method tanımlanarak ilk olarak veritabanına bağlanma prosedürü işletilebilir.
        Araç --> kontagı acma   Namaz --> Namazın tekbiri...


B-) @AfterAll ile tüm test metotlari bittikten sonra çalışan bir metot oluşturulabilri.
       Bu özelliği sayesinde testler bittikten sonra veritabani oturumu kapatılabilir.
       Araç --> kontagı kapatma   Namaz --> Namazın selamı...


   AHAN DA TRİCKKK: @BeforeAll ve @AfterAll anotasyonlarının kullanıldığı metotlar static olmalıdır.
   Not2: JUnit4 de @BeforeClass ve  @AfterClass metotları kulanılmaktadır.
     */
    @AfterAll
    static void veriTabaniBaglantiKapat(){
        System.out.println("@AfterAll --> veritabani baglantisi kapatildi");
    }
    @BeforeAll
    static void veriTabaniBaglantiKur(){
        System.out.println("@BeforeAll --> veritabani baglantisi kurdu");
    }
    @AfterEach
    void clean(TestInfo info){
        str="";
        System.out.println("@AfterEach --> clean method run edildi (Kıyam)"+info.getDisplayName());
    }
    @BeforeEach
    void setUp(TestInfo info) { // TestInfo-->@Displayname; anatosyonundaki veriyi return eder
        str="javaCAN'lara selam olsun";
        System.out.println("@BeforeEach --> setUp method run edildi (HER REKAT İÇİN FATİHA OKUNDU)"+info.getDisplayName());
    }
    String str = "";//global veriable
    @Test
    @DisplayName("lenght method test")
    void testStringLength() {
        int actual = str.length();
        int expected = 24;
        assertEquals(expected, actual, "değerler eşit değil");
        System.out.println("TEST 1 --> lenght method run edildi");
    }
    @Test
    @DisplayName("arrays test")
    void testWithArrays() {
        String actual[] = str.split(" ");
        String expected[] = {"javaCAN'lara", "selam", "olsun"};
        assertArrayEquals(actual, expected, "array'ler eşit değil");
        System.out.println("TEST 2 --> Arrays method run edildi");
    }
}